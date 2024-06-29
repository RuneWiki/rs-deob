import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class20 {

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public int field273 = 0;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Ljava/lang/String;")
    public static String field271 = "Face here";

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    public static int[] field268 = new int[1000];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lfa;")
    public static class273 field276;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLma;)V")
    public final void method119(byte arg0, class202 arg1) {
        field275++;
        if (arg0 != -68) {
            return;
        }
        while (true) {
            int var3 = arg1.method1420((byte) 0);
            if (var3 == 0) {
                return;
            }
            this.method122(5, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method120(int arg0) {
        field268 = null;
        field276 = null;
        field271 = null;
        if (arg0 != 255) {
            method120(-27);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
    public static final void method121(boolean arg0, int arg1) {
        byte[][] var2 = class242.field3841;
        field277++;
        int var3 = class225.field3574.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class53.field718[var4] >> 8) * 64 - class101.field1517;
                int var7 = (class53.field718[var4] & 0xFF) * 64 - class254.field4063;
                class217.method1521(1);
                class194.method1345(var6, var5, 116, arg0, class183.field2841, var7);
            }
        }
        if (arg1 <= 19) {
            field270 = 126;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILma;)V")
    private final void method122(int arg0, int arg1, class202 arg2) {
        field274++;
        if (arg0 == arg1) {
            this.field273 = arg2.method1419(123);
        }
    }
}
