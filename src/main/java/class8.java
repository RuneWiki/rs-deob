import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class8 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field157 = 0;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Z")
    private boolean field156 = false;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field168 = 0;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lvi;")
    public static class382 field166;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "J")
    public long field165;

    static {
        new class446("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field166 = new class382(0, 0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILnj;)V", line = 9)
    public final void method93(int arg0, class164 arg1) {
        while (true) {
            int var3 = arg1.method1087(false);
            if (var3 == 0) {
                if (arg0 <= 3) {
                    field152 = 38;
                }
                field153++;
                return;
            }
            this.method94(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLnj;I)V", line = 38)
    private final void method94(boolean arg0, class164 arg1, int arg2) {
        if (arg2 == 1) {
            this.field169 = arg1.method1074(-635989152);
        } else if (arg2 == 2) {
            arg1.method1087(false);
        } else if (arg2 == 3) {
            this.field159 = arg1.method1099(104);
            this.field154 = arg1.method1099(78);
            this.field164 = arg1.method1099(-108);
        } else if (arg2 == 4) {
            this.field161 = arg1.method1087(false);
            this.field162 = arg1.method1099(125);
        } else if (arg2 == 6) {
            this.field170 = arg1.method1087(!arg0);
        } else if (arg2 == 8) {
            this.field168 = 1;
        } else if (arg2 == 9) {
            this.field157 = 1;
        } else if (arg2 == 10) {
            this.field156 = true;
        }
        if (!arg0) {
            method97(-41, 14, 73, -115);
        }
        field155++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 97)
    public static void method95(int arg0) {
        field166 = null;
        if (arg0 != -1) {
            method95(78);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 108)
    public final void method96(boolean arg0) {
        if (!arg0) {
            this.field162 = -55;
        }
        field158++;
        this.field160 = class428.field6501[this.field169 << 3];
        this.field163 = (int) Math.sqrt((double) (this.field159 * this.field159 + this.field164 * this.field164 + this.field154 * this.field154));
        if (this.field162 == 0) {
            this.field162 = 1;
        }
        if (this.field161 == 0) {
            this.field165 = 2147483647L;
        } else if (this.field161 == 1) {
            this.field165 = (this.field163 * 8 / this.field162);
            this.field165 *= this.field165;
        } else if (this.field161 == 2) {
            this.field165 = (this.field163 * 8 / this.field162);
        }
        if (this.field156) {
            this.field163 *= -1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V", line = 152)
    public static final void method97(int arg0, int arg1, int arg2, int arg3) {
        class452 var4 = class443.field6672[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class222 var5 = var4.field6809;
        class222 var6 = var4.field6815;
        if (var5 != null) {
            var5.field3101 = var5.field3101 * arg3 / (0x10 << class10.field179 - 7);
            var5.field3105 = var5.field3105 * arg3 / (0x10 << class10.field179 - 7);
        }
        if (var6 != null) {
            var6.field3101 = var6.field3101 * arg3 / (0x10 << class10.field179 - 7);
            var6.field3105 = var6.field3105 * arg3 / (0x10 << class10.field179 - 7);
        }
    }
}
