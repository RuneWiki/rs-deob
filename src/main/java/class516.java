import jaggl.OpenGL;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class516 {

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    private int field7612 = 1;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    private int field7617 = 0;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    private int field7622 = 1;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
    private int field7629 = 0;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "Lat;")
    private class398 field7621 = new class398();

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "Z")
    private boolean field7634 = true;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "[Lkia;")
    private class649[] field7632 = new class649[2];

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "Z")
    private boolean field7635 = true;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "Z")
    private boolean field7641 = true;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    private int field7638 = -1;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Z")
    private boolean field7640 = false;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    private int field7637 = 0;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
    private boolean field7642 = true;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "Lvf;")
    private class159 field7625;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "Llea;")
    private class639 field7628;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Llea;")
    private class639 field7627;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "Llea;")
    private class639 field7611;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field7643 = new String[] { method3875(method3874("1\u0006g\u0011")), method3875(method3874("4\u0003%A\u00171\u001a\u007fCV")), method3875(method3874("$]%S\u0003")), method3875(method3874("4\u0003%4V")), method3875(method3874("4\u0003%;V")), method3875(method3874("4\u0003%>V")), method3875(method3874("4\u0003%9V")), method3875(method3874("4\u0003%5V")), method3875(method3874("4\u0003%:V")), method3875(method3874("4\u0003%8V")), method3875(method3874("4\u0003%7V")), method3875(method3874("4\u0003%<V")), method3875(method3874("4\u0003%?V")) };

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
    public static int field7614 = 0;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "[I")
    public static int[] field7620 = new int[64];

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "Z")
    public static boolean field7619 = true;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lad;")
    private class449 field7636;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "Lad;")
    private class449 field7639;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lkia;")
    private class649 field7633;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Z")
    private boolean field7631;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V")
    private final void method3864(int arg0) {
        try {
            field7613++;
            boolean var2 = false;
            int var3 = 0;
            if (arg0 != -8984) {
                this.method3865(-2);
            }
            int var4 = 0;
            for (class496 var5 = (class496) this.field7621.method3228(11); var5 != null; var5 = (class496) this.field7621.method3216(true)) {
                int var6 = var5.method3744(false);
                if (var6 > var3) {
                    var3 = var6;
                }
                var4 += var5.method3751((byte) 123);
                var2 |= var5.method3748(-2362);
            }
            int var7;
            if (var3 == 2) {
                var7 = 34836;
            } else if (var3 == 1) {
                var7 = 34842;
            } else {
                var7 = 6408;
            }
            if (this.field7638 != var7) {
                this.field7638 = var7;
                this.field7634 = true;
            }
            int var8 = this.field7637 <= 2 ? this.field7637 : 2;
            int var9 = var4 <= 2 ? var4 : 2;
            if (var8 != var9) {
                this.field7642 = this.field7634 = true;
            }
            this.field7637 = var4;
            if (this.field7640 != var2) {
                this.field7641 = true;
                this.field7640 = var2;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7643[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public final void method3865(int arg0) {
        try {
            field7608++;
            if (this.field7631) {
                if (this.field7611 != null) {
                    this.field7625.method1459(false, this.field7611);
                    int var2 = 16384;
                    this.field7625.method1443((byte) 101, this.field7628);
                    this.field7611.method4626(121, 0);
                    this.field7628.method4616(-1, 0);
                    if (this.field7640) {
                        var2 |= 0x100;
                    }
                    OpenGL.glBlitFramebufferEXT(0, 0, this.field7622, this.field7612, 0, 0, this.field7622, this.field7612, var2, 9728);
                    this.field7625.method1479(this.field7611, 1);
                    this.field7625.method1485(this.field7628, (byte) 113);
                }
                this.field7625.method1431(arg0 ^ 0x1);
                this.field7625.method1482(13370, 0);
                this.field7625.method1425((byte) 35, arg0);
                this.field7625.method227();
                int var3 = 0;
                int var4 = 1;
                class496 var6;
                for (class496 var5 = (class496) this.field7621.method3228(11); var5 != null; var5 = var6) {
                    var6 = (class496) this.field7621.method3216(true);
                    int var7 = var5.method3751((byte) 116);
                    for (int var8 = 0; var8 < var7; var8++) {
                        var5.method3753(-31891, this.field7633, this.field7632[var3], var8);
                        if (var6 == null && (var7 - 1) == var8) {
                            this.field7625.method1502(this.field7628, arg0 - 128);
                            this.field7625.method1472(0, (byte) 30, 0);
                            OpenGL.glBegin(7);
                            OpenGL.glTexCoord2f(0.0F, (float) this.field7612);
                            OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                            OpenGL.glVertex2i(this.field7617, this.field7629);
                            OpenGL.glTexCoord2f(0.0F, 0.0F);
                            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                            OpenGL.glVertex2i(this.field7617, this.field7629 + this.field7612);
                            OpenGL.glTexCoord2f((float) this.field7622, 0.0F);
                            OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                            OpenGL.glVertex2i(this.field7622 + this.field7617, this.field7629 + this.field7612);
                            OpenGL.glTexCoord2f((float) this.field7622, (float) this.field7612);
                            OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                            OpenGL.glVertex2i(this.field7622 + this.field7617, this.field7629);
                            OpenGL.glEnd();
                        } else {
                            this.field7628.method4616(-1, var4);
                            OpenGL.glBegin(7);
                            OpenGL.glTexCoord2f(0.0F, (float) this.field7612);
                            OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                            OpenGL.glVertex2i(0, 0);
                            OpenGL.glTexCoord2f(0.0F, 0.0F);
                            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                            OpenGL.glVertex2i(0, this.field7612);
                            OpenGL.glTexCoord2f((float) this.field7622, 0.0F);
                            OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                            OpenGL.glVertex2i(this.field7622, this.field7612);
                            OpenGL.glTexCoord2f((float) this.field7622, (float) this.field7612);
                            OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                            OpenGL.glVertex2i(this.field7622, 0);
                            OpenGL.glEnd();
                        }
                        var4 = var4 + 1 & 0x1;
                        var3 = var3 + 1 & 0x1;
                        var5.method3755(1, var8);
                    }
                }
                this.field7631 = false;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7643[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BIIII)Z")
    public final boolean method3866(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field7609++;
            if (this.field7627 == null || this.field7621.method3217((byte) -50)) {
                return false;
            }
            int var6 = 92 / ((arg0 - 34) / 60);
            if (this.field7622 != arg1 || this.field7612 != arg3) {
                this.field7612 = arg3;
                this.field7622 = arg1;
                for (class568 var7 = this.field7621.method3228(11); var7 != this.field7621.field6307; var7 = var7.field8249) {
                    ((class496) var7).method3750((byte) 106, this.field7622, this.field7612);
                }
                this.field7641 = true;
                this.field7642 = true;
                this.field7634 = true;
            }
            if (!this.method3872(10)) {
                return false;
            }
            this.field7631 = true;
            this.field7617 = arg2;
            this.field7629 = arg4;
            this.field7625.method1424(this.field7627, (byte) -29);
            this.field7627.method4616(-1, 0);
            this.field7625.method1472(-this.field7617, (byte) 116, this.field7612 + this.field7629 - this.field7625.field2299);
            return true;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7643[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
    public final void method3867(int arg0) {
        try {
            this.field7627 = this.field7611 = this.field7628 = null;
            if (arg0 <= 12) {
                method3869((byte) -37, -44);
            }
            field7626++;
            this.field7639 = null;
            this.field7633 = null;
            this.field7632 = null;
            this.field7636 = null;
            if (!this.field7621.method3217((byte) -118)) {
                for (class568 var2 = this.field7621.method3228(11); var2 != this.field7621.field6307; var2 = var2.field8249) {
                    ((class496) var2).method3745(true);
                }
            }
            this.field7622 = this.field7612 = 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7643[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public static void method3868(int arg0) {
        try {
            if (arg0 != 1) {
                field7618 = -20;
            }
            field7620 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7643[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)V")
    public static final void method3869(byte arg0, int arg1) {
        try {
            field7624++;
            if (class623.field8996.field6377.method5503(true) == 0) {
                arg1 = -1;
            }
            if (class75.field1096 != arg1) {
                if (arg0 >= -45) {
                    method3869((byte) -29, -110);
                }
                if (arg1 != -1) {
                    class305 var2 = class100.field1465.method1842(arg1, 33);
                    class174 var3 = var2.method2617((byte) -119);
                    if (var3 == null) {
                        arg1 = -1;
                    } else {
                        class393.field6256.method637(var3.method1611(), 7159, var3.method1605(), class442.field6902, var3.method1610(), new Point(var2.field4922, var2.field4921));
                        class75.field1096 = arg1;
                    }
                }
                if (arg1 == -1 && class75.field1096 != -1) {
                    class393.field6256.method637(-1, 7159, null, class442.field6902, -1, new Point());
                    class75.field1096 = -1;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7643[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)Z")
    public final boolean method3870(int arg0) {
        try {
            field7610++;
            if (arg0 != -12396) {
                this.field7640 = true;
            }
            return this.field7627 != null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7643[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lvaa;Z)V")
    public final void method3871(class496 arg0, boolean arg1) {
        try {
            field7623++;
            arg0.field7447 = false;
            arg0.method3745(arg1);
            arg0.method4173(-1);
            this.method3864(-8984);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7643[6] + (arg0 == null ? field7643[0] : field7643[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)Z")
    private final boolean method3872(int arg0) {
        try {
            if (this.field7641) {
                if (this.field7636 != null) {
                    this.field7636.method3498(true);
                    this.field7636 = null;
                }
                if (this.field7633 != null) {
                    this.field7633.method1970((byte) -54);
                    this.field7633 = null;
                }
                if (this.field7611 != null) {
                    this.field7636 = new class449(this.field7625, 6402, this.field7622, this.field7612, this.field7625.field2363);
                }
                if (this.field7640) {
                    this.field7633 = new class649(this.field7625, 34037, 6402, this.field7622, this.field7612);
                } else if (this.field7636 == null) {
                    this.field7636 = new class449(this.field7625, 6402, this.field7622, this.field7612);
                }
                this.field7642 = true;
                this.field7641 = false;
                this.field7635 = true;
            }
            field7616++;
            if (this.field7634) {
                if (this.field7639 != null) {
                    this.field7639.method3498(true);
                    this.field7639 = null;
                }
                if (this.field7632[0] != null) {
                    this.field7632[0].method1970((byte) -54);
                    this.field7632[0] = null;
                }
                if (this.field7632[1] != null) {
                    this.field7632[1].method1970((byte) -54);
                    this.field7632[1] = null;
                }
                if (this.field7611 != null) {
                    this.field7639 = new class449(this.field7625, this.field7638, this.field7622, this.field7612, this.field7625.field2363);
                }
                this.field7632[0] = new class649(this.field7625, 34037, this.field7638, this.field7622, this.field7612);
                this.field7632[1] = this.field7637 <= 1 ? null : new class649(this.field7625, 34037, this.field7638, this.field7622, this.field7612);
                this.field7642 = true;
                this.field7635 = true;
                this.field7634 = false;
            }
            if (this.field7642) {
                if (this.field7611 == null) {
                    this.field7625.method1424(this.field7628, (byte) -29);
                    this.field7628.method4627(0, -20878);
                    this.field7628.method4627(1, -20878);
                    this.field7628.method4627(8, -20878);
                    this.field7628.method4618(this.field7632[0], 0, 63);
                    if (this.field7637 > 1) {
                        this.field7628.method4618(this.field7632[1], 1, 118);
                    }
                    if (this.field7640) {
                        this.field7628.method4618(this.field7633, 8, 85);
                    } else {
                        this.field7628.method4633(-108, this.field7636, 8);
                    }
                    this.field7625.method1502(this.field7628, -114);
                } else {
                    this.field7625.method1424(this.field7628, (byte) -29);
                    this.field7628.method4627(0, -20878);
                    this.field7628.method4627(1, -20878);
                    this.field7628.method4627(8, -20878);
                    this.field7628.method4618(this.field7632[0], 0, 86);
                    if (this.field7637 > 1) {
                        this.field7628.method4618(this.field7632[1], 1, 96);
                    }
                    if (this.field7640) {
                        this.field7628.method4618(this.field7633, 8, 106);
                    }
                    this.field7625.method1502(this.field7628, -113);
                    this.field7625.method1424(this.field7611, (byte) -29);
                    this.field7611.method4627(0, -20878);
                    this.field7611.method4627(8, -20878);
                    this.field7611.method4633(-112, this.field7639, 0);
                    this.field7611.method4633(-111, this.field7636, 8);
                    this.field7625.method1502(this.field7611, -113);
                }
                this.field7642 = false;
                this.field7635 = true;
            }
            if (this.field7635) {
                this.field7625.method1424(this.field7627, (byte) -29);
                this.field7635 = !this.field7627.method4624(-36054);
                this.field7625.method1502(this.field7627, -119);
            }
            int var2 = 63 / ((-arg0 - 66) / 43);
            return !this.field7635;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7643[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lvaa;I)Z")
    public final boolean method3873(class496 arg0, int arg1) {
        try {
            int var3 = 73 % ((arg1 - 80) / 44);
            field7615++;
            if (this.field7627 != null) {
                if (arg0.method3747(0) || arg0.method3754(-64)) {
                    this.field7621.method3220(arg0, 0);
                    this.method3864(-8984);
                    if (this.method3872(3)) {
                        if (this.field7622 != -1 && this.field7612 != -1) {
                            arg0.method3750((byte) 75, this.field7622, this.field7612);
                        }
                        arg0.field7447 = true;
                        return true;
                    }
                }
                this.method3871(arg0, true);
            }
            return false;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7643[9] + (arg0 == null ? field7643[0] : field7643[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lvf;)V")
    public class516(class159 arg0) {
        try {
            this.field7625 = arg0;
            if (this.field7625.field2532 && this.field7625.field2481) {
                this.field7627 = this.field7628 = new class639(this.field7625);
                if (this.field7625.field2363 > 1 && this.field7625.field2458 && this.field7625.field2459) {
                    this.field7627 = this.field7611 = new class639(this.field7625);
                    return;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7643[1] + (arg0 == null ? field7643[0] : field7643[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3874(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3875(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 95;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
