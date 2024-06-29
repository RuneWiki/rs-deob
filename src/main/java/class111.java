import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class111 {

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    private int field1873 = 0;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    private int field1880 = -1;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "Lug;")
    private class392 field1885 = new class392();

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Z")
    public boolean field1888 = false;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "[Lju;")
    private class81[] field1877;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "[[[I")
    private int[][][] field1879;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1875 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V", line = 4)
    public final void method828(boolean arg0) {
        field1874++;
        for (int var2 = 0; var2 < this.field1886; var2++) {
            this.field1879[var2][0] = null;
            this.field1879[var2][1] = null;
            this.field1879[var2][2] = null;
            this.field1879[var2] = null;
        }
        this.field1879 = null;
        if (arg0) {
            this.field1877 = null;
            this.field1885.method2419((byte) 113);
            this.field1885 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 31)
    public static final void method829(int arg0) {
        class412.field6157 = 0;
        field1882++;
        boolean var1 = class92.field1573.method1063((byte) 116) == 1;
        if (arg0 <= 62) {
            return;
        }
        int var2 = class92.field1573.method1079(89);
        int var3 = class92.field1573.method1065((byte) 63);
        int var4 = class92.field1573.method1074((byte) -84);
        class66.method555(var3, (byte) -91);
        int var5 = (class34.field666 - class92.field1573.field2289) / 16;
        class451.field6746 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class451.field6746[var6][var10] = class92.field1573.method1070(-32387);
            }
        }
        class343.field5170 = new byte[var5][];
        class325.field4945 = null;
        class87.field1520 = new byte[var5][];
        class373.field5657 = new int[var5];
        class295.field4195 = new byte[var5][];
        class339.field5128 = new int[var5];
        class148.field2364 = new int[var5];
        class464.field6941 = null;
        class381.field5776 = new int[var5];
        class438.field6549 = new int[var5];
        class322.field4920 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var2 - (class33.field662 >> 4)) / 8; var8 <= ((class33.field662 >> 4) + var2) / 8; var8++) {
            for (int var9 = (var4 - (class121.field1966 >> 4)) / 8; var9 <= (((class121.field1966 >> 4) + var4) / 8); var9++) {
                class381.field5776[var7] = (var8 << 8) + var9;
                class148.field2364[var7] = class5.field122.method136("m" + var8 + "_" + var9, -120);
                class438.field6549[var7] = class5.field122.method136("l" + var8 + "_" + var9, -108);
                class373.field5657[var7] = class5.field122.method136("um" + var8 + "_" + var9, -65);
                class339.field5128[var7] = class5.field122.method136("ul" + var8 + "_" + var9, -100);
                var7++;
            }
        }
        class364.method2282(false, var2, var1, var4, 7170);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V", line = 108)
    public static void method830(byte arg0) {
        field1875 = null;
        int var1 = -14 / ((-arg0 - 6) / 51);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;", line = 121)
    public static final String method831(String arg0, String arg1, byte arg2, String arg3) {
        field1884++;
        int var4 = -79 / ((-arg2 - 45) / 55);
        for (int var5 = arg0.indexOf(arg1); var5 != -1; var5 = arg0.indexOf(arg1, var5 + arg3.length())) {
            arg0 = arg0.substring(0, var5) + arg3 + arg0.substring(var5 + arg1.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lqr;", line = 147)
    public static final class46 method832(Canvas arg0, boolean arg1) {
        field1876++;
        if (!arg1) {
            method831(null, null, (byte) 55, null);
        }
        try {
            Class var2 = Class.forName("gt");
            class46 var3 = (class46) var2.getDeclaredConstructor().newInstance();
            var3.method440(-13858, arg0);
            return var3;
        } catch (Throwable var5) {
            class496 var4 = new class496();
            var4.method440(-13858, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)[[[I", line = 174)
    public final int[][][] method833(boolean arg0) {
        field1881++;
        if (this.field1887 != this.field1886) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0) {
            return null;
        } else {
            for (int var2 = 0; var2 < this.field1886; var2++) {
                this.field1877[var2] = class177.field2698;
            }
            return this.field1879;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(III)V", line = 312)
    public class111(int arg0, int arg1, int arg2) {
        this.field1887 = arg1;
        this.field1886 = arg0;
        this.field1877 = new class81[this.field1887];
        this.field1879 = new int[this.field1886][3][arg2];
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 201)
    public static final String method834(long arg0, int arg1) {
        field1878++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = arg1;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class330.field4983[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)[[I", line = 235)
    public final int[][] method835(int arg0, byte arg1) {
        field1883++;
        if (arg1 != 23) {
            method834(-14L, -77);
        }
        if (this.field1887 == this.field1886) {
            this.field1888 = this.field1877[arg0] == null;
            this.field1877[arg0] = class177.field2698;
            return this.field1879[arg0];
        } else if (this.field1886 == 1) {
            this.field1888 = this.field1880 != arg0;
            this.field1880 = arg0;
            return this.field1879[0];
        } else {
            class81 var3 = this.field1877[arg0];
            if (var3 == null) {
                this.field1888 = true;
                if (this.field1886 > this.field1873) {
                    var3 = new class81(arg0, this.field1873);
                    this.field1873++;
                } else {
                    class81 var4 = (class81) this.field1885.method2426(true);
                    var3 = new class81(arg0, var4.field1422);
                    this.field1877[var4.field1424] = null;
                    var4.method2090(-1);
                }
                this.field1877[arg0] = var3;
            } else {
                this.field1888 = false;
            }
            this.field1885.method2428((byte) -30, var3);
            return this.field1879[var3.field1422];
        }
    }
}
