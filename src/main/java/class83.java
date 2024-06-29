import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class83 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lnj;")
    public static class487 field958 = new class487(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "B")
    public byte field959;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "B")
    public byte field960;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "B")
    public byte field962;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "B")
    public byte field965;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "B")
    public byte field968;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "B")
    public byte field973;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "B")
    public byte field980;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "S")
    public short field963;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
    public boolean field961;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Z")
    public boolean field964;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Z")
    public boolean field966;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Z")
    public boolean field967;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Z")
    public boolean field969;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "Z")
    public boolean field972;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "Z")
    public boolean field974;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "Z")
    public boolean field975;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "Z")
    public boolean field976;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "Z")
    public boolean field979;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([BIIIIII)V", line = 32)
    public static final void method486(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field971++;
        if (arg1 > 0 && !class154.method899(arg1, arg6 - 27900)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class154.method899(arg2, 102)) {
            int var7 = class425.method2513((byte) -91, arg5);
            int var8 = 0;
            int var9 = arg2 <= arg1 ? arg2 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg2 >> 1;
            if (arg6 == 28007) {
                byte[] var12 = arg0;
                byte[] var13 = new byte[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg4, var8, arg3, arg1, arg2, 0, arg5, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg1 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; var16 < var7; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    arg1 = var10;
                    var12 = var15;
                    arg2 = var11;
                    var10 >>= 0x1;
                    var8++;
                    var11 >>= 0x1;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 134)
    public static void method487(int arg0) {
        field958 = null;
        if (arg0 < 113) {
            method488(-81, null);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)I", line = 145)
    public static final int method488(int arg0, String arg1) {
        if (arg0 >= -120) {
            method486(null, -60, 75, -91, 41, 32, 112);
        }
        field977++;
        return arg1.length() + 1;
    }
}
