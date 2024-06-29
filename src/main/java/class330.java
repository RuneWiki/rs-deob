import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class330 extends class744 {

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field4692 = 0;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "[I")
    public static int[] field4685 = new int[4];

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "F")
    public float field4662;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "F")
    public float field4664;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "F")
    public float field4665;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "F")
    public float field4669;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "F")
    public float field4673;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "F")
    public float field4676;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "F")
    public float field4677;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "F")
    public float field4683;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "F")
    public float field4687;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "F")
    public float field4689;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "F")
    public float field4691;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "F")
    public float field4694;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public static int field4693;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bg", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field4695;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2121(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()Lih;", line = 11)
    public final class744 method906() {
        field4690++;
        class330 var1 = new class330();
        var1.field4683 = this.field4683;
        var1.field4669 = this.field4669;
        var1.field4662 = this.field4662;
        var1.field4689 = this.field4689;
        var1.field4673 = this.field4673;
        var1.field4677 = this.field4677;
        var1.field4664 = this.field4664;
        var1.field4676 = this.field4676;
        var1.field4665 = this.field4665;
        var1.field4687 = this.field4687;
        var1.field4691 = this.field4691;
        var1.field4694 = this.field4694;
        return var1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lih;)V", line = 35)
    public final void method900(class744 arg0) {
        field4678++;
        class330 var2 = (class330) arg0;
        this.field4676 = var2.field4676;
        this.field4683 = var2.field4683;
        this.field4662 = var2.field4662;
        this.field4687 = var2.field4687;
        this.field4669 = var2.field4669;
        this.field4677 = var2.field4677;
        this.field4694 = var2.field4694;
        this.field4691 = var2.field4691;
        this.field4689 = var2.field4689;
        this.field4664 = var2.field4664;
        this.field4665 = var2.field4665;
        this.field4673 = var2.field4673;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 58)
    public final void method890(int arg0) {
        field4680++;
        float var2 = class329.field4655[arg0 & 0x3FFF];
        float var3 = class329.field4659[arg0 & 0x3FFF];
        float var4 = this.field4683;
        float var5 = this.field4691;
        float var6 = this.field4689;
        this.field4683 = this.field4676 * var3 + var2 * var4;
        float var7 = this.field4665;
        this.field4676 = this.field4676 * var2 - (var3 * var4);
        this.field4691 = this.field4673 * var3 + var2 * var5;
        this.field4673 = this.field4673 * var2 - var3 * var5;
        this.field4689 = this.field4687 * var3 + var2 * var6;
        this.field4687 = this.field4687 * var2 - (var3 * var6);
        this.field4665 = this.field4677 * var3 + var2 * var7;
        this.field4677 = this.field4677 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()V", line = 94)
    public final void method889() {
        this.field4664 = this.field4676 = this.field4691 = this.field4673 = this.field4689 = this.field4662 = this.field4665 = this.field4669 = this.field4677 = 0.0F;
        field4679++;
        this.field4683 = this.field4694 = this.field4687 = 1.0F;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III[I)V", line = 103)
    public final void method881(int arg0, int arg1, int arg2, int[] arg3) {
        field4675++;
        arg3[1] = (int) ((float) arg2 * this.field4662 + (float) arg0 * this.field4664 + (float) arg1 * this.field4694 + this.field4669);
        arg3[2] = (int) ((float) arg2 * this.field4687 + (float) arg0 * this.field4676 + (float) arg1 * this.field4673 + this.field4677);
        arg3[0] = (int) ((float) arg2 * this.field4689 + (float) arg0 * this.field4683 + (float) arg1 * this.field4691 + this.field4665);
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V", line = 116)
    public final void method898(int arg0) {
        field4668++;
        float var2 = class329.field4655[arg0 & 0x3FFF];
        float var3 = class329.field4659[arg0 & 0x3FFF];
        float var4 = this.field4683;
        float var5 = this.field4691;
        float var6 = this.field4689;
        this.field4683 = var2 * var4 - this.field4664 * var3;
        float var7 = this.field4665;
        this.field4691 = var2 * var5 - this.field4694 * var3;
        this.field4664 = this.field4664 * var2 + var3 * var4;
        this.field4694 = this.field4694 * var2 + var3 * var5;
        this.field4689 = var2 * var6 - (this.field4662 * var3);
        this.field4662 = this.field4662 * var2 + var3 * var6;
        this.field4665 = var2 * var7 - this.field4669 * var3;
        this.field4669 = this.field4669 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V", line = 145)
    public final void method895(int arg0) {
        this.field4694 = 1.0F;
        field4671++;
        this.field4683 = this.field4687 = class329.field4655[arg0 & 0x3FFF];
        this.field4689 = class329.field4659[arg0 & 0x3FFF];
        this.field4676 = -this.field4689;
        this.field4691 = this.field4665 = this.field4664 = this.field4662 = this.field4669 = this.field4673 = this.field4677 = 0.0F;
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V", line = 166)
    public final void method902(int arg0) {
        field4670++;
        float var2 = class329.field4655[arg0 & 0x3FFF];
        float var3 = class329.field4659[arg0 & 0x3FFF];
        float var4 = this.field4664;
        float var5 = this.field4694;
        float var6 = this.field4662;
        this.field4664 = var2 * var4 - this.field4676 * var3;
        float var7 = this.field4669;
        this.field4676 = this.field4676 * var2 + var3 * var4;
        this.field4694 = var2 * var5 - (this.field4673 * var3);
        this.field4673 = this.field4673 * var2 + var3 * var5;
        this.field4662 = var2 * var6 - this.field4687 * var3;
        this.field4669 = var2 * var7 - this.field4677 * var3;
        this.field4687 = this.field4687 * var2 + var3 * var6;
        this.field4677 = this.field4677 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILiha;)Z", line = 195)
    public static final boolean method2117(int arg0, class613 arg1) {
        field4684++;
        if (arg0 == 2) {
            return arg1 == null ? false : class450.method2756(1820, arg1.field8246 - arg1.field8247, -arg1.field8237 + arg1.field8240, arg1.field8238, arg1.field8242 - arg1.field8238, arg1.field8237, arg1.field8247);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZILjava/io/File;)V", line = 211)
    public static final void method2118(boolean arg0, int arg1, File arg2) {
        field4672++;
        if (class465.field6471 == null) {
            class165.method1022(false);
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field4695 == null ? (field4695 = method2121("java.lang.String")) : field4695, Boolean.TYPE);
            var4.invoke(class465.field6471, arg2.getAbsolutePath(), Boolean.valueOf(arg0));
        } catch (Exception var7) {
            System.out.println("HeapDump error:");
            var7.printStackTrace();
        }
        int var6 = 50 / ((arg1 - 47) / 43);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V", line = 236)
    public final void method882(int arg0, int arg1, int arg2) {
        this.field4665 += arg0;
        field4681++;
        this.field4669 += arg1;
        this.field4677 += arg2;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(III[I)V", line = 247)
    public final void method907(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4687 + (float) arg0 * this.field4676 + (float) arg1 * this.field4673);
        arg3[1] = (int) ((float) arg2 * this.field4662 + (float) arg0 * this.field4664 + (float) arg1 * this.field4694);
        field4693++;
        arg3[0] = (int) ((float) arg2 * this.field4689 + (float) arg0 * this.field4683 + (float) arg1 * this.field4691);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ltga;I[[B)V", line = 258)
    public static final void method2119(class258 arg0, int arg1, byte[][] arg2) {
        field4666++;
        if (arg1 < 93) {
            field4692 = 86;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field5487; var4++) {
            class11.method51(-81);
            for (int var9 = 0; var9 < class277.field4036 >> 3; var9++) {
                for (int var10 = 0; var10 < class667.field9202 >> 3; var10++) {
                    int var11 = class96.field1364[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = var11 >> 24 & 0x3;
                        if (!arg0.field5485 || var12 == 0) {
                            int var13 = var11 >> 1 & 0x3;
                            int var14 = (var11 & 0xFFCD88) >> 14;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class316.field4364.length; var17++) {
                                if (class316.field4364[var17] == var16 && arg2[var17] != null) {
                                    class63 var18 = new class63(arg2[var17]);
                                    arg0.method2390(var18, var14, var13, (byte) -106, class209.field2735, var9 * 8, var15, var12, var10 * 8, var4);
                                    arg0.method1744(var10 * 8, var4, var3[0] == -1 ? var3 : null, -2340, var18, var13, var9 * 8, class129.field1802, var15, var14, var12);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg0.field5487; var5++) {
            class11.method51(127);
            for (int var6 = 0; var6 < (class277.field4036 >> 3); var6++) {
                for (int var7 = 0; var7 < (class667.field9202 >> 3); var7++) {
                    int var8 = class96.field1364[var5][var6][var7];
                    if (var8 == -1) {
                        arg0.method2401(var7 * 8, 8, 8, var6 * 8, var5, 21513);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class359.field5138 = class463.field6453.method3339(var3[1], class560.field7796, var3[2], (byte) -107, var3[0], var3[3]);
            class456.field6323 = var3[4];
        }
    }

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "(I)V", line = 374)
    public static void method2120(int arg0) {
        if (arg0 != 8) {
            method2117(-126, null);
        }
        field4685 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 384)
    public final void method896(int arg0) {
        this.field4687 = 1.0F;
        field4686++;
        this.field4683 = this.field4694 = class329.field4655[arg0 & 0x3FFF];
        this.field4664 = class329.field4659[arg0 & 0x3FFF];
        this.field4691 = -this.field4664;
        this.field4689 = this.field4665 = this.field4662 = this.field4669 = this.field4676 = this.field4673 = this.field4677 = 0.0F;
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V", line = 396)
    public final void method880(int arg0) {
        field4663++;
        this.field4683 = 1.0F;
        this.field4694 = this.field4687 = class329.field4655[arg0 & 0x3FFF];
        this.field4673 = class329.field4659[arg0 & 0x3FFF];
        this.field4662 = -this.field4673;
        this.field4691 = this.field4689 = this.field4665 = this.field4664 = this.field4669 = this.field4676 = this.field4677 = 0.0F;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII)V", line = 418)
    public final void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4667++;
        float var7 = class329.field4655[arg3 & 0x3FFF];
        float var8 = class329.field4659[arg3 & 0x3FFF];
        float var9 = class329.field4655[arg4 & 0x3FFF];
        float var10 = class329.field4659[arg4 & 0x3FFF];
        float var11 = class329.field4655[arg5 & 0x3FFF];
        float var12 = class329.field4659[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4689 = -var10 * var11 + var9 * var14;
        this.field4664 = -var9 * var12 + var10 * var13;
        this.field4691 = var7 * var12;
        this.field4694 = var7 * var11;
        this.field4662 = var9 * var13 + var10 * var12;
        this.field4683 = var9 * var11 + var10 * var14;
        this.field4673 = -var8;
        this.field4687 = var7 * var9;
        this.field4676 = var7 * var10;
        this.field4669 = (float) (-arg0) * this.field4664 - ((float) arg1 * this.field4694) - (float) arg2 * this.field4662;
        this.field4665 = (float) (-arg0) * this.field4683 - (float) arg1 * this.field4691 - ((float) arg2 * this.field4689);
        this.field4677 = (float) (-arg0) * this.field4676 - (float) arg1 * this.field4673 - ((float) arg2 * this.field4687);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V", line = 454)
    public final void method905(int arg0, int arg1, int arg2) {
        this.field4665 = arg0;
        this.field4683 = this.field4694 = this.field4687 = 1.0F;
        this.field4669 = arg1;
        this.field4677 = arg2;
        field4674++;
        this.field4664 = this.field4676 = this.field4691 = this.field4673 = this.field4689 = this.field4662 = 0.0F;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(III[I)V", line = 467)
    public final void method899(int arg0, int arg1, int arg2, int[] arg3) {
        field4682++;
        int var5 = (int) ((float) arg0 - this.field4665);
        int var6 = (int) ((float) arg1 - this.field4669);
        int var7 = (int) ((float) arg2 - this.field4677);
        arg3[0] = (int) ((float) var7 * this.field4676 + (float) var5 * this.field4683 + (float) var6 * this.field4664);
        arg3[1] = (int) ((float) var7 * this.field4673 + (float) var5 * this.field4691 + (float) var6 * this.field4694);
        arg3[2] = (int) ((float) var7 * this.field4687 + (float) var5 * this.field4689 + (float) var6 * this.field4662);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([I)V", line = 489)
    public final void method894(int[] arg0) {
        field4688++;
        float var2 = (float) arg0[0] - this.field4665;
        float var3 = (float) arg0[1] - this.field4669;
        float var4 = (float) arg0[2] - this.field4677;
        arg0[1] = (int) (this.field4673 * var4 + this.field4694 * var3 + this.field4691 * var2);
        arg0[0] = (int) (this.field4676 * var4 + this.field4683 * var2 + this.field4664 * var3);
        arg0[2] = (int) (this.field4687 * var4 + this.field4689 * var2 + this.field4662 * var3);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 507)
    public class330() {
        this.method889();
    }
}
