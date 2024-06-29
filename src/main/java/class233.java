import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class233 extends class447 {

    @OriginalMember(owner = "client!at", name = "w", descriptor = "B")
    public byte field3086 = 5;

    @OriginalMember(owner = "client!at", name = "A", descriptor = "Ljm;")
    public static class448 field3090 = new class448(16);

    @OriginalMember(owner = "client!at", name = "J", descriptor = "[I")
    public static int[] field3099 = new int[1000];

    @OriginalMember(owner = "client!at", name = "L", descriptor = "[I")
    public static int[] field3101 = new int[99];

    @OriginalMember(owner = "client!at", name = "O", descriptor = "Z")
    public static boolean field3104;

    @OriginalMember(owner = "client!at", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field3106;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!at", name = "D", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!at", name = "E", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!at", name = "F", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!at", name = "K", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!at", name = "P", descriptor = "Lml;")
    public static class241 field3105;

    @OriginalMember(owner = "client!at", name = "N", descriptor = "Lnh;")
    public static class487 field3103;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "Z")
    public boolean field3085;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BII)V")
    public static final void method1298(byte arg0, int arg1, int arg2) {
        field3092++;
        class106 var3 = class250.method1400(7, -24, arg1);
        if (arg0 >= -47) {
            method1304((byte) -122);
        }
        var3.method658(0);
        var3.field1589 = arg2;
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V")
    public static void method1299(int arg0) {
        field3105 = null;
        if (arg0 != 200) {
            return;
        }
        field3099 = null;
        field3101 = null;
        field3090 = null;
        field3103 = null;
        field3106 = null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZZ)V")
    public static final void method1300(boolean arg0, boolean arg1) {
        field3089++;
        while (class314.field4171.method1669((byte) -28, class136.field1983) >= 15) {
            int var2 = class314.field4171.method1664((byte) -13, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class221.field2941[var2] == null) {
                class221.field2941[var2] = new class121();
                class221.field2941[var2].field1163 = var2;
                var3 = true;
            }
            class121 var4 = class221.field2941[var2];
            class412.field5638[class202.field2734++] = var2;
            var4.field1153 = class70.field968;
            if (var4.field1780 != null && var4.field1780.method2537(-92)) {
                class318.method1743(var4, (byte) -123);
            }
            int var5;
            if (arg1) {
                var5 = class314.field4171.method1664((byte) -13, 8);
                if (var5 > 127) {
                    var5 -= 256;
                }
            } else {
                var5 = class314.field4171.method1664((byte) -13, 5);
                if (var5 > 15) {
                    var5 -= 32;
                }
            }
            int var6;
            if (arg1) {
                var6 = class314.field4171.method1664((byte) -13, 8);
                if (var6 > 127) {
                    var6 -= 256;
                }
            } else {
                var6 = class314.field4171.method1664((byte) -13, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
            }
            int var7 = class314.field4171.method1664((byte) -13, 1);
            if (var7 == 1) {
                class270.field3608[class343.field4589++] = var2;
            }
            var4.method757(class150.field2121.method782(class314.field4171.method1664((byte) -13, 14), 1), 21748);
            int var8 = class314.field4171.method1664((byte) -13, 3) + 4 << 11 & 0x3929;
            int var9 = class314.field4171.method1664((byte) -13, 2);
            int var10 = class314.field4171.method1664((byte) -13, 1);
            var4.method539(!arg0, var4.field1780.field5857);
            var4.field1147 = var4.field1780.field5861 << 3;
            if (var4.field1147 == 0) {
                var4.method547(0, 121);
            } else if (var3) {
                var4.method547(var8, 124);
            }
            var4.method754(-20002, var4.method545(false), var9, field3103.field1193[0] + var6, var10 == 1, field3103.field1197[0] + var5);
            if (var4.field1780.method2537(-128)) {
                class412.method2473((class88) null, var4.field1197[0], 0, (class487) null, var4, (byte) 110, var4.field1193[0], var4.field6502);
            }
        }
        if (!arg0) {
            field3105 = null;
        }
        class314.field4171.method1661((byte) -39);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([Ljava/lang/Object;B[III)V")
    public static final void method1301(Object[] arg0, byte arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if ((var9 & 0x1) + var7 > arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method1301(arg0, (byte) -97, arg2, arg3, var6 - 1);
            method1301(arg0, (byte) -97, arg2, var6 + 1, arg4);
        }
        field3095++;
        if (arg1 != -97) {
            field3105 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1302(String arg0, int arg1) throws ClassNotFoundException {
        field3100++;
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
        } else {
            if (arg1 != -28916) {
                method1305((Frame) null, -105, (class241) null);
            }
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
    public static final void method1303(int arg0, int arg1) {
        field3102++;
        class106 var2 = class250.method1400(arg0, -13, arg1);
        var2.method659(arg0 ^ 0x65);
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)Lwj;")
    public static final class247 method1304(byte arg0) {
        field3087++;
        if (arg0 > -123) {
            return null;
        }
        try {
            return (class247) Class.forName("va").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/awt/Frame;ILml;)V")
    public static final void method1305(Frame arg0, int arg1, class241 arg2) {
        field3097++;
        if (arg1 < 9) {
            method1301((Object[]) null, (byte) 67, (int[]) null, -14, 47);
        }
        while (true) {
            class474 var3 = arg2.method1345(arg0, 12);
            while (var3.field6534 == 0) {
                class374.method2298(-28114, 10L);
            }
            if (var3.field6534 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class374.method2298(-28114, 100L);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3101[var1] = var0 / 4;
        }
        field3104 = true;
        field3106 = new String[200];
    }
}
