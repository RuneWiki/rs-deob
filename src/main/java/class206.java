import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class206 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
    private int[] field4026;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lnd;")
    public static class122 field4027 = new class122();

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4029 = 0;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lkb;")
    private static class93 field4032 = class76.method390("Loaded wordpack", 0);

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lkb;")
    public static class93 field4028 = field4032;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4033 = 0;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[Lkb;")
    public static class93[] field4031 = new class93[100];

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "[Ldd;")
    public static class34[] field4035 = new class34[2048];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lme;")
    public static class114 field4030;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[I")
    public static int[] field4034;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method1340(int arg0) {
        class153.field2993 = null;
        class100.field1844 = null;
        class35.field577 = null;
        class82.field1513 = null;
        class103.field1895 = null;
        class64.field1010 = null;
        if (arg0 != -23557) {
            method1340(-29);
        }
        field4024++;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static void method1341(int arg0) {
        field4032 = null;
        field4030 = null;
        field4027 = null;
        field4035 = null;
        if (arg0 != 1) {
            field4034 = null;
        }
        field4034 = null;
        field4031 = null;
        field4028 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)I")
    public final int method1342(int arg0, byte arg1) {
        field4025++;
        if (arg1 >= -43) {
            this.method1342(-14, (byte) -112);
        }
        int var3 = (this.field4026.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4026[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4026[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([I)V")
    public class206(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field4026 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4026[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4026[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field4026[var5 + var5] = arg0[var4];
            this.field4026[var5 + var5 + 1] = var4++;
        }
    }
}
