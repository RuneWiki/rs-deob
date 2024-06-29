import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class474 extends class363 {

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public int field5854 = 0;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Z")
    public boolean field5852 = true;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public int field5862 = -1;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public int field5861 = 12800;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public int field5860 = -1;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public int field5856 = 12800;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public int field5867 = 0;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "Ljava/lang/String;")
    public String field5859;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public int field5865;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public int field5864;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "Ljava/lang/String;")
    public String field5857;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "Lws;")
    public class333 field5868;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "Ldr;")
    public static class675 field5866 = new class675(104, 2);

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "Lcga;")
    public static class449 field5869 = new class449(50, 8);

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "Le;")
    public static class498 field5870;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII[I)Z", line = 3)
    public final boolean method2570(byte arg0, int arg1, int arg2, int[] arg3) {
        field5858++;
        if (arg0 != -35) {
            this.field5857 = null;
        }
        for (class84 var5 = (class84) this.field5868.method1909(true); var5 != null; var5 = (class84) this.field5868.method1916((byte) 113)) {
            if (var5.method638(arg2, arg0 ^ 0x20, arg1)) {
                var5.method639(arg2, arg1, arg3, (byte) -96);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 32)
    public static void method2571(byte arg0) {
        field5866 = null;
        field5870 = null;
        int var1 = -103 % ((-arg0 - 56) / 52);
        field5869 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[II)Z", line = 43)
    public final boolean method2572(int arg0, int arg1, int[] arg2, int arg3) {
        field5849++;
        if (arg1 >= -25) {
            return true;
        }
        for (class84 var5 = (class84) this.field5868.method1909(true); var5 != null; var5 = (class84) this.field5868.method1916((byte) 81)) {
            if (var5.method641(arg3, arg0, 91)) {
                var5.method640(0, arg3, arg2, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[I)Z", line = 73)
    public final boolean method2573(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg0 > -70) {
            return false;
        }
        field5850++;
        for (class84 var6 = (class84) this.field5868.method1909(true); var6 != null; var6 = (class84) this.field5868.method1916((byte) 87)) {
            if (var6.method642(arg1, (byte) 112, arg3, arg2)) {
                var6.method640(0, arg2, arg4, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 339)
    public class474(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field5860 = arg6;
        this.field5852 = arg5;
        this.field5859 = arg2;
        this.field5865 = arg0;
        this.field5862 = arg4;
        this.field5864 = arg3;
        this.field5857 = arg1;
        if (this.field5860 == 255) {
            this.field5860 = 0;
        }
        this.field5868 = new class333();
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 104)
    public static final void method2574(int arg0) {
        field5871++;
        class208.field2473 = new class385(8);
        class221.field2566 = 0;
        for (class18 var1 = (class18) class171.field2002.method1715((byte) 123); var1 != null; var1 = (class18) class171.field2002.method1712((byte) 126)) {
            var1.method112();
        }
        if (arg0 >= -71) {
            field5866 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V", line = 127)
    public final void method2575(int arg0) {
        this.field5854 = 0;
        field5855++;
        this.field5861 = arg0;
        this.field5867 = 0;
        this.field5856 = 12800;
        for (class84 var2 = (class84) this.field5868.method1909(true); var2 != null; var2 = (class84) this.field5868.method1916((byte) 91)) {
            if (var2.field1072 < this.field5856) {
                this.field5856 = var2.field1072;
            }
            if (this.field5861 > var2.field1083) {
                this.field5861 = var2.field1083;
            }
            if (this.field5867 < var2.field1082) {
                this.field5867 = var2.field1082;
            }
            if (this.field5854 < var2.field1079) {
                this.field5854 = var2.field1079;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IFIIIIIIFIFI[F)V", line = 163)
    public static final void method2576(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10, int arg11, float[] arg12) {
        int var13 = arg7 - arg3;
        int var14 = arg2 - arg11;
        field5863++;
        int var15 = arg0 - arg6;
        float var16 = arg12[2] * (float) var15 + arg12[1] * (float) var14 + arg12[0] * (float) var13;
        float var17 = arg12[5] * (float) var15 + arg12[4] * (float) var14 + arg12[3] * (float) var13;
        float var18 = arg12[8] * (float) var15 + arg12[7] * (float) var14 + arg12[6] * (float) var13;
        float var19;
        float var20;
        if (arg5 == 0) {
            var19 = arg1 + 0.5F - var18;
            var20 = arg10 + var16 + 0.5F;
        } else if (arg5 == 1) {
            var19 = arg1 + var18 + 0.5F;
            var20 = arg10 + var16 + 0.5F;
        } else if (arg5 == 2) {
            var19 = arg8 + 0.5F - var17;
            var20 = arg10 + 0.5F - var16;
        } else if (arg5 == 3) {
            var20 = arg10 + var16 + 0.5F;
            var19 = arg8 + 0.5F - var17;
        } else if (arg5 == 4) {
            var19 = arg8 + 0.5F - var17;
            var20 = arg1 + var18 + 0.5F;
        } else {
            var20 = arg1 + 0.5F - var18;
            var19 = arg8 + 0.5F - var17;
        }
        if (~arg4 == arg9) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg4 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg4 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class646.field8747 = var20;
        class417.field5338 = var19;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[I[I)V", line = 261)
    public static final void method2577(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (((var9 & var10) + var7) > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method2577(arg0, arg1, var6 - 1, arg3, arg4);
            method2577(var6 + 1, 0, arg2, arg3, arg4);
        }
        field5851++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z", line = 360)
    public final boolean method2578(int arg0, int arg1, int arg2) {
        if (arg1 < 39) {
            this.method2570((byte) -71, -50, -47, null);
        }
        field5853++;
        for (class84 var4 = (class84) this.field5868.method1909(true); var4 != null; var4 = (class84) this.field5868.method1916((byte) 99)) {
            if (var4.method641(arg0, arg2, 91)) {
                return true;
            }
        }
        return false;
    }
}
