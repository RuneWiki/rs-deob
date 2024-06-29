import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class292 extends class83 {

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Ljava/lang/String;")
    public String field4667;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field4663 = -1;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field4664 = 0;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "[I")
    public static int[] field4668 = new int[32768];

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
    public static int[] field4670 = new int[32];

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "B")
    public static byte field4662;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lvh;")
    public static class108 field4661;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lbl;")
    public static class137 field4666;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public static void method1972(int arg0) {
        if (arg0 != 64) {
            method1973((byte) -7, true);
        }
        field4668 = null;
        field4661 = null;
        field4670 = null;
        field4666 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BZ)V")
    public static final void method1973(byte arg0, boolean arg1) {
        field4669++;
        if (arg0 != -68) {
            return;
        }
        byte[][] var2 = class163.field2695;
        int var3 = class61.field1059.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class276.field4405[var4] >> 8) * 64 - class126.field2206;
                int var7 = (class276.field4405[var4] & 0xFF) * 64 - class255.field4162;
                class97.method614(32067);
                class273.method1790(var7, class99.field1699, var6, (byte) -99, var5, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lvh;BLvh;)V")
    public static final void method1974(class108 arg0, byte arg1, class108 arg2) {
        class42.field619 = arg0;
        class199.field3236 = arg2;
        if (arg1 < 122) {
            field4666 = null;
        }
        field4665++;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class292() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class292(String arg0) {
        this.field4667 = arg0;
    }
}
