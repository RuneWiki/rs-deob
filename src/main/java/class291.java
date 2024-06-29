import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class291 extends class15 {

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public int field4823 = 0;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "Lce;")
    private static class126 field4816 = class206.method1445(-7923, "Loaded wordpack");

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Lce;")
    public static class126 field4821 = class206.method1445(-7923, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "Lce;")
    public static class126 field4818 = field4816;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "Lml;")
    public static class160 field4819 = new class160(50);

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "Lce;")
    public static class126 field4824 = class206.method1445(-7923, " ");

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "[Lmh;")
    public static class271[] field4826 = new class271[50];

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "[[Lwd;")
    public static class112[][] field4825;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method1927(boolean arg0) {
        field4817++;
        class32.field457.method1185(1);
        if (arg0) {
            method1927(false);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 16)
    public static void method1928(int arg0) {
        if (arg0 != 0) {
            method1931(-102, -82);
        }
        field4818 = null;
        field4824 = null;
        field4816 = null;
        field4821 = null;
        field4825 = (class112[][]) null;
        field4826 = null;
        field4819 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbb;BI)V", line = 34)
    private final void method1929(class134 arg0, byte arg1, int arg2) {
        if (arg2 == 2) {
            this.field4823 = arg0.method942(true);
        }
        if (arg1 >= 40) {
            field4815++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLbb;)V", line = 58)
    public final void method1930(boolean arg0, class134 arg1) {
        while (true) {
            int var3 = arg1.method948(-125);
            if (var3 == 0) {
                field4820++;
                if (arg0) {
                    field4822 = -71;
                }
                return;
            }
            this.method1929(arg1, (byte) 45, var3);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V", line = 83)
    public static final void method1931(int arg0, int arg1) {
        class5 var2 = class297.field4940[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class5 var4 = class297.field4940[var3][arg0][arg1] = class297.field4940[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field59--;
                for (int var5 = 0; var5 < var4.field61; var5++) {
                    class240 var6 = var4.field54[var5];
                    if ((var6.field4045 >> 29 & 0x3L) == 2L && var6.field4041 == arg0 && var6.field4046 == arg1) {
                        var6.field4049--;
                    }
                }
            }
        }
        if (class297.field4940[0][arg0][arg1] == null) {
            class297.field4940[0][arg0][arg1] = new class5(0, arg0, arg1);
        }
        class297.field4940[0][arg0][arg1].field38 = var2;
        class297.field4940[3][arg0][arg1] = null;
    }
}
