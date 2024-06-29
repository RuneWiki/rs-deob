import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class56 extends class82 {

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    private final int field937;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    private final int field941;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    private final int field942;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    private final int field945;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lcd;")
    public static class64 field940 = class44.method335((byte) 71, "Card:");

    @OriginalMember(owner = "client!b", name = "z", descriptor = "Lcd;")
    public static class64 field943 = class44.method335((byte) 71, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Z")
    public static boolean field944 = false;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field948 = 0;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Lig;")
    public static class168 field947 = new class168(50);

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static volatile int field949 = 0;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "Lcd;")
    public static class64 field950 = class44.method335((byte) 71, "Angreifen");

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Lcd;")
    public static class64 field951 = class44.method335((byte) 71, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIII)V", line = 12)
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field937 = arg2;
        this.field941 = arg3;
        this.field942 = arg0;
        this.field945 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V", line = 26)
    public static void method430(byte arg0) {
        field943 = null;
        field951 = null;
        field947 = null;
        field940 = null;
        if (arg0 < 45) {
            method431((byte) -112, 94, 16, 64, -120);
        }
        field950 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BIIII)V", line = 40)
    public static final void method431(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field939++;
        if (arg0 <= 10) {
            method430((byte) -20);
        }
        for (int var5 = 0; var5 < class241.field4161; var5++) {
            if (class194.field3300[var5] + class134.field2379[var5] > arg1 && arg1 + arg2 > class194.field3300[var5] && arg3 < (class47.field771[var5] + class230.field3900[var5]) && class230.field3900[var5] < (arg3 + arg4)) {
                class267.field4582[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lqm;II)Z", line = 69)
    public static final boolean method432(class222 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1588(true, arg1);
        if (arg2 != 2011695404) {
            return true;
        }
        field935++;
        if (var3 == null) {
            return false;
        } else {
            class114.method816(var3, (byte) 87);
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZII)V", line = 88)
    public final void method433(boolean arg0, int arg1, int arg2) {
        int var4 = this.field942 * arg1 >> 12;
        field946++;
        if (arg0) {
            int var5 = this.field937 * arg1 >> 12;
            int var6 = this.field945 * arg2 >> 12;
            int var7 = this.field941 * arg2 >> 12;
            class222.method1608(this.field1521, var7, (byte) 61, var5, var6, var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)V", line = 121)
    public final void method434(byte arg0, int arg1, int arg2) {
        field936++;
        if (arg0 >= -96) {
            field950 = (class64) null;
        }
        int var4 = this.field942 * arg2 >> 12;
        int var5 = this.field937 * arg2 >> 12;
        int var6 = this.field945 * arg1 >> 12;
        int var7 = this.field941 * arg1 >> 12;
        class114.method814((byte) 98, var7, var5, this.field1516, var6, this.field1521, this.field1510, var4);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB)V", line = 145)
    public final void method435(int arg0, int arg1, byte arg2) {
        int var4 = this.field942 * arg0 >> 12;
        field938++;
        if (arg2 != 111) {
            field951 = (class64) null;
        }
        int var5 = this.field937 * arg0 >> 12;
        int var6 = this.field945 * arg1 >> 12;
        int var7 = this.field941 * arg1 >> 12;
        class117.method834(var5, this.field1516, var6, this.field1510, -17037, var7, var4);
    }
}
