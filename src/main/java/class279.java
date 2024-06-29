import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public abstract class class279 {

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "Lpj;")
    public class38 field4267;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "Leda;")
    public static class14 field4264 = new class14(4);

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "[Lbfa;")
    public static class573[] field4271 = new class573[2048];

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
    public static int field4273 = 0;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "Z")
    public static boolean field4272;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
    public abstract void method443(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)Z")
    public abstract boolean method438(byte arg0);

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V")
    public void method1818(byte arg0) {
        if (arg0 > 45) {
            field4263++;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public void method439(int arg0) {
        if (arg0 != -6910) {
            field4264 = null;
        }
        field4266++;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZI)V")
    public abstract void method435(boolean arg0, int arg1);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V")
    public abstract void method442(boolean arg0);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lraa;B)Ljava/lang/String;")
    public static final String method1819(class353 arg0, byte arg1) {
        field4262++;
        if (client.method2735(arg0).method1866(1092) == 0) {
            return null;
        } else if (arg0.field5334 == null || arg0.field5334.trim().length() == 0) {
            return class107.field1563 ? "Hidden-use" : null;
        } else if (arg1 <= 43) {
            return null;
        } else {
            return arg0.field5334;
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
    public static void method1820(int arg0) {
        if (arg0 != 4) {
            method1820(-69);
        }
        field4271 = null;
        field4264 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BZ)V")
    public abstract void method441(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V")
    public void method433(int arg0) {
        if (arg0 <= 109) {
            field4271 = null;
        }
        field4268++;
    }

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)V")
    public void method436(int arg0) {
        field4269++;
        if (arg0 != 0) {
            method1820(62);
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lpj;)V")
    public class279(class38 arg0) {
        this.field4267 = arg0;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZLiu;)V")
    public abstract void method437(int arg0, boolean arg1, class506 arg2);

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)V")
    public void method434(int arg0) {
        if (arg0 != -1) {
            field4272 = false;
        }
        field4270++;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(Z)V")
    public void method440(boolean arg0) {
        if (!arg0) {
            field4265++;
        }
    }
}
