import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class47 extends class45 {

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
    private boolean field516 = false;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "Lct;")
    private class98 field520;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field513 = -1;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Ljava/lang/String;")
    public static String field518;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "[Ll;")
    public static class16[] field522;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
    public static final void method489(byte arg0) {
        ++field524;
        class85.field1163.method945(-934);
        int var1 = class85.field1163.method952(-112, 8);
        if (var1 < class232.field3410) {
            for (int var2 = var1; ~var2 > ~class232.field3410; ++var2) {
                class160.field2254[class242.field3581++] = class173.field2454[var2];
            }
        }
        if (var1 > class232.field3410) {
            throw new RuntimeException("gnpov1");
        } else {
            class232.field3410 = 0;
            for (int var3 = 0; var1 > var3; ++var3) {
                int var4 = class173.field2454[var3];
                class461 var5 = class250.field3690[var4];
                int var6 = class85.field1163.method952(-54, 1);
                if (~var6 == -1) {
                    class173.field2454[class232.field3410++] = var4;
                    var5.field1688 = class263.field3867;
                } else {
                    int var7 = class85.field1163.method952(arg0 + -18, 2);
                    if (var7 == 0) {
                        class173.field2454[class232.field3410++] = var4;
                        var5.field1688 = class263.field3867;
                        class89.field1217[class200.field2934++] = var4;
                    } else if (var7 == 1) {
                        class173.field2454[class232.field3410++] = var4;
                        var5.field1688 = class263.field3867;
                        int var8 = class85.field1163.method952(arg0 + -6, 3);
                        var5.method2768(-126, var8, 1);
                        int var9 = class85.field1163.method952(-59, 1);
                        if (~var9 == -2) {
                            class89.field1217[class200.field2934++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class173.field2454[class232.field3410++] = var4;
                        var5.field1688 = class263.field3867;
                        if (~class85.field1163.method952(arg0 + -63, 1) == -2) {
                            int var10 = class85.field1163.method952(-88, 3);
                            var5.method2768(60, var10, 2);
                            int var11 = class85.field1163.method952(-99, 3);
                            var5.method2768(-128, var11, 2);
                        } else {
                            int var12 = class85.field1163.method952(-53, 3);
                            var5.method2768(42, var12, 0);
                        }
                        int var13 = class85.field1163.method952(arg0 ^ 116, 1);
                        if (var13 == 1) {
                            class89.field1217[class200.field2934++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class160.field2254[class242.field3581++] = var4;
                    }
                }
            }
            if (arg0 != -53) {
                field518 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lfd;)V")
    public class47(class365 arg0) {
        super(arg0);
        if (arg0.field5368) {
            this.field520 = new class98(arg0, 2);
            this.field520.method833(0, true);
            super.field506.method2219(1, -120);
            super.field506.method2195(34165, 7681, true);
            super.field506.method2228((byte) 79, 2, 770, 34168);
            super.field506.method2237(true, 770, 34167, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field506.method2219(0, -128);
            this.field520.method834((byte) 39);
            this.field520.method833(1, true);
            super.field506.method2219(1, -119);
            super.field506.method2195(8448, 8448, true);
            super.field506.method2228((byte) 79, 2, 770, 34166);
            super.field506.method2237(true, 770, 5890, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field506.method2219(0, -121);
            this.field520.method834((byte) 39);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public static void method490(int arg0) {
        if (arg0 != 0) {
            method489((byte) 39);
        }
        field522 = null;
        field518 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V")
    public final void method281(int arg0, boolean arg1) {
        ++field519;
        if (arg0 != 0) {
            method489((byte) -85);
        }
        class401 var3 = super.field506.method2229((byte) 9);
        if (this.field520 != null && var3 != null && arg1) {
            this.field520.method832('\u0000', -1);
            super.field506.method2219(1, -119);
            super.field506.method2188((byte) 78, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field506.field5394.method1547(123), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field506.method2219(0, arg0 ^ -128);
            this.field516 = true;
        } else {
            super.field506.method2237(true, 770, 34168, 0);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
    public final void method286(int arg0, int arg1, int arg2) {
        if (arg1 < 76) {
            this.field520 = null;
        }
        ++field512;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZB)V")
    public final void method279(boolean arg0, byte arg1) {
        ++field523;
        super.field506.method2195(8448, 7681, true);
        if (arg1 <= 115) {
            this.field520 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public final void method287(int arg0) {
        if (this.field516) {
            this.field520.method832('\u0001', -1);
            super.field506.method2219(1, arg0 ^ -119);
            super.field506.method2188((byte) 78, (class396) null);
            super.field506.method2219(0, -120);
        } else {
            super.field506.method2237(true, 770, 5890, 0);
        }
        ++field511;
        super.field506.method2195(8448, 8448, true);
        if (arg0 != 0) {
            this.field516 = false;
        }
        this.field516 = false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILkj;Z)V")
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        ++field514;
        super.field506.method2188((byte) 78, arg1);
        if (!arg2) {
            field522 = null;
        }
        super.field506.method2183(7681, arg0);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Z")
    public final boolean method280(boolean arg0) {
        if (!arg0) {
            this.method280(true);
        }
        ++field515;
        return true;
    }
}
