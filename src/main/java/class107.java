import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class107 extends class104 {

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[J")
    private long[] field2045 = new long[10];

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    private int field2040 = 1;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    private int field2037 = 256;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    private int field2048 = 0;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "J")
    private long field2039 = class7.method55(0);

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[I")
    public static int[] field2046 = new int[50];

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "[I")
    public static int[] field2047 = new int[32];

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    private int field2041;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Lv;")
    public static class22 field2049;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[Lrh;")
    public static class242[] field2042;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method864(byte arg0) {
        field2049 = null;
        field2047 = null;
        field2046 = null;
        int var1 = 44 / ((-arg0 - 7) / 63);
        field2042 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method865(int arg0, Throwable arg1, String arg2) {
        field2038++;
        try {
            if (arg0 >= -71) {
                method865(-3, (Throwable) null, (String) null);
            }
            String var3 = "";
            if (arg1 != null) {
                var3 = class27.method170(arg1, -68);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class56.field930.field3055 != null) {
                class198 var8 = class56.field930.method1251(new URL(class56.field930.field3055.getCodeBase(), "clienterror.ws?c=" + class170.field3112 + "&u=" + class9.field156 + "&v1=" + class166.field3067 + "&v2=" + class166.field3070 + "&e=" + var7), 4);
                while (var8.field3566 == 0) {
                    method866(0, 1L);
                }
                if (var8.field3566 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3563;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
    public final int method841(int arg0, int arg1, int arg2) {
        field2035++;
        int var4 = this.field2037;
        this.field2037 = 300;
        int var5 = this.field2040;
        this.field2040 = 1;
        this.field2039 = class7.method55(arg1 - 320);
        if (this.field2045[this.field2041] == 0L) {
            this.field2040 = var5;
            this.field2037 = var4;
        } else if (this.field2039 > this.field2045[this.field2041]) {
            this.field2037 = (int) ((long) (arg0 * 2560) / (this.field2039 - this.field2045[this.field2041]));
        }
        if (this.field2037 < 25) {
            this.field2037 = 25;
        }
        if (this.field2037 > 256) {
            this.field2037 = 256;
            this.field2040 = (int) ((long) arg0 - (this.field2039 - this.field2045[this.field2041]) / 10L);
        }
        if (this.field2040 > arg0) {
            this.field2040 = arg0;
        }
        this.field2045[this.field2041] = this.field2039;
        this.field2041 = (this.field2041 + 1) % 10;
        if (this.field2040 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2045[var6] != 0L) {
                    this.field2045[var6] += (long) this.field2040;
                }
            }
        }
        int var7 = 0;
        if (arg2 > this.field2040) {
            this.field2040 = arg2;
        }
        if (arg1 != 320) {
            this.method842(112);
        }
        method866(arg1 - 320, (long) this.field2040);
        while (this.field2048 < 256) {
            this.field2048 += this.field2037;
            var7++;
        }
        this.field2048 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)V")
    public static final void method866(int arg0, long arg1) {
        field2044++;
        if (arg0 != 0) {
            field2049 = null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class255.method1728((byte) -36, arg1 - 1L);
            class255.method1728((byte) -101, 1L);
        } else {
            class255.method1728((byte) -57, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method842(int arg0) {
        field2036++;
        if (arg0 <= -106) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field2045[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class107() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2045[var1] = this.field2039;
        }
    }
}
