import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class118 extends Canvas {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field2391;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Leh;")
    private static class47 field2394 = class195.method1282((byte) -4, "Loading sprites )2 ");

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2393 = -1;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Leh;")
    public static class47 field2390 = field2394;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
    public static int[] field2395 = new int[256];

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Leh;")
    private static class47 field2396 = class195.method1282((byte) -4, "Could not complete login)3");

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Leh;")
    public static class47 field2398 = field2396;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "[I")
    public static int[] field2400;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!na", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2391.update(arg0);
        field2397++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static void method920(boolean arg0) {
        field2398 = null;
        field2400 = null;
        field2395 = null;
        field2396 = null;
        field2390 = null;
        if (!arg0) {
            field2395 = null;
        }
        field2394 = null;
    }

    @OriginalMember(owner = "client!na", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2391.paint(arg0);
        field2392++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[II[I[Lqe;Z)V")
    public static final void method921(int arg0, int[] arg1, int arg2, int[] arg3, class149[] arg4, boolean arg5) {
        if (!arg5) {
            field2396 = null;
        }
        field2399++;
        if (arg0 <= arg2) {
            return;
        }
        int var6 = arg0 + 1;
        int var7 = (arg0 + arg2) / 2;
        int var8 = arg2 - 1;
        class149 var9 = arg4[var7];
        arg4[var7] = arg4[arg2];
        arg4[arg2] = var9;
        while (var8 < var6) {
            boolean var10 = true;
            do {
                var6--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg1[var11] == 2) {
                        var12 = var9.field2919;
                        var13 = arg4[var6].field2919;
                    } else if (arg1[var11] == 1) {
                        var13 = arg4[var6].field2929;
                        var12 = var9.field2929;
                        if (var13 == -1 && arg3[var11] == 1) {
                            var13 = 2001;
                        }
                        if (var12 == -1 && arg3[var11] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg1[var11] == 3) {
                        var12 = var9.field2916 ? 1 : 0;
                        var13 = arg4[var6].field2916 ? 1 : 0;
                    } else {
                        var12 = var9.field2917;
                        var13 = arg4[var6].field2917;
                    }
                    if (var12 != var13) {
                        if ((arg3[var11] != 1 || var12 >= var13) && (arg3[var11] != 0 || var13 >= var12)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var8++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg1[var15] == 2) {
                        var16 = arg4[var8].field2919;
                        var17 = var9.field2919;
                    } else if (arg1[var15] == 1) {
                        var17 = var9.field2929;
                        if (var17 == -1 && arg3[var15] == 1) {
                            var17 = 2001;
                        }
                        var16 = arg4[var8].field2929;
                        if (var16 == -1 && arg3[var15] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg1[var15] == 3) {
                        var16 = arg4[var8].field2916 ? 1 : 0;
                        var17 = var9.field2916 ? 1 : 0;
                    } else {
                        var16 = arg4[var8].field2917;
                        var17 = var9.field2917;
                    }
                    if (var16 != var17) {
                        if ((arg3[var15] != 1 || var16 >= var17) && (arg3[var15] != 0 || var16 <= var17)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var6 > var8) {
                class149 var18 = arg4[var8];
                arg4[var8] = arg4[var6];
                arg4[var6] = var18;
            }
        }
        method921(var6, arg1, arg2, arg3, arg4, true);
        method921(arg0, arg1, var6 + 1, arg3, arg4, true);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class118(Component arg0) {
        this.field2391 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2395[var0] = var1;
        }
        field2400 = new int[] { 1, 0, -1, 0 };
    }
}
