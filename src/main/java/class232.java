import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class232 extends class274 {

    @OriginalMember(owner = "client!gca", name = "Y", descriptor = "[I")
    public int[] field3245 = new int[32];

    @OriginalMember(owner = "client!gca", name = "cb", descriptor = "[I")
    public int[] field3249 = new int[12];

    @OriginalMember(owner = "client!gca", name = "R", descriptor = "[I")
    public int[] field3240 = new int[class321.field4451 + 8191];

    @OriginalMember(owner = "client!gca", name = "bb", descriptor = "[I")
    public int[] field3248 = new int[class321.field4451 + 8191];

    @OriginalMember(owner = "client!gca", name = "eb", descriptor = "[I")
    public int[] field3251 = new int[2200];

    @OriginalMember(owner = "client!gca", name = "hb", descriptor = "[I")
    public int[] field3254 = new int[12];

    @OriginalMember(owner = "client!gca", name = "fb", descriptor = "[I")
    public int[] field3252 = new int[class321.field4428];

    @OriginalMember(owner = "client!gca", name = "gb", descriptor = "[[I")
    public int[][] field3253 = new int[32][512];

    @OriginalMember(owner = "client!gca", name = "jb", descriptor = "[[I")
    public int[][] field3256 = new int[2200][64];

    @OriginalMember(owner = "client!gca", name = "mb", descriptor = "[[I")
    public int[][] field3259 = new int[12][class321.field4451 + 8191];

    @OriginalMember(owner = "client!gca", name = "kb", descriptor = "Lml;")
    public class359 field3257;

    @OriginalMember(owner = "client!gca", name = "X", descriptor = "[[I")
    public static int[][] field3244 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!gca", name = "db", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3250 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!gca", name = "U", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!gca", name = "W", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!gca", name = "Z", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!gca", name = "ab", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!gca", name = "ib", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!gca", name = "lb", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!gca", name = "V", descriptor = "Lbi;")
    public static class449 field3242;

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lqe;)V", line = 3)
    public class232(class437 arg0) {
        super(arg0);
        this.field3257 = new class359(arg0);
        super.field3839 = new class248(super.field3800);
        super.field3829 = new class248(super.field3800);
        super.field3827 = new class248(super.field3800);
        super.field3835 = new class248(super.field3800);
        super.field3836 = new class248(super.field3800);
        super.field3826 = new class248(super.field3800);
        super.field3837 = new class248(super.field3800);
        super.field3833 = new class248(super.field3800);
        super.field3817 = new class248(super.field3800);
        super.field3824 = new class248(super.field3800);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)V", line = 24)
    public static void method1446(boolean arg0) {
        field3250 = null;
        field3242 = null;
        field3244 = null;
        if (arg0) {
            method1446(true);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lw;III[Z)V", line = 37)
    public static final void method1447(class276 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class467.field6283 != class218.field3099) {
            int var5 = class684.field9625[arg1].method200(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class139 var7 = class684.field9625[var6];
                    if (var7 != null) {
                        var7.method208(arg0, arg2, var5 - var7.method200(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 63)
    public static final String[] method1448(String[] arg0, int arg1) {
        ++field3247;
        String[] var2 = new String[5];
        int var3 = 0;
        int var4 = -47 / ((arg1 - -69) / 48);
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
            ++var3;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIB[B)[B", line = 91)
    public static final byte[] method1449(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field3246;
        byte[] var4 = new byte[arg0];
        if (arg2 <= 10) {
            method1448((String[]) null, 118);
        }
        class83.method686(arg3, arg1, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/awt/Frame;Lii;I)V", line = 106)
    public static final void method1450(Frame arg0, class519 arg1, int arg2) {
        ++field3243;
        if (arg2 != 3) {
            method1450((Frame) null, (class519) null, -78);
        }
        while (true) {
            class192 var3 = arg1.method2906(arg0, 0);
            while (~var3.field2816 == -1) {
                class486.method2722(0, 10L);
            }
            if (var3.field2816 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class486.method2722(0, 100L);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILoa;)V", line = 132)
    public static final void method1451(int arg0, class651 arg1) {
        ++field3241;
        if ((class398.field5290 >= 2 || class400.field5305) && class109.field1591 == null) {
            String var2;
            if (class400.field5305 && class398.field5290 < 2) {
                var2 = class680.field9585 + class72.field1096.method546(class516.field6892, (byte) -35) + class214.field3060 + " ->";
            } else if (class363.field4912 && class561.field7444.method3271(81, 0) && class398.field5290 > 2) {
                var2 = class690.method3834((class117) class480.field6411.field7850.field6723.field6723, (byte) -106);
            } else {
                class117 var3 = (class117) class480.field6411.field7850.field6723;
                var2 = class690.method3834(var3, (byte) -106);
                int[] var4 = null;
                if (!class702.method3886(var3.field1993, (byte) 34)) {
                    if (var3.field1992 == -1) {
                        if (class264.method1611(var3.field1993, false)) {
                            class280 var5 = (class280) class616.field8143.method2918((long) ((int) var3.field1996), (byte) -126);
                            if (var5 != null) {
                                class287 var6 = var5.field3983;
                                class419 var7 = var6.field4052;
                                if (var7.field5753 != null) {
                                    var7 = var7.method2401(false, class80.field1261);
                                }
                                if (var7 != null) {
                                    var4 = var7.field5791;
                                }
                            }
                        } else if (class407.method2336(var3.field1993, (byte) 124)) {
                            Object var8 = null;
                            class58 var9;
                            if (var3.field1993 == 1010) {
                                var9 = class470.field6288.method1258((int) var3.field1996, (byte) -107);
                            } else {
                                var9 = class470.field6288.method1258((int) (var3.field1996 >>> 32 & 2147483647L), (byte) -68);
                            }
                            if (var9.field888 != null) {
                                var9 = var9.method486((byte) -113, class80.field1261);
                            }
                            if (var9 != null) {
                                var4 = var9.field811;
                            }
                        }
                    } else {
                        var4 = class193.field2826.method1047(var3.field1992, -1).field7654;
                    }
                } else {
                    var4 = class193.field2826.method1047((int) var3.field1996, -1).field7654;
                }
                if (var4 != null) {
                    var2 = var2 + class179.method1201(-21130, var4);
                }
            }
            if (class398.field5290 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class398.field5290 + -2) + class72.field1089.method546(class516.field6892, (byte) -35);
            }
            if (class526.field7011 == null) {
                if (class645.field8657 != null && class443.field6069 == class392.field5166) {
                    int var10 = class450.field6177.method1296(0, class164.field2572 - -4, class690.field9713, class250.field3456, -1, 16777215, var2, class484.field6548 + 16, class456.field6201, class651.field8812);
                    class221.method1395(class164.field2572 + 4, var10 + class193.field2823.method2847(var2, (byte) -118), 16, class484.field6548, false);
                }
            } else {
                class200 var11 = class526.field7011.method3415(arg1, false);
                if (var11 == null) {
                    var11 = class450.field6177;
                }
                var11.method1294(class651.field8812, class456.field6201, var2, class174.field2678, (byte) 127, class526.field7011.field8440, class526.field7011.field8381, class393.field5172, class690.field9713, class526.field7011.field8438, class526.field7011.field8350, class393.field5173, class526.field7011.field8361, class526.field7011.field8392, class250.field3456);
                class221.method1395(class174.field2678[0], class174.field2678[2], class174.field2678[3], class174.field2678[1], false);
            }
            if (arg0 < 39) {
                field3250 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 252)
    public final void method1334(byte arg0) {
        if (arg0 < -39) {
            ++field3258;
            this.field3257 = new class359(super.field3800);
        }
    }
}
