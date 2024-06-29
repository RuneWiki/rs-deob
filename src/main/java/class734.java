import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class734 {

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    private int field10664 = 1;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    private int field10655 = 0;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "I")
    private int field10662 = 1;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    private int field10671 = 0;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Lef;")
    private class513 field10659 = new class513();

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    private int field10675 = 0;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "[Lbca;")
    private class689[] field10682 = new class689[2];

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    private int field10684 = -1;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "Z")
    private boolean field10686 = true;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "Z")
    private boolean field10677 = true;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "Z")
    private boolean field10678 = false;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "Z")
    private boolean field10679 = true;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "Z")
    private boolean field10687 = true;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "Lffa;")
    private class197 field10672;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "Lct;")
    private class156 field10665;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "Lct;")
    private class156 field10670;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "Lct;")
    private class156 field10663;

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field10688 = new String[] { method5362(method5361("}\r\u000b:.")), method5362(method5361("oS\u000b\\{")), method5362(method5361("z\bI\u001e")), method5362(method5361("}\r\u000b6.")), method5362(method5361("}\r\u000b0.")), method5362(method5361("}\r\u000b7.")), method5362(method5361("}\r\u000b8.")), method5362(method5361("}\r\u000b1.")), method5362(method5361("}\r\u000b5.")), method5362(method5361("}\r\u000b3.")), method5362(method5361("}\r\u000b;.")), method5362(method5361("}\r\u000b4.")), method5362(method5361("}\r\u000bNoz\u0014QL.")) };

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "Lwia;")
    public static class790 field10673 = new class790(88, 8);

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "Lum;")
    public static class550 field10685 = new class550("", 15);

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field10656;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field10657;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field10658;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    public static int field10660;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public static int field10661;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field10666;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field10667;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field10668;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field10669;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "Lvq;")
    private class486 field10680;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Lvq;")
    private class486 field10681;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "Lbca;")
    private class689 field10676;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "Z")
    private boolean field10674;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "[[[Liia;")
    public static class96[][][] field10683;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILvw;)Z", line = 4)
    public final boolean method5351(int arg0, class320 arg1) {
        try {
            int var3 = 50 % ((arg0 + 16) / 42);
            field10661++;
            if (this.field10670 != null) {
                if (arg1.method2714((byte) -92) || arg1.method2708(false)) {
                    this.field10659.method3868(97, arg1);
                    this.method5355((byte) 95);
                    if (this.method5359(0)) {
                        if (this.field10662 != -1 && this.field10664 != -1) {
                            arg1.method2710(this.field10664, this.field10662, (byte) -123);
                        }
                        arg1.field5056 = true;
                        return true;
                    }
                }
                this.method5356(1, arg1);
            }
            return false;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10688[0] + arg0 + ',' + (arg1 == null ? field10688[2] : field10688[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIBI)Z", line = 41)
    public final boolean method5352(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field10657++;
            if (this.field10670 == null || this.field10659.method3873(88)) {
                return false;
            } else if (arg3 <= 4) {
                return true;
            } else {
                if (this.field10662 != arg2 || this.field10664 != arg4) {
                    this.field10664 = arg4;
                    this.field10662 = arg2;
                    for (class206 var6 = this.field10659.method3863((byte) 64); var6 != this.field10659.field7374; var6 = var6.field3180) {
                        ((class320) var6).method2710(this.field10664, this.field10662, (byte) -32);
                    }
                    this.field10686 = true;
                    this.field10687 = true;
                    this.field10679 = true;
                }
                if (!this.method5359(0)) {
                    return false;
                }
                this.field10671 = arg1;
                this.field10674 = true;
                this.field10655 = arg0;
                this.field10672.method1755(this.field10670, 0);
                this.field10670.method1303(0, -4356);
                this.field10672.method1732(this.field10664 + this.field10655 - this.field10672.field2687, (byte) -97, -this.field10671);
                return true;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10688[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V", line = 92)
    public final void method5353(int arg0) {
        try {
            this.field10676 = null;
            this.field10680 = null;
            this.field10682 = null;
            if (arg0 != 0) {
                this.method5354(56);
            }
            field10667++;
            this.field10681 = null;
            this.field10670 = this.field10663 = this.field10665 = null;
            if (!this.field10659.method3873(arg0 + 19)) {
                for (class206 var2 = this.field10659.method3863((byte) 64); var2 != this.field10659.field7374; var2 = var2.field3180) {
                    ((class320) var2).method2711((byte) -79);
                }
            }
            this.field10662 = this.field10664 = 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10688[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)Z", line = 122)
    public final boolean method5354(int arg0) {
        try {
            field10656++;
            if (arg0 == -1368) {
                return this.field10670 != null;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10688[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V", line = 133)
    private final void method5355(byte arg0) {
        try {
            field10658++;
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            for (class320 var5 = (class320) this.field10659.method3863((byte) 64); var5 != null; var5 = (class320) this.field10659.method3862(-353)) {
                int var6 = var5.method2709((byte) 126);
                if (var3 < var6) {
                    var3 = var6;
                }
                var4 += var5.method2716(0);
                var2 |= var5.method2707(-15624);
            }
            int var7;
            if (var3 == 2) {
                var7 = 34836;
            } else if (var3 == 1) {
                var7 = 34842;
            } else {
                var7 = 6408;
            }
            if (this.field10684 != var7) {
                this.field10684 = var7;
                this.field10679 = true;
            }
            if (arg0 < 55) {
                this.method5355((byte) 104);
            }
            int var8 = this.field10675 <= 2 ? this.field10675 : 2;
            int var9 = var4 <= 2 ? var4 : 2;
            this.field10675 = var4;
            if (this.field10678 != var2) {
                this.field10686 = true;
                this.field10678 = var2;
            }
            if (var8 != var9) {
                this.field10687 = this.field10679 = true;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10688[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(ILvw;)V", line = 196)
    public final void method5356(int arg0, class320 arg1) {
        try {
            arg1.field5056 = false;
            field10660++;
            arg1.method2711((byte) -79);
            arg1.method1824(arg0);
            this.method5355((byte) 84);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10688[7] + arg0 + ',' + (arg1 == null ? field10688[2] : field10688[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 209)
    public static void method5357(byte arg0) {
        try {
            field10673 = null;
            if (arg0 != 59) {
                field10673 = null;
            }
            field10685 = null;
            field10683 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10688[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILic;BI)V", line = 222)
    public static final void method5358(int arg0, class726 arg1, byte arg2, int arg3) {
        try {
            if (arg2 != -80) {
                method5357((byte) 79);
            }
            field10668++;
            int[] var4 = new int[4];
            class467.method3551(var4, 0, var4.length, arg3);
            class625.method4642(arg1, arg0, var4, 123);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10688[10] + arg0 + ',' + (arg1 == null ? field10688[2] : field10688[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lffa;)V", line = 535)
    public class734(class197 arg0) {
        try {
            this.field10672 = arg0;
            if (this.field10672.field2983 && this.field10672.field2964) {
                this.field10670 = this.field10665 = new class156(this.field10672);
                if (this.field10672.field2837 > 1 && this.field10672.field2911 && this.field10672.field2932) {
                    this.field10670 = this.field10663 = new class156(this.field10672);
                    return;
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10688[12] + (arg0 == null ? field10688[2] : field10688[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)Z", line = 252)
    private final boolean method5359(int arg0) {
        try {
            if (arg0 != 0) {
                this.field10676 = null;
            }
            if (this.field10686) {
                if (this.field10681 != null) {
                    this.field10681.method3696(true);
                    this.field10681 = null;
                }
                if (this.field10676 != null) {
                    this.field10676.method3922(75);
                    this.field10676 = null;
                }
                if (this.field10663 != null) {
                    this.field10681 = new class486(this.field10672, 6402, this.field10662, this.field10664, this.field10672.field2837);
                }
                if (this.field10678) {
                    this.field10676 = new class689(this.field10672, 34037, 6402, this.field10662, this.field10664);
                } else if (this.field10681 == null) {
                    this.field10681 = new class486(this.field10672, 6402, this.field10662, this.field10664);
                }
                this.field10686 = false;
                this.field10687 = true;
                this.field10677 = true;
            }
            field10666++;
            if (this.field10679) {
                if (this.field10680 != null) {
                    this.field10680.method3696(true);
                    this.field10680 = null;
                }
                if (this.field10682[0] != null) {
                    this.field10682[0].method3922(112);
                    this.field10682[0] = null;
                }
                if (this.field10682[1] != null) {
                    this.field10682[1].method3922(arg0 ^ 0x68);
                    this.field10682[1] = null;
                }
                if (this.field10663 != null) {
                    this.field10680 = new class486(this.field10672, this.field10684, this.field10662, this.field10664, this.field10672.field2837);
                }
                this.field10682[0] = new class689(this.field10672, 34037, this.field10684, this.field10662, this.field10664);
                this.field10682[1] = this.field10675 <= 1 ? null : new class689(this.field10672, 34037, this.field10684, this.field10662, this.field10664);
                this.field10679 = false;
                this.field10687 = true;
                this.field10677 = true;
            }
            if (this.field10687) {
                if (this.field10663 == null) {
                    this.field10672.method1755(this.field10665, 0);
                    this.field10665.method1300((byte) 41, 0);
                    this.field10665.method1300((byte) 41, 1);
                    this.field10665.method1300((byte) 41, 8);
                    this.field10665.method1305(0, -87, this.field10682[0]);
                    if (this.field10675 > 1) {
                        this.field10665.method1305(1, -51, this.field10682[1]);
                    }
                    if (this.field10678) {
                        this.field10665.method1305(8, 125, this.field10676);
                    } else {
                        this.field10665.method1312(8, (byte) -34, this.field10681);
                    }
                    this.field10672.method1746(this.field10665, (byte) 98);
                } else {
                    this.field10672.method1755(this.field10665, 0);
                    this.field10665.method1300((byte) 41, 0);
                    this.field10665.method1300((byte) 41, 1);
                    this.field10665.method1300((byte) 41, 8);
                    this.field10665.method1305(0, -99, this.field10682[0]);
                    if (this.field10675 > 1) {
                        this.field10665.method1305(1, 126, this.field10682[1]);
                    }
                    if (this.field10678) {
                        this.field10665.method1305(8, 127, this.field10676);
                    }
                    this.field10672.method1746(this.field10665, (byte) 82);
                    this.field10672.method1755(this.field10663, 0);
                    this.field10663.method1300((byte) 41, 0);
                    this.field10663.method1300((byte) 41, 8);
                    this.field10663.method1312(0, (byte) -34, this.field10680);
                    this.field10663.method1312(8, (byte) -34, this.field10681);
                    this.field10672.method1746(this.field10663, (byte) 125);
                }
                this.field10687 = false;
                this.field10677 = true;
            }
            if (this.field10677) {
                this.field10672.method1755(this.field10670, arg0);
                this.field10677 = !this.field10670.method1309((byte) 37);
                this.field10672.method1746(this.field10670, (byte) 112);
            }
            return !this.field10677;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10688[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V", line = 379)
    public final void method5360(int arg0) {
        try {
            if (arg0 == -13829) {
                field10669++;
                if (this.field10674) {
                    if (this.field10663 != null) {
                        this.field10672.method1758((byte) 42, this.field10663);
                        int var2 = 16384;
                        this.field10672.method1744(this.field10665, -1876245328);
                        this.field10663.method1299(-1, 0);
                        this.field10665.method1303(0, -4356);
                        if (this.field10678) {
                            var2 |= 0x100;
                        }
                        OpenGL.glBlitFramebufferEXT(0, 0, this.field10662, this.field10664, 0, 0, this.field10662, this.field10664, var2, 9728);
                        this.field10672.method1736((byte) 67, this.field10663);
                        this.field10672.method1710(this.field10665, arg0 + 2993);
                    }
                    this.field10672.method1691((byte) -61);
                    this.field10672.method1743(arg0 ^ 0x3665, 0);
                    this.field10672.method1753(0, 1);
                    this.field10672.method553();
                    int var3 = 0;
                    int var4 = 1;
                    class320 var6;
                    for (class320 var5 = (class320) this.field10659.method3863((byte) 64); var5 != null; var5 = var6) {
                        var6 = (class320) this.field10659.method3862(arg0 + 13476);
                        int var7 = var5.method2716(0);
                        for (int var8 = 0; var8 < var7; var8++) {
                            var5.method2706(arg0 ^ 0xFFFFC9FB, this.field10682[var3], var8, this.field10676);
                            if (var6 == null && var7 - 1 == var8) {
                                this.field10672.method1746(this.field10665, (byte) 117);
                                this.field10672.method1732(0, (byte) -122, 0);
                                OpenGL.glBegin(7);
                                OpenGL.glTexCoord2f(0.0F, (float) this.field10664);
                                OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                                OpenGL.glVertex2i(this.field10671, this.field10655);
                                OpenGL.glTexCoord2f(0.0F, 0.0F);
                                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                                OpenGL.glVertex2i(this.field10671, this.field10655 + this.field10664);
                                OpenGL.glTexCoord2f((float) this.field10662, 0.0F);
                                OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                                OpenGL.glVertex2i(this.field10671 + this.field10662, this.field10664 + this.field10655);
                                OpenGL.glTexCoord2f((float) this.field10662, (float) this.field10664);
                                OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                                OpenGL.glVertex2i(this.field10671 + this.field10662, this.field10655);
                                OpenGL.glEnd();
                            } else {
                                this.field10665.method1303(var4, -4356);
                                OpenGL.glBegin(7);
                                OpenGL.glTexCoord2f(0.0F, (float) this.field10664);
                                OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                                OpenGL.glVertex2i(0, 0);
                                OpenGL.glTexCoord2f(0.0F, 0.0F);
                                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                                OpenGL.glVertex2i(0, this.field10664);
                                OpenGL.glTexCoord2f((float) this.field10662, 0.0F);
                                OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                                OpenGL.glVertex2i(this.field10662, this.field10664);
                                OpenGL.glTexCoord2f((float) this.field10662, (float) this.field10664);
                                OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                                OpenGL.glVertex2i(this.field10662, 0);
                                OpenGL.glEnd();
                            }
                            var4 = var4 + 1 & 0x1;
                            var3 = var3 + 1 & 0x1;
                            var5.method2713(var8, arg0 + 13954);
                        }
                    }
                    this.field10674 = false;
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10688[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5361(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5362(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
