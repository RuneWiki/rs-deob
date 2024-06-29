import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class65 extends class192 {

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public static int field1140 = 0;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field1149 = 0;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "Ls;")
    public static class171 field1138;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "Lui;")
    public static class225 field1144;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "Z")
    public static boolean field1139;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lqj;III)V", line = 5)
    public static final void method497(class231 arg0, int arg1, int arg2, int arg3) {
        if ((arg2 & 0x20) != 0) {
            arg0.field945 = class293.field5036.method1614(255);
            arg0.field970 = class293.field5036.method1599(255);
        }
        field1142++;
        if ((arg2 & 0x8) != 0) {
            int var4 = class293.field5036.method1614(arg1 ^ 0x1CA4);
            int var5 = class293.field5036.method1568((byte) 47);
            if (var4 == 65535) {
                var4 = -1;
            }
            class130.method941(var5, 1, var4, arg0);
        }
        if ((arg2 & 0x400) != 0) {
            arg0.field928 = class293.field5036.method1621((byte) -106);
            arg0.field948 = class293.field5036.method1575(255);
            arg0.field919 = class293.field5036.method1589(arg1 ^ 0x1C22);
            arg0.field942 = class293.field5036.method1575(255);
            arg0.field943 = class293.field5036.method1614(255) + class202.field3498;
            arg0.field978 = class293.field5036.method1615(-26) + class202.field3498;
            arg0.field982 = class293.field5036.method1568((byte) 41);
            arg0.field971 = 1;
            arg0.field931 = 0;
        }
        if ((arg2 & 0x100) != 0) {
            int var6 = class293.field5036.method1568((byte) -94);
            int var7 = class293.field5036.method1621((byte) -106);
            arg0.method455(var7, var6, -10, class202.field3498);
        }
        if ((arg2 & 0x200) != 0) {
            arg0.field922 = class293.field5036.method1615(arg1 - 7385);
            int var8 = class293.field5036.method1611(-122);
            if (arg0.field922 == 65535) {
                arg0.field922 = -1;
            }
            arg0.field964 = 0;
            arg0.field980 = (var8 & 0xFFFF) + class202.field3498;
            arg0.field981 = var8 >> 16;
            if (class202.field3498 < arg0.field980) {
                arg0.field964 = -1;
            }
            arg0.field974 = 0;
            if (arg0.field922 != -1 && class202.field3498 == arg0.field980) {
                int var9 = class149.method1022(arg0.field922, false).field3657;
                if (var9 != -1) {
                    class2 var10 = class263.method1842(var9, (byte) -114);
                    if (var10 != null && var10.field41 != null) {
                        class122.method891(class152.field2606 == arg0, arg0.field934, 0, var10, (byte) -111, arg0.field912);
                    }
                }
            }
        }
        if ((arg2 & 0x40) != 0) {
            arg0.field963 = class293.field5036.method1615(-126);
            if (arg0.field963 == 65535) {
                arg0.field963 = -1;
            }
        }
        if (arg1 != 7259) {
            field1138 = (class171) null;
        }
        if ((arg2 & 0x2) != 0) {
            int var11 = class293.field5036.method1575(255);
            int var12 = class293.field5036.method1575(255);
            arg0.method455(var12, var11, arg1 - 7269, class202.field3498);
            arg0.field936 = class202.field3498 + 300;
            arg0.field913 = class293.field5036.method1621((byte) -106);
        }
        if ((arg2 & 0x4) != 0) {
            arg0.field944 = class293.field5036.method1620(92);
            if (arg0.field944.method1798(0, 101) == 126) {
                arg0.field944 = arg0.field944.method1777((byte) 126, 1);
                class140.method965(false, 2, arg0.field944, arg0.method1547((byte) 122));
            } else if (class152.field2606 == arg0) {
                class140.method965(false, 2, arg0.field944, arg0.method1547((byte) 122));
            }
            arg0.field977 = 0;
            arg0.field972 = 150;
            arg0.field962 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var13 = class293.field5036.method1599(arg1 - 7004);
            int var14 = class293.field5036.method1575(255);
            int var15 = class293.field5036.method1621((byte) -106);
            boolean var16 = (var13 & 0x8000) != 0;
            int var17 = class293.field5036.field4051;
            if (arg0.field4007 != null && arg0.field4011 != null) {
                boolean var18 = false;
                long var19 = arg0.field4007.method1769(16);
                if (var14 <= 1) {
                    if (!var16 && (class57.field902 == 1 || class162.field2762 == 1)) {
                        var18 = true;
                    } else {
                        for (int var21 = 0; var21 < class138.field2355; var21++) {
                            if (class209.field3607[var21] == var19) {
                                var18 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var18 && class300.field5133 == 0) {
                    class235.field4081.field4051 = 0;
                    class293.field5036.method1596(295019472, var15, class235.field4081.field4066, 0);
                    class235.field4081.field4051 = 0;
                    int var22 = -1;
                    class258 var24;
                    if (var16) {
                        var13 &= 0x7FFF;
                        class59 var23 = class242.method1650(class235.field4081, (byte) -111);
                        var22 = var23.field983;
                        var24 = var23.field989.method519(class235.field4081, -1);
                    } else {
                        var24 = class35.method254(class261.method1833(false, class235.field4081).method1801((byte) 89));
                    }
                    arg0.field944 = var24.method1817((byte) -48);
                    arg0.field972 = 150;
                    arg0.field977 = var13 & 0xFF;
                    arg0.field962 = var13 >> 8;
                    if (var14 == 2) {
                        class122.method893(class100.method755(-6, new class258[] { class297.field5088, arg0.method1547((byte) 122) }), (class258) null, var16 ? 17 : 1, var24, arg1 - 8818, var22);
                    } else if (var14 == 1) {
                        class122.method893(class100.method755(-6, new class258[] { class308.field5223, arg0.method1547((byte) 122) }), (class258) null, var16 ? 17 : 1, var24, arg1 ^ 0xFFFFE5B2, var22);
                    } else {
                        class122.method893(arg0.method1547((byte) 122), (class258) null, var16 ? 17 : 2, var24, -1559, var22);
                    }
                }
            }
            class293.field5036.field4051 = var15 + var17;
        }
        if ((arg2 & 0x10) == 0) {
            return;
        }
        int var25 = class293.field5036.method1568((byte) 79);
        byte[] var26 = new byte[var25];
        class235 var27 = new class235(var26);
        class293.field5036.method1596(295019472, var25, var26, 0);
        class26.field303[arg3] = var27;
        arg0.method1541((byte) -75, var27);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(IIII)I", line = 247)
    public static final int method498(int arg0, int arg1, int arg2, int arg3) {
        field1146++;
        if (arg0 == arg1) {
            return arg0;
        }
        int var4 = 128 - arg3;
        if (arg2 != -15817) {
            method498(-109, -34, -77, 24);
        }
        int var5 = ((arg0 & 0xFF00FF00) >>> 7) * var4 + (arg1 >>> 7 & 0x1FE01FE) * arg3 & 0xFF00FF00;
        int var6 = (arg0 & 0xFF00FF) * var4 + ((arg1 & 0xFF00FF) * arg3) & 0xFF00FF00;
        return var5 + (var6 >> 7);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)V", line = 278)
    public static final void method499(int arg0, int arg1) {
        class228 var2 = class178.field3180[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class228 var4 = class178.field3180[var3][arg0][arg1] = class178.field3180[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3941--;
                for (int var5 = 0; var5 < var4.field3950; var5++) {
                    class219 var6 = var4.field3932[var5];
                    if ((var6.field3795 >> 29 & 0x3L) == 2L && var6.field3793 == arg0 && var6.field3797 == arg1) {
                        var6.field3804--;
                    }
                }
            }
        }
        if (class178.field3180[0][arg0][arg1] == null) {
            class178.field3180[0][arg0][arg1] = new class228(0, arg0, arg1);
        }
        class178.field3180[0][arg0][arg1].field3937 = var2;
        class178.field3180[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(IIIII)V", line = 326)
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1143++;
        int var6 = this.field1136 << 3;
        if (arg1 <= 124) {
            this.method316(-8, -15, 87, -13);
        }
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field1145 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method315(var6, var8, var7, var9, arg2, arg3);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIZ)V", line = 353)
    public static final void method501(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class23.field277 = arg1;
        class290.field4995 = arg2;
        class297.field5101 = arg3;
        class27.field329 = new class228[arg0][class23.field277][class290.field4995];
        class134.field2317 = new int[arg0][class23.field277 + 1][class290.field4995 + 1];
        if (class257.field4390) {
            class301.field5159 = new class157[4][];
        }
        if (arg4) {
            class108.field1915 = new class228[1][class23.field277][class290.field4995];
            class299.field5116 = new int[class23.field277][class290.field4995];
            class144.field2424 = new int[1][class23.field277 + 1][class290.field4995 + 1];
            if (class257.field4390) {
                class38.field503 = new class157[1][];
            }
        } else {
            class108.field1915 = (class228[][][]) null;
            class299.field5116 = (int[][]) null;
            class144.field2424 = (int[][][]) null;
            class38.field503 = (class157[][]) null;
        }
        class75.method549(false);
        class84.field1428 = new class226[500];
        class63.field1099 = 0;
        class36.field480 = new class226[500];
        class117.field2084 = 0;
        class149.field2529 = new int[arg0][class23.field277 + 1][class290.field4995 + 1];
        class42.field597 = new class219[5000];
        class145.field2448 = 0;
        class110.field1932 = new class219[100];
        class232.field4032 = new boolean[class297.field5101 + class297.field5101 + 1][class297.field5101 + class297.field5101 + 1];
        class155.field2658 = new boolean[class297.field5101 + class297.field5101 + 2][class297.field5101 + class297.field5101 + 2];
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)V", line = 399)
    public static void method502(byte arg0) {
        if (arg0 != -122) {
            method502((byte) -91);
        }
        field1144 = null;
        field1138 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)V")
    public abstract void method316(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
    public abstract void method327(int arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(IIIII)V")
    public abstract void method329(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
    public abstract void method322(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII)V")
    public abstract void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(II)V")
    public abstract void method321(int arg0, int arg1);
}
