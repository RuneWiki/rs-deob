import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class91 {

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "Z")
    private boolean field1303 = false;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public int field1301 = 0;

    @OriginalMember(owner = "client!kba", name = "v", descriptor = "I")
    public int field1317 = 0;

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "Llh;")
    public static class487 field1309 = new class487(17, 8);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!kba", name = "u", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!kba", name = "w", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!kba", name = "x", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!kba", name = "y", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "J")
    public long field1304;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "[[[I")
    public static int[][][] field1307;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILac;I)V", line = 3)
    private final void method659(int arg0, class501 arg1, int arg2) {
        field1320++;
        if (arg0 != -1) {
            return;
        }
        if (arg2 == 1) {
            this.field1302 = arg1.method2845(arg0);
        } else if (arg2 == 2) {
            arg1.method2874((byte) -75);
        } else if (arg2 == 3) {
            this.field1296 = arg1.method2840(false);
            this.field1306 = arg1.method2840(false);
            this.field1300 = arg1.method2840(false);
        } else if (arg2 == 4) {
            this.field1310 = arg1.method2874((byte) -75);
            this.field1312 = arg1.method2840(false);
        } else if (arg2 == 6) {
            this.field1299 = arg1.method2874((byte) -75);
        } else if (arg2 == 8) {
            this.field1301 = 1;
        } else if (arg2 == 9) {
            this.field1317 = 1;
        } else if (arg2 == 10) {
            this.field1303 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V", line = 58)
    public static void method660(int arg0) {
        field1309 = null;
        if (arg0 != 17325) {
            method665(-40, true);
        }
        field1307 = null;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V", line = 69)
    public final void method661(boolean arg0) {
        field1298++;
        this.field1313 = class597.field8344[this.field1302 << 3];
        long var2 = (long) this.field1296;
        long var4 = (long) this.field1306;
        long var6 = (long) this.field1300;
        this.field1308 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + var6 * var6));
        if (arg0) {
            field1318 = 1;
        }
        if (this.field1312 == 0) {
            this.field1312 = 1;
        }
        if (this.field1310 == 0) {
            this.field1304 = 2147483647L;
        } else if (this.field1310 == 1) {
            this.field1304 = (this.field1308 * 8 / this.field1312);
            this.field1304 *= this.field1304;
        } else if (this.field1310 == 2) {
            this.field1304 = (this.field1308 * 8 / this.field1312);
        }
        if (this.field1303) {
            this.field1308 *= -1;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)Z", line = 122)
    public static final boolean method662(int arg0, int arg1, int arg2) {
        field1319++;
        if (arg0 != -2) {
            field1318 = -9;
        }
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V", line = 141)
    public static final void method663(int arg0) {
        field1305++;
        class418.method2429((byte) 2);
        class417.field5889 = null;
        class219.field3066 = 0;
        class95.field1338 = 0;
        class131.field1890 = null;
        class687.field9800 = null;
        class108.field1503 = null;
        class37.field444 = 0;
        class660.field9184.field6892 = 0;
        class486.method2764(arg0);
        class245.method1513(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class671.field9407[var1] = null;
        }
        class143.field2063 = null;
        for (int var2 = 0; var2 < class254.field3465; var2++) {
            class61 var4 = class31.field400[var2].field5552;
            if (var4 != null) {
                var4.field1701 = -1;
            }
        }
        class408.method2380((byte) -96);
        class560.field7547 = -1;
        class199.field2832 = -1;
        class203.field2863 = 1;
        class178.method1232(10, (byte) 86);
        for (int var3 = arg0; var3 < 100; var3++) {
            class130.field1872[var3] = true;
        }
        class468.method2645((byte) 54);
        class706.field9973 = 0L;
        class108.field1501 = null;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lrc;I)Ljava/lang/String;", line = 196)
    public static final String method664(class499 arg0, int arg1) {
        if (arg1 < 95) {
            method660(65);
        }
        field1321++;
        return arg0.field6786 == null || arg0.field6786.length() <= 0 ? arg0.field6778 : arg0.field6778 + class65.field820.method555(class697.field9900, true) + arg0.field6786;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 224)
    public static final String method665(int arg0, boolean arg1) {
        field1316++;
        String var2 = Integer.toString(arg0);
        if (arg1) {
            field1318 = 62;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class65.field821.method555(class697.field9900, true) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class65.field823.method555(class697.field9900, true) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lac;B)V", line = 254)
    public final void method666(class501 arg0, byte arg1) {
        field1297++;
        while (true) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 == 0) {
                if (arg1 >= -49) {
                    this.method666(null, (byte) 116);
                    return;
                } else {
                    return;
                }
            }
            this.method659(-1, arg0, var3);
        }
    }
}
