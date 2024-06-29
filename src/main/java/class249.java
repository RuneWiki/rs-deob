import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class249 extends class143 {

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public int field3971 = 0;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "Z")
    public boolean field3969 = false;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "Lkd;")
    private class215 field3977 = new class215();

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    private int field3979 = 0;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "Lud;")
    public class2 field3978 = new class2();

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "Z")
    private boolean field3992 = false;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    private int field3994 = 0;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    private int field3989;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    private int field3995;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "[Lui;")
    public class243[] field3968;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "J")
    private long field3976;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field3960 = 0;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Z")
    private static boolean field3963 = false;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public static int field3973 = 0;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field3975 = 0;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Lpb;")
    public static class131 field3965 = new class131(8);

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field3983 = 2;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    private static int field3982 = 0;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "[Z")
    private static boolean[] field3981 = new boolean[8];

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "[Z")
    private static boolean[] field3980 = new boolean[8];

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public int field3984;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public int field3990;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public int field3993;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "I")
    public int field3998;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "J")
    public long field3961;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "J")
    private long field3967;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Lkd;")
    private static class215 field3962;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "[Lui;")
    public static class243[] field3966;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([Lad;Z[I[I[I)V")
    private final void method1681(class269[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3981[var6] = false;
        }
        label82: for (class58 var7 = (class58) this.field3977.method1483((byte) 124); var7 != null; var7 = (class58) this.field3977.method1485(940)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field914) {
                        field3981[var12] = true;
                        var7.field932 = false;
                        continue label82;
                    }
                }
            }
            if (!arg1) {
                if (var7.field929 == 0) {
                    var7.method1043(268427922);
                    this.field3979--;
                } else {
                    var7.field932 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field3979 != 8; var8++) {
            if (!field3981[var8]) {
                class58 var9 = new class58(arg0[var8], this, this.field3961);
                this.field3977.method1487(true, var9);
                this.field3979++;
                field3981[var8] = true;
            }
        }
        for (class58 var10 = (class58) this.field3977.method1483((byte) 118); var10 != null; var10 = (class58) this.field3977.method1485(940)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field3981[var11] && arg0[var11] == var10.field914) {
                    var10.method482(arg4[var10.field914.field4266], arg2[var10.field914.field4265], arg3[var10.field914.field4266], arg4[var10.field914.field4265], arg3[var10.field914.field4268], arg2[var10.field914.field4266], 3, arg3[var10.field914.field4265], arg4[var10.field914.field4268], arg2[var10.field914.field4268]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lub;)V")
    public static final void method1682(class92 arg0) {
        field3973 = 0;
        field3975 = 0;
        field3962 = new class215();
        field3966 = new class243[1024];
        class299.method2005(arg0, 106);
        class209.method1464(arg0, 17187);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(J)V")
    public static final void method1683(long arg0) {
        field3974 = field3972;
        field3960 = 0;
        field3972 = 0;
        long var2 = class242.method1650(54);
        for (class249 var4 = (class249) field3962.method1483((byte) 121); var4 != null; var4 = (class249) field3962.method1485(940)) {
            if (var4.method1696(arg0)) {
                field3960++;
            }
        }
        if (field3963 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field3962.method1486(14535) + ", running: " + field3960 + ". Particles: " + field3972 + ". Time taken: " + (class242.method1650(90) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public static final void method1684(int arg0) {
        field3983 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
    public static final int method1685() {
        return field3983;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([Lad;[Lcl;Z[I[I[I)V")
    public final void method1686(class269[] arg0, class203[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field3969) {
            this.method1681(arg0, arg2, arg3, arg4, arg5);
            this.method1687(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([Lcl;Z[I[I[I)V")
    private final void method1687(class203[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3980[var6] = false;
        }
        label91: for (class43 var7 = (class43) this.field3978.method6(-121); var7 != null; var7 = (class43) this.field3978.method11((byte) 39)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field721) {
                        field3980[var12] = true;
                        continue label91;
                    }
                }
            }
            if (!arg1) {
                var7.method995((byte) 99);
                this.field3994--;
                if (var7.method1465(-70)) {
                    var7.method1463((byte) -116);
                    field3982--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field3994 != 8; var8++) {
            if (!field3980[var8]) {
                class43 var9 = null;
                if (arg0[var8].field3136.field3956 == 1 && field3982 < 32) {
                    var9 = new class43(arg0[var8], this);
                    field3965.method974(-1, (long) arg0[var8].field3136.field3946, var9);
                    field3982++;
                }
                if (var9 == null) {
                    var9 = new class43(arg0[var8], this);
                }
                this.field3978.method12(var9, 12);
                this.field3994++;
                field3980[var8] = true;
            }
        }
        for (class43 var10 = (class43) this.field3978.method6(-126); var10 != null; var10 = (class43) this.field3978.method11((byte) 52)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field3980[var11] && arg0[var11] == var10.field721) {
                    var10.method374(arg4[var10.field721.field3129], arg3[var10.field721.field3129], -94, arg2[var10.field721.field3129]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
    public final void method1688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3969) {
            return;
        }
        if (this.field3987 != arg0) {
            for (class58 var6 = (class58) this.field3977.method1483((byte) 124); var6 != null; var6 = (class58) this.field3977.method1485(940)) {
                var6.field905 = true;
            }
        }
        this.field3967 = this.field3961;
        this.field3987 = arg0;
        this.field3998 = arg1;
        this.field3993 = arg2;
        this.field3996 = arg3;
        this.field3988 = arg4;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()I")
    public final int method1689() {
        if (this.field3997 == this.field3985 && this.field3991 == this.field3984) {
            return 92;
        }
        int var1 = this.field3997 << 7;
        int var2 = (this.field3985 << 7) + 128;
        int var3 = this.field3991 << 7;
        int var4 = (this.field3984 << 7) + 128;
        int var5 = this.field3993 - var1;
        int var6 = var2 - this.field3993;
        if (var5 > var6) {
            int var7 = this.field3988 - var3;
            int var8 = var4 - this.field3988;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field3988 - var3;
            int var10 = var4 - this.field3988;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()V")
    public final void method1690() {
        this.field3992 = true;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()V")
    public final void method1691() {
        this.field3969 = true;
        for (class43 var1 = (class43) this.field3978.method6(-109); var1 != null; var1 = (class43) this.field3978.method11((byte) 39)) {
            if (var1.field721.field3136.field3956 == 1) {
                var1.method1463((byte) -108);
            }
        }
        this.field3968 = new class243[8192];
        this.field3971 = 0;
        this.field3977 = new class215();
        this.field3979 = 0;
        this.field3978 = new class2();
        this.field3994 = 0;
        this.method1043(268427922);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
    public static final void method1692(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "()V")
    public static final void method1693() {
        field3965 = new class131(8);
        field3982 = 0;
        for (class249 var0 = (class249) field3962.method1483((byte) 115); var0 != null; var0 = (class249) field3962.method1485(940)) {
            var0.method1691();
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
    private final void method1694(int arg0, int arg1) {
        for (class43 var3 = (class43) this.field3978.method6(-116); var3 != null; var3 = (class43) this.field3978.method11((byte) 118)) {
            var3.field717 = this.field3993 + var3.field727;
            var3.field724 = this.field3996 + var3.field715;
            var3.field718 = this.field3988 + var3.field722;
            if (this.field3987 == 0) {
                var3.field719 = var3.field721.field3136.field3948;
                var3.field720 = var3.field721.field3136.field3936;
            } else {
                int var4 = var3.field721.field3136.field3948;
                int var5 = var3.field721.field3136.field3936;
                var3.field719 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field720 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIIII)V")
    public final void method1695(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1688(arg0, arg1, class42.field713 + arg2, class178.field2736 + arg3, class14.field178 + arg4);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(J)Z")
    private final boolean method1696(long arg0) {
        long var3;
        if (this.field3976 > this.field3967) {
            var3 = this.field3976;
        } else {
            var3 = this.field3967;
        }
        int var5 = (int) (this.field3961 - var3);
        if (var5 > 750) {
            this.method1691();
            return false;
        }
        if (this.field3967 > 0L) {
            this.field3997 = this.field3993 - (this.field3989 << 6) >> 7;
            this.field3985 = ((this.field3989 << 6) + this.field3993 >> 7) - 1;
            this.field3991 = this.field3988 - (this.field3995 << 6) >> 7;
            this.field3984 = ((this.field3995 << 6) + this.field3988 >> 7) - 1;
            this.field3990 = this.field3996;
            if (this.field3998 < 3) {
                this.field3986 = class233.field3684[this.field3998 + 1][this.field3997][this.field3991] + class233.field3684[this.field3998 + 1][this.field3985][this.field3991] + class233.field3684[this.field3998 + 1][this.field3997][this.field3984] + class233.field3684[this.field3998 + 1][this.field3985][this.field3984] >> 2;
            } else {
                this.field3986 = this.field3990 - 1024;
            }
            int var6 = class224.field3601[this.field3987];
            int var7 = class224.field3597[this.field3987];
            this.method1694(var6, var7);
            if (this.field3992) {
                class58 var8 = (class58) this.field3977.method1483((byte) 126);
                while (true) {
                    if (var8 == null) {
                        this.field3992 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field901.field2614; var9++) {
                        var8.method481(var7, 1, true, this.field3961, (byte) -114, var6);
                    }
                    var8 = (class58) this.field3977.method1485(940);
                }
            }
            int var10 = (int) (arg0 - this.field3961);
            for (class58 var11 = (class58) this.field3977.method1483((byte) 126); var11 != null; var11 = (class58) this.field3977.method1485(940)) {
                var11.method481(var7, var10, var5 < 10, arg0, (byte) -106, var6);
            }
        }
        this.field3961 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "()V")
    public static void method1697() {
        field3962 = null;
        field3966 = null;
        field3965 = null;
        field3981 = null;
        field3980 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(III)V")
    public class249(int arg0, int arg1, int arg2) {
        this.field3989 = arg1;
        this.field3995 = arg2;
        this.field3968 = new class243[8192];
        this.field3976 = (long) arg0;
        this.field3992 = true;
        field3962.method1487(true, this);
    }

    static {
        new class31(131056);
    }
}
