import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class650 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    private int field8924 = -1;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
    private boolean field8926 = true;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    private int field8935;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    private int field8933;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[Lid;")
    private class585[] field8923;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    private int field8940;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    private int field8942;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[Lid;")
    private class585[] field8939;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lid;")
    private class585 field8931;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field8937 = 0;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[Lmga;")
    public static class709[] field8928 = new class709[14];

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field8925 = -1;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    private int field8929;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field8941;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Loia;")
    private class88 field8934;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILha;)Z")
    public final boolean method3579(int arg0, int arg1, class58 arg2) {
        if (arg1 != 12162) {
            this.field8924 = 65;
        }
        field8932++;
        if (this.field8924 != arg0) {
            this.field8924 = arg0;
            int var4 = class42.method282(-1350259935, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8941 != var4) {
                this.field8941 = var4;
                this.field8934 = null;
            }
            if (this.field8923 != null) {
                this.field8929 = 0;
                int[] var5 = new int[this.field8923.length];
                for (int var6 = 0; var6 < this.field8923.length; var6++) {
                    class585 var7 = this.field8923[var6];
                    if (var7.method3315(this.field8942, this.field8933, this.field8940, this.field8924)) {
                        var5[this.field8929] = var7.field8234;
                        this.field8939[this.field8929++] = var7;
                    }
                }
                class65.method545(0, this.field8939, var5, true, this.field8929 - 1);
            }
            this.field8926 = true;
        }
        boolean var8 = false;
        if (this.field8926) {
            this.field8926 = false;
            for (int var9 = this.field8929 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8939[var9].method3319(arg2, this.field8931);
                this.field8926 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZ)V")
    public static final void method3580(byte arg0, boolean arg1) {
        class485.method2904((byte) -99);
        field8927++;
        if (!class349.method2250((byte) 35, class222.field2897)) {
            return;
        }
        class522.field7400++;
        if (class522.field7400 < 50 && !arg1) {
            return;
        }
        class522.field7400 = 0;
        if (arg0 <= 43) {
            field8928 = null;
        }
        if (!class711.field9881 && class333.field4663 != null) {
            class549.field7661++;
            class519 var2 = class357.method2293(class427.field5994, class112.field1371, (byte) -122);
            class151.method1027(var2, -89);
            try {
                class390.method2455((byte) -13);
            } catch (IOException var3) {
                class711.field9881 = true;
            }
        }
        class485.method2904((byte) 85);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method3581(int arg0) {
        field8928 = null;
        if (arg0 != -1) {
            method3581(-23);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIILha;)V")
    public final void method3582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        field8938++;
        int var11 = arg1 + arg4 & 0x3FFF;
        if (this.field8935 == -1 || this.field8941 == 0) {
            arg9.method431(arg6, arg2, arg8, arg7, arg0, 0);
        } else {
            class502 var12 = class487.field6844.method532((byte) 127, this.field8935);
            if (this.field8934 == null && class487.field6844.method531(this.field8935, 115)) {
                int[] var13 = var12.field7203 == 2 ? class487.field6844.method530(this.field8941, -117, false, 0.7F, this.field8941, this.field8935) : class487.field6844.method534(false, this.field8941, 20377, this.field8941, 0.7F, this.field8935);
                this.field8934 = arg9.method426(this.field8941, this.field8941, var13, -1, this.field8941, 0);
            }
            if (var12.field7203 == 2) {
                arg9.method431(arg6, arg2, arg8, arg7, arg0, 0);
            }
            if (this.field8934 != null) {
                int var14 = var12.field7203 == 2 ? 1 : 0;
                int var15 = arg5 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg8 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (arg7 < var15) {
                    var15 -= arg7;
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg8; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field8934.method654(arg6 + var17, var18 - -arg2, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field8929 - 1; var19 >= 0; var19--) {
            this.field8939[var19].method3316(arg9, arg6, arg2, arg8, arg7, arg5, var11);
        }
        if (arg3 != 5063) {
            field8928 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public final void method3583(int arg0) {
        field8936++;
        if (this.field8923 != null) {
            for (int var2 = 0; var2 < this.field8923.length; var2++) {
                this.field8923[var2].method3314();
            }
        }
        if (arg0 != 0) {
            method3584((byte) 33, null);
        }
        this.field8934 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3584(byte arg0, String arg1) {
        field8930++;
        System.out.println("Error: " + class187.method1172("%0a", "\n", 0, arg1));
        if (arg0 != -103) {
            field8925 = -88;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I[Lid;IIII)V")
    public class650(int arg0, class585[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8935 = arg0;
        this.field8933 = arg4;
        this.field8923 = arg1;
        this.field8940 = arg5;
        this.field8942 = arg3;
        if (arg1 == null) {
            this.field8939 = null;
            this.field8931 = null;
        } else {
            this.field8939 = new class585[arg1.length];
            this.field8931 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
