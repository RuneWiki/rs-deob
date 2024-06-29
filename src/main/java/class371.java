import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class371 {

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "Lab;")
    public class472 field5516 = new class472();

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "Llt;")
    public static class475 field5508 = new class475(16);

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "[I")
    public static int[] field5513 = new int[50];

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "[Lkf;")
    public static class166[] field5520;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "Lsl;")
    public static class318 field5518;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "[Lah;")
    public static class261[] field5521;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "Lgk;")
    public static class331 field5523;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Lab;")
    private class472 field5517;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "[[B")
    public static byte[][] field5515;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Luu;")
    public static final class188 method2286(int arg0, int arg1) {
        field5506++;
        if (arg0 != 0) {
            method2290(127, (byte) 47, null, null);
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class123.field1803[var2] == null || class123.field1803[var2][var3] == null) {
            boolean var4 = class518.method3081(arg0 ^ 0xFFFFFF81, var2);
            if (!var4) {
                return null;
            }
        }
        return class123.field1803[var2][var3];
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public final void method2287(int arg0) {
        while (true) {
            class472 var2 = this.field5516.field6968;
            if (this.field5516 == var2) {
                field5512++;
                this.field5517 = null;
                if (arg0 < 118) {
                    field5522 = 83;
                    return;
                }
                return;
            }
            var2.method2858(10009);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public static void method2288(boolean arg0) {
        if (arg0) {
            field5519 = 30;
        }
        field5515 = null;
        field5508 = null;
        field5520 = null;
        field5521 = null;
        field5518 = null;
        field5523 = null;
        field5513 = null;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)Lab;")
    public final class472 method2289(boolean arg0) {
        field5509++;
        if (!arg0) {
            field5520 = null;
        }
        class472 var2 = this.field5517;
        if (this.field5516 == var2) {
            this.field5517 = null;
            return null;
        } else {
            this.field5517 = var2.field6968;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBLfd;Ljava/lang/String;)Ltd;")
    public static final class315 method2290(int arg0, byte arg1, class365 arg2, String arg3) {
        field5510++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        if (arg1 != 62) {
            field5508 = null;
        }
        OpenGL.glProgramStringARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class206.field2997, 0);
        if (class206.field2997[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class315(arg2, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLab;)V")
    public final void method2291(boolean arg0, class472 arg1) {
        if (arg1.field6967 != null) {
            arg1.method2858(10009);
        }
        field5507++;
        arg1.field6968 = this.field5516;
        if (arg0) {
            arg1.field6967 = this.field5516.field6967;
            arg1.field6967.field6968 = arg1;
            arg1.field6968.field6967 = arg1;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Lab;")
    public final class472 method2292(int arg0) {
        if (arg0 != 50) {
            this.method2289(true);
        }
        field5511++;
        class472 var2 = this.field5516.field6968;
        if (this.field5516 == var2) {
            this.field5517 = null;
            return null;
        } else {
            this.field5517 = var2.field6968;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)I")
    public final int method2293(int arg0) {
        field5514++;
        int var2 = 0;
        class472 var3 = this.field5516.field6968;
        while (this.field5516 != var3) {
            var3 = var3.field6968;
            var2++;
        }
        int var4 = -60 / ((-arg0 - 23) / 38);
        return var2;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
    public class371() {
        this.field5516.field6967 = this.field5516;
        this.field5516.field6968 = this.field5516;
    }

    static {
        new class331("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field5519 = 0;
        field5520 = new class166[0];
        field5518 = new class318(61, 2);
        field5521 = new class261[16];
        field5522 = 0;
        field5523 = new class331("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
    }
}
