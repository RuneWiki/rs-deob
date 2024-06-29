import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class19 {

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "[Lwc;")
    public class139[] field186;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "Lkc;")
    public static class67 field187 = class19.method144("(U4", 87);

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field188 = 0;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "[Lkb;")
    public static class66[] field189 = new class66[32768];

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "Lkc;")
    public static class67 field196 = class19.method144("Lade Schrifts-=tze )2 ", 122);

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "Lkc;")
    public static class67 field199 = class19.method144("::", 69);

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "Lkc;")
    public static class67 field190 = class19.method144("leuchten1:", 108);

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "Lkc;")
    public static class67 field201 = class19.method144("Untersuchen", 125);

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lta;")
    public static class119 field193;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "[I")
    public static int[] field198;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lac;Lac;IZ)V", line = 7)
    public class9(class4 arg0, class4 arg1, int arg2, boolean arg3) {
        class10 var5 = new class10();
        int var6 = arg0.method45(-120, arg2);
        this.field186 = new class139[var6];
        int[] var7 = arg0.method42(arg2, -92);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method27(var7[var8], true, arg2);
            class45 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class45 var12 = (class45) var5.method83(64); var12 != null; var12 = (class45) var5.method81(-113)) {
                if (var12.field1103 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method30(0, var11, false);
                } else {
                    var13 = arg1.method30(var11, 0, false);
                }
                var10 = new class45(var11, var13);
                var5.method95((byte) 120, var10);
            }
            this.field186[var7[var8]] = new class139(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Z", line = 75)
    public final boolean method77(int arg0, byte arg1) {
        field191++;
        return arg1 < 44 ? true : this.field186[arg0].field3311;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JB)V", line = 100)
    public static final void method78(long arg0, byte arg1) {
        field194++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < field188; var3++) {
            if (class31.field650[var3] == arg0) {
                class114.field2667++;
                class121.field2849 = true;
                field188--;
                for (int var4 = var3; var4 < field188; var4++) {
                    class55.field1349[var4] = class55.field1349[var4 + 1];
                    class46.field1107[var4] = class46.field1107[var4 + 1];
                    class31.field650[var4] = class31.field650[var4 + 1];
                    class128.field2999[var4] = class128.field2999[var4 + 1];
                }
                class54.field1295.method713(503, 11);
                class54.field1295.method1083((byte) -104, arg0);
                break;
            }
        }
        if (arg1 >= -86) {
            method80(115, null, null);
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 143)
    public static void method79(byte arg0) {
        if (arg0 != -125) {
            field198 = null;
        }
        field190 = null;
        field201 = null;
        field196 = null;
        field199 = null;
        field198 = null;
        field189 = null;
        field193 = null;
        field187 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILac;Lac;)V", line = 197)
    public static final void method80(int arg0, class4 arg1, class4 arg2) {
        class69.field1643 = arg2;
        field200++;
        int var3 = 70 / ((-arg0 - 12) / 51);
        class131.field3078 = arg1;
    }
}
