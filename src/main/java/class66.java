import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class66 extends class129 {

    @OriginalMember(owner = "client!af", name = "A", descriptor = "Lul;")
    public class177 field1102;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "Lci;")
    public static class60 field1104 = new class60();

    @OriginalMember(owner = "client!af", name = "D", descriptor = "Z")
    public static boolean field1105 = false;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field1107 = 0;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "Z")
    public static boolean field1108 = false;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field1112 = -1;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field1113 = 0;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1109;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lul;)V")
    public class66(class177 arg0) {
        this.field1102 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method410(byte arg0) {
        field1104 = null;
        field1109 = null;
        if (arg0 > -62) {
            field1107 = 20;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILve;)V")
    public static final void method411(int arg0, class103 arg1) {
        if (arg0 > -77) {
            method412(74);
        }
        field1106++;
        long var2 = 0L;
        int var4 = -1;
        if (arg1.field1817 == 0) {
            var2 = class112.method784(arg1.field1800, arg1.field1803, arg1.field1815);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg1.field1817 == 1) {
            var2 = class155.method1062(arg1.field1800, arg1.field1803, arg1.field1815);
        }
        if (arg1.field1817 == 2) {
            var2 = class275.method1801(arg1.field1800, arg1.field1803, arg1.field1815);
        }
        if (arg1.field1817 == 3) {
            var2 = class108.method747(arg1.field1800, arg1.field1803, arg1.field1815);
        }
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7D2E4) >> 14;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field1811 = var4;
        arg1.field1802 = var6;
        arg1.field1812 = var5;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public static final void method412(int arg0) {
        field1103++;
        if (client.field4545 != -1) {
            class203.method1344(client.field4545, (byte) -115);
        }
        for (int var1 = 0; var1 < class140.field2406; var1++) {
            if (class23.field367[var1]) {
                class239.field3937[var1] = true;
            }
            class243.field3988[var1] = class23.field367[var1];
            class23.field367[var1] = false;
        }
        class276.field4411 = null;
        class262.field4275 = -1;
        class35.field509 = -1;
        class24.field378 = class266.field4301;
        if (client.field4545 != -1) {
            class140.field2406 = 0;
            class237.method1570(-77);
        }
        class283.method1838();
        class191.field3087 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static final void method413(boolean arg0) {
        field1111++;
        for (class285 var1 = (class285) class159.field2662.method379(6347); var1 != null; var1 = (class285) class159.field2662.method378(61)) {
            class71 var2 = var1.field4514;
            if (class176.field2886 != var2.field1184 || var2.field1181 < class266.field4301) {
                var1.method547(10026);
            } else if (var2.field1177 <= class266.field4301) {
                if (var2.field1164 > 0) {
                    class141 var3 = class42.field625[var2.field1164 - 1];
                    if (var3 != null && var3.field1397 >= 0 && var3.field1397 < 13312 && var3.field1458 >= 0 && var3.field1458 < 13312) {
                        var2.method433(var3.field1458, class10.method68(true, var2.field1184, var3.field1458, var3.field1397) - var2.field1172, var3.field1397, -6, class266.field4301);
                    }
                }
                if (var2.field1164 < 0) {
                    int var4 = -var2.field1164 - 1;
                    class288 var5;
                    if (class37.field545 == var4) {
                        var5 = class273.field4378;
                    } else {
                        var5 = class105.field1874[var4];
                    }
                    if (var5 != null && var5.field1397 >= 0 && var5.field1397 < 13312 && var5.field1458 >= 0 && var5.field1458 < 13312) {
                        var2.method433(var5.field1458, class10.method68(true, var2.field1184, var5.field1458, var5.field1397) - var2.field1172, var5.field1397, -20, class266.field4301);
                    }
                }
                var2.method429(class191.field3087, (byte) 127);
                class121.method823(class176.field2886, (int) var2.field1150, (int) var2.field1167, (int) var2.field1174, 60, var2, var2.field1146, -1L, false);
            }
        }
        if (arg0) {
            field1109 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public static final int method414(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCC) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = 63 / ((arg1 - 27) / 38);
        field1110++;
        int var6 = (var4 >>> 8) + var4;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }
}
