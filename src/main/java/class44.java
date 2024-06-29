import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class44 extends class240 {

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "Ljava/lang/Object;")
    private Object field623;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "[[Z")
    public static boolean[][] field627 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "Lkn;")
    public static class442 field628 = new class442("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "Lnq;")
    public static class268 field622;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z", line = 6)
    public final boolean method393(boolean arg0) {
        if (arg0) {
            field622 = null;
        }
        field625++;
        return false;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lt;Ljava/lang/Object;)V", line = 20)
    public class44(class400 arg0, Object arg1) {
        super(arg0);
        this.field623 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V", line = 28)
    public static void method394(int arg0) {
        if (arg0 <= 14) {
            method394(-89);
        }
        field628 = null;
        field627 = null;
        field622 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 43)
    public final Object method395(boolean arg0) {
        if (arg0) {
            field626++;
            return this.field623;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(BI)Leq;", line = 57)
    public static final class116 method396(byte arg0, int arg1) {
        field624++;
        class116 var2 = (class116) client.field2290.method2637((long) arg1, 18620);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class108.field1555.method1745(arg1, (byte) -100, 11);
        class116 var4 = new class116();
        if (var3 != null) {
            var4.method807((byte) 46, new class11(var3));
        }
        client.field2290.method2633((byte) -120, var4, (long) arg1);
        int var5 = -60 % ((3 - arg0) / 60);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(Z)V", line = 80)
    public static final void method397(boolean arg0) {
        field621++;
        if (class396.field5667) {
            return;
        }
        if (arg0) {
            field622 = null;
        }
        class61.method466((byte) -73, class276.field3836);
        if (class311.field4255 != null) {
            class61.method466((byte) -99, class311.field4255);
        }
        class396.field5667 = true;
    }
}
