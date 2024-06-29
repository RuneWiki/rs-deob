import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class416 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    private int field6153 = 1;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    private int field6169 = 0;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    private int field6163 = 1;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    private int field6166 = 0;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Lum;")
    private class347 field6173 = new class347();

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "Z")
    private boolean field6175 = true;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "Z")
    private boolean field6176 = false;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    private int field6180 = -1;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "[Lud;")
    private class26[] field6183 = new class26[2];

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    private int field6181 = 0;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Z")
    private boolean field6177 = true;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "Z")
    private boolean field6184 = true;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "Z")
    private boolean field6185 = true;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Lrl;")
    private class487 field6168;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lpr;")
    private class295 field6162;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Lpr;")
    private class295 field6156;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Lpr;")
    private class295 field6170;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[F")
    public static float[] field6160 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[[Z")
    public static boolean[][] field6157 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "Lud;")
    private class26 field6178;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "Lip;")
    private class479 field6179;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "Lip;")
    private class479 field6182;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Z")
    private boolean field6167;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "[I")
    public static int[] field6161;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)Z", line = 5)
    public final boolean method2469(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6174++;
        if (arg0 > -89) {
            return false;
        } else if (this.field6156 == null || this.field6173.method2090(0)) {
            return false;
        } else {
            if (this.field6153 != arg4 || this.field6163 != arg2) {
                this.field6153 = arg4;
                this.field6163 = arg2;
                for (class86 var6 = this.field6173.method2096(-21400); var6 != this.field6173.field5018; var6 = var6.field1179) {
                    ((class495) var6).method1909(true, this.field6163, this.field6153);
                }
                this.field6184 = true;
                this.field6175 = true;
                this.field6185 = true;
            }
            if (!this.method2473(0)) {
                return false;
            }
            this.field6167 = true;
            this.field6169 = arg3;
            this.field6166 = arg1;
            this.field6168.method2872(125, this.field6156);
            this.field6156.method1795(0, (byte) -103);
            this.field6168.method2906(120, this.field6163 - this.field6156.method1793((byte) -26) - this.field6169, -this.field6166);
            return true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Leq;I)V", line = 51)
    public static final void method2470(class134 arg0, int arg1) {
        field6159++;
        if (!(class383.field5696 >= 2 || class288.field4128) || class164.field2146 != null) {
            return;
        }
        if (arg1 != 17178) {
            method2478(-127);
        }
        String var2;
        if (class288.field4128 && class383.field5696 < 2) {
            var2 = class457.field6660 + class171.field2321.method1220(2969, class81.field1122) + class211.field2998 + " ->";
        } else if (class23.field303 && class489.field7484.method1877(125, 81) && class383.field5696 > 2) {
            var2 = class162.method1027((class262) class230.field3220.field5018.field1173.field1173, arg1 ^ 0x431A);
        } else {
            class262 var3 = (class262) class230.field3220.field5018.field1173;
            var2 = class162.method1027(var3, 0);
            int[] var4 = null;
            if (class166.method1048(12474, var3.field3737)) {
                var4 = class405.field5947.method1162((int) var3.field3733, 0).field5430;
            } else if (var3.field3736 != -1) {
                var4 = class405.field5947.method1162(var3.field3736, 0).field5430;
            } else if (class117.method669((byte) 82, var3.field3737)) {
                class139 var5 = class504.field7697[(int) var3.field3733];
                if (var5 != null) {
                    class272 var6 = var5.field1825;
                    if (var6.field3797 != null) {
                        var6 = var6.method1656(class453.field6591, 103);
                    }
                    if (var6 != null) {
                        var4 = var6.field3823;
                    }
                }
            } else if (class478.method2792(var3.field3737, (byte) -87)) {
                Object var7 = null;
                class486 var8;
                if (var3.field3737 == 1002) {
                    var8 = class114.field1471.method2132((byte) 126, (int) var3.field3733);
                } else {
                    var8 = class114.field1471.method2132((byte) 124, (int) (var3.field3733 >>> 32 & 0x7FFFFFFFL));
                }
                if (var8.field7043 != null) {
                    var8 = var8.method2834(class453.field6591, false);
                }
                if (var8 != null) {
                    var4 = var8.field7077;
                }
            }
            if (var4 != null) {
                var2 = var2 + class103.method616(var4, 0);
            }
        }
        if (class383.field5696 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class383.field5696 - 2) + class147.field1911.method1220(arg1 - 14209, class81.field1122);
        }
        if (class135.field1723 != null) {
            class348 var9 = class135.field1723.method2153(-2, arg0);
            if (var9 == null) {
                var9 = class458.field6676;
            }
            var9.method2111(var2, class58.field902, class134.field1708, class135.field1723.field5168, class9.field143, class239.field3351, arg1 ^ 0x436C, class135.field1723.field5134, class376.field5613, class135.field1723.field5193, class135.field1723.field5132, class135.field1723.field5169, class362.field5444, class135.field1723.field5256, class93.field1255);
            class248.method1547(class376.field5613[2], class376.field5613[0], 320, class376.field5613[1], class376.field5613[3]);
        } else if (class149.field1928 != null && class459.field6684 == class156.field1996) {
            int var10 = class458.field6676.method2108(class134.field1708, class9.field143, class98.field1337 + 16, class93.field1255, arg1 ^ 0x43DA, 0, var2, class58.field902, 16777215, class245.field3526 + 4);
            class248.method1547(class482.field6989.method3055(7748, var2) + var10, class245.field3526 + 4, 320, class98.field1337, 16);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILfm;)V", line = 160)
    public final void method2471(int arg0, class495 arg1) {
        field6165++;
        arg1.field7546 = false;
        arg1.method1911(0);
        arg1.method536(false);
        if (arg0 != 18780) {
            this.method2471(-49, null);
        }
        this.method2474(-28685);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lrl;)V", line = 634)
    public class416(class487 arg0) {
        this.field6168 = arg0;
        if (this.field6168.field7348 && this.field6168.field7459) {
            this.field6156 = this.field6162 = new class295(this.field6168);
            if (this.field6168.field7308 > 1 && this.field6168.field7410 && this.field6168.field7401) {
                this.field6156 = this.field6170 = new class295(this.field6168);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 179)
    public final void method2472(int arg0) {
        this.field6178 = null;
        this.field6183 = null;
        this.field6182 = null;
        this.field6156 = this.field6170 = this.field6162 = null;
        field6155++;
        if (arg0 < 94) {
            return;
        }
        this.field6179 = null;
        if (!this.field6173.method2090(0)) {
            for (class86 var2 = this.field6173.method2096(-21400); var2 != this.field6173.field5018; var2 = var2.field1179) {
                ((class495) var2).method1911(0);
            }
        }
        this.field6153 = this.field6163 = 1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Z", line = 213)
    private final boolean method2473(int arg0) {
        field6172++;
        if (this.field6185) {
            if (this.field6182 != null) {
                this.field6182.method2798((byte) -45);
                this.field6182 = null;
            }
            if (this.field6178 != null) {
                this.field6178.method1371((byte) -107);
                this.field6178 = null;
            }
            if (this.field6170 != null) {
                this.field6182 = new class479(this.field6168, 6402, this.field6153, this.field6163, this.field6168.field7308);
            }
            if (this.field6176) {
                this.field6178 = new class26(this.field6168, 34037, 6402, this.field6153, this.field6163);
            } else if (this.field6182 == null) {
                this.field6182 = new class479(this.field6168, 6402, this.field6153, this.field6163);
            }
            this.field6185 = false;
            this.field6177 = true;
            this.field6184 = true;
        }
        if (this.field6175) {
            if (this.field6179 != null) {
                this.field6179.method2798((byte) -45);
                this.field6179 = null;
            }
            if (this.field6183[0] != null) {
                this.field6183[0].method1371((byte) -107);
                this.field6183[0] = null;
            }
            if (this.field6183[1] != null) {
                this.field6183[1].method1371((byte) -107);
                this.field6183[1] = null;
            }
            if (this.field6170 != null) {
                this.field6179 = new class479(this.field6168, this.field6180, this.field6153, this.field6163, this.field6168.field7308);
            }
            this.field6183[0] = new class26(this.field6168, 34037, this.field6180, this.field6153, this.field6163);
            this.field6183[1] = this.field6181 <= 1 ? null : new class26(this.field6168, 34037, this.field6180, this.field6153, this.field6163);
            this.field6177 = true;
            this.field6175 = false;
            this.field6184 = true;
        }
        if (this.field6184) {
            if (this.field6170 == null) {
                this.field6168.method2872(126, this.field6162);
                this.field6162.method1782(-1, 0);
                this.field6162.method1782(-1, 1);
                this.field6162.method1782(arg0 - 1, 8);
                this.field6162.method1783((byte) 64, this.field6183[0], 0);
                if (this.field6181 > 1) {
                    this.field6162.method1783((byte) 64, this.field6183[1], 1);
                }
                if (this.field6176) {
                    this.field6162.method1783((byte) 64, this.field6178, 8);
                } else {
                    this.field6162.method1780(8, arg0 - 1, this.field6182);
                }
                this.field6168.method2927(14921, this.field6162);
            } else {
                this.field6168.method2872(126, this.field6162);
                this.field6162.method1782(-1, 0);
                this.field6162.method1782(-1, 1);
                this.field6162.method1782(-1, 8);
                this.field6162.method1783((byte) 64, this.field6183[0], 0);
                if (this.field6181 > 1) {
                    this.field6162.method1783((byte) 64, this.field6183[1], 1);
                }
                if (this.field6176) {
                    this.field6162.method1783((byte) 64, this.field6178, 8);
                }
                this.field6168.method2927(14921, this.field6162);
                this.field6168.method2872(125, this.field6170);
                this.field6170.method1782(-1, 0);
                this.field6170.method1782(-1, 8);
                this.field6170.method1780(0, -1, this.field6179);
                this.field6170.method1780(8, -1, this.field6182);
                this.field6168.method2927(14921, this.field6170);
            }
            this.field6184 = false;
            this.field6177 = true;
        }
        if (this.field6177) {
            this.field6168.method2872(125, this.field6156);
            this.field6177 = !this.field6156.method1789(false);
            this.field6168.method2927(14921, this.field6156);
        }
        if (arg0 == 0) {
            return !this.field6177;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 343)
    private final void method2474(int arg0) {
        field6154++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class495 var5 = (class495) this.field6173.method2096(-21400); var5 != null; var5 = (class495) this.field6173.method2084((byte) 19)) {
            int var9 = var5.method1906(arg0 ^ 0xFFFF87F3);
            var4 += var5.method2970(-54);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method2972(arg0 ^ 0xFFFFA771);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6180 != var6) {
            this.field6175 = true;
            this.field6180 = var6;
        }
        int var7 = this.field6181 <= 2 ? this.field6181 : 2;
        if (arg0 != -28685) {
            this.field6178 = null;
        }
        int var8 = var4 <= 2 ? var4 : 2;
        if (var7 != var8) {
            this.field6184 = this.field6175 = true;
        }
        this.field6181 = var4;
        if (this.field6176 != var2) {
            this.field6176 = var2;
            this.field6185 = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V", line = 409)
    public final void method2475(int arg0) {
        if (arg0 != 33985) {
            this.method2477(null, (byte) 119);
        }
        field6171++;
        if (!this.field6167) {
            return;
        }
        if (this.field6170 != null) {
            this.field6168.method2878(this.field6170, -69);
            int var2 = 16384;
            this.field6168.method2889(this.field6162, 10);
            this.field6170.method1784(-111, 0);
            this.field6162.method1795(0, (byte) -103);
            if (this.field6176) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field6153, this.field6163, 0, 0, this.field6153, this.field6163, var2, 9728);
            this.field6168.method2894(this.field6170, 16711680);
            this.field6168.method2907(255, this.field6162);
        }
        this.field6168.method2925(arg0 - 33108);
        this.field6168.method2852(0, 0);
        this.field6168.method2914(arg0 - 33860, 1);
        this.field6168.method836();
        int var3 = 0;
        int var4 = 1;
        class495 var6;
        for (class495 var5 = (class495) this.field6173.method2096(arg0 - 55385); var5 != null; var5 = var6) {
            var6 = (class495) this.field6173.method2084((byte) 19);
            int var7 = var5.method2970(-126);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1913(arg0 ^ 0x84FE, this.field6178, var8, this.field6183[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field6168.method2927(arg0 - 19064, this.field6162);
                    this.field6168.method2906(86, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6163);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6166, this.field6169);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6166, this.field6169 + this.field6163);
                    OpenGL.glTexCoord2f((float) this.field6153, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6166 + this.field6153, this.field6169 + this.field6163);
                    OpenGL.glTexCoord2f((float) this.field6153, (float) this.field6163);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6166 + this.field6153, this.field6169);
                    OpenGL.glEnd();
                } else {
                    this.field6162.method1795(var4, (byte) -103);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6163);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field6163);
                    OpenGL.glTexCoord2f((float) this.field6153, (float) this.field6163);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6153, this.field6163);
                    OpenGL.glTexCoord2f((float) this.field6153, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6153, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var5.method1908(var8, 77);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field6167 = false;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)Z", line = 517)
    public final boolean method2476(int arg0) {
        field6158++;
        if (arg0 != -1437) {
            method2478(-90);
        }
        return this.field6156 != null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lfm;B)Z", line = 530)
    public final boolean method2477(class495 arg0, byte arg1) {
        int var3 = 15 % ((arg1 - 27) / 59);
        field6164++;
        if (this.field6156 != null) {
            if (arg0.method1904(10221) || arg0.method1905(90)) {
                this.field6173.method2086((byte) -111, arg0);
                this.method2474(-28685);
                if (this.method2473(0)) {
                    if (this.field6153 != -1 && this.field6163 != -1) {
                        arg0.method1909(true, this.field6163, this.field6153);
                    }
                    arg0.field7546 = true;
                    return true;
                }
            }
            this.method2471(18780, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V", line = 580)
    public static void method2478(int arg0) {
        field6161 = null;
        field6160 = null;
        field6157 = null;
        int var1 = 48 / ((47 - arg0) / 35);
    }
}
