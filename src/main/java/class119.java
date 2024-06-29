import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class119 extends class220 {

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "I")
    private int field1601 = 0;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
    private int field1602 = 0;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    private int field1600 = 0;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "[I")
    public static int[] field1585 = new int[14];

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1586 = "Prepared sound engine";

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "[I")
    public static int[] field1598 = new int[14];

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field1595 = "Unable to find ";

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "Lmi;")
    public static class408 field1599 = new class408();

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "[Lbi;")
    public static class138[] field1605 = new class138[4];

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "Lqj;")
    public static class238 field1606;

    @OriginalMember(owner = "client!eh", name = "lb", descriptor = "[[Lro;")
    public static class249[][] field1607;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIII)V")
    private final void method831(int arg0, int arg1, int arg2, int arg3) {
        ++field1589;
        int var5 = ~arg1 < -2049 ? arg1 - -arg3 - (arg1 * arg3 >> 12) : (arg3 + 4096) * arg1 >> 12;
        if (arg0 != 8055) {
            field1603 = -1;
        }
        if (var5 <= 0) {
            this.field1594 = this.field1592 = this.field1593 = arg1;
        } else {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg1 + arg1;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field1593 = var15;
                                    this.field1592 = var7;
                                    this.field1594 = var5;
                                }
                            } else {
                                this.field1593 = var5;
                                this.field1594 = var14;
                                this.field1592 = var7;
                            }
                        } else {
                            this.field1592 = var15;
                            this.field1593 = var5;
                            this.field1594 = var7;
                        }
                    } else {
                        this.field1594 = var7;
                        this.field1592 = var5;
                        this.field1593 = var14;
                    }
                } else {
                    this.field1594 = var15;
                    this.field1592 = var5;
                    this.field1593 = var7;
                }
            } else {
                this.field1594 = var5;
                this.field1593 = var7;
                this.field1592 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field1601 = (arg2.method1708((byte) 127) << 12) / 100;
                }
            } else {
                this.field1600 = (arg2.method1708((byte) 127) << 12) / 100;
            }
        } else {
            this.field1602 = arg2.method1698(1625554944);
        }
        ++field1604;
        if (arg1 != -49) {
            field1605 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field1596;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int[][] var4 = this.method1369(0, (byte) 124, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class344.field5043; ++var11) {
                this.method833(var6[var11], -107, var5[var11], var7[var11]);
                this.field1597 += this.field1600;
                this.field1588 += this.field1601;
                for (this.field1590 += this.field1602; ~this.field1590 > -1; this.field1590 += 4096) {
                }
                while (~this.field1590 < -4097) {
                    this.field1590 -= 4096;
                }
                if (this.field1597 < 0) {
                    this.field1597 = 0;
                }
                if (~this.field1597 < -4097) {
                    this.field1597 = 4096;
                }
                if (this.field1588 < 0) {
                    this.field1588 = 0;
                }
                if (this.field1588 > 4096) {
                    this.field1588 = 4096;
                }
                this.method831(8055, this.field1588, this.field1590, this.field1597);
                var8[var11] = this.field1594;
                var9[var11] = this.field1592;
                var10[var11] = this.field1593;
            }
        }
        if (arg1 != 0) {
            this.method833(-74, -96, -10, -2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public static void method832(int arg0) {
        field1605 = null;
        field1586 = null;
        field1607 = null;
        field1599 = null;
        if (arg0 != 20480) {
            method834((class361) null, -124, -119);
        }
        field1595 = null;
        field1585 = null;
        field1598 = null;
        field1606 = null;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(IIII)V")
    private final void method833(int arg0, int arg1, int arg2, int arg3) {
        ++field1591;
        if (arg1 >= -30) {
            this.field1593 = -106;
        }
        int var5 = arg0 < arg2 ? arg2 : arg0;
        int var6 = arg0 > arg2 ? arg2 : arg0;
        int var7 = arg3 <= var5 ? var5 : arg3;
        int var8 = var6 <= arg3 ? var6 : arg3;
        int var9 = -var8 + var7;
        this.field1588 = (var8 - -var7) / 2;
        if (~this.field1588 < -1 && this.field1588 < 4096) {
            this.field1597 = (var9 << 12) / (~this.field1588 >= -2049 ? this.field1588 * 2 : -(this.field1588 * 2) + 8192);
        } else {
            this.field1597 = 0;
        }
        if (~var9 < -1) {
            int var10 = (-arg2 + var7 << 12) / var9;
            int var11 = (-arg0 + var7 << 12) / var9;
            int var12 = (-arg3 + var7 << 12) / var9;
            if (arg2 != var7) {
                if (arg0 != var7) {
                    this.field1590 = ~arg2 != ~var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field1590 = arg3 != var8 ? -var12 + 12288 : 4096 - -var10;
                }
            } else {
                this.field1590 = arg0 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field1590 /= 6;
        } else {
            this.field1590 = 0;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lme;II)Lis;")
    public static final class39 method834(class361 arg0, int arg1, int arg2) {
        ++field1587;
        class39 var3;
        if (class329.field4731 != null) {
            var3 = class329.field4731;
            class329.field4731 = class329.field4731.field627;
            var3.field627 = null;
            --class398.field5955;
        } else {
            var3 = new class39();
        }
        var3.field622 = arg2;
        if (arg1 < 54) {
            return null;
        } else {
            var3.field621 = arg0;
            return var3;
        }
    }
}
