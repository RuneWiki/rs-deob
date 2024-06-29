import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class289 {

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field4966 = 8;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Z")
    public boolean field4972 = true;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field4963 = -1;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public int field4977 = -1;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public int field4976 = 1190717;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public int field4969 = 0;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Z")
    public boolean field4981 = false;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Z")
    public boolean field4978 = true;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public int field4985 = 128;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public int field4970 = 16;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field4964 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Lve;")
    public static class255 field4982 = class87.method607(66, "::gc");

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lve;")
    private static class255 field4968 = class87.method607(94, "Connection lost)3");

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lve;")
    private static class255 field4965 = class87.method607(119, "Loaded input handler");

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lve;")
    public static class255 field4971 = field4968;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lve;")
    public static class255 field4973 = field4965;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field4979 = 0;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[I")
    public static int[] field4967 = new int[128];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I", line = 7)
    public static final int method2044(int arg0, int arg1) {
        double var2 = (double) ((arg1 & 0xFFFA73) >> 16) / 256.0D;
        field4962++;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = (var8 + var10) / 2.0D;
        double var16 = 0.0D;
        if (arg0 > -100) {
            field4968 = (class255) null;
        }
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var8 != var10) {
            if (var14 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var16 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var16 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var16 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var14 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var19 = var16 / 6.0D;
        int var21 = (int) (var12 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        int var22 = (int) (var19 * 256.0D);
        return (var21 >> 5 << 7) + (var22 >> 2 << 10) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 107)
    public static void method2045(int arg0) {
        field4982 = null;
        field4968 = null;
        if (arg0 != 26257) {
            method2046(-126, 67);
        }
        field4973 = null;
        field4965 = null;
        field4971 = null;
        field4967 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)Lmg;", line = 139)
    public static final class145 method2046(int arg0, int arg1) {
        field4984++;
        class145 var2 = (class145) class10.field148.method558((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class253.field4266.method636(class88.method616(arg1, (byte) -7), (byte) 124, class305.method2120(arg1, 19));
        class145 var4 = new class145();
        var4.field2458 = arg1;
        if (var3 != null) {
            var4.method1081(new class70(var3), arg0 ^ 0xFFFFCF5B);
        }
        var4.method1073(arg0 + 12523);
        if (!class33.field537 && var4.field2435) {
            var4.field2470 = null;
        }
        if (var4.field2418) {
            var4.field2472 = false;
            var4.field2446 = 0;
        }
        if (arg0 == -12453) {
            class10.field148.method555(var4, (long) arg1, arg0 + 12453);
            return var4;
        } else {
            return (class145) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)V", line = 198)
    public static final void method2047(int arg0, int arg1) {
        field4975++;
        if (arg1 < 55) {
            return;
        }
        if (class73.field1203 == 0) {
            class242.field4080.method647((byte) -97, arg0);
        } else {
            class235.field3872 = arg0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 216)
    public static final void method2048(byte arg0) {
        field4983++;
        if (!class96.method761(true) && client.field4039 != class87.field1415) {
            class282.method1991(class72.field1201, class276.field4742.field5154[0], class276.field4742.field5125[0], (byte) -103, false, client.field4039, class20.field332);
            return;
        }
        if (client.field4039 != class183.field2954) {
            class183.field2954 = client.field4039;
            class231.method1601(client.field4039, (byte) 107);
            class3.method18(-981);
        }
        if (arg0 >= -82) {
            method2048((byte) 19);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lpb;II)V", line = 262)
    public final void method2049(class70 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method481(0);
            if (var4 == 0) {
                if (arg1 != -12) {
                    method2046(-80, -94);
                }
                field4987++;
                return;
            }
            this.method2050(arg1 + 11, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILpb;I)V", line = 284)
    private final void method2050(int arg0, int arg1, class70 arg2, int arg3) {
        if (arg3 == 1) {
            this.field4969 = class314.method2165(12860, arg2.method465(true));
        } else if (arg3 == 2) {
            this.field4963 = arg2.method481(arg0 + 1);
        } else if (arg3 == 3) {
            this.field4963 = arg2.method423(arg0 ^ 0xFFFFFF00);
            if (this.field4963 == 65535) {
                this.field4963 = -1;
            }
        } else if (arg3 == 5) {
            this.field4972 = false;
        } else if (arg3 == 7) {
            this.field4977 = class314.method2165(12860, arg2.method465(true));
        } else if (arg3 == 8) {
            class32.field521 = arg1;
        } else if (arg3 == 9) {
            this.field4985 = arg2.method423(255);
        } else if (arg3 == 10) {
            this.field4978 = false;
        } else if (arg3 == 11) {
            this.field4966 = arg2.method481(0);
        } else if (arg3 == 12) {
            this.field4981 = true;
        } else if (arg3 == 13) {
            this.field4976 = arg2.method465(true);
        } else if (arg3 == 14) {
            this.field4970 = arg2.method481(~arg0);
        }
        field4986++;
        if (arg0 != -1) {
            method2048((byte) -35);
        }
    }
}
