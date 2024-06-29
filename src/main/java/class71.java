import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class71 {

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    private int field1333 = 0;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    private int field1326 = 128;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Z")
    public boolean field1337 = false;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    private int field1336 = 128;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    private int field1339 = 0;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public int field1329 = -1;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    private int field1340 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Ljd;")
    public static class85 field1325 = class221.method1499("sl_stars", (byte) -91);

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1324 = -1;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    public static int[] field1323 = new int[25];

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field1331 = 10;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[S")
    private short[] field1334;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "[S")
    private short[] field1338;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "[S")
    private short[] field1341;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "[S")
    private short[] field1342;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[Z")
    public static boolean[] field1327;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method496(int arg0) {
        field1325 = null;
        if (arg0 == 2) {
            field1327 = null;
            field1323 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lwb;")
    public final class26 method497(int arg0, int arg1) {
        field1332++;
        class26 var3 = (class26) class132.field2303.method1269((long) this.field1330, (byte) 77);
        if (var3 == null) {
            class165 var4 = class165.method1111(class137.field2388, this.field1335, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1341 != null) {
                for (int var5 = 0; var5 < this.field1341.length; var5++) {
                    var4.method1113(this.field1341[var5], this.field1342[var5]);
                }
            }
            if (this.field1338 != null) {
                for (int var6 = 0; var6 < this.field1338.length; var6++) {
                    var4.method1108(this.field1338[var6], this.field1334[var6]);
                }
            }
            var3 = var4.method1085(this.field1333 + 64, this.field1340 + 850, -30, -50, -30);
            class132.field2303.method1271(arg0 ^ 0xFFFFC337, var3, (long) this.field1330);
        }
        class26 var7;
        if (this.field1329 == -1 || arg1 == -1) {
            var7 = var3.method170(true, true);
        } else {
            var7 = class101.method704(arg0 + 1, this.field1329).method738(arg1, true, var3);
        }
        if (this.field1326 != 128 || this.field1336 != 128) {
            var7.method175(this.field1326, this.field1336, this.field1326);
        }
        if (this.field1339 != arg0) {
            if (this.field1339 == 90) {
                var7.method184();
            }
            if (this.field1339 == 180) {
                var7.method181();
            }
            if (this.field1339 == 270) {
                var7.method189();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lik;II)V")
    private final void method498(class247 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1335 = arg0.method1694((byte) -100);
        } else if (arg2 == 2) {
            this.field1329 = arg0.method1694((byte) -100);
        } else if (arg2 == 4) {
            this.field1326 = arg0.method1694((byte) -100);
        } else if (arg2 == 5) {
            this.field1336 = arg0.method1694((byte) -100);
        } else if (arg2 == 6) {
            this.field1339 = arg0.method1694((byte) -100);
        } else if (arg2 == 7) {
            this.field1333 = arg0.method1711((byte) -67);
        } else if (arg2 == 8) {
            this.field1340 = arg0.method1711((byte) -67);
        } else if (arg2 == 9) {
            this.field1337 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1711((byte) -67);
            this.field1342 = new short[var6];
            this.field1341 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1341[var7] = (short) arg0.method1694((byte) -100);
                this.field1342[var7] = (short) arg0.method1694((byte) -100);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method1711((byte) -67);
            this.field1334 = new short[var4];
            this.field1338 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1338[var5] = (short) arg0.method1694((byte) -100);
                this.field1334[var5] = (short) arg0.method1694((byte) -100);
            }
        }
        int var8 = 17 / ((-arg1 - 21) / 45);
        field1320++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
    public static final int method499(int arg0, int arg1, int arg2) {
        field1322++;
        if (arg2 == -2) {
            return 12345678;
        }
        if (arg1 != -8971) {
            method499(-76, -65, 38);
        }
        if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILjb;)V")
    public static final void method500(int arg0, int arg1, int arg2, class255 arg3) {
        int var4 = 5 % ((10 - arg0) / 58);
        if (arg3.field4460 == 0) {
            arg3.field4559 = arg3.field4410;
        } else if (arg3.field4460 == 1) {
            arg3.field4559 = (arg2 - arg3.field4513) / 2 + arg3.field4410;
        } else if (arg3.field4460 == 2) {
            arg3.field4559 = arg2 - arg3.field4513 - arg3.field4410;
        } else if (arg3.field4460 == 3) {
            arg3.field4559 = arg3.field4410 * arg2 >> 14;
        } else if (arg3.field4460 == 4) {
            arg3.field4559 = (arg3.field4410 * arg2 >> 14) + (arg2 - arg3.field4513) / 2;
        } else {
            arg3.field4559 = arg2 - (arg3.field4410 * arg2 >> 14) - arg3.field4513;
        }
        field1328++;
        if (arg3.field4511 == 0) {
            arg3.field4554 = arg3.field4424;
        } else if (arg3.field4511 == 1) {
            arg3.field4554 = (arg1 - arg3.field4482) / 2 + arg3.field4424;
        } else if (arg3.field4511 == 2) {
            arg3.field4554 = arg1 - (arg3.field4482 + arg3.field4424);
        } else if (arg3.field4511 == 3) {
            arg3.field4554 = arg3.field4424 * arg1 >> 14;
        } else if (arg3.field4511 == 4) {
            arg3.field4554 = (arg1 - arg3.field4482) / 2 + (arg3.field4424 * arg1 >> 14);
        } else {
            arg3.field4554 = arg1 - arg3.field4482 - (arg3.field4424 * arg1 >> 14);
        }
        if (!class183.field3134) {
            return;
        }
        if (client.method987(arg3) == 0 && arg3.field4436 != 0) {
            return;
        }
        if (arg3.field4554 < 0) {
            arg3.field4554 = 0;
        } else if ((arg3.field4554 + arg3.field4482) > arg1) {
            arg3.field4554 = arg1 - arg3.field4482;
        }
        if (arg3.field4559 < 0) {
            arg3.field4559 = 0;
            return;
        }
        if (arg2 < arg3.field4559 + arg3.field4513) {
            arg3.field4559 = arg2 - arg3.field4513;
            return;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lik;I)V")
    public final void method501(class247 arg0, int arg1) {
        field1321++;
        int var3 = -14 % ((arg1 + 21) / 57);
        while (true) {
            int var4 = arg0.method1711((byte) -67);
            if (var4 == 0) {
                return;
            }
            this.method498(arg0, 36, var4);
        }
    }
}
