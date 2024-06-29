import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class203 {

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Z")
    private boolean field3093 = true;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    private int field3099 = -1;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "[Lm;")
    private class381[] field3101;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Lm;")
    private class381 field3100;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[Lm;")
    private class381[] field3086;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lo;")
    private class139 field3092;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lza;BI)Z")
    public final boolean method1383(class497 arg0, byte arg1, int arg2) {
        if (this.field3099 != arg2) {
            this.field3099 = arg2;
            int var4 = class340.method2258(arg2, (byte) -125);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field3103 != var4) {
                this.field3092 = null;
                this.field3103 = var4;
            }
            if (this.field3101 != null) {
                this.field3098 = 0;
                int[] var5 = new int[this.field3101.length];
                for (int var6 = 0; var6 < this.field3101.length; var6++) {
                    class381 var7 = this.field3101[var6];
                    if (var7.method2464(this.field3087, this.field3095, this.field3097, this.field3099)) {
                        var5[this.field3098] = var7.field5853;
                        this.field3086[this.field3098++] = var7;
                    }
                }
                class161.method985(this.field3098 - 1, this.field3086, 0, var5, -106);
            }
            this.field3093 = true;
        }
        field3102++;
        int var8 = -104 / ((-arg1 - 64) / 60);
        boolean var9 = false;
        if (this.field3093) {
            this.field3093 = false;
            for (int var10 = this.field3098 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field3086[var10].method2457(arg0, this.field3100);
                var9 |= var11;
                this.field3093 |= !var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public final void method1384(byte arg0) {
        int var2 = -57 % ((arg0 - 79) / 42);
        if (this.field3101 != null) {
            for (int var3 = 0; var3 < this.field3101.length; var3++) {
                this.field3101[var3].method2458();
            }
        }
        field3089++;
        this.field3092 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIILza;I)V")
    public final void method1385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class497 arg8, int arg9) {
        field3091++;
        int var11 = arg1 + arg6 & 0x3FFF;
        if (this.field3088 == -1) {
            arg8.method1260(arg9, arg7, arg3, arg2, arg5, 0);
        } else {
            class476 var12 = class148.field1993.method1366(this.field3088, (byte) -120);
            if (this.field3092 == null && class148.field1993.method1364((byte) 53, this.field3088)) {
                int[] var13 = var12.field7277 ? class148.field1993.method1368(0.7F, this.field3103, false, false, this.field3088, this.field3103) : class148.field1993.method1367(false, 0.7F, this.field3088, this.field3103, -25218, this.field3103);
                this.field3092 = arg8.method1232(var13, 0, this.field3103, this.field3103, this.field3103);
            }
            if (var12.field7277) {
                arg8.method1260(arg9, arg7, arg3, arg2, arg5, 0);
            }
            if (this.field3092 != null) {
                int var14 = var12.field7277 ? 1 : 0;
                int var15 = arg0 * arg2 / -4096;
                int var16;
                for (var16 = arg2 * var11 / 4096 + (arg3 - arg2) / 2; var16 > arg2; var16 -= arg2) {
                }
                while (var15 > arg2) {
                    var15 -= arg2;
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg3; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field3092.method630(var17 + arg9, var18 - -arg7, arg2, arg2, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field3098 - 1; var19 >= 0; var19--) {
            this.field3086[var19].method2465(arg8, arg9, arg7, arg3, arg2, arg0, var11);
        }
        if (arg4 != -1) {
            this.field3092 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
    public static final void method1386(boolean arg0, int arg1) {
        field3096++;
        class529.method3148(-918414074);
        int var2 = class322.field5027.method596(arg1, 16).field4912;
        if (var2 == 0) {
            return;
        }
        int var3 = class96.field1394.field4650[arg1];
        if (arg0) {
            method1388((byte) 88, -59, false);
        }
        if (var2 == 6) {
            class77.field1142 = var3;
        }
        if (var2 == 5) {
            class247.field4006 = var3;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
    public static final int method1387(int arg0, int arg1) {
        if (arg0 != 512) {
            field3094 = -4;
        }
        field3090++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I[Lm;IIII)V")
    public class203(int arg0, class381[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3088 = arg0;
        this.field3101 = arg1;
        this.field3097 = arg5;
        this.field3095 = arg4;
        this.field3087 = arg3;
        if (arg1 == null) {
            this.field3100 = null;
            this.field3086 = null;
        } else {
            this.field3086 = new class381[arg1.length];
            this.field3100 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
    public static final String method1388(byte arg0, int arg1, boolean arg2) {
        field3085++;
        if (arg0 != 28) {
            field3094 = 50;
        }
        return arg2 && arg1 >= 0 ? class338.method2243(arg2, 10, arg1, 0) : Integer.toString(arg1);
    }
}
