import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class157 {

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[[I")
    private int[][] field2384;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    private int field2382;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ldi;")
    public static class83 field2377 = new class83(34, -1);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[Ll;")
    public static class16[] field2386;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I", line = 4)
    public final int method1042(int arg0, int arg1) {
        if (arg1 != 6) {
            this.field2382 = -66;
        }
        if (this.field2384 != null) {
            arg0 = ((int) ((long) this.field2382 * (long) arg0 / (long) this.field2381)) + 6;
        }
        field2385++;
        return arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 19)
    public static void method1043(int arg0) {
        field2386 = null;
        if (arg0 <= 1) {
            method1046(-28, -42L);
        }
        field2377 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I", line = 30)
    public static final int method1044(byte arg0) {
        field2376++;
        class38 var1 = class269.field3721;
        boolean var2 = false;
        if (class152.field2332 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class38.method319(0, null, null, var3, (byte) -103, 0);
            var2 = true;
        }
        long var4 = class246.method1483(5957);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method328(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class246.method1483(5957) - var4);
        var1.method325(0, 100, -16777216, 1, 0, 100);
        if (var2) {
            var1.method267(arg0 - 36);
        }
        if (arg0 != -49) {
            field2377 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)I", line = 74)
    public final int method1045(boolean arg0, int arg1) {
        field2379++;
        if (this.field2384 != null) {
            arg1 = (int) ((long) this.field2382 * (long) arg1 / (long) this.field2381);
        }
        if (arg0) {
            this.field2381 = -54;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)V", line = 88)
    public static final void method1046(int arg0, long arg1) {
        field2378++;
        if (arg0 != -128) {
            field2377 = null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class441.method2620(arg0 + 229, arg1 - 1L);
            class441.method2620(91, 1L);
        } else {
            class441.method2620(-121, arg1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 121)
    public static final void method1047(String arg0, byte arg1) {
        if (arg1 >= -110) {
            field2377 = null;
        }
        field2380++;
        class194.field2773 = arg0;
        if (class202.field2840.field7425 == null) {
            return;
        }
        try {
            String var2 = class202.field2840.field7425.getParameter("cookieprefix");
            String var3 = class202.field2840.field7425.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class181.method1164(-27288, class246.method1483(5957) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class390.method2299("document.cookie=\"" + var5 + "\"", 32095, class202.field2840.field7425);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[B)[B", line = 154)
    public final byte[] method1048(int arg0, byte[] arg1) {
        if (this.field2384 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2382 / (long) this.field2381) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2384[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2382 + var6;
                int var14 = var13 / this.field2381;
                var5 += var14;
                var6 = var13 - this.field2381 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        if (arg0 != -10001) {
            method1043(-37);
        }
        field2383++;
        return arg1;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II)V", line = 223)
    public class157(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class328.method1902(arg0, arg1, -22662);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2381 = var4;
            this.field2384 = new int[var4][14];
            this.field2382 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2384[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
