import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class35 extends RuntimeException {

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field495;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Ljava/lang/String;")
    public String field496;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field492 = 0;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Leg;")
    public static class37 field498 = class174.method1167("Objet d(Wabonn-Bs", 95);

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static volatile int field497 = 0;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Z")
    public static boolean field501 = false;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Leg;")
    public static class37 field499 = class174.method1167("settings", 89);

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Leg;")
    public static class37 field502 = class174.method1167("Connexion perdue)3", 119);

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Leg;")
    public static class37 field507 = class174.method1167("mapfunction", 71);

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Ljl;")
    public static class101 field508;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lja;")
    public static class105 field494;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Z")
    public static boolean field504;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)Z")
    public static final boolean method199(int arg0, int arg1, int arg2, int arg3) {
        if (!class51.method330(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class218.field3754[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class23.field301) {
                    if (!class113.method808(var4, var6, var5)) {
                        return false;
                    }
                    if (!class113.method808(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class113.method808(var4, var7, var5)) {
                        return false;
                    }
                    if (!class113.method808(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class113.method808(var4, var8, var5)) {
                    return false;
                }
                if (!class113.method808(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class184.field3099) {
                    if (!class113.method808(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class113.method808(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class113.method808(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class113.method808(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class113.method808(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class113.method808(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class23.field301) {
                    if (!class113.method808(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class113.method808(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class113.method808(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class113.method808(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class113.method808(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class113.method808(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class184.field3099) {
                    if (!class113.method808(var4, var6, var5)) {
                        return false;
                    }
                    if (!class113.method808(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class113.method808(var4, var7, var5)) {
                        return false;
                    }
                    if (!class113.method808(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class113.method808(var4, var8, var5)) {
                    return false;
                }
                if (!class113.method808(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class113.method808(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class113.method808(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class113.method808(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class113.method808(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class113.method808(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILeg;)V")
    public static final void method200(int arg0, class37 arg1) {
        field505++;
        if (class281.field4955 == null) {
            return;
        }
        long var2 = arg1.method217((byte) -102);
        int var4 = 0;
        if (var2 == 0L || arg0 > -5) {
            return;
        }
        while (class281.field4955.length > var4 && class281.field4955[var4].field1027 != var2) {
            var4++;
        }
        if (class281.field4955.length > var4 && class281.field4955[var4] != null) {
            class82.field1283++;
            class273.field4778.method1697(50, 120);
            class273.field4778.method1256(class281.field4955[var4].field1027, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JI)Leg;")
    public static final class37 method201(long arg0, int arg1) {
        field493++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 != 2) {
                method200(-38, (class37) null);
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class42.field661[(int) (var8 - (arg0 * 37L))];
            }
            class37 var7 = new class37();
            var7.field599 = var6;
            var7.field576 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
    public static final int method202(int arg0, int arg1, int arg2) {
        field510++;
        int var3 = arg0 - 1 & arg2 >> 31;
        if (arg1 != 238) {
            field502 = null;
        }
        return ((arg2 >>> 31) + arg2) % arg0 + var3;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class35(Throwable arg0, String arg1) {
        this.field495 = arg0;
        this.field496 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static final void method203(int arg0) {
        class210.field3614.method1409(108);
        field491++;
        if (arg0 != 128) {
            field492 = -15;
        }
        class74.field1166.method1409(arg0 - 29);
        class107.field1662.method1409(arg0 ^ 0xF9);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLpe;BII)V")
    public static final void method204(boolean arg0, class237 arg1, byte arg2, int arg3, int arg4) {
        field503++;
        int var5 = arg1.field4067;
        int var6 = arg1.field4206;
        if (arg1.field4218 == 0) {
            arg1.field4067 = arg1.field4141;
        } else if (arg1.field4218 == 1) {
            arg1.field4067 = arg4 - arg1.field4141;
        } else if (arg1.field4218 == 2) {
            arg1.field4067 = arg1.field4141 * arg4 >> 14;
        } else if (arg1.field4218 == 3) {
            if (arg1.field4228 == 2) {
                arg1.field4067 = (arg1.field4141 - 1) * arg1.field4071 + arg1.field4141 * 32;
            } else if (arg1.field4228 == 7) {
                arg1.field4067 = arg1.field4141 * 115 + ((arg1.field4141 - 1) * arg1.field4071);
            }
        }
        if (arg1.field4134 == 0) {
            arg1.field4206 = arg1.field4172;
        } else if (arg1.field4134 == 1) {
            arg1.field4206 = arg3 - arg1.field4172;
        } else if (arg1.field4134 == 2) {
            arg1.field4206 = arg1.field4172 * arg3 >> 14;
        } else if (arg1.field4134 == 3) {
            if (arg1.field4228 == 2) {
                arg1.field4206 = (arg1.field4172 - 1) * arg1.field4066 + arg1.field4172 * 32;
            } else if (arg1.field4228 == 7) {
                arg1.field4206 = (arg1.field4172 - 1) * arg1.field4066 + arg1.field4172 * 12;
            }
        }
        if (arg1.field4218 == 4) {
            arg1.field4067 = arg1.field4221 * arg1.field4206 / arg1.field4102;
        }
        if (arg2 <= 125) {
            return;
        }
        if (arg1.field4134 == 4) {
            arg1.field4206 = arg1.field4102 * arg1.field4067 / arg1.field4221;
        }
        if (class126.field2117 && (client.method787(arg1) != 0 || arg1.field4228 == 0)) {
            if (arg1.field4206 < 5 && arg1.field4067 < 5) {
                arg1.field4206 = 5;
                arg1.field4067 = 5;
            } else {
                if (arg1.field4206 <= 0) {
                    arg1.field4206 = 5;
                }
                if (arg1.field4067 <= 0) {
                    arg1.field4067 = 5;
                }
            }
        }
        if (arg1.field4175 == 1337) {
            class60.field987 = arg1;
        }
        if (arg0 && arg1.field4226 != null && arg1.field4067 != var5 || arg1.field4206 != var6) {
            class85 var7 = new class85();
            var7.field1346 = arg1;
            var7.field1339 = arg1.field4226;
            class21.field271.method1574(var7, 0);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static void method205(int arg0) {
        field498 = null;
        field507 = null;
        if (arg0 != 95) {
            field509 = -114;
        }
        field499 = null;
        field508 = null;
        field502 = null;
        field494 = null;
    }
}
