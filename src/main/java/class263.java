import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class263 extends class288 {

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "Z")
    public static boolean field4160 = false;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Leg;")
    public static class272 field4165 = new class272(100);

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "Ljj;")
    public static class134 field4169;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "[I")
    public static int[] field4168;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "[Lp;")
    private class88[] field4166;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([[II)V")
    private final void method1722(int[][] arg0, int arg1) {
        ++field4161;
        int var3 = class186.field2986;
        int var4 = class205.field3296;
        class115.method824(arg0, -23780);
        class5.method36(class34.field422, class144.field2332, 0, -128, 0);
        if (this.field4166 != null) {
            for (int var5 = 0; this.field4166.length > var5; ++var5) {
                class88 var6 = this.field4166[var5];
                int var7 = var6.field1208;
                int var8 = var6.field1207;
                if (~var8 <= -1) {
                    if (~var7 <= -1) {
                        var6.method620(-1, var3, var4);
                    } else {
                        var6.method621(var3, var4, 0);
                    }
                } else if (var7 >= 0) {
                    var6.method629(var3, var4, (byte) 84);
                }
            }
        }
        if (arg1 != 17544) {
            field4160 = false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
    public static final void method1723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4163;
        int var6 = arg5 - arg3;
        int var7 = -arg0 + arg1;
        if (var6 == 0) {
            if (~var7 != -1) {
                class179.method1246(arg0, arg3, true, arg2, arg1);
            }
        } else if (var7 == 0) {
            class194.method1319(false, arg3, arg0, arg2, arg5);
        } else {
            if (arg4 != 255) {
                method1725(23, -24);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg3 * var8 >> 12) + arg0;
            int var10;
            int var11;
            if (class58.field817 > arg3) {
                var10 = (class58.field817 * var8 >> 12) + var9;
                var11 = class58.field817;
            } else if (~arg3 >= ~class121.field2042) {
                var11 = arg3;
                var10 = arg0;
            } else {
                var10 = (class121.field2042 * var8 >> 12) + var9;
                var11 = class121.field2042;
            }
            if (var10 >= class156.field2507) {
                if (~var10 < ~client.field3617) {
                    var10 = client.field3617;
                    var11 = (client.field3617 - var9 << 12) / var8;
                }
            } else {
                var10 = class156.field2507;
                var11 = (class156.field2507 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (~arg5 <= ~class58.field817) {
                if (~arg5 >= ~class121.field2042) {
                    var12 = arg5;
                    var13 = arg1;
                } else {
                    var12 = class121.field2042;
                    var13 = (class121.field2042 * var8 >> 12) + var9;
                }
            } else {
                var13 = (class58.field817 * var8 >> 12) + var9;
                var12 = class58.field817;
            }
            if (var13 < class156.field2507) {
                var13 = class156.field2507;
                var12 = (-var9 + class156.field2507 << 12) / var8;
            } else if (~var13 < ~client.field3617) {
                var13 = client.field3617;
                var12 = (-var9 + client.field3617 << 12) / var8;
            }
            class181.method1249(arg2, var13, var10, var11, -96, var12);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class263() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    public static void method1724(int arg0) {
        field4169 = null;
        field4168 = null;
        field4165 = null;
        if (arg0 != 4080) {
            method1726((String) null, false, 74);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)I")
    public static final int method1725(int arg0, int arg1) {
        int var2 = -31 % ((arg1 - -86) / 39);
        ++field4172;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1726(String arg0, boolean arg1, int arg2) {
        if (arg1) {
            try {
                class279.field4467.getAppletContext().showDocument(new URL(class279.field4467.getCodeBase(), arg0), "_blank");
            } catch (Exception var5) {
            }
        } else {
            try {
                class27.method184((byte) 90, "loggedout", class250.field4006.field4090);
            } catch (Throwable var4) {
            }
            try {
                class279.field4467.getAppletContext().showDocument(new URL(class279.field4467.getCodeBase(), arg0), "_top");
            } catch (Exception var3) {
            }
        }
        if (arg2 != -17137) {
            method1725(47, 21);
        }
        ++field4164;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)I")
    public static final int method1727(byte arg0, int arg1) {
        ++field4167;
        return arg0 <= 30 ? -1 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            field4169 = null;
        }
        ++field4162;
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954) {
            int var4 = class186.field2986;
            int var5 = class205.field3296;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4598.method817(arg0 + -2);
            this.method1722(var6, 17544);
            for (int var8 = 0; var8 < class205.field3296; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class186.field2986; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class204.method1369(4080, var15 << 4);
                    var12[var14] = class204.method1369(65280, var15) >> 4;
                    var11[var14] = class204.method1369(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(II)V")
    public static final void method1728(int arg0, int arg1) {
        ++field4170;
        class283 var2 = class46.method360(11, -66, arg1);
        var2.method1900(true);
        if (arg0 > -118) {
            field4160 = false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field4171;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field4612 = ~arg0.method1779(arg1 + -105) == -2;
            }
        } else {
            this.field4166 = new class88[arg0.method1779(-113)];
            for (int var4 = 0; ~this.field4166.length < ~var4; ++var4) {
                int var5 = arg0.method1779(-75);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field4166[var4] = class102.method715(arg0, 0);
                            }
                        } else {
                            this.field4166[var4] = class94.method655(arg0, -62);
                        }
                    } else {
                        this.field4166[var4] = class289.method1935(arg0, class223.method1477(arg1, -12175));
                    }
                } else {
                    this.field4166[var4] = class250.method1648((byte) 73, arg0);
                }
            }
        }
        if (arg1 != -19) {
            method1727((byte) 127, 16);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field4173;
        if (arg0 != 0) {
            this.method20((class264) null, (byte) 99, 16);
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            this.method1722(super.field4609.method583(9115), 17544);
        }
        return var3;
    }
}
