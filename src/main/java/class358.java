import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class358 extends class646 {

    @OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
    private int field4996 = 0;

    @OriginalMember(owner = "client!eaa", name = "R", descriptor = "I")
    private int field5003 = 20;

    @OriginalMember(owner = "client!eaa", name = "L", descriptor = "I")
    private int field4997 = 1365;

    @OriginalMember(owner = "client!eaa", name = "T", descriptor = "I")
    private int field5005 = 0;

    @OriginalMember(owner = "client!eaa", name = "P", descriptor = "[[I")
    public static int[][] field5001 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!eaa", name = "M", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!eaa", name = "Q", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!eaa", name = "S", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!eaa", name = "N", descriptor = "Lkga;")
    public static class520 field4999;

    @OriginalMember(owner = "client!eaa", name = "O", descriptor = "[Lhda;")
    public static class635[] field5000;

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V", line = 4)
    public class358() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V", line = 15)
    public static final void method2159(int arg0) {
        ++field5002;
        if (!class224.field3359) {
            if (arg0 != -128) {
                method2161(90, (class189[]) null, (class382) null);
            }
            class224.field3359 = true;
            if (class525.field7713.field5977) {
                class473.field6790 = (float) (-128 & (int) class473.field6790 + -65);
            } else {
                class677.field9647 += (-class677.field9647 + -24.0F) / 2.0F;
            }
            class406.field5822 = true;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "(I)V", line = 40)
    public static void method2160(int arg0) {
        if (arg0 == 18250) {
            field4999 = null;
            field5000 = null;
            field5001 = null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lek;IB)V", line = 61)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field4998;
        if (arg2 >= 7) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 == 3) {
                            this.field5005 = arg0.method2755((byte) -85);
                        }
                    } else {
                        this.field4996 = arg0.method2755((byte) -84);
                    }
                } else {
                    this.field5003 = arg0.method2755((byte) -82);
                }
            } else {
                this.field4997 = arg0.method2755((byte) -86);
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I[Lafa;Lkfa;)Lqn;", line = 113)
    public static final class476 method2161(int arg0, class189[] arg1, class382 arg2) {
        ++field4995;
        for (int var3 = 0; arg1.length > var3; ++var3) {
            if (arg1[var3] == null || arg1[var3].field2962 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = arg0; arg1.length > var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field2962);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class664.field9338, 0);
        if (class664.field9338[0] == 0) {
            if (class664.field9338[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class664.field9338, 1);
            if (~class664.field9338[1] < -2) {
                byte[] var7 = new byte[class664.field9338[1]];
                OpenGL.glGetInfoLogARB(var4, class664.field9338[1], class664.field9338, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class664.field9338[0] == -1) {
                for (int var8 = 0; var8 < arg1.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field2962);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class476(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(IB)[I", line = 188)
    public final int[] method424(int arg0, byte arg1) {
        ++field5004;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            for (int var4 = 0; ~var4 > ~class89.field1330; ++var4) {
                int var5 = (class518.field7652[var4] << 12) / this.field4997 + this.field4996;
                int var6 = (class78.field1195[arg0] << 12) / this.field4997 - -this.field5005;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field5003 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 - -var7;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field5003 - 1) < ~var13 ? (var13 << 12) / this.field5003 : 0;
            }
        }
        if (arg1 != -120) {
            this.method424(125, (byte) 29);
        }
        return var3;
    }
}
