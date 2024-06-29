import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class58 {

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "[[I")
    private int[][] field953;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field955 = 0;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
    public static int[] field951 = new int[128];

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static volatile int field957 = 0;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lhh;")
    public static class163 field958 = class137.method1065("loc", 17);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[S")
    public static short[] field963;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "[[[B")
    public static byte[][][] field959;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZJ)V")
    public static final void method402(boolean arg0, long arg1) {
        field946++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class155.field2889 < 100 || class90.field1654 == 1) || class155.field2889 >= 200) {
            class56.method396(class82.field1585, 98, class170.field3120, 0);
            return;
        }
        class163 var3 = class12.method76(arg1, (byte) 59).method1190((byte) 73);
        for (int var4 = 0; var4 < class155.field2889; var4++) {
            if (class48.field798[var4] == arg1) {
                class56.method396(class145.method1101(0, new class163[] { var3, class136.field2626 }), 105, class170.field3120, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class29.field465; var5++) {
            if (class116.field2207[var5] == arg1) {
                class56.method396(class145.method1101(0, new class163[] { class177.field3227, var3, class146.field2781 }), 92, class170.field3120, 0);
                return;
            }
        }
        if (var3.method1208(class235.field4203.field2424, (byte) -125)) {
            class56.method396(class73.field1383, 98, class170.field3120, 0);
            return;
        }
        class129.field2508++;
        class46.field769[class155.field2889] = var3;
        class48.field798[class155.field2889] = arg1;
        if (!arg0) {
            field947 = -37;
        }
        class196.field3543[class155.field2889] = 0;
        class127.field2479[class155.field2889] = class170.field3120;
        class146.field2780[class155.field2889] = 0;
        class102.field1964[class155.field2889] = false;
        class208.field3780 = class24.field384;
        class155.field2889++;
        class191.field3499.method75(188, 82);
        class191.field3499.method651(-645765520, arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I")
    public final int method403(byte arg0, int arg1) {
        if (arg0 <= 123) {
            this.method404((byte[]) null, -49);
        }
        field961++;
        if (this.field953 != null) {
            arg1 = (int) ((long) this.field960 * (long) arg1 / (long) this.field956);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)[B")
    public final byte[] method404(byte[] arg0, int arg1) {
        if (this.field953 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field960 / (long) this.field956) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field953[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field960 + var6;
                int var14 = var13 / this.field956;
                var4 += var14;
                var6 = var13 - this.field956 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        field964++;
        return arg1 == 14 ? arg0 : null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)I")
    public final int method405(int arg0, byte arg1) {
        int var3 = -119 % ((43 - arg1) / 41);
        if (this.field953 != null) {
            arg0 = (int) ((long) this.field960 * (long) arg0 / (long) this.field956) + 6;
        }
        field950++;
        return arg0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method406(String arg0, int arg1) throws ClassNotFoundException {
        field949++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg1 <= 114) {
                method402(true, 21L);
            }
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method407(byte arg0) {
        field963 = null;
        field951 = null;
        if (arg0 > 15) {
            field959 = null;
            field958 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(II)V")
    public class58(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class228.method1588(-12021, arg1, arg0);
            int var4 = arg1 / var3;
            this.field960 = var4;
            int var5 = arg0 / var3;
            this.field953 = new int[var5][14];
            this.field956 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field953[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
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
