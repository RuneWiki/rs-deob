import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class210 extends class51 {

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    private int field3307;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    private int field3306;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field3309 = 100;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lqf;")
    public static class311 field3304 = new class311(8);

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "[B")
    public static byte[] field3317;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 15)
    public final void method230(int arg0, int arg1, int arg2) {
        int var4 = -123 / ((58 - arg0) / 60);
        field3315++;
        int var5 = this.field3312 * arg2 >> 12;
        int var6 = this.field3307 * arg2 >> 12;
        int var7 = this.field3306 * arg1 >> 12;
        int var8 = this.field3316 * arg1 >> 12;
        class337.method2340(-256, this.field647, var8, var5, var7, var6);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)V", line = 32)
    public final void method234(byte arg0, int arg1, int arg2) {
        field3305++;
        int var4 = this.field3312 * arg2 >> 12;
        int var5 = this.field3316 * arg1 >> 12;
        int var6 = this.field3307 * arg2 >> 12;
        int var7 = -22 % ((arg0 - 2) / 48);
        int var8 = this.field3306 * arg1 >> 12;
        class18.method197(var5, var4, var8, (byte) 66, var6, this.field651, this.field652);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 51)
    public static final void method1533(boolean arg0) {
        class194.field3104 = null;
        class303.field4702 = null;
        class117.field1637 = null;
        class232.field3626 = null;
        if (arg0) {
            field3317 = (byte[]) null;
        }
        class279.field4302 = null;
        field3310++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 70)
    public static final boolean method1534(String arg0, String arg1, byte arg2) {
        int var3 = arg1.length();
        int var4 = arg0.length();
        field3313++;
        if (arg2 <= 84) {
            return true;
        } else if (var3 < var4) {
            return false;
        } else {
            for (int var5 = 0; var5 < var4; var5++) {
                char var6 = arg1.charAt(var5);
                char var7 = arg0.charAt(var5);
                if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(IIIIIII)V", line = 109)
    public class210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3312 = arg0;
        this.field3316 = arg1;
        this.field3307 = arg2;
        this.field3306 = arg3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIILjf;)Ljf;", line = 121)
    public static final class89 method1535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class89 arg6) {
        field3314++;
        long var7 = (long) arg3;
        class89 var9 = (class89) class120.field1670.method1351(var7, 63);
        if (var9 == null) {
            class165 var10 = class165.method1235(class171.field2826, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1226(64, 768, -50, -10, -50);
            class120.field1670.method1347(var9, var7, (byte) -89);
        }
        int var11 = arg6.method408();
        int var12 = arg6.method383();
        int var13 = arg6.method388();
        int var14 = arg6.method394();
        class89 var15 = var9.method381(true, true, true);
        if (arg1 != arg4) {
            var15.method401(arg4);
        }
        if (class109.field1458) {
            class217 var16 = (class217) var15;
            if (class320.method2245((byte) -45, arg5 + var13, class154.field2392, arg0 + var11) != arg2 || arg2 != class320.method2245((byte) -33, arg5 + var14, class154.field2392, arg0 + var12)) {
                for (int var17 = 0; var17 < var16.field3412; var17++) {
                    var16.field3436[var17] += class320.method2245((byte) -124, var16.field3424[var17] + arg5, class154.field2392, var16.field3408[var17] + arg0) - arg2;
                }
                var16.field3435.field1559 = false;
                var16.field3438.field2545 = false;
            }
        } else {
            class53 var18 = (class53) var15;
            if (arg2 != class320.method2245((byte) -58, arg5 + var13, class154.field2392, arg0 + var11) || class320.method2245((byte) -82, arg5 + var14, class154.field2392, arg0 + var12) != arg2) {
                for (int var19 = 0; var19 < var18.field680; var19++) {
                    var18.field698[var19] += class320.method2245((byte) -59, var18.field669[var19] + arg5, class154.field2392, var18.field676[var19] + arg0) - arg2;
                }
                var18.field679 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)V", line = 198)
    public final void method229(int arg0, int arg1, int arg2) {
        field3303++;
        int var4 = this.field3312 * arg2 >> 12;
        int var5 = this.field3307 * arg2 >> 12;
        int var6 = this.field3316 * arg0 >> 12;
        int var7 = this.field3306 * arg0 >> 12;
        if (arg1 == 0) {
            class116.method820(var4, this.field652, this.field647, this.field651, var6, (byte) 23, var7, var5);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 224)
    public static void method1536(int arg0) {
        field3304 = null;
        if (arg0 != 0) {
            method1534((String) null, (String) null, (byte) -116);
        }
        field3317 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 243)
    public static final void method1537(byte arg0) {
        class238.field3729 = false;
        class61.field899 = 0;
        class183.field2965.field111 = 0;
        class5.field59 = 0;
        class274.field4236 = 0;
        class78.field1046 = 0;
        class327.field5127 = -1;
        class30.field449 = -1;
        class121.field1751 = 0;
        class107.field1426 = 0;
        class111.field1544.field111 = 0;
        field3311++;
        class68.field958 = -1;
        class326.field5120 = -1;
        for (int var1 = 0; var1 < class284.field4403.length; var1++) {
            if (class284.field4403[var1] != null) {
                class284.field4403[var1].field4726 = -1;
            }
        }
        for (int var2 = 0; var2 < class59.field870.length; var2++) {
            if (class59.field870[var2] != null) {
                class59.field870[var2].field4726 = -1;
            }
        }
        class319.method2239(-8641);
        class166.field2715 = 1;
        class68.method538(arg0 - 81, 30);
        if (arg0 != -46) {
            method1535(-108, 89, -5, -79, -10, -28, (class89) null);
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class231.field3607[var3] = true;
        }
        class131.method967(17256);
    }
}
