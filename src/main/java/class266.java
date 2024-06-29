import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class266 {

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    private int field4008;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[[I")
    private int[][] field4001;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    private int field4007;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V", line = 4)
    public static final void method1710(byte arg0, Throwable arg1, String arg2) {
        field4000++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class77.method593(-124, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class460.method2731(var3, 77);
            String var4 = class67.method533("%3a", false, var3, ":");
            String var5 = class67.method533("%40", false, var4, "@");
            String var6 = class67.method533("%26", false, var5, "&");
            if (arg0 != 81) {
                method1711(-7);
            }
            String var7 = class67.method533("%23", false, var6, "#");
            if (class366.field5301.field5824 != null) {
                class81 var8 = class366.field5301.method2456(new URL(class366.field5301.field5824.getCodeBase(), "clienterror.ws?c=" + class13.field136 + "&u=" + class256.field3796 + "&v1=" + class411.field5811 + "&v2=" + class411.field5816 + "&e=" + var7), 126);
                while (var8.field1314 == 0) {
                    class477.method2826(1L, 0);
                }
                if (var8.field1314 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1311;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 58)
    public static final void method1711(int arg0) {
        if (arg0 != 0) {
            return;
        }
        class511 var1 = class53.field980;
        synchronized (class53.field980) {
            class53.field980.method2980(-182819096);
        }
        field4003++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B[B)[B", line = 74)
    public final byte[] method1712(byte arg0, byte[] arg1) {
        if (arg0 <= 73) {
            field4005 = -11;
        }
        if (this.field4001 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4007 / (long) this.field4008) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4001[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4007 + var6;
                int var14 = var13 / this.field4008;
                var6 = var13 - this.field4008 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field4002++;
        return arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I", line = 144)
    public final int method1713(int arg0, int arg1) {
        if (this.field4001 != null) {
            arg0 = (int) ((long) this.field4007 * (long) arg0 / (long) this.field4008) + 6;
        }
        if (arg1 != -15) {
            this.field4008 = -103;
        }
        field4004++;
        return arg0;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(II)V", line = 161)
    public class266(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class90.method666(arg1, arg0, 8);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field4008 = var4;
            this.field4001 = new int[var4][14];
            this.field4007 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field4001[var6];
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

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)I", line = 221)
    public final int method1714(int arg0, byte arg1) {
        field4006++;
        if (this.field4001 != null) {
            arg0 = (int) ((long) this.field4007 * (long) arg0 / (long) this.field4008);
        }
        return arg1 >= -127 ? 19 : arg0;
    }
}
