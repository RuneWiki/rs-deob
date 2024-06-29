import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class656 {

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public int field9232;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "[B")
    private byte[] field9220;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "Lqe;")
    public static class465 field9231 = new class465(62, 10);

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    public static int field9235 = class621.method3590(1600, 4);

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "F")
    public static float field9233;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public int field9216;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public int field9217;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public int field9219;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "Lvm;")
    public class683 field9222;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "[I")
    public int[] field9225;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
    public int[] field9226;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "[I")
    public int[] field9227;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "[I")
    public int[] field9228;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "[I")
    public int[] field9230;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "[I")
    public int[] field9236;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "[Lvm;")
    public class683[] field9223;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "[[B")
    public byte[][] field9214;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "[[I")
    public int[][] field9221;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "[[I")
    public int[][] field9234;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method3693(byte arg0, String arg1, boolean arg2) {
        field9215++;
        class233.method1595(-1, arg2, arg1, -1, false);
        if (arg0 != -34) {
            method3697(25, 89, null, null);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([BI)V")
    private final void method3694(byte[] arg0, int arg1) {
        field9224++;
        class35 var3 = new class35(class565.method3296(arg0, -125));
        int var4 = var3.method273(255);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field9217 = var3.method234((byte) -99);
        } else {
            this.field9217 = 0;
        }
        int var5 = var3.method273(255);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field9219 = var3.method253(arg1 - 13900);
        int var8 = 0;
        this.field9225 = new int[this.field9219];
        int var9 = -1;
        for (int var10 = arg1; var10 < this.field9219; var10++) {
            this.field9225[var10] = var8 += var3.method253(arg1 - 13900);
            if (this.field9225[var10] > var9) {
                var9 = this.field9225[var10];
            }
        }
        this.field9216 = var9 + 1;
        if (var7) {
            this.field9214 = new byte[this.field9216][];
        }
        this.field9230 = new int[this.field9216];
        this.field9228 = new int[this.field9216];
        this.field9236 = new int[this.field9216];
        this.field9227 = new int[this.field9216];
        this.field9221 = new int[this.field9216][];
        if (var6) {
            this.field9226 = new int[this.field9216];
            for (int var11 = 0; var11 < this.field9216; var11++) {
                this.field9226[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field9219; var12++) {
                this.field9226[this.field9225[var12]] = var3.method234((byte) -116);
            }
            this.field9222 = new class683(this.field9226);
        }
        for (int var13 = 0; var13 < this.field9219; var13++) {
            this.field9230[this.field9225[var13]] = var3.method234((byte) -126);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field9219; var14++) {
                byte[] var15 = new byte[64];
                var3.method260(var15, 94, 64, 0);
                this.field9214[this.field9225[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field9219; var16++) {
            this.field9228[this.field9225[var16]] = var3.method234((byte) -116);
        }
        for (int var17 = 0; var17 < this.field9219; var17++) {
            this.field9236[this.field9225[var17]] = var3.method253(-13900);
        }
        for (int var18 = 0; var18 < this.field9219; var18++) {
            int var25 = this.field9225[var18];
            int var26 = 0;
            int var27 = this.field9236[var25];
            int var28 = -1;
            this.field9221[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field9221[var25][var29] = var26 += var3.method253(-13900);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field9227[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field9221[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field9223 = new class683[var9 + 1];
        this.field9234 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field9219; var19++) {
            int var20 = this.field9225[var19];
            int var21 = this.field9236[var20];
            this.field9234[var20] = new int[this.field9227[var20]];
            for (int var22 = 0; var22 < this.field9227[var20]; var22++) {
                this.field9234[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field9221[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field9221[var20][var23];
                }
                this.field9234[var20][var24] = var3.method234((byte) -108);
            }
            this.field9223[var20] = new class683(this.field9234[var20]);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method3695(String[] arg0, byte arg1) {
        field9213++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        int var4 = 92 / ((14 - arg1) / 59);
        return var2;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static void method3696(int arg0) {
        field9231 = null;
        if (arg0 < 66) {
            field9235 = -106;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILoea;Ljava/lang/String;)Lgn;")
    public static final class698 method3697(int arg0, int arg1, class594 arg2, String arg3) {
        field9218++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class291.field4091, arg1);
        if (class291.field4091[0] == 0) {
            if (class291.field4091[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class291.field4091, 1);
            if (class291.field4091[1] > 1) {
                byte[] var6 = new byte[class291.field4091[1]];
                OpenGL.glGetInfoLogARB(var4, class291.field4091[1], class291.field4091, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class291.field4091[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class698(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
    public static final void method3698(boolean arg0) {
        field9238++;
        class332.field4686.method674((byte) 49);
        class174.field2537.method2398((byte) -127);
        class284.field4039.method2572(3);
        class66.field1181.method129((byte) 107);
        class134.field2102.method3033((byte) 13);
        class558.field7942.method728(1);
        class698.field9806.method855(-117);
        class638.field9104.method3751((byte) 82);
        class679.field9567.method215((byte) -57);
        class99.field1677.method2369(-30410);
        class675.field9475.method1252((byte) 85);
        class93.field1631.method789(false);
        class399.field5581.method2640(false);
        class252.field3594.method963((byte) -97);
        class285.field4042.method2989((byte) 47);
        class206.field2944.method2951((byte) -123);
        class569.field8108.method3087(-39);
        class341.field4798.method959((byte) 127);
        class254.field3692.method899(-105);
        class582.field8227.method1611(8124);
        class191.method1342((byte) 90);
        class1.method2(148928876);
        class247.method1650(26911);
        class372.method2340(-21);
        class52.method471(37);
        class735.field10349.method3050(false);
        class193.field2760.method3050(arg0);
        class299.field4137.method3050(false);
        class233.field3308.method3050(false);
        class357.field5015.method3050(arg0);
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "([BI[B)V")
    public class656(byte[] arg0, int arg1, byte[] arg2) {
        this.field9232 = class31.method207(arg0.length, 0, arg0);
        if (this.field9232 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field9220 = class259.method1761(arg0.length, -5766, arg0, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field9220[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3694(arg0, 0);
    }
}
