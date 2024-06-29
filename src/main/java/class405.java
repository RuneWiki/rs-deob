import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class405 extends class371 {

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Lgo;")
    public static class441 field6111 = new class441(6, 0, 4, 2);

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Lri;")
    public static class73 field6116 = new class73(30, 2);

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field6118 = 0;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field6120 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field6121 = 0;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "Lvp;")
    public static class123 field6119 = new class123();

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public int field6110;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public int field6112;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public int field6117;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Ler;")
    public class68 field6109;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[Lvk;")
    public class247[] field6108;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lid;Lid;ZII)I", line = 4)
    public static final int method2435(class412 arg0, class412 arg1, boolean arg2, int arg3, int arg4) {
        field6113++;
        if (arg4 == 1) {
            int var5 = arg1.field888;
            int var6 = arg0.field888;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class513.method3030(class143.field2137, (byte) 122, arg0.method2480(23093).field2154, arg1.method2480(23093).field2154);
        } else if (arg4 != 3) {
            if (arg3 > -36) {
                field6116 = null;
            }
            if (arg4 == 4) {
                if (arg1.method352(-7813)) {
                    return arg0.method352(-7813) ? 0 : 1;
                } else if (arg0.method352(-7813)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 5) {
                if (arg1.method353(93)) {
                    return arg0.method353(110) ? 0 : 1;
                } else if (arg0.method353(35)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 6) {
                if (arg1.method356((byte) -101)) {
                    return arg0.method356((byte) -96) ? 0 : 1;
                } else if (arg0.method356((byte) -79)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 7) {
                if (arg1.method354(-1)) {
                    return arg0.method354(-1) ? 0 : 1;
                } else if (arg0.method354(-1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 8) {
                int var7 = arg1.field6191;
                int var8 = arg0.field6191;
                if (arg2) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg1.field6189 - arg0.field6189;
            }
        } else if (arg1.field6192.equals("-")) {
            if (arg0.field6192.equals("-")) {
                return 0;
            } else if (arg2) {
                return -1;
            } else {
                return 1;
            }
        } else if (arg0.field6192.equals("-")) {
            return arg2 ? 1 : -1;
        } else {
            return class513.method3030(class143.field2137, (byte) 119, arg0.field6192, arg1.field6192);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)I", line = 100)
    public static final int method2436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6115++;
        if ((arg3 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg2;
            arg2 = var7;
        }
        if (arg5 >= -13) {
            return -23;
        }
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 - arg4 - (arg1 + -1);
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg6;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V", line = 131)
    public static void method2437(boolean arg0) {
        field6111 = null;
        field6116 = null;
        field6120 = null;
        field6119 = null;
        if (!arg0) {
            field6111 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILqa;II)Z", line = 146)
    public final boolean method2438(int arg0, class162 arg1, int arg2, int arg3) {
        field6114++;
        if (this.field6108 != null) {
            for (int var5 = 0; var5 < this.field6108.length; var5++) {
                if (this.field6108[var5].method1661(arg3, arg0) && this.field6109.method8(arg3, arg0, arg1, (byte) 124)) {
                    return true;
                }
            }
        }
        if (arg2 != 0) {
            method2436(-48, -28, -53, 101, 26, 121, -14);
        }
        return false;
    }
}
