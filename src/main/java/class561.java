import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class561 extends class267 implements class65 {

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    private int field8250;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    private int field8247;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    private int field8254;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "Let;")
    public static class509 field8249 = null;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "[I")
    public static int[] field8248 = new int[1];

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field8252 = 0;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "Ldn;")
    public static class438 field8251;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
    public static final void method3274(int arg0, int arg1) {
        ++field8246;
        class557 var2 = class93.method564(arg1, -14073, arg0);
        var2.method3264(-1037624096);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IC)C")
    public static final char method3275(int arg0, char arg1) {
        ++field8245;
        if (arg0 != 251) {
            field8249 = null;
        }
        if (arg1 != ' ' && arg1 != 160 && ~arg1 != -96 && ~arg1 != -46) {
            if (arg1 != '[' && arg1 != ']' && ~arg1 != -36) {
                if (~arg1 != -225 && arg1 != 225 && arg1 != 226 && ~arg1 != -229 && ~arg1 != -228 && ~arg1 != -193 && ~arg1 != -194 && ~arg1 != -195 && arg1 != 196 && ~arg1 != -196) {
                    if (~arg1 != -233 && arg1 != 233 && arg1 != 234 && ~arg1 != -236 && arg1 != 200 && ~arg1 != -202 && ~arg1 != -203 && arg1 != 203) {
                        if (~arg1 != -238 && ~arg1 != -239 && arg1 != 239 && ~arg1 != -206 && ~arg1 != -207 && ~arg1 != -208) {
                            if (arg1 != 242 && arg1 != 243 && arg1 != 244 && ~arg1 != -247 && arg1 != 245 && ~arg1 != -211 && arg1 != 211 && arg1 != 212 && ~arg1 != -215 && arg1 != 213) {
                                if (~arg1 != -250 && ~arg1 != -251 && arg1 != 251 && arg1 != 252 && ~arg1 != -218 && ~arg1 != -219 && arg1 != 219 && ~arg1 != -221) {
                                    if (arg1 != 231 && ~arg1 != -200) {
                                        if (arg1 != 255 && arg1 != 376) {
                                            if (~arg1 != -242 && arg1 != 209) {
                                                return arg1 == 223 ? 'b' : Character.toLowerCase(arg1);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg1;
            }
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ltm;Lg;III[B)V")
    public class561(class327 arg0, class135 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class160.field1932, arg2 * arg3 * arg4, false);
        this.field8250 = arg3;
        this.field8247 = arg4;
        this.field8254 = arg2;
        super.field3489.method2459(77, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3482, 0, this.method1497((byte) 76), this.field8254, this.field8250, this.field8247, 0, class354.method1986(-91, super.field3465), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method3276(byte arg0) {
        field8251 = null;
        if (arg0 != 103) {
            method3275(54, (char) 65503);
        }
        field8249 = null;
        field8248 = null;
    }
}
