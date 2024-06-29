import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class583 {

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "I")
    private int field8105 = 0;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public int field8093;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "[Lns;")
    public class627[] field8094;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field8091 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "J")
    private long field8089;

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "Lns;")
    private class627 field8103;

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "Lns;")
    private class627 field8104;

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "Lkha;")
    public static class687 field8102;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)I", line = 7)
    public final int method3244(byte arg0) {
        field8101++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field8093; var3++) {
            class627 var4 = this.field8094[var3];
            class627 var5 = var4.field8744;
            while (var4 != var5) {
                var5 = var5.field8744;
                var2++;
            }
        }
        if (arg0 <= 125) {
            this.field8093 = 88;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)Lns;", line = 38)
    public final class627 method3245(boolean arg0) {
        field8096++;
        this.field8105 = 0;
        if (arg0) {
            field8091 = null;
        }
        return this.method3252(12938);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)Lns;", line = 54)
    public final class627 method3246(byte arg0) {
        field8092++;
        if (this.field8103 == null) {
            return null;
        }
        if (arg0 != 60) {
            this.method3253(-16);
        }
        class627 var2 = this.field8094[(int) ((long) (this.field8093 - 1) & this.field8089)];
        while (this.field8103 != var2) {
            if (this.field8103.field8746 == this.field8089) {
                class627 var3 = this.field8103;
                this.field8103 = this.field8103.field8744;
                return var3;
            }
            this.field8103 = this.field8103.field8744;
        }
        this.field8103 = null;
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(Z)V", line = 88)
    public static void method3247(boolean arg0) {
        if (!arg0) {
            method3247(true);
        }
        field8102 = null;
        field8091 = null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(JI)Lns;", line = 103)
    public final class627 method3248(long arg0, int arg1) {
        this.field8089 = arg0;
        if (arg1 != 0) {
            this.method3250(null, -51);
        }
        field8099++;
        class627 var4 = this.field8094[(int) ((long) (this.field8093 - 1) & arg0)];
        for (this.field8103 = var4.field8744; this.field8103 != var4; this.field8103 = this.field8103.field8744) {
            if (this.field8103.field8746 == arg0) {
                class627 var5 = this.field8103;
                this.field8103 = this.field8103.field8744;
                return var5;
            }
        }
        this.field8103 = null;
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(JLns;B)V", line = 132)
    public final void method3249(long arg0, class627 arg1, byte arg2) {
        field8090++;
        if (arg1.field8742 != null) {
            arg1.method3426((byte) -31);
        }
        int var5 = 89 / ((-arg2 - 16) / 48);
        class627 var6 = this.field8094[(int) ((long) (this.field8093 - 1) & arg0)];
        arg1.field8744 = var6;
        arg1.field8742 = var6.field8742;
        arg1.field8742.field8744 = arg1;
        arg1.field8746 = arg0;
        arg1.field8744.field8742 = arg1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "([Lns;I)I", line = 154)
    public final int method3250(class627[] arg0, int arg1) {
        field8097++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field8093; var4++) {
            class627 var5 = this.field8094[var4];
            for (class627 var6 = var5.field8744; var6 != var5; var6 = var6.field8744) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(Z)V", line = 186)
    public final void method3251(boolean arg0) {
        field8095++;
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field8093; var2++) {
            class627 var3 = this.field8094[var2];
            while (true) {
                class627 var4 = var3.field8744;
                if (var3 == var4) {
                    break;
                }
                var4.method3426((byte) -73);
            }
        }
        this.field8103 = null;
        this.field8104 = null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)Lns;", line = 219)
    public final class627 method3252(int arg0) {
        field8100++;
        if (this.field8105 > 0 && this.field8094[this.field8105 - 1] != this.field8104) {
            class627 var2 = this.field8104;
            this.field8104 = var2.field8744;
            return var2;
        }
        if (arg0 != 12938) {
            this.method3253(-37);
        }
        while (this.field8105 < this.field8093) {
            class627 var3 = this.field8094[this.field8105++].field8744;
            if (this.field8094[this.field8105 - 1] != var3) {
                this.field8104 = var3.field8744;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)I", line = 251)
    public final int method3253(int arg0) {
        field8098++;
        if (arg0 != -18518) {
            field8102 = null;
        }
        return this.field8093;
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(I)V", line = 262)
    public class583(int arg0) {
        this.field8093 = arg0;
        this.field8094 = new class627[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class627 var3 = this.field8094[var2] = new class627();
            var3.field8744 = var3;
            var3.field8742 = var3;
        }
    }
}
