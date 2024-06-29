import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class38 {

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Ljf;")
    public static class119 field390;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILra;IZ)Loq;")
    public static final class200 method227(int arg0, class57 arg1, int arg2, boolean arg3) {
        field387++;
        byte[] var4 = arg1.method361(arg0, 88, arg2);
        if (arg3) {
            field389 = -118;
        }
        return var4 == null ? null : new class200(var4);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Len;)V")
    public static final void method228(class174 arg0) {
        for (int var1 = class329.field4710; var1 < class52.field594; var1++) {
            for (int var2 = 0; var2 < class158.field2245; var2++) {
                for (int var3 = 0; var3 < class52.field598; var3++) {
                    class302 var4 = class19.field202[var1][var2][var3];
                    if (var4 != null) {
                        class436 var5 = var4.field4313;
                        class436 var6 = var4.field4324;
                        if (var5 != null && var5.method217(-102)) {
                            class43.method271(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method217(-104)) {
                                class43.method271(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method206(0, arg0, 0, (byte) -42, var5, 0, false);
                                var6.method224(109);
                            }
                            var5.method224(122);
                        }
                        for (class299 var7 = var4.field4308; var7 != null; var7 = var7.field4263) {
                            class113 var9 = var7.field4261;
                            if (var9 != null && var9.method217(56)) {
                                class43.method271(arg0, var9, var1, var2, var3, var9.field1298 + 1 - var9.field1316, var9.field1299 - var9.field1305 + 1);
                                var9.method224(101);
                            }
                        }
                        class276 var8 = var4.field4310;
                        if (var8 != null && var8.method217(-104)) {
                            class103.method557(arg0, var8, var1, var2, var3);
                            var8.method224(105);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BC)B")
    public static final byte method229(byte arg0, char arg1) {
        if (arg0 != -98) {
            field389 = -88;
        }
        field388++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
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
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method230(int arg0) {
        field390 = null;
        int var1 = 58 / ((-arg0 - 21) / 55);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLra;)Lnm;")
    public static final class277 method231(int arg0, byte arg1, class57 arg2) {
        field386++;
        byte[] var3 = arg2.method348(arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -121) {
                method231(-69, (byte) -66, (class57) null);
            }
            return new class277(var3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
    public static final int method232(byte arg0) {
        field392++;
        try {
            if (arg0 != 70) {
                field391 = -53;
            }
            if (class207.field2814 == 0) {
                if (class140.field1989 > class203.method1299((byte) 5) - 5000L) {
                    return 0;
                }
                class103.field1176 = class323.field4554.method2380(class422.field6065, -49, class118.field1397);
                class16.field161 = class203.method1299((byte) 5);
                class207.field2814 = 1;
            }
            if (class203.method1299((byte) 5) > class16.field161 + 30000L) {
                return class99.method533(1000, (byte) -99);
            }
            if (class207.field2814 == 1) {
                if (class103.field1176.field3268 == 2) {
                    return class99.method533(1001, (byte) -114);
                }
                if (class103.field1176.field3268 != 1) {
                    return -1;
                }
                class330.field4719 = new class236((Socket) class103.field1176.field3270, class323.field4554);
                class103.field1176 = null;
                int var1 = 0;
                if (class151.field2126) {
                    var1 = class403.field5874;
                }
                class169.field2360.field2888 = 0;
                class169.field2360.method1396(21375, 23);
                class169.field2360.method1361((byte) -124, var1);
                class330.field4719.method1511(class169.field2360.field2888, 28067, 0, class169.field2360.field2867);
                if (class225.field3064 != null) {
                    class225.field3064.method1861((byte) -51);
                }
                if (class444.field6488 != null) {
                    class444.field6488.method1861((byte) -51);
                }
                int var2 = class330.field4719.method1509((byte) 26);
                if (class225.field3064 != null) {
                    class225.field3064.method1861((byte) -51);
                }
                if (class444.field6488 != null) {
                    class444.field6488.method1861((byte) -51);
                }
                if (var2 != 0) {
                    return class99.method533(var2, (byte) -124);
                }
                class207.field2814 = 2;
            }
            if (class207.field2814 == 2) {
                if (class330.field4719.method1508((byte) 109) < 2) {
                    return -1;
                }
                class442.field6456 = class330.field4719.method1509((byte) 26);
                class442.field6456 <<= 0x8;
                class442.field6456 += class330.field4719.method1509((byte) 26);
                class278.field3927 = 0;
                class207.field2814 = 3;
                class440.field6445 = new byte[class442.field6456];
            }
            if (class207.field2814 != 3) {
                return -1;
            }
            int var3 = class330.field4719.method1508((byte) 61);
            if (var3 < 1) {
                return -1;
            }
            if (class442.field6456 - class278.field3927 < var3) {
                var3 = class442.field6456 - class278.field3927;
            }
            class330.field4719.method1502(class440.field6445, -1, var3, class278.field3927);
            class278.field3927 += var3;
            if (class442.field6456 > class278.field3927) {
                return -1;
            } else if (class51.method305(class440.field6445, 1)) {
                class426.field6192 = new class175[class393.field5753];
                int var4 = 0;
                for (int var5 = class238.field3244; var5 <= class384.field5627; var5++) {
                    class175 var6 = class327.method2012(var5, false);
                    if (var6 != null) {
                        class426.field6192[var4++] = var6;
                    }
                }
                class153.field2148 = 0;
                class413.field5964 = null;
                class330.field4719.method1503(false);
                class440.field6445 = null;
                class207.field2814 = 0;
                class19.field198 = 0;
                class330.field4719 = null;
                class140.field1989 = class203.method1299((byte) 5);
                return 0;
            } else {
                return class99.method533(1002, (byte) -98);
            }
        } catch (IOException var7) {
            return class99.method533(1003, (byte) -127);
        }
    }
}
