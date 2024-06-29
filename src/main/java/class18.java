import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class127 {

    @OriginalMember(owner = "client!cc", name = "Qc", descriptor = "Lwd;")
    private static class150 field471 = class2.method9(true, "Add friend");

    @OriginalMember(owner = "client!cc", name = "Vc", descriptor = "Lwd;")
    public static class150 field476 = class2.method9(true, "mapdots");

    @OriginalMember(owner = "client!cc", name = "ed", descriptor = "Lwd;")
    private static class150 field485 = class2.method9(true, "Off");

    @OriginalMember(owner = "client!cc", name = "hd", descriptor = "Lwd;")
    public static class150 field488 = field485;

    @OriginalMember(owner = "client!cc", name = "Wc", descriptor = "[Lme;")
    public static class88[] field477 = new class88[4];

    @OriginalMember(owner = "client!cc", name = "dd", descriptor = "Lwd;")
    private static class150 field484 = class2.method9(true, "Loading ignore list");

    @OriginalMember(owner = "client!cc", name = "ad", descriptor = "Lwd;")
    public static class150 field481 = field471;

    @OriginalMember(owner = "client!cc", name = "Sc", descriptor = "Lwd;")
    private static class150 field473 = class2.method9(true, "Password: ");

    @OriginalMember(owner = "client!cc", name = "Yc", descriptor = "Lwd;")
    public static class150 field479 = field484;

    @OriginalMember(owner = "client!cc", name = "Uc", descriptor = "Lwd;")
    public static class150 field475 = class2.method9(true, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!cc", name = "md", descriptor = "Lwd;")
    private static class150 field493 = class2.method9(true, "flash2:");

    @OriginalMember(owner = "client!cc", name = "Rc", descriptor = "Lwd;")
    public static class150 field472 = field493;

    @OriginalMember(owner = "client!cc", name = "bd", descriptor = "Lwd;")
    public static class150 field482 = class2.method9(true, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!cc", name = "od", descriptor = "Lwd;")
    public static class150 field495 = class2.method9(true, "null");

    @OriginalMember(owner = "client!cc", name = "gd", descriptor = "Z")
    public static boolean field487 = false;

    @OriginalMember(owner = "client!cc", name = "kd", descriptor = "Lwd;")
    public static class150 field491 = field473;

    @OriginalMember(owner = "client!cc", name = "qd", descriptor = "Lwd;")
    public static class150 field497 = field493;

    @OriginalMember(owner = "client!cc", name = "jd", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!cc", name = "Pc", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!cc", name = "Tc", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!cc", name = "cd", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!cc", name = "fd", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cc", name = "id", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!cc", name = "ld", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!cc", name = "nd", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cc", name = "pd", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!cc", name = "Xc", descriptor = "Lrb;")
    public class118 field478;

    @OriginalMember(owner = "client!cc", name = "Zc", descriptor = "Lff;")
    public static class42 field480;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public static final void method126(int arg0) {
        ++field470;
        if (class90.field2095) {
            if (arg0 != 3) {
                field490 = 42;
            }
            class141 var1 = class70.method535(class88.field2059, -64, class47.field1260);
            if (var1 != null && var1.field3394 != null) {
                class43.method331(var1.field3394, arg0 ^ -116, (class141) null, 0, 0, 0, var1);
            }
            class90.field2095 = false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[BBI)I")
    public static final int method127(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field494;
        int var4 = -1;
        for (int var5 = arg0; arg3 > var5; ++var5) {
            var4 = class146.field3532[255 & (var4 ^ arg1[var5])] ^ var4 >>> 8;
        }
        if (arg2 != -67) {
            method128(false);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)Lbe;")
    public final class13 method12(boolean arg0) {
        ++field496;
        if (this.field478 == null) {
            return null;
        } else if (!arg0) {
            return null;
        } else {
            class49 var2 = ~super.field3005 != 0 && ~super.field2979 == -1 ? class111.method785(super.field3005, 22969) : null;
            class49 var3 = super.field2976 == -1 || super.field2978 == super.field2976 && var2 != null ? null : class111.method785(super.field2976, 22969);
            class13 var4 = this.field478.method851(var2, super.field2960, super.field2974, var3, (byte) -34);
            if (var4 == null) {
                return null;
            } else {
                var4.method104();
                super.field2945 = var4.field871;
                if (super.field2991 != -1 && ~super.field3002 != 0) {
                    class13 var5 = class128.method971(false, super.field2991).method738((byte) -125, super.field3002);
                    if (var5 != null) {
                        var5.method83(0, -super.field2949, 0);
                        class13[] var6 = new class13[] { var4, var5 };
                        var4 = new class13(var6, 2);
                    }
                }
                if (~this.field478.field2725 == -2) {
                    var4.field316 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(Z)V")
    public static void method128(boolean arg0) {
        field476 = null;
        field480 = null;
        field485 = null;
        field473 = null;
        field491 = null;
        field493 = null;
        field481 = null;
        field471 = null;
        field472 = null;
        field488 = null;
        field497 = null;
        if (arg0) {
            method130(43, -31, -110, 113, 84, 23, 123);
        }
        field475 = null;
        field479 = null;
        field495 = null;
        field484 = null;
        field477 = null;
        field482 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
    public static final void method129(int arg0, int arg1) {
        ++field483;
        if (~arg0 != arg1) {
            if (class145.method1090(arg1 + -81, arg0)) {
                class141[] var2 = class58.field1500[arg0];
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class141 var4 = var2[var3];
                    if (var4.field3371 != null) {
                        class43.method331(var4.field3371, arg1 ^ -112, (class141) null, 0, 0, 0, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field492;
        if (~(1 & arg5) == -2) {
            int var7 = arg1;
            arg1 = arg0;
            arg0 = var7;
        }
        int var8 = arg6 & 3;
        int var9 = 123 % ((-62 - arg2) / 59);
        if (var8 == 0) {
            return arg4;
        } else if (~var8 == -2) {
            return 7 - arg3 + -arg1 + 1;
        } else {
            return ~var8 == -3 ? 1 - (arg0 - 7) - arg4 : arg3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILie;IIII)V")
    public static final void method131(int arg0, class61 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field486;
        class68 var6 = new class68();
        var6.field1716 = arg4;
        var6.field1713 = arg0 * 128;
        var6.field1714 = arg1.field1585;
        var6.field1717 = arg1.field1580;
        var6.field1703 = arg1.field1600;
        var6.field1712 = arg1.field1549;
        int var7 = arg1.field1563;
        var6.field1710 = arg3 * 128;
        var6.field1698 = arg1.field1536 * 128;
        int var8 = arg1.field1571;
        if (~arg2 == -2 || ~arg2 == -4) {
            var8 = arg1.field1563;
            var7 = arg1.field1571;
        }
        var6.field1708 = (arg0 - -var7) * 128;
        var6.field1699 = (arg3 + var8) * 128;
        if (arg1.field1560 != null) {
            var6.field1706 = arg1;
            var6.method519(122);
        }
        class130.field3059.method711(var6, arg5 ^ arg5);
        if (var6.field1703 != null) {
            var6.field1709 = (int) (Math.random() * (double) (var6.field1714 - var6.field1712)) + var6.field1712;
        }
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
    public static final void method132(int arg0) {
        ++field489;
        class121.field2783.method976((byte) 51);
        int var1 = class121.field2783.method967(1, false);
        if (arg0 >= 58) {
            if (var1 != 0) {
                int var2 = class121.field2783.method967(2, false);
                if (var2 == 0) {
                    class17.field468[class111.field2577++] = 2047;
                } else if (~var2 == -2) {
                    int var3 = class121.field2783.method967(3, false);
                    class46.field1244.method959((byte) -47, var3, false);
                    int var4 = class121.field2783.method967(1, false);
                    if (~var4 == -2) {
                        class17.field468[class111.field2577++] = 2047;
                    }
                } else if (~var2 == -3) {
                    int var5 = class121.field2783.method967(3, false);
                    class46.field1244.method959((byte) -47, var5, true);
                    int var6 = class121.field2783.method967(3, false);
                    class46.field1244.method959((byte) -47, var6, true);
                    int var7 = class121.field2783.method967(1, false);
                    if (var7 == 1) {
                        class17.field468[class111.field2577++] = 2047;
                    }
                } else if (~var2 == -4) {
                    int var8 = class121.field2783.method967(7, false);
                    int var9 = class121.field2783.method967(1, false);
                    if (~var9 == -2) {
                        class17.field468[class111.field2577++] = 2047;
                    }
                    int var10 = class121.field2783.method967(7, false);
                    class17.field466 = class121.field2783.method967(2, false);
                    int var11 = class121.field2783.method967(1, false);
                    class46.field1244.method957(var10, 108, var8, var11 == 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(B)Z")
    public final boolean method133(byte arg0) {
        if (arg0 >= -104) {
            return true;
        } else {
            ++field474;
            return this.field478 != null;
        }
    }
}
