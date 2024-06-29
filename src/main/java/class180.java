import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class180 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lwn;")
    public static class30 field2858 = new class30();

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2862 = 100;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[I")
    public static int[] field2869 = new int[50];

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lwn;")
    public static class30 field2865 = new class30();

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2870 = " is already on your friend list.";

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Lpk;")
    public static class120 field2864;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
    public static int[] field2867;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method1318(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 93) {
            field2862 = 103;
        }
        field2868++;
        class170 var5 = class221.method1613(10, arg4, -8410);
        var5.method1269(false);
        var5.field2737 = arg3;
        var5.field2734 = arg1;
        var5.field2730 = arg2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;", line = 24)
    public static final String[] method1319(byte arg0, String[] arg1) {
        String[] var2 = new String[5];
        field2866++;
        if (arg0 <= 28) {
            method1319((byte) 54, (String[]) null);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)[Lp;", line = 60)
    public static final class108[] method1320(int arg0) {
        field2860++;
        if (arg0 != 15135) {
            return (class108[]) null;
        }
        if (class195.field3019 == null) {
            class108[] var1 = class139.method1069(class92.field1484, arg0 - 15135);
            int var2 = 0;
            class108[] var3 = new class108[var1.length];
            label55: for (int var4 = 0; var4 < var1.length; var4++) {
                class108 var5 = var1[var4];
                if ((var5.field1760 <= 0 || var5.field1760 >= 24) && var5.field1765 >= 800 && var5.field1768 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class108 var7 = var3[var6];
                        if (var5.field1765 == var7.field1765 && var5.field1768 == var7.field1768) {
                            if (var5.field1760 > var7.field1760) {
                                var3[var6] = var5;
                            }
                            continue label55;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class195.field3019 = new class108[var2];
            class330.method2308(var3, 0, class195.field3019, 0, var2);
            int[] var8 = new int[class195.field3019.length];
            for (int var9 = 0; var9 < class195.field3019.length; var9++) {
                class108 var10 = class195.field3019[var9];
                var8[var9] = var10.field1768 * var10.field1765;
            }
            class293.method2057(class195.field3019, (byte) 116, var8);
        }
        return class195.field3019;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V", line = 143)
    public static final void method1321(int arg0, int arg1, int arg2) {
        class170 var3 = class221.method1613(13, arg0, -8410);
        field2861++;
        var3.method1269(false);
        int var4 = 125 % ((-arg2 - 23) / 46);
        var3.field2730 = arg1;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 177)
    public static void method1322(int arg0) {
        if (arg0 != 0) {
            field2863 = -64;
        }
        field2858 = null;
        field2869 = null;
        field2864 = null;
        field2870 = null;
        field2865 = null;
        field2867 = null;
    }
}
