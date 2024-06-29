import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class283 extends class221 {

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
    public static int[] field4462 = new int[4096];

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "[I")
    public static int[] field4466 = new int[100];

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "Ltl;")
    public static class222 field4467 = new class222(64);

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field4470 = 0;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "[Lk;")
    public static class249[] field4472 = new class249[8];

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field4474 = -1;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "Ltl;")
    public static class222 field4471 = new class222(500);

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lkb;")
    public static class39 field4465;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Lkb;")
    public static class39 field4475;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 7)
    public static void method2002(int arg0) {
        field4475 = null;
        field4467 = null;
        field4471 = null;
        field4465 = null;
        field4466 = null;
        field4472 = null;
        if (arg0 != 7) {
            field4475 = (class39) null;
        }
        field4462 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lok;II)Ljava/lang/String;", line = 28)
    public static final String method2003(class160 arg0, int arg1, int arg2) {
        field4463++;
        if (!client.method1913(arg0).method1171(8, arg2) && arg0.field2440 == null) {
            return null;
        } else if (arg0.field2578 == null || arg0.field2578.length <= arg2 || arg0.field2578[arg2] == null || arg0.field2578[arg2].trim().length() == 0) {
            return class147.field2201 ? "Hidden-" + arg2 : null;
        } else {
            if (arg1 != -3262) {
                method2005((byte) 122);
            }
            return arg0.field2578[arg2];
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V", line = 56)
    public static final void method2004(int arg0, int arg1) {
        field4468++;
        class179 var2 = class319.method2220(arg1, (byte) -35, 7);
        if (arg0 != 24466) {
            method2005((byte) -116);
        }
        var2.method1239(true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 69)
    public static final void method2005(byte arg0) {
        if (class334.field5188 != null) {
            class17 var1 = class334.field5188;
            synchronized (class334.field5188) {
                class334.field5188 = null;
            }
        }
        field4469++;
        int var3 = 38 % ((7 - arg0) / 50);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lkb;I)V", line = 89)
    public static final void method2006(class39 arg0, int arg1) {
        if (arg1 != 22223) {
            field4472 = (class249[]) null;
        }
        class335.field5203 = arg0.method266(-124, "titlebg");
        class151.field2311 = arg0.method266(-97, "logo");
        field4473++;
    }
}
