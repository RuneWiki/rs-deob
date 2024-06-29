import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class152 extends class200 {

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Lwd;")
    public class234 field2643;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Ldj;")
    public static class44 field2640 = class89.method650(255, ")1j");

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Ldj;")
    public static class44 field2641 = class89.method650(255, "::fps ");

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Lri;")
    public static class189 field2646 = new class189(128);

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field2650 = 0;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[S")
    public static short[] field2647 = new short[256];

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Ldj;")
    private static class44 field2649 = class89.method650(255, "Starting 3d library");

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "Ldj;")
    public static class44 field2651 = field2649;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "Lve;")
    public static class225 field2652;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "[I")
    public static int[] field2648;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public static void method981(byte arg0) {
        field2641 = null;
        field2646 = null;
        field2652 = null;
        field2648 = null;
        if (arg0 != 4) {
            field2640 = null;
        }
        field2649 = null;
        field2640 = null;
        field2647 = null;
        field2651 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I")
    public static final int method982(int arg0, int arg1, int arg2, int arg3) {
        field2642++;
        int var4 = arg2 / arg3;
        int var5 = arg0 & arg3 - 1;
        int var6 = arg0 / arg3;
        int var7 = class19.method150(var6, 4901, var4);
        int var8 = arg2 & arg3 - 1;
        int var9 = class19.method150(var6 + 1, arg1 + 4900, var4);
        int var10 = class19.method150(var6, arg1 + 4900, arg1 + var4);
        int var11 = class19.method150(var6 + 1, arg1 ^ 0x1324, var4 + 1);
        int var12 = class135.method913(var7, var9, 65536, var5, arg3);
        int var13 = class135.method913(var10, var11, 65536, var5, arg3);
        return class135.method913(var12, var13, 65536, var8, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lkh;")
    public static final class117 method983(int arg0, int arg1) {
        field2639++;
        class117 var2 = (class117) class1.field7.method1178((long) arg1, 14176);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class61.field1138.method1466(arg1, 0, (byte) -123);
        if (var3 == null) {
            return null;
        }
        class117 var4 = new class117();
        class66 var5 = new class66(var3);
        var5.field1195 = var5.field1219.length - 2;
        int var6 = var5.method500(92);
        int var7 = var5.field1219.length - var6 - 2 - 12;
        var5.field1195 = var7;
        int var8 = var5.method528(true);
        var4.field2082 = var5.method500(109);
        var4.field2098 = var5.method500(42);
        var4.field2083 = var5.method500(120);
        var4.field2081 = var5.method500(50);
        int var9 = var5.method506(255);
        if (var9 > 0) {
            var4.field2093 = new class120[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method500(42);
                class120 var12 = new class120(class235.method1532(50, var11));
                var4.field2093[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method528(true);
                    int var14 = var5.method528(true);
                    var12.method830(new class222(var14), (long) var13, 1);
                }
            }
        }
        var5.field1195 = 0;
        var4.field2095 = var5.method509((byte) 104);
        var4.field2084 = new class44[var8];
        var4.field2096 = new int[var8];
        var4.field2091 = new int[var8];
        int var15 = 0;
        while (var7 > var5.field1195) {
            int var17 = var5.method500(83);
            if (var17 == 3) {
                var4.field2084[var15] = var5.method496(true);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field2091[var15] = var5.method506(255);
            } else {
                var4.field2091[var15] = var5.method528(true);
            }
            var4.field2096[var15++] = var17;
        }
        int var16 = 24 % ((-arg0 - 93) / 32);
        class1.field7.method1183((byte) 119, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Llg;IIIIZI)Llg;")
    public static final class127 method984(class127 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2645++;
        long var7 = (long) arg4;
        class127 var9 = (class127) class188.field3246.method677(1000, var7);
        if (var9 == null) {
            class195 var10 = class195.method1271(class81.field1571, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1257(64, 768, -50, -10, -50);
            class188.field3246.method675(var9, var7, -32074);
        }
        int var11 = arg0.method52();
        int var12 = arg0.method58();
        int var13 = arg0.method46();
        int var14 = arg0.method39();
        class127 var15 = var9.method71(true);
        if (arg6 != 0) {
            var15.method65(arg6);
        }
        class6 var16 = (class6) var15;
        if (arg5) {
            return null;
        }
        if (class40.method278(arg2 + var13, class194.field3403, arg3 + var11, (byte) 101) != arg1 || arg1 != class40.method278(arg2 + var14, class194.field3403, arg3 + var12, (byte) 101)) {
            for (int var17 = 0; var17 < var16.field109; var17++) {
                var16.field87[var17] += class40.method278(var16.field95[var17] + arg2, class194.field3403, var16.field88[var17] + arg3, (byte) 101) - arg1;
            }
            var16.field93 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lwd;)V")
    public class152(class234 arg0) {
        this.field2643 = arg0;
    }
}
