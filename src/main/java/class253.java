import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class253 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[I")
    public static int[] field4364 = new int[100];

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4363 = -1;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[I")
    public static int[] field4361 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
    public static int[] field4369 = new int[32];

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Ljd;")
    public static class85 field4366 = class221.method1499("Bitte entfernen Sie ", (byte) -69);

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Ljd;")
    public static class85 field4375 = class221.method1499(")1j", (byte) -126);

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Ljd;")
    public static class85 field4374 = class221.method1499("Angreifen", (byte) 109);

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "J")
    public long field4377;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lfg;")
    public static class12 field4365;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lof;")
    public class253 field4370;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lof;")
    public class253 field4372;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Ljf;")
    public static class62 field4367;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static final void method1747(boolean arg0) {
        if (arg0) {
            class245.field4193 = class135.field2348;
            class99.field1780 = class168.field2885;
        } else {
            class245.field4193 = class225.field3920;
            class99.field1780 = class226.field3935;
        }
        class272.field4811 = class99.field1780.length;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lge;B)V")
    public static final void method1748(class68 arg0, byte arg1) {
        class102.field1826 = arg0.method482(-47, class196.field3379);
        if (arg1 >= -82) {
            method1751((class201) null, (byte) -96, (class201) null);
        }
        field4371++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Z")
    public final boolean method1749(int arg0) {
        if (arg0 != 4) {
            this.field4377 = 24L;
        }
        field4378++;
        return this.field4372 != null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILge;BI)Z")
    public static final boolean method1750(int arg0, class68 arg1, byte arg2, int arg3) {
        field4362++;
        if (arg2 <= 110) {
            field4374 = null;
        }
        byte[] var4 = arg1.method464(-1, arg3, arg0);
        if (var4 == null) {
            return false;
        } else {
            class13.method104(var4, (byte) 33);
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lcc;BLcc;)V")
    public static final void method1751(class201 arg0, byte arg1, class201 arg2) {
        if (arg1 <= 72) {
            method1752(68);
        }
        field4373++;
        if (arg2.field3498 != null) {
            arg2.method1380(true);
        }
        arg2.field3498 = arg0;
        arg2.field3503 = arg0.field3503;
        arg2.field3498.field3503 = arg2;
        arg2.field3503.field3498 = arg2;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method1752(int arg0) {
        if (arg0 != 19) {
            field4361 = null;
        }
        field4374 = null;
        field4365 = null;
        field4369 = null;
        field4364 = null;
        field4361 = null;
        field4375 = null;
        field4366 = null;
        field4367 = null;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public final void method1753(int arg0) {
        field4368++;
        if (this.field4372 == null) {
            return;
        }
        this.field4372.field4370 = this.field4370;
        this.field4370.field4372 = this.field4372;
        if (arg0 != 137) {
            field4374 = null;
        }
        this.field4372 = null;
        this.field4370 = null;
    }
}
