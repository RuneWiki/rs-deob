import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class449 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    private int field6631;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lcm;")
    public static class449 field6636;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field6635;

    static {
        new class375("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field6636 = new class449(45, 3);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2712(boolean arg0) {
        if (!arg0) {
            field6636 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZ)I", line = 18)
    public static final int method2713(int arg0, int arg1, boolean arg2) {
        field6632++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2) {
            return 57;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I", line = 41)
    public final int method2714(int arg0) {
        if (arg0 < 122) {
            method2713(-23, 70, false);
        }
        field6633++;
        return this.field6631;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I", line = 62)
    public static final int method2715(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
        field6634++;
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = 54 / ((arg1 - 38) / 35);
        int var5 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V", line = 76)
    public class449(int arg0, int arg1) {
        this.field6631 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "toString", descriptor = "()Ljava/lang/String;", line = 86)
    public final String toString() {
        field6635++;
        throw new IllegalStateException();
    }
}
