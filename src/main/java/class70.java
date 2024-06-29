import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class70 {

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field1120 = 0;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lbd;")
    public static class162 field1113 = class17.method142(0, "Schlie-8en");

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Lcj;")
    public static class182 field1117 = new class182(64);

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "[I")
    public static int[] field1123 = new int[2];

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Lbd;")
    public static class162 field1126 = class17.method142(0, ":trade:");

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lbd;")
    public static class162 field1128 = class17.method142(0, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field1125 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lob;")
    public static class78 field1111;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "[I")
    public static int[] field1124;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V", line = 7)
    public static final void method506() {
        GL var0 = class117.field2143;
        var0.glDisableClientState(32886);
        class117.method962(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class117.method963();
        for (int var1 = 0; var1 < class274.field4545[0].length; var1++) {
            class26 var2 = class274.field4545[0][var1];
            if (var2.field433 >= 0 && class312.field5271.method158(255, var2.field433) == 4) {
                var0.glColor4fv(class104.method841((byte) -91, var2.field435), 0);
                float var3 = 201.5F - (var2.field421 ? 1.0F : 0.5F);
                var2.method207(class288.field4856, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class117.method966();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class117.method968();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 40)
    public static final void method507(int arg0) {
        field1121++;
        class129.method1038(5, 93);
        class66.method472((byte) 48, 5);
        class282.method1960(5, true);
        class277.method1904(5, 116);
        class296.method2029(arg0 ^ 0xFFFFFFFB, 5);
        class315.method2151((byte) 114, 5);
        class128.method1031(false, 5);
        class162.method1286(5, 65);
        class111.method895(arg0 ^ 0x61, 5);
        class229.method1636((byte) 102, 5);
        class250.method1750((byte) -102, 5);
        class282.method1959(50, 0);
        class146.method1165(5, arg0 - 108);
        class277.method1905(false, arg0);
        class136.field2427.method1538(5, (byte) -59);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILob;BI)V", line = 69)
    public static final void method508(int arg0, class78 arg1, byte arg2, int arg3) {
        field1110++;
        if (class268.field4482 != 0 && class268.field4482 != 3 || !arg1.method591((byte) -38)) {
            return;
        }
        int var4 = arg1.field1329[arg0];
        if (arg3 < var4 || arg3 > var4 + arg1.field1360[arg0]) {
            return;
        }
        int var5 = arg3 - arg1.field1340 / 2;
        int var6 = arg0 - arg1.field1367 / 2;
        int var7 = class305.field5137 + class265.field4414 & 0x7FF;
        int var8 = class312.field5262[var7];
        int var9 = class312.field5269[var7];
        int var10 = (class23.field396 + 256) * var8 >> 8;
        int var11 = (class23.field396 + 256) * var9 >> 8;
        int var12 = var5 * var11 + var6 * var10 >> 11;
        int var13 = var6 * var11 - (var5 * var10) >> 11;
        if (arg2 >= -110) {
            return;
        }
        int var14 = class122.field2215.field5013 + var12 >> 7;
        int var15 = class122.field2215.field5047 - var13 >> 7;
        if (class83.field1438 > 0 && class63.field991[82] && class63.field991[81]) {
            class104.method848(class157.field2765, class258.field4294 + var15, 23, class178.field3052 + var14);
            return;
        }
        boolean var16 = class163.method1292(class122.field2215.field5050[0], 1, true, 0, 0, var14, 0, class122.field2215.field5034[0], var15, 0, 0, 1);
        if (!var16) {
            return;
        }
        class187.field3229.method753(var5, true);
        class187.field3229.method753(var6, true);
        class187.field3229.method751(class265.field4414, -1044017976);
        class187.field3229.method753(57, true);
        class187.field3229.method753(class305.field5137, true);
        class187.field3229.method753(class23.field396, true);
        class187.field3229.method753(89, true);
        class187.field3229.method751(class122.field2215.field5013, -1044017976);
        class187.field3229.method751(class122.field2215.field5047, -1044017976);
        class187.field3229.method753(class92.field1629, true);
        class187.field3229.method753(63, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lb;B)V", line = 138)
    public final void method509(class94 arg0, byte arg1) {
        field1115++;
        while (true) {
            int var3 = arg0.method756(915905888);
            if (var3 == 0) {
                if (arg1 != -117) {
                    this.method510(-37, (class94) null, (byte) 67);
                }
                return;
            }
            this.method510(var3, arg0, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILb;B)V", line = 159)
    private final void method510(int arg0, class94 arg1, byte arg2) {
        field1114++;
        if (arg2 != 7) {
            field1120 = -75;
        }
        if (arg0 == 1) {
            this.field1122 = arg1.method761((byte) 108);
            this.field1118 = arg1.method756(915905888);
            this.field1116 = arg1.method756(915905888);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 189)
    public static void method511(int arg0) {
        field1126 = null;
        field1128 = null;
        field1123 = null;
        field1117 = null;
        field1113 = null;
        field1124 = null;
        field1111 = null;
        if (arg0 != -1) {
            field1127 = -71;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)I", line = 231)
    public static final int method512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1119++;
        int var5 = 65536 - class312.field5269[arg2 * 1024 / arg4] >> 1;
        if (arg0 != 5) {
            method508(-20, (class78) null, (byte) -99, -86);
        }
        return ((65536 - var5) * arg1 >> 16) + (arg3 * var5 >> 16);
    }
}
