import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class279 extends class110 {

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "Z")
    private boolean field4245 = true;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Z")
    private boolean field4239 = true;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "[B")
    public static byte[] field4240 = new byte[520];

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4241 = "cyan:";

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILre;I)V", line = 15)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field4245 = arg1.method1787(false) == 1;
        } else if (arg0 == 1) {
            this.field4239 = arg1.method1787(false) == 1;
        } else if (arg0 == 2) {
            this.field1705 = arg1.method1787(false) == 1;
        }
        if (arg2 > -37) {
            field4241 = (String) null;
        }
        field4246++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I", line = 49)
    public static final int method1945(byte arg0, int arg1) {
        field4243++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = (double) ((arg1 & 0xFFC7) >> 8) / 256.0D;
        double var8 = var2;
        if (var2 < var6) {
            var8 = var6;
        }
        double var10 = 0.0D;
        if (var8 < var4) {
            var8 = var4;
        }
        double var12 = 0.0D;
        double var14 = var2;
        if (var2 > var6) {
            var14 = var6;
        }
        if (var14 > var4) {
            var14 = var4;
        }
        if (arg0 <= 119) {
            return -78;
        }
        double var16 = (var8 + var14) / 2.0D;
        if (var8 != var14) {
            if (var16 < 0.5D) {
                var12 = (var8 - var14) / (var8 + var14);
            }
            if (var2 == var8) {
                var10 = (var6 - var4) / (var8 - var14);
            } else if (var6 == var8) {
                var10 = (var4 - var2) / (var8 - var14) + 2.0D;
            } else if (var4 == var8) {
                var10 = (var2 - var6) / (var8 - var14) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var12 = (var8 - var14) / (2.0D - var8 - var14);
            }
        }
        double var18 = var10 / 6.0D;
        int var20 = (int) (var16 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var22 = (int) (var12 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var20 > 243) {
            var22 >>= 0x4;
        } else if (var20 > 217) {
            var22 >>= 0x3;
        } else if (var20 > 192) {
            var22 >>= 0x2;
        } else if (var20 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var22 >> 5 << 7) + (var20 >> 1);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 153)
    public class279() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[[I", line = 164)
    public final int[][] method445(int arg0, boolean arg1) {
        field4244++;
        if (arg1) {
            field4240 = (byte[]) null;
        }
        int[][] var3 = this.field1701.method1477((byte) 73, arg0);
        if (this.field1701.field3255) {
            int[][] var4 = this.method770(this.field4239 ? class154.field2320 - arg0 : arg0, (byte) 54, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4245) {
                for (int var12 = 0; var12 < class124.field1936; var12++) {
                    var8[var12] = var5[class196.field2949 - var12];
                    var9[var12] = var6[class196.field2949 - var12];
                    var10[var12] = var7[class196.field2949 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class124.field1936; var11++) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 228)
    public static final void method1946(boolean arg0, String arg1) {
        System.out.println("Error: " + class11.method54(arg1, (byte) -87, "\n", "%0a"));
        field4238++;
        if (!arg0) {
            field4241 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I", line = 243)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int[] var4 = this.method764(0, true, this.field4239 ? class154.field2320 - arg1 : arg1);
            if (this.field4245) {
                for (int var5 = 0; var5 < class124.field1936; var5++) {
                    var3[var5] = var4[class196.field2949 - var5];
                }
            } else {
                class85.method594(var4, 0, var3, 0, class124.field1936);
            }
        }
        field4242++;
        if (arg0 != 1) {
            this.field4239 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 283)
    public static void method1947(byte arg0) {
        field4241 = null;
        field4240 = null;
        int var1 = 37 / ((59 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)I", line = 294)
    public static final int method1948(int arg0, int arg1) {
        if (arg1 != 65479) {
            field4240 = (byte[]) null;
        }
        field4237++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 314)
    public static final void method1949(boolean arg0) {
        field4247++;
        if (!class122.field1907) {
            return;
        }
        class329 var1 = class10.method48(class198.field2977, class115.field1762, (byte) 115);
        if (var1 != null && var1.field4963 != null) {
            class286 var2 = new class286();
            var2.field4310 = var1.field4963;
            var2.field4330 = var1;
            class9.method39(var2, 6514);
        }
        class122.field1907 = arg0;
        class156.field2330 = -1;
        class247.method1666(var1, -126);
    }
}
