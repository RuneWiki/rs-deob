import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class40 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
    public static int[] field727 = new int[100];

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Leb;")
    public static class230 field734 = class68.method589(0, "(U");

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Z")
    public static boolean field735 = false;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[I")
    public static int[] field737 = new int[128];

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Leb;")
    public static class230 field738 = class68.method589(0, "gelb:");

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lkk;")
    public static class223 field733;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[Lge;")
    public static class69[] field736;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(JBII)Z")
    public static final boolean method352(long arg0, byte arg1, int arg2, int arg3) {
        field729++;
        int var5 = ((int) arg0 & 0x7D533) >> 14;
        int var6 = (int) arg0 >> 20 & 0x3;
        if (arg1 != 48) {
            field727 = null;
        }
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class194 var8 = class251.method1776(var7, 65280);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field3500;
                var10 = var8.field3476;
            } else {
                var9 = var8.field3476;
                var10 = var8.field3500;
            }
            int var11 = var8.field3443;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class15.method208(var9, class56.field1033.field2296[0], 0, true, 2, arg2, arg3, var10, arg1 + 74, var11, 0, class56.field1033.field2253[0]);
        } else {
            class15.method208(0, class56.field1033.field2296[0], var6, true, 2, arg2, arg3, 0, 106, 0, var5 + 1, class56.field1033.field2253[0]);
        }
        class27.field505 = class225.field3886;
        class76.field1380 = class92.field1657;
        class33.field600 = 0;
        class203.field3580 = 2;
        return true;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method353(int arg0) {
        class6.field83.method1124(0);
        class247.field4381.method1124(arg0 ^ arg0);
        field730++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILob;)V")
    public static final void method354(int arg0, class128 arg1) {
        field728++;
        if (class259.field4584 == arg1.field2275 || arg1.field2303 == -1 || arg1.field2246 != 0 || (arg1.field2247 + 1) > class237.method1667(arg1.field2303, -116).field4433[arg1.field2273]) {
            int var2 = arg1.field2275 - arg1.field2238;
            int var3 = class259.field4584 - arg1.field2238;
            int var4 = arg1.field2277 * 128 + arg1.method1005(arg0 - 3) * 64;
            int var5 = arg1.field2262 * 128 + arg1.method1005(0) * 64;
            int var6 = arg1.field2311 * 128 + (arg1.method1005(0) * 64);
            int var7 = arg1.field2285 * 128 + (arg1.method1005(0) * 64);
            arg1.field2274 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field2300 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
        }
        arg1.field2264 = 0;
        if (arg1.field2272 == 0) {
            arg1.field2278 = 1024;
        }
        if (arg1.field2272 == 1) {
            arg1.field2278 = 1536;
        }
        if (arg1.field2272 == 2) {
            arg1.field2278 = 0;
        }
        if (arg1.field2272 == arg0) {
            arg1.field2278 = 512;
        }
        arg1.field2289 = arg1.field2278;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBI)V")
    public static final void method355(int arg0, int arg1, byte arg2, int arg3) {
        field731++;
        class230 var4 = class173.method1267((byte) 59, new class230[] { class261.field4632, class37.method340(arg3, (byte) -26), class47.field838, class37.method340(arg0 >> 6, (byte) -26), class47.field838, class37.method340(arg1 >> 6, (byte) -26), class47.field838, class37.method340(arg0 & 0x3F, (byte) -26), class47.field838, class37.method340(arg1 & 0x3F, (byte) -26) });
        var4.method1613((byte) 49);
        class121.method957(var4, -127);
        int var5 = -19 / ((-arg2 - 14) / 47);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method356(byte arg0) {
        field734 = null;
        field736 = null;
        field737 = null;
        field738 = null;
        if (arg0 != 96) {
            field732 = 81;
        }
        field733 = null;
        field727 = null;
    }
}
