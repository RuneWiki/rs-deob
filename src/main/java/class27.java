import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KVXZMJHR")
public class class27 extends class35 {

    @OriginalMember(owner = "client!KVXZMJHR", name = "qb", descriptor = "Z")
    private boolean field938 = false;

    @OriginalMember(owner = "client!KVXZMJHR", name = "xb", descriptor = "I")
    public int field945 = -1;

    @OriginalMember(owner = "client!KVXZMJHR", name = "yb", descriptor = "I")
    private int field946 = -22770;

    @OriginalMember(owner = "client!KVXZMJHR", name = "zb", descriptor = "J")
    public long field947 = -1L;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Bb", descriptor = "I")
    public int field949 = -1;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Db", descriptor = "Z")
    public boolean field951 = false;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Hb", descriptor = "Z")
    public boolean field955 = false;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Lb", descriptor = "[I")
    public int[] field959 = new int[12];

    @OriginalMember(owner = "client!KVXZMJHR", name = "Rb", descriptor = "[I")
    public int[] field965 = new int[5];

    @OriginalMember(owner = "client!KVXZMJHR", name = "Ib", descriptor = "LEQSIBNHW;")
    public static class10 field956 = new class10(260, 451);

    @OriginalMember(owner = "client!KVXZMJHR", name = "rb", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!KVXZMJHR", name = "sb", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!KVXZMJHR", name = "tb", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!KVXZMJHR", name = "ub", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Ab", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Cb", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Gb", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Jb", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Kb", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Mb", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Nb", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Ob", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Pb", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Qb", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Fb", descriptor = "J")
    public long field953;

    @OriginalMember(owner = "client!KVXZMJHR", name = "vb", descriptor = "LIYSWJGDE;")
    public class19 field943;

    @OriginalMember(owner = "client!KVXZMJHR", name = "wb", descriptor = "LPIPBZEOV;")
    public class44 field944;

    @OriginalMember(owner = "client!KVXZMJHR", name = "Eb", descriptor = "Ljava/lang/String;")
    public String field952;

    @OriginalMember(owner = "client!KVXZMJHR", name = "b", descriptor = "(I)LIYSWJGDE;")
    public final class19 method322(int arg0) {
        if (!this.field955) {
            return null;
        } else if (this.field944 != null) {
            return this.field944.method399(-491);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field959[var3];
                if (var12 >= 256 && var12 < 512 && !class54.field1461[var12 - 256].method500(3)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class56.method544(var12 - 512).method549(6, this.field964)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class19[] var4 = new class19[12];
                if (arg0 != 0) {
                    throw new NullPointerException();
                } else {
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field959[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class19 var10 = class54.field1461[var9 - 256].method501(-619);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class19 var11 = class56.method544(var9 - 512).method547(this.field964, (byte) 3);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class19 var7 = new class19((byte) 9, var5, var4);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field965[var8] != 0) {
                            var7.method287(client.field309[var8][0], client.field309[var8][this.field965[var8]]);
                            if (var8 == 1) {
                                var7.method287(client.field415[0], client.field415[this.field965[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!KVXZMJHR", name = "c", descriptor = "(I)LIYSWJGDE;")
    private final class19 method323(int arg0) {
        if (this.field944 != null) {
            int var2 = -1;
            if (super.field1117 >= 0 && super.field1120 == 0) {
                var2 = class26.field921[super.field1117].field923[super.field1118];
            } else if (super.field1094 >= 0) {
                var2 = class26.field921[super.field1094].field923[super.field1095];
            }
            return this.field944.method401(this.field946, (int[]) null, var2, -1);
        } else {
            long var4 = this.field953;
            if (arg0 != -37900) {
                throw new NullPointerException();
            } else {
                int var6 = -1;
                int var7 = -1;
                int var8 = -1;
                int var9 = -1;
                if (super.field1117 >= 0 && super.field1120 == 0) {
                    class26 var10 = class26.field921[super.field1117];
                    var6 = var10.field923[super.field1118];
                    if (super.field1094 >= 0 && super.field1094 != super.field1072) {
                        var7 = class26.field921[super.field1094].field923[super.field1095];
                    }
                    if (var10.field930 >= 0) {
                        var8 = var10.field930;
                        var4 += (long) (var8 - this.field959[5] << 8);
                    }
                    if (var10.field931 >= 0) {
                        var9 = var10.field931;
                        var4 += (long) (var9 - this.field959[3] << 16);
                    }
                } else if (super.field1094 >= 0) {
                    var6 = class26.field921[super.field1094].field923[super.field1095];
                }
                class19 var11 = (class19) field956.method175(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field959[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class54.field1461[var14 - 256].method498(-303)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class56.method544(var14 - 512).method552(this.field964, -21181)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field947 != -1L) {
                            var11 = (class19) field956.method175(this.field947);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class19[] var15 = new class19[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field959[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class19 var20 = class54.field1461[var19 - 256].method499(-413);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class19 var21 = class56.method544(var19 - 512).method542((byte) 3, this.field964);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class19((byte) 9, var16, var15);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field965[var18] != 0) {
                            var11.method287(client.field309[var18][0], client.field309[var18][this.field965[var18]]);
                            if (var18 == 1) {
                                var11.method287(client.field415[0], client.field415[this.field965[var18]]);
                            }
                        }
                    }
                    var11.method280(true);
                    var11.method290(64, 850, -30, -50, -30, true);
                    field956.method176(825, var4, var11);
                    this.field947 = var4;
                }
                if (this.field951) {
                    return var11;
                } else {
                    class19 var22 = class19.field806;
                    var22.method275(class45.method406(61, var6) & class45.method406(61, var7), 0, var11);
                    if (var6 != -1 && var7 != -1) {
                        var22.method282(var7, var6, class26.field921[super.field1117].field927, (byte) 8);
                    } else if (var6 != -1) {
                        var22.method281(true, var6);
                    }
                    var22.method277(-367);
                    var22.field842 = null;
                    var22.field841 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "client!KVXZMJHR", name = "a", descriptor = "(ILSVWJKJVI;)V")
    public final void method324(int arg0, class52 arg1) {
        arg1.field1434 = 0;
        this.field964 = arg1.method461();
        this.field945 = arg1.method462();
        this.field949 = arg1.method462();
        this.field944 = null;
        this.field939 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method461();
            if (var4 == 0) {
                this.field959[var3] = 0;
            } else {
                int var5 = arg1.method461();
                this.field959[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field959[0] == 65535) {
                    this.field944 = class44.method398(arg1.method463());
                    break;
                }
                if (this.field959[var3] >= 512 && this.field959[var3] - 512 < class56.field1509) {
                    int var12 = class56.method544(this.field959[var3] - 512).field1522;
                    if (var12 != 0) {
                        this.field939 = var12;
                    }
                }
            }
        }
        if (arg0 == 0) {
            for (int var6 = 0; var6 < 5; ++var6) {
                int var11 = arg1.method461();
                if (var11 < 0 || var11 >= client.field309[var6].length) {
                    var11 = 0;
                }
                this.field965[var6] = var11;
            }
            super.field1072 = arg1.method463();
            if (super.field1072 == 65535) {
                super.field1072 = -1;
            }
            super.field1073 = arg1.method463();
            if (super.field1073 == 65535) {
                super.field1073 = -1;
            }
            super.field1113 = arg1.method463();
            if (super.field1113 == 65535) {
                super.field1113 = -1;
            }
            super.field1114 = arg1.method463();
            if (super.field1114 == 65535) {
                super.field1114 = -1;
            }
            super.field1115 = arg1.method463();
            if (super.field1115 == 65535) {
                super.field1115 = -1;
            }
            super.field1116 = arg1.method463();
            if (super.field1116 == 65535) {
                super.field1116 = -1;
            }
            super.field1124 = arg1.method463();
            if (super.field1124 == 65535) {
                super.field1124 = -1;
            }
            this.field952 = class3.method9(27250, class3.method6(357, arg1.method467((byte) 50)));
            this.field950 = arg1.method461();
            this.field954 = arg1.method463();
            this.field955 = true;
            this.field953 = 0L;
            int var7 = this.field959[5];
            int var8 = this.field959[9];
            this.field959[5] = var8;
            this.field959[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field953 <<= 4;
                if (this.field959[var9] >= 256) {
                    this.field953 += (long) (this.field959[var9] - 256);
                }
            }
            if (this.field959[0] >= 256) {
                this.field953 += (long) (this.field959[0] - 256 >> 4);
            }
            if (this.field959[1] >= 256) {
                this.field953 += (long) (this.field959[1] - 256 >> 8);
            }
            this.field959[5] = var7;
            this.field959[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field953 <<= 3;
                this.field953 += (long) this.field965[var10];
            }
            this.field953 <<= 1;
            this.field953 += (long) this.field964;
        }
    }

    @OriginalMember(owner = "client!KVXZMJHR", name = "a", descriptor = "(Z)LIYSWJGDE;")
    public final class19 method2(boolean arg0) {
        if (!this.field955) {
            return null;
        } else {
            class19 var2 = this.method323(-37900);
            if (var2 == null) {
                return null;
            } else {
                super.field1070 = var2.field884;
                var2.field843 = true;
                if (this.field951) {
                    return var2;
                } else {
                    if (super.field1102 != -1 && super.field1103 != -1) {
                        class50 var3 = class50.field1354[super.field1102];
                        class19 var4 = var3.method448();
                        if (var4 != null) {
                            class19 var5 = new class19(class45.method406(61, super.field1103), var4, 946, true, false);
                            var5.method286(-super.field1106, 0, 600, 0);
                            var5.method280(true);
                            var5.method281(true, var3.field1358.field923[super.field1103]);
                            var5.field842 = null;
                            var5.field841 = null;
                            if (var3.field1361 != 128 || var3.field1362 != 128) {
                                var5.method289(var3.field1361, 471, var3.field1361, var3.field1362);
                            }
                            var5.method290(var3.field1364 + 64, var3.field1365 + 850, -30, -50, -30, true);
                            class19[] var6 = new class19[] { var2, var5 };
                            var2 = new class19(var6, 2, true, (byte) 2);
                        }
                    }
                    if (this.field943 != null) {
                        if (client.field346 >= this.field958) {
                            this.field943 = null;
                        }
                        if (client.field346 >= this.field957 && client.field346 < this.field958) {
                            class19 var7 = this.field943;
                            var7.method286(this.field941 - this.field948, this.field942 - super.field1079, 600, this.field940 - super.field1078);
                            if (super.field1069 == 512) {
                                var7.method284(-325);
                                var7.method284(-325);
                                var7.method284(-325);
                            } else if (super.field1069 == 1024) {
                                var7.method284(-325);
                                var7.method284(-325);
                            } else if (super.field1069 == 1536) {
                                var7.method284(-325);
                            }
                            class19[] var8 = new class19[] { var2, var7 };
                            var2 = new class19(var8, 2, true, (byte) 2);
                            if (super.field1069 == 512) {
                                var7.method284(-325);
                            } else if (super.field1069 == 1024) {
                                var7.method284(-325);
                                var7.method284(-325);
                            } else if (super.field1069 == 1536) {
                                var7.method284(-325);
                                var7.method284(-325);
                                var7.method284(-325);
                            }
                            var7.method286(this.field948 - this.field941, super.field1079 - this.field942, 600, super.field1078 - this.field940);
                        }
                    }
                    var2.field843 = true;
                    if (!arg0) {
                        this.field938 = !this.field938;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!KVXZMJHR", name = "a", descriptor = "(I)Z")
    public final boolean method325(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            this.field938 = !this.field938;
        }
        return this.field955;
    }
}
