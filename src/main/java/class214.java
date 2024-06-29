import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class214 {

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "S")
    public short field2990;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "S")
    public short field2992;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "B")
    public byte field2980;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "S")
    public short field2983;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "B")
    public byte field2989;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Z")
    public boolean field2979;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Z")
    public static boolean field2982 = false;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field2986 = 0;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Lwj;")
    public static class270 field2984 = new class270(6, 2);

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field2994 = -1;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field2996 = 0;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "F")
    public static float field2978;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "Lvn;")
    public static class204 field2995;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field2998;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIIIII)V", line = 7)
    public static final void method1324(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2977++;
        long var6 = (long) (arg3 | (arg0 ? Integer.MIN_VALUE : 0));
        class128 var8 = (class128) class423.field6197.method1492(var6, arg2 ^ 0x3352);
        if (var8 == null) {
            var8 = new class128();
            class423.field6197.method1487(-127, var6, var8);
        }
        if (arg1 >= var8.field1893.length) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field1893.length; var11++) {
                var9[var11] = var8.field1893[var11];
                var10[var11] = var8.field1902[var11];
            }
            for (int var12 = var8.field1893.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1902 = var10;
            var8.field1893 = var9;
        }
        var8.field1893[arg1] = arg5;
        var8.field1902[arg1] = arg4;
        if (arg2 != 11158) {
            field2995 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLem;Lem;)V", line = 62)
    public static final void method1325(byte arg0, class150 arg1, class150 arg2) {
        int var3 = -64 % ((arg0 + 45) / 36);
        class491.method2878((byte) 92, class153.field2351);
        class491.field7172++;
        field2985++;
        class481.field7027.method2359(arg1.field2277, -92);
        class481.field7027.method2360(32, arg2.field2237);
        class481.field7027.method2323(arg1.field2237, 103);
        class481.field7027.method2360(32, arg1.field2248);
        class481.field7027.method2323(arg2.field2248, 46);
        class481.field7027.method2359(arg2.field2277, -128);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 96)
    public static void method1326(byte arg0) {
        if (arg0 >= 96) {
            field2998 = null;
            field2995 = null;
            field2984 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 108)
    public static final void method1327(int arg0) {
        if (arg0 != 5743) {
            method1325((byte) 2, null, null);
        }
        field2975++;
        class230.field3253 = null;
        class242.field3385 = -1;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)I", line = 121)
    public static final int method1328(int arg0, byte arg1) {
        if (arg1 >= -76) {
            method1324(false, -43, 34, -78, -53, 86);
        }
        if (class33.field438 != null) {
            class33.field438.method2839(-20828);
            class33.field438 = null;
        }
        field2987++;
        class270.field3730++;
        if (class270.field3730 > 4) {
            class86.field1266 = 0;
            class270.field3730 = 0;
            return arg0;
        }
        if (class241.field3373 == class140.field1991) {
            class140.field1991 = class220.field3117;
        } else {
            class140.field1991 = class241.field3373;
        }
        class86.field1266 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 163)
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2991 = arg2;
        this.field2976 = arg3;
        this.field2981 = arg1;
        this.field2990 = (short) arg5;
        this.field2993 = arg0;
        this.field2992 = (short) arg4;
        this.field2980 = (byte) arg7;
        this.field2988 = arg11;
        this.field2983 = (short) arg6;
        this.field2989 = (byte) arg8;
        this.field2979 = arg10;
    }
}
