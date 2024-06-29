import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class46 extends class66 implements Runnable {

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "I")
    public int field626 = -1;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "Z")
    private boolean field625 = true;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "Lvaa;")
    private class437 field622;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "J")
    public static long field619 = 0L;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "Z")
    public static boolean field621 = false;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "Lkw;")
    public static class233 field617;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "Lhb;")
    public static class681 field620;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Leg;")
    public static class97 field618;

    @OriginalMember(owner = "client!wba", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field625) {
            this.field622.method2401(81, this);
        }
        field616++;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)V")
    public static final void method279(byte arg0, int arg1) {
        field624++;
        if (!class409.method2299((byte) -85, arg1)) {
            return;
        }
        class337[] var2 = class325.field4062[arg1];
        if (arg0 < 24) {
            method281(2, (byte) 88, -71, 69);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class337 var4 = var2[var3];
            if (var4 != null) {
                var4.field4264 = 0;
                var4.field4315 = 0;
                var4.field4159 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
    public final void method280(byte arg0) {
        field627++;
        (new Thread(this, "a")).start();
        if (arg0 != 96) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBII)I")
    public static final int method281(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = -16 % ((arg1 + 6) / 33);
        int var5 = arg2 & 0x3;
        field623++;
        if (var5 == 0) {
            return arg3;
        } else if (var5 == 1) {
            return 4095 - arg0;
        } else if (var5 == 2) {
            return 4095 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public static void method282(int arg0) {
        field618 = null;
        field617 = null;
        field620 = null;
        int var1 = -98 % ((arg0 + 18) / 44);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
    public final void method283(byte arg0) {
        this.field625 = false;
        field628++;
        if (arg0 != -16) {
            field617 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lvaa;)V")
    public class46(class437 arg0) {
        this.field622 = arg0;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBI[IIIII)V")
    public static final void method284(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field629++;
        if (arg2 > 0 && !class182.method1084((byte) 104, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg7 > 0 && !class182.method1084((byte) -19, arg7)) {
            throw new IllegalArgumentException("");
        } else if (arg0 == 32993) {
            int var8 = 0;
            int var9 = arg7 > arg2 ? arg2 : arg7;
            int var10 = arg2 >> 1;
            int var11 = arg7 >> 1;
            int[] var12 = arg3;
            if (arg1 >= -39) {
                method279((byte) 101, 1);
            }
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg5, var8, arg6, arg2, arg7, 0, arg0, arg4, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg2 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 16 & 0xFF;
                        int var24 = var20 >> 24 & 0xFF;
                        int var25 = var12[var16++];
                        int var26 = (var20 & 0xFF98) >> 8;
                        int var27 = var20 & 0xFF;
                        int var28 = (var22 & 0xFF) + var27;
                        int var29 = ((var22 & 0xFFB3) >> 8) + var26;
                        int var30 = (var22 >> 24 & 0xFF) + var24;
                        int var31 = ((var22 & 0xFF4680) >> 16) + var23;
                        int var32 = (var21 >> 8 & 0xFF) + var29;
                        int var33 = ((var21 & 0xFF293E) >> 16) + var31;
                        int var34 = (var21 & 0xFF) + var28;
                        int var35 = (var21 >> 24 & 0xFF) + var30;
                        int var36 = (var25 & 0xFF) + var34;
                        int var37 = (var25 >> 24 & 0xFF) + var35;
                        int var38 = (var25 >> 8 & 0xFF) + var32;
                        int var39 = (var25 >> 16 & 0xFF) + var33;
                        var13[var14++] = class364.method2113(class364.method2113(class109.method762(var38, 1020) << 6, class364.method2113(class109.method762(1020, var37) << 22, class109.method762(16711680, var39 << 14))), class109.method762(var36 >> 2, 255));
                    }
                    var16 += arg2;
                    var15 += arg2;
                }
                var13 = var12;
                arg2 = var10;
                var12 = var17;
                arg7 = var11;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
