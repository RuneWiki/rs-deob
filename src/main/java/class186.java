import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class186 extends class109 {

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[B")
    public byte[] field3790;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Ldd;")
    public static class35 field3789 = class180.method1196((byte) -16, "p11_full");

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Lld;")
    public static class111 field3794 = new class111(500);

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "Lld;")
    public static class111 field3795 = new class111(64);

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Ldd;")
    private static class35 field3800 = class180.method1196((byte) -127, "Login");

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "Ldd;")
    public static class35 field3798 = field3800;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "Ldd;")
    public static class35 field3796 = class180.method1196((byte) 126, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Ldd;")
    public static class35 field3799 = class180.method1196((byte) 127, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lld;")
    public static class111 field3797 = new class111(30);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lce;I)V")
    public static final void method1227(class26 arg0, int arg1) {
        field3792++;
        if (class56.field1409 != null) {
            try {
                class56.field1409.method1293((byte) 65, 0L);
                class56.field1409.method1292(arg0.field527, -1721, 24, arg0.field529);
            } catch (Exception var2) {
            }
        }
        arg0.field527 += 24;
        if (arg1 > -34) {
            method1229(81, -19, -106, -52);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
    public static void method1228(byte arg0) {
        field3796 = null;
        field3800 = null;
        field3795 = null;
        field3798 = null;
        field3799 = null;
        field3789 = null;
        field3794 = null;
        field3797 = null;
        if (arg0 <= 119) {
            method1228((byte) -113);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V")
    public class186(byte[] arg0) {
        this.field3790 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIII)Z")
    public static final boolean method1229(int arg0, int arg1, int arg2, int arg3) {
        if (!class1.method9(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class126.field2746[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class4.field78) {
                    if (!class120.method857(var4, var6, var5)) {
                        return false;
                    }
                    if (!class120.method857(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method857(var4, var7, var5)) {
                        return false;
                    }
                    if (!class120.method857(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method857(var4, var8, var5)) {
                    return false;
                }
                if (!class120.method857(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class29.field590) {
                    if (!class120.method857(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class120.method857(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method857(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class120.method857(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method857(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class120.method857(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class4.field78) {
                    if (!class120.method857(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class120.method857(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method857(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class120.method857(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class120.method857(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class120.method857(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class29.field590) {
                    if (!class120.method857(var4, var6, var5)) {
                        return false;
                    }
                    if (!class120.method857(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class120.method857(var4, var7, var5)) {
                        return false;
                    }
                    if (!class120.method857(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class120.method857(var4, var8, var5)) {
                    return false;
                }
                if (!class120.method857(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class120.method857(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class120.method857(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class120.method857(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class120.method857(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class120.method857(var4, var8, var5);
        } else {
            return true;
        }
    }
}
