import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class406 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Ldc;")
    private class5 field5950 = new class5(64);

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Ldc;")
    public class5 field5967 = new class5(30);

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lhe;")
    public class239 field5962;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lhe;")
    private class239 field5960;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field5954 = 0;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lwt;")
    public static class194 field5952 = new class194("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field5965 = 20;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[I")
    public static int[] field5966 = new int[1];

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public int field5969;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5955;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 3)
    public final void method2426(int arg0) {
        field5959++;
        class5 var2 = this.field5950;
        synchronized (this.field5950) {
            this.field5950.method35((byte) -1);
        }
        class5 var3 = this.field5967;
        synchronized (this.field5967) {
            this.field5967.method35((byte) -1);
        }
        int var4 = -12 / ((-arg0 - 77) / 43);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lea;", line = 24)
    public final class366 method2427(int arg0, int arg1) {
        field5961++;
        class5 var3 = this.field5950;
        class366 var4;
        synchronized (this.field5950) {
            if (arg1 != -17773) {
                field5954 = 54;
            }
            var4 = (class366) this.field5950.method40(arg1 + 17773, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5960.method1470(4, class484.method2827(true, arg0), class398.method2379(arg0, -101));
        class366 var6 = new class366();
        var6.field5504 = this;
        var6.field5510 = arg0;
        if (var5 != null) {
            var6.method2236(arg1 + 17773, new class156(var5));
        }
        class5 var7 = this.field5950;
        synchronized (this.field5950) {
            this.field5950.method36(arg1 ^ 0x14B3, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 53)
    public static void method2428(boolean arg0) {
        if (arg0) {
            field5965 = -126;
        }
        field5955 = null;
        field5966 = null;
        field5952 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V", line = 71)
    public final void method2429(int arg0, int arg1) {
        this.field5969 = arg0;
        if (arg1 != -4213) {
            this.field5962 = null;
        }
        field5964++;
        class5 var3 = this.field5967;
        synchronized (this.field5967) {
            this.field5967.method38((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 87)
    public static final void method2430(int arg0, String arg1, int arg2) {
        field5953++;
        class338 var3 = class380.method2294((byte) 61, arg0, 3);
        var3.method2052((byte) -31);
        if (arg2 != 0) {
            field5952 = null;
        }
        var3.field4923 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V", line = 104)
    public static final void method2431(boolean arg0, int arg1) {
        field5957++;
        class338 var2 = class380.method2294((byte) 108, arg1, 12);
        var2.method2048(124);
        if (arg0) {
            method2431(true, 56);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 117)
    public final void method2432(byte arg0) {
        class5 var2 = this.field5950;
        synchronized (this.field5950) {
            this.field5950.method38((byte) -7);
        }
        field5968++;
        if (arg0 != -90) {
            this.method2436(57, (byte) 23);
        }
        class5 var3 = this.field5967;
        synchronized (this.field5967) {
            this.field5967.method38((byte) -19);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 135)
    public static final Class method2433(int arg0, String arg1) throws ClassNotFoundException {
        field5956++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            int var2 = -90 % ((arg0 + 19) / 62);
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIIIII)V", line = 169)
    public static final void method2434(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5951++;
        if (class92.field1252 >= arg5 && arg1 >= class7.field131) {
            boolean var6;
            if (arg4 < class473.field6839) {
                arg4 = class473.field6839;
                var6 = false;
            } else if (arg4 > class63.field933) {
                var6 = false;
                arg4 = class63.field933;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class473.field6839 > arg3) {
                var7 = false;
                arg3 = class473.field6839;
            } else if (class63.field933 < arg3) {
                var7 = false;
                arg3 = class63.field933;
            } else {
                var7 = true;
            }
            if (class7.field131 <= arg5) {
                class238.method1440(class41.field629[arg5++], arg2, arg3, arg4, -14726);
            } else {
                arg5 = class7.field131;
            }
            if (class92.field1252 < arg1) {
                arg1 = class92.field1252;
            } else {
                class238.method1440(class41.field629[arg1--], arg2, arg3, arg4, arg0 ^ 0x39B4);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg1; var8++) {
                    int[] var9 = class41.field629[var8];
                    var9[arg4] = var9[arg3] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg1; var11++) {
                    class41.field629[var11][arg4] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg1; var10++) {
                    class41.field629[var10][arg3] = arg2;
                }
            }
        }
        if (arg0 != -50) {
            method2435(-125, 34, null, 114, -29L, -18, 13, null, 26);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILts;IJIILfs;I)V", line = 273)
    public static final void method2435(int arg0, int arg1, class356 arg2, int arg3, long arg4, int arg5, int arg6, class372 arg7, int arg8) {
        field5963++;
        if (arg0 < 58) {
            method2428(true);
        }
        int var10 = arg3 * arg3 + (arg5 * arg5);
        if (arg4 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg2.field5168 / 2, arg2.field5169 / 2);
        if ((var11 * var11) >= var10) {
            class397.method2373(arg1, arg3, arg7, arg5, class69.field1018[arg8], arg6, 256, arg2);
            return;
        }
        var11 -= 10;
        int var12;
        if (class306.field4454 == 4) {
            var12 = (int) class506.field7722 & 0x3FFF;
        } else {
            var12 = (int) class506.field7722 + class280.field4003 & 0x3FFF;
        }
        int var13 = class323.field4731[var12];
        int var14 = class323.field4733[var12];
        if (class306.field4454 != 4) {
            var13 = var13 * 256 / (class498.field7587 + 256);
            var14 = var14 * 256 / (class498.field7587 + 256);
        }
        int var15 = arg3 * var14 + arg5 * var13 >> 15;
        int var16 = arg5 * var14 - (arg3 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class276.field3952[arg8].method1846((float) arg2.field5168 / 2.0F + (float) arg6 + (float) var19, (float) arg2.field5169 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V", line = 333)
    public final void method2436(int arg0, byte arg1) {
        field5958++;
        class5 var3 = this.field5950;
        synchronized (this.field5950) {
            if (arg1 <= 106) {
                method2435(-47, -3, null, 3, 33L, 79, 127, null, 122);
            }
            this.field5950.method39(false, arg0);
        }
        class5 var4 = this.field5967;
        synchronized (this.field5967) {
            this.field5967.method39(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lci;ILhe;Lhe;)V", line = 364)
    public class406(class298 arg0, int arg1, class239 arg2, class239 arg3) {
        this.field5962 = arg3;
        this.field5960 = arg2;
        int var5 = this.field5960.method1466(false) - 1;
        this.field5960.method1473(4309, var5);
    }
}
