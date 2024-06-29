import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class41 extends class143 {

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[J")
    private long[] field759 = new long[10];

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    private int field764 = 0;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    private int field765 = 1;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    private int field768 = 256;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "J")
    private long field777 = class116.method712((byte) -77);

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Lsg;")
    private static class169 field766 = class165.method1060("Please try again)3", 1536);

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Lsg;")
    private static class169 field762 = class165.method1060("Loading config )2 ", 1536);

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "Lsg;")
    public static class169 field773 = class165.method1060(":chalreq:", 1536);

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Lsg;")
    public static class169 field775 = field766;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Lsg;")
    public static class169 field778 = class165.method1060("Geben Sie Ihren Benutzernamen", 1536);

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "Lsg;")
    public static class169 field779 = field762;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "[I")
    public static int[] field770;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "[[I")
    public static int[][] field771;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Z")
    public static final boolean method264(int arg0, boolean arg1) {
        field774++;
        if (!arg1) {
            method266((byte) 6);
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public final void method265(int arg0) {
        int var2 = 0;
        if (arg0 >= -126) {
            return;
        }
        while (var2 < 10) {
            this.field759[var2] = 0L;
            var2++;
        }
        field760++;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static void method266(byte arg0) {
        field779 = null;
        int var1 = -112 % ((49 - arg0) / 58);
        field762 = null;
        field773 = null;
        field766 = null;
        field778 = null;
        field770 = null;
        field775 = null;
        field771 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lqf;IIIIIBI)V")
    public static final void method267(class150 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field767++;
        if (class142.field2636) {
            class26.field550 = 32;
        } else {
            class26.field550 = 0;
        }
        class142.field2636 = false;
        if (class32.field684 != 0) {
            if (arg2 >= arg1 && arg2 < arg1 + 16 && arg3 <= arg5 && arg5 < arg3 + 16) {
                arg0.field2811 -= 4;
                class64.method404(97, arg0);
            } else if (arg2 >= arg1 && arg1 + 16 > arg2 && arg5 >= arg3 + arg7 - 16 && arg5 < arg3 + arg7) {
                arg0.field2811 += 4;
                class64.method404(120, arg0);
            } else if (arg1 - class26.field550 <= arg2 && arg2 < arg1 + class26.field550 + 16 && arg5 >= arg3 + 16 && arg5 < arg3 + arg7 - 16) {
                int var8 = (arg7 - 32) * arg7 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - var8 / 2 - arg3 - 16;
                int var10 = arg7 - var8 - 32;
                arg0.field2811 = (arg4 - arg7) * var9 / var10;
                class64.method404(112, arg0);
                class142.field2636 = true;
            }
        }
        if (arg6 >= -105 || class115.field2118 == 0) {
            return;
        }
        int var11 = arg0.field2875;
        if (arg1 - var11 <= arg2 && arg5 >= arg3 && arg2 < arg1 + 16 && arg5 <= arg3 + arg7) {
            arg0.field2811 += class115.field2118 * 45;
            class64.method404(111, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
    public static final int method268(int arg0, int arg1) {
        if (arg0 != 8651) {
            field766 = null;
        }
        field772++;
        return arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Component;II)Lsc;")
    public static final class165 method269(int arg0, Component arg1, int arg2, int arg3) {
        field776++;
        try {
            if (arg0 != 19771) {
                field766 = null;
            }
            Class var4 = Class.forName("ng");
            class165 var5 = (class165) var4.getDeclaredConstructor().newInstance();
            var5.method764((byte) -10, arg2, arg1, arg3);
            return var5;
        } catch (Throwable var7) {
            class144 var6 = new class144();
            var6.method764((byte) -10, arg2, arg1, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class41() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field759[var1] = this.field777;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I")
    public final int method270(int arg0, int arg1, int arg2) {
        field763++;
        int var4 = this.field765;
        int var5 = this.field768;
        this.field765 = 1;
        if (arg2 <= 92) {
            this.field759 = null;
        }
        this.field768 = 300;
        this.field777 = class116.method712((byte) -51);
        if (this.field759[this.field761] == 0L) {
            this.field768 = var5;
            this.field765 = var4;
        } else if (this.field777 > this.field759[this.field761]) {
            this.field768 = (int) ((long) (arg0 * 2560) / (this.field777 - this.field759[this.field761]));
        }
        if (this.field768 < 25) {
            this.field768 = 25;
        }
        if (this.field768 > 256) {
            this.field768 = 256;
            this.field765 = (int) ((long) arg0 - (this.field777 - this.field759[this.field761]) / 10L);
        }
        if (this.field765 > arg0) {
            this.field765 = arg0;
        }
        this.field759[this.field761] = this.field777;
        this.field761 = (this.field761 + 1) % 10;
        if (this.field765 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field759[var6] != 0L) {
                    this.field759[var6] += this.field765;
                }
            }
        }
        int var7 = 0;
        if (arg1 > this.field765) {
            this.field765 = arg1;
        }
        client.method203((long) this.field765, (byte) -104);
        while (this.field764 < 256) {
            this.field764 += this.field768;
            var7++;
        }
        this.field764 &= 0xFF;
        return var7;
    }
}
