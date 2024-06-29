import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class508 {

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Ler;")
    private class157 field7558 = new class157(64);

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lns;")
    public class438 field7554;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Lns;")
    private class438 field7559;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Z")
    public static boolean field7560 = false;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lhh;")
    public static class125 field7556;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lns;")
    public static class438 field7553;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field7561;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V")
    public final void method3028(int arg0, boolean arg1) {
        class157 var3 = this.field7558;
        synchronized (this.field7558) {
            if (arg1) {
                this.method3031(69);
            }
            this.field7558.method1016(arg0, (byte) 124);
        }
        field7562++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Llm;")
    public final class31 method3029(int arg0, int arg1) {
        field7557++;
        if (arg0 != 17801) {
            return null;
        }
        class157 var3 = this.field7558;
        class31 var4;
        synchronized (this.field7558) {
            var4 = (class31) this.field7558.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7559.method2650(arg1, -61, 3);
        class31 var6 = new class31();
        var6.field482 = this;
        if (var5 != null) {
            var6.method225(28109, new class91(var5));
        }
        class157 var7 = this.field7558;
        synchronized (this.field7558) {
            this.field7558.method1012(arg0 ^ 0xFFFFBA04, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method3030(byte arg0) {
        field7553 = null;
        field7561 = null;
        field7556 = null;
        int var1 = 0 % ((arg0 - 69) / 37);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method3031(int arg0) {
        if (arg0 < 27) {
            return;
        }
        class157 var2 = this.field7558;
        synchronized (this.field7558) {
            this.field7558.method1015((byte) 95);
        }
        field7555++;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lgo;ILns;Lns;)V")
    public class508(class331 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field7554 = arg3;
        this.field7559 = arg2;
        this.field7559.method2645(1, 3);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public final void method3032(int arg0) {
        field7552++;
        class157 var2 = this.field7558;
        synchronized (this.field7558) {
            if (arg0 >= 53) {
                this.field7558.method1022((byte) -34);
            }
        }
    }

    static {
        new class375("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
