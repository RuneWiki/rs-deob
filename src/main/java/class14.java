import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class14 extends class237 {

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field179 = -1;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field185 = 0;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lj;")
    public static class209 field175 = new class209(128);

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Leh;")
    public static class137 field182;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Leh;")
    public static class137 field188;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "Ltd;")
    public static class175 field187;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "[[I")
    public static int[][] field186;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public static void method72(int arg0) {
        field186 = null;
        field182 = null;
        field187 = null;
        field175 = null;
        field188 = null;
        if (arg0 != 0) {
            method75(-37, -81);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)V")
    public static final void method73(byte arg0, int arg1) {
        if (arg0 <= 61) {
            method76((class96) null, 79);
        }
        class57.field730.method1695(arg1, 0);
        field180++;
        class275.field4400.method1695(arg1, 0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V")
    public static final void method74(int arg0, boolean arg1) {
        field174++;
        if (arg0 == -1 || !class181.field2888[arg0]) {
            return;
        }
        class18.field224.method940((byte) -120, arg0);
        if (class75.field937[arg0] == null) {
            return;
        }
        boolean var2 = arg1;
        for (int var3 = 0; var3 < class75.field937[arg0].length; var3++) {
            if (class75.field937[arg0][var3] != null) {
                if (class75.field937[arg0][var3].field1778 == 2) {
                    var2 = false;
                } else {
                    class75.field937[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class75.field937[arg0] = null;
        }
        class181.field2888[arg0] = false;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Lvk;")
    public static final class140 method75(int arg0, int arg1) {
        field177++;
        class140 var2 = (class140) class253.field4118.method1693((long) arg1, arg0 ^ 0x55);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class19.field231.method928(arg1, (byte) 111, arg0);
        class140 var4 = new class140(var3);
        var4.method681(class258.field4179, (int[]) null);
        class253.field4118.method1694(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpd;I)Lkg;")
    public static final class103 method76(class96 arg0, int arg1) {
        field176++;
        class103 var2 = new class103();
        var2.field1390 = arg0.method549(arg1 + 256);
        if (arg1 != -1) {
            method74(71, false);
        }
        var2.field1391 = class155.method1065(var2.field1390, false);
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(II)V")
    public class14(int arg0, int arg1) {
        this.field178 = arg1;
        this.field181 = arg0;
    }
}
