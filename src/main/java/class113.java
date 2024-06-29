import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class113 extends class138 {

    @OriginalMember(owner = "client!la", name = "J", descriptor = "[Loh;")
    public class165[] field1722;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field1719 = -1;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "[I")
    public static int[] field1723 = new int[2048];

    @OriginalMember(owner = "client!la", name = "E", descriptor = "F")
    public static float field1717;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1716++;
        if (class79.field1226 <= arg0 && class59.field957 >= arg5 && arg1 >= class108.field1650 && arg7 <= class236.field3800) {
            class227.method1443(arg0, arg7, (byte) 101, arg6, arg4, arg1, arg3, arg5);
        } else {
            class299.method1995(arg0, arg5, (byte) 76, arg4, arg1, arg7, arg6, arg3);
        }
        int var8 = -117 % ((41 - arg2) / 34);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 30)
    public static final void method720(int arg0) {
        field1720++;
        if (arg0 != 28203) {
            method721(-65, 45, 24, -8);
        }
        if (class289.field4760[98]) {
            class220.field3528 += (12 - class220.field3528) / 2;
        } else if (class289.field4760[99]) {
            class220.field3528 += (-class220.field3528 - 12) / 2;
        } else {
            class220.field3528 /= 2;
        }
        if (class289.field4760[96]) {
            class152.field2423 += (-class152.field2423 - 24) / 2;
        } else if (class289.field4760[97]) {
            class152.field2423 += (24 - class152.field2423) / 2;
        } else {
            class152.field2423 /= 2;
        }
        class4.field114 += class220.field3528 / 2;
        class140.field2253 += class152.field2423 / 2;
        int var1 = class111.field1706 + class124.field1917.field4991;
        int var2 = class217.field3497 + class124.field1917.field4949;
        if (class273.field4486 - var2 < -500 || (class273.field4486 - var2) > 500 || class295.field4890 - var1 < -500 || class295.field4890 - var1 > 500) {
            class273.field4486 = var2;
            class295.field4890 = var1;
        }
        if (class295.field4890 != var1) {
            class295.field4890 += (var1 - class295.field4890) / 16;
        }
        if (class273.field4486 != var2) {
            class273.field4486 += (var2 - class273.field4486) / 16;
        }
        class93.method637((byte) -110);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V", line = 79)
    public static final void method721(int arg0, int arg1, int arg2, int arg3) {
        field1721++;
        class134 var4 = class171.method1083(arg3, arg1, arg0 + 110);
        if (var4 != null && var4.field2025 != null) {
            class1 var5 = new class1();
            var5.field8 = var4;
            var5.field14 = var4.field2025;
            class184.method1170(var5, arg0 + 105);
        }
        class114.field1725 = true;
        class205.field3249 = arg2;
        class44.field655 = arg1;
        class20.field289 = arg3;
        class26.method194(var4, arg0 - 94);
        if (arg0 != 16) {
            field1719 = 24;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lhl;IIIIIIIZ)V", line = 124)
    public static final void method722(class37 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class89.field1373;
        int var11;
        int var12 = var11 = (arg7 << 7) - class208.field3314;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class57.field926[arg1][arg6][arg7] - class220.field3527;
        int var18 = class57.field926[arg1][arg6 + 1][arg7] - class220.field3527;
        int var19 = class57.field926[arg1][arg6 + 1][arg7 + 1] - class220.field3527;
        int var20 = class57.field926[arg1][arg6][arg7 + 1] - class220.field3527;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class284.field4700;
        int var46 = (var24 << 9) / var25 + class284.field4697;
        int var47 = (var27 << 9) / var31 + class284.field4700;
        int var48 = (var30 << 9) / var31 + class284.field4697;
        int var49 = (var33 << 9) / var37 + class284.field4700;
        int var50 = (var36 << 9) / var37 + class284.field4697;
        int var51 = (var39 << 9) / var43 + class284.field4700;
        int var52 = (var42 << 9) / var43 + class284.field4697;
        class284.field4689 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0 && class4.field121 && class195.method1254(class49.field761 + class284.field4700, class284.field4697 + class241.field3874, var50, var52, var48, var49, var51, var47)) {
            class56.field917 = arg6;
            class110.field1682 = arg7;
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0 && class4.field121 && class195.method1254(class49.field761 + class284.field4700, class284.field4697 + class241.field3874, var46, var48, var52, var45, var47, var51)) {
            class56.field917 = arg6;
            class110.field1682 = arg7;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lva;Lva;IZ)V", line = 226)
    public class113(class36 arg0, class36 arg1, int arg2, boolean arg3) {
        class156 var5 = new class156();
        int var6 = arg0.method263(arg2, 100);
        this.field1722 = new class165[var6];
        int[] var7 = arg0.method281(arg2, -1);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method261(-1, arg2, var7[var8]);
            int var10 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            class5 var11 = (class5) var5.method995(1836596936);
            class5 var12 = null;
            while (var11 != null) {
                if (var11.field135 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class5) var5.method996(0);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method262(0, var10, true);
                } else {
                    var13 = arg1.method262(var10, 0, true);
                }
                var12 = new class5(var10, var13);
                var5.method999(var12, (byte) -108);
            }
            this.field1722[var7[var8]] = new class165(var9, var12);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 285)
    public static void method723(int arg0) {
        if (arg0 < -33) {
            field1723 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z", line = 295)
    public final boolean method724(int arg0, int arg1) {
        field1718++;
        int var3 = 71 % ((-arg0 - 56) / 44);
        return this.field1722[arg1].field2609;
    }
}
