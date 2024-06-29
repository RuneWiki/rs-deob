import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class141 implements class223 {

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Lmt;")
    private class517 field2125 = new class517(128);

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
    public int[] field2120 = new int[class233.field3279.field312];

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "[I")
    private int[] field2124 = new int[class233.field3279.field312];

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "Luv;")
    public static class2 field2119 = new class2(62, -1);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Ljm;")
    public static class210 field2122;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "Ljm;")
    public static class210 field2128;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(ZI)V", line = 10)
    public static final void method1026(boolean arg0, int arg1) {
        field2126++;
        class452.field6647.method2294(arg1, arg0);
        if (!arg0) {
            method1026(true, 115);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)V", line = 26)
    public final void method1027(int arg0, int arg1, int arg2) {
        this.field2120[arg2] = arg1;
        field2121++;
        class418 var4 = (class418) this.field2125.method3059(81, (long) arg2);
        if (var4 == null) {
            class418 var5 = new class418(class381.method2281((byte) 38) + 500L);
            this.field2125.method3055(0, (long) arg2, var5);
        } else {
            var4.field6264 = class381.method2281((byte) 123) + 500L;
        }
        if (arg0 > -86) {
            field2122 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V", line = 50)
    public final void method1028(int arg0, int arg1, int arg2) {
        field2129++;
        class339 var4 = class41.field539.method2511(arg0, false);
        int var5 = var4.field5231;
        int var6 = var4.field5224;
        int var7 = var4.field5225;
        if (arg2 > -92) {
            this.method1031(-111, (byte) 105, 113);
        }
        int var8 = class393.field5899[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1032(-1, var5, ~var9 & this.field2124[var5] | arg1 << var6 & var9);
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(ZI)I", line = 78)
    public final int method1029(boolean arg0, int arg1) {
        field2117++;
        long var3 = class381.method2281((byte) -120);
        if (arg1 != 0) {
            this.field2120 = null;
        }
        for (class418 var5 = arg0 ? (class418) this.field2125.method3061(-16817) : (class418) this.field2125.method3066((byte) 126); var5 != null; var5 = (class418) this.field2125.method3066((byte) 123)) {
            if (var3 > (var5.field6264 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field6264 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field1739;
                    this.field2120[var6] = this.field2124[var6];
                    var5.method876((byte) -96);
                    return var6;
                }
                var5.method876((byte) -96);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)I", line = 118)
    public final int method1030(int arg0, byte arg1) {
        field2130++;
        class339 var3 = class41.field539.method2511(arg0, false);
        int var4 = var3.field5231;
        if (arg1 == -114) {
            int var5 = var3.field5224;
            int var6 = var3.field5225;
            int var7 = class393.field5899[var6 - var5];
            return var7 & this.field2120[var4] >> var5;
        } else {
            return 107;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBI)V", line = 141)
    public final void method1031(int arg0, byte arg1, int arg2) {
        field2116++;
        class339 var4 = class41.field539.method2511(arg2, false);
        if (arg1 <= 41) {
            this.field2124 = null;
        }
        int var5 = var4.field5231;
        int var6 = var4.field5224;
        int var7 = var4.field5225;
        int var8 = class393.field5899[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1027(-87, arg0 << var6 & var9 | this.field2120[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(III)V", line = 180)
    public final void method1032(int arg0, int arg1, int arg2) {
        this.field2124[arg1] = arg2;
        field2115++;
        if (arg0 != -1) {
            field2127 = -91;
        }
        class418 var4 = (class418) this.field2125.method3059(105, (long) arg1);
        if (var4 == null) {
            class418 var5 = new class418(4611686018427387905L);
            this.field2125.method3055(0, (long) arg1, var5);
        } else if (var4.field6264 != 4611686018427387905L) {
            var4.field6264 = class381.method2281((byte) -116) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZI)I", line = 207)
    public final int method1033(boolean arg0, int arg1) {
        if (arg0) {
            return -86;
        } else {
            field2118++;
            return this.field2120[arg1];
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 224)
    public final void method1034(int arg0) {
        field2123++;
        for (int var2 = 0; var2 < class233.field3279.field312; var2++) {
            class494 var3 = class233.field3279.method215(-124, var2);
            if (var3 != null && var3.field7341 == 0) {
                this.field2124[var2] = 0;
                this.field2120[var2] = 0;
            }
        }
        this.field2125 = new class517(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 248)
    public static void method1035(int arg0) {
        if (arg0 == 22806) {
            field2122 = null;
            field2128 = null;
            field2119 = null;
        }
    }
}
