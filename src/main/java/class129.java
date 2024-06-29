import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class129 extends class285 {

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "[B")
    public byte[] field2132;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "Lve;")
    public static class255 field2134 = class87.method607(36, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "Lve;")
    public static class255 field2127 = class87.method607(45, "<col=ffffff>");

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "Lve;")
    public static class255 field2128 = class87.method607(68, "cookiehost");

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "S")
    public static short field2125 = 320;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "Lve;")
    public static class255 field2139 = class87.method607(46, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "J")
    public static long field2137;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "[Ldm;")
    public static class273[] field2126;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZI)V", line = 6)
    public static final void method952(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2134 = (class255) null;
        }
        field2138++;
        class53 var3 = class303.method2112(-1155040160, arg2, 7);
        var3.method325((byte) 123);
        var3.field824 = arg0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 35)
    public static final void method953(int arg0, int arg1) {
        if (arg1 == -129) {
            field2131++;
            class301.field5142.method562((byte) 62, arg0);
            class300.field5108.method562((byte) 52, arg0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([B)V", line = 56)
    public class129(byte[] arg0) {
        this.field2132 = arg0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V", line = 70)
    public static final void method954(boolean arg0) {
        int[] var1 = new int[class137.field2289];
        int var2 = 0;
        for (int var3 = 0; var3 < class137.field2289; var3++) {
            class192 var4 = class132.method990((byte) -119, var3);
            if (var4.field3057 >= 0 || var4.field3115 >= 0) {
                var1[var2++] = var3;
            }
        }
        class147.field2497 = new int[var2];
        field2135++;
        if (!arg0) {
            field2136 = -112;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            class147.field2497[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V", line = 107)
    public static void method955(int arg0) {
        field2134 = null;
        field2139 = null;
        field2127 = null;
        if (arg0 != 1) {
            method953(-102, 96);
        }
        field2126 = null;
        field2128 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZII)V", line = 121)
    public static final void method956(boolean arg0, int arg1, int arg2) {
        field2130++;
        short var3 = 256;
        if (class277.field4764 > 0) {
            class103.method791(51, class277.field4764);
            class277.field4764 = 0;
        }
        int var4 = 0;
        int var5 = class175.field2890 * arg2;
        int var6 = 0;
        int var7 = 1;
        if (arg0) {
            field2125 = 32;
        }
        while (var7 < var3 - 1) {
            int var8 = (var3 - var7) * class160.field2711[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class67.field993[var4++];
                int var11 = class175.field2891[var5++ + arg1];
                if (var10 == 0) {
                    class264.field4468.field1344[var6++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 256 - var10 - 18;
                    int var14 = class160.field2709[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class264.field4468.field1344[var6++] = class154.method1134(16711680, class154.method1134(var14, 65280) * var12 + var13 * class154.method1134(var11, 65280)) + class154.method1134(-16711936, class154.method1134(var11, 16711935) * var13 + class154.method1134(16711935, var14) * var12) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class264.field4468.field1344[var6++] = class175.field2891[arg1 + (var5++)];
            }
            var5 += class175.field2890 - 128;
            var7++;
        }
        class264.field4468.method290(arg1, arg2);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lve;BI)V", line = 207)
    public static final void method957(class255 arg0, byte arg1, int arg2) {
        field2133++;
        class255 var3 = arg0.method1743((byte) 46).method1787(true);
        int var4 = 20 % ((arg1 - 59) / 33);
        boolean var5 = false;
        for (int var6 = 0; var6 < class309.field5269; var6++) {
            class242 var7 = class151.field2555[class259.field4398[var6]];
            if (var7 != null && var7.field4068 != null && var7.field4068.method1779(89, var3)) {
                class115.method876(var7.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -28, var7.field5125[0], class276.field4742.field5125[0]);
                var5 = true;
                if (arg2 == 1) {
                    class151.field2561++;
                    class255.field4318.method1523(22260, 222);
                    class255.field4318.method462(class259.field4398[var6], (byte) -61);
                } else if (arg2 == 4) {
                    class225.field3767++;
                    class255.field4318.method1523(22260, 90);
                    class255.field4318.method446(-23847, class259.field4398[var6]);
                } else if (arg2 == 5) {
                    class255.field4318.method1523(22260, 10);
                    class123.field2045++;
                    class255.field4318.method435((byte) 67, class259.field4398[var6]);
                } else if (arg2 == 6) {
                    class255.field4318.method1523(22260, 132);
                    class255.field4318.method438(class259.field4398[var6], 255);
                    class183.field2950++;
                } else if (arg2 == 7) {
                    class10.field141++;
                    class255.field4318.method1523(22260, 115);
                    class255.field4318.method435((byte) 67, class259.field4398[var6]);
                }
                break;
            }
        }
        if (!var5) {
            class260.method1807(1, class49.field728, class3.method14(new class255[] { class9.field129, var3 }, (byte) -67), 0);
        }
    }
}
