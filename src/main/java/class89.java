import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class89 extends class107 {

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    private int field1383 = 2048;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    private int field1381 = 0;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    private int field1385 = 10;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field1384 = 0;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "[I")
    public static int[] field1382 = new int[25];

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "[I")
    public static int[] field1386 = new int[256];

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "Z")
    public static boolean field1396 = false;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lad;")
    public static class275 field1388 = new class275(64);

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "Ltg;")
    public static class194 field1397;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "[I")
    private int[] field1390;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "[I")
    private int[] field1395;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)Ljf;")
    public static final class66 method619(int arg0, int arg1) {
        ++field1391;
        class66 var2 = (class66) class146.field2348.method1879(8887, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class53.field782.method1156(arg1, arg0, (byte) -16);
            class66 var4 = new class66();
            if (var3 != null) {
                var4.method436(new class274(var3), (byte) -48);
            }
            class146.field2348.method1883((long) arg0, -112, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILgi;BI)[Lag;")
    public static final class197[] method620(int arg0, class164 arg1, byte arg2, int arg3) {
        if (arg2 != 59) {
            method622(-110);
        }
        ++field1393;
        return !class284.method1927(arg3, (byte) -78, arg0, arg1) ? null : class74.method537((byte) -92);
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
    private final void method621(int arg0) {
        ++field1389;
        this.field1395 = new int[this.field1385 + 1];
        this.field1390 = new int[this.field1385 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1385;
        int var4 = this.field1383 * var3 >> 12;
        for (int var5 = 0; this.field1385 > var5; ++var5) {
            this.field1395[var5] = var2;
            this.field1390[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1395[this.field1385] = arg0;
        this.field1390[this.field1385] = this.field1390[0] + 4096;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public static void method622(int arg0) {
        if (arg0 == -19644) {
            field1386 = null;
            field1397 = null;
            field1388 = null;
            field1382 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        this.method621(4096);
        ++field1380;
        if (arg0 != 35) {
            field1388 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field1394;
        if (arg2 == 28) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        this.field1381 = arg1.method1849(255);
                    }
                } else {
                    this.field1383 = arg1.method1837(252);
                }
            } else {
                this.field1385 = arg1.method1849(255);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V")
    public static final void method623(byte arg0) {
        ++field1392;
        int var1 = class74.method538(-27785);
        if (~var1 != -1) {
            if (var1 == 1) {
                class40.method278((byte) 0, (byte) -81);
                class255.method1726((byte) -99, 512);
                if (class214.field3386 != null) {
                    class93.method646((byte) 120);
                }
            } else {
                class40.method278((byte) (255 & field1384 - 4), (byte) -70);
                class255.method1726((byte) -101, 2);
            }
        } else {
            class217.field3412 = null;
            class255.method1726((byte) -90, 0);
        }
        if (arg0 == 117) {
            class92.field1469 = class214.field3389;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class89() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field1387;
        int[] var3 = super.field1661.method894(117, arg1);
        int var4 = 7 % ((-34 - arg0) / 49);
        if (super.field1661.field2115) {
            int var5 = class259.field4254[arg1];
            if (this.field1381 != 0) {
                for (int var6 = 0; class24.field443 > var6; ++var6) {
                    int var7 = 0;
                    int var8 = class221.field3486[var6];
                    short var9 = 0;
                    int var10 = this.field1381;
                    if (var10 != 1) {
                        if (~var10 != -3) {
                            if (var10 == 3) {
                                var7 = 2048 - -(-var5 + var8 >> 1);
                            }
                        } else {
                            var7 = (var8 - (-var5 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var7 = var8;
                    }
                    for (int var11 = 0; var11 < this.field1385; ++var11) {
                        if (this.field1395[var11] <= var7 && ~var7 > ~this.field1395[var11 + 1]) {
                            if (~var7 > ~this.field1390[var11]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var6] = var9;
                }
            } else {
                short var12 = 0;
                for (int var13 = 0; ~this.field1385 < ~var13; ++var13) {
                    if (this.field1395[var13] <= var5 && var5 < this.field1395[var13 - -1]) {
                        if (~var5 > ~this.field1390[var13]) {
                            var12 = 4096;
                        }
                        break;
                    }
                }
                class282.method1920(var3, 0, class24.field443, var12);
            }
        }
        return var3;
    }
}
