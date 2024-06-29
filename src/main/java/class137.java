import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class137 {

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field2298 = 20;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field2304 = -1;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
    public static int[] field2303 = new int[1000];

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Z")
    public static boolean field2308 = true;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Lod;")
    public static class260 field2300 = class194.method1327(50);

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Z")
    public static boolean field2309 = false;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Lah;")
    public static class106 field2310;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[[[B")
    public static byte[][][] field2299;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)I")
    public static final int method1030(int arg0, byte arg1) {
        field2297++;
        class172 var2 = class136.method1023(16, arg0);
        int var3 = var2.field2915;
        int var4 = var2.field2908;
        int var5 = 57 % ((arg1 + 77) / 41);
        int var6 = var2.field2913;
        int var7 = class119.field2002[var4 - var3];
        return var7 & class192.field3138[var6] >> var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2300 = null;
        field2299 = null;
        field2310 = null;
        if (arg0 != -29401) {
            method1033(-87);
        }
        field2303 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        class3.field31.method1156(-88);
        class3.field42.method1156(-79);
        field2306++;
        if (arg0 >= -12) {
            method1030(3, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public static final void method1033(int arg0) {
        class207.field3331++;
        field2305++;
        class87.field1405.method607(163, (byte) 96);
        for (class167 var1 = (class167) class91.field1434.method1062(39); var1 != null; var1 = (class167) class91.field1434.method1059(-14608)) {
            if (var1.field2755 == 0) {
                class164.method1184((byte) 66, true, var1);
            }
        }
        int var2 = 87 % (-arg0 / 40);
        if (class295.field4677 != null) {
            class72.method556(0, class295.field4677);
            class295.field4677 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
    public static final void method1034(byte arg0, int arg1) {
        field2307++;
        if (arg0 != 35) {
            method1033(-67);
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class196.method1338((byte) 28);
        } else if (arg1 == 2) {
            class174.method1250((byte) 70);
        } else if (arg1 == 3) {
            class185.method1288(-72);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2302++;
        if (arg4 != 2) {
            method1031(-71);
        }
        if (arg6 < 1 || arg0 < 1 || arg6 > 102 || arg0 > 102) {
            return;
        }
        if (!class9.method50(false) && (class43.field790[0][arg6][arg0] & 0x2) == 0) {
            int var8 = arg5;
            if ((class43.field790[arg5][arg6][arg0] & 0x8) != 0) {
                var8 = 0;
            }
            if (class282.field4485 != var8) {
                return;
            }
        }
        int var9 = arg5;
        if (arg5 < 3 && (class43.field790[1][arg6][arg0] & 0x2) == 2) {
            var9 = arg5 + 1;
        }
        class270.method1839(var9, arg6, arg4 ^ 0xFFFFFF9C, arg0, arg1, class141.field2352[arg5], arg5);
        if (arg2 < 0) {
            return;
        }
        boolean var10 = class151.field2470;
        class151.field2470 = true;
        class290.method1950(false, false, arg6, arg7, arg5, arg2, arg0, 1, class141.field2352[arg5], var9, arg3);
        class151.field2470 = var10;
        return;
    }
}
