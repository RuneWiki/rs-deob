import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public abstract class class187 extends class13 {

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "Z")
    public volatile boolean field2808 = true;

    @OriginalMember(owner = "client!ffa", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2809 = null;

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "Lhj;")
    public static class569 field2805 = new class569();

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "Z")
    public boolean field2807;

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "Z")
    public boolean field2811;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
    public static void method1357(int arg0) {
        field2805 = null;
        field2809 = null;
        if (arg0 != 353) {
            field2805 = null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1358(int arg0, int arg1, int arg2, Class arg3) {
        class384 var4 = class649.field8928[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class474 var5 = var4.field5567; var5 != null; var5 = var5.field6621) {
            class494 var6 = var5.field6623;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6831 == arg1 && var6.field6838 == arg2) {
                class410.method2540(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIILqfa;Lqfa;)V")
    public static final void method1359(int arg0, int arg1, int arg2, class100 arg3, class100 arg4) {
        class384 var5 = class410.method2541(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5577 = arg3;
        var5.field5574 = arg4;
        int var6 = class683.field9250 == class344.field4822 ? 1 : 0;
        if (!arg3.method45(-109)) {
            arg3.field5924 = class375.field5310[var6];
            class375.field5310[var6] = arg3;
        } else if (arg3.method49((byte) 122)) {
            arg3.field5924 = class391.field5762[var6];
            class391.field5762[var6] = arg3;
        } else {
            arg3.field5924 = class362.field5206[var6];
            class362.field5206[var6] = arg3;
            class30.field778 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method45(-118)) {
            if (arg4.method49((byte) 122)) {
                arg4.field5924 = class391.field5762[var6];
                class391.field5762[var6] = arg4;
                return;
            }
            arg4.field5924 = class362.field5206[var6];
            class362.field5206[var6] = arg4;
            class30.field778 = true;
            return;
        }
        arg4.field5924 = class375.field5310[var6];
        class375.field5310[var6] = arg4;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[BIZLjava/lang/String;I)I")
    public static final int method1360(int arg0, byte[] arg1, int arg2, boolean arg3, String arg4, int arg5) {
        field2810++;
        if (arg3) {
            return -119;
        }
        int var6 = arg2 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg5 + var7] = -97;
            } else {
                arg1[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)I")
    public static final int method1361(int arg0) {
        field2806++;
        if (class669.field9118 == null) {
            return 0;
        } else {
            if (arg0 != 2) {
                field2805 = null;
            }
            return class669.field9118.length * 2;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "(I)I")
    public abstract int method678(int arg0);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II[F)[F")
    public static final float[] method1362(int arg0, int arg1, float[] arg2) {
        field2812++;
        float[] var3 = new float[arg1];
        class363.method2316(arg2, 0, var3, arg0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)[B")
    public abstract byte[] method680(int arg0);
}
