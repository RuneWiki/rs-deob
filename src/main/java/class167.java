import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class167 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lob;")
    private static class141 field3225 = class175.method1195(40, "flash3:");

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lob;")
    public static class141 field3231 = field3225;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lob;")
    public static class141 field3230 = field3225;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lra;")
    public static class170 field3222;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
    public static int[] field3226;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[Lob;")
    public static class141[] field3224;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I")
    public static final int method1148(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        field3228++;
        if (arg1 == 25920) {
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static final void method1149(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field3227++;
        if (class8.field128 && class66.field1287 != class54.field1055) {
            class123.method795(class66.field1287, class177.field3504, (byte) -103, class114.field2176.field3870[0], class114.field2176.field3892[0], class30.field570);
        } else if (class66.field1287 != class177.field3505) {
            class177.field3505 = class66.field1287;
            class117.method757(class66.field1287, arg0 ^ 0xFFFFFFFC);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lsg;B)V")
    public static final void method1150(class186 arg0, byte arg1) {
        if (arg1 < 12) {
            method1153(-54, 10, -61, -51, -84, -126);
        }
        field3223++;
        arg0.field3614 = false;
        if (arg0.field3613 != null) {
            arg0.field3613.field3772 = 0;
        }
        for (class186 var2 = arg0.method476(); var2 != null; var2 = arg0.method492()) {
            method1150(var2, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)I")
    public static final int method1151(int arg0, int arg1) {
        if (arg1 >= -87) {
            field3225 = null;
        }
        field3229++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method1152(boolean arg0) {
        field3231 = null;
        field3226 = null;
        if (!arg0) {
            field3225 = null;
        }
        field3224 = null;
        field3222 = null;
        field3230 = null;
        field3225 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class104.field2006[0].method349(arg3, arg1);
        class104.field2006[1].method349(arg3, arg0 + arg1 - 16);
        field3232++;
        int var6 = (arg0 - 32) * arg0 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg2 / (arg4 - arg0);
        class148.method1030(arg3, arg1 + 16, 16, arg0 - 32, class221.field4197);
        class148.method1030(arg3, arg1 + var7 + 16, 16, var6, class126.field2425);
        class148.method1022(arg3, arg1 + var7 + 16, var6, class130.field2460);
        class148.method1022(arg3 + 1, arg1 + var7 + 16, var6, class130.field2460);
        class148.method1032(arg3, arg1 + var7 + 16, 16, class130.field2460);
        class148.method1032(arg3, arg1 + var7 + 17, 16, class130.field2460);
        class148.method1022(arg3 + 15, var7 + 16 + arg1, var6, class129.field2448);
        if (arg5 != 18768) {
            method1150(null, (byte) 106);
        }
        class148.method1022(arg3 + 14, arg1 + 17 - -var7, var6 - 1, class129.field2448);
        class148.method1032(arg3, var7 + var6 + arg1 + 15, 16, class129.field2448);
        class148.method1032(arg3 + 1, arg1 + var6 + 14 + var7, 15, class129.field2448);
    }
}
