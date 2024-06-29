import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class171 extends class87 {

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Lej;")
    public static class104 field2471 = new class104("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "Loca;")
    public static class221 field2476 = new class221(2, 4, 4, 0);

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Z")
    public boolean field2468;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        if (arg0 != 1) {
            field2476 = null;
        }
        field2466++;
        return false;
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        if (arg0 != 1) {
            this.method258(83, true, 54, 74, null, -96, null);
        }
        field2465++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)Loca;")
    public static final class221 method1088(int arg0, int arg1) {
        if (arg1 != 30824) {
            field2475 = -70;
        }
        field2467++;
        class221[] var2 = class343.method2078(-1891794109);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field3157 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        if (arg2 < 79) {
            this.field2469 = -103;
        }
        field2474++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method1089(int arg0) {
        int var1 = -122 / ((arg0 + 6) / 54);
        field2471 = null;
        field2476 = null;
    }
}
