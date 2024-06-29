import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class108 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    private int field2004;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[[I")
    private int[][] field2010;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lkh;")
    public static class117 field2002 = class224.method1450((byte) -34, "hint_headicons");

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[Z")
    public static boolean[] field2005 = new boolean[8];

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "S")
    public static short field2003 = 32767;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lkh;")
    public static class117 field2009 = class224.method1450((byte) 122, "Bitte geben Sie Ihren Benutzernamen ein)3");

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Lkh;")
    public static class117 field2007 = class224.method1450((byte) 110, "(R");

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ljava/awt/Frame;")
    public static Frame field2011;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method728(int arg0) {
        field2009 = null;
        if (arg0 != 2016501090) {
            method728(-121);
        }
        field2007 = null;
        field2011 = null;
        field2002 = null;
        field2005 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public final int method729(int arg0, int arg1) {
        if (arg1 != 14) {
            this.field2004 = 85;
        }
        field2006++;
        if (this.field2010 != null) {
            arg0 = (int) ((long) this.field2000 * (long) arg0 / (long) this.field2004);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
    public final int method730(int arg0, int arg1) {
        if (arg1 != 32768) {
            this.method729(122, 90);
        }
        field1999++;
        if (this.field2010 != null) {
            arg0 = (int) ((long) this.field2000 * (long) arg0 / (long) this.field2004) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BB)[B")
    public final byte[] method731(byte[] arg0, byte arg1) {
        if (this.field2010 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2000 / (long) this.field2004) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field2010[var5];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2000 + var5;
                int var14 = var13 / this.field2004;
                var6 += var14;
                var5 = var13 - this.field2004 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        int var15 = 18 / ((-arg1 - 48) / 63);
        field2008++;
        return arg0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static final void method732(byte arg0) {
        class105.field1911.method400(58, 8);
        class105.field1911.method1000((byte) 61, 0L);
        int var1 = -109 % ((46 - arg0) / 36);
        class207.field3719++;
        field2001++;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(II)V")
    public class108(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class217.method1423(arg0, arg1, true);
            int var4 = arg1 / var3;
            this.field2000 = var4;
            int var5 = arg0 / var3;
            this.field2004 = var5;
            this.field2010 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2010[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
