import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class235 {

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[[I")
    private int[][] field4046;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    private int field4044;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    private int field4042;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Z")
    public static boolean field4039 = true;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field4049 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public static int[] field4043;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "[I")
    public static int[] field4048;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1654(boolean arg0) {
        if (!arg0) {
            field4048 = (int[]) null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class220.field3784[var1] = true;
        }
        field4045++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IJ)V", line = 26)
    public static final void method1655(int arg0, long arg1) {
        field4047++;
        if (arg1 == 0L) {
            return;
        }
        class170.field2772.method1693(173, false);
        class261.field4393++;
        class170.field2772.method694(arg1, (byte) -34);
        if (arg0 != 0) {
            method1655(8, 94L);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lsl;", line = 52)
    public static final class264 method1656(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class264 var4 = var3.field2728;
            var3.field2728 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 63)
    public static void method1657(byte arg0) {
        field4048 = null;
        field4043 = null;
        if (arg0 != -128) {
            method1657((byte) 84);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I", line = 74)
    public final int method1658(int arg0, int arg1) {
        if (arg0 <= 80) {
            this.field4042 = -85;
        }
        if (this.field4046 != null) {
            arg1 = (int) ((long) this.field4044 * (long) arg1 / (long) this.field4042);
        }
        field4041++;
        return arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 90)
    public static final void method1659(Throwable arg0, String arg1, int arg2) {
        if (arg2 != -28677) {
            return;
        }
        field4040++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class234.method1651((byte) -103, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class161.field2609.field4878 == null) {
                return;
            }
            class147 var8 = class161.field2609.method1957(new URL(class161.field2609.field4878.getCodeBase(), "clienterror.ws?c=" + class296.field5061 + "&u=" + class123.field2043 + "&v1=" + class285.field4880 + "&v2=" + class285.field4869 + "&e=" + var7), 0);
            while (var8.field2322 == 0) {
                class99.method792(arg2 + 28676, 1L);
            }
            if (var8.field2322 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2323;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I", line = 157)
    public final int method1660(int arg0, int arg1) {
        int var3 = 81 / ((arg0 - 26) / 57);
        if (this.field4046 != null) {
            arg1 = ((int) ((long) this.field4044 * (long) arg1 / (long) this.field4042)) + 6;
        }
        field4050++;
        return arg1;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V", line = 168)
    public class235(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class53.method350(arg0, -128, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field4046 = new int[var5][14];
            this.field4044 = var4;
            this.field4042 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4046[var6];
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

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B[B)[B", line = 227)
    public final byte[] method1661(byte arg0, byte[] arg1) {
        if (arg0 != -48) {
            return (byte[]) null;
        }
        if (this.field4046 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg1.length * (long) this.field4044 / (long) this.field4042) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field4046[var5];
                for (int var10 = 0; var10 < 14; var10++) {
                    var6[var3 + var10] += var9[var10] * var8;
                }
                int var11 = this.field4044 + var5;
                int var12 = var11 / this.field4042;
                var5 = var11 - this.field4042 * var12;
                var3 += var12;
            }
            arg1 = new byte[var4];
            for (int var13 = 0; var13 < var4; var13++) {
                int var14 = var6[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        field4038++;
        return arg1;
    }
}
