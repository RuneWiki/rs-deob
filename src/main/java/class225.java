import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class225 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[B")
    private byte[] field4048;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "[I")
    private int[] field4058;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[I")
    private int[] field4047;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lkh;")
    public static class117 field4054 = class224.method1450((byte) -49, "<br>");

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lkh;")
    private static class117 field4046 = class224.method1450((byte) 107, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lkh;")
    private static class117 field4055 = class224.method1450((byte) 121, "M");

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lkh;")
    public static class117 field4051 = field4055;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lkh;")
    public static class117 field4057 = field4055;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Lkh;")
    public static class117 field4060 = field4046;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lge;")
    public static class71 field4052 = new class71(64);

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lkh;")
    public static class117 field4061 = class224.method1450((byte) -9, "headicons_pk");

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "[I")
    public static int[] field4063 = new int[5];

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Lkh;")
    public static class117 field4062 = class224.method1450((byte) -7, "Wordpack geladen)3");

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[[[B")
    public static byte[][][] field4049;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([BIII[BI)I")
    public final int method1454(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field4053++;
        if (arg1 == arg3) {
            return 0;
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4058[var8];
            }
            int var11;
            if ((var11 = this.field4058[var8]) < 0) {
                arg0[arg5++] = (byte) ~var11;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4058[var8];
            }
            int var12;
            if ((var12 = this.field4058[var8]) < 0) {
                arg0[arg5++] = (byte) ~var12;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4058[var8];
            }
            int var13;
            if ((var13 = this.field4058[var8]) < 0) {
                arg0[arg5++] = (byte) ~var13;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4058[var8];
            }
            int var14;
            if ((var14 = this.field4058[var8]) < 0) {
                arg0[arg5++] = (byte) ~var14;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4058[var8];
            }
            int var15;
            if ((var15 = this.field4058[var8]) < 0) {
                arg0[arg5++] = (byte) ~var15;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4058[var8];
            }
            int var16;
            if ((var16 = this.field4058[var8]) < 0) {
                arg0[arg5++] = (byte) ~var16;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4058[var8];
            }
            int var17;
            if ((var17 = this.field4058[var8]) < 0) {
                arg0[arg5++] = (byte) ~var17;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4058[var8];
            }
            int var18;
            if ((var18 = this.field4058[var8]) < 0) {
                arg0[arg5++] = (byte) ~var18;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "([BIII[BI)I")
    public final int method1455(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg3 + arg5;
        field4050++;
        if (arg2 != 10313) {
            field4062 = null;
        }
        int var8 = arg1 << 3;
        int var9 = 0;
        while (var7 > arg3) {
            int var10 = arg4[arg3] & 0xFF;
            byte var11 = this.field4048[var10];
            int var12 = this.field4047[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            var8 += var11;
            int var16 = (var14 + var11 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var9 = class40.method352(var15, var12 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var9 = var12 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var9 = var12 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var9 = var12 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lai;Lvf;ZLai;I)V")
    public static final void method1456(class10 arg0, class235 arg1, boolean arg2, class10 arg3, int arg4) {
        field4056++;
        class244.field4499 = arg2;
        class149.field2716 = arg3;
        class186.field3343 = arg0;
        int var5 = class186.field3343.method99(105) - 1;
        if (arg4 <= 33) {
            field4055 = null;
        }
        class227.field4087 = var5 * 256 + class186.field3343.method108(var5, 0);
        class3.field37 = arg1;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "([B)V")
    public class225(byte[] arg0) {
        int var2 = arg0.length;
        this.field4048 = arg0;
        this.field4058 = new int[8];
        int[] var3 = new int[33];
        this.field4047 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4047[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class40.method352(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4058[var14] == 0) {
                            this.field4058[var14] = var4;
                        }
                        var14 = this.field4058[var14];
                    }
                    if (var14 >= this.field4058.length) {
                        int[] var17 = new int[this.field4058.length * 2];
                        for (int var18 = 0; var18 < this.field4058.length; var18++) {
                            var17[var18] = this.field4058[var18];
                        }
                        this.field4058 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field4058[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static final void method1457(byte arg0) {
        Object var1 = class146.field2680;
        synchronized (class146.field2680) {
            if (class244.field4506 != 0) {
                class244.field4506 = 1;
                try {
                    class146.field2680.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
        field4045++;
        int var2 = -69 % ((arg0 - 85) / 32);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILsf;Lvb;)V")
    public static final void method1458(int arg0, int arg1, class203 arg2, class232 arg3) {
        field4059++;
        byte[] var4 = null;
        class36 var5 = class55.field1118;
        synchronized (class55.field1118) {
            if (arg1 >= -68) {
                field4055 = null;
            }
            for (class185 var6 = (class185) class55.field1118.method314((byte) -26); var6 != null; var6 = (class185) class55.field1118.method320(0)) {
                if ((long) arg0 == var6.field389 && var6.field3322 == arg2 && var6.field3327 == 0) {
                    var4 = var6.field3321;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method1352(6, arg0);
            arg3.method1496((byte) -12, true, var7, arg0, arg2);
        } else {
            arg3.method1496((byte) -12, true, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1459(int arg0) {
        field4055 = null;
        field4052 = null;
        field4046 = null;
        field4060 = null;
        field4063 = null;
        field4062 = null;
        field4057 = null;
        field4051 = null;
        if (arg0 != 4) {
            method1459(-122);
        }
        field4049 = null;
        field4054 = null;
        field4061 = null;
    }
}
