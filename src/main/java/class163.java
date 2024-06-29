import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class163 extends class139 {

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    private int field2409 = 0;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    private int field2418 = 10;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    private int field2415 = 2048;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "[I")
    public static int[] field2414 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field2416 = 0;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field2411 = 0;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "[I")
    private int[] field2420;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "[I")
    private int[] field2421;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "[[S")
    public static short[][] field2413;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    private final void method1021(int arg0) {
        ++field2410;
        this.field2421 = new int[this.field2418 + 1];
        int var2 = 0;
        this.field2420 = new int[this.field2418 + 1];
        int var3 = arg0 / this.field2418;
        int var4 = this.field2415 * var3 >> 12;
        for (int var5 = 0; this.field2418 > var5; ++var5) {
            this.field2420[var5] = var2;
            this.field2421[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2420[this.field2418] = 4096;
        this.field2421[this.field2418] = this.field2421[0] + 4096;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V")
    public static final void method1022(boolean arg0, int arg1) {
        if (arg0) {
            field2413 = null;
        }
        ++field2417;
        if (!class314.field4438.field5788) {
            arg1 = -1;
        }
        if (class96.field1235 != arg1) {
            if (~arg1 != 0) {
                class369 var2 = class318.field4613.method1363(117, arg1);
                class72 var3 = var2.method2271(-112);
                if (var3 == null) {
                    arg1 = -1;
                } else {
                    class252.field3718.method2544(new Point(var2.field5328, var2.field5329), var3.method418(), var3.method419(), (byte) -110, var3.method429(), class465.field6503);
                    class96.field1235 = arg1;
                }
            }
            if (~arg1 == 0 && ~class96.field1235 != 0) {
                class252.field3718.method2544(new Point(), -1, (int[]) null, (byte) 67, -1, class465.field6503);
                class96.field1235 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public static final void method1023(int arg0) {
        class345.field5016.method2459(0);
        ++field2408;
        int var1 = class345.field5016.method2464(8, 0);
        if (var1 < class225.field3418) {
            for (int var2 = var1; ~class225.field3418 < ~var2; ++var2) {
                class262.field3842[class29.field390++] = class281.field4139[var2];
            }
        }
        if (var1 > class225.field3418) {
            throw new RuntimeException("gnpov1");
        } else {
            class225.field3418 = 0;
            int var3 = 0;
            if (arg0 <= 27) {
                method1023(-79);
            }
            while (var1 > var3) {
                int var4 = class281.field4139[var3];
                class216 var5 = class139.field1851[var4];
                int var6 = class345.field5016.method2464(1, 0);
                if (~var6 == -1) {
                    class281.field4139[class225.field3418++] = var4;
                    var5.field2144 = class353.field5090;
                } else {
                    int var7 = class345.field5016.method2464(2, 0);
                    if (var7 == 0) {
                        class281.field4139[class225.field3418++] = var4;
                        var5.field2144 = class353.field5090;
                        class420.field5870[class94.field1202++] = var4;
                    } else if (~var7 == -2) {
                        class281.field4139[class225.field3418++] = var4;
                        var5.field2144 = class353.field5090;
                        int var8 = class345.field5016.method2464(3, 0);
                        var5.method1389(var8, -69, 1);
                        int var9 = class345.field5016.method2464(1, 0);
                        if (var9 == 1) {
                            class420.field5870[class94.field1202++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class281.field4139[class225.field3418++] = var4;
                        var5.field2144 = class353.field5090;
                        if (class345.field5016.method2464(1, 0) != 1) {
                            int var10 = class345.field5016.method2464(3, 0);
                            var5.method1389(var10, -73, 0);
                        } else {
                            int var11 = class345.field5016.method2464(3, 0);
                            var5.method1389(var11, -107, 2);
                            int var12 = class345.field5016.method2464(3, 0);
                            var5.method1389(var12, -104, 2);
                        }
                        int var13 = class345.field5016.method2464(1, 0);
                        if (var13 == 1) {
                            class420.field5870[class94.field1202++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class262.field3842[class29.field390++] = var4;
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field2422;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int var4 = class237.field3559[arg0];
            if (this.field2409 == 0) {
                short var5 = 0;
                for (int var6 = 0; this.field2418 > var6; ++var6) {
                    if (~var4 <= ~this.field2420[var6] && ~var4 > ~this.field2420[var6 - -1]) {
                        if (~var4 > ~this.field2421[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class415.method2446(var3, 0, class356.field5147, var5);
            } else {
                for (int var7 = 0; class356.field5147 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class216.field3245[var7];
                    int var11 = this.field2409;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + var10 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field2418; ++var12) {
                        if (this.field2420[var12] <= var8 && this.field2420[var12 + 1] > var8) {
                            if (var8 < this.field2421[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        if (arg1 != 27782) {
            field2416 = 22;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        if (arg0 == 7) {
            ++field2412;
            this.method1021(4096);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2409 = arg0.method1701(-23121);
                }
            } else {
                this.field2415 = arg0.method1729(arg1 ^ -65325);
            }
        } else {
            this.field2418 = arg0.method1701(-23121);
        }
        if (arg1 == -45) {
            ++field2419;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public static void method1024(int arg0) {
        field2413 = null;
        field2414 = null;
        if (arg0 != 2048) {
            method1023(0);
        }
    }
}
