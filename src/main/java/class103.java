import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class103 implements Runnable {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
    public boolean field2170 = true;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Ljava/lang/Object;")
    public Object field2179 = new Object();

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
    public int[] field2182 = new int[500];

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "[I")
    public int[] field2184 = new int[500];

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public int field2181 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2165 = -1;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2176 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[J")
    public static long[] field2166 = new long[100];

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2174 = -1;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lo;")
    public static class84 field2183 = class15.method124("Please use a different world)3", 255);

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lo;")
    public static class84 field2175 = class15.method124("No matching objects found)1 please shorten search", 255);

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2177 = -1;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
    public static int[] field2167;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 7)
    public static void method770(int arg0) {
        if (arg0 == -3) {
            field2175 = null;
            field2183 = null;
            field2167 = null;
            field2166 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[B)[B", line = 23)
    public static final byte[] method771(byte arg0, byte[] arg1) {
        field2173++;
        class27 var2 = new class27(arg1);
        int var3 = var2.method231(255);
        int var4 = var2.method251((byte) 105);
        if (arg0 < 84) {
            field2171 = 51;
        }
        if (var4 < 0 || class37.field720 != 0 && class37.field720 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method232(0, var4, var5, -48);
            return var5;
        } else {
            int var6 = var2.method251((byte) 105);
            if (var6 < 0 || class37.field720 != 0 && var6 > class37.field720) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class91.method710(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lvc;", line = 107)
    public static final class122 method772(int arg0, int arg1) {
        class122 var2 = (class122) class24.field403.method737((long) arg1, (byte) -113);
        field2180++;
        if (arg0 != 3) {
            field2174 = 6;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class50.field1087.method909((byte) -125, arg1, 1);
        class122 var4 = new class122();
        if (var3 != null) {
            var4.method954(new class27(var3), 122, arg1);
        }
        var4.method955((byte) 110);
        class24.field403.method744(-120, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lvb;", line = 144)
    public static final class121 method773(byte arg0) {
        field2172++;
        class121 var1 = new class121();
        var1.field2708 = class51.field1098;
        var1.field2706 = class125.field2768;
        var1.field2707 = class101.field2156[0];
        var1.field2703 = class116.field2543[0];
        var1.field2709 = class78.field1668[0];
        var1.field2704 = class24.field397[0];
        if (arg0 != -57) {
            method774(35, 30, -62, -89);
        }
        int var2 = var1.field2709 * var1.field2704;
        byte[] var3 = class110.field2385[0];
        var1.field2705 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field2705[var4] = class25.field432[class61.method486(var3[var4], 255)];
        }
        class112.method864(20);
        return var1;
    }

    @OriginalMember(owner = "client!rd", name = "run", descriptor = "()V", line = 183)
    public final void run() {
        while (this.field2170) {
            Object var1 = this.field2179;
            synchronized (this.field2179) {
                if (this.field2181 < 500) {
                    this.field2182[this.field2181] = class38.field748;
                    this.field2184[this.field2181] = class119.field2644;
                    this.field2181++;
                }
            }
            class113.method873(true, 50L);
        }
        field2168++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I", line = 208)
    public static final int method774(int arg0, int arg1, int arg2, int arg3) {
        field2178++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        }
        if (arg1 < 64) {
            field2174 = -21;
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }
}
