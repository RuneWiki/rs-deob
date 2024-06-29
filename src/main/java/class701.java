import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class701 extends class397 {

    @OriginalMember(owner = "client!hda", name = "B", descriptor = "[I")
    public static int[] field9876 = new int[2];

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "F")
    public float field9856;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "F")
    public float field9858;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "F")
    public float field9860;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "F")
    public float field9861;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "F")
    public float field9863;

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "F")
    public float field9868;

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "F")
    public float field9874;

    @OriginalMember(owner = "client!hda", name = "D", descriptor = "F")
    public float field9878;

    @OriginalMember(owner = "client!hda", name = "G", descriptor = "F")
    public float field9881;

    @OriginalMember(owner = "client!hda", name = "J", descriptor = "F")
    public float field9883;

    @OriginalMember(owner = "client!hda", name = "K", descriptor = "F")
    public float field9884;

    @OriginalMember(owner = "client!hda", name = "N", descriptor = "F")
    public float field9887;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!hda", name = "x", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!hda", name = "A", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!hda", name = "C", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!hda", name = "E", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!hda", name = "F", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!hda", name = "H", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!hda", name = "L", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!hda", name = "M", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!hda", name = "O", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!hda", name = "P", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)[F")
    public final float[] method3875(boolean arg0) {
        class511.field6823[0] = this.field9878;
        class511.field6823[9] = this.field9861;
        if (!arg0) {
            this.method557(104, 95, -39, 101, 50, -84);
        }
        class511.field6823[14] = this.field9868;
        field9864++;
        class511.field6823[10] = this.field9883;
        class511.field6823[4] = this.field9881;
        class511.field6823[1] = this.field9887;
        class511.field6823[12] = this.field9874;
        class511.field6823[2] = this.field9856;
        class511.field6823[5] = this.field9884;
        class511.field6823[8] = this.field9860;
        class511.field6823[13] = this.field9863;
        class511.field6823[6] = this.field9858;
        return class511.field6823;
    }

    @OriginalMember(owner = "client!hda", name = "la", descriptor = "(Lq;)V")
    public final void method560(class397 arg0) {
        field9882++;
        class701 var2 = (class701) arg0;
        this.field9863 = var2.field9863;
        this.field9874 = var2.field9874;
        this.field9883 = var2.field9883;
        this.field9856 = var2.field9856;
        this.field9860 = var2.field9860;
        this.field9878 = var2.field9878;
        this.field9881 = var2.field9881;
        this.field9884 = var2.field9884;
        this.field9887 = var2.field9887;
        this.field9858 = var2.field9858;
        this.field9861 = var2.field9861;
        this.field9868 = var2.field9868;
    }

    @OriginalMember(owner = "client!hda", name = "S", descriptor = "(I)V")
    public final void method555(int arg0) {
        field9888++;
        float var2 = class326.field4506[arg0 & 0x3FFF];
        float var3 = class326.field4507[arg0 & 0x3FFF];
        float var4 = this.field9887;
        float var5 = this.field9884;
        float var6 = this.field9861;
        float var7 = this.field9863;
        this.field9887 = var2 * var4 - (this.field9856 * var3);
        this.field9884 = var2 * var5 - this.field9858 * var3;
        this.field9856 = this.field9856 * var2 + var3 * var4;
        this.field9861 = var2 * var6 - this.field9883 * var3;
        this.field9858 = this.field9858 * var2 + var3 * var5;
        this.field9863 = var2 * var7 - (this.field9868 * var3);
        this.field9883 = this.field9883 * var2 + var3 * var6;
        this.field9868 = this.field9868 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hda", name = "O", descriptor = "([I)V")
    public final void method569(int[] arg0) {
        field9872++;
        float var2 = (float) arg0[0] - this.field9874;
        float var3 = (float) arg0[1] - this.field9863;
        float var4 = (float) arg0[2] - this.field9868;
        arg0[0] = (int) (this.field9856 * var4 + this.field9887 * var3 + this.field9878 * var2);
        arg0[2] = (int) (this.field9883 * var4 + this.field9861 * var3 + this.field9860 * var2);
        arg0[1] = (int) (this.field9858 * var4 + this.field9884 * var3 + this.field9881 * var2);
    }

    @OriginalMember(owner = "client!hda", name = "XA", descriptor = "(I)V")
    public final void method586(int arg0) {
        this.field9878 = 1.0F;
        field9869++;
        this.field9884 = this.field9883 = class326.field4506[arg0 & 0x3FFF];
        this.field9858 = class326.field4507[arg0 & 0x3FFF];
        this.field9881 = this.field9860 = this.field9874 = this.field9887 = this.field9863 = this.field9856 = this.field9868 = 0.0F;
        this.field9861 = -this.field9858;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIFFFI)V")
    public final void method3876(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6) {
        field9862++;
        if (arg6 == 0) {
            this.field9883 = 1.0F;
            this.field9884 = arg1;
            this.field9887 = this.field9856 = this.field9881 = this.field9858 = this.field9860 = this.field9861 = 0.0F;
            this.field9878 = arg2;
        } else {
            float var8 = class326.field4506[arg6 & 0x3FFF];
            float var9 = class326.field4507[arg6 & 0x3FFF];
            this.field9887 = (float) arg2 * var9;
            this.field9883 = 1.0F;
            this.field9878 = (float) arg2 * var8;
            this.field9856 = this.field9858 = this.field9860 = this.field9861 = 0.0F;
            this.field9881 = (float) arg1 * -var9;
            this.field9884 = (float) arg1 * var8;
        }
        if (arg0 == 16383) {
            this.field9863 = arg5;
            this.field9868 = arg3;
            this.field9874 = arg4;
        }
    }

    @OriginalMember(owner = "client!hda", name = "Y", descriptor = "()V")
    public final void method580() {
        this.field9887 = this.field9856 = this.field9881 = this.field9858 = this.field9860 = this.field9861 = this.field9874 = this.field9863 = this.field9868 = 0.0F;
        this.field9878 = this.field9884 = this.field9883 = 1.0F;
        field9886++;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(III[I)V")
    public final void method579(int arg0, int arg1, int arg2, int[] arg3) {
        field9885++;
        arg3[1] = (int) ((float) arg2 * this.field9861 + (float) arg0 * this.field9887 + (float) arg1 * this.field9884 + this.field9863);
        arg3[2] = (int) ((float) arg2 * this.field9883 + (float) arg0 * this.field9856 + (float) arg1 * this.field9858 + this.field9868);
        arg3[0] = (int) ((float) arg2 * this.field9860 + (float) arg0 * this.field9878 + (float) arg1 * this.field9881 + this.field9874);
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)[F")
    public final float[] method3877(byte arg0) {
        class511.field6823[5] = this.field9884;
        class511.field6823[4] = this.field9881;
        if (arg0 <= 87) {
            return null;
        }
        class511.field6823[6] = this.field9858;
        class511.field6823[8] = this.field9860;
        class511.field6823[10] = this.field9883;
        class511.field6823[14] = 0.0F;
        class511.field6823[2] = this.field9856;
        class511.field6823[0] = this.field9878;
        class511.field6823[1] = this.field9887;
        class511.field6823[9] = this.field9861;
        class511.field6823[12] = 0.0F;
        class511.field6823[13] = 0.0F;
        field9875++;
        return class511.field6823;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public final void method572(int arg0) {
        field9859++;
        this.field9884 = 1.0F;
        this.field9878 = this.field9883 = class326.field4506[arg0 & 0x3FFF];
        this.field9860 = class326.field4507[arg0 & 0x3FFF];
        this.field9881 = this.field9874 = this.field9887 = this.field9861 = this.field9863 = this.field9858 = this.field9868 = 0.0F;
        this.field9856 = -this.field9860;
    }

    @OriginalMember(owner = "client!hda", name = "R", descriptor = "(III[I)V")
    public final void method565(int arg0, int arg1, int arg2, int[] arg3) {
        field9871++;
        arg3[2] = (int) ((float) arg2 * this.field9883 + (float) arg0 * this.field9856 + (float) arg1 * this.field9858);
        arg3[0] = (int) ((float) arg2 * this.field9860 + (float) arg0 * this.field9878 + (float) arg1 * this.field9881);
        arg3[1] = (int) ((float) arg2 * this.field9861 + (float) arg0 * this.field9887 + (float) arg1 * this.field9884);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lq;I)V")
    public final void method3878(class397 arg0, int arg1) {
        field9857++;
        class701 var3 = (class701) arg0;
        this.field9878 = var3.field9878;
        this.field9881 = var3.field9887;
        this.field9860 = var3.field9856;
        this.field9887 = var3.field9881;
        this.field9861 = var3.field9858;
        this.field9856 = var3.field9860;
        this.field9884 = var3.field9884;
        this.field9858 = var3.field9861;
        this.field9874 = -(this.field9860 * var3.field9868 + this.field9881 * var3.field9863 + this.field9878 * var3.field9874);
        this.field9883 = var3.field9883;
        this.field9863 = -(this.field9861 * var3.field9868 + this.field9887 * var3.field9874 + this.field9884 * var3.field9863);
        this.field9868 = -(this.field9883 * var3.field9868 + this.field9858 * var3.field9863 + this.field9856 * var3.field9874);
        if (arg1 >= -92) {
            this.field9856 = -0.997601F;
        }
    }

    @OriginalMember(owner = "client!hda", name = "ra", descriptor = "(I)V")
    public final void method573(int arg0) {
        this.field9883 = 1.0F;
        field9855++;
        this.field9878 = this.field9884 = class326.field4506[arg0 & 0x3FFF];
        this.field9887 = class326.field4507[arg0 & 0x3FFF];
        this.field9860 = this.field9874 = this.field9861 = this.field9863 = this.field9856 = this.field9858 = this.field9868 = 0.0F;
        this.field9881 = -this.field9887;
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)V")
    public static void method3879(int arg0) {
        field9876 = null;
        if (arg0 <= 48) {
            method3880(17, (byte) 123, 65, -3, null);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBIILqd;)V")
    public static final void method3880(int arg0, byte arg1, int arg2, int arg3, class418 arg4) {
        field9866++;
        long var5 = (long) (arg0 | arg2 << 14 | arg3 << 28);
        class354 var7 = (class354) class262.field3643.method2918(var5, (byte) -11);
        if (arg1 <= 56) {
            return;
        }
        if (var7 == null) {
            class354 var8 = new class354();
            class262.field3643.method2911(var5, var8, (byte) -28);
            var8.field4816.method3265(arg4, (byte) -117);
            return;
        }
        class577 var9 = class193.field2826.method1047(arg4.field5719, -1);
        int var10 = var9.field7689;
        if (var9.field7635 == 1) {
            var10 = (arg4.field5720 + 1) * var10;
        }
        for (class418 var11 = (class418) var7.field4816.method3257(-115); var11 != null; var11 = (class418) var7.field4816.method3263((byte) -114)) {
            class577 var12 = class193.field2826.method1047(var11.field5719, -1);
            int var13 = var12.field7689;
            if (var12.field7635 == 1) {
                var13 = (var11.field5720 + 1) * var13;
            }
            if (var10 > var13) {
                class95.method745((byte) -82, var11, arg4);
                return;
            }
        }
        var7.field4816.method3265(arg4, (byte) -83);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lae;IIZILae;Z)I")
    public static final int method3881(class233 arg0, int arg1, int arg2, boolean arg3, int arg4, class233 arg5, boolean arg6) {
        field9870++;
        int var7 = class543.method3000(arg0, arg3, arg2, arg5, arg1);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class543.method3000(arg0, arg6, 0, arg5, arg4);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!hda", name = "P", descriptor = "(I)V")
    public final void method570(int arg0) {
        field9880++;
        float var2 = class326.field4506[arg0 & 0x3FFF];
        float var3 = class326.field4507[arg0 & 0x3FFF];
        float var4 = this.field9878;
        float var5 = this.field9881;
        float var6 = this.field9860;
        this.field9878 = this.field9856 * var3 + var2 * var4;
        float var7 = this.field9874;
        this.field9881 = this.field9858 * var3 + var2 * var5;
        this.field9856 = this.field9856 * var2 - var3 * var4;
        this.field9858 = this.field9858 * var2 - var3 * var5;
        this.field9860 = this.field9883 * var3 + var2 * var6;
        this.field9883 = this.field9883 * var2 - var3 * var6;
        this.field9874 = this.field9868 * var3 + var2 * var7;
        this.field9868 = this.field9868 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "([BB)Ljava/lang/String;")
    public static final String method3882(byte[] arg0, byte arg1) {
        int var2 = 21 / ((arg1 + 37) / 32);
        field9889++;
        int var3 = arg0.length;
        char[] var4 = new char[var3];
        int var5 = 0;
        for (int var6 = 0; var6 < var3; var6++) {
            int var7 = arg0[var6] & 0xFF;
            if (var7 < 128) {
                var4[var5++] = (char) var7;
            } else if (var7 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var7);
            } else if (var7 >= 224) {
                if (var7 >= 240) {
                    if (var7 >= 244) {
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var7);
                    }
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
                if (var3 <= var6 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var6++;
                int var8 = arg0[var6] & 0xFF;
                if (var8 < 128 || var8 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var6++;
                int var9 = arg0[var6] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class220.method1393(class571.method3139(-129, var9), class220.method1393(class571.method3139(var8 << 6, -8256), class571.method3139(-225, var7) << 12));
            } else if (var6 + 1 < var3) {
                var6++;
                int var10 = arg0[var6] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class220.method1393(class571.method3139(var7, -193) << 6, class571.method3139(-129, var10));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!hda", name = "pa", descriptor = "(IIIIII)V")
    public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9877++;
        float var7 = class326.field4506[arg3 & 0x3FFF];
        float var8 = class326.field4507[arg3 & 0x3FFF];
        float var9 = class326.field4506[arg4 & 0x3FFF];
        float var10 = class326.field4507[arg4 & 0x3FFF];
        float var11 = class326.field4506[arg5 & 0x3FFF];
        float var12 = class326.field4507[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field9887 = -var9 * var12 + var10 * var13;
        this.field9856 = var7 * var10;
        this.field9860 = -var10 * var11 + var9 * var14;
        this.field9884 = var7 * var11;
        this.field9861 = var9 * var13 + var10 * var12;
        this.field9883 = var7 * var9;
        this.field9881 = var7 * var12;
        this.field9878 = var9 * var11 + var10 * var14;
        this.field9858 = -var8;
        this.field9868 = (float) (-arg0) * this.field9856 - ((float) arg1 * this.field9858) - ((float) arg2 * this.field9883);
        this.field9874 = (float) (-arg0) * this.field9878 - ((float) arg1 * this.field9881) - (float) arg2 * this.field9860;
        this.field9863 = (float) (-arg0) * this.field9887 - ((float) arg1 * this.field9884) - (float) arg2 * this.field9861;
    }

    @OriginalMember(owner = "client!hda", name = "G", descriptor = "(III)V")
    public final void method571(int arg0, int arg1, int arg2) {
        this.field9863 += arg1;
        this.field9868 += arg2;
        this.field9874 += arg0;
        field9873++;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIZ[B)[B")
    public static final byte[] method3883(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (!arg2) {
            return null;
        }
        field9879++;
        byte[] var4;
        if (arg0 <= 0) {
            var4 = arg3;
        } else {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg3[arg0 + var5];
            }
        }
        class528 var6 = new class528();
        var6.method2951(120);
        var6.method2949((byte) -88, (long) (arg1 * 8), var4);
        byte[] var7 = new byte[64];
        var6.method2950(-100, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
    public class701() {
        this.method580();
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lq;")
    public final class397 method587() {
        field9867++;
        class701 var1 = new class701();
        var1.field9881 = this.field9881;
        var1.field9868 = this.field9868;
        var1.field9863 = this.field9863;
        var1.field9878 = this.field9878;
        var1.field9858 = this.field9858;
        var1.field9860 = this.field9860;
        var1.field9856 = this.field9856;
        var1.field9861 = this.field9861;
        var1.field9887 = this.field9887;
        var1.field9884 = this.field9884;
        var1.field9874 = this.field9874;
        var1.field9883 = this.field9883;
        return var1;
    }

    @OriginalMember(owner = "client!hda", name = "GA", descriptor = "(III)V")
    public final void method576(int arg0, int arg1, int arg2) {
        this.field9863 = arg1;
        this.field9868 = arg2;
        field9865++;
        this.field9887 = this.field9856 = this.field9881 = this.field9858 = this.field9860 = this.field9861 = 0.0F;
        this.field9874 = arg0;
        this.field9878 = this.field9884 = this.field9883 = 1.0F;
    }
}
