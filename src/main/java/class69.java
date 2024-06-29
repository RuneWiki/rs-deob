import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class69 extends class48 {

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field1318 = 0;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Lcc;")
    public static class209 field1313 = class95.method669(81, ")4p=");

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lcc;")
    public static class209 field1316 = class95.method669(93, " de votre liste d(Wamis)3");

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "Lcc;")
    public static class209 field1326 = class95.method669(106, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Ldg;")
    public static class139 field1314;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "Lsj;")
    public static class49 field1323;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Z")
    public static boolean field1319;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static void method507(byte arg0) {
        field1316 = null;
        field1326 = null;
        field1323 = null;
        field1314 = null;
        if (arg0 != 17) {
            method507((byte) -6);
        }
        field1313 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)I")
    public static final int method508(int arg0, int arg1, byte arg2) {
        field1321++;
        int var3 = class58.method446(arg1 - 1, (byte) 101, arg0 - 1) - (-class58.method446(arg1 + 1, (byte) 108, arg0 - 1) - (class58.method446(arg1 - 1, (byte) 97, arg0 + 1) + class58.method446(arg1 + 1, (byte) 87, arg0 + 1)));
        if (arg2 == 111) {
            int var4 = class58.method446(arg1 - 1, (byte) 88, arg0) - (-class58.method446(arg1 + 1, (byte) 90, arg0) - class58.method446(arg1, (byte) 92, arg0 - 1) - class58.method446(arg1, (byte) 115, arg0 + 1));
            int var5 = class58.method446(arg1, (byte) 109, arg0);
            return var5 / 4 + var3 / 16 + var4 / 8;
        } else {
            return -113;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1325++;
        int var8 = 2048 - arg0 & 0x7FF;
        int var9 = arg7 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = arg6;
        int var12 = 0;
        if (var8 != 0) {
            int var13 = class15.field278[var8];
            int var14 = class15.field280[var8];
            var12 = -arg6 * var13 >> 16;
            var11 = arg6 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class15.field278[var9];
            var10 = var11 * var15 >> 16;
            int var16 = class15.field280[var9];
            var11 = var11 * var16 >> 16;
        }
        class179.field3256 = arg4;
        class182.field3304 = arg0;
        class183.field3312 = arg1 - var12;
        class103.field1990 = arg3 - var11;
        class60.field1213 = arg5 - var10;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
    public static final void method510(int arg0, int arg1) {
        field1317++;
        class118.field2364.method662(32768, arg0);
        class286.field5047.method662(arg1 + 32767, arg0);
        class5.field75.method662(32768, arg0);
        if (arg1 != 1) {
            method508(-108, 26, (byte) -86);
        }
        class219.field3992.method662(arg1 ^ 0x8001, arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)V")
    public static final void method511(int arg0, byte arg1) {
        field1322++;
        if (arg1 != -73) {
            field1323 = null;
        }
        class195 var2 = class178.method1229(arg0, 10, -119);
        var2.method1340(true);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
    public static final void method512(int arg0, int arg1) {
        field1324++;
        if (!class161.method1111((byte) 99, arg0)) {
            return;
        }
        class42[] var2 = class50.field984[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class42 var4 = var2[var3];
            if (var4 != null) {
                var4.field815 = 0;
                var4.field805 = 0;
            }
        }
    }
}
