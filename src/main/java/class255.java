import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class255 {

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3810 = 0;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Laa;")
    public static class36 field3805 = new class36();

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Laj;")
    public static class210 field3806;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
    public static int[] field3804;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "[[[I")
    public static int[][][] field3815;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1869(int arg0) {
        if (arg0 != 21373) {
            method1871(35);
        }
        field3808++;
        if (class73.field1070 == null) {
            return;
        }
        class2 var1 = new class2();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class73.field1070[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 42)
    public static final void method1870(byte arg0) {
        if (arg0 > -24) {
            method1875(-57, -57, -43);
        }
        field3813++;
        if (!class356.field5459 && class14.field214 != 2) {
            try {
                class114.method858("tbrefresh", (byte) -67, class300.field4493);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 63)
    public static void method1871(int arg0) {
        if (arg0 != -32283) {
            method1871(111);
        }
        field3805 = null;
        field3815 = (int[][][]) null;
        field3804 = null;
        field3806 = null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)Lgd;", line = 79)
    public static final class180 method1872(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2407; var4++) {
            class180 var5 = var3.field2406[var4];
            if ((var5.field2585 >> 29 & 0x3L) == 2L && var5.field2590 == arg1 && var5.field2580 == arg2) {
                class265.method1963(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IIJI)Ljava/lang/String;", line = 107)
    public static final String method1873(int[] arg0, int arg1, long arg2, int arg3) {
        field3811++;
        if (class64.field941 != null) {
            String var5 = class64.field941.method975(arg2, 256, arg0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg1 != -32121) {
            field3810 = 11;
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)I", line = 131)
    public static final int method1874(byte arg0) {
        if (arg0 == -8) {
            field3807++;
            return 14;
        } else {
            return -20;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(III)V", line = 143)
    public static final void method1875(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class252.field3748; var3++) {
            for (int var4 = 0; var4 < class18.field295; var4++) {
                for (int var5 = 0; var5 < class146.field2109; var5++) {
                    class167 var6 = class302.field4502[var3][var4][var5];
                    if (var6 != null) {
                        class11 var7 = var6.field2387;
                        if (var7 != null && var7.field165.method390()) {
                            class54.method444(var7.field165, var3, var4, var5, 1, 1);
                            if (var7.field174 != null && var7.field174.method390()) {
                                class54.method444(var7.field174, var3, var4, var5, 1, 1);
                                var7.field165.method386(var7.field174, 0, 0, 0, false);
                                var7.field174 = var7.field174.method404(arg0, arg1, arg2);
                            }
                            var7.field165 = var7.field165.method404(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2407; var8++) {
                            class180 var9 = var6.field2406[var8];
                            if (var9 != null && var9.field2591.method390()) {
                                class54.method444(var9.field2591, var3, var4, var5, var9.field2581 + 1 - var9.field2590, var9.field2601 - var9.field2580 + 1);
                                var9.field2591 = var9.field2591.method404(arg0, arg1, arg2);
                            }
                        }
                        class85 var10 = var6.field2390;
                        if (var10 != null && var10.field1202.method390()) {
                            class359.method2498(var10.field1202, var3, var4, var5);
                            var10.field1202 = var10.field1202.method404(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V", line = 212)
    public class255(int arg0, int arg1, int arg2) {
        this.field3812 = arg2;
        this.field3803 = arg0;
        this.field3809 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V")
    public abstract void method701(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
    public abstract void method699(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V")
    public abstract void method703(int arg0, int arg1, int arg2);
}
