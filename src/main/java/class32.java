import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KZCOXKKW")
public class class32 extends class17 {

    @OriginalMember(owner = "client!KZCOXKKW", name = "rb", descriptor = "Z")
    public boolean field921 = false;

    @OriginalMember(owner = "client!KZCOXKKW", name = "sb", descriptor = "I")
    public int field922 = -1;

    @OriginalMember(owner = "client!KZCOXKKW", name = "tb", descriptor = "[I")
    public int[] field923 = new int[12];

    @OriginalMember(owner = "client!KZCOXKKW", name = "xb", descriptor = "I")
    public int field927 = -1;

    @OriginalMember(owner = "client!KZCOXKKW", name = "yb", descriptor = "[I")
    public int[] field928 = new int[5];

    @OriginalMember(owner = "client!KZCOXKKW", name = "Cb", descriptor = "I")
    private int field932 = 8;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Eb", descriptor = "J")
    public long field934 = -1L;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Gb", descriptor = "B")
    private byte field936 = -108;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Ib", descriptor = "Z")
    private boolean field938 = false;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Ob", descriptor = "I")
    private int field944 = 978;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Wb", descriptor = "Z")
    public boolean field952 = false;

    @OriginalMember(owner = "client!KZCOXKKW", name = "wb", descriptor = "LBMKJVFXV;")
    public static class6 field926 = new class6(688, 260);

    @OriginalMember(owner = "client!KZCOXKKW", name = "vb", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!KZCOXKKW", name = "zb", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Bb", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Db", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Fb", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Hb", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Jb", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Kb", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Lb", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Mb", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Nb", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Qb", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Rb", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Sb", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Tb", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Ub", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Pb", descriptor = "J")
    public long field945;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Vb", descriptor = "LRMLAXPMV;")
    public class47 field951;

    @OriginalMember(owner = "client!KZCOXKKW", name = "Ab", descriptor = "LYSYPMZMO;")
    public class70 field930;

    @OriginalMember(owner = "client!KZCOXKKW", name = "ub", descriptor = "Ljava/lang/String;")
    public String field924;

