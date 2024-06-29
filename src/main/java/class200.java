import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class200 extends class64 {

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field3151;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "[I")
    public static int[] field3154 = new int[50];

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3153 = "";

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field3157 = 64;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field3163 = 1;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "[I")
    public static int[] field3158 = new int[32];

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field3150 = 0;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(B)V")
    public static final void method1389(byte arg0) {
        field3159++;
        int var1 = class175.field2763.method439(126, 8);
        if (class272.field4432 > var1) {
            for (int var2 = var1; var2 < class272.field4432; var2++) {
                class111.field1607[class81.field1234++] = class52.field745[var2];
            }
        }
        if (var1 > class272.field4432) {
            throw new RuntimeException("gppov1");
        }
        class272.field4432 = 0;
        if (arg0 != 89) {
            method1389((byte) -57);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class52.field745[var3];
            class1 var5 = class35.field409[var4];
            int var6 = class175.field2763.method439(126, 1);
            if (var6 == 0) {
                class52.field745[class272.field4432++] = var4;
                var5.field3931 = class311.field4996;
            } else {
                int var7 = class175.field2763.method439(121, 2);
                if (var7 == 0) {
                    class52.field745[class272.field4432++] = var4;
                    var5.field3931 = class311.field4996;
                    class212.field3299[class140.field2016++] = var4;
                } else if (var7 == 1) {
                    class52.field745[class272.field4432++] = var4;
                    var5.field3931 = class311.field4996;
                    int var8 = class175.field2763.method439(119, 3);
                    var5.method1733(1, (byte) -41, var8);
                    int var9 = class175.field2763.method439(112, 1);
                    if (var9 == 1) {
                        class212.field3299[class140.field2016++] = var4;
                    }
                } else if (var7 == 2) {
                    class52.field745[class272.field4432++] = var4;
                    var5.field3931 = class311.field4996;
                    if (class175.field2763.method439(arg0 + 26, 1) == 1) {
                        int var11 = class175.field2763.method439(109, 3);
                        var5.method1733(2, (byte) -108, var11);
                        int var12 = class175.field2763.method439(126, 3);
                        var5.method1733(2, (byte) -99, var12);
                    } else {
                        int var10 = class175.field2763.method439(104, 3);
                        var5.method1733(0, (byte) -38, var10);
                    }
                    int var13 = class175.field2763.method439(117, 1);
                    if (var13 == 1) {
                        class212.field3299[class140.field2016++] = var4;
                    }
                } else if (var7 == 3) {
                    class111.field1607[class81.field1234++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method413(int arg0) {
        if (arg0 == -64) {
            field3161++;
            return this.field3151;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(B)V")
    public static void method1390(byte arg0) {
        if (arg0 <= 7) {
            field3158 = null;
        }
        field3154 = null;
        field3153 = null;
        field3158 = null;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)Z")
    public final boolean method409(byte arg0) {
        field3152++;
        if (arg0 != 59) {
            method1393((byte) 71, (char) 65529);
        }
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class200(Object arg0) {
        this.field3151 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lim;B)Lsk;")
    public static final class119 method1391(class170 arg0, byte arg1) {
        if (arg1 != 26) {
            field3157 = -92;
        }
        field3160++;
        return new class119(arg0.method1193(-1), arg0.method1193(arg1 - 27), arg0.method1193(-1), arg0.method1193(arg1 ^ 0xFFFFFFE5), arg0.method1212(460736848), arg0.method1218(-34));
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JZ)V")
    public static final void method1392(long arg0, boolean arg1) {
        field3155++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class76.field1142 < 100 || class310.field4986) || class76.field1142 >= 200) {
            class236.method1655(0, "", 90, class297.field4747);
            return;
        }
        String var3 = class178.method1264(arg0, (byte) 103);
        for (int var4 = 0; var4 < class76.field1142; var4++) {
            if (class218.field3419[var4] == arg0) {
                class236.method1655(0, "", 122, var3 + class127.field1824);
                return;
            }
        }
        for (int var5 = 0; var5 < class84.field1302; var5++) {
            if (class58.field863[var5] == arg0) {
                class236.method1655(0, "", 101, class201.field3169 + var3 + class17.field232);
                return;
            }
        }
        if (var3.equals(class214.field3347.field31)) {
            class236.method1655(0, "", 100, class84.field1295);
            return;
        }
        class301.field4799[class76.field1142] = var3;
        class181.field2853++;
        class218.field3419[class76.field1142] = arg0;
        class127.field1821[class76.field1142] = 0;
        class198.field3143[class76.field1142] = "";
        if (!arg1) {
            method1390((byte) 22);
        }
        class113.field1655[class76.field1142] = 0;
        class214.field3349[class76.field1142] = false;
        class250.field4088 = client.field3871;
        class76.field1142++;
        class150.field2218.method445(37, 7);
        class150.field2218.method1160(-25643, arg0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BC)B")
    public static final byte method1393(byte arg0, char arg1) {
        field3156++;
        byte var2;
        if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (arg0 >= -8) {
            field3158 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Laa;")
    public static final class8 method1394(int arg0, int arg1) {
        field3164++;
        class8 var2 = (class8) class176.field2767.method1517((long) arg0, (byte) -127);
        if (arg1 != -30700) {
            method1390((byte) -41);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field1615.method501(-2, arg0, 30);
        class8 var4 = new class8();
        if (var3 != null) {
            var4.method45((byte) 88, new class170(var3), arg0);
        }
        class176.field2767.method1518(var4, (long) arg0, (byte) 75);
        return var4;
    }
}
