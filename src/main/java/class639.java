import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class639 implements class753 {

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "I")
    private int field9146 = -1;

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
    private int field9154 = 0;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "[Led;")
    private class736[] field9155 = new class736[9];

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "Lvf;")
    private class159 field9160;

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
    private int field9149;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field9164 = new String[] { method4636(method4635("7g?-Qs")), method4636(method4635("7g?-Ds")), method4636(method4635("7g?-q2l?o~!gv")), method4636(method4635(" ,p-j")), method4636(method4635("7g?-Ts")), method4636(method4635("5w2o")), method4636(method4635("7g?-_s")), method4636(method4635("7g?-Gs")), method4636(method4635("7g?-Rs")), method4636(method4635("7g?-Zs")), method4636(method4635("7g?-+2l7w)s")), method4636(method4635("7g?-^s")), method4636(method4635("7g?-Xs")), method4636(method4635("7g?-Ys")), method4636(method4635("7g?-Ss")), method4636(method4635("7g?-Es")), method4636(method4635(".q")), method4636(method4635("{C=w~-gd#")), method4636(method4635("\u001f{0bz2ad#")), method4636(method4635("\u0014a=ob?g:97\u001cp1vy?8")), method4636(method4635("\u000fm*b{{M.bf.g~Ly(a,fr58~")), method4636(method4635("{U?o{(8~")), method4636(method4635("\u0014a=ob?g~@v7a~Wx4id#")), method4636(method4635("{R7{r7qd#")), method4636(method4635("\u000fm*b{{V,by(\"\u0011md8p;fya\"")), method4636(method4635("\u0014a=ob?g,p-{")), method4636(method4635("{A\u000ep-{")), method4636(method4635("7g?-Us")), method4636(method4635("7g?-[s")), method4636(method4635("7g?-Ps")), method4636(method4635("7g?-\\s")), method4636(method4635("7g?-]s")), method4636(method4635("7g?-Vs")) };

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "[I")
    public static int[] field9141 = new int[5];

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
    private int field9140;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
    private int field9152;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
    private int field9163;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(II)V", line = 3)
    public final void method4616(int arg0, int arg1) {
        try {
            field9150++;
            if (this.field9146 == arg0) {
                throw new RuntimeException();
            }
            OpenGL.glDrawBuffer(class505.field7561[arg1]);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9164[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "()V", line = 20)
    public static final void method4617() {
        byte var0 = 10;
        byte var1 = 30;
        if (class98.field1441 == 0 || class766.field11217 == null) {
            return;
        }
        class120.field1734.method201(class52.field642);
        for (int var2 = 0; var2 < class498.field7471.length; var2++) {
            class120.field1734.method662(-256, (byte) 74, class52.field642[3] - class52.field642[1], class721.field10578[var2] + class498.field7471[var2], class52.field642[1]);
        }
        for (int var3 = 0; var3 < class678.field9643; var3++) {
            class781 var11 = class568.field8254[var3];
            class120.field1734.method229(var11.field11403[0], var11.field11409[0], var11.field11400[0], class490.field7396);
            class120.field1734.method229(var11.field11403[1], var11.field11409[1], var11.field11400[1], class101.field1481);
            class120.field1734.method229(var11.field11403[2], var11.field11409[2], var11.field11400[2], class540.field7965);
            class120.field1734.method229(var11.field11403[3], var11.field11409[3], var11.field11400[3], class165.field2685);
            if (class490.field7396[2] != -1 && class101.field1481[2] != -1 && class540.field7965[2] != -1 && class165.field2685[2] != -1) {
                int var12 = -65536;
                if (var11.field11405 == 4) {
                    var12 = -16776961;
                }
                class120.field1734.method657(class490.field7396[0], class101.field1481[0], class101.field1481[1], var12, 1, class490.field7396[1]);
                class120.field1734.method657(class101.field1481[0], class540.field7965[0], class540.field7965[1], var12, 1, class101.field1481[1]);
                class120.field1734.method657(class540.field7965[0], class165.field2685[0], class165.field2685[1], var12, 1, class540.field7965[1]);
                class120.field1734.method657(class165.field2685[0], class490.field7396[0], class490.field7396[1], var12, 1, class165.field2685[1]);
                class120.field1734.method657(class490.field7396[0], class540.field7965[0], class540.field7965[1], var12, 1, class490.field7396[1]);
            }
        }
        class766.field11217.method679(0, var0, -16777216, -256, field9164[18] + class251.field3843 + "/" + 5000, var1 + 45);
        class766.field11217.method679(0, var0, -16777216, -256, field9164[20] + class690.field9955 + "/" + 10000, var1 + 60);
        class766.field11217.method679(0, var0, -16777216, -256, field9164[24] + class33.field391 + "/" + 5000, var1 + 75);
        class766.field11217.method679(0, var0, -16777216, -256, field9164[25] + (class599.field8686 + class245.field3793) + field9164[17] + class678.field9643, var1 + 90);
        class766.field11217.method679(0, var0, -16777216, -256, field9164[19] + class290.field4666 + field9164[21] + class106.field1534 + field9164[26] + class77.field1189 + field9164[23] + class74.field1066, var1 + 105);
        class766.field11217.method679(0, var0, -16777216, -256, field9164[22] + class317.field5180 / 1000L + field9164[16], var1 + 120);
        if (class98.field1441 != 2 || class430.field6766 == null) {
            return;
        }
        for (int var4 = 0; var4 < class430.field6766.length; var4++) {
            float var6 = (float) class430.field6766[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class430.field6766[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class107 var5 = class120.field1734.method665(class115.field1680, class115.field1680, 109, 0, class430.field6766, class438.field6842);
        var5.method19(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lkia;II)V", line = 103)
    public final void method4618(class649 arg0, int arg1, int arg2) {
        try {
            if (arg2 <= 49) {
                this.method4628((byte) -6);
            }
            field9145++;
            this.method4621(1, arg1, 0, arg0);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9164[12] + (arg0 == null ? field9164[5] : field9164[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILdka;II)V", line = 115)
    public final void method4619(int arg0, class12 arg1, int arg2, int arg3) {
        try {
            this.method4631(arg1, arg3, arg0, (byte) 98, 0);
            if (arg2 >= -125) {
                this.field9160 = null;
            }
            field9157++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9164[8] + arg0 + ',' + (arg1 == null ? field9164[5] : field9164[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V", line = 126)
    public final void method4620(int arg0) {
        try {
            OpenGL.glBindFramebufferEXT(36009, this.field9149);
            if (arg0 != 29153) {
                field9141 = null;
            }
            field9158++;
            this.field9154 |= 0x2;
            this.field9146 = this.method4628((byte) -42);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9164[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "finalize", descriptor = "()V", line = 141)
    protected final void finalize() throws Throwable {
        try {
            this.field9160.method1451(this.field9149, 0);
            field9161++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9164[2] + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lvf;)V", line = 430)
    public class639(class159 arg0) {
        try {
            if (!arg0.field2532) {
                throw new IllegalStateException("");
            }
            this.field9160 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class293.field4701, 0);
            this.field9149 = class293.field4701[0];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9164[10] + (arg0 == null ? field9164[5] : field9164[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIILkia;)V", line = 159)
    private final void method4621(int arg0, int arg1, int arg2, class649 arg3) {
        try {
            field9137++;
            if (this.field9146 == -1) {
                throw new RuntimeException();
            }
            int var5 = arg0 << arg1;
            if ((this.field9163 & ~var5) == 0) {
                this.field9140 = arg3.field9309;
                this.field9152 = arg3.field9310;
            } else if (this.field9140 != arg3.field9309 || this.field9152 != arg3.field9310) {
                throw new RuntimeException();
            }
            arg3.method4734(this.field9146, class505.field7561[arg1], -1, arg2);
            this.field9155[arg1] = arg3;
            this.field9163 |= var5;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9164[31] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9164[5] : field9164[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IBI)Z", line = 187)
    public static final boolean method4622(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 >= -125) {
                field9141 = null;
            }
            field9147++;
            return (class46.method465(arg2, -6635, arg0) | class663.method4810(-1085436191, arg2, arg0) | class356.method2946(52, arg0, arg2)) & class740.method5385(arg2, arg0, (byte) 109);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9164[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(I)V", line = 200)
    public static void method4623(int arg0) {
        try {
            field9141 = null;
            if (arg0 >= -40) {
                field9141 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9164[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)Z", line = 210)
    public final boolean method4624(int arg0) {
        try {
            field9138++;
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field9146);
            return ~var2 == arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9164[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(B)V", line = 229)
    public final void method4625(byte arg0) {
        try {
            field9139++;
            int var2 = -98 / ((-arg0 - 57) / 60);
            OpenGL.glBindFramebufferEXT(36008, this.field9149);
            this.field9154 |= 0x1;
            this.field9146 = this.method4628((byte) -42);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9164[29] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(II)V", line = 241)
    public final void method4626(int arg0, int arg1) {
        try {
            field9153++;
            if (this.field9146 == -1) {
                throw new RuntimeException();
            }
            OpenGL.glReadBuffer(class505.field7561[arg1]);
            if (arg0 <= 94) {
                this.field9163 = -103;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9164[32] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)V", line = 256)
    public final void method4627(int arg0, int arg1) {
        try {
            if (this.field9155[arg0] != null) {
                this.field9155[arg0].method86(0);
            }
            field9143++;
            this.field9163 &= ~(0x1 << arg0);
            if (arg1 != -20878) {
                this.field9146 = -36;
            }
            this.field9155[arg0] = null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9164[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(B)I", line = 271)
    private final int method4628(byte arg0) {
        try {
            field9151++;
            if (arg0 != -42) {
                this.method4618(null, -93, -121);
            }
            if ((this.field9154 & 0x4) != 0) {
                return 36160;
            } else if ((this.field9154 & 0x2) == 0) {
                return (this.field9154 & 0x1) == 0 ? -1 : 36008;
            } else {
                return 36009;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9164[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V", line = 307)
    public final void method4629(int arg0) {
        try {
            OpenGL.glBindFramebufferEXT(36008, 0);
            field9162++;
            this.field9154 &= 0xFFFFFFFE;
            this.field9146 = this.method4628((byte) -42);
            if (arg0 != 9948) {
                this.method4626(51, -81);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9164[28] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V", line = 321)
    public final void method4630(byte arg0) {
        try {
            field9148++;
            OpenGL.glBindFramebufferEXT(36009, 0);
            if (arg0 >= 14) {
                this.field9154 &= 0xFFFFFFFD;
                this.field9146 = this.method4628((byte) -42);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9164[30] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ldka;IIBI)V", line = 335)
    private final void method4631(class12 arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field9144++;
            if (this.field9146 == -1) {
                throw new RuntimeException();
            }
            int var6 = 0x1 << arg2;
            if ((this.field9163 & ~var6) == 0) {
                this.field9152 = arg0.field141;
                this.field9140 = arg0.field141;
            } else if (this.field9140 != arg0.field141 || this.field9152 != arg0.field141) {
                throw new RuntimeException();
            }
            if (arg3 != 98) {
                this.method4630((byte) -87);
            }
            arg0.method88(arg4, (byte) -22, class505.field7561[arg2], this.field9146, arg1);
            this.field9155[arg2] = arg0;
            this.field9163 |= var6;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9164[14] + (arg0 == null ? field9164[5] : field9164[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V", line = 368)
    public final void method4632(int arg0) {
        try {
            if (arg0 == -23934) {
                OpenGL.glBindFramebufferEXT(36160, this.field9149);
                field9142++;
                this.field9154 |= 0x4;
                this.field9146 = this.method4628((byte) -42);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9164[27] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILad;I)V", line = 381)
    public final void method4633(int arg0, class449 arg1, int arg2) {
        try {
            field9156++;
            if (this.field9146 == -1) {
                throw new RuntimeException();
            }
            int var4 = 0x1 << arg2;
            if (arg0 <= -89) {
                if ((~var4 & this.field9163) == 0) {
                    this.field9152 = arg1.field6957;
                    this.field9140 = arg1.field6972;
                } else if (this.field9140 != arg1.field6972 || this.field9152 != arg1.field6957) {
                    throw new RuntimeException();
                }
                arg1.method3501(class505.field7561[arg2], -114, this.field9146);
                this.field9155[arg2] = arg1;
                this.field9163 |= var4;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9164[4] + arg0 + ',' + (arg1 == null ? field9164[5] : field9164[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V", line = 413)
    public final void method4634(byte arg0) {
        try {
            if (arg0 != -40) {
                this.method4634((byte) -69);
            }
            field9159++;
            OpenGL.glBindFramebufferEXT(36160, 0);
            this.field9154 &= 0xFFFFFFFB;
            this.field9146 = this.method4628((byte) -42);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9164[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4635(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4636(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
