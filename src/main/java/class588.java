import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class588 extends class324 {

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field8446 = 0;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field8436;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public int field8437;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public int field8439;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field8444;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public int field8452;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public int field8453;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public int field8454;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public int field8456;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public int field8459;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public int field8462;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public int field8463;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "Lnt;")
    public class189 field8455;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "Lnt;")
    public class189 field8457;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lqd;")
    public class385 field8445;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lte;")
    public class534 field8443;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lte;")
    public class534 field8448;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lrw;")
    public class654 field8447;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lrw;")
    public class654 field8451;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Leca;")
    public class655 field8442;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Ltt;")
    public class78 field8440;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Z")
    public boolean field8449;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Z")
    public boolean field8460;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Z")
    public boolean field8461;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
    public int[] field8435;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIII)I", line = 5)
    public static final int method3435(boolean arg0, int arg1, int arg2, int arg3) {
        field8458++;
        class594 var4 = class581.method3372(arg0, arg2, arg1 - 66);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg1; var6 < var4.field8676.length; var6++) {
                if (var4.field8680[var6] == arg3) {
                    var5 += var4.field8676[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)V", line = 37)
    public static final void method3436(byte arg0, int arg1, int arg2) {
        if (class182.field2259 < class182.field2252) {
            class182.field2259 = (float) ((double) class182.field2259 / 30.0D + (double) class182.field2259);
            if (class182.field2252 < class182.field2259) {
                class182.field2259 = class182.field2252;
            }
            class171.method986((byte) 31);
            class182.field2254 = (int) class182.field2259 >> 1;
            class182.field2256 = class256.method1711(class182.field2254, 1);
        } else if (class182.field2259 > class182.field2252) {
            class182.field2259 = (float) ((double) class182.field2259 - (double) class182.field2259 / 30.0D);
            if (class182.field2252 > class182.field2259) {
                class182.field2259 = class182.field2252;
            }
            class171.method986((byte) 31);
            class182.field2254 = (int) class182.field2259 >> 1;
            class182.field2256 = class256.method1711(class182.field2254, 1);
        }
        field8450++;
        if (class212.field2909 != -1 && class59.field682 != -1) {
            int var3 = class212.field2909 - class421.field6299;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class59.field682 - class75.field814;
            class421.field6299 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class59.field682 = -1;
                class212.field2909 = -1;
            }
            class75.field814 += var4;
            class171.method986((byte) 31);
        }
        if (class647.field9361 <= 0) {
            class83.field945 = -1;
            class330.field4756 = -1;
        } else {
            class590.field8474--;
            if (class590.field8474 == 0) {
                class647.field9361--;
                class590.field8474 = 100;
            }
        }
        if (arg0 < 101) {
            field8441 = -31;
        }
        if (!class304.field4477 || class501.field7292 == null) {
            return;
        }
        for (class491 var5 = (class491) class501.field7292.method719(false); var5 != null; var5 = (class491) class501.field7292.method716(14)) {
            class431 var6 = class182.field2242.method1014(var5.field7156.field7060, 5187);
            if (var5.method2950(arg1, arg2, Integer.MAX_VALUE)) {
                if (var6.field6422 != null) {
                    if (var6.field6422[4] != null) {
                        class36.method198(true, var6.field6406, -1, var6.field6422[4], -1, true, 0, var6.field6403, false, 1011, (long) var5.field7156.field7060);
                    }
                    if (var6.field6422[3] != null) {
                        class36.method198(true, var6.field6406, -1, var6.field6422[3], -1, true, 0, var6.field6403, false, 1009, (long) var5.field7156.field7060);
                    }
                    if (var6.field6422[2] != null) {
                        class36.method198(true, var6.field6406, -1, var6.field6422[2], -1, true, 0, var6.field6403, false, 1007, (long) var5.field7156.field7060);
                    }
                    if (var6.field6422[1] != null) {
                        class36.method198(true, var6.field6406, -1, var6.field6422[1], -1, true, 0, var6.field6403, false, 1001, (long) var5.field7156.field7060);
                    }
                    if (var6.field6422[0] != null) {
                        class36.method198(true, var6.field6406, -1, var6.field6422[0], -1, true, 0, var6.field6403, false, 1002, (long) var5.field7156.field7060);
                    }
                }
                if (!var5.field7156.field7055) {
                    var5.field7156.field7055 = true;
                    class604.method3513(class450.field6717, var5.field7156.field7060, var6.field6403);
                }
                if (var5.field7156.field7055) {
                    class604.method3513(class197.field2665, var5.field7156.field7060, var6.field6403);
                }
            } else if (var5.field7156.field7055) {
                var5.field7156.field7055 = false;
                class604.method3513(class626.field9055, var5.field7156.field7060, var6.field6403);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 203)
    public final void method3437(int arg0) {
        field8438++;
        int var2 = this.field8436;
        if (arg0 >= -93) {
            method3436((byte) -121, 87, 116);
        }
        boolean var3 = this.field8461;
        if (this.field8445 != null) {
            class385 var6 = this.field8445.method2453(class23.field243, 0);
            if (var6 == null) {
                this.field8436 = -1;
                this.field8461 = false;
                this.field8435 = null;
                this.field8449 = false;
                this.field8439 = 0;
                this.field8459 = 0;
                this.field8437 = 0;
                this.field8454 = 0;
            } else {
                this.field8437 = var6.field5842;
                this.field8439 = var6.field5849;
                this.field8435 = var6.field5846;
                this.field8449 = var6.field5822;
                this.field8459 = var6.field5881;
                this.field8454 = var6.field5877 << 9;
                this.field8436 = var6.field5803;
                this.field8461 = var6.field5821;
            }
        } else if (this.field8440 != null) {
            int var4 = class46.method245(this.field8440, 80);
            if (var2 != var4) {
                this.field8436 = var4;
                class566 var5 = this.field8440.field864;
                if (var5.field8121 != null) {
                    var5 = var5.method3287(123, class23.field243);
                }
                if (var5 == null) {
                    this.field8461 = this.field8440.field864.field8087;
                    this.field8437 = this.field8454 = 0;
                } else {
                    this.field8437 = var5.field8063;
                    this.field8454 = var5.field8124 << 9;
                    this.field8461 = var5.field8087;
                }
            }
        } else if (this.field8442 != null) {
            this.field8436 = class78.method511((byte) 3, this.field8442);
            this.field8461 = this.field8442.field9438;
            this.field8454 = this.field8442.field9482 << 9;
            this.field8437 = this.field8442.field9441;
        }
        if (this.field8436 == var2 && var3 == this.field8461) {
            return;
        }
        if (this.field8455 == null) {
            return;
        }
        class44.field469.method934(this.field8455);
        this.field8447 = null;
        this.field8455 = null;
        this.field8443 = null;
    }
}
