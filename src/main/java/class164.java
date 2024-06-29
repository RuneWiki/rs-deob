import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class164 extends class145 {

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Lkca;")
    public static class73 field2011 = new class73(24, 1);

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2013 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field2014 = 1;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "[Lrj;")
    private class518[] field2010;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field2012;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (arg0) {
            this.method951((int[][]) null, 124);
        }
        if (super.field1779.field4602) {
            this.method951(super.field1779.method2077((byte) 99), 71);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([[II)V")
    private final void method951(int[][] arg0, int arg1) {
        ++field2008;
        int var3 = class647.field9368;
        int var4 = class441.field6574;
        class488.method2931(arg0, 55);
        if (arg1 <= 70) {
            field2011 = null;
        }
        class498.method2986(0, class444.field6649, -18178, class619.field8980, 0);
        if (this.field2010 != null) {
            for (int var5 = 0; ~var5 > ~this.field2010.length; ++var5) {
                class518 var6 = this.field2010[var5];
                int var7 = var6.field7537;
                int var8 = var6.field7535;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method223(var4, (byte) -92, var3);
                    }
                } else if (~var8 > -1) {
                    var6.method224(var3, var4, true);
                } else {
                    var6.method220(var3, 0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field1790 = ~arg2.method1177(255) == -2;
            }
        } else {
            this.field2010 = new class518[arg2.method1177(255)];
            for (int var4 = 0; ~this.field2010.length < ~var4; ++var4) {
                int var5 = arg2.method1177(255);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field2010[var4] = class316.method2078(arg2, 4);
                            }
                        } else {
                            this.field2010[var4] = class473.method2900(0, arg2);
                        }
                    } else {
                        this.field2010[var4] = class362.method2287(arg2, 2919);
                    }
                } else {
                    this.field2010[var4] = class270.method1765((byte) -126, arg2);
                }
            }
        }
        if (arg1 < -67) {
            ++field2007;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field2009;
        if (arg0 >= -28) {
            return null;
        } else {
            int[][] var3 = super.field1792.method1826(arg1, -16486);
            if (super.field1792.field3917) {
                int var4 = class647.field9368;
                int var5 = class441.field6574;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field1792.method1824(0);
                this.method951(var6, 82);
                for (int var8 = 0; ~class441.field6574 < ~var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~class647.field9368 < ~var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class643.method3659(255, var15) << 4;
                        var12[var14] = class643.method3659(65280, var15) >> 4;
                        var11[var14] = class643.method3659(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "(I)V")
    public static void method952(int arg0) {
        field2011 = null;
        field2013 = null;
        if (arg0 != 0) {
            field2013 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }
}
