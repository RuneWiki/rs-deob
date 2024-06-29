import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class670 extends class493 implements class187 {

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    private int field9435;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    private int field9441;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
    private int field9437;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "Lje;")
    public static class265 field9432 = new class265();

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "[I")
    public static int[] field9440 = new int[6];

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "[Z")
    public static boolean[] field9442 = new boolean[100];

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "Lrga;")
    public static class280 field9436 = new class280(30, 3);

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "[I")
    public static int[] field9443 = new int[3];

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
    public static final boolean method3761(int arg0, int arg1, int arg2) {
        ++field9439;
        return arg2 > -12 ? false : (class491.method2644(arg1, 116, arg0) | (arg0 & 8192) != 0 | class680.method3829(arg1, 85, arg0)) & class31.method209(arg1, 55, arg0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method3762(byte arg0) {
        field9436 = null;
        if (arg0 != -80) {
            method3761(91, -48, -89);
        }
        field9440 = null;
        field9442 = null;
        field9432 = null;
        field9443 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BB)C")
    public static final char method3763(byte arg0, byte arg1) {
        ++field9434;
        if (arg0 <= 22) {
            return (char) 65419;
        } else {
            int var2 = arg1 & 255;
            if (var2 == 0) {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
            } else {
                if (var2 >= 128 && var2 < 160) {
                    char var3 = class286.field3555[var2 + -128];
                    if (~var3 == -1) {
                        var3 = '?';
                    }
                    var2 = var3;
                }
                return (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    public static final void method3764(int arg0) {
        if (arg0 == -8234) {
            class84.field1188 = false;
            ++field9438;
            class51.method328(class672.field9461, class88.field1231, class50.field720, (byte) 31, class219.field2680);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Llm;Lec;III[B)V")
    public class670(class337 arg0, class146 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class117.field1509, arg2 * arg3 * arg4, false);
        this.field9435 = arg3;
        this.field9441 = arg4;
        this.field9437 = arg2;
        super.field6502.method2596(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6519, 0, this.method2658(26701), this.field9437, this.field9435, this.field9441, 0, class488.method2639(6407, super.field6513), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;I[B)I")
    public static final int method3765(int arg0, String arg1, int arg2, byte[] arg3) {
        ++field9433;
        int var4 = arg2;
        int var5 = arg1.length();
        if (arg0 != -1) {
            return 60;
        } else {
            for (int var6 = 0; var5 > var6; var6 += 4) {
                int var7 = class502.method2702(-1, arg1.charAt(var6));
                int var8 = var6 + 1 >= var5 ? -1 : class502.method2702(-1, arg1.charAt(var6 - -1));
                int var9 = var5 > var6 - -2 ? class502.method2702(-1, arg1.charAt(var6 - -2)) : -1;
                int var10 = ~(var6 + 3) > ~var5 ? class502.method2702(arg0, arg1.charAt(var6 + 3)) : -1;
                arg3[arg2++] = (byte) class444.method2376(var8 >>> 4, var7 << 2);
                if (~var9 == 0) {
                    break;
                }
                arg3[arg2++] = (byte) class444.method2376(class695.method3921(var8 << 4, 240), var9 >>> 2);
                if (var10 == -1) {
                    break;
                }
                arg3[arg2++] = (byte) class444.method2376(class695.method3921(var9 << 6, 192), var10);
            }
            return -var4 + arg2;
        }
    }
}