    @OriginalMember(owner = "client!KZCOXKKW", name = "b", descriptor = "(I)LRMLAXPMV;")
    public final class47 method352(int arg0) {
        if (!this.field921) {
            return null;
        } else if (this.field930 != null) {
            return this.field930.method600(this.field932);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field923[var3];
                if (var13 >= 256 && var13 < 512 && !class18.field741[var13 - 256].method314(-32142)) {
                    var2 = true;
                }
                if (var13 >= 512 && !class45.method455(var13 - 512).method449(this.field933, true)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class47[] var4 = new class47[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field923[var6];
                    if (var10 >= 256 && var10 < 512) {
                        class47 var11 = class18.field741[var10 - 256].method315(-26531);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class47 var12 = class45.method455(var10 - 512).method457(this.field933, (byte) 113);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                if (arg0 <= 0) {
                    for (int var7 = 1; var7 > 0; ++var7) {
                    }
                }
                class47 var8 = new class47(var5, var4, 118);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field928[var9] != 0) {
                        var8.method480(client.field413[var9][0], client.field413[var9][this.field928[var9]]);
                        if (var9 == 1) {
                            var8.method480(client.field508[0], client.field508[this.field928[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!KZCOXKKW", name = "a", descriptor = "(I)Z")
    public final boolean method307(int arg0) {
        if (arg0 != 39489) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field921;
    }

    @OriginalMember(owner = "client!KZCOXKKW", name = "a", descriptor = "(B)LRMLAXPMV;")
    public final class47 method344(byte arg0) {
        if (!this.field921) {
            return null;
        } else {
            class47 var2 = this.method353(-291);
            if (var2 == null) {
                return null;
            } else {
                super.field712 = var2.field1241;
                var2.field1369 = true;
                if (this.field952) {
                    return var2;
                } else {
                    if (super.field728 != -1 && super.field729 != -1) {
                        class37 var3 = class37.field991[super.field728];
                        class47 var4 = var3.method367();
                        if (var4 != null) {
                            class47 var5 = new class47(var4, class67.method586(true, super.field729), true, false, true);
                            var5.method479(0, 0, -super.field732, -356);
                            var5.method473(8);
                            var5.method474(-770, var3.field995.field889[super.field729]);
                            var5.field1368 = null;
                            var5.field1367 = null;
                            if (var3.field998 != 128 || var3.field999 != 128) {
                                var5.method482(var3.field999, var3.field998, var3.field998, this.field937);
                            }
                            var5.method483(var3.field1001 + 64, var3.field1002 + 850, -30, -50, -30, true);
                            class47[] var6 = new class47[] { var2, var5 };
                            var2 = new class47(2, true, 18217, var6);
                        }
                    }
                    if (this.field951 != null) {
                        if (client.field396 >= this.field947) {
                            this.field951 = null;
                        }
                        if (client.field396 >= this.field946 && client.field396 < this.field947) {
                            class47 var7 = this.field951;
                            var7.method479(this.field950 - super.field707, this.field948 - super.field706, this.field949 - this.field925, -356);
                            if (super.field717 == 512) {
                                var7.method477(861);
                                var7.method477(861);
                                var7.method477(861);
                            } else if (super.field717 == 1024) {
                                var7.method477(861);
                                var7.method477(861);
                            } else if (super.field717 == 1536) {
                                var7.method477(861);
                            }
                            class47[] var8 = new class47[] { var2, var7 };
                            var2 = new class47(2, true, 18217, var8);
                            if (super.field717 == 512) {
                                var7.method477(861);
                            } else if (super.field717 == 1024) {
                                var7.method477(861);
                                var7.method477(861);
                            } else if (super.field717 == 1536) {
                                var7.method477(861);
                                var7.method477(861);
                                var7.method477(861);
                            }
                            var7.method479(super.field707 - this.field950, super.field706 - this.field948, this.field925 - this.field949, -356);
                        }
                    }
                    var2.field1369 = true;
                    if (arg0 != 3) {
                        this.field931 = -12;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!KZCOXKKW", name = "c", descriptor = "(I)LRMLAXPMV;")
    private final class47 method353(int arg0) {
        if (this.field930 != null) {
            int var2 = -1;
            if (super.field698 >= 0 && super.field701 == 0) {
                var2 = class29.field887[super.field698].field889[super.field699];
            } else if (super.field723 >= 0) {
                var2 = class29.field887[super.field723].field889[super.field724];
            }
            return this.field930.method593(0, (int[]) null, var2, -1);
        } else {
            long var4 = this.field945;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field698 >= 0 && super.field701 == 0) {
                class29 var10 = class29.field887[super.field698];
                var6 = var10.field889[super.field699];
                if (super.field723 >= 0 && super.field723 != super.field696) {
                    var7 = class29.field887[super.field723].field889[super.field724];
                }
                if (var10.field896 >= 0) {
                    var8 = var10.field896;
                    var4 += (long) (var8 - this.field923[5] << 8);
                }
                if (var10.field897 >= 0) {
                    var9 = var10.field897;
                    var4 += (long) (var9 - this.field923[3] << 16);
                }
            } else if (super.field723 >= 0) {
                var6 = class29.field887[super.field723].field889[super.field724];
            }
            class47 var11 = (class47) field926.method32(var4);
            if (arg0 >= 0) {
                throw new NullPointerException();
            } else {
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field923[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class18.field741[var14 - 256].method312(539)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class45.method455(var14 - 512).method454(46523, this.field933)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field934 != -1L) {
                            var11 = (class47) field926.method32(this.field934);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class47[] var15 = new class47[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field923[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class47 var20 = class18.field741[var19 - 256].method313(true);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class47 var21 = class45.method455(var19 - 512).method453(this.field933, this.field944);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class47(var16, var15, 118);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field928[var18] != 0) {
                            var11.method480(client.field413[var18][0], client.field413[var18][this.field928[var18]]);
                            if (var18 == 1) {
                                var11.method480(client.field508[0], client.field508[this.field928[var18]]);
                            }
                        }
                    }
                    var11.method473(8);
                    var11.method483(64, 850, -30, -50, -30, true);
                    field926.method33(var4, var11, this.field936);
                    this.field934 = var4;
                }
                if (this.field952) {
                    return var11;
                } else {
                    class47 var22 = class47.field1332;
                    var22.method468(class67.method586(true, var6) & class67.method586(true, var7), var11, 52);
                    if (var6 != -1 && var7 != -1) {
                        var22.method475(-368, var7, var6, class29.field887[super.field698].field893);
                    } else if (var6 != -1) {
                        var22.method474(-770, var6);
                    }
                    var22.method470((byte) 9);
                    var22.field1368 = null;
                    var22.field1367 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "client!KZCOXKKW", name = "a", descriptor = "(ZLBSNPYLEV;)V")
    public final void method354(boolean arg0, class7 arg1) {
        arg1.field91 = 0;
        this.field933 = arg1.method47();
        this.field927 = arg1.method48();
        this.field922 = arg1.method48();
        this.field930 = null;
        this.field929 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method47();
            if (var4 == 0) {
                this.field923[var3] = 0;
            } else {
                int var5 = arg1.method47();
                this.field923[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field923[0] == 65535) {
                    this.field930 = class70.method597(arg1.method49());
                    break;
                }
                if (this.field923[var3] >= 512 && this.field923[var3] - 512 < class45.field1244) {
                    int var12 = class45.method455(this.field923[var3] - 512).field1251;
                    if (var12 != 0) {
                        this.field929 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method47();
            if (var11 < 0 || var11 >= client.field413[var6].length) {
                var11 = 0;
            }
            this.field928[var6] = var11;
        }
        super.field696 = arg1.method49();
        if (super.field696 == 65535) {
            super.field696 = -1;
        }
        super.field697 = arg1.method49();
        if (super.field697 == 65535) {
            super.field697 = -1;
        }
        super.field683 = arg1.method49();
        if (super.field683 == 65535) {
            super.field683 = -1;
        }
        super.field684 = arg1.method49();
        if (super.field684 == 65535) {
            super.field684 = -1;
        }
        super.field685 = arg1.method49();
        if (super.field685 == 65535) {
            super.field685 = -1;
        }
        super.field686 = arg1.method49();
        if (super.field686 == 65535) {
            super.field686 = -1;
        }
        super.field727 = arg1.method49();
        if (super.field727 == 65535) {
            super.field727 = -1;
        }
        this.field924 = class51.method509(class51.method506(false, arg1.method53((byte) 51)), true);
        this.field935 = arg1.method47();
        this.field943 = arg1.method49();
        this.field921 = true;
        this.field945 = 0L;
        int var7 = this.field923[5];
        int var8 = this.field923[9];
        if (arg0) {
            this.field938 = !this.field938;
        }
        this.field923[5] = var8;
        this.field923[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field945 <<= 4;
            if (this.field923[var9] >= 256) {
                this.field945 += (long) (this.field923[var9] - 256);
            }
        }
        if (this.field923[0] >= 256) {
            this.field945 += (long) (this.field923[0] - 256 >> 4);
        }
        if (this.field923[1] >= 256) {
            this.field945 += (long) (this.field923[1] - 256 >> 8);
        }
        this.field923[5] = var7;
        this.field923[9] = var8;
        for (int var10 = 0; var10 < 5; ++var10) {
            this.field945 <<= 3;
            this.field945 += (long) this.field928[var10];
        }
        this.field945 <<= 1;
        this.field945 += (long) this.field933;
    }
}
