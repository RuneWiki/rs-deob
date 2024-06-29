import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class340 extends class70 {

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field5380;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field5382 = new String[100];

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "[I")
    public static int[] field5391 = new int[2500];

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Z", line = 5)
    public final boolean method2395(int arg0) {
        int var2 = 86 % ((arg0 - 57) / 53);
        field5396++;
        return (this.field5380 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)Z", line = 14)
    public final boolean method2396(int arg0) {
        if (arg0 <= 105) {
            field5382 = (String[]) null;
        }
        field5383++;
        return (this.field5380 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z", line = 27)
    public final boolean method2397(int arg0, int arg1) {
        if (arg1 >= -80) {
            this.method2397(59, 84);
        }
        field5386++;
        return (this.field5380 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z", line = 38)
    public final boolean method2398(boolean arg0) {
        field5392++;
        if (arg0) {
            return true;
        } else {
            return (this.field5380 & 0x309878) >> 21 != 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V", line = 50)
    public static void method2399(int arg0) {
        field5382 = null;
        int var1 = 66 / ((-arg0 - 22) / 54);
        field5391 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Z", line = 61)
    public final boolean method2400(byte arg0) {
        field5388++;
        if (arg0 == -59) {
            return ((this.field5380 & 0x10188AEE) >> 28) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/String;)V", line = 72)
    public static final void method2401(byte arg0, String arg1) {
        field5389++;
        if (class85.field1473 == null) {
            return;
        }
        if (arg0 != 107) {
            method2401((byte) -99, (String) null);
        }
        class51.field1038.method291((byte) 94, 100);
        class87.field1524++;
        class51.field1038.method1027(class148.method1066(arg1, (byte) 57), arg0 ^ 0xFFFFB001);
        class51.field1038.method1012(arg1, (byte) 100);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)Z", line = 90)
    public final boolean method2402(byte arg0) {
        if (arg0 >= -108) {
            return true;
        } else {
            field5397++;
            return (this.field5380 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBILqn;II)Z", line = 103)
    public static final boolean method2403(int arg0, int arg1, byte arg2, int arg3, class238 arg4, int arg5, int arg6) {
        field5393++;
        class91 var7 = class138.method960(arg2 ^ 0xFFFFFF8F, arg4.field3962);
        if (var7.field1612 == -1) {
            return true;
        }
        int var8;
        if (arg4.field3929) {
            int var9 = arg4.field3955 + arg6;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        if (arg2 != -4) {
            method2401((byte) -128, (String) null);
        }
        class211 var10 = var7.method695(0, var8, arg4.field3895);
        if (var10 == null) {
            return false;
        }
        int var11 = arg4.field3935;
        int var12 = arg4.field3890;
        if ((var8 & 0x1) == 1) {
            var11 = arg4.field3890;
            var12 = arg4.field3935;
        }
        int var13 = var10.field5228;
        int var14 = var10.field5239;
        if (var7.field1620) {
            var13 = var12 * 4;
            var14 = var11 * 4;
        }
        if (var7.field1623 == 0) {
            var10.method1447((arg1 * 4) + 48, (-arg0 + -var12 + 104) * 4 + 48, var14, var13);
        } else {
            var10.method1449(arg1 * 4 + 48, (-arg0 + 104 + -var12) * 4 + 48, var14, var13, var7.field1623);
        }
        return true;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)Z", line = 175)
    public final boolean method2404(int arg0) {
        if (arg0 != -21377) {
            field5391 = (int[]) null;
        }
        field5394++;
        return (this.field5380 & 0x2FFB98FC) >> 29 != 0;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)Z", line = 187)
    public final boolean method2405(int arg0) {
        field5385++;
        if (arg0 != 9179409) {
            this.field5390 = -29;
        }
        return (this.field5380 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)I", line = 198)
    public final int method2406(int arg0) {
        if (arg0 != 0) {
            this.method2405(95);
        }
        field5395++;
        return class237.method1638(this.field5380, 261677);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)I", line = 210)
    public final int method2407(boolean arg0) {
        if (arg0) {
            return -17;
        } else {
            field5384++;
            return (this.field5380 & 0x1ED5A4) >> 18;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V", line = 222)
    public class340(int arg0, int arg1) {
        this.field5390 = arg1;
        this.field5380 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIII)V", line = 234)
    public static final void method2408(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5387++;
        if (class342.field5416 < 100) {
            class181.method1276((byte) 79);
        }
        if (class241.field4016) {
            class337.method2385(arg1, arg4, arg1 + arg3, arg2 + arg4);
        } else {
            class270.method1891(arg1, arg4, arg1 + arg3, arg4 - -arg2);
        }
        if (class342.field5416 < 100) {
            byte var17 = 20;
            int var18 = arg1 + (arg3 / 2);
            int var19 = arg2 / 2 + arg4 - var17 - 18;
            if (class241.field4016) {
                class337.method2378(arg1, arg4, arg3, arg2, 0);
                class337.method2387(var18 - 152, var19, 304, 34, 9179409);
                class337.method2378(var18 - 150, var19 + 2, class342.field5416 * 3, 30, 9179409);
            } else {
                class270.method1894(arg1, arg4, arg3, arg2, 0);
                class270.method1904(var18 - 152, var19, 304, 34, 9179409);
                class270.method1894(var18 - 150, var19 + 2, class342.field5416 * 3, 30, 9179409);
            }
            class332.field5297.method629(class73.field1331, var18, var17 + var19, 16777215, -1);
            return;
        }
        class162.field2723 = (int) ((float) (arg3 * 2) / class38.field828);
        class156.field2640 = class206.field3449 - ((int) ((float) arg2 / class38.field828));
        class251.field4123 = class332.field5303 - ((int) ((float) arg3 / class38.field828));
        int var5 = class332.field5303 - (int) ((float) arg3 / class38.field828);
        class148.field2526 = (int) ((float) (arg2 * 2) / class38.field828);
        int var6 = class206.field3449 - (int) ((float) arg2 / class38.field828);
        int var7 = class206.field3449 + ((int) ((float) arg2 / class38.field828));
        int var8 = (int) ((float) arg3 / class38.field828) + class332.field5303;
        int var9 = -9 / ((arg0 + 56) / 60);
        if (class241.field4016) {
            if (class31.field717 == null || class31.field717.field1353 != arg3 || class31.field717.field1356 != arg2) {
                class31.field717 = null;
                class31.field717 = new class288(arg3, arg2);
            }
            class270.method1907(class31.field717.field4697, arg3, arg2);
            class38.method289(var5, var6, var8, var7, 0, 0, arg3, arg2 + 1);
            class38.method273();
            class49 var10 = class38.method278();
            class229.method1590(var10, arg4, arg1, -1305);
            class31.field717.method2049();
            class337.method2372(class31.field717.field4697, arg1, arg4, arg3, arg2);
            class270.field4403 = null;
        } else {
            class38.method289(var5, var6, var8, var7, arg1, arg4, arg1 + arg3, arg2 + 1 + arg4);
            class38.method273();
            class49 var11 = class38.method278();
            class229.method1590(var11, 0, 0, -1305);
        }
        if (class1.field37 > 0) {
            class6.field169--;
            if (class6.field169 == 0) {
                class1.field37--;
                class6.field169 = 20;
            }
        }
        if (!class36.field786) {
            return;
        }
        int var12 = arg1 + arg3 - 5;
        int var13 = arg2 + arg4 - 8;
        class14.field416.method626("Fps:" + class194.field3264, var12, var13, 16776960, -1);
        int var14 = 16776960;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        int var20 = var13 - 15;
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class14.field416.method626("Mem:" + var16 + "k", var12, var20, var14, -1);
        var13 = var20 - 15;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Ldc;", line = 353)
    public static final class125 method2409(int arg0, int arg1) {
        class125 var2 = (class125) class23.field575.method893((long) arg1, arg0 ^ 0x49);
        if (arg0 != 15) {
            method2409(-85, 36);
        }
        field5381++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class170.field2810.method1404(30, arg1, (byte) -111);
        class125 var4 = new class125();
        if (var3 != null) {
            var4.method902(arg0 ^ 0xE, arg1, new class146(var3));
        }
        class23.field575.method888((long) arg1, var4, 21);
        return var4;
    }
}
