import java.awt.Canvas;
import java.lang.reflect.Constructor;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class314 extends class339 implements class111 {

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "B")
    private byte field4243;

    @OriginalMember(owner = "client!cl", name = "eb", descriptor = "B")
    private byte field4271;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "B")
    private byte field4256;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "Z")
    private boolean field4259;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "Z")
    private boolean field4249;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "Z")
    private boolean field4266;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "S")
    private short field4250;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "Z")
    private boolean field4262;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Lug;")
    private class325 field4236;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "Lsj;")
    public class73 field4251;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "[Z")
    public static boolean[] field4246 = new boolean[200];

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4255 = new CRC32();

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "[Lqi;")
    public static class209[] field4264 = new class209[14];

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "I")
    public static int field4270;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cl", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field4272;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cl", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field4273;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cl", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field4274;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "[Lkb;")
    public static class80[] field4241;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2005(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZILhh;Lpe;III)V", line = 6)
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        if (arg2 instanceof class314) {
            class314 var8 = (class314) arg2;
            if (this.field4251 != null && var8.field4251 != null) {
                this.field4251.method419(var8.field4251, arg5, arg4, arg6, arg0);
            }
        } else if (arg2 instanceof class173) {
            class173 var9 = (class173) arg2;
            if (this.field4251 != null && var9.field2527 != null) {
                this.field4251.method419(var9.field2527, arg5, arg4, arg6, arg0);
            }
        }
        int var10 = -110 % ((76 - arg1) / 38);
        ++field4238;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)Z", line = 37)
    public final boolean method577(int arg0) {
        ++field4267;
        return arg0 != -16528 ? false : this.field4262;
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)V", line = 48)
    public static final void method1997(int arg0) {
        ++field4270;
        if (class47.field810 < 1024.0F) {
            class47.field810 = 1024.0F;
        }
        if (class47.field810 > 3072.0F) {
            class47.field810 = 3072.0F;
        }
        while (class313.field4229 >= 16384.0F) {
            class313.field4229 -= 16384.0F;
        }
        while (class313.field4229 < 0.0F) {
            class313.field4229 += 16384.0F;
        }
        int var1 = class241.field3334 >> 7;
        int var2 = class153.field2327 >> 7;
        int var3 = class22.method281(arg0 + 29453, class69.field1046, class153.field2327, class241.field3334);
        if (arg0 == -29452) {
            int var4 = 0;
            if (~var1 < -4 && ~var2 < -4 && ~var1 > -101 && var2 < 100) {
                for (int var5 = var1 + -4; var1 + 4 >= var5; ++var5) {
                    for (int var6 = var2 + -4; ~(var2 + 4) <= ~var6; ++var6) {
                        int var7 = class69.field1046;
                        if (var7 < 3 && class272.method1741(var6, arg0 ^ 29451, var5)) {
                            ++var7;
                        }
                        int var8 = 0;
                        if (class438.field6281 != null && class438.field6281[var7] != null) {
                            var8 = (class438.field6281[var7][var5][var6] & 255) * 8;
                        }
                        int var9 = var3 + var8 + -class91.field1351[var7].method1509(var5, var6);
                        if (var9 > var4) {
                            var4 = var9;
                        }
                    }
                }
            }
            int var10 = var4 * 1536;
            if (var10 > 786432) {
                var10 = 786432;
            }
            if (~var10 > -262145) {
                var10 = 262144;
            }
            if (~class127.field1802 <= ~var10) {
                if (class127.field1802 > var10) {
                    class127.field1802 += (-class127.field1802 + var10) / 80;
                    return;
                }
            } else {
                class127.field1802 += (-class127.field1802 + var10) / 24;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 141)
    public final void method573(byte arg0) {
        if (arg0 <= -100) {
            ++field4245;
            if (this.field4251 != null) {
                this.field4251.method458();
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILpe;)Lsj;", line = 155)
    private final class73 method1998(int arg0, int arg1, class391 arg2) {
        ++field4253;
        if (this.field4251 != null && ~arg2.method183(this.field4251.method426(), arg0) == -1) {
            return this.field4251;
        } else if (arg1 != -1) {
            return null;
        } else {
            class265 var4 = this.method2003(arg2, arg0, arg1 ^ 43, false);
            return var4 != null ? var4.field3562 : null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lpe;II)Lsj;", line = 183)
    public final class73 method576(class391 arg0, int arg1, int arg2) {
        ++field4237;
        if (arg2 != -2705) {
            this.method2003((class391) null, 107, 18, false);
        }
        return this.method1998(arg1, arg2 + 2704, arg0);
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)Z", line = 194)
    public final boolean method537(int arg0) {
        ++field4252;
        return arg0 > -48 ? false : this.field4249;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILpe;)V", line = 209)
    public final void method581(int arg0, class391 arg1) {
        ++field4239;
        if (arg0 != 0) {
            this.method576((class391) null, 122, -74);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILpe;I)Z", line = 219)
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field4242;
        class73 var5 = this.method1998(arg3, -1, arg2);
        if (var5 != null) {
            class156 var6 = arg2.method226();
            var6.method308(super.field4622, super.field4626, super.field4630);
            return var5.method455(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)I", line = 239)
    public final int method582(byte arg0) {
        ++field4248;
        return arg0 != 22 ? 64 : this.field4250 & 65535;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lpe;B)Lca;", line = 250)
    public final class415 method572(class391 arg0, byte arg1) {
        ++field4263;
        if (this.field4251 == null) {
            return null;
        } else {
            class156 var3 = arg0.method226();
            if (arg1 > -45) {
                field4255 = null;
            }
            var3.method308(super.field4622, super.field4626, super.field4630);
            class415 var4 = null;
            if (this.field4259) {
                var4 = class340.method2159(24579, 1);
            }
            this.field4251.method478(var3, var4 == null ? null : var4.field5799[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIZ)V", line = 277)
    public static final void method1999(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4258;
        if (class118.field1653 == null) {
            class249.field3415.method2414(arg3, arg0, arg2, true, arg4, -16777216);
        } else {
            ++class128.field1811;
            if (class95.field1379 != null && ~(class95.field1379.field3176 + -((-1 + class95.field1379.method2146(112)) * 64) >> 7) == ~class338.field4605 && class95.field1379.field3167 + 64 + -(64 * class95.field1379.method2146(-117)) >> 7 == class335.field4543) {
                class338.field4605 = -1;
                class335.field4543 = -1;
                class184.method1347(false);
            }
            class381.method2368((byte) 106);
            if (!arg5) {
                class418.method2585(true);
            }
            class82.method747((byte) 30);
            class81.method744(arg2, true, arg0, arg4, -21270, arg3);
            int var6 = class285.field3814;
            int var7 = class131.field1860;
            int var8 = class128.field1813;
            int var9 = class394.field5511;
            if (class184.field2675 == 1) {
                int var10 = (int) class47.field810;
                if (class127.field1802 >> 8 > var10) {
                    var10 = class127.field1802 >> 8;
                }
                if (class22.field408[4] && ~var10 > ~(class367.field5044[4] + 128)) {
                    var10 = class367.field5044[4] + 128;
                }
                int var11 = (int) class313.field4229 - -class228.field3169 & 16383;
                class340.method2165(var10, (var10 >> 3) * 3 + 600, var11, (byte) 126, var6, class241.field3334, -50 + class22.method281(1, class69.field1046, class95.field1379.field3167, class95.field1379.field3176), class153.field2327);
            } else if (class184.field2675 == 4) {
                int var12 = (int) class47.field810;
                if (~(class127.field1802 >> 8) < ~var12) {
                    var12 = class127.field1802 >> 8;
                }
                if (class22.field408[4] && ~var12 > ~(class367.field5044[4] - -128)) {
                    var12 = class367.field5044[4] - -128;
                }
                int var13 = (int) class313.field4229 & 16383;
                class340.method2165(var12, (var12 >> 3) * 3 + 600, var13, (byte) 126, var6, class241.field3334, class22.method281(1, class69.field1046, class325.field4411, class267.field3598) + -50, class153.field2327);
            } else if (class184.field2675 == 5) {
                class105.method887((byte) 11, var6);
            }
            int var14 = class356.field4842;
            int var15 = class443.field6389;
            int var16 = class374.field5261;
            int var17 = class167.field2488;
            int var18 = class286.field3837;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class22.field408[var19]) {
                    int var22 = (int) (Math.random() * (double) (class13.field101[var19] * 2 + 1) - (double) class13.field101[var19] + Math.sin((double) class427.field6057[var19] / 100.0D * (double) class377.field5306[var19]) * (double) class367.field5044[var19]);
                    if (var19 == 3) {
                        class286.field3837 = 16383 & class286.field3837 + var22;
                    }
                    if (var19 == 4) {
                        class167.field2488 += var22;
                        if (~class167.field2488 > -1025) {
                            class167.field2488 = 1024;
                        } else if (~class167.field2488 < -3073) {
                            class167.field2488 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class356.field4842 += var22;
                    }
                    if (var19 == 1) {
                        class443.field6389 += var22;
                    }
                    if (~var19 == -3) {
                        class374.field5261 += var22;
                    }
                }
            }
            if (class356.field4842 < 0) {
                class356.field4842 = 0;
            }
            if (~class356.field4842 < ~((class368.field5054 << 7) - 1)) {
                class356.field4842 = (class368.field5054 << 7) + -1;
            }
            if (~class374.field5261 > -1) {
                class374.field5261 = 0;
            }
            if (~class374.field5261 < ~((class16.field190 << 7) + -1)) {
                class374.field5261 = (class16.field190 << 7) + -1;
            }
            class375.method2345(0);
            class414.method2564(0);
            class249.field3415.method111(var9, var7, var9 - -var8, var6 + var7);
            class249.field3415.method110();
            int var20 = class132.field1895;
            if (class322.field4369 != null) {
                class322.field4369.method1938(class167.field2488, var7, var6, class127.field1789 << 3, var20, var8, var9, 0, class286.field3837, class249.field3415);
            } else {
                class249.field3415.method104(var20);
            }
            class127.method996(109);
            if (arg1 <= 98) {
                field4255 = null;
            }
            class228.field3159.method310(class356.field4842, class443.field6389, class374.field5261, 16383 & -class167.field2488, -class286.field3837 & 16383, 16383 & -class450.field6502);
            class249.field3415.method189(class228.field3159);
            class249.field3415.method142(var8 / 2 + var9, var6 / 2 + var7, class163.field2411 << 1, class163.field2411 << 1);
            class5.method34(var7 - -(var6 / 2), var8 / 2 + var9, class163.field2411 << 1, (byte) 111, class163.field2411 << 1);
            class125.method976(-class167.field2488 & 16383, class356.field4842, 16383 & -class450.field6502, class374.field5261, -class286.field3837 & 16383, class443.field6389, 24610);
            byte var21 = class184.method1345(98) == 2 ? (byte) class128.field1811 : 1;
            class241.method1594(class249.field3415, class414.field5793, class165.field2433, class228.field3159, class356.field4842, class443.field6389, class374.field5261, class163.field2408, class386.field5442, class69.field1036, class365.field5036, class12.field89, class368.field5053, class69.field1046 + 1, var21, class95.field1379.field3176 >> 7, class95.field1379.field3167 >> 7, !class109.field1580);
            class127.method996(-17);
            if (class166.field2472 == 30) {
                class89.method787(var9, var7, var8, var6, 256, 256, (byte) -120);
                class49.method494(256, var7, var8, -16646, 256, var6, var9);
                class275.method1766((byte) 111, 256, var8, var7, 256, var9, var6);
                class329.method2093(var7, var6, (byte) 85, var8, var9);
            }
            class348.method2199();
            class286.field3837 = var18;
            class356.field4842 = var14;
            class374.field5261 = var16;
            class167.field2488 = var17;
            class443.field6389 = var15;
            if (class286.field3839 && ~class118.field1650.method2765(0) == -1) {
                class286.field3839 = false;
            }
            if (class286.field3839) {
                class249.field3415.method2414(var7, var9, var6, true, var8, -16777216);
                class422.method2599(class22.field414, class338.field4607, -90, false);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I", line = 468)
    public final int method580(int arg0) {
        ++field4240;
        return arg0 != 24493 ? 59 : this.field4243;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I", line = 480)
    public final int method575(int arg0) {
        if (arg0 != -15863) {
            method2000((byte) 60);
        }
        ++field4244;
        return this.field4271;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)V", line = 491)
    public static void method2000(byte arg0) {
        field4241 = null;
        field4246 = null;
        field4264 = null;
        int var1 = 12 / ((arg0 - 73) / 42);
        field4255 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lpe;I)V", line = 510)
    public final void method574(class391 arg0, int arg1) {
        ++field4260;
        if (arg1 != -28992) {
            this.method573((byte) -61);
        }
        Object var3 = null;
        class325 var5;
        if (this.field4236 == null && this.field4262) {
            class265 var4 = this.method2003(arg0, 131072, arg1 + 28890, true);
            var5 = var4 != null ? var4.field3561 : null;
        } else {
            var5 = this.field4236;
            this.field4236 = null;
        }
        if (var5 != null) {
            class400.method2453(var5, this.field4256, super.field4622, super.field4630, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lbe;", line = 539)
    public static final class44 method2001(int arg0, int arg1, int arg2) {
        class224 var3 = class118.field1653[arg0][arg1][arg2];
        return var3 != null && var3.field3124 != null ? var3.field3124 : null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lpg;ILjava/awt/Canvas;ZLbd;I)Lpe;", line = 546)
    public static final class391 method2002(class112 arg0, int arg1, Canvas arg2, boolean arg3, class304 arg4, int arg5) {
        ++field4268;
        try {
            if (!arg3) {
                field4255 = null;
            }
            Class var6 = Class.forName("hd");
            Constructor var7 = var6.getConstructor(field4272 != null ? field4272 : (field4272 = method2005("java.awt.Canvas")), field4273 != null ? field4273 : (field4273 = method2005("pg")), Integer.TYPE, Integer.TYPE, field4274 != null ? field4274 : (field4274 = method2005("bd")));
            return (class391) var7.newInstance(arg2, arg0, new Integer(arg5), new Integer(arg1), arg4);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLpe;)V", line = 571)
    public final void method570(byte arg0, class391 arg1) {
        int var3 = -116 / ((arg0 - 66) / 39);
        ++field4261;
        Object var4 = null;
        class325 var6;
        if (this.field4236 == null && this.field4262) {
            class265 var5 = this.method2003(arg1, 131072, -48, true);
            var6 = var5 == null ? null : var5.field3561;
        } else {
            var6 = this.field4236;
            this.field4236 = null;
        }
        if (var6 != null) {
            class415.method2573(var6, this.field4256, super.field4622, super.field4630, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V", line = 598)
    public final void method535(byte arg0) {
        this.field4249 = false;
        if (arg0 <= 110) {
            method1999(-27, 60, -41, 80, -100, true);
        }
        ++field4269;
        if (this.field4251 != null) {
            this.field4251.method463(-32769 & this.field4251.method426());
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lpe;IIZ)Lil;", line = 621)
    private final class265 method2003(class391 arg0, int arg1, int arg2, boolean arg3) {
        ++field4254;
        class372 var5 = class10.method53(this.field4250 & 65535, true);
        if (arg2 >= -12) {
            return null;
        } else {
            class411 var6;
            class411 var7;
            if (!this.field4266) {
                var6 = class265.field3566[this.field4256];
                if (this.field4256 < 3) {
                    var7 = class265.field3566[this.field4256 - -1];
                } else {
                    var7 = null;
                }
            } else {
                var7 = class265.field3566[0];
                var6 = class244.field3367[this.field4256];
            }
            return var5.method2318(super.field4630, this.field4243, arg3, arg0, (byte) -30, var6, var7, this.field4271, super.field4626, arg1, super.field4622);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lpe;Lkk;IIIIZIIZ)V", line = 653)
    public class314(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class330.method2099(arg7, 1, arg8));
        this.field4243 = (byte) arg8;
        this.field4271 = (byte) arg7;
        this.field4256 = (byte) arg2;
        this.field4259 = ~arg1.field5204 != -1;
        super.field4630 = (short) arg5;
        this.field4249 = arg9;
        this.field4266 = arg6;
        this.field4250 = (short) arg1.field5157;
        super.field4622 = (short) arg3;
        this.field4262 = arg0.method227() && arg1.field5215 && !this.field4266 && class179.field2633 != 0;
        int var11 = 1024;
        if (this.field4249) {
            var11 |= 32768;
        }
        class265 var12 = this.method2003(arg0, var11, -47, this.field4262);
        if (var12 != null) {
            this.field4236 = var12.field3561;
            this.field4251 = var12.field3562;
            if (this.field4249) {
                this.field4251 = this.field4251.method440((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lr;I)I", line = 687)
    public static final int method2004(class63 arg0, int arg1) {
        ++field4247;
        String var2 = class374.method2340((byte) -116, arg0);
        int[] var3 = null;
        if (class416.method2574(true, arg0.field966)) {
            var3 = class234.method1569(2142, (int) arg0.field957).field6567;
        } else if (class335.method2118(arg0.field966, arg1 ^ -4750)) {
            class127 var4 = class298.field4012[(int) arg0.field957];
            if (var4 != null) {
                var3 = var4.field1784.field164;
            }
        } else if (class352.method2228(true, arg0.field966)) {
            if (arg0.field966 != 1009) {
                var3 = class10.method53((int) (arg0.field957 >>> 32 & 2147483647L), true).field5179;
            } else {
                var3 = class10.method53((int) arg0.field957, true).field5179;
            }
        }
        if (arg1 != 11139) {
            return 104;
        } else {
            if (var3 != null) {
                var2 = var2 + class330.method2104(var3, (byte) -58);
            }
            return class19.field375.method2058(class258.field3483, -63, var2);
        }
    }
}
