import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lhj;")
    public static class69 field185 = class181.method1318("<br>(X100(U(Y", (byte) -125);

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Z")
    public static boolean field189 = false;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field190 = 0;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[S")
    public static short[] field194 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field191 = -1;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lne;")
    public static class49 field192;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    public static int[] field186;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
    public static int[] field187;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "[Lqb;")
    public static class56[] field195;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method71(int arg0) {
        field186 = null;
        field187 = null;
        field195 = null;
        field192 = null;
        if (arg0 != -16546) {
            method72((byte) -117);
        }
        field194 = null;
        field185 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static final void method72(byte arg0) {
        field188++;
        if (class34.field473 == null) {
            return;
        }
        try {
            if (arg0 != 97) {
                field189 = true;
            }
            byte[] var1 = class34.field473.method1117((byte) 46);
            if (var1 != null) {
                class128 var2 = new class128(var1);
                class46.field660 = var2.method912(-121);
                class3.field8 = new class152[class46.field660];
                for (int var3 = 0; var3 < class46.field660; var3++) {
                    class152 var4 = class3.field8[var3] = new class152();
                    int var5 = var2.method912(75);
                    var4.field2838 = (var5 & 0x8000) != 0;
                    var4.field2832 = var5 & 0x7FFF;
                    var4.field2836 = var2.method963(false);
                    var4.field2839 = var2.method955((byte) 78);
                    var4.field2830 = var3;
                    int var6 = var2.method912(arg0 + 27);
                    var4.field2829 = class210.method1517(var6, arg0 ^ 0xA);
                }
                class91.method644(class3.field8, (byte) 46, 0, class3.field8.length - 1);
                class34.field473 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class34.field473 = null;
        }
    }
}
