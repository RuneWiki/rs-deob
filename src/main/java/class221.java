import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class221 {

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Lgw;")
    private class690 field2990 = new class690(64);

    @OriginalMember(owner = "client!go", name = "u", descriptor = "Lgw;")
    public class690 field2997 = new class690(50);

    @OriginalMember(owner = "client!go", name = "v", descriptor = "Lgda;")
    public class733 field2998 = new class733(250);

    @OriginalMember(owner = "client!go", name = "w", descriptor = "Lqh;")
    private class156 field2999 = new class156();

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Luu;")
    private class237 field2977;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Luu;")
    public class237 field2986;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "Llv;")
    private class356 field3001;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "Z")
    private boolean field2989;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!go", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field3000;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field3003;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field2992 = 0;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "Lefa;")
    public static class531 field2991;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public final void method1307(byte arg0) {
        field2996++;
        if (arg0 != 104) {
            this.field2977 = null;
        }
        class690 var2 = this.field2990;
        synchronized (this.field2990) {
            this.field2990.method3902(0);
        }
        class690 var3 = this.field2997;
        synchronized (this.field2997) {
            this.field2997.method3902(0);
        }
        class733 var4 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method4091((byte) 114);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lwh;IILha;IIII)Lfd;")
    public final class298 method1308(class41 arg0, int arg1, int arg2, class548 arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2999.field2185 = arg6;
        this.field2999.field2187 = arg0 != null;
        this.field2999.field2190 = arg2;
        this.field2999.field2193 = arg7;
        this.field2999.field2194 = arg5;
        field2978++;
        this.field2999.field2195 = arg3.field7611;
        if (arg1 >= -68) {
            return null;
        } else {
            this.field2999.field2192 = arg4;
            return (class298) this.field2998.method4090(this.field2999, 0);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BZ)V")
    public final void method1309(byte arg0, boolean arg1) {
        field2984++;
        if (arg1 == this.field2989) {
            return;
        }
        if (arg0 != -67) {
            this.field2990 = null;
        }
        this.field2989 = arg1;
        this.method1316(false);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
    public final void method1310(byte arg0) {
        class690 var2 = this.field2997;
        synchronized (this.field2997) {
            this.field2997.method3906(-109);
        }
        field2980++;
        if (arg0 <= 94) {
            field2991 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLip;)I")
    public static final int method1311(byte arg0, class306 arg1) {
        field2988++;
        if (arg0 != 94) {
            method1311((byte) -114, null);
        }
        if (class15.field140 == arg1) {
            return 5890;
        } else if (class684.field9515 == arg1) {
            return 34167;
        } else if (class231.field3142 == arg1) {
            return 34168;
        } else if (class520.field7247 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
    public final void method1312(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field2981++;
        this.field3002 = arg0;
        class690 var3 = this.field2997;
        synchronized (this.field2997) {
            this.field2997.method3906(-113);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)Lov;")
    public final class671 method1313(int arg0, boolean arg1) {
        field2979++;
        class690 var3 = this.field2990;
        class671 var4;
        synchronized (this.field2990) {
            var4 = (class671) this.field2990.method3898((byte) -42, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg1) {
            this.method1308(null, -99, -58, null, 122, 51, 28, -95);
        }
        class237 var5 = this.field2977;
        byte[] var6;
        synchronized (this.field2977) {
            var6 = this.field2977.method1572(class6.method29((byte) 106, arg0), 0, class633.method3551(arg0, -115));
        }
        class671 var7 = new class671();
        var7.field9299 = this;
        var7.field9311 = arg0;
        var7.field9280 = new String[] { null, null, class155.field2126.method978(this.field2995, (byte) -115), null, null };
        var7.field9279 = new String[] { null, null, null, null, class155.field2127.method978(this.field2995, (byte) -109) };
        if (var6 != null) {
            var7.method3789(new class63(var6), (byte) 96);
        }
        var7.method3795(53);
        if (var7.field9324 != -1) {
            var7.method3788(104, this.method1313(var7.field9324, true), this.method1313(var7.field9333, true));
        }
        if (var7.field9268 != -1) {
            var7.method3791(this.method1313(var7.field9323, true), -1022, this.method1313(var7.field9268, true));
        }
        if (var7.field9341 != -1) {
            var7.method3800(false, this.method1313(var7.field9326, true), this.method1313(var7.field9341, true));
        }
        if (!this.field2989 && var7.field9266) {
            var7.field9281 = class155.field2123.method978(this.field2995, (byte) -107);
            var7.field9280 = this.field3000;
            var7.field9347 = 0;
            var7.field9308 = false;
            var7.field9306 = null;
            var7.field9279 = this.field3003;
            if (var7.field9294 != null) {
                boolean var8 = false;
                for (class71 var9 = var7.field9294.method821((byte) 110); var9 != null; var9 = var7.field9294.method818(46)) {
                    class648 var10 = this.field3001.method2279(-99, (int) var9.field1079);
                    if (var10.field8692) {
                        var9.method549(6410);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field9294 = null;
                }
            }
        }
        class690 var11 = this.field2990;
        synchronized (this.field2990) {
            this.field2990.method3899(77, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method1314(int arg0) {
        if (arg0 != 5890) {
            field2992 = -14;
        }
        field2991 = null;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    public final void method1315(int arg0) {
        int var2 = -39 / ((-arg0 - 37) / 60);
        class733 var3 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method4086((byte) 91);
        }
        field2994++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    public final void method1316(boolean arg0) {
        class690 var2 = this.field2990;
        synchronized (this.field2990) {
            this.field2990.method3906(-98);
        }
        field2982++;
        class690 var3 = this.field2997;
        synchronized (this.field2997) {
            if (arg0) {
                return;
            }
            this.field2997.method3906(-105);
        }
        class733 var4 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method4086((byte) 119);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILda;ZZLwh;ILha;ILha;I)Lfd;")
    public final class298 method1317(int arg0, int arg1, int arg2, class402 arg3, boolean arg4, boolean arg5, class41 arg6, int arg7, class548 arg8, int arg9, class548 arg10, int arg11) {
        field2983++;
        class298 var13 = this.method1308(arg6, -122, arg9, arg8, arg11, arg1, arg0, arg2);
        if (var13 != null) {
            return var13;
        }
        class671 var14 = this.method1313(arg11, true);
        if (arg1 > 1 && var14.field9290 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg1 >= var14.field9350[var16] && var14.field9350[var16] != 0) {
                    var15 = var14.field9290[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1313(var15, true);
            }
        }
        if (arg7 != 0) {
            this.method1312(-107, 98);
        }
        int[] var17 = var14.method3786(arg0, arg10, arg2, arg1, arg3, arg8, arg9, arg5, 7, arg6);
        if (var17 == null) {
            return null;
        }
        class298 var18;
        if (arg4) {
            var18 = arg10.method3244(32, var17, (byte) -122, 36, 0, 36);
        } else {
            var18 = arg8.method3244(32, var17, (byte) -68, 36, 0, 36);
        }
        if (!arg4) {
            class156 var19 = new class156();
            var19.field2195 = arg8.field7611;
            var19.field2185 = arg0;
            var19.field2190 = arg9;
            var19.field2194 = arg1;
            var19.field2193 = arg2;
            var19.field2192 = arg11;
            var19.field2187 = arg6 != null;
            this.field2998.method4088(var19, var18, (byte) -123);
        }
        return var18;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(II)V")
    public final void method1318(int arg0, int arg1) {
        field2985++;
        class690 var3 = this.field2990;
        synchronized (this.field2990) {
            this.field2990.method3896(1, arg1);
        }
        if (arg0 != 3796) {
            this.field2999 = null;
        }
        class690 var4 = this.field2997;
        synchronized (this.field2997) {
            this.field2997.method3896(arg0 ^ 0xED5, arg1);
        }
        class733 var5 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method4083(87, arg1);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lgp;IZLlv;Luu;Luu;)V")
    public class221(class553 arg0, int arg1, boolean arg2, class356 arg3, class237 arg4, class237 arg5) {
        this.field2977 = arg4;
        this.field2986 = arg5;
        this.field3001 = arg3;
        this.field2995 = arg1;
        this.field2989 = arg2;
        if (this.field2977 == null) {
            this.field2993 = 0;
        } else {
            int var7 = this.field2977.method1584((byte) 83) - 1;
            this.field2993 = var7 * 256 + this.field2977.method1597(var7, 0);
        }
        this.field3000 = new String[] { null, null, class155.field2126.method978(this.field2995, (byte) -123), null, null };
        this.field3003 = new String[] { null, null, null, null, class155.field2127.method978(this.field2995, (byte) -119) };
    }
}
