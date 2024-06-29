import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class162 extends class4 {

    @OriginalMember(owner = "client!s", name = "yb", descriptor = "I")
    private int field3109;

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!s", name = "tb", descriptor = "I")
    private int field3104;

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "I")
    private int field3102;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!s", name = "ub", descriptor = "Ltc;")
    private class174 field3105;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
    private int field3100;

    @OriginalMember(owner = "client!s", name = "wb", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "Lua;")
    public static class181 field3094 = new class181(500);

    @OriginalMember(owner = "client!s", name = "Ab", descriptor = "Lsg;")
    public static class169 field3111 = class165.method1060("Welt", 1536);

    @OriginalMember(owner = "client!s", name = "Bb", descriptor = "I")
    public static volatile int field3112 = 0;

    @OriginalMember(owner = "client!s", name = "Eb", descriptor = "I")
    public static int field3115 = 2;

    @OriginalMember(owner = "client!s", name = "Fb", descriptor = "Lsg;")
    public static class169 field3116 = class165.method1060("mapdots", 1536);

    @OriginalMember(owner = "client!s", name = "Db", descriptor = "Lsg;")
    private static class169 field3114 = class165.method1060("Ok", 1536);

    @OriginalMember(owner = "client!s", name = "zb", descriptor = "Lsg;")
    public static class169 field3110 = field3114;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!s", name = "vb", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!s", name = "xb", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!s", name = "Cb", descriptor = "Lke;")
    public static class95 field3113;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Lcd;")
    public final class24 method30(int arg0) {
        field3106++;
        if (this.field3105 != null) {
            int var2 = field3107 - this.field3100;
            if (var2 > 100 && this.field3105.field3371 > 0) {
                var2 = 100;
            }
            label47: {
                do {
                    do {
                        if (var2 <= this.field3105.field3384[this.field3095]) {
                            break label47;
                        }
                        var2 -= this.field3105.field3384[this.field3095];
                        this.field3095++;
                    } while (this.field3095 < this.field3105.field3379.length);
                    this.field3095 -= this.field3105.field3371;
                } while (this.field3095 >= 0 && this.field3095 < this.field3105.field3379.length);
                this.field3105 = null;
            }
            this.field3100 = field3107 - var2;
        }
        class17 var3 = class138.method925(6, this.field3097);
        if (var3.field355 != null) {
            var3 = var3.method99(-88);
        }
        int var4 = -102 % ((arg0 - 48) / 49);
        if (var3 == null) {
            return null;
        }
        int var5;
        int var6;
        if (this.field3098 == 1 || this.field3098 == 3) {
            var6 = var3.field400;
            var5 = var3.field369;
        } else {
            var5 = var3.field400;
            var6 = var3.field369;
        }
        int var7 = (var6 >> 1) + this.field3103;
        int var8 = this.field3103 + (var6 + 1 >> 1);
        int var9 = (var5 >> 1) + this.field3109;
        int var10 = this.field3109 + (var5 + 1 >> 1);
        int[][] var11 = class139.field2588[this.field3104];
        int var12 = (this.field3103 << 7) + (var6 << 6);
        int var13 = var11[var7][var9] + var11[var8][var9] + var11[var7][var10] + var11[var8][var10] >> 2;
        int var14 = (this.field3109 << 7) + (var5 << 6);
        return var3.method97(var14, var13, var11, (byte) 100, var12, this.field3095, this.field3098, this.field3105, this.field3102);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1038(Component arg0, byte arg1) {
        field3099++;
        if (arg1 > -114) {
            field3107 = 37;
        }
        arg0.removeMouseListener(class95.field1781);
        arg0.removeMouseMotionListener(class95.field1781);
        arg0.removeFocusListener(class95.field1781);
        class25.field521 = 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIBIII)I")
    public static final int method1039(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 76) {
            method1041((byte) 47);
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg5;
            arg5 = var7;
        }
        field3101++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg0;
        } else {
            return 1 + 7 - arg5 - arg6;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lqf;I)Lqf;")
    public static final class150 method1040(class150 arg0, int arg1) {
        field3108++;
        if (arg1 != 100) {
            field3116 = null;
        }
        class150 var2 = class125.method767(-7472, arg0);
        if (var2 == null) {
            var2 = arg0.field2788;
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIIIZLac;)V")
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class4 arg8) {
        this.field3109 = arg5;
        this.field3098 = arg2;
        this.field3104 = arg3;
        this.field3102 = arg1;
        this.field3097 = arg0;
        this.field3103 = arg4;
        if (arg6 != -1) {
            this.field3105 = class159.method1021((byte) 108, arg6);
            this.field3095 = 0;
            this.field3100 = field3107 - 1;
            if (this.field3105.field3355 == 0 && arg8 != null && arg8 instanceof class162) {
                class162 var10 = (class162) arg8;
                if (this.field3105 == var10.field3105) {
                    this.field3100 = var10.field3100;
                    this.field3095 = var10.field3095;
                    return;
                }
            }
            if (arg7 && this.field3105.field3371 != -1) {
                this.field3095 = (int) (Math.random() * (double) this.field3105.field3379.length);
                this.field3100 -= (int) ((double) this.field3105.field3384[this.field3095] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static void method1041(byte arg0) {
        if (arg0 != -16) {
            method1040(null, 87);
        }
        field3094 = null;
        field3110 = null;
        field3111 = null;
        field3116 = null;
        field3113 = null;
        field3114 = null;
    }
}
