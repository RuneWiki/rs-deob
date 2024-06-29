import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class182 extends class264 {

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "Lma;")
    public static class5 field2771 = class12.method119("Update)2Liste geladen)3", (byte) 114);

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    public static int field2772 = -1;

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "Ltj;")
    public static class73 field2774 = new class73(200);

    @OriginalMember(owner = "client!qg", name = "nb", descriptor = "Z")
    public static boolean field2778 = false;

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "Lma;")
    private static class5 field2776 = class12.method119("wishes to trade with you)3", (byte) 66);

    @OriginalMember(owner = "client!qg", name = "mb", descriptor = "Lma;")
    public static class5 field2777 = field2776;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "Lje;")
    public static class158 field2775;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([IZ)[I", line = 9)
    public static final int[] method1187(int[] arg0, boolean arg1) {
        field2773++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        if (arg1) {
            class42.method293(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V", line = 29)
    public static void method1188(byte arg0) {
        field2771 = null;
        field2776 = null;
        field2774 = null;
        if (arg0 != -28) {
            method1187((int[]) null, false);
        }
        field2775 = null;
        field2777 = null;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 44)
    public class182() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)[I", line = 62)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 >= -58) {
            field2775 = (class158) null;
        }
        field2770++;
        int[] var3 = this.field4501.method1176(arg1, 124);
        if (this.field4501.field2741) {
            int[][] var4 = this.method1817(-115, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class226.field3716; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }
}
