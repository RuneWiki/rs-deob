import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class167 extends class40 {

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Laj;")
    public class1 field3002 = new class1();

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "Lpi;")
    public class314 field3016 = new class314();

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Ldh;")
    private class171 field3011;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field2999 = 3353893;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Lsf;")
    public static class108 field2997 = class140.method973(255, "M");

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Lsf;")
    public static class108 field3004 = class140.method973(255, "Weiter");

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "Lsf;")
    public static class108 field3009 = class140.method973(255, "cookieprefix");

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lsf;")
    public static class108 field3014 = class140.method973(255, "null");

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field3013 = 20;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Lrg;")
    public static class96 field3006;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()Lec;", line = 5)
    public final class40 method270() {
        field3005++;
        class215 var1 = (class215) this.field3002.method13(0);
        if (var1 == null) {
            return null;
        } else if (var1.field3813 == null) {
            return this.method276();
        } else {
            return var1.field3813;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILdk;I)V", line = 25)
    private final void method1165(int arg0, class215 arg1, int arg2) {
        field3015++;
        if (arg2 != 7795) {
            this.method1165(-114, (class215) null, -52);
        }
        if ((this.field3011.field3054[arg1.field3822] & 0x4) != 0 && arg1.field3825 < 0) {
            int var4 = this.field3011.field3079[arg1.field3822] / class210.field3755;
            int var5 = (var4 + 1048575 - arg1.field3800) / var4;
            arg1.field3800 = arg0 * var4 + arg1.field3800 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3011.field3059[arg1.field3822] == 0) {
                    arg1.field3813 = class179.method1294(arg1.field3808, arg1.field3813.method1270(), arg1.field3813.method1273(), arg1.field3813.method1269());
                } else {
                    arg1.field3813 = class179.method1294(arg1.field3808, arg1.field3813.method1270(), 0, arg1.field3813.method1269());
                    this.field3011.method1201(arg1.field3807.field3459[arg1.field3803] < 0, 8, arg1);
                }
                if (arg1.field3807.field3459[arg1.field3803] < 0) {
                    arg1.field3813.method1297(-1);
                }
                arg0 = arg1.field3800 / var4;
            }
        }
        arg1.field3813.method272(arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lik;IBI)Z", line = 67)
    public static final boolean method1166(class262 arg0, int arg1, byte arg2, int arg3) {
        int var4 = 50 / ((arg2 - 33) / 58);
        byte[] var5 = arg0.method1868(12236, arg1, arg3);
        field3008++;
        if (var5 == null) {
            return false;
        } else {
            class52.method366(var5, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 92)
    public final void method272(int arg0) {
        field3003++;
        this.field3016.method272(arg0);
        for (class215 var2 = (class215) this.field3002.method13(0); var2 != null; var2 = (class215) this.field3002.method15((byte) 47)) {
            if (!this.field3011.method1196(var2, (byte) 107)) {
                int var3 = arg0;
                do {
                    if (var2.field3804 >= var3) {
                        this.method1165(var3, var2, 7795);
                        var2.field3804 -= var3;
                        break;
                    }
                    this.method1165(var2.field3804, var2, 7795);
                    var3 -= var2.field3804;
                } while (!this.field3011.method1215(var2, (byte) -121, var3, 0, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()I", line = 135)
    public final int method275() {
        field3012++;
        return 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)V", line = 145)
    public final void method271(int[] arg0, int arg1, int arg2) {
        this.field3016.method271(arg0, arg1, arg2);
        field3001++;
        for (class215 var4 = (class215) this.field3002.method13(0); var4 != null; var4 = (class215) this.field3002.method15((byte) 47)) {
            if (!this.field3011.method1196(var4, (byte) 107)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3804 >= var5) {
                        this.method1169(arg0, var4, var5 + var6, var6, var5, -1);
                        var4.field3804 -= var5;
                        break;
                    }
                    this.method1169(arg0, var4, var6 + var5, var6, var4.field3804, -1);
                    var6 += var4.field3804;
                    var5 -= var4.field3804;
                } while (!this.field3011.method1215(var4, (byte) -119, var5, var6, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V", line = 184)
    public static final void method1167(byte arg0, int arg1) {
        if (arg0 >= -96) {
            field2997 = (class108) null;
        }
        field3007++;
        if (class219.method1508(arg1, -123)) {
            class155.method1086(-1, class320.field5485[arg1], (byte) -128);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V", line = 199)
    public static void method1168(int arg0) {
        if (arg0 != 20) {
            method1166((class262) null, 62, (byte) 88, -97);
        }
        field3014 = null;
        field2997 = null;
        field3006 = null;
        field3009 = null;
        field3004 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([ILdk;IIII)V", line = 226)
    private final void method1169(int[] arg0, class215 arg1, int arg2, int arg3, int arg4, int arg5) {
        field3010++;
        if (~(this.field3011.field3054[arg1.field3822] & 0x4) != arg5 && arg1.field3825 < 0) {
            int var7 = this.field3011.field3079[arg1.field3822] / class210.field3755;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3800) / var7;
                if (var8 > arg4) {
                    arg1.field3800 += arg4 * var7;
                    break;
                }
                arg1.field3813.method271(arg0, arg3, var8);
                arg1.field3800 += var7 * var8 - 1048576;
                arg3 += var8;
                int var9 = 262144 / var7;
                int var10 = class210.field3755 / 100;
                class179 var11 = arg1.field3813;
                if (var10 > var9) {
                    var10 = var9;
                }
                arg4 -= var8;
                if (this.field3011.field3059[arg1.field3822] == 0) {
                    arg1.field3813 = class179.method1294(arg1.field3808, var11.method1270(), var11.method1273(), var11.method1269());
                } else {
                    arg1.field3813 = class179.method1294(arg1.field3808, var11.method1270(), 0, var11.method1269());
                    this.field3011.method1201(arg1.field3807.field3459[arg1.field3803] < 0, 8, arg1);
                    arg1.field3813.method1263(var10, var11.method1273());
                }
                if (arg1.field3807.field3459[arg1.field3803] < 0) {
                    arg1.field3813.method1297(-1);
                }
                var11.method1271(var10);
                var11.method271(arg0, arg3, arg2 - arg3);
                if (var11.method1296()) {
                    this.field3016.method2191(var11);
                }
            }
        }
        arg1.field3813.method271(arg0, arg3, arg4);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ldh;)V", line = 327)
    public class167(class171 arg0) {
        this.field3011 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()Lec;", line = 292)
    public final class40 method276() {
        field3000++;
        class215 var1;
        do {
            var1 = (class215) this.field3002.method15((byte) 47);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3813 == null);
        return var1.field3813;
    }
}
