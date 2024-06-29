import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class240 {

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    private int field4281 = -1;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    private int field4279 = 0;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lfl;")
    private class191 field4293 = new class191();

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Z")
    public boolean field4294 = false;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    private int field4283;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "[Lui;")
    private class225[] field4290;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[[I")
    private int[][] field4280;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lgf;")
    public static class7 field4277 = new class7(260);

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lli;")
    public static class185 field4285 = class245.method1649("::gc", -57);

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "[I")
    public static int[] field4291 = new int[100];

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lli;")
    public static class185 field4286 = class245.method1649("www)2wtqa", 122);

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lli;")
    public static class185 field4288 = class245.method1649(" s(West d-Bconnect-B)3", 126);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lmh;")
    public static class114 field4278;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Z")
    public static boolean field4296;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "[[B")
    public static byte[][] field4292;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method1624(int arg0) {
        field4295++;
        for (int var2 = arg0; var2 < this.field4283; var2++) {
            this.field4280[var2] = null;
        }
        this.field4280 = null;
        this.field4290 = null;
        this.field4293.method1383((byte) 25);
        this.field4293 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
    public static final int method1625(int arg0, byte arg1) {
        field4284++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            int var2 = -108 / ((arg1 - 69) / 57);
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZIII)V")
    public static final void method1626(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4275++;
        int var5 = arg2;
        int var6 = 0;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg3 + arg2);
        int var10 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg3 - arg2);
        class157.method1116(arg0, var10, var9, class145.field2757[arg4], -85);
        if (!arg1) {
            return;
        }
        while (var6 < var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var5--;
                var7 -= var5 << 1;
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                if (class216.field3964 <= var11 && class113.field2040 >= var12) {
                    int var13 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg3 + var6);
                    int var14 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg3 - var6);
                    if (var11 <= class113.field2040) {
                        class157.method1116(arg0, var14, var13, class145.field2757[var11], -26);
                    }
                    if (var12 >= class216.field3964) {
                        class157.method1116(arg0, var14, var13, class145.field2757[var12], -61);
                    }
                }
            }
            var6++;
            int var15 = arg4 - var6;
            int var16 = arg4 + var6;
            if (class216.field3964 <= var16 && class113.field2040 >= var15) {
                int var17 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg3 + var5);
                int var18 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg3 - var5);
                if (var16 <= class113.field2040) {
                    class157.method1116(arg0, var18, var17, class145.field2757[var16], -40);
                }
                if (var15 >= class216.field3964) {
                    class157.method1116(arg0, var18, var17, class145.field2757[var15], -36);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)[[I")
    public final int[][] method1627(int arg0) {
        field4287++;
        if (this.field4283 != this.field4274) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == 28257) {
            for (int var2 = 0; var2 < this.field4283; var2++) {
                this.field4290[var2] = class121.field2209;
            }
            return this.field4280;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static final void method1628(int arg0) {
        class70 var1 = (class70) class229.field4168.method1375(16259);
        field4276++;
        while (var1 != null) {
            class165 var2 = var1.field1225;
            if (class265.field4703 != var2.field3084 || var2.field3077) {
                var1.method476(119);
            } else if (var2.field3085 <= class211.field3851) {
                var2.method1177(class224.field4111, -87);
                if (var2.field3077) {
                    var1.method476(-60);
                } else {
                    class136.method977(var2.field3084, var2.field3072, var2.field3071, var2.field3083, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class70) class229.field4168.method1377(-19546);
        }
        if (arg0 > -28) {
            method1628(-1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Lne;")
    public static final class199 method1629(int arg0) {
        class145.field2754 = arg0;
        field4297++;
        return class18.method128(16);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method1630(byte arg0) {
        if (arg0 != -52) {
            method1628(7);
        }
        field4288 = null;
        field4277 = null;
        field4292 = null;
        field4291 = null;
        field4278 = null;
        field4285 = null;
        field4286 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)V")
    public static final void method1631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4289++;
        int var6 = 0;
        int var7 = arg2;
        if (arg0 != -17032) {
            field4296 = false;
        }
        int var8 = arg4 * arg4;
        int var9 = var8 << 1;
        int var10 = arg2 * arg2;
        int var11 = var10 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var10 - ((var12 - 1) * var9);
        int var15 = var10 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = (var6 + 1) * var15;
        int var19 = ((arg2 << 1) - 3) * var9;
        int var20 = (arg2 - 1) * var16;
        if (arg1 >= class216.field3964 && arg1 <= class113.field2040) {
            int var21 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg4 + arg5);
            int var22 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg5 - arg4);
            class157.method1116(arg3, var22, var21, class145.field2757[arg1], -28);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var18;
                    var13 += var17;
                    var18 += var15;
                    var17 += var15;
                }
            }
            if (var14 < 0) {
                var6++;
                var14 += var18;
                var18 += var15;
                var13 += var17;
                var17 += var15;
            }
            var13 += -var20;
            var20 -= var16;
            var7--;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            var14 += -var19;
            if (var24 >= class216.field3964 && class113.field2040 >= var23) {
                int var25 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg5 + var6);
                int var26 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg5 - var6);
                if (class216.field3964 <= var23) {
                    class157.method1116(arg3, var26, var25, class145.field2757[var23], arg0 + 16940);
                }
                if (class113.field2040 >= var24) {
                    class157.method1116(arg3, var26, var25, class145.field2757[var24], -76);
                }
            }
            var19 -= var16;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I")
    public final int[] method1632(int arg0, int arg1) {
        field4282++;
        if (arg0 != 0) {
            method1628(-86);
        }
        if (this.field4283 == this.field4274) {
            this.field4294 = this.field4290[arg1] == null;
            this.field4290[arg1] = class121.field2209;
            return this.field4280[arg1];
        } else if (this.field4283 == 1) {
            this.field4294 = this.field4281 != arg1;
            this.field4281 = arg1;
            return this.field4280[0];
        } else {
            class225 var3 = this.field4290[arg1];
            if (var3 == null) {
                this.field4294 = true;
                if (this.field4279 < this.field4283) {
                    var3 = new class225(arg1, this.field4279);
                    this.field4279++;
                } else {
                    class225 var4 = (class225) this.field4293.method1374(256);
                    var3 = new class225(arg1, var4.field4120);
                    this.field4290[var4.field4113] = null;
                    var4.method476(arg0 ^ 0xFFFFFFA0);
                }
                this.field4290[arg1] = var3;
            } else {
                this.field4294 = false;
            }
            this.field4293.method1378(var3, false);
            return this.field4280[var3.field4120];
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(III)V")
    public class240(int arg0, int arg1, int arg2) {
        this.field4274 = arg1;
        this.field4283 = arg0;
        this.field4290 = new class225[this.field4274];
        this.field4280 = new int[this.field4283][arg2];
    }
}
