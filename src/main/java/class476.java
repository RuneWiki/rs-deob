import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class476 extends class263 {

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    private int field6745 = 0;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "Lfw;")
    private class51 field6740 = new class51();

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "[[I")
    public static int[][] field6739 = new int[128][128];

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Lada;")
    public static class144 field6737 = new class144(0, -1);

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field6747 = 0;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)V", line = 5)
    public final void method931(int arg0, int arg1) {
        if (arg0 < -35) {
            ++field6738;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 16)
    public static void method2867(byte arg0) {
        if (arg0 > -13) {
            method2869((class328) null, (class331) null, 32);
        }
        field6739 = null;
        field6737 = null;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 28)
    public final void method939(int arg0) {
        if (arg0 > 12) {
            ++field6742;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 38)
    public static final void method2868(String arg0, boolean arg1, boolean arg2) {
        ++field6746;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class192.field2857.field526 : class192.field2857.field520) + var6;
        for (int var8 = var6; var8 < var7; ++var8) {
            class26 var11 = class192.field2857.method275(var8, -6);
            if (var11.field275 && ~var11.method158(true).toLowerCase().indexOf(var3) != 0) {
                if (var5 >= 50) {
                    class161.field2385 = -1;
                    class372.field5115 = null;
                    return;
                }
                if (~var5 <= ~var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; ~var13 > ~var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class161.field2385 = var5;
        class514.field7342 = 0;
        if (arg1) {
            class372.field5115 = var4;
            String[] var9 = new String[class161.field2385];
            for (int var10 = 0; ~var10 > ~class161.field2385; ++var10) {
                var9[var10] = class192.field2857.method275(var4[var10], -6).method158(true);
            }
            class293.method1805(var9, (byte) 127, class372.field5115);
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Lnj;B)V", line = 111)
    public final void method929(class205 arg0, byte arg1) {
        int var3 = 46 % ((-35 - arg1) / 56);
        super.field3744[super.field3741] = 21;
        ++field6743;
        super.field3751[super.field3741] = arg0;
        ++super.field3741;
        if (super.field3741 >= 5000) {
            super.field3741 = 0;
        }
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V", line = 132)
    public final void method938(int arg0) {
        ++field6741;
        if (arg0 != 5126) {
            this.field6740 = null;
        }
        while (super.field3750 != super.field3741) {
            this.method2870((byte) 107);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lkda;Llp;I)V", line = 145)
    public static final void method2869(class328 arg0, class331 arg1, int arg2) {
        class18.field171 = arg0;
        class88.field1315 = arg1;
        ++field6744;
        class564.field8355 = "";
        if (!class331.field4577.startsWith("win")) {
            if (class331.field4577.startsWith("linux")) {
                class564.field8355 = class564.field8355 + "linux/";
            } else if (class331.field4577.startsWith("mac")) {
                class564.field8355 = class564.field8355 + "macos/";
            }
        } else {
            class564.field8355 = class564.field8355 + "windows/";
        }
        if (~class331.field4576 == arg2) {
            class564.field8355 = class564.field8355 + "msjava/";
        } else if (!class331.field4566.startsWith("amd64") && !class331.field4566.startsWith("x86_64")) {
            if (!class331.field4566.startsWith("i386") && !class331.field4566.startsWith("i486") && !class331.field4566.startsWith("i586") && !class331.field4566.startsWith("x86")) {
                if (class331.field4566.startsWith("ppc")) {
                    class564.field8355 = class564.field8355 + "ppc/";
                } else {
                    class564.field8355 = class564.field8355 + "universal/";
                }
            } else {
                class564.field8355 = class564.field8355 + "x86/";
            }
        } else {
            class564.field8355 = class564.field8355 + "x86_64/";
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IFLsa;ZI)V", line = 195)
    public final void method935(int arg0, float arg1, class176 arg2, boolean arg3, int arg4) {
        super.field3744[super.field3741] = (byte) (!arg3 ? arg0 + 30 : arg0 + 40);
        ++field6749;
        super.field3751[super.field3741] = arg2;
        super.field3745[super.field3741] = arg1;
        ++super.field3741;
        if (~super.field3741 <= -5001) {
            super.field3741 = 0;
        }
        if (arg4 != 17246) {
            field6739 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V", line = 217)
    public final void method937(int arg0, int arg1) {
        super.field3744[super.field3741] = (byte) arg1;
        ++field6734;
        if (arg0 == 23354) {
            ++super.field3741;
            if (super.field3741 >= 5000) {
                super.field3741 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lnj;B)V", line = 233)
    public final void method934(class205 arg0, byte arg1) {
        if (arg1 != -28) {
            this.method938(-58);
        }
        ++field6736;
        --super.field3750;
        if (~super.field3750 > -1) {
            super.field3750 = 4999;
        }
        super.field3744[super.field3750] = 21;
        super.field3751[super.field3750] = arg0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lnj;I)V", line = 254)
    public final void method928(class205 arg0, int arg1) {
        ++field6748;
        super.field3744[super.field3741] = 20;
        super.field3751[super.field3741] = arg0;
        if (arg1 != -8186) {
            this.method934((class205) null, (byte) 51);
        }
        ++super.field3741;
        if (~super.field3741 <= -5001) {
            super.field3741 = 0;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 272)
    private final void method2870(byte arg0) {
        if (arg0 < 61) {
            this.method935(32, 0.23208009F, (class176) null, true, -39);
        }
        ++field6735;
        int var2 = super.field3750++;
        if (~super.field3750 <= -5001) {
            super.field3750 = 0;
        }
        this.field6745 = super.field3744[var2];
        Object var3 = super.field3751[var2];
        super.field3751[var2] = null;
        if (this.field6745 == 21) {
            class328.method1963(this.field6740, (class205) var3);
        } else if (this.field6745 != 20) {
            if (this.field6745 >= 30 && this.field6745 <= 33) {
                class193.field2864.method422(3000.0F, super.field3745[var2] * 1.5F);
                ((class176) var3).method1230(class297.field4092, class18.field169, class504.field7141, class222.field3230, ~(this.field6745 + -30) == -1);
            } else if (this.field6745 >= 40 && this.field6745 <= 43) {
                class193.field2864.method422(3000.0F, super.field3745[var2] * 1.5F);
                ((class176) var3).method1230(class297.field4092, class18.field169, class504.field7141, class25.field245, this.field6745 + -40 == 0);
            } else if (~this.field6745 == -23) {
                class193.field2864.method443(-1, 1583160, 40, 127);
            } else {
                if (this.field6745 != 23) {
                    if (this.field6745 == 24) {
                        class193.field2864.method429(0, (class405[]) null);
                        return;
                    }
                } else {
                    class193.field2864.method440();
                }
            }
        } else {
            class205 var4 = (class205) var3;
            if (var4.field3047 != null) {
                var4.field3047.method194(0, class193.field2864);
            }
            if (var4.field3037 != null) {
                var4.field3037.method194(0, class193.field2864);
            }
            if (var4.field3040 != null) {
                var4.field3040.method194(0, class193.field2864);
            }
            if (var4.field3050 != null) {
                var4.field3050.method194(0, class193.field2864);
            }
            if (var4.field3045 != null) {
                var4.field3045.method194(0, class193.field2864);
            }
            for (class636 var5 = var4.field3029; var5 != null; var5 = var5.field9302) {
                var5.field9299.method194(0, class193.field2864);
            }
        }
    }
}
