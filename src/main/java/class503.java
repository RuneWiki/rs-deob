import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class503 {

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Laq;")
    private class494 field6898 = new class494(64);

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Laq;")
    public class494 field6909 = new class494(50);

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lvo;")
    public class382 field6910 = new class382(250);

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lhv;")
    private class228 field6911 = new class228();

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Z")
    private boolean field6902;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lgga;")
    public class513 field6890;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lgga;")
    private class513 field6896;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Lva;")
    private class585 field6915;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public int field6907;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public int field6908;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field6914;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field6912;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Z")
    public static boolean field6899 = false;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 5)
    public final void method2932(boolean arg0) {
        field6895++;
        class494 var2 = this.field6909;
        synchronized (this.field6909) {
            this.field6909.method2881((byte) -37);
        }
        if (!arg0) {
            method2944(-52L, 66, (byte) -71, 43);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 22)
    public final void method2933(int arg0) {
        class494 var2 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method2881((byte) -123);
        }
        field6905++;
        class494 var3 = this.field6909;
        synchronized (this.field6909) {
            this.field6909.method2881((byte) -124);
        }
        int var4 = -115 / ((5 - arg0) / 57);
        class382 var5 = this.field6910;
        synchronized (this.field6910) {
            this.field6910.method2309((byte) 127);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 41)
    public final void method2934(boolean arg0) {
        field6892++;
        class382 var2 = this.field6910;
        synchronized (this.field6910) {
            this.field6910.method2309((byte) 67);
        }
        if (!arg0) {
            this.field6890 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 57)
    public final void method2935(byte arg0) {
        if (arg0 > -17) {
            this.method2942(86, 125, null, 29, 92, 52, null, -14);
        }
        class494 var2 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method2893((byte) -69);
        }
        field6900++;
        class494 var3 = this.field6909;
        synchronized (this.field6909) {
            this.field6909.method2893((byte) 79);
        }
        class382 var4 = this.field6910;
        synchronized (this.field6910) {
            this.field6910.method2306(27);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V", line = 77)
    public final void method2936(boolean arg0, int arg1) {
        field6897++;
        if (arg1 != -19886) {
            this.field6914 = null;
        }
        if (this.field6902 != arg0) {
            this.field6902 = arg0;
            this.method2933(arg1 ^ 0xFFFFB201);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lts;", line = 94)
    public final class42 method2937(byte arg0, int arg1) {
        field6903++;
        class494 var3 = this.field6898;
        class42 var4;
        synchronized (this.field6898) {
            var4 = (class42) this.field6898.method2882((long) arg1, (byte) -105);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field6896;
        byte[] var6;
        synchronized (this.field6896) {
            var6 = this.field6896.method3019(class80.method714(arg1, (byte) 126), class640.method3635(26171, arg1), 120);
        }
        class42 var7 = new class42();
        var7.field513 = arg1;
        var7.field500 = this;
        if (arg0 > 0) {
            this.method2935((byte) 39);
        }
        var7.field568 = new String[] { null, null, class563.field7806.method3281(this.field6907, -1), null, null };
        var7.field486 = new String[] { null, null, null, null, class563.field7807.method3281(this.field6907, -1) };
        if (var6 != null) {
            var7.method311(true, new class431(var6));
        }
        var7.method316(7);
        if (var7.field528 != -1) {
            var7.method306(this.method2937((byte) -109, var7.field571), this.method2937((byte) -2, var7.field528), -11519);
        }
        if (var7.field504 != -1) {
            var7.method324(this.method2937((byte) -98, var7.field487), this.method2937((byte) -65, var7.field504), 86);
        }
        if (var7.field505 != -1) {
            var7.method314(this.method2937((byte) -68, var7.field505), this.method2937((byte) -17, var7.field547), (byte) -115);
        }
        if (!this.field6902 && var7.field497) {
            var7.field554 = class563.field7803.method3281(this.field6907, -1);
            var7.field548 = null;
            var7.field496 = 0;
            var7.field503 = false;
            var7.field568 = this.field6914;
            var7.field486 = this.field6912;
            if (var7.field531 != null) {
                boolean var8 = false;
                for (class766 var9 = var7.field531.method4254((byte) 8); var9 != null; var9 = var7.field531.method4251(-107)) {
                    class93 var10 = this.field6915.method3434((int) var9.field10592, 10549);
                    if (var10.field1327) {
                        var9.method4237(-1);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field531 = null;
                }
            }
        }
        class494 var11 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLjava/lang/String;)Lpu;", line = 177)
    public static final class599 method2938(int arg0, byte arg1, String arg2) {
        field6889++;
        class599 var3;
        try {
            var3 = (class599) Class.forName("gm").getDeclaredConstructor().newInstance();
        } catch (Throwable var5) {
            var3 = new class294();
        }
        var3.field8544 = arg0;
        int var4 = -70 / ((arg1 - 5) / 37);
        var3.field8543 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V", line = 200)
    public final void method2939(int arg0, int arg1) {
        field6904++;
        this.field6913 = arg1;
        class494 var3 = this.field6909;
        synchronized (this.field6909) {
            if (arg0 != 36) {
                this.field6902 = false;
            }
            this.field6909.method2881((byte) -112);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZILda;IILae;IIBLha;Lha;Z)Lmq;", line = 217)
    public final class85 method2940(boolean arg0, int arg1, class443 arg2, int arg3, int arg4, class285 arg5, int arg6, int arg7, byte arg8, class475 arg9, class475 arg10, boolean arg11) {
        field6906++;
        class85 var13 = this.method2942(arg1, arg6, arg9, -126, arg3, arg4, arg5, arg7);
        if (var13 != null) {
            return var13;
        }
        if (arg8 != 117) {
            this.field6914 = null;
        }
        class42 var14 = this.method2937((byte) -31, arg7);
        if (arg4 > 1 && var14.field536 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field557[var16] <= arg4 && var14.field557[var16] != 0) {
                    var15 = var14.field536[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2937((byte) -49, var15);
            }
        }
        int[] var17 = var14.method323(arg9, arg3, arg4, arg2, arg6, arg0, arg10, arg5, arg1, 27885);
        if (var17 == null) {
            return null;
        }
        class85 var18;
        if (arg11) {
            var18 = arg10.method2773(arg8 ^ 0x74, 36, var17, 0, 32, 36);
        } else {
            var18 = arg9.method2773(1, 36, var17, 0, 32, 36);
        }
        if (!arg11) {
            class228 var19 = new class228();
            var19.field3314 = arg6;
            var19.field3315 = arg4;
            var19.field3310 = arg5 != null;
            var19.field3311 = arg1;
            var19.field3316 = arg3;
            var19.field3313 = arg7;
            var19.field3318 = arg9.field6448;
            this.field6910.method2314(arg8 ^ 0x35A2, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(BI)V", line = 283)
    public static final void method2941(byte arg0, int arg1) {
        field6891++;
        if (arg0 != -102) {
            field6899 = true;
        }
        class622 var2 = (class622) class108.field1547.method4253((long) arg1, -1);
        if (var2 != null) {
            var2.field8779 = !var2.field8779;
            var2.field8775.method3973((byte) -85, var2.field8779);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILha;IIILae;I)Lmq;", line = 309)
    public final class85 method2942(int arg0, int arg1, class475 arg2, int arg3, int arg4, int arg5, class285 arg6, int arg7) {
        this.field6911.field3314 = arg1;
        this.field6911.field3310 = arg6 != null;
        this.field6911.field3311 = arg0;
        this.field6911.field3315 = arg5;
        this.field6911.field3318 = arg2.field6448;
        this.field6911.field3316 = arg4;
        field6901++;
        if (arg3 >= -123) {
            return null;
        } else {
            this.field6911.field3313 = arg7;
            return (class85) this.field6910.method2305(this.field6911, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V", line = 327)
    public final void method2943(int arg0, int arg1) {
        class494 var3 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method2888(arg1, arg0 - 4737);
        }
        if (arg0 != 4854) {
            return;
        }
        field6893++;
        class494 var4 = this.field6909;
        synchronized (this.field6909) {
            this.field6909.method2888(arg1, arg0 ^ 0x128A);
        }
        class382 var5 = this.field6910;
        synchronized (this.field6910) {
            this.field6910.method2313(31639, arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JIBI)V", line = 347)
    public static final void method2944(long arg0, int arg1, byte arg2, int arg3) {
        field6894++;
        int var5 = ((int) arg0 & 0x7FAF8) >> 14;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (arg2 != -58) {
            method2944(60L, -81, (byte) 34, 49);
        }
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class246.method1636(var5, var6, 0, (byte) -125, arg1, 0, 0, true, arg3);
            return;
        }
        class416 var8 = class312.field4418.method369((byte) 126, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field5776;
            var9 = var8.field5734;
        } else {
            var9 = var8.field5776;
            var10 = var8.field5734;
        }
        int var11 = var8.field5765;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class246.method1636(0, 0, var9, (byte) -101, arg1, var10, var11, true, arg3);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lmca;IZLva;Lgga;Lgga;)V", line = 409)
    public class503(class41 arg0, int arg1, boolean arg2, class585 arg3, class513 arg4, class513 arg5) {
        this.field6902 = arg2;
        this.field6890 = arg5;
        this.field6896 = arg4;
        this.field6915 = arg3;
        this.field6907 = arg1;
        if (this.field6896 == null) {
            this.field6908 = 0;
        } else {
            int var7 = this.field6896.method3011((byte) -117) - 1;
            this.field6908 = var7 * 256 + this.field6896.method3007(-1, var7);
        }
        this.field6914 = new String[] { null, null, class563.field7806.method3281(this.field6907, -1), null, null };
        this.field6912 = new String[] { null, null, null, null, class563.field7807.method3281(this.field6907, -1) };
    }
}
