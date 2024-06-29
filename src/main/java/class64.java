import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class64 extends class125 {

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    private int field1298 = 0;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    private int field1304 = 128;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    private int field1297 = 0;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public int field1295 = -1;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    private int field1314 = 0;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    private int field1299 = 128;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "[I")
    public static int[] field1288 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "Ljd;")
    public static class92 field1301 = class202.method1325((byte) 90, "ams");

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "Ljd;")
    private static class92 field1303 = class202.method1325((byte) 90, "Loaded interfaces");

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Ljd;")
    public static class92 field1296 = field1303;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field1308 = 0;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field1305 = 0;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field1302 = 0;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "J")
    public static long field1292 = 0L;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "Ljd;")
    public static class92 field1316 = class202.method1325((byte) 90, "<img=1>");

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1307;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "[S")
    private short[] field1290;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "[S")
    private short[] field1291;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "[S")
    private short[] field1306;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "[S")
    private short[] field1313;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Ldg;")
    public final class38 method383(int arg0, int arg1) {
        field1293++;
        class38 var3 = (class38) class214.field4184.method930(75, (long) this.field1289);
        if (var3 == null) {
            class57 var4 = class57.method341(class168.field3284, this.field1315, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1291 != null) {
                for (int var5 = 0; var5 < this.field1291.length; var5++) {
                    var4.method349(this.field1291[var5], this.field1290[var5]);
                }
            }
            if (this.field1313 != null) {
                for (int var6 = 0; var6 < this.field1313.length; var6++) {
                    var4.method348(this.field1313[var6], this.field1306[var6]);
                }
            }
            var3 = var4.method345(this.field1314 + 64, 850 - -this.field1298, -30, -50, -30, true, true);
            class214.field4184.method927(24744, var3, (long) this.field1289);
        }
        class38 var7;
        if (this.field1295 == -1 || arg0 == -1) {
            var7 = var3.method240(true);
        } else {
            var7 = class153.method978(this.field1295, -106).method138(669146096, var3, arg0);
        }
        if (this.field1304 != 128 || this.field1299 != 128) {
            var7.method238(this.field1304, this.field1299, this.field1304);
        }
        if (this.field1297 != 0) {
            if (this.field1297 == 90) {
                var7.method251();
            }
            if (this.field1297 == 180) {
                var7.method251();
                var7.method251();
            }
            if (this.field1297 == 270) {
                var7.method251();
                var7.method251();
                var7.method251();
            }
        }
        int var8 = -32 / ((arg1 - 86) / 33);
        return var7;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public static void method384(byte arg0) {
        if (arg0 != 36) {
            return;
        }
        field1301 = null;
        field1316 = null;
        field1288 = null;
        field1307 = null;
        field1296 = null;
        field1303 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Ljd;")
    public static final class92 method385(int arg0, int arg1) {
        field1312++;
        if (arg0 < 999999999) {
            return class142.method938(arg0, false);
        } else if (arg1 == 13705) {
            return class209.field4022;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILh;I)V")
    private final void method386(int arg0, class70 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1315 = arg1.method442(arg0 - 21392);
        } else if (arg2 == 2) {
            this.field1295 = arg1.method442(-21351);
        } else if (arg2 == 4) {
            this.field1304 = arg1.method442(arg0 ^ 0xFFFFACB0);
        } else if (arg2 == 5) {
            this.field1299 = arg1.method442(-21351);
        } else if (arg2 == 6) {
            this.field1297 = arg1.method442(-21351);
        } else if (arg2 == 7) {
            this.field1314 = arg1.method443(arg0 ^ 0xD6);
        } else if (arg2 == 8) {
            this.field1298 = arg1.method443(255);
        } else if (arg2 != 9) {
            if (arg2 == 40) {
                int var4 = arg1.method443(arg0 + 214);
                this.field1290 = new short[var4];
                this.field1291 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1291[var5] = (short) arg1.method442(-21351);
                    this.field1290[var5] = (short) arg1.method442(-21351);
                }
            } else if (arg2 == 41) {
                int var6 = arg1.method443(255);
                this.field1306 = new short[var6];
                this.field1313 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1313[var7] = (short) arg1.method442(-21351);
                    this.field1306[var7] = (short) arg1.method442(-21351);
                }
            }
        }
        if (arg0 == 41) {
            field1300++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILh;)V")
    public final void method387(int arg0, class70 arg1) {
        field1294++;
        if (arg0 != -1986) {
            this.field1291 = null;
        }
        while (true) {
            int var3 = arg1.method443(255);
            if (var3 == 0) {
                return;
            }
            this.method386(41, arg1, var3);
        }
    }
}
