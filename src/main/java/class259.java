import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class259 extends class59 {

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lok;")
    public static class41 field4128 = class137.method956("Loaded titlescreen)3", 45);

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "Z")
    public static boolean field4127 = true;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field4132 = 0;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Lok;")
    public static class41 field4136 = class137.method956("gleiten:", 45);

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Lok;")
    public static class41 field4135 = class137.method956("Bitte warten Sie)3)3)3", 45);

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Lok;")
    private static class41 field4137 = class137.method956("glow1:", 45);

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Lok;")
    public static class41 field4126 = field4137;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "Lok;")
    public static class41 field4129 = field4137;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "Lmh;")
    public static class65 field4139;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)I", line = 37)
    public static final int method1827(byte arg0, int arg1, int arg2) {
        field4131++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            if (arg0 >= -85) {
                method1827((byte) 49, -75, -79);
            }
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V", line = 84)
    public static final void method1828(byte arg0) {
        class18.method91(28515, class317.field5361);
        field4130++;
        class171.field2757++;
        if (class20.field309 && class180.field2921) {
            int var1 = class53.field789;
            int var2 = var1 - class1.field9;
            int var3 = class129.field1929;
            int var4 = var3 - class124.field1842;
            if (var4 < class205.field3304) {
                var4 = class205.field3304;
            }
            if (class317.field5361.field4936 + var4 > class205.field3304 + class86.field1264.field4936) {
                var4 = class205.field3304 + class86.field1264.field4936 - class317.field5361.field4936;
            }
            if (class296.field4789 > var2) {
                var2 = class296.field4789;
            }
            if ((class317.field5361.field4949 + var2) > (class296.field4789 + class86.field1264.field4949)) {
                var2 = class296.field4789 + class86.field1264.field4949 - class317.field5361.field4949;
            }
            int var5 = var2 - class95.field1408;
            int var6 = var4 - class191.field3094;
            int var7 = class317.field5361.field4908;
            if (arg0 <= 102) {
                method1827((byte) -8, 85, -33);
            }
            if (class171.field2757 > class317.field5361.field5044 && (var7 < var6 || var6 < (-var7) || var7 < var5 || -var7 > var5)) {
                class256.field4111 = true;
            }
            int var8 = var2 + class86.field1264.field4918 - class296.field4789;
            int var9 = class86.field1264.field4912 + var4 - class205.field3304;
            if (class317.field5361.field5055 != null && class256.field4111) {
                class73 var10 = new class73();
                var10.field1088 = var9;
                var10.field1071 = var8;
                var10.field1083 = class317.field5361.field5055;
                var10.field1079 = class317.field5361;
                class161.method1141(var10, true);
            }
            if (class269.field4349 == 0) {
                if (class256.field4111) {
                    if (class317.field5361.field4976 != null) {
                        class73 var11 = new class73();
                        var11.field1083 = class317.field5361.field4976;
                        var11.field1071 = var8;
                        var11.field1079 = class317.field5361;
                        var11.field1072 = class235.field3772;
                        var11.field1088 = var9;
                        class161.method1141(var11, true);
                    }
                    if (class235.field3772 != null && client.method2115(class317.field5361) != null) {
                        class138.field2088++;
                        class285.field4642.method844(-4, 41);
                        class285.field4642.method787(853918096, class235.field3772.field4910);
                        class285.field4642.method818(14136, class317.field5361.field4996);
                        class285.field4642.method778(class235.field3772.field4996, (byte) -4);
                        class285.field4642.method787(853918096, class317.field5361.field4910);
                    }
                } else if ((class192.field3107 == 1 || class89.method637(class98.field1432 - 1, 0)) && class98.field1432 > 2) {
                    class46.method331((byte) 114);
                } else if (class98.field1432 > 0) {
                    class228.method1633(true);
                }
                class317.field5361 = null;
            }
        } else if (class171.field2757 > 1) {
            class317.field5361 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V", line = 208)
    public static void method1829(byte arg0) {
        if (arg0 <= 27) {
            field4128 = (class41) null;
        }
        field4135 = null;
        field4137 = null;
        field4139 = null;
        field4129 = null;
        field4136 = null;
        field4126 = null;
        field4128 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(II)V", line = 228)
    public class259(int arg0, int arg1) {
        this.field4134 = arg0;
        this.field4138 = arg1;
    }
}
