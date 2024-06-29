import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class82 extends class154 {

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    private int field1289 = 3216;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    private int field1281 = 3216;

    @OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
    private int field1294 = 4096;

    @OriginalMember(owner = "client!jd", name = "qb", descriptor = "[I")
    private int[] field1299 = new int[3];

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Leg;")
    public static class37 field1282 = class174.method1167("::qa_op_test", 94);

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "Leg;")
    public static class37 field1287 = class174.method1167("null", 77);

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
    public static int field1291 = -1;

    @OriginalMember(owner = "client!jd", name = "nb", descriptor = "Leg;")
    public static class37 field1296 = class174.method1167(" de votre liste noire)3", 100);

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!jd", name = "kb", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!jd", name = "mb", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!jd", name = "ob", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!jd", name = "pb", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "Lpi;")
    public static class188 field1285;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V")
    public static final void method550(byte arg0) {
        ++field1297;
        if (arg0 == 77) {
            class117.field1987 = new class226();
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field1286;
        this.method551(-11135);
        if (arg0 != -9) {
            method554((byte) -97);
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    private final void method551(int arg0) {
        ++field1284;
        double var2 = Math.cos((double) ((float) this.field1281 / 4096.0F));
        this.field1299[0] = (int) (var2 * Math.sin((double) ((float) this.field1289 / 4096.0F)) * 4096.0D);
        this.field1299[1] = (int) (var2 * Math.cos((double) ((float) this.field1289 / 4096.0F)) * 4096.0D);
        this.field1299[2] = (int) (Math.sin((double) ((float) this.field1281 / 4096.0F)) * 4096.0D);
        int var4 = this.field1299[0] * this.field1299[0] >> 12;
        int var5 = this.field1299[2] * this.field1299[2] >> 12;
        int var6 = this.field1299[1] * this.field1299[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1299[1] = (this.field1299[1] << 12) / var7;
            this.field1299[2] = (this.field1299[2] << 12) / var7;
            this.field1299[0] = (this.field1299[0] << 12) / var7;
        }
        if (arg0 != -11135) {
            method553((class81) null, 66);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method552(byte arg0, Throwable arg1) throws IOException {
        String var2;
        if (!(arg1 instanceof class35)) {
            var2 = "";
        } else {
            class35 var3 = (class35) arg1;
            arg1 = var3.field495;
            var2 = var3.field496 + " | ";
        }
        StringWriter var4 = new StringWriter();
        ++field1292;
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg0 != 110) {
            method550((byte) -91);
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 - -1);
                if (var10 >= 0 && ~var11 <= -1) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(1 + var16.lastIndexOf(9));
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lui;I)V")
    public static final void method553(class81 arg0, int arg1) {
        ++field1290;
        long var2 = 0L;
        if (~arg0.field1264 == -1) {
            var2 = class23.method141(arg0.field1260, arg0.field1261, arg0.field1272);
        }
        int var4 = 0;
        int var5 = -1;
        int var6 = 0;
        if (~arg0.field1264 == -2) {
            var2 = class64.method451(arg0.field1260, arg0.field1261, arg0.field1272);
        }
        if (~arg0.field1264 == -3) {
            var2 = class175.method1170(arg0.field1260, arg0.field1261, arg0.field1272);
        }
        if (arg1 < -71) {
            if (~arg0.field1264 == -4) {
                var2 = class89.method589(arg0.field1260, arg0.field1261, arg0.field1272);
            }
            if (var2 != 0L) {
                var5 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
                var4 = ((int) var2 & 508218) >> 14;
                var6 = (int) var2 >> 20 & 3;
            }
            arg0.field1275 = var6;
            arg0.field1273 = var4;
            arg0.field1271 = var5;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class82() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field1280;
        if (arg1 != 1075962732) {
            this.method144(13);
        }
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int var4 = class144.field2463 * this.field1294 >> 12;
            int[] var5 = this.method1052(0, class239.field4260 & arg0 + -1, (byte) -82);
            int[] var6 = this.method1052(0, arg0, (byte) -107);
            int[] var7 = this.method1052(0, arg0 + 1 & class239.field4260, (byte) -54);
            for (int var8 = 0; var8 < class227.field3898; ++var8) {
                int var9 = (var6[var8 - 1 & class109.field1786] - var6[class109.field1786 & var8 + 1]) * var4 >> 12;
                int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class185.field3112[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field1299[1] * var14 >> 12;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field1299[0] * var17 >> 12;
                int var19 = this.field1299[2] * var15 >> 12;
                var3[var8] = var16 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V")
    public static void method554(byte arg0) {
        if (arg0 > 119) {
            field1287 = null;
            field1296 = null;
            field1282 = null;
            field1285 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field1293;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1281 = arg0.method1244(false);
                }
            } else {
                this.field1289 = arg0.method1244(false);
            }
        } else {
            this.field1294 = arg0.method1244(false);
        }
        if (arg1 != -14015) {
            this.method551(123);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)I")
    public static final int method555(int arg0, boolean arg1) {
        ++field1295;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + -61440;
        if (!arg1) {
            return -128;
        } else {
            int var4 = 40960 - -(arg0 * var3 >> 12);
            return var2 * var4 >> 12;
        }
    }
}
