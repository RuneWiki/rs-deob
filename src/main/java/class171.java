import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class171 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
    private int[] field2005 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[Lji;")
    public static class572[] field2000 = new class572[2048];

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[[I")
    public static int[][] field2016 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lca;")
    public static class285 field2002;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lufa;")
    public class637 field2017;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[I")
    private int[] field2015;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[S")
    private short[] field2006;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[S")
    private short[] field2009;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[S")
    private short[] field2011;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[S")
    private short[] field2013;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILji;Z)V")
    private final void method1025(int arg0, class572 arg1, boolean arg2) {
        if (arg0 == 1) {
            arg1.method3097((byte) 12);
        } else if (arg0 == 2) {
            int var4 = arg1.method3097((byte) 12);
            this.field2015 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2015[var5] = arg1.method3031(-1);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg1.method3097((byte) 12);
                this.field2013 = new short[var6];
                this.field2006 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2013[var7] = (short) arg1.method3031(-1);
                    this.field2006[var7] = (short) arg1.method3031(-1);
                }
            } else if (arg0 == 41) {
                int var8 = arg1.method3097((byte) 12);
                this.field2011 = new short[var8];
                this.field2009 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field2009[var9] = (short) arg1.method3031(-1);
                    this.field2011[var9] = (short) arg1.method3031(-1);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field2005[arg0 - 60] = arg1.method3031(-1);
            }
        }
        field2007++;
        if (arg2) {
            field2000 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Z")
    public final boolean method1026(byte arg0) {
        field2004++;
        if (this.field2015 == null) {
            return true;
        }
        boolean var2 = true;
        class275 var3 = this.field2017.field8633;
        synchronized (this.field2017.field8633) {
            for (int var4 = 0; var4 < this.field2015.length; var4++) {
                if (!this.field2017.field8633.method1667(0, this.field2015[var4], 107)) {
                    var2 = false;
                }
            }
            if (arg0 > -25) {
                this.method1033((byte) 56);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class699.field9682 = arg0;
        field2018++;
        class92.field1186 = arg1;
        if (arg5 <= 0) {
            return;
        }
        class19.field201 = arg3;
        class102.field1309 = arg2;
        class465.field5772 = arg4;
        if (class465.field5772 >= 100) {
            int var6 = class92.field1186 * 512 + 256;
            int var7 = class102.field1309 * 512 + 256;
            int var8 = class514.method2798(var7, var6, class675.field9219, (byte) 36) - class19.field201;
            int var9 = var6 - class238.field3071;
            int var10 = var8 - class455.field5688;
            int var11 = var7 - class710.field9924;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            client.field3568 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class177.field2068 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (client.field3568 < 1024) {
                client.field3568 = 1024;
            }
            class613.field8340 = 0;
            if (client.field3568 > 3072) {
                client.field3568 = 3072;
            }
        }
        class385.field4946 = 2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Lnj;")
    public final class229 method1028(int arg0) {
        field2003++;
        if (this.field2015 == null) {
            return null;
        }
        class229[] var2 = new class229[this.field2015.length];
        class275 var3 = this.field2017.field8633;
        synchronized (this.field2017.field8633) {
            int var4 = 0;
            while (true) {
                if (this.field2015.length <= var4) {
                    break;
                }
                var2[var4] = class167.method1013((byte) -28, this.field2015[var4], this.field2017.field8633, 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field2015.length; var5++) {
            if (var2[var5].field2998 < 13) {
                var2[var5].method1380(2, -1);
            }
        }
        if (arg0 != 9) {
            method1027(-90, -119, -92, 67, 30, (byte) -51);
        }
        class229 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class229(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2013 != null) {
            for (int var7 = 0; var7 < this.field2013.length; var7++) {
                var6.method1381(0, this.field2013[var7], this.field2006[var7]);
            }
        }
        if (this.field2009 != null) {
            for (int var8 = 0; var8 < this.field2009.length; var8++) {
                var6.method1391(this.field2009[var8], this.field2011[var8], (byte) -101);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static void method1029(boolean arg0) {
        field2016 = null;
        field2002 = null;
        if (arg0) {
            field2000 = null;
        }
        field2000 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BZ)C")
    public static final char method1030(byte arg0, boolean arg1) {
        field2012++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class89.field1159[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (!arg1) {
            field2002 = null;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lji;I)V")
    public final void method1031(class572 arg0, int arg1) {
        int var3 = 66 / ((arg1 + 47) / 61);
        field2010++;
        while (true) {
            int var4 = arg0.method3097((byte) 12);
            if (var4 == 0) {
                return;
            }
            this.method1025(var4, arg0, false);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z")
    public final boolean method1032(byte arg0) {
        field2014++;
        boolean var2 = true;
        class275 var3 = this.field2017.field8633;
        synchronized (this.field2017.field8633) {
            int var4 = 0;
            if (arg0 != -105) {
                return true;
            }
            while (var4 < 5) {
                if (this.field2005[var4] != -1 && !this.field2017.field8633.method1667(0, this.field2005[var4], arg0 + 166)) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)Lnj;")
    public final class229 method1033(byte arg0) {
        field2001++;
        class229[] var2 = new class229[5];
        int var3 = 0;
        class275 var4 = this.field2017.field8633;
        synchronized (this.field2017.field8633) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field2005[var5] != -1) {
                    var2[var3++] = class167.method1013((byte) -28, this.field2005[var5], this.field2017.field8633, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field2998 < 13) {
                var2[var6].method1380(2, -1);
            }
        }
        if (arg0 < 55) {
            this.field2009 = null;
        }
        class229 var7 = new class229(var2, var3);
        if (this.field2013 != null) {
            for (int var8 = 0; var8 < this.field2013.length; var8++) {
                var7.method1381(0, this.field2013[var8], this.field2006[var8]);
            }
        }
        if (this.field2009 != null) {
            for (int var9 = 0; var9 < this.field2009.length; var9++) {
                var7.method1391(this.field2009[var9], this.field2011[var9], (byte) -48);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public static final void method1034(byte arg0) {
        field2008++;
        if (class644.field8740 != null) {
            return;
        }
        class644.field8740 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var9 = var17;
                    var10 = var8;
                    var11 = var16;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var9 = var16;
                    var11 = var8;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
                } else if (var14 == 5) {
                    var10 = var16;
                    var11 = var17;
                    var9 = var8;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class644.field8740[var3++] = var25;
            }
        }
        if (arg0 < 41) {
            field2002 = null;
        }
    }
}
