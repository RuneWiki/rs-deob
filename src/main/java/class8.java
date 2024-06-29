import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class8 extends class378 {

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    private int field135 = 0;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lak;")
    private class32 field132 = new class32();

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "[Ldp;")
    public static class319[] field129;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public final void method89(byte arg0) {
        if (arg0 >= -123) {
            field126 = 40;
        }
        ++field128;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLke;)V")
    public final void method90(byte arg0, class337 arg1) {
        ++field127;
        --super.field5625;
        if (arg0 != 25) {
            method96(true);
        }
        if (super.field5625 < 0) {
            super.field5625 = 4999;
        }
        super.field5617[super.field5625] = 21;
        super.field5620[super.field5625] = arg1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILcl;ZIF)V")
    public final void method91(int arg0, class48 arg1, boolean arg2, int arg3, float arg4) {
        ++field136;
        super.field5617[super.field5627] = (byte) (arg2 ? arg0 + 40 : arg0 + 30);
        super.field5620[super.field5627] = arg1;
        super.field5615[super.field5627] = arg4;
        int var6 = -5 / ((-44 - arg3) / 61);
        ++super.field5627;
        if (~super.field5627 <= -5001) {
            super.field5627 = 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    private final void method92(int arg0) {
        ++field140;
        int var2 = super.field5625++;
        if (super.field5625 >= 5000) {
            super.field5625 = 0;
        }
        this.field135 = super.field5617[var2];
        Object var3 = super.field5620[var2];
        int var4 = 111 % ((45 - arg0) / 54);
        super.field5620[var2] = null;
        if (~this.field135 == -22) {
            class229.method1487(this.field132, (class337) var3);
        } else if (this.field135 != 20) {
            if (this.field135 >= 30 && this.field135 <= 33) {
                class432.field6150.method501(3000.0F, super.field5615[var2] * 1.5F);
                ((class48) var3).method203(class307.field4577, class386.field5702, class281.field4243, class206.field3116, ~(this.field135 + -30) == -1);
            } else if (this.field135 >= 40 && ~this.field135 >= -44) {
                class432.field6150.method501(3000.0F, super.field5615[var2] * 1.5F);
                ((class48) var3).method203(class307.field4577, class386.field5702, class281.field4243, class10.field155, this.field135 + -40 == 0);
            } else if (~this.field135 == -23) {
                class432.field6150.method517(-1, 1583160, 40, 127);
            } else {
                if (this.field135 != 23) {
                    if (~this.field135 == -25) {
                        class432.field6150.method542(0, (class233[]) null);
                        return;
                    }
                } else {
                    class432.field6150.method511();
                }
            }
        } else {
            class337 var5 = (class337) var3;
            if (var5.field5044 != null) {
                var5.field5044.method260(0, class432.field6150);
            }
            if (var5.field5047 != null) {
                var5.field5047.method260(0, class432.field6150);
            }
            if (var5.field5058 != null) {
                var5.field5058.method260(0, class432.field6150);
            }
            if (var5.field5050 != null) {
                var5.field5050.method260(0, class432.field6150);
            }
            if (var5.field5063 != null) {
                var5.field5063.method260(0, class432.field6150);
            }
            for (class448 var6 = var5.field5054; var6 != null; var6 = var6.field6340) {
                var6.field6343.method260(0, class432.field6150);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method93(int arg0) {
        ++field137;
        if (arg0 <= 66) {
            field139 = -4;
        }
        while (~super.field5627 != ~super.field5625) {
            this.method92(-42);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(BLke;)V")
    public final void method94(byte arg0, class337 arg1) {
        if (arg0 != 37) {
            this.field135 = -80;
        }
        super.field5617[super.field5627] = 20;
        ++field141;
        super.field5620[super.field5627] = arg1;
        ++super.field5627;
        if (~super.field5627 <= -5001) {
            super.field5627 = 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method95(int arg0) {
        if (arg0 != 255) {
            field129 = null;
        }
        field129 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)[Les;")
    public static final class441[] method96(boolean arg0) {
        ++field131;
        if (!arg0) {
            field126 = -5;
        }
        return new class441[] { class150.field2114, class212.field3183, class318.field4777, class371.field5587, class182.field2702 };
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([[BLjb;I)V")
    public static final void method97(byte[][] arg0, class350 arg1, int arg2) {
        ++field125;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class446 var11 = new class446(var10);
                int var12 = class145.field2052[var5] >> 8;
                int var13 = class145.field2052[var5] & 255;
                int var14 = var12 * 64 + -class68.field922;
                int var15 = var13 * 64 + -class468.field6588;
                class418.method2483((byte) 124);
                arg1.method359(class468.field6588, arg2 + -64, class183.field2717, var11, var14, var15, class68.field922);
                arg1.method2156(0, var15, var11, var14, var3, class138.field1976);
                if (!arg1.field713 && ~(class356.field5413 / 8) == ~var12 && class314.field4728 / 8 == var13) {
                    if (~var3[0] != 0) {
                        class378.field5629 = class365.field5529.method681(var3[2], var3[0], class431.field6129, var3[3], (byte) 53, var3[1]);
                        class378.field5616 = var3[4];
                    } else {
                        class378.field5629 = null;
                    }
                }
            }
        }
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            int var7 = (class145.field2052[var6] >> 8) * 64 + -class68.field922;
            int var8 = (class145.field2052[var6] & 255) * 64 - class468.field6588;
            byte[] var9 = arg0[var6];
            if (var9 == null && class314.field4728 < 800) {
                class418.method2483((byte) 108);
                arg1.method358(64, var8, var7, -101, 64);
            }
        }
        if (arg2 != 64) {
            field129 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public final void method98(int arg0, int arg1) {
        ++field138;
        if (arg0 != 20923) {
            this.method89((byte) -66);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
    public final void method99(int arg0, byte arg1) {
        ++field133;
        super.field5617[super.field5627] = (byte) arg0;
        ++super.field5627;
        if (~super.field5627 <= -5001) {
            super.field5627 = 0;
        }
        if (arg1 <= 80) {
            this.method90((byte) 2, (class337) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lke;I)V")
    public final void method100(class337 arg0, int arg1) {
        if (arg1 != -23157) {
            field126 = 77;
        }
        ++field134;
        super.field5617[super.field5627] = 21;
        super.field5620[super.field5627] = arg0;
        ++super.field5627;
        if (super.field5627 >= 5000) {
            super.field5627 = 0;
        }
    }
}
