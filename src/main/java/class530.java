import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class530 {

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field7746;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "J")
    public static long field7745 = 0L;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Lfi;")
    public static class38 field7741 = null;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[Lsj;")
    public static class511[] field7747 = new class511[2048];

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field7748 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!rl", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field7742++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BIIBIII)V", line = 20)
    public static final void method3131(byte[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field7743++;
        if (arg2 > 0 && !class380.method2416(-1, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class380.method2416(-1, arg1)) {
            int var7 = class46.method309(arg4, (byte) -101);
            int var8 = 0;
            int var9 = arg2 < arg1 ? arg2 : arg1;
            int var10 = arg2 >> 1;
            if (arg3 < 11) {
                method3134(null, -84, null);
            }
            int var11 = arg1 >> 1;
            byte[] var12 = arg0;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg6, var8, arg5, arg2, arg1, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg1 = var11;
                arg2 = var10;
                var12 = var16;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lsj;Z)V", line = 122)
    public static final void method3132(class511 arg0, boolean arg1) {
        if (arg1) {
            field7741 = null;
        }
        field7744++;
        class491 var2 = (class491) class299.field4604.method358((byte) -123, (long) arg0.field7562);
        if (var2 == null) {
            class200.method1413(null, arg0.field7654[0], null, arg0.field1274, (byte) 116, arg0, arg0.field7653[0], 0);
        } else {
            var2.method2958(true);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V", line = 146)
    public class530(int arg0, int arg1) {
        this.field7746 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 159)
    public static void method3133(int arg0) {
        field7741 = null;
        field7747 = null;
        if (arg0 != -1) {
            field7741 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lum;ILl;)V", line = 171)
    public static final void method3134(class83 arg0, int arg1, class127 arg2) {
        class285.field4433 = arg2;
        field7740++;
        class510.field7418 = arg0;
        if (arg1 != 5706) {
            method3134(null, -91, null);
        }
    }
}
