import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class101 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    private int field1375 = 128;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    private int field1380 = 128;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public int field1382 = -1;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Z")
    public boolean field1381 = false;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Z")
    public boolean field1391 = false;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    private int field1394 = 0;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    private int field1393 = 0;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    private int field1384 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[[B")
    public static byte[][] field1373 = new byte[1000][];

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lrc;")
    public static class9 field1376 = new class9(4);

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "[Lug;")
    public static class186[] field1397 = new class186[50];

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "C")
    public static char field1392;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[S")
    private short[] field1374;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "[S")
    private short[] field1378;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[S")
    private short[] field1379;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "[S")
    private short[] field1385;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Lah;")
    public final class106 method615(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 8) {
            method617((byte) 69);
        }
        field1398++;
        class106 var5 = (class106) class166.field2382.method65((byte) -110, (long) this.field1390);
        if (var5 == null) {
            class113 var6 = class113.method719(class52.field593, this.field1388, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field1379 != null) {
                for (int var7 = 0; var7 < this.field1379.length; var7++) {
                    var6.method713(this.field1379[var7], this.field1374[var7]);
                }
            }
            if (this.field1378 != null) {
                for (int var8 = 0; var8 < this.field1378.length; var8++) {
                    var6.method724(this.field1378[var8], this.field1385[var8]);
                }
            }
            var5 = var6.method714(this.field1394 + 64, this.field1393 + 850, -30, -50, -30);
            class166.field2382.method64((long) this.field1390, arg3 - 9, var5);
        }
        class106 var9;
        if (this.field1382 == -1 || arg1 == -1) {
            var9 = var5.method664(true, true, true);
        } else {
            var9 = class27.method165(this.field1382, (byte) 99).method1760((byte) -64, arg1, arg0, var5, arg2);
        }
        if (this.field1375 != 128 || this.field1380 != 128) {
            var9.method663(this.field1375, this.field1380, this.field1375);
        }
        if (this.field1384 != 0) {
            if (this.field1384 == 90) {
                var9.method655();
            }
            if (this.field1384 == 180) {
                var9.method667();
            }
            if (this.field1384 == 270) {
                var9.method668();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILqi;I)V")
    private final void method616(int arg0, class216 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1388 = arg1.method1380(true);
        } else if (arg2 == 2) {
            this.field1382 = arg1.method1380(true);
        } else if (arg2 == 4) {
            this.field1375 = arg1.method1380(true);
        } else if (arg2 == 5) {
            this.field1380 = arg1.method1380(true);
        } else if (arg2 == 6) {
            this.field1384 = arg1.method1380(true);
        } else if (arg2 == 7) {
            this.field1394 = arg1.method1407(arg0 + 129);
        } else if (arg2 == 8) {
            this.field1393 = arg1.method1407(109);
        } else if (arg2 == 9) {
            this.field1391 = true;
        } else if (arg2 == 10) {
            this.field1381 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1407(107);
            this.field1379 = new short[var6];
            this.field1374 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1379[var7] = (short) arg1.method1380(true);
                this.field1374[var7] = (short) arg1.method1380(true);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1407(115);
            this.field1385 = new short[var4];
            this.field1378 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1378[var5] = (short) arg1.method1380(true);
                this.field1385[var5] = (short) arg1.method1380(true);
            }
        }
        if (arg0 != -11) {
            method621(false, -14, true, true, 73);
        }
        field1387++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method617(byte arg0) {
        field1376 = null;
        field1397 = null;
        field1373 = null;
        if (arg0 != 86) {
            field1397 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZII)I")
    public static final int method618(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field1373 = null;
        }
        field1389++;
        if ((class241.field3507[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (class241.field3507[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public static final void method619(int arg0, int arg1) {
        field1395++;
        if (class238.method1549((byte) -126, arg1)) {
            class20.method122(32768, -1, class123.field1767[arg1]);
            if (arg0 != 264) {
                method619(-52, 55);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
    public static final void method620(int arg0, int arg1, int arg2) {
        field1396++;
        class66 var3 = class6.method34(12, true, arg1);
        var3.method408(0);
        var3.field784 = arg2;
        if (arg0 <= 96) {
            field1392 = 'P';
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIZZI)Lbc;")
    public static final class282 method621(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        class105 var5 = null;
        field1377++;
        if (arg1 != 2) {
            field1373 = null;
        }
        if (class224.field3166 != null) {
            var5 = new class105(arg4, class224.field3166, class170.field2435[arg4], 1000000);
        }
        class33.field386[arg4] = class157.field2261.method257(-126, arg4, class176.field2499, var5);
        if (arg3) {
            class33.field386[arg4].method1878(58);
        }
        return new class282(class33.field386[arg4], arg0, arg2);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lqi;I)V")
    public final void method622(class216 arg0, int arg1) {
        field1383++;
        if (arg1 <= 43) {
            field1392 = 'z';
        }
        while (true) {
            int var3 = arg0.method1407(108);
            if (var3 == 0) {
                return;
            }
            this.method616(-11, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method623(int arg0, String arg1) {
        if (arg0 <= 86) {
            field1376 = null;
        }
        field1386++;
        return class154.method1008(10, (byte) 69, true, arg1);
    }
}
