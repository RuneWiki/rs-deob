import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class253 extends class197 {

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "Loh;")
    public static class258 field4355 = class153.method1046("Lade Liste der Welten", 94);

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "Lmb;")
    public static class172 field4350 = new class172(4);

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    public static int field4358 = -1;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "Loh;")
    public static class258 field4360 = class153.method1046("<col=ff0000>", 89);

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "Loh;")
    public static class258 field4359 = class153.method1046("(U5", 92);

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "Lmb;")
    public static class172 field4357 = new class172(100);

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "Loh;")
    public static class258 field4361 = class153.method1046("Clientscript error in: ", 93);

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "I")
    public static int field4362 = 2301979;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "Lud;")
    public static class38 field4356;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            return (int[]) null;
        }
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            class275.method1931(var3, 0, class190.field3362, class268.field4670[arg1]);
        }
        field4354++;
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 28)
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(B)V", line = 32)
    public static final void method1713(byte arg0) {
        if (arg0 == 108) {
            class107.method795(0, 58, 0);
            field4351++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B[B)[B", line = 43)
    public static final byte[] method1714(byte arg0, byte[] arg1) {
        field4353++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class275.method1932(arg1, 0, var2, 0, arg1.length);
            int var3 = -105 % ((arg0 + 40) / 49);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 63)
    public static void method1715(int arg0) {
        field4357 = null;
        field4360 = null;
        int var1 = 80 % ((arg0 - 15) / 43);
        field4356 = null;
        field4361 = null;
        field4359 = null;
        field4350 = null;
        field4355 = null;
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "(B)V", line = 83)
    public static final void method1716(byte arg0) {
        class243.field4214.method1161(-79);
        field4352++;
        class167.field2834.method1161(62);
        if (arg0 != -115) {
            method1713((byte) 96);
        }
    }
}
