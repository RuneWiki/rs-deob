import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class130 extends class177 {

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Z")
    public static boolean field2034 = false;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "[J")
    public static long[] field2030 = new long[32];

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "[Lhm;")
    private class20[] field2036;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != -23387) {
            return (int[][]) ((int[][]) null);
        }
        field2038++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int var4 = class287.field4415;
            int var5 = class282.field4361;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field2645.method1455(arg1 + 50211);
            this.method995((byte) -92, var6);
            for (int var8 = 0; var8 < class282.field4361; var8++) {
                int[][] var9 = var7[var8];
                int[] var10 = var6[var8];
                int[] var11 = var9[1];
                int[] var12 = var9[0];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class287.field4415; var14++) {
                    int var15 = var10[var14];
                    var13[var14] = class142.method1078(255, var15) << 4;
                    var11[var14] = class142.method1078(65280, var15) >> 4;
                    var12[var14] = class142.method1078(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 65)
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I", line = 75)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 > -52) {
            method991(-73);
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -62);
        field2035++;
        if (this.field2652.field3287) {
            this.method995((byte) -92, this.field2652.method1480((byte) -65));
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 105)
    public static final void method991(int arg0) {
        field2041++;
        if (arg0 >= -79) {
            return;
        }
        int var1 = class207.field3267;
        int var2 = class255.field3814 - var1 - class210.field3314;
        int var3 = class298.field4673;
        int var4 = class99.field1461 - class125.field1972 - var3;
        if (var3 <= 0 && var4 <= 0 && var1 <= 0 && var2 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class63.field951 != null) {
                var5 = class63.field951;
            } else if (class184.field2857 == null) {
                var5 = class301.field4715.field285;
            } else {
                var5 = class184.field2857;
            }
            int var6 = 0;
            int var7 = 0;
            if (class184.field2857 == var5) {
                Insets var8 = class184.field2857.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var3 > 0) {
                var9.fillRect(var6, var7, var3, class255.field3814);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class99.field1461, var1);
            }
            if (var4 > 0) {
                var9.fillRect(class99.field1461 + var6 - var4, var7, var4, class255.field3814);
            }
            if (var2 > 0) {
                var9.fillRect(var6, class255.field3814 + var7 - var2, class99.field1461, var2);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[B)Lje;", line = 170)
    public static final class74 method992(byte arg0, byte[] arg1) {
        field2040++;
        if (arg1 == null) {
            return null;
        }
        class74 var2 = new class74(arg1, class271.field4096, class101.field1541, class111.field1756, class323.field5027, class274.field4162);
        class265.method1835(arg0 - 28);
        if (arg0 != 38) {
            method992((byte) 100, (byte[]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V", line = 188)
    public static void method993(boolean arg0) {
        if (!arg0) {
            field2030 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhb;II)V", line = 199)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field2039++;
        if (arg2 == 0) {
            this.field2036 = new class20[arg0.method273(65280)];
            for (int var4 = 0; var4 < this.field2036.length; var4++) {
                int var5 = arg0.method273(65280);
                if (var5 == 0) {
                    this.field2036[var4] = class193.method1398(class203.method1462(arg1, -25688), arg0);
                } else if (var5 == 1) {
                    this.field2036[var4] = class177.method1284(arg0, (byte) -79);
                } else if (var5 == 2) {
                    this.field2036[var4] = class323.method2213(arg0, 27958);
                } else if (var5 == 3) {
                    this.field2036[var4] = class309.method2138(arg0, (byte) 125);
                }
            }
        } else if (arg2 == 1) {
            this.field2649 = arg0.method273(65280) == 1;
        }
        if (arg1 != -18061) {
            this.method95(-103, -48);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 272)
    public static final int method994(String arg0, byte arg1) {
        field2032++;
        if (class213.field3390 == null || arg0.length() == 0) {
            return -1;
        }
        int var2 = 54 / ((17 - arg1) / 63);
        for (int var3 = 0; var3 < class213.field3390.field112; var3++) {
            if (class13.method104(" ", class213.field3390.field119[var3], -8622, "<br>").equals(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[[I)V", line = 311)
    private final void method995(byte arg0, int[][] arg1) {
        field2037++;
        int var3 = class287.field4415;
        int var4 = class282.field4361;
        class175.method1269((byte) -45, arg1);
        class72.method599(false, class11.field120, class133.field2090, 0, 0);
        if (arg0 != -92) {
            method994((String) null, (byte) -105);
        }
        if (this.field2036 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2036.length; var5++) {
            class20 var6 = this.field2036[var5];
            int var7 = var6.field221;
            int var8 = var6.field224;
            if (var7 >= 0) {
                if (var8 < 0) {
                    var6.method143(var4, (byte) -125, var3);
                } else {
                    var6.method144((byte) 119, var4, var3);
                }
            } else if (var8 >= 0) {
                var6.method139(var4, var3, 0);
            }
        }
    }
}
