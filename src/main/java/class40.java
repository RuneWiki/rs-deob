import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class40 extends class503 {

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    private int field657 = 0;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Lbc;")
    private class512 field653 = new class512();

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "Lns;")
    public static class62 field667;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
    public final void method267(byte arg0, int arg1) {
        ++field662;
        super.field7302[super.field7307] = (byte) arg1;
        ++super.field7307;
        if (arg0 >= -47) {
            method271((byte) -47);
        }
        if (~super.field7307 <= -5001) {
            super.field7307 = 0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lya;IIZF)V")
    public final void method268(class11 arg0, int arg1, int arg2, boolean arg3, float arg4) {
        ++field652;
        if (arg1 != -1) {
            field655 = 34;
        }
        super.field7302[super.field7307] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
        super.field7308[super.field7307] = arg0;
        super.field7306[super.field7307] = arg4;
        ++super.field7307;
        if (~super.field7307 <= -5001) {
            super.field7307 = 0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public final void method269(int arg0) {
        if (arg0 < 30) {
            this.method267((byte) 105, 13);
        }
        while (super.field7307 != super.field7299) {
            this.method272(false);
        }
        ++field660;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    public final void method270(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field657 = 7;
        }
        ++field664;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static void method271(byte arg0) {
        if (arg0 <= 47) {
            field655 = 10;
        }
        field667 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    private final void method272(boolean arg0) {
        ++field661;
        int var2 = super.field7299++;
        if (super.field7299 >= 5000) {
            super.field7299 = 0;
        }
        if (arg0) {
            field667 = null;
        }
        this.field657 = super.field7302[var2];
        Object var3 = super.field7308[var2];
        super.field7308[var2] = null;
        if (~this.field657 == -22) {
            class242.method1627(this.field653, (class281) var3);
        } else if (this.field657 != 20) {
            if (this.field657 >= 30 && this.field657 <= 33) {
                class319.field4840.method606(3000.0F, super.field7306[var2] * 1.5F);
                ((class11) var3).method67(class144.field2126, class29.field323, class16.field166, class390.field5715, ~(this.field657 + -30) == -1);
            } else if (this.field657 >= 40 && ~this.field657 >= -44) {
                class319.field4840.method606(3000.0F, super.field7306[var2] * 1.5F);
                ((class11) var3).method67(class144.field2126, class29.field323, class16.field166, class63.field999, ~(this.field657 + -40) == -1);
            } else {
                if (this.field657 != 22) {
                    if (~this.field657 == -24) {
                        class319.field4840.method585();
                        return;
                    }
                    if (this.field657 == 24) {
                        class319.field4840.method519(0, (class344[]) null);
                        return;
                    }
                } else {
                    class319.field4840.method511(-1, 1583160, 40, 127);
                }
            }
        } else {
            class281 var4 = (class281) var3;
            if (var4.field4380 != null) {
                var4.field4380.method98(31203, class319.field4840);
            }
            if (var4.field4390 != null) {
                var4.field4390.method98(31203, class319.field4840);
            }
            if (var4.field4376 != null) {
                var4.field4376.method98(31203, class319.field4840);
            }
            if (var4.field4389 != null) {
                var4.field4389.method98(31203, class319.field4840);
            }
            if (var4.field4371 != null) {
                var4.field4371.method98(31203, class319.field4840);
            }
            for (class21 var5 = var4.field4381; var5 != null; var5 = var5.field235) {
                var5.field240.method98(31203, class319.field4840);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public final void method273(byte arg0) {
        if (arg0 > -23) {
            this.method270(-81, 87);
        }
        ++field658;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lvt;I)V")
    public final void method274(class281 arg0, int arg1) {
        int var3 = -122 % ((33 - arg1) / 42);
        --super.field7299;
        ++field654;
        if (super.field7299 < 0) {
            super.field7299 = 4999;
        }
        super.field7302[super.field7299] = 21;
        super.field7308[super.field7299] = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Llv;")
    public static final class534 method275(int arg0, int arg1) {
        ++field666;
        class534 var2 = (class534) class234.field3515.method1634((long) arg1, 64);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class186.field2862.method731(arg0, arg1, 0);
            class534 var4 = new class534();
            if (var3 != null) {
                var4.method3151(0, new class194(var3));
            }
            var4.method3149(114);
            class234.field3515.method1623((long) arg1, 17621, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILvt;)V")
    public final void method276(int arg0, class281 arg1) {
        super.field7302[super.field7307] = 20;
        ++field663;
        super.field7308[super.field7307] = arg1;
        ++super.field7307;
        if (arg0 != -1) {
            this.field653 = null;
        }
        if (super.field7307 >= 5000) {
            super.field7307 = 0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method277(boolean arg0, byte[] arg1) {
        if (arg0) {
            field655 = -24;
        }
        ++field659;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class325.method2131(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(ILvt;)V")
    public final void method278(int arg0, class281 arg1) {
        super.field7302[super.field7307] = 21;
        ++field656;
        if (arg0 != 0) {
            method275(39, 46);
        }
        super.field7308[super.field7307] = arg1;
        ++super.field7307;
        if (~super.field7307 <= -5001) {
            super.field7307 = 0;
        }
    }
}
