import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class259 extends class129 {

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "[Lqb;")
    public class289[] field4241;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "[I")
    public static int[] field4251 = new int[128];

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "Lvh;")
    public static class108 field4242;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "Lij;")
    public static class258 field4243;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "[Lda;")
    public static class197[] field4245;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "[[[B")
    public static byte[][][] field4244;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Z")
    public final boolean method1718(int arg0, int arg1) {
        field4248++;
        return arg0 == 15693 ? this.field4241[arg1].field4620 : true;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)Z")
    public final boolean method1719(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1719(86, -116);
        }
        field4246++;
        return this.field4241[arg0].field4606;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
    public static void method1720(int arg0) {
        field4242 = null;
        field4243 = null;
        field4244 = null;
        if (arg0 < -109) {
            field4251 = null;
            field4245 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)V")
    public static final void method1721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4252++;
        if (arg5 != -792153624 || arg3 > class89.field1582 || arg0 < class118.field2094) {
            return;
        }
        boolean var6;
        if (arg1 < class126.field2222) {
            var6 = false;
            arg1 = class126.field2222;
        } else if (arg1 <= class118.field2098) {
            var6 = true;
        } else {
            var6 = false;
            arg1 = class118.field2098;
        }
        boolean var7;
        if (arg4 < class126.field2222) {
            var7 = false;
            arg4 = class126.field2222;
        } else if (arg4 <= class118.field2098) {
            var7 = true;
        } else {
            arg4 = class118.field2098;
            var7 = false;
        }
        if (arg3 < class118.field2094) {
            arg3 = class118.field2094;
        } else {
            class93.method598(-7, arg4, arg1, class167.field2735[arg3++], arg2);
        }
        if (class89.field1582 >= arg0) {
            class93.method598(-7, arg4, arg1, class167.field2735[arg0--], arg2);
        } else {
            arg0 = class89.field1582;
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg0; var8++) {
                int[] var9 = class167.field2735[var8];
                var9[arg1] = var9[arg4] = arg2;
            }
        } else if (var6) {
            for (int var11 = arg3; var11 <= arg0; var11++) {
                class167.field2735[var11][arg1] = arg2;
            }
        } else if (var7) {
            for (int var10 = arg3; var10 <= arg0; var10++) {
                class167.field2735[var10][arg4] = arg2;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)V")
    public static final void method1722(int arg0, int arg1) {
        class100.field1714.method63(arg0, arg1);
        field4250++;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lvh;Lvh;IZ)V")
    public class259(class108 arg0, class108 arg1, int arg2, boolean arg3) {
        class60 var5 = new class60();
        int var6 = arg0.method754(122, arg2);
        this.field4241 = new class289[var6];
        int[] var7 = arg0.method743(arg2, 5064);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method746(var7[var8], (byte) -128, arg2);
            int var10 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            class186 var11 = null;
            for (class186 var12 = (class186) var5.method379(6347); var12 != null; var12 = (class186) var5.method378(-105)) {
                if (var12.field3012 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method726(0, var10, (byte) -57);
                } else {
                    var13 = arg1.method726(var10, 0, (byte) -57);
                }
                var11 = new class186(var10, var13);
                var5.method374(-1, var11);
            }
            this.field4241[var7[var8]] = new class289(var9, var11);
        }
    }
}
