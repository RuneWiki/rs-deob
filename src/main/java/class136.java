import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class136 {

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field2171 = 2048;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public int field2169 = 0;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public int field2177 = 2048;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public int field2172 = 0;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lpp;")
    public static class464 field2168 = new class464(36, 15);

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[Lmb;")
    public static class285[] field2174 = new class285[14];

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field2176 = 0;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lpp;")
    public static class464 field2173 = new class464(25, -1);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lco;B)V")
    public final void method1039(class268 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                field2175++;
                if (arg1 != -40) {
                    this.method1039(null, (byte) -46);
                    return;
                }
                return;
            }
            this.method1041((byte) -119, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1040(int arg0) {
        int var1 = -118 % ((arg0 + 86) / 38);
        field2173 = null;
        field2174 = null;
        field2168 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BILco;)V")
    private final void method1041(byte arg0, int arg1, class268 arg2) {
        if (arg1 == 1) {
            this.field2169 = arg2.method1738(255);
        } else if (arg1 == 2) {
            this.field2177 = arg2.method1745(32132);
        } else if (arg1 == 3) {
            this.field2171 = arg2.method1745(32132);
        } else if (arg1 == 4) {
            this.field2172 = arg2.method1730(13436);
        }
        field2170++;
        int var4 = -120 % ((arg0 + 36) / 48);
    }
}
