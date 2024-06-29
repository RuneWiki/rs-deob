import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class125 extends class59 {

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public int field1849 = 0;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public int field1866 = -1;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Lbc;")
    public static class302 field1857 = null;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "Lok;")
    public static class41 field1856 = class137.method956("null", 45);

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "Lok;")
    public static class41 field1858 = class137.method956("welle2:", 45);

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field1864 = 0;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field1868 = 500;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public int field1848;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "[I")
    public static int[] field1862;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lof;III)V", line = 16)
    public static final void method878(class245 arg0, int arg1, int arg2, int arg3) {
        if ((arg1 & 0x40) != 0) {
            int var4 = class164.field2597.method810(26873);
            int var5 = class164.field2597.method815(255);
            arg0.method1905(var5, 19191, class18.field234, var4);
            arg0.field4329 = class18.field234 + 300;
            arg0.field4340 = class164.field2597.method810(26873);
        }
        if ((arg1 & 0x80) != 0) {
            int var6 = class164.field2597.method808(255);
            int var7 = class164.field2597.method793(-97);
            if (var6 == 65535) {
                var6 = -1;
            }
            class242.method1732(arg0, false, var7, var6);
        }
        if ((arg1 & 0x100) != 0) {
            arg0.field4326 = class164.field2597.method810(26873);
            arg0.field4285 = class164.field2597.method792(2);
            arg0.field4274 = class164.field2597.method810(26873);
            arg0.field4304 = class164.field2597.method792(2);
            arg0.field4303 = class164.field2597.method808(255) + class18.field234;
            arg0.field4315 = class164.field2597.method759((byte) -127) + class18.field234;
            arg0.field4296 = class164.field2597.method810(26873);
            arg0.field4295 = 0;
            arg0.field4322 = 1;
        }
        if (arg2 < 56) {
            method878((class245) null, 29, 35, 105);
        }
        if ((arg1 & 0x200) != 0) {
            int var8 = class164.field2597.method810(26873);
            int var9 = class164.field2597.method793(-115);
            arg0.method1905(var9, 19191, class18.field234, var8);
        }
        field1852++;
        if ((arg1 & 0x1) != 0) {
            arg0.field4335 = class164.field2597.method775(-117);
            if (arg0.field4335 == 65535) {
                arg0.field4335 = -1;
            }
        }
        if ((arg1 & 0x4) != 0) {
            arg0.field4275 = class164.field2597.method763(true);
            if (arg0.field4275.method281(0, (byte) -68) == 126) {
                arg0.field4275 = arg0.field4275.method279(1, (byte) -116);
                class262.method1843(arg0.field4275, 2, arg0.method1755(1774), 102);
            } else if (class62.field913 == arg0) {
                class262.method1843(arg0.field4275, 2, arg0.method1755(1774), 48);
            }
            arg0.field4283 = 150;
            arg0.field4301 = 0;
            arg0.field4305 = 0;
        }
        if ((arg1 & 0x10) != 0) {
            arg0.field4327 = class164.field2597.method808(255);
            arg0.field4319 = class164.field2597.method759((byte) -47);
        }
        if ((arg1 & 0x20) != 0) {
            int var10 = class164.field2597.method810(26873);
            byte[] var11 = new byte[var10];
            class112 var12 = new class112(var11);
            class164.field2597.method807(var10, var11, (byte) 124, 0);
            class50.field766[arg3] = var12;
            arg0.method1754(var12, (byte) 101);
        }
        if ((arg1 & 0x400) != 0) {
            arg0.field4289 = class164.field2597.method808(255);
            int var13 = class164.field2597.method782((byte) -106);
            arg0.field4320 = 0;
            arg0.field4287 = var13 >> 16;
            if (arg0.field4289 == 65535) {
                arg0.field4289 = -1;
            }
            arg0.field4330 = 0;
            arg0.field4279 = (var13 & 0xFFFF) + class18.field234;
            if (class18.field234 < arg0.field4279) {
                arg0.field4320 = -1;
            }
            if (arg0.field4289 != -1 && class18.field234 == arg0.field4279) {
                int var14 = class5.method15(arg0.field4289, false).field3545;
                if (var14 != -1) {
                    class205 var15 = class285.method2000(var14, 4442);
                    if (var15 != null && var15.field3323 != null) {
                        class148.method1026(arg0.field4311, 0, arg0.field4280, var15, -101, class62.field913 == arg0);
                    }
                }
            }
        }
        if ((arg1 & 0x2) == 0) {
            return;
        }
        int var16 = class164.field2597.method775(-106);
        int var17 = class164.field2597.method792(2);
        int var18 = class164.field2597.method792(2);
        boolean var19 = (var16 & 0x8000) != 0;
        int var20 = class164.field2597.field1640;
        if (arg0.field3933 != null && arg0.field3946 != null) {
            long var21 = arg0.field3933.method291((byte) 65);
            boolean var23 = false;
            if (var17 <= 1) {
                if (!var19 && (class164.field2595 && !class62.field907 || class169.field2696)) {
                    var23 = true;
                } else {
                    for (int var24 = 0; var24 < class281.field4576; var24++) {
                        if (class273.field4436[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                }
            }
            if (!var23 && class194.field3136 == 0) {
                class266.field4224.field1640 = 0;
                class164.field2597.method761(class266.field4224.field1607, var18, 128, 0);
                class266.field4224.field1640 = 0;
                int var25 = -1;
                class41 var27;
                if (var19) {
                    var16 &= 0x7FFF;
                    class146 var26 = class207.method1461(class266.field4224, 122);
                    var25 = var26.field2226;
                    var27 = var26.field2223.method1242(0, class266.field4224);
                } else {
                    var27 = class253.method1797(class119.method850(-2, class266.field4224).method315((byte) 32));
                }
                arg0.field4275 = var27.method299(false);
                arg0.field4301 = var16 >> 8;
                arg0.field4305 = var16 & 0xFF;
                arg0.field4283 = 150;
                if (var17 == 2) {
                    class107.method728(201, class187.method1346(new class41[] { class67.field1015, arg0.method1755(1774) }, 0), var25, var27, var19 ? 17 : 1, (class41) null);
                } else if (var17 == 1) {
                    class107.method728(201, class187.method1346(new class41[] { class161.field2555, arg0.method1755(1774) }, 0), var25, var27, var19 ? 17 : 1, (class41) null);
                } else {
                    class107.method728(201, arg0.method1755(1774), var25, var27, var19 ? 17 : 2, (class41) null);
                }
            }
        }
        class164.field2597.field1640 = var18 + var20;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V", line = 250)
    public static void method879(byte arg0) {
        field1862 = null;
        field1858 = null;
        if (arg0 >= -124) {
            field1856 = (class41) null;
        }
        field1856 = null;
        field1857 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIIIIIZ)V", line = 263)
    public static final void method880(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0) {
            class166.method1180();
        }
        field1851++;
        if (class55.field803 != null && (arg4 != 3 || class167.field2655 != arg1 || class226.field3616 != arg2)) {
            class147.method1018(class55.field803, class138.field2065, 1);
            class55.field803 = null;
        }
        if (arg5 != 15732) {
            return;
        }
        if (arg4 == 3 && class55.field803 == null) {
            class55.field803 = class132.method926(127, arg1, 0, 0, class138.field2065, arg2);
            if (class55.field803 != null) {
                class226.field3616 = arg2;
                class167.field2655 = arg1;
                class246.method1760((byte) 21, class138.field2065);
            }
        }
        if (arg4 == 3 && class55.field803 == null) {
            method880(true, -1, -1, arg3, class314.field5298, 15732, true);
            return;
        }
        Container var7;
        if (class55.field803 != null) {
            var7 = class55.field803;
        } else if (class238.field3817 == null) {
            var7 = class138.field2065.field3390;
        } else {
            var7 = class238.field3817;
        }
        class3.field39 = var7.getSize().width;
        class98.field1434 = var7.getSize().height;
        if (class238.field3817 == var7) {
            Insets var8 = class238.field3817.getInsets();
            class3.field39 -= var8.left + var8.right;
            class98.field1434 -= var8.top + var8.bottom;
        }
        if (arg4 < 2) {
            class60.field871 = 0;
            class14.field182 = 503;
            class144.field2195 = (class3.field39 - 765) / 2;
            class188.field3055 = 765;
        } else {
            class60.field871 = 0;
            class144.field2195 = 0;
            class188.field3055 = class3.field39;
            class14.field182 = class98.field1434;
        }
        if (arg6) {
            class298.method2061((byte) 120, class283.field4602);
            class68.method497((byte) -84, class283.field4602);
            if (class180.field2920 != null) {
                class180.field2920.method263(class283.field4602, -30331);
            }
            class177.field2878.method1951((byte) 126);
            class144.method998(13156, class283.field4602);
            class192.method1377(class283.field4602, false);
            if (class180.field2920 != null) {
                class180.field2920.method265(class283.field4602, 84);
            }
        } else {
            if (class166.field2625) {
                class166.method1159(class188.field3055, class14.field182);
            }
            class283.field4602.setSize(class188.field3055, class14.field182);
            if (class238.field3817 == var7) {
                Insets var9 = class238.field3817.getInsets();
                class283.field4602.setLocation(var9.left + class144.field2195, class60.field871 + var9.top);
            } else {
                class283.field4602.setLocation(class144.field2195, class60.field871);
            }
        }
        if (arg4 == 0 && arg3 > 0) {
            class166.method1161(class283.field4602);
        }
        if (arg0 && arg4 > 0) {
            class283.field4602.setIgnoreRepaint(true);
            if (!class196.field3165) {
                class213.method1505();
                class217.field3485 = null;
                class217.field3485 = class213.method1509(class188.field3055, class283.field4602, 0, class14.field182);
                class54.method386();
                if (class94.field1377 == 5) {
                    class308.method2142(true, (byte) 114, class140.field2165);
                } else {
                    class305.method2105(false, class217.field3477, -19861);
                }
                try {
                    Graphics var10 = class283.field4602.getGraphics();
                    class217.field3485.method178(0, 0, var10, (byte) -117);
                } catch (Exception var14) {
                }
                class266.method1884(arg5 ^ 0x7E75);
                if (arg3 == 0) {
                    class217.field3485 = class213.method1509(765, class283.field4602, 0, 503);
                } else {
                    class217.field3485 = null;
                }
                class182 var12 = class138.field2065.method1488((byte) 94, class177.field2878.getClass());
                while (var12.field2948 == 0) {
                    class300.method2068(125, 100L);
                }
                if (var12.field2948 == 1) {
                    class196.field3165 = true;
                }
            }
            if (class196.field3165) {
                class166.method1193(class283.field4602, class285.field4641 * 2);
            }
        }
        if (!class166.field2625 && arg4 > 0) {
            method880(true, -1, -1, arg3, 0, 15732, true);
            return;
        }
        if (arg4 > 0 && arg3 == 0) {
            class164.field2603.setPriority(5);
            class217.field3485 = null;
            class19.method111();
            ((class305) class31.field461).method2107((byte) 26, 200);
            if (class66.field1006) {
                class31.method207(0.7F);
            }
        } else if (arg4 == 0 && arg3 > 0) {
            class164.field2603.setPriority(1);
            class217.field3485 = class213.method1509(765, class283.field4602, 0, 503);
            class19.method128();
            ((class305) class31.field461).method2107((byte) 26, 20);
            if (class66.field1006) {
                if (class262.field4171 == 1) {
                    class31.method207(0.9F);
                }
                if (class262.field4171 == 2) {
                    class31.method207(0.8F);
                }
                if (class262.field4171 == 3) {
                    class31.method207(0.7F);
                }
                if (class262.field4171 == 4) {
                    class31.method207(0.6F);
                }
            }
            class6.method22();
        }
        class65.field995 = !class75.method553(arg5 ^ 0x60C7);
        if (arg0) {
            class169.method1216(0);
        }
        if (arg4 >= 2) {
            class218.field3513 = true;
        } else {
            class218.field3513 = false;
        }
        if (class136.field2015 != -1) {
            class16.method75(false, true);
        }
        if (class118.field1724 != null && (class94.field1377 == 30 || class94.field1377 == 25)) {
            class278.method1966(82);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class195.field3151[var13] = true;
        }
        class101.field1437 = true;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V", line = 507)
    public static final void method881(int arg0) {
        class57.field821.method135(18436);
        field1861++;
        if (arg0 == 0) {
            class156.field2460.method135(arg0 ^ 0x4804);
            class18.field228.method135(arg0 + 18436);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z", line = 522)
    public static final boolean method882(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class284.field4610; var3++) {
            class234 var4 = class150.field2337[var3];
            if (var4.field3738 == 1) {
                int var5 = var4.field3753 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3754 * var5 >> 8) + var4.field3726;
                    int var7 = (var4.field3755 * var5 >> 8) + var4.field3757;
                    int var8 = (var4.field3734 * var5 >> 8) + var4.field3751;
                    int var9 = (var4.field3756 * var5 >> 8) + var4.field3735;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3738 == 2) {
                int var10 = arg0 - var4.field3753;
                if (var10 > 0) {
                    int var11 = (var4.field3754 * var10 >> 8) + var4.field3726;
                    int var12 = (var4.field3755 * var10 >> 8) + var4.field3757;
                    int var13 = (var4.field3734 * var10 >> 8) + var4.field3751;
                    int var14 = (var4.field3756 * var10 >> 8) + var4.field3735;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3738 == 3) {
                int var15 = var4.field3726 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3729 * var15 >> 8) + var4.field3753;
                    int var17 = (var4.field3749 * var15 >> 8) + var4.field3743;
                    int var18 = (var4.field3734 * var15 >> 8) + var4.field3751;
                    int var19 = (var4.field3756 * var15 >> 8) + var4.field3735;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3738 == 4) {
                int var20 = arg2 - var4.field3726;
                if (var20 > 0) {
                    int var21 = (var4.field3729 * var20 >> 8) + var4.field3753;
                    int var22 = (var4.field3749 * var20 >> 8) + var4.field3743;
                    int var23 = (var4.field3734 * var20 >> 8) + var4.field3751;
                    int var24 = (var4.field3756 * var20 >> 8) + var4.field3735;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3738 == 5) {
                int var25 = arg1 - var4.field3751;
                if (var25 > 0) {
                    int var26 = (var4.field3729 * var25 >> 8) + var4.field3753;
                    int var27 = (var4.field3749 * var25 >> 8) + var4.field3743;
                    int var28 = (var4.field3754 * var25 >> 8) + var4.field3726;
                    int var29 = (var4.field3755 * var25 >> 8) + var4.field3757;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
