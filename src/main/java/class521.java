import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class521 implements Runnable {

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Llaa;")
    private class130 field7362 = new class448();

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Llaa;")
    private class130 field7364 = null;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
    public static int[] field7353 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lfba;")
    public static class27 field7350 = new class27(47, -1);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    private int field7367;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    private int field7374;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "J")
    private long field7369;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "J")
    private long field7371;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Lgp;")
    private class53 field7366;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Ljava/lang/String;")
    private String field7372;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Z")
    private boolean field7348;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Z")
    private volatile boolean field7360;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static void method3132(boolean arg0) {
        field7353 = null;
        if (!arg0) {
            method3138(-32, null, null, null, -72, -32);
        }
        field7350 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Llaa;Z)V")
    public final synchronized void method3133(class130 arg0, boolean arg1) {
        field7355++;
        this.field7364 = this.field7362;
        if (!arg1) {
            this.method3133(null, true);
        }
        this.field7362 = arg0;
        this.field7369 = class459.method2731(124);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BIIIIB)Z")
    public static final boolean method3134(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field7368++;
        if (arg6 != 107) {
            field7353 = null;
        }
        int var7 = arg3 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg0 + arg4 - 1) / arg4);
        int var10 = -((arg3 + arg4 - 1) / arg4);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg2] == 0) {
                    return true;
                }
                arg2 += arg4;
            }
            int var13 = arg2 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg5 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)Z")
    public final synchronized boolean method3135(byte arg0) {
        if (arg0 != -92) {
            this.method3142(null, 82L, 64, -15, null);
        }
        field7365++;
        return this.field7362.method967(-30245, this.field7369);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public final void method3136(int arg0) {
        if (arg0 != 14801) {
            this.field7371 = 36L;
        }
        field7361++;
        this.field7360 = true;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I")
    public final int method3137(int arg0) {
        field7359++;
        if (arg0 != 2) {
            this.field7362 = null;
        }
        return this.field7374;
    }

    @OriginalMember(owner = "client!va", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field7360) {
            long var1 = class459.method2731(121);
            synchronized (this) {
                try {
                    this.field7374++;
                    if (this.field7362 instanceof class448) {
                        this.field7362.method968(this.field7348, (byte) -84);
                    } else {
                        long var4 = class459.method2731(108);
                        if (class37.field491 == null || this.field7364 == null || this.field7364.method966(9619) == 0 || this.field7369 < (var4 - (long) this.field7364.method966(9619))) {
                            if (this.field7364 != null) {
                                this.field7348 = true;
                                this.field7364.method971(4005);
                                this.field7364 = null;
                            }
                            if (this.field7348) {
                                class33.method270(0);
                                if (class37.field491 != null) {
                                    class37.field491.method509(0);
                                }
                            }
                            this.field7362.method968(this.field7348 || class37.field491 != null && class37.field491.method462(), (byte) -84);
                        } else {
                            int var6 = (int) ((var4 - this.field7369) * 255L / (long) this.field7364.method966(9619));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            class33.method270(0);
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class37.field491.method509(0);
                            class241 var10 = class37.field491.method517(class428.field5825, class714.field9895, true);
                            class37.field491.method456(false, var10);
                            this.field7364.method968(true, (byte) -84);
                            class37.field491.method468();
                            var10.method364(0, 0, 0, var9, 1);
                            class37.field491.method456(false, var10);
                            class37.field491.method509(0);
                            this.field7362.method968(true, (byte) -84);
                            class37.field491.method468();
                            var10.method364(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class37.field491 != null && !(this.field7362 instanceof class448)) {
                                class37.field491.method508(127);
                            }
                        } catch (class736 var18) {
                            class678.method3848(var18.getMessage() + " (Recovered) " + class256.field3768.method2039(1001), var18, false);
                            class9.method61(0, true, (byte) -40);
                        }
                    }
                    Container var12;
                    if (class384.field5278 != null) {
                        var12 = class384.field5278;
                    } else if (class319.field4527 == null) {
                        var12 = class742.field10293;
                    } else {
                        var12 = class319.field4527;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class384.field5278 == var12) {
                        class384.field5278.getInsets();
                    }
                    this.field7348 = false;
                    if (class37.field491 != null && !(this.field7362 instanceof class448) && this.field7366.method369((byte) 112) < class53.field665.method369((byte) 113)) {
                        class606.method3517(31719);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class459.method2731(112);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class107.method828((long) var15, (byte) -107);
            }
        }
        field7358++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[I[ILpj;II)Lcca;")
    public static final class259 method3138(int arg0, int[] arg1, int[] arg2, class156 arg3, int arg4, int arg5) {
        field7354++;
        if (arg0 != 0) {
            method3140(122, null, -22, null, -112);
        }
        if (!arg3.method1198(13554, class88.field993, class34.field457)) {
            int[] var10 = new int[arg4 * arg5];
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = arg5 * var11 + arg1[var11];
                for (int var13 = 0; var13 < arg2[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class259(arg3, arg5, arg4, var10);
        }
        byte[] var6 = new byte[arg4 * arg5];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg5 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class259(arg3, arg5, arg4, var6);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public final synchronized void method3139(boolean arg0) {
        this.field7348 = true;
        if (!arg0) {
            field7352++;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[II[Ljava/lang/String;I)V")
    public static final void method3140(int arg0, int[] arg1, int arg2, String[] arg3, int arg4) {
        int var5 = -42 / ((-arg0 - 48) / 54);
        if (arg4 > arg2) {
            int var6 = (arg2 + arg4) / 2;
            int var7 = arg2;
            String var8 = arg3[var6];
            arg3[var6] = arg3[arg4];
            arg3[arg4] = var8;
            int var9 = arg1[var6];
            arg1[var6] = arg1[arg4];
            arg1[arg4] = var9;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if (var8 == null || arg3[var10] != null && (var10 & 0x1) > arg3[var10].compareTo(var8)) {
                    String var11 = arg3[var10];
                    arg3[var10] = arg3[var7];
                    arg3[var7] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var7];
                    arg1[var7++] = var12;
                }
            }
            arg3[arg4] = arg3[var7];
            arg3[var7] = var8;
            arg1[arg4] = arg1[var7];
            arg1[var7] = var9;
            method3140(28, arg1, arg2, arg3, var7 - 1);
            method3140(-111, arg1, var7 + 1, arg3, arg4);
        }
        field7357++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)I")
    public final int method3141(byte arg0) {
        field7370++;
        if (this.field7366 == null) {
            return 0;
        }
        int var2 = this.field7366.method369((byte) 126);
        if (this.field7366.field639 && this.field7366.field635 > this.field7367) {
            return this.field7367 + 1;
        } else if (var2 < 0 || var2 >= (class242.field3617.length - 1)) {
            return 100;
        } else if (arg0 == -1) {
            return this.field7366.field637 == this.field7367 ? this.field7366.field635 : this.field7366.field637;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;JIILgp;)V")
    public final synchronized void method3142(String arg0, long arg1, int arg2, int arg3, class53 arg4) {
        this.field7372 = arg0;
        field7349++;
        this.field7367 = arg2;
        this.field7366 = arg4;
        this.field7371 = arg1;
        if (arg3 != 32480) {
            this.field7366 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)Lgp;")
    public final class53 method3143(int arg0) {
        if (arg0 == -1) {
            field7356++;
            return this.field7366;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)I")
    public final int method3144(int arg0) {
        if (arg0 != 5208) {
            this.method3133(null, true);
        }
        field7373++;
        return this.field7367;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method3145(boolean arg0) {
        field7351++;
        if (!arg0) {
            this.field7372 = null;
        }
        return this.field7372;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)J")
    public final long method3146(byte arg0) {
        field7347++;
        return arg0 == -121 ? this.field7371 : -74L;
    }
}
