import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class80 extends class38 {

    @OriginalMember(owner = "client!jj", name = "uc", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!jj", name = "tc", descriptor = "I")
    public static int field1190 = -1;

    @OriginalMember(owner = "client!jj", name = "ic", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!jj", name = "jc", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!jj", name = "kc", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!jj", name = "lc", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!jj", name = "mc", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!jj", name = "nc", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!jj", name = "oc", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!jj", name = "qc", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!jj", name = "rc", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!jj", name = "sc", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!jj", name = "vc", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!jj", name = "pc", descriptor = "Lwd;")
    public static class232 field1186;

    @OriginalMember(owner = "client!jj", name = "hc", descriptor = "Lsg;")
    public class298 field1178;

    @OriginalMember(owner = "client!jj", name = "wc", descriptor = "Lwf;")
    public static class306 field1193;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()I", line = 4)
    public final int method112() {
        field1184++;
        return this.field515;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 12)
    public static void method550(boolean arg0) {
        field1193 = null;
        field1186 = null;
        if (arg0) {
            field1191 = -60;
        }
    }

    @OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() {
        field1188++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjh;)Ljh;", line = 42)
    public static final class207 method551(int arg0, class207 arg1) {
        field1179++;
        if (~arg1.field3232 != arg0) {
            return class78.method547(arg1.field3232, arg0 ^ 0x5E);
        }
        int var2 = arg1.field3250 >>> 16;
        class92 var3 = new class92(class166.field2557);
        for (class45 var4 = (class45) var3.method633(true); var4 != null; var4 = (class45) var3.method629((byte) -128)) {
            if (var4.field640 == var2) {
                return class78.method547((int) var4.field2852, arg0 + 112);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)Z", line = 69)
    public final boolean method281(int arg0) {
        if (arg0 != 0) {
            this.method112();
        }
        field1189++;
        return this.field1178 != null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 85)
    public static final void method552(boolean arg0, String arg1, int arg2) {
        field1187++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class59.field841 : class227.field3628);
        if (arg2 > -32) {
            method550(true);
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class146 var9 = class188.method1288(var8, (byte) 117);
            if (var9.field2310 && var9.method1021((byte) 120).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class27.field347 = null;
                    class26.field336 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class26.field336 = var5;
        class125.field1960 = 0;
        String[] var12 = new String[class26.field336];
        class27.field347 = var4;
        for (int var13 = 0; var13 < class26.field336; var13++) {
            var12[var13] = class188.method1288(var4[var13], (byte) 102).method1021((byte) 120);
        }
        class138.method939(false, class27.field347, var12);
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)I", line = 163)
    public final int method282(int arg0) {
        field1182++;
        if (class2.field25 != 0 && this.field1178.field4588 != null) {
            class298 var2 = this.field1178.method1956(121);
            if (var2 != null && var2.field4595 != -1) {
                return var2.field4595;
            }
        }
        if (arg0 != -580) {
            this.field1178 = (class298) null;
        }
        return this.field522;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIJILcj;)V", line = 187)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10) {
        field1185++;
        if (this.field1178 == null) {
            return;
        }
        class222 var13 = this.field507 != -1 && this.field558 == 0 ? class118.method809((byte) 64, this.field507) : null;
        class222 var14 = this.field474 == -1 || this.field474 == this.method280(-40).field4876 && var13 != null ? null : class118.method809((byte) 112, this.field474);
        class295 var15 = this.field1178.method1957((byte) 96, this.field546, this.field523, this.field462, this.field557, this.field492, var14, this.field465, this.field495, var13);
        if (var15 == null) {
            return;
        }
        this.field515 = var15.method112();
        class298 var16 = this.field1178;
        if (var16.field4588 != null) {
            var16 = var16.method1956(121);
        }
        if (class155.field2434 && var16.field4584) {
            class295 var17 = class7.method40(this.field519, this.field1178.field4577, this.field1178.field4565, this.field1178.field4585, this.field537, this.field1178.field4609, 21881, this.field1178.field4604, var15, var14 == null ? var13 : var14, this.field493, var14 == null ? this.field557 : this.field492, arg0, this.field542);
            if (class333.field5166) {
                float var18 = class333.method2286();
                float var19 = class333.method2294();
                class333.method2290();
                class333.method2321(var18, var19 - 150.0F);
                var17.method111(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field521);
                class333.method2301();
                class333.method2321(var18, var19);
            } else {
                var17.method111(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field521);
            }
        }
        class295 var20 = null;
        this.method283((byte) -65, var15);
        this.method267(arg0, var15, 104);
        if (this.field530 != -1 && this.field534 != -1) {
            class148 var21 = class63.method428(false, this.field530);
            var20 = var21.method1047(-5, this.field506, this.field496, this.field534);
            if (var20 != null) {
                var20.method983(0, -this.field501, 0);
                if (var21.field2345) {
                    if (class199.field2988 != 0) {
                        var20.method956(class199.field2988);
                    }
                    if (class52.field744 != 0) {
                        var20.method988(class52.field744);
                    }
                    if (class78.field1163 != 0) {
                        var20.method983(0, class78.field1163, 0);
                    }
                }
            }
        }
        if (!class333.field5166) {
            if (var20 != null) {
                var15 = ((class141) var15).method978(var20);
            }
            if (this.field1178.field4609 == 1) {
                var15.field4545 = true;
            }
            var15.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field521);
            return;
        }
        if (this.field1178.field4609 == 1) {
            var15.field4545 = true;
        }
        var15.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field521);
        if (var20 != null) {
            if (this.field1178.field4609 == 1) {
                var20.field4545 = true;
            }
            var20.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field521);
        }
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)I", line = 301)
    public static final int method553(int arg0) {
        field1180++;
        try {
            if (class293.field4507 == 0) {
                if (class138.field2132 > (class195.method1322(127) - 5000L)) {
                    return 0;
                }
                class84.field1266 = class89.field1359.method1508(-34, class7.field82, class196.field2943);
                class315.field4956 = class195.method1322(118);
                class293.field4507 = 1;
            }
            if (class195.method1322(116) > (class315.field4956 + 30000L)) {
                return class85.method582((byte) -109, 1000);
            }
            if (arg0 > -121) {
                field1186 = (class232) null;
            }
            if (class293.field4507 == 1) {
                if (class84.field1266.field3931 == 2) {
                    return class85.method582((byte) -55, 1001);
                }
                if (class84.field1266.field3931 != 1) {
                    return -1;
                }
                class308.field4851 = new class88((Socket) class84.field1266.field3929, class89.field1359);
                class265.field4095.field4679 = 0;
                int var1 = 0;
                if (class164.field2526) {
                    var1 = class146.field2309;
                }
                class84.field1266 = null;
                class265.field4095.method2034(-27, 23);
                class265.field4095.method2013(var1, -107);
                class308.field4851.method598(0, class265.field4095.field4679, 1, class265.field4095.field4716);
                if (class228.field3654 != null) {
                    class228.field3654.method1192(false);
                }
                if (class196.field2944 != null) {
                    class196.field2944.method1192(false);
                }
                int var2 = class308.field4851.method602(-96);
                if (class228.field3654 != null) {
                    class228.field3654.method1192(false);
                }
                if (class196.field2944 != null) {
                    class196.field2944.method1192(false);
                }
                if (var2 != 0) {
                    return class85.method582((byte) -102, var2);
                }
                class293.field4507 = 2;
            }
            if (class293.field4507 == 2) {
                if (class308.field4851.method607(92) < 2) {
                    return -1;
                }
                class108.field1672 = class308.field4851.method602(56);
                class108.field1672 <<= 0x8;
                class108.field1672 += class308.field4851.method602(111);
                class293.field4507 = 3;
                class40.field584 = new byte[class108.field1672];
                class247.field3886 = 0;
            }
            if (class293.field4507 != 3) {
                return -1;
            }
            int var3 = class308.field4851.method607(114);
            if (var3 < 1) {
                return -1;
            }
            if (class108.field1672 - class247.field3886 < var3) {
                var3 = class108.field1672 - class247.field3886;
            }
            class308.field4851.method604(88, var3, class247.field3886, class40.field584);
            class247.field3886 += var3;
            if (class247.field3886 < class108.field1672) {
                return -1;
            } else if (class299.method1967(-14948, class40.field584)) {
                class266.field4108 = new class130[class305.field4776];
                int var4 = 0;
                for (int var5 = class35.field447; var5 <= class230.field3718; var5++) {
                    class130 var6 = class17.method136((byte) 86, var5);
                    if (var6 != null) {
                        class266.field4108[var4++] = var6;
                    }
                }
                class308.field4851.method596(false);
                class194.field2926 = 0;
                class308.field4851 = null;
                class40.field584 = null;
                class293.field4507 = 0;
                class138.field2132 = class195.method1322(116);
                return 0;
            } else {
                return class85.method582((byte) -121, 1002);
            }
        } catch (IOException var8) {
            return class85.method582((byte) -78, 1003);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V", line = 433)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1192++;
        if (this.field1178 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lsg;I)V", line = 446)
    public final void method554(class298 arg0, int arg1) {
        field1181++;
        int var3 = -20 / ((-arg1 - 63) / 44);
        this.field1178 = arg0;
        if (this.field521 != null) {
            this.field521.method1655();
        }
    }
}
