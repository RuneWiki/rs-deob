import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "J")
    public static long field248 = -1L;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "[Loia;")
    public static class88[] field250;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I", line = 7)
    public static final int method82(int arg0) {
        field246++;
        if (class557.field7812.field6533.method3946(false) == 0) {
            for (int var1 = 0; var1 < class101.field1206; var1++) {
                if (class462.field6504[var1].method697(arg0 ^ 0x1039) == 's' || class462.field6504[var1].method697(4152) == 'S') {
                    class557.field7812.method2755(249682952, 1, class557.field7812.field6533);
                    class451.field6387 = true;
                    break;
                }
            }
        }
        if (class577.field8147 == class252.field3663) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class479.method2864((byte) -43);
            if (class69.field855 == 0L) {
                class69.field855 = var4;
            }
            if (var3 > 16384 && (var4 - class69.field855) < 5000L) {
                if (var4 - class589.field8307 > 1000L) {
                    System.gc();
                    class589.field8307 = var4;
                }
                return 0;
            }
        }
        if (class577.field8147 == class252.field3668) {
            if (class371.field5219 == null) {
                class371.field5219 = new class261(class25.field349, class729.field10187, class220.field2878, class10.field217);
            }
            if (!class371.field5219.method1710(65)) {
                return 0;
            }
            class383.method2429(0, (byte) -58, true, null);
            class453.field6401 = !class509.method3007(-15377);
            class573.field8110 = class61.method524(class453.field6401 ? 34 : 32, 5, false, 1);
            class745.field10359 = class61.method524(33, 5, false, 1);
            class405.field5725 = class61.method524(13, 5, false, 1);
        }
        if (class577.field8147 == class252.field3669) {
            boolean var6 = class745.field10359.method2086(-7296);
            int var7 = class422.field5960[33].method4068((byte) -125);
            int var8 = var7 + class422.field5960[class453.field6401 ? 34 : 32].method4068((byte) -126);
            int var9 = var8 + class422.field5960[13].method4068((byte) -128);
            int var10 = var9 + (var6 ? 100 : class745.field10359.method2082(0));
            if (var10 != 400) {
                return var10 / 4;
            }
            class348.field4922 = class573.field8110.method2095(126);
            class202.field2651 = class745.field10359.method2095(-106);
            class392.method2464(false, class573.field8110);
            int var11 = class557.field7812.field6518.method982(false);
            class251.field3409 = new class441(class633.field8733, class549.field7669, class745.field10359);
            int[] var12 = class251.field3409.method2661(var11, (byte) 79);
            if (var12.length == 0) {
                var12 = class251.field3409.method2661(0, (byte) 79);
            }
            class626 var13 = new class626(class573.field8110, class405.field5725);
            if (var12.length > 0) {
                class400.field5668 = new class708[var12.length];
                for (int var14 = 0; var14 < class400.field5668.length; var14++) {
                    class400.field5668[var14] = new class32(class251.field3409.method2658(var12[var14], 1), var13);
                }
            }
        }
        if (class577.field8147 == class252.field3670) {
            class136.method971(458752, class701.method3949(63), class405.field5725, class573.field8110);
        }
        if (class577.field8147 == class252.field3671) {
            int var15 = class429.method2620(1);
            int var16 = class622.method3498(-2);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class577.field8147 == class252.field3672) {
            if (class400.field5668 != null && class400.field5668.length > 0) {
                if (class400.field5668[0].method184(-73) < 100) {
                    return 0;
                }
                if (class400.field5668.length > 1 && class251.field3409.method2660(arg0 ^ 0xFFFFA8AB) && class400.field5668[1].method184(-111) < 100) {
                    return 0;
                }
            }
            class42.method278(255, class268.field3831);
            class84.method644(class268.field3831, (byte) -93);
            class60.method514(false, 1);
        }
        if (class577.field8147 == class252.field3673) {
            for (int var17 = 0; var17 < 4; var17++) {
                class147.field2114[var17] = class412.method2535(class336.field4683, class700.field9768, (byte) 96);
            }
        }
        if (class577.field8147 == class252.field3674) {
            class374.field5245 = class61.method524(8, 5, false, 1);
            class210.field2772 = class61.method524(0, 5, false, 1);
            class608.field8562 = class61.method524(1, arg0 + 4, false, 1);
            class580.field8187 = class61.method524(2, 5, false, 1);
            class705.field9810 = class61.method524(3, 5, false, 1);
            class727.field10173 = class61.method524(4, 5, false, 1);
            class299.field4218 = class61.method524(5, arg0 ^ 0x4, true, 1);
            class587.field8276 = class61.method524(6, arg0 + 4, true, 1);
            class626.field8695 = class61.method524(7, 5, false, 1);
            class549.field7671 = class61.method524(9, 5, false, 1);
            class228.field3062 = class61.method524(10, 5, false, 1);
            class120.field1447 = class61.method524(11, arg0 ^ 0x4, false, 1);
            class164.field2255 = class61.method524(12, 5, false, 1);
            class530.field7473 = class61.method524(14, 5, false, 1);
            class184.field2495 = class61.method524(15, 5, false, 1);
            class236.field3172 = class61.method524(16, 5, false, 1);
            class211.field2784 = class61.method524(17, 5, false, 1);
            class360.field5104 = class61.method524(18, 5, false, 1);
            class48.field567 = class61.method524(19, 5, false, 1);
            class476.field6761 = class61.method524(20, arg0 ^ 0x4, false, 1);
            class119.field1444 = class61.method524(21, 5, false, 1);
            class467.field6617 = class61.method524(22, 5, false, 1);
            class662.field9065 = class61.method524(23, arg0 + 4, true, 1);
            class318.field4413 = class61.method524(24, 5, false, 1);
            class511.field7311 = class61.method524(25, arg0 ^ 0x4, false, 1);
            class52.field592 = class61.method524(26, 5, true, 1);
            class606.field8527 = class61.method524(27, 5, false, 1);
            class456.field6432 = class61.method524(28, 5, true, 1);
            class488.field6898 = class61.method524(29, arg0 + 4, false, 1);
            class571.field8097 = class61.method524(30, arg0 + 4, true, 1);
            class452.field6395 = class61.method524(31, arg0 ^ 0x4, true, 1);
            class94.field1106 = class61.method524(36, 5, true, 2);
        }
        if (class577.field8147 == class252.field3675) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class422.field5960[var19] != null) {
                    var18 += class422.field5960[var19].method4068((byte) -125) * class419.field5915[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class642.field8797 < 0) {
                    class642.field8797 = var18;
                }
                return (var18 - class642.field8797) * 100 / (100 - class642.field8797);
            }
            class734.method4107(class374.field5245, -13903);
            class136.method971(458752, class701.method3949(-55), class405.field5725, class374.field5245);
        }
        if (class577.field8147 == class252.field3676) {
            if (class147.field2116 == -1) {
                class147.field2116 = class587.field8276.method2090(126, "scape main");
            }
            class393.method2471((byte) -97);
            class60.method514(false, 2);
        }
        if (class577.field8147 == class252.field3677) {
            class230.method1493(class571.field8097, true, class202.field2644);
        }
        if (class577.field8147 == class252.field3678) {
            int var20 = class514.method3025(-102);
            if (var20 < 100) {
                return var20;
            }
            class559.method3219((byte) -80, class456.field6432.method2108(1, 0));
            class35.method199(class456.field6432.method2108(3, 0), 16143);
        }
        if (arg0 != 1) {
            method84(123);
        }
        if (class577.field8147 == class252.field3679) {
            if (class94.field1104 != -1 && !class626.field8695.method2097((byte) -122, class94.field1104, 0)) {
                return 99;
            }
            class665.field9066 = new class62(class52.field592, class549.field7671, class374.field5245);
            class605.field8497 = new class25(class633.field8733, class549.field7669, class580.field8187);
            class200.field2638 = new class625(class633.field8733, class549.field7669, class580.field8187);
            class30.field404 = new class687(class633.field8733, class549.field7669, class580.field8187, class374.field5245);
            class116.field1416 = new class291(class633.field8733, class549.field7669, class211.field2784);
            class470.field6672 = new class111(class633.field8733, class549.field7669, class580.field8187);
            class181.field2416 = new class337(class633.field8733, class549.field7669, class580.field8187);
            class606.field8530 = new class307(class633.field8733, class549.field7669, class580.field8187, class626.field8695);
            class237.field3177 = new class117(class633.field8733, class549.field7669, class580.field8187);
            class538.field7542 = new class36(class633.field8733, class549.field7669, class580.field8187);
            class612.field8588 = new class67(class633.field8733, class549.field7669, true, class236.field3172, class626.field8695);
            class569.field8079 = new class530(class633.field8733, class549.field7669, class580.field8187, class374.field5245);
            class48.field564 = new class226(class633.field8733, class549.field7669, class580.field8187, class374.field5245);
            class231.field3110 = new class469(class633.field8733, class549.field7669, true, class360.field5104, class626.field8695);
            class682.field9361 = new class607(class633.field8733, class549.field7669, true, class605.field8497, class48.field567, class626.field8695);
            class70.field890 = new class195(class633.field8733, class549.field7669, class580.field8187);
            class343.field4785 = new class633(class633.field8733, class549.field7669, class476.field6761, class210.field2772, class608.field8562);
            class192.field2556 = new class302(class633.field8733, class549.field7669, class580.field8187);
            class6.field64 = new class677(class633.field8733, class549.field7669, class580.field8187);
            class220.field2879 = new class138(class633.field8733, class549.field7669, class119.field1444, class626.field8695);
            class116.field1417 = new class222(class633.field8733, class549.field7669, class580.field8187);
            class523.field7405 = new class72(class633.field8733, class549.field7669, class580.field8187);
            class563.field7895 = new class436(class633.field8733, class549.field7669, class580.field8187);
            class130.field1568 = new class30(class633.field8733, class549.field7669, class467.field6617);
            class472.field6696 = new class720(class633.field8733, class549.field7669, class580.field8187);
            class603.method3388(class626.field8695, class405.field5725, class374.field5245, class705.field9810, arg0 ^ 0xFFFFFFFE);
            class401.method2506(7, class488.field6898);
            class371.field5218 = new class141(class549.field7669, class318.field4413, class511.field7311);
            class5.field50 = new class591(class549.field7669, class318.field4413, class511.field7311, new class617());
            class43.method288(false);
            class612.field8588.method550(0, class557.field7812.field6532.method1419(false) == 0);
            class101.field1201 = new class305();
            class43.method289((byte) -123);
            class90.method682((byte) 82, class606.field8527);
            class210.method1295(class626.field8695, (byte) -112, class665.field9066);
            class681 var21 = new class681(class228.field3062.method2102("huffman", "", 0));
            class274.method1781(var21, 112);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class145.field2086 = class170.method1100((byte) -127);
            class470.field6666 = new class393(true, class202.field2644);
        }
        if (class577.field8147 == class252.field3681) {
            int var22 = class673.method3678(class374.field5245, -110) + class114.method799(-68, true);
            int var23 = class488.method2919(10) + class622.method3498(-2);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class577.field8147 == class252.field3682) {
            class678.method3784(class662.field9065, class470.field6672, class181.field2416, class612.field8588, class569.field8079, class48.field564, class101.field1201);
        }
        if (class577.field8147 == class252.field3683) {
            class718.field9975 = new int[class563.field7895.field6188];
            class538.field7548 = new boolean[class563.field7895.field6188];
            class492.field6941 = new String[class523.field7405.field964];
            for (int var24 = 0; var24 < class563.field7895.field6188; var24++) {
                if (class563.field7895.method2641(var24, false).field6422 == 0) {
                    class538.field7548[var24] = true;
                    class631.field8721++;
                }
                class718.field9975[var24] = -1;
            }
            class14.method90((byte) 55);
            class450.field6384 = class705.field9810.method2090(-48, "loginscreen");
            class258.field3728 = class705.field9810.method2090(arg0 - 43, "lobbyscreen");
            class299.field4218.method2092(true, 0, false);
            class587.field8276.method2092(true, 0, true);
            class374.field5245.method2092(true, 0, true);
            class405.field5725.method2092(true, 0, true);
            class228.field3062.method2092(true, 0, true);
            class705.field9810.method2092(true, 0, true);
            class48.field570 = true;
            class580.field8187.field4496 = 2;
            class211.field2784.field4496 = 2;
            class236.field3172.field4496 = 2;
            class360.field5104.field4496 = 2;
            class48.field567.field4496 = 2;
            class476.field6761.field4496 = 2;
            class119.field1444.field4496 = 2;
        }
        if (class577.field8147 == class252.field3684) {
            if (!class393.method2476(88, class450.field6384)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class37.field475[class450.field6384].length; var26++) {
                class493 var27 = class37.field475[class450.field6384][var26];
                if (var27.field7016 == 5 && var27.field7029 != -1 && !class374.field5245.method2097((byte) -111, var27.field7029, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class577.field8147 == class252.field3685) {
            class202.method1229(true, (byte) -128);
        }
        if (class577.field8147 == class252.field3686) {
            class268.field3824.method3990((byte) -124);
            try {
                class461.field6497.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class461.field6497 = null;
            class400.field5668 = null;
            class251.field3409 = null;
            class745.field10359 = null;
            class268.field3824 = null;
            class573.field8110 = null;
            class412.method2536(-109);
            class105.field1269 = class557.field7812.field6533.method3946(false) == 1;
            class557.field7812.method2755(249682952, 1, class557.field7812.field6533);
            if (class105.field1269) {
                class557.field7812.method2755(249682952, 0, class557.field7812.field6555);
            } else if (class557.field7812.field6555.field5862 && class470.field6666.field5558 < 512 && class470.field6666.field5558 != 0) {
                class557.field7812.method2755(249682952, 0, class557.field7812.field6555);
            }
            class90.method681(arg0 + 10342);
            if (class105.field1269) {
                class759.method4212(false, 0, 0);
            } else {
                class759.method4212(false, 0, class557.field7812.field6555.method2556(false));
            }
            class342.method2214(3, false, class557.field7812.field6551.method290(false), -1, -1);
            class42.method278(arg0 ^ 0xFE, class268.field3831);
            class84.method644(class268.field3831, (byte) 34);
            class705.method3965(class268.field3831, false, class374.field5245);
            class586.method3325(class716.field9948, -120);
        }
        return class488.method2916(26908);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILlh;)V", line = 455)
    public static final void method83(int arg0, int arg1, int arg2, class526 arg3) {
        class165 var4 = class307.method2008(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field2266 = arg3;
        int var5 = class459.field6474 == class135.field1969 ? 1 : 0;
        if (arg3.method746(-124)) {
            if (arg3.method751(false)) {
                arg3.field1251 = class373.field5234[var5];
                class373.field5234[var5] = arg3;
                return;
            }
            arg3.field1251 = class710.field9861[var5];
            class710.field9861[var5] = arg3;
            class230.field3098 = true;
            return;
        }
        arg3.field1251 = class321.field4433[var5];
        class321.field4433[var5] = arg3;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 494)
    public static void method84(int arg0) {
        field250 = null;
        if (arg0 != -12320) {
            method82(-64);
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 503)
    public class13(String arg0, int arg1) {
        this.field247 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "toString", descriptor = "()Ljava/lang/String;", line = 514)
    public final String toString() {
        field249++;
        throw new IllegalStateException();
    }
}
