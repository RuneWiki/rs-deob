import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class295 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Luc;")
    public static class51 field4442 = new class51(30);

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4451 = "Opened title screen";

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field4448 = -1;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Luc;")
    public static class51 field4449 = new class51(2);

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[[I")
    public static int[][] field4455 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field4457 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Ll;")
    public static class315 field4450;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field4458;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1996(String arg0, byte arg1) {
        field4445++;
        class20.method181(0, 0, arg0, "", 9231, "");
        if (arg1 != -62) {
            field4454 = 85;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BZ)V")
    public static final void method1997(byte arg0, boolean arg1) {
        field4446++;
        if (arg0 <= 56) {
            method2004(-62, -62, -54);
        }
        class264.method1766(8);
        if (class381.field5579 != 30 && class381.field5579 != 25) {
            return;
        }
        class350.field5207++;
        if (class350.field5207 < 50 && !arg1) {
            return;
        }
        class350.field5207 = 0;
        if (!class40.field620 && class290.field4380 != null) {
            class423.field6146++;
            class140.field1797.method1833(-20379, 135);
            try {
                class290.field4380.method2365(class140.field1797.field5042, class140.field1797.field5049, 5000, 0);
                class140.field1797.field5049 = 0;
            } catch (IOException var2) {
                class40.field620 = true;
            }
        }
        class264.method1766(8);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method1998(byte arg0) {
        field4451 = null;
        field4442 = null;
        field4449 = null;
        field4450 = null;
        field4455 = null;
        if (arg0 >= -63) {
            field4450 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILvo;)V")
    public static final void method1999(int arg0, class316 arg1) {
        field4443++;
        if (class106.field1405 == null) {
            return;
        }
        class56 var2 = null;
        if (arg1.field4622 == 0) {
            var2 = (class56) class57.method421(arg1.field4621, arg1.field4628, arg1.field4630);
        }
        if (arg0 > -36) {
            return;
        }
        if (arg1.field4622 == 1) {
            var2 = (class56) class235.method1526(arg1.field4621, arg1.field4628, arg1.field4630);
        }
        if (arg1.field4622 == 2) {
            var2 = (class56) class31.method243(arg1.field4621, arg1.field4628, arg1.field4630, field4458 == null ? (field4458 = method2005("lk")) : field4458);
        }
        if (arg1.field4622 == 3) {
            var2 = (class56) class104.method792(arg1.field4621, arg1.field4628, arg1.field4630);
        }
        if (var2 == null) {
            arg1.field4635 = 0;
            arg1.field4631 = 0;
            arg1.field4632 = -1;
        } else {
            arg1.field4632 = var2.method116(24186);
            arg1.field4631 = var2.method122((byte) -109);
            arg1.field4635 = var2.method121(28024);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static final void method2000(byte arg0) {
        int var1 = -94 % ((9 - arg0) / 62);
        field4441++;
        class398.field5839.method366(-90);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static final void method2001(boolean arg0) {
        if (!arg0) {
            method2004(94, -31, -16);
        }
        if (class20.field337 != -1) {
            class69.method580(class20.field337, -1, -1, 105, false);
            class20.field337 = -1;
        }
        field4447++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
    public static final void method2002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4444++;
        class440 var5 = class186.method1241(arg1, arg3, (byte) 56);
        var5.method2756(-1369656528);
        var5.field6374 = arg2;
        var5.field6375 = arg4;
        var5.field6379 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ltj;IILug;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method2003(class298 arg0, int arg1, int arg2, class118 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class185.field2528 = arg0;
        class372.field5487 = arg1;
        class112.field1442 = arg3;
        class46.field697 = class185.field2528.method495() > 0;
        class167.field2261 = arg4 >> 7;
        class437.field6352 = arg6 >> 7;
        class193.field2684 = arg4;
        class447.field6430 = arg6;
        class217.field3029 = arg5;
        class396.field5788 = class167.field2261 - class251.field3687;
        if (class396.field5788 < 0) {
            class72.field1028 = -class396.field5788;
            class396.field5788 = 0;
        } else {
            class72.field1028 = 0;
        }
        class427.field6217 = class437.field6352 - class251.field3687;
        if (class427.field6217 < 0) {
            class320.field4749 = -class427.field6217;
            class427.field6217 = 0;
        } else {
            class320.field4749 = 0;
        }
        class74.field1043 = class251.field3687 + class167.field2261;
        if (class74.field1043 > class108.field1421) {
            class74.field1043 = class108.field1421;
        }
        class154.field1957 = class437.field6352 + class251.field3687;
        if (class154.field1957 > class186.field2554) {
            class154.field1957 = class186.field2554;
        }
        for (int var18 = 0; var18 < class251.field3687 + class251.field3687 + 2; var18++) {
            for (int var23 = 0; var23 < class251.field3687 + class251.field3687 + 2; var23++) {
                int var24 = class167.field2261 + var18 - class251.field3687;
                int var25 = class437.field6352 + var23 - class251.field3687;
                if (var24 >= 0 && var25 >= 0 && var24 < class108.field1421 && var25 < class186.field2554) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class142.field1804[3].method722(var24, var25) - 1000;
                    int var29 = class370.field5469 == null ? class142.field1804[0].method722(var24, var25) + 128 : class370.field5469[0].method722(var24, var25) + 128;
                    class349.field5191[var18][var23] = class185.field2528.method432(var26, var28, var27, var26, var29, var27);
                } else {
                    class349.field5191[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class251.field3687 + class251.field3687 + 1; var19++) {
            for (int var22 = 0; var22 < class251.field3687 + class251.field3687 + 1; var22++) {
                class277.field4069[var19][var22] = class349.field5191[var19][var22] || class349.field5191[var19 + 1][var22] || class349.field5191[var19][var22 + 1] || class349.field5191[var19 + 1][var22 + 1];
            }
        }
        class384.field5619 = arg8;
        class241.field3373 = arg9;
        class47.field710 = arg10;
        class428.field6227 = arg11;
        class21.field394 = arg12;
        class165.method1112();
        class167.method1125((byte) -21);
        for (class372 var20 = (class372) class308.field4573.method54((byte) 18); var20 != null; var20 = (class372) class308.field4573.method53((byte) 123)) {
            var20.method2308(-26);
            class360.method2368(var20, -70);
        }
        if (class46.field697) {
            for (int var21 = 0; var21 < class197.field2720; var21++) {
                class280.field4131[var21].method562(arg1, arg17, (byte) 79);
            }
        }
        if (arg2 > 1) {
            class185.field2528.method494(0);
            if (class395.field5742 == null || class395.field5742 instanceof class192) {
                class395.field5742 = new class415();
            }
        } else if (class395.field5742 == null || class395.field5742 instanceof class415) {
            class395.field5742 = new class192();
        }
        class395.field5742.method1281(82, arg2);
        class395.field5742.method1279(8192);
        if (class197.field2727 != null) {
            class325.method2128(true);
            class395.field5742.method1278(-9877, 22);
            class216.method1425(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class395.field5742.method1279(8192);
            class395.field5742.method1278(-9877, 23);
            class325.method2128(false);
        }
        class216.method1425(arg2, arg7, arg13, arg14, arg15, arg16);
        class395.field5742.method1279(8192);
        class395.field5742.method1283(124);
        class395.field5742.method1279(8192);
        if (arg2 > 1) {
            class185.field2528.method527(0);
        }
        class185.field2528.method505(0, (class16[]) null);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    public static final void method2004(int arg0, int arg1, int arg2) {
        field4452++;
        class453 var3 = new class453(16);
        if (arg2 > -63) {
            return;
        }
        for (class171 var4 = (class171) class267.field3962.method2812(15710); var4 != null; var4 = (class171) class267.field3962.method2819((byte) 79)) {
            var4.method2632(true);
            int var5 = (int) (var4.field6091 >> 28);
            int var6 = (int) (var4.field6091 >> 14 & 0x3FFFL) - arg1;
            int var7 = (int) (var4.field6091 & 0x3FFFL) - arg0;
            if (var7 >= 0 && var6 >= 0 && class351.field5217 > var7 && class143.field1815 > var6) {
                var3.method2815(-1, (long) (var6 << 14 | var5 << 28 | var7), var4);
            }
        }
        class267.field3962 = var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2005(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
