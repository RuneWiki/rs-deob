import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class242 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public int field3597 = -1;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public int field3599 = 0;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public int field3601 = -1;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public int field3615 = 0;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public int field3611 = -1;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public int field3604 = -1;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field3616 = 0;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public int field3607 = -1;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public int field3621 = -1;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public int field3603 = -1;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public int field3602 = 0;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public int field3598 = 0;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public int field3600 = -1;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field3610 = -1;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public int field3612 = -1;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public int field3609 = 0;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public int field3626 = 0;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public int field3622 = -1;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public int field3624 = -1;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public int field3613 = 0;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public int field3623 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public int field3596 = -1;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public int field3625 = -1;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public int field3618 = 0;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public int field3628 = -1;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public int field3630 = -1;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3619 = Calendar.getInstance();

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field3629 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "Z")
    public static boolean field3627;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "[[I")
    public int[][] field3631;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lre;I)V", line = 13)
    public final void method1636(class263 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1787(false);
            if (var3 == 0) {
                if (arg1 != 0) {
                    method1637(-108, 102, (byte) 84);
                }
                field3617++;
                return;
            }
            this.method1641(var3, arg0, arg1 ^ 0xFFFFFF9E);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIB)Lmg;", line = 50)
    public static final class61 method1637(int arg0, int arg1, byte arg2) {
        field3608++;
        int var3 = 89 % ((arg2 - 30) / 54);
        for (class61 var4 = (class61) class211.field3208.method1109(-114); var4 != null; var4 = (class61) class211.field3208.method1115((byte) 116)) {
            if (var4.field803 && var4.method406(0, arg1, arg0)) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 73)
    public static final long method1638(String arg0, int arg1) {
        field3620++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        if (arg1 != -14393) {
            field3619 = (Calendar) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 116)
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class228 var20 = new class228(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class158.field2367[var21][arg1][arg2] == null) {
                    class158.field2367[var21][arg1][arg2] = new class221(var21, arg1, arg2);
                }
            }
            class158.field2367[arg0][arg1][arg2].field3378 = var20;
        } else if (arg3 == 1) {
            class228 var22 = new class228(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class158.field2367[var23][arg1][arg2] == null) {
                    class158.field2367[var23][arg1][arg2] = new class221(var23, arg1, arg2);
                }
            }
            class158.field2367[arg0][arg1][arg2].field3378 = var22;
        } else {
            class99 var24 = new class99(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class158.field2367[var25][arg1][arg2] == null) {
                    class158.field2367[var25][arg1][arg2] = new class221(var25, arg1, arg2);
                }
            }
            class158.field2367[arg0][arg1][arg2].field3379 = var24;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 171)
    public static void method1640(int arg0) {
        field3619 = null;
        if (arg0 != 4) {
            method1639(-44, 115, 0, -127, 116, -128, -79, -33, -90, -113, 43, 57, -83, -122, 91, -74, -124, 25, 20, 43);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILre;I)V", line = 230)
    private final void method1641(int arg0, class263 arg1, int arg2) {
        field3606++;
        if (arg0 == 1) {
            this.field3597 = arg1.method1830((byte) -77);
            this.field3625 = arg1.method1830((byte) -77);
            if (this.field3625 == 65535) {
                this.field3625 = -1;
            }
            if (this.field3597 == 65535) {
                this.field3597 = -1;
            }
        } else if (arg0 == 2) {
            this.field3601 = arg1.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field3621 = arg1.method1830((byte) -77);
        } else if (arg0 == 4) {
            this.field3611 = arg1.method1830((byte) -77);
        } else if (arg0 == 5) {
            this.field3628 = arg1.method1830((byte) -77);
        } else if (arg0 == 6) {
            this.field3603 = arg1.method1830((byte) -77);
        } else if (arg0 == 7) {
            this.field3604 = arg1.method1830((byte) -77);
        } else if (arg0 == 8) {
            this.field3607 = arg1.method1830((byte) -77);
        } else if (arg0 == 9) {
            this.field3600 = arg1.method1830((byte) -77);
        } else if (arg0 == 26) {
            this.field3602 = (short) (arg1.method1787(false) * 4);
            this.field3598 = (short) (arg1.method1787(false) * 4);
        } else if (arg0 == 27) {
            if (this.field3631 == null) {
                this.field3631 = new int[12][];
            }
            int var4 = arg1.method1787(false);
            this.field3631[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field3631[var4][var5] = arg1.method1845((byte) -127);
            }
        } else if (arg0 == 29) {
            this.field3609 = arg1.method1787(false);
        } else if (arg0 == 30) {
            this.field3626 = arg1.method1830((byte) -77);
        } else if (arg0 == 31) {
            this.field3618 = arg1.method1787(false);
        } else if (arg0 == 32) {
            this.field3623 = arg1.method1830((byte) -77);
        } else if (arg0 == 33) {
            this.field3613 = arg1.method1845((byte) -126);
        } else if (arg0 == 34) {
            this.field3615 = arg1.method1787(false);
        } else if (arg0 == 35) {
            this.field3599 = arg1.method1830((byte) -77);
        } else if (arg0 == 36) {
            this.field3616 = arg1.method1845((byte) -124);
        } else if (arg0 == 37) {
            this.field3610 = arg1.method1787(false);
        } else if (arg0 == 38) {
            this.field3596 = arg1.method1830((byte) -77);
        } else if (arg0 == 39) {
            this.field3612 = arg1.method1830((byte) -77);
        } else if (arg0 == 40) {
            this.field3622 = arg1.method1830((byte) -77);
        } else if (arg0 == 41) {
            this.field3624 = arg1.method1830((byte) -77);
        } else if (arg0 == 42) {
            this.field3630 = arg1.method1830((byte) -77);
        } else if (arg0 == 43) {
            arg1.method1830((byte) -77);
        } else if (arg0 == 44) {
            arg1.method1830((byte) -77);
        } else if (arg0 == 45) {
            arg1.method1830((byte) -77);
        }
        if (arg2 >= -70) {
            this.field3597 = -100;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Llk;", line = 389)
    public static final class256 method1642(int arg0, int arg1) {
        field3614++;
        class256 var2 = (class256) class306.field4660.method1674(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 22590) {
            method1638((String) null, -90);
        }
        byte[] var3 = class226.field3449.method1441(arg1, (byte) -44, 5);
        class256 var4 = new class256();
        if (var3 != null) {
            var4.method1737(-30378, new class263(var3));
        }
        class306.field4660.method1672(-127, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 450)
    public final void method1643(int arg0) {
        field3632++;
        if (arg0 != -1) {
            this.method1643(55);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()V", line = 472)
    public static final void method1644() {
        for (int var0 = 0; var0 < class130.field2016; var0++) {
            class311 var1 = class247.field3686[var0];
            class114.method788(var1);
            class247.field3686[var0] = null;
        }
        class130.field2016 = 0;
    }
}
