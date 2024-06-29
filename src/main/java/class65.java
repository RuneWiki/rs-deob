import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class65 implements class185 {

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lhi;")
    public static class82 field1022 = class95.method664((byte) -120, "hint_mapedge");

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[S")
    public static short[] field1021 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lhi;")
    public static class82 field1015 = class95.method664((byte) -32, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[[B")
    public static byte[][] field1019 = new byte[250][];

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lhi;")
    public static class82 field1026 = class95.method664((byte) -56, "");

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lhi;")
    public static class82 field1014 = class95.method664((byte) -94, " ");

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lhi;")
    public static class82 field1023 = class95.method664((byte) -52, " )4 ");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)I", line = 8)
    public static final int method415(byte arg0) {
        if (arg0 != -73) {
            method417(-3, (class185) null, (class222) null, (class222) null);
        }
        field1025++;
        return 6;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([IIIJ)Lhi;", line = 19)
    public final class82 method416(int[] arg0, int arg1, int arg2, long arg3) {
        field1012++;
        if (arg2 == 0) {
            class37 var6 = class205.method1472((byte) 20, arg0[0]);
            return var6.method294((int) arg3, 127);
        }
        if (arg1 != -21323) {
            field1023 = (class82) null;
        }
        if (arg2 == 1 || arg2 == 10) {
            class312 var7 = class273.method1912((int) arg3, arg1 ^ 0x5307);
            return var7.field5364;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class205.method1472((byte) 20, arg0[0]).method294((int) arg3, 127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjc;Lum;Lum;)V", line = 53)
    public static final void method417(int arg0, class185 arg1, class222 arg2, class222 arg3) {
        field1013++;
        class328.field5607 = arg1;
        class139.field2384 = arg2;
        class222.field3843 = arg3;
        if (class222.field3843 != null) {
            class194.field3306 = class222.field3843.method1568(1673, 1);
        }
        if (arg0 != 1) {
            field1015 = (class82) null;
        }
        if (class139.field2384 != null) {
            class259.field4433 = class139.field2384.method1568(1673, 1);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lbc;Z)V", line = 86)
    public static final void method418(class153 arg0, boolean arg1) {
        field1018++;
        int var2 = arg0.method1050(-32768);
        class311.field5311 = new class180[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class311.field5311[var3] = new class180();
            class311.field5311[var3].field3077 = arg0.method1050(-32768);
            class311.field5311[var3].field3069 = arg0.method1091((byte) -109);
        }
        class126.field2210 = arg0.method1050(-32768);
        class51.field833 = arg0.method1050(-32768);
        class104.field1849 = arg0.method1050(-32768);
        class112.field2016 = new class67[class51.field833 + 1 - class126.field2210];
        for (int var4 = 0; var4 < class104.field1849; var4++) {
            int var5 = arg0.method1050(-32768);
            class67 var6 = class112.field2016[var5] = new class67();
            var6.field3596 = arg0.method1082(-38);
            var6.field3587 = arg0.method1097((byte) -101);
            var6.field1041 = var5 + class126.field2210;
            var6.field1043 = arg0.method1091((byte) -103);
            var6.field1040 = arg0.method1091((byte) -97);
        }
        class293.field4920 = arg0.method1097((byte) -99);
        class35.field572 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 130)
    public static void method419(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1022 = null;
        field1019 = (byte[][]) null;
        field1026 = null;
        field1021 = null;
        field1015 = null;
        field1023 = null;
        field1014 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BZ)V", line = 155)
    public static final void method420(byte arg0, boolean arg1) {
        field1017++;
        for (class241 var2 = (class241) class164.field2871.method1936(16173); var2 != null; var2 = (class241) class164.field2871.method1926((byte) 90)) {
            if (var2.field4181 != null) {
                class219.field3803.method882(var2.field4181);
                var2.field4181 = null;
            }
            if (var2.field4187 != null) {
                class219.field3803.method882(var2.field4187);
                var2.field4187 = null;
            }
            var2.method961((byte) 124);
        }
        if (arg0 != 6 || !arg1) {
            return;
        }
        for (class241 var3 = (class241) class131.field2276.method1936(16173); var3 != null; var3 = (class241) class131.field2276.method1926((byte) 90)) {
            if (var3.field4181 != null) {
                class219.field3803.method882(var3.field4181);
                var3.field4181 = null;
            }
            var3.method961((byte) 66);
        }
        for (class241 var4 = (class241) class38.field642.method502((byte) -104); var4 != null; var4 = (class241) class38.field642.method494(true)) {
            if (var4.field4181 != null) {
                class219.field3803.method882(var4.field4181);
                var4.field4181 = null;
            }
            var4.method961((byte) 69);
        }
    }
}
