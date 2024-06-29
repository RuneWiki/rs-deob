import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class107 extends class58 {

    @OriginalMember(owner = "client!ok", name = "Lb", descriptor = "Loh;")
    public static class258 field1905 = class153.method1046("::clientdrop", 104);

    @OriginalMember(owner = "client!ok", name = "Sb", descriptor = "Loh;")
    public static class258 field1912 = class153.method1046("overlay2", 96);

    @OriginalMember(owner = "client!ok", name = "Ob", descriptor = "Loh;")
    public static class258 field1908 = class153.method1046(" weitere Optionen", 114);

    @OriginalMember(owner = "client!ok", name = "Nb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ok", name = "Pb", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ok", name = "Qb", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ok", name = "Rb", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ok", name = "Tb", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ok", name = "Ub", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ok", name = "Mb", descriptor = "Lmk;")
    public class151 field1906;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIJ)V", line = 17)
    public final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1913++;
        if (this.field1906 == null) {
            return;
        }
        class2 var11 = this.field965 != -1 && this.field969 == 0 ? class263.method1842(this.field965, (byte) -114) : null;
        class2 var12 = this.field909 == -1 || this.field929 == this.field909 && var11 != null ? null : class263.method1842(this.field909, (byte) -114);
        class305 var13 = this.field1906.method1033(this.field966, this.field933, var12, var11, 0);
        if (var13 == null) {
            return;
        }
        this.field921 = var13.method361();
        class151 var14 = this.field1906;
        if (var14.field2545 != null) {
            var14 = var14.method1035(-6941);
        }
        if (class90.field1587 && var14.field2580) {
            class305 var15 = class85.method611(this.field1906.field2555, var13, this.field1906.field2558, this.field1906.field2548, this.field932, this.field912, 14691, var12 == null ? this.field966 : this.field933, this.field934, this.field1906.field2559, this.field908, this.field1906.field2570, var12 == null ? var11 : var12, arg0);
            if (class257.field4390) {
                float var16 = class257.method1747();
                float var17 = class257.method1757();
                class257.method1746();
                class257.method1728(var16, var17 - 150.0F);
                var15.method363(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class257.method1754();
                class257.method1728(var16, var17);
            } else {
                var15.method363(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field1906.field2582 != 0 || this.field1906.field2577 != 0) {
            int var21 = class266.field4636[arg0];
            int var22 = class266.field4642[arg0];
            short var23 = this.field1906.field2582;
            short var24 = this.field1906.field2577;
            int var25 = -var23 / 2;
            int var26 = -var24 / 2;
            int var27 = var21 * var26 - (var22 * var25) >> 16;
            int var28 = var21 * var25 + var22 * var26 >> 16;
            int var29 = class228.method1525(true, class272.field4704, this.field934 + var27, this.field912 + var28);
            int var30 = var23 / 2;
            int var31 = -var24 / 2;
            int var32 = var22 * var31 + (var21 * var30) >> 16;
            int var33 = -var23 / 2;
            int var34 = var24 / 2;
            int var35 = var21 * var31 - (var22 * var30) >> 16;
            int var36 = class228.method1525(true, class272.field4704, this.field934 + var35, this.field912 + var32);
            int var37 = var21 * var33 + var22 * var34 >> 16;
            int var38 = var21 * var34 - (var22 * var33) >> 16;
            int var39 = class228.method1525(true, class272.field4704, this.field934 + var38, this.field912 + var37);
            int var40 = var23 / 2;
            int var41 = var24 / 2;
            int var42 = var21 * var40 + var22 * var41 >> 16;
            int var43 = var21 * var41 - var22 * var40 >> 16;
            int var44 = var29 >= var36 ? var36 : var29;
            int var45 = var29 >= var39 ? var39 : var29;
            int var46 = class228.method1525(true, class272.field4704, this.field934 + var43, this.field912 + var42);
            int var47 = var29 + var46;
            int var48 = var39 < var46 ? var39 : var46;
            if (var36 + var39 < var47) {
                var47 = var36 + var39;
            }
            if (var24 != 0) {
                var18 = (int) (Math.atan2((double) (var44 - var48), (double) var24) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method638(var18);
                }
            }
            int var49 = var36 >= var46 ? var46 : var36;
            if (var23 != 0) {
                var20 = (int) (Math.atan2((double) (var45 - var49), (double) var23) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var13.method642(var20);
                }
            }
            var19 = (var47 >> 1) - this.field908;
            if (var19 != 0) {
                var13.method637(0, var19, 0);
            }
        }
        class305 var50 = null;
        if (this.field922 != -1 && this.field964 != -1) {
            class212 var51 = class149.method1022(this.field922, false);
            var50 = var51.method1417((byte) -62, this.field964);
            if (var50 != null) {
                var50.method637(0, -this.field981, 0);
                if (var51.field3649) {
                    if (var18 != 0) {
                        var50.method638(var18);
                    }
                    if (var20 != 0) {
                        var50.method642(var20);
                    }
                    if (var19 != 0) {
                        var50.method637(0, var19, 0);
                    }
                }
            }
        }
        if (!class257.field4390) {
            if (var50 != null) {
                var13 = ((class89) var13).method639(var50);
            }
            if (this.field1906.field2548 == 1) {
                var13.field5192 = true;
            }
            var13.method363(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            return;
        }
        if (this.field1906.field2548 == 1) {
            var13.field5192 = true;
        }
        var13.method363(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field1906.field2548 == 1) {
                var50.field5192 = true;
            }
            var50.method363(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V", line = 219)
    public static final void method793(int arg0, int arg1) {
        class51.field819.method1156(arg0, 0);
        field1909++;
        class226.field3886.method1156(arg0, 0);
        class308.field5224.method1156(arg0, arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)Z", line = 229)
    public final boolean method453(byte arg0) {
        if (arg0 == -67) {
            field1910++;
            return this.field1906 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V", line = 243)
    public static void method794(byte arg0) {
        field1908 = null;
        if (arg0 < 8) {
            method793(-36, -101);
        }
        field1905 = null;
        field1912 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()I", line = 265)
    public final int method361() {
        field1914++;
        return this.field921;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)V", line = 279)
    public static final void method795(int arg0, int arg1, int arg2) {
        field1907++;
        if (arg0 == 4 && !class20.field239) {
            arg2 = 2;
            arg0 = 2;
        }
        if (class191.field3378 != arg0) {
            if (class120.field2123) {
                return;
            }
            if (class191.field3378 != 0) {
                class258.field4469[class191.field3378].method419();
            }
            if (arg0 != 0) {
                class223 var3 = class258.field4469[arg0];
                var3.method424();
                var3.method426(arg2);
            }
            class264.field4595 = arg2;
            class191.field3378 = arg0;
        } else if (arg0 != 0 && class264.field4595 != arg2) {
            class258.field4469[arg0].method426(arg2);
            class264.field4595 = arg2;
        }
        if (arg1 != 58) {
            method793(-82, 6);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 328)
    public static final void method796(Throwable arg0, byte arg1, String arg2) {
        field1911++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class245.method1659(arg0, -7000);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            int var4 = -95 / ((arg1 - 68) / 34);
            System.out.println("Error: " + var3);
            String var5 = var3.replace(':', '.');
            String var6 = var5.replace('@', '_');
            String var7 = var6.replace('&', '_');
            String var8 = var7.replace('#', '_');
            if (class45.field681.field5061 == null) {
                return;
            }
            class116 var9 = class45.field681.method2071(4, new URL(class45.field681.field5061.getCodeBase(), "clienterror.ws?c=" + class226.field3892 + "&u=" + class52.field839 + "&v1=" + class295.field5075 + "&v2=" + class295.field5073 + "&e=" + var8));
            while (var9.field2067 == 0) {
                class237.method1628((byte) -88, 1L);
            }
            if (var9.field2067 == 1) {
                DataInputStream var10 = (DataInputStream) var9.field2063;
                var10.read();
                var10.close();
            }
        } catch (Exception var12) {
        }
    }
}
