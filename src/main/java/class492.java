import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class492 extends class613 {

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    private int field6881 = 0;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Lvs;")
    private class508 field6885 = new class508();

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Z")
    private static boolean field6882 = false;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Lej;")
    public static class104 field6890 = new class104("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "[Ldaa;")
    public static class11[] field6896 = new class11[2048];

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method2851(byte arg0, long arg1) {
        ++field6878;
        class505.field7045.setTime(new Date(arg1));
        int var3 = class505.field7045.get(7);
        int var4 = class505.field7045.get(5);
        if (arg0 != 82) {
            return null;
        } else {
            int var5 = class505.field7045.get(2);
            int var6 = class505.field7045.get(1);
            int var7 = class505.field7045.get(11);
            int var8 = class505.field7045.get(12);
            int var9 = class505.field7045.get(13);
            return class418.field5892[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class567.field7836[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLbo;)V")
    public final void method2852(boolean arg0, class622 arg1) {
        super.field8822[super.field8818] = 20;
        ++field6880;
        super.field8821[super.field8818] = arg1;
        if (!arg0) {
            field6896 = null;
        }
        ++super.field8818;
        if (~super.field8818 <= -5001) {
            super.field8818 = 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(FIILsa;Z)V")
    public final void method2853(float arg0, int arg1, int arg2, class174 arg3, boolean arg4) {
        ++field6886;
        super.field8822[super.field8818] = (byte) (!arg4 ? arg2 + 30 : arg2 + 40);
        super.field8821[super.field8818] = arg3;
        super.field8817[super.field8818] = arg0;
        ++super.field8818;
        if (~super.field8818 <= -5001) {
            super.field8818 = 0;
        }
        if (arg1 < 7) {
            this.method2855(-101);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILbo;)V")
    public final void method2854(int arg0, class622 arg1) {
        ++field6894;
        --super.field8816;
        if (arg0 > 48) {
            if (~super.field8816 > -1) {
                super.field8816 = 4999;
            }
            super.field8822[super.field8816] = 21;
            super.field8821[super.field8816] = arg1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method2855(int arg0) {
        ++field6883;
        if (arg0 <= 122) {
            method2864(-72);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
    public final void method2856(int arg0, byte arg1) {
        if (arg1 < -122) {
            ++field6893;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
    public static final void method2857(int arg0) {
        ++field6888;
        if (class53.field988 != class270.field3766) {
            try {
                if (arg0 == 21220) {
                    class54.method508((byte) 56, class313.field4221, "tbrefresh");
                }
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public final void method2858(int arg0) {
        while (~super.field8818 != ~super.field8816) {
            this.method2861(false);
        }
        ++field6887;
        if (arg0 >= -83) {
            field6896 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lnj;II)V")
    public static final void method2859(class204 arg0, int arg1, int arg2) {
        if (arg2 == 10) {
            class155.field2316 = 0;
            field6882 = false;
            ++field6879;
            class47.method468(arg0, false);
            class10.method58(-16077, arg0);
            if (field6882) {
                System.out.println("---endgpp---");
            }
            if (arg0.field165 != arg1) {
                throw new RuntimeException("gpi1 pos:" + arg0.field165 + " psize:" + arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z")
    public static final boolean method2860(int arg0) {
        ++field6891;
        return ~class112.field1726 != arg0 ? true : class218.field3105.method3490((byte) -61);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    private final void method2861(boolean arg0) {
        ++field6895;
        int var2 = super.field8816++;
        if (~super.field8816 <= -5001) {
            super.field8816 = 0;
        }
        if (arg0) {
            this.field6885 = null;
        }
        this.field6881 = super.field8822[var2];
        Object var3 = super.field8821[var2];
        super.field8821[var2] = null;
        if (this.field6881 == 21) {
            class315.method1964(this.field6885, (class622) var3);
        } else if (this.field6881 != 20) {
            if (~this.field6881 <= -31 && this.field6881 <= 33) {
                class329.field4405.method1333(3000.0F, super.field8817[var2] * 1.5F);
                ((class174) var3).method1099(class120.field1970, class546.field7561, class325.field4377, class69.field1172, ~(this.field6881 - 30) == -1);
            } else if (~this.field6881 <= -41 && this.field6881 <= 43) {
                class329.field4405.method1333(3000.0F, super.field8817[var2] * 1.5F);
                ((class174) var3).method1099(class120.field1970, class546.field7561, class325.field4377, class270.field3764, this.field6881 + -40 == 0);
            } else if (this.field6881 != 22) {
                if (this.field6881 != 23) {
                    if (this.field6881 == 24) {
                        class329.field4405.method1311(0, (class223[]) null);
                        return;
                    }
                } else {
                    class329.field4405.method1352();
                }
            } else {
                class329.field4405.method1336(-1, 1583160, 40, 127);
            }
        } else {
            class622 var4 = (class622) var3;
            if (var4.field8985 != null) {
                var4.field8985.method487(class329.field4405, (byte) 21);
            }
            if (var4.field8982 != null) {
                var4.field8982.method487(class329.field4405, (byte) 21);
            }
            if (var4.field8981 != null) {
                var4.field8981.method487(class329.field4405, (byte) 21);
            }
            if (var4.field8977 != null) {
                var4.field8977.method487(class329.field4405, (byte) 21);
            }
            if (var4.field8979 != null) {
                var4.field8979.method487(class329.field4405, (byte) 21);
            }
            for (class559 var5 = var4.field8973; var5 != null; var5 = var5.field7736) {
                var5.field7742.method487(class329.field4405, (byte) 21);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
    public static void method2862(int arg0) {
        field6890 = null;
        if (arg0 > 12) {
            field6896 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public final void method2863(int arg0, int arg1) {
        ++field6889;
        super.field8822[super.field8818] = (byte) arg0;
        if (arg1 != 0) {
            field6890 = null;
        }
        ++super.field8818;
        if (super.field8818 >= 5000) {
            super.field8818 = 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)Z")
    public static final boolean method2864(int arg0) {
        if (arg0 != 4015) {
            method2862(-28);
        }
        ++field6892;
        try {
            return class119.method834((byte) -108);
        } catch (IOException var4) {
            class5.method35(arg0 + -3920);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class368.field5005 != null ? class368.field5005.method2742(-71) : -1) + "," + (class434.field6185 != null ? class434.field6185.method2742(-75) : -1) + "," + (class625.field9111 != null ? class625.field9111.method2742(arg0 ^ -4091) : -1) + " - " + class403.field5730 + "," + (class519.field7304 - -class645.field9372.field616[0]) + "," + (class645.field9372.field618[0] + class6.field80) + " - ";
            for (int var3 = 0; ~class403.field5730 < ~var3 && var3 < 50; ++var3) {
                var2 = var2 + class343.field4627.field138[var3] + ",";
            }
            class235.method1474(var5, var2, (byte) 115);
            class368.method2208(false, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lbo;Z)V")
    public final void method2865(class622 arg0, boolean arg1) {
        super.field8822[super.field8818] = 21;
        ++field6884;
        if (!arg1) {
            field6890 = null;
        }
        super.field8821[super.field8818] = arg0;
        ++super.field8818;
        if (~super.field8818 <= -5001) {
            super.field8818 = 0;
        }
    }
}
