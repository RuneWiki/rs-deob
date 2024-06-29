import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class468 extends class184 implements class217 {

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    private int field6430;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    private int field6436;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Z")
    public static boolean field6426 = false;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Llh;")
    public static class487 field6432 = new class487(47, 3);

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "J")
    public static long field6427;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "Lq;")
    public static class392 field6429;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "[[[B")
    public static byte[][][] field6439;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "[[[Lwg;")
    public static class390[][][] field6438;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 3)
    public static void method2642(int arg0) {
        field6432 = null;
        if (arg0 > -54) {
            method2642(12);
        }
        field6429 = null;
        field6438 = null;
        field6439 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(CI)C", line = 18)
    public static final char method2643(char arg0, int arg1) {
        ++field6433;
        if (arg1 != -30149) {
            field6439 = null;
        }
        if (~arg0 != -33 && ~arg0 != -161 && ~arg0 != -96 && ~arg0 != -46) {
            if (~arg0 != -92 && arg0 != ']' && ~arg0 != -36) {
                if (~arg0 != -225 && ~arg0 != -226 && ~arg0 != -227 && arg0 != 228 && arg0 != 227 && ~arg0 != -193 && arg0 != 193 && arg0 != 194 && ~arg0 != -197 && ~arg0 != -196) {
                    if (~arg0 != -233 && arg0 != 233 && arg0 != 234 && arg0 != 235 && arg0 != 200 && ~arg0 != -202 && arg0 != 202 && ~arg0 != -204) {
                        if (arg0 != 237 && ~arg0 != -239 && arg0 != 239 && ~arg0 != -206 && ~arg0 != -207 && ~arg0 != -208) {
                            if (~arg0 != -243 && ~arg0 != -244 && arg0 != 244 && arg0 != 246 && ~arg0 != -246 && ~arg0 != -211 && arg0 != 211 && arg0 != 212 && ~arg0 != -215 && ~arg0 != -214) {
                                if (~arg0 != -250 && ~arg0 != -251 && ~arg0 != -252 && arg0 != 252 && arg0 != 217 && arg0 != 218 && ~arg0 != -220 && ~arg0 != -221) {
                                    if (arg0 != 231 && ~arg0 != -200) {
                                        if (arg0 != 255 && ~arg0 != -377) {
                                            if (~arg0 != -242 && ~arg0 != -210) {
                                                return ~arg0 == -224 ? 'b' : Character.toLowerCase(arg0);
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
                return arg0;
            }
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILr;ILgca;)V", line = 415)
    public static final void method2644(int arg0, int arg1, class166 arg2, int arg3, class227 arg4) {
        class40.field470.method1444(-27547);
        ++field6428;
        if (!class34.field421) {
            for (class163 var5 = (class163) arg4.method1436(28964); var5 != null; var5 = (class163) arg4.method1443((byte) 6)) {
                class165 var6 = class510.field6981.method3709((byte) 126, var5.field2338);
                if (class107.method779((byte) 13, var6)) {
                    boolean var7 = class41.method361(arg0, arg2, arg3, var6, var5, true);
                    if (var7) {
                        class581.method3313(var6, arg2, arg1 + 1534, var5);
                    }
                }
            }
            if (arg1 != -1532) {
                field6438 = null;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ltba;Lpn;III[B)V", line = 449)
    public class468(class147 arg0, class692 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class309.field4271, arg2 * arg4 * arg3, false);
        this.field6434 = arg4;
        this.field6430 = arg2;
        this.field6436 = arg3;
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2661, 0, this.method1262(-117), this.field6430, this.field6436, this.field6434, 0, class216.method1395(super.field2651, (byte) -66), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V", line = 463)
    public static final void method2645(byte arg0) {
        ++field6431;
        ++class620.field8626;
        class352 var1 = class290.method1786(98, class199.field2836, class428.field5981);
        if (arg0 < 36) {
            field6429 = null;
        }
        var1.field4686.method2817(class317.method1913(1), true);
        var1.field4686.method2837(class222.field3096, -2);
        var1.field4686.method2837(class340.field4553, -2);
        var1.field4686.method2817(class366.field4875.field9347, true);
        class602.method3388(var1, (byte) 28);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;)I", line = 488)
    public static final int method2646(int arg0, String arg1) {
        ++field6435;
        if (arg0 != -193) {
            field6438 = null;
        }
        return arg1.length() - -2;
    }
}
