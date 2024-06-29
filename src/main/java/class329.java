import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class329 extends class326 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[Lod;")
    public static class233[] field5377 = new class233[32768];

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field5385 = 1;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "F")
    public static float field5380;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lkl;")
    public static class39 field5388;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 6)
    public static void method2343(byte arg0) {
        field5377 = null;
        field5388 = null;
        if (arg0 > -34) {
            field5380 = 0.2521398F;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 20)
    public static final String method2344(int arg0, long arg1) {
        field5383++;
        return arg0 == 2 ? class267.method1884(arg0 - 65539, arg1) : (String) null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ)V", line = 32)
    public static final void method2345(int arg0, int arg1, boolean arg2) {
        field5379++;
        if (class269.field4427 == 2) {
            class147.field2369 = arg1;
            class54.field817 = arg0;
        }
        class285.field4676 = (float) arg0;
        class355.field5628 = (float) arg1;
        class126.method819(arg2);
        class58.field884 = true;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)V", line = 53)
    public static final void method2346(int arg0, byte arg1) {
        class211 var2 = class17.method115(3, arg0, 4086);
        field5384++;
        if (arg1 >= 37) {
            var2.method1435((byte) -2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)I", line = 65)
    public static final int method2347(int arg0, byte arg1) {
        field5387++;
        int var7 = arg0 - 1;
        if (arg1 != -96) {
            method2347(19, (byte) 123);
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V", line = 91)
    public static final void method2348(byte arg0) {
        field5376++;
        int var1 = class31.field471.method1216(class242.field3821);
        for (int var2 = 0; var2 < class117.field1701; var2++) {
            int var3 = class31.field471.method1216(client.method895(var2, 27003));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        int var4 = class117.field1701 * 15 + 21;
        var1 += 8;
        int var5 = class39.field595;
        if (var4 + var5 > class243.field3838) {
            var5 = class243.field3838 - var4;
        }
        int var6 = class138.field2181 - var1 / 2;
        if (class233.field3712 < (var1 + var6)) {
            var6 = class233.field3712 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (arg0 > -104) {
            return;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class148.field2396 == 1) {
            if (class138.field2181 == class107.field1533 && class39.field595 == class267.field4401) {
                class53.field800 = var6;
                class286.field4681 = true;
                class265.field4362 = (class98.field1408 ? 26 : 22) + class117.field1701 * 15;
                class235.field3732 = var1;
                class148.field2396 = 0;
                class2.field7 = var5;
            }
        } else if (class241.field3777 == class138.field2181 && class69.field1074 == class39.field595) {
            class235.field3732 = var1;
            class53.field800 = var6;
            class286.field4681 = true;
            class2.field7 = var5;
            class148.field2396 = 0;
            class265.field4362 = (class98.field1408 ? 26 : 22) + class117.field1701 * 15;
        } else {
            class267.field4401 = class69.field1074;
            class107.field1533 = class241.field3777;
            class148.field2396 = 1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIII)I", line = 197)
    public static final int method2349(byte arg0, int arg1, int arg2, int arg3) {
        field5381++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else {
            if (arg0 != -66) {
                field5388 = (class39) null;
            }
            return var4 == 2 ? 1023 - arg3 : arg2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V", line = 218)
    public static final void method2350(int arg0, boolean arg1) {
        field5386++;
        if (arg1) {
            field5388 = (class39) null;
        }
        class141.field2271.method645(arg0, (byte) -127);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(IB)V", line = 230)
    public static final void method2351(int arg0, byte arg1) {
        class111.field1645.method645(arg0, (byte) -102);
        field5382++;
        if (arg1 == 101) {
            class207.field3155.method645(arg0, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 247)
    public static final void method2352(int arg0) {
        field5378++;
        if (arg0 == 1) {
            class268.field4419.method644((byte) -110);
        }
    }
}
