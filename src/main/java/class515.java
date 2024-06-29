import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class515 {

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
    private int[] field6750 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Z")
    public static boolean field6756 = false;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Laf;")
    public class33 field6757;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
    private int[] field6749;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
    public static int[] field6753;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[S")
    private short[] field6740;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[S")
    private short[] field6741;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[S")
    private short[] field6742;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[S")
    private short[] field6751;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[[[Lgn;")
    public static class530[][][] field6748;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)Lfca;", line = 8)
    public final class645 method2772(byte arg0) {
        field6746++;
        if (this.field6749 == null) {
            return null;
        }
        class645[] var2 = new class645[this.field6749.length];
        class615 var3 = this.field6757.field490;
        synchronized (this.field6757.field490) {
            if (arg0 != -110) {
                return null;
            }
            int var5 = 0;
            while (true) {
                if (this.field6749.length <= var5) {
                    break;
                }
                var2[var5] = class463.method2591(true, this.field6749[var5], 0, this.field6757.field490);
                var5++;
            }
        }
        for (int var6 = 0; var6 < this.field6749.length; var6++) {
            if (var2[var6].field8947 < 13) {
                var2[var6].method3539(2, true);
            }
        }
        class645 var7;
        if (var2.length == 1) {
            var7 = var2[0];
        } else {
            var7 = new class645(var2, var2.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field6741 != null) {
            for (int var8 = 0; var8 < this.field6741.length; var8++) {
                var7.method3546(this.field6741[var8], -20572, this.field6740[var8]);
            }
        }
        if (this.field6751 != null) {
            for (int var9 = 0; var9 < this.field6751.length; var9++) {
                var7.method3553(-1, this.field6742[var9], this.field6751[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z", line = 87)
    public final boolean method2773(boolean arg0) {
        if (arg0) {
            this.field6750 = null;
        }
        field6754++;
        if (this.field6749 == null) {
            return true;
        }
        boolean var2 = true;
        class615 var3 = this.field6757.field490;
        synchronized (this.field6757.field490) {
            for (int var4 = 0; var4 < this.field6749.length; var4++) {
                if (!this.field6757.field490.method3343(this.field6749[var4], 0, (byte) 110)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;)V", line = 115)
    public static final void method2774(int arg0, String arg1) {
        field6745++;
        if (!class499.field6560) {
            return;
        }
        if (arg0 < 114) {
            method2780(-22, null, 50, null);
        }
        boolean var2 = false;
        int var3 = class260.field3508;
        int[] var4 = class135.field1779;
        for (int var5 = 0; var5 < var3; var5++) {
            class193 var6 = class592.field8019[var4[var5]];
            if (var6 != null && class233.field3130 != var6 && var6.field2492 != null && var6.field2492.equalsIgnoreCase(arg1)) {
                class9.field97++;
                class11 var7 = class130.method931(class649.field9035, (byte) 54, class380.field4884);
                var7.field114.method2386(class34.field499, 1103587288);
                var7.field114.method2395(var4[var5], (byte) -29);
                var7.field114.method2404(128, 0);
                var7.field114.method2353(class634.field8832, (byte) -76);
                var7.field114.method2395(class467.field6103, (byte) -97);
                class100.method760(var7, 91);
                var2 = true;
                class367.method2112(0, -2, true, var6.field3039[0], var6.field3030[0], var6.method1265(120), var6.method1265(122), 0, true);
                break;
            }
        }
        if (!var2) {
            class433.method2476(class604.field8145.method3280((byte) -86, class144.field1890) + arg1, false, 4);
        }
        if (class499.field6560) {
            class695.method3778((byte) 22);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Z", line = 169)
    public final boolean method2775(int arg0) {
        if (arg0 < 50) {
            method2776(-44);
        }
        field6755++;
        boolean var2 = true;
        class615 var3 = this.field6757.field490;
        synchronized (this.field6757.field490) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6750[var4] != -1 && !this.field6757.field490.method3343(this.field6750[var4], 0, (byte) 98)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I", line = 196)
    public static final int method2776(int arg0) {
        field6747++;
        if (arg0 != 0) {
            field6748 = null;
        }
        if (class655.field9114 == null) {
            if (!class594.field8025 && class291.field3758 > 0) {
                if (class465.field6070 && class390.field4990.method3168(256, 81) && class291.field3758 > 2) {
                    return ((class57) class658.field9176.field4702.field5497.field5497).field771;
                }
                return ((class57) class658.field9176.field4702.field5497).field771;
            }
            int var1 = class691.field9440.method2214(-2703);
            int var2 = class691.field9440.method2208(30114);
            int var3 = class399.field5100;
            int var4 = class630.field8791;
            int var5 = class238.field3206;
            if (var3 < var1 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class291.field3758; var7++) {
                    if (class288.field3723) {
                        int var12 = var4 - (-(class291.field3758 - var7 - 1) * 16 - 33);
                        if ((var12 - 13) < var2 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class291.field3758 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var11 - 13 && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class141 var9 = new class141(class658.field9176);
                    for (class57 var10 = (class57) var9.method1069(17909); var10 != null; var10 = (class57) var9.method1066(true)) {
                        if (var6 == var8++) {
                            return var10.field771;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)Lfca;", line = 303)
    public final class645 method2777(int arg0) {
        if (arg0 != 2) {
            this.method2773(false);
        }
        field6752++;
        class645[] var2 = new class645[5];
        int var3 = 0;
        class615 var4 = this.field6757.field490;
        synchronized (this.field6757.field490) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field6750[var5] != -1) {
                    var2[var3++] = class463.method2591(true, this.field6750[var5], 0, this.field6757.field490);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field8947 < 13) {
                var2[var6].method3539(2, true);
            }
        }
        class645 var7 = new class645(var2, var3);
        if (this.field6741 != null) {
            for (int var8 = 0; var8 < this.field6741.length; var8++) {
                var7.method3546(this.field6741[var8], -20572, this.field6740[var8]);
            }
        }
        if (this.field6751 != null) {
            for (int var9 = 0; var9 < this.field6751.length; var9++) {
                var7.method3553(-1, this.field6742[var9], this.field6751[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfd;B)V", line = 373)
    public final void method2778(class418 arg0, byte arg1) {
        field6739++;
        while (true) {
            int var3 = arg0.method2396(65);
            if (var3 == 0) {
                if (arg1 == 71) {
                    return;
                } else {
                    method2779(-128);
                    return;
                }
            }
            this.method2781(arg0, -4282, var3);
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 401)
    public static void method2779(int arg0) {
        if (arg0 != 0) {
            field6753 = null;
        }
        field6753 = null;
        field6748 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[BILjava/lang/String;)I", line = 412)
    public static final int method2780(int arg0, byte[] arg1, int arg2, String arg3) {
        field6744++;
        int var4 = arg2;
        int var5 = arg3.length();
        if (arg0 != 192) {
            method2774(-11, null);
        }
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class564.method3013(false, arg3.charAt(var6));
            int var8 = var6 + 1 < var5 ? class564.method3013(false, arg3.charAt(var6 + 1)) : -1;
            int var9 = (var6 + 2) >= var5 ? -1 : class564.method3013(false, arg3.charAt(var6 + 2));
            int var10 = var5 > var6 + 3 ? class564.method3013(false, arg3.charAt(var6 + 3)) : -1;
            arg1[arg2++] = (byte) class131.method954(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class131.method954(class597.method3238(240, var8 << 4), var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class131.method954(class597.method3238(192, var9 << 6), var10);
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfd;II)V", line = 455)
    private final void method2781(class418 arg0, int arg1, int arg2) {
        field6743++;
        if (arg1 != -4282) {
            this.method2777(-99);
        }
        if (arg2 == 1) {
            arg0.method2396(115);
        } else if (arg2 == 2) {
            int var8 = arg0.method2396(40);
            this.field6749 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6749[var9] = arg0.method2393(-30727);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg0.method2396(-104);
                this.field6740 = new short[var4];
                this.field6741 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6741[var5] = (short) arg0.method2393(-30727);
                    this.field6740[var5] = (short) arg0.method2393(class392.method2234(arg1, 26815));
                }
                return;
            }
            if (arg2 == 41) {
                int var6 = arg0.method2396(90);
                this.field6751 = new short[var6];
                this.field6742 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6751[var7] = (short) arg0.method2393(-30727);
                    this.field6742[var7] = (short) arg0.method2393(-30727);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field6750[arg2 - 60] = arg0.method2393(-30727);
                return;
            }
            return;
        }
    }
}
