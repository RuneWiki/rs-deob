import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class747 extends class71 {

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "[Lgs;")
    public class747[] field10280;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "Z")
    public boolean field10281;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "Lkr;")
    public static class602 field10284 = new class602(116, 5);

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Lvu;")
    public static class680 field10285 = new class680();

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field10288 = new String[100];

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "[I")
    public static int[] field10291 = new int[14];

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field10274;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field10275;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field10277;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    public static int field10278;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public int field10293;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
    public static int field10294;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "Lri;")
    public class344 field10289;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "Leb;")
    public class614 field10279;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)I")
    public int method3203(boolean arg0) {
        if (arg0) {
            field10285 = null;
        }
        field10277++;
        return -1;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ldc;II)V")
    public void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            this.field10281 = true;
        }
        field10294++;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
    public int[] method182(int arg0, int arg1) {
        field10290++;
        if (arg1 >= -89) {
            this.method4158(47, 26, -118);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)[[I")
    public int[][] method688(int arg0, int arg1) {
        field10292++;
        int var3 = -43 / ((arg0 - 35) / 58);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public void method727(byte arg0) {
        if (arg0 != -88) {
            return;
        }
        if (this.field10281) {
            this.field10279.method3481(false);
            this.field10279 = null;
        } else {
            this.field10289.method2199(true);
            this.field10289 = null;
        }
        field10286++;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Luu;Ljava/awt/Canvas;IBLd;)Lha;")
    public static final class548 method4155(class237 arg0, Canvas arg1, int arg2, byte arg3, class270 arg4) {
        field10275++;
        if (!class171.method1096((byte) -9)) {
            throw new RuntimeException("");
        } else if (class715.method4015("jaggl", arg3 ^ 0x46)) {
            OpenGL var5 = new OpenGL();
            if (arg3 != -71) {
                return null;
            }
            long var6 = var5.init(arg1, 8, 8, 8, 24, 0, arg2);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class47 var8 = new class47(var5, arg1, var6, arg4, arg0, arg2);
            var8.method1538(false);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)I")
    public int method726(byte arg0) {
        if (arg0 < 122) {
            this.field10293 = 59;
        }
        field10278++;
        return -1;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)[I")
    public final int[] method4156(int arg0, int arg1, int arg2) {
        field10274++;
        int var4 = 125 % ((-arg0 - 56) / 59);
        return this.field10280[arg2].field10281 ? this.field10280[arg2].method182(arg1, -103) : this.field10280[arg2].method688(-126, arg1)[0];
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIB)V")
    public void method725(int arg0, int arg1, byte arg2) {
        field10282++;
        if (arg2 != 44) {
            this.method727((byte) -65);
        }
        int var4 = this.field10293 == 255 ? arg0 : this.field10293;
        if (this.field10281) {
            this.field10279 = new class614(var4, arg0, arg1);
        } else {
            this.field10289 = new class344(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static void method4157(int arg0) {
        field10284 = null;
        field10291 = null;
        field10288 = null;
        field10285 = null;
        if (arg0 != 3) {
            method4155(null, null, -41, (byte) 38, null);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(III)[[I")
    public final int[][] method4158(int arg0, int arg1, int arg2) {
        field10283++;
        if (arg2 != 2) {
            this.field10280 = null;
        }
        if (this.field10280[arg0].field10281) {
            int[] var4 = this.field10280[arg0].method182(arg1, arg2 - 129);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field10280[arg0].method688(114, arg1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public void method184(int arg0) {
        if (arg0 != -2) {
            this.method727((byte) -53);
        }
        field10276++;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IZ)V")
    public class747(int arg0, boolean arg1) {
        this.field10280 = new class747[arg0];
        this.field10281 = arg1;
    }
}
