import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class32 extends class47 {

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    private int field489 = 0;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "Lhb;")
    private class155 field479 = new class155(16);

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    private int field497 = 0;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "Loj;")
    private class246 field501 = new class246();

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "J")
    private long field502 = 0L;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Llj;")
    private class25 field488;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "Z")
    private boolean field498;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "Loj;")
    private class246 field499;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Llj;")
    private class25 field475;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "Lfd;")
    private class63 field472;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "Z")
    private boolean field503;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "Lwk;")
    private class196 field471;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Lrh;")
    private class17 field480;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "[[B")
    public static byte[][] field473 = new byte[50][];

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field481 = 127;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Z")
    public static volatile boolean field468 = true;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public static int field477 = 2;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "Luk;")
    private class213 field491;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "Ldk;")
    public static class251 field496;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "Z")
    private boolean field500;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "[B")
    private byte[] field495;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)[B")
    public final byte[] method202(int arg0, int arg1) {
        field463++;
        class17 var3 = this.method209(24, 0, arg1);
        if (var3 == null) {
            return null;
        }
        if (arg0 < 89) {
            this.method202(81, -81);
        }
        byte[] var4 = var3.method66(-123);
        var3.method913(-3542);
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    public final int method203(int arg0, int arg1) {
        field494++;
        if (arg0 != 1000) {
            this.field502 = 86L;
        }
        class17 var3 = (class17) this.field479.method1059(0, (long) arg1);
        return var3 == null ? 0 : var3.method68((byte) -100);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IZ)V")
    public static final void method204(int arg0, boolean arg1) {
        field490++;
        class276.method1859((byte) 121);
        if (~class153.field2385 != arg0 && class153.field2385 != 25) {
            return;
        }
        class6.field67++;
        if (class6.field67 < 50 && !arg1) {
            return;
        }
        class6.field67 = 0;
        if (!class161.field2561 && class208.field3298 != null) {
            class314.field5061.method828(107, 122);
            class161.field2552++;
            try {
                class208.field3298.method977(class314.field5061.field2573, class314.field5061.field2568, 0, -27241);
                class314.field5061.field2568 = 0;
            } catch (IOException var2) {
                class161.field2561 = true;
            }
        }
        class276.method1859((byte) 116);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)I")
    public final int method205(boolean arg0) {
        field474++;
        if (this.field491 == null) {
            return 0;
        } else if (!this.field498) {
            return this.field491.field3527;
        } else if (arg0) {
            class128 var2 = this.field499.method1643((byte) 111);
            return var2 == null ? 0 : (int) var2.field2012;
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)Luk;")
    public final class213 method206(boolean arg0) {
        field487++;
        if (this.field491 != null) {
            return this.field491;
        }
        if (this.field480 == null) {
            if (this.field472.method443(127)) {
                return null;
            }
            this.field480 = this.field472.method441((byte) 0, true, this.field478, 255, (byte) 127);
        }
        if (this.field480.field205) {
            return null;
        }
        if (arg0) {
            this.field478 = -90;
        }
        byte[] var2 = this.field480.method66(-61);
        if (this.field480 instanceof class14) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field491 = new class213(var2, this.field476);
                if (this.field491.field3521 != this.field467) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field491 = null;
                if (this.field472.method443(121)) {
                    this.field480 = null;
                } else {
                    this.field480 = this.field472.method441((byte) 0, true, this.field478, 255, (byte) 97);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field491 = new class213(var2, this.field476);
            } catch (RuntimeException var4) {
                this.field472.method435((byte) -102);
                this.field491 = null;
                if (this.field472.method443(125)) {
                    this.field480 = null;
                } else {
                    this.field480 = this.field472.method441((byte) 0, true, this.field478, 255, (byte) 108);
                }
                return null;
            }
            if (this.field475 != null) {
                this.field471.method1376(var2, !arg0, this.field478, this.field475);
            }
        }
        this.field480 = null;
        if (this.field488 != null) {
            this.field489 = 0;
            this.field495 = new byte[this.field491.field3528];
        }
        return this.field491;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public final void method207(int arg0) {
        field485++;
        if (this.field488 == null) {
            return;
        }
        this.field500 = true;
        int var2 = -44 / ((arg0 + 15) / 59);
        if (this.field499 == null) {
            this.field499 = new class246();
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public final void method208(int arg0) {
        field486++;
        if (arg0 > -123) {
            this.field491 = null;
        }
        if (this.field499 != null) {
            if (this.method206(false) == null) {
                return;
            }
            if (this.field498) {
                boolean var2 = true;
                for (class128 var3 = this.field499.method1643((byte) -124); var3 != null; var3 = this.field499.method1642((byte) 84)) {
                    int var5 = (int) var3.field2012;
                    if (this.field495[var5] == 0) {
                        this.method209(24, 1, var5);
                    }
                    if (this.field495[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method913(-3542);
                    }
                }
                while (this.field497 < this.field491.field3525.length) {
                    if (this.field491.field3525[this.field497] == 0) {
                        this.field497++;
                    } else {
                        if (this.field471.field3175 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field495[this.field497] == 0) {
                            this.method209(24, 1, this.field497);
                        }
                        if (this.field495[this.field497] == 0) {
                            var2 = false;
                            class128 var4 = new class128();
                            var4.field2012 = (long) this.field497;
                            this.field499.method1646(true, var4);
                        }
                        this.field497++;
                    }
                }
                if (var2) {
                    this.field497 = 0;
                    this.field498 = false;
                }
            } else if (this.field500) {
                boolean var6 = true;
                for (class128 var7 = this.field499.method1643((byte) -88); var7 != null; var7 = this.field499.method1642((byte) 64)) {
                    int var9 = (int) var7.field2012;
                    if (this.field495[var9] != 1) {
                        this.method209(24, 2, var9);
                    }
                    if (this.field495[var9] == 1) {
                        var7.method913(-3542);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field497 < this.field491.field3525.length) {
                    if (this.field491.field3525[this.field497] == 0) {
                        this.field497++;
                    } else {
                        if (this.field472.method436(112)) {
                            var6 = false;
                            break;
                        }
                        if (this.field495[this.field497] != 1) {
                            this.method209(24, 2, this.field497);
                        }
                        if (this.field495[this.field497] != 1) {
                            class128 var8 = new class128();
                            var8.field2012 = (long) this.field497;
                            this.field499.method1646(true, var8);
                            var6 = false;
                        }
                        this.field497++;
                    }
                }
                if (var6) {
                    this.field500 = false;
                    this.field497 = 0;
                }
            } else {
                this.field499 = null;
            }
        }
        if (!this.field503 || class191.method1350((byte) 85) < this.field502) {
            return;
        }
        for (class17 var10 = (class17) this.field479.method1063(-125); var10 != null; var10 = (class17) this.field479.method1055(18178)) {
            if (!var10.field205) {
                if (var10.field203) {
                    if (!var10.field201) {
                        throw new RuntimeException();
                    }
                    var10.method913(-3542);
                } else {
                    var10.field203 = true;
                }
            }
        }
        this.field502 = class191.method1350((byte) -66) + 1000L;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)Lrh;")
    private final class17 method209(int arg0, int arg1, int arg2) {
        field482++;
        if (arg0 != 24) {
            return null;
        }
        class17 var4 = (class17) this.field479.method1059(0, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field201 && var4.field205) {
            var4.method913(-3542);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field488 == null || this.field495[arg2] == -1) {
                    if (this.field472.method443(117)) {
                        return null;
                    }
                    var4 = this.field472.method441((byte) 2, true, arg2, this.field478, (byte) 89);
                } else {
                    var4 = this.field471.method1377((byte) -105, arg2, this.field488);
                }
            } else if (arg1 == 1) {
                if (this.field488 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field471.method1372(-97, this.field488, arg2);
            } else if (arg1 == 2) {
                if (this.field488 == null) {
                    throw new RuntimeException();
                }
                if (this.field495[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field472.method436(101)) {
                    return null;
                }
                var4 = this.field472.method441((byte) 2, false, arg2, this.field478, (byte) 91);
            } else {
                throw new RuntimeException();
            }
            this.field479.method1052((long) arg2, (byte) -65, var4);
        }
        if (var4.field205) {
            return null;
        }
        byte[] var5 = var4.method66(-83);
        if (!var4 instanceof class14) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class26.field329.reset();
                class26.field329.update(var5, 0, var5.length - 2);
                int var6 = (int) class26.field329.getValue();
                if (this.field491.field3517[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field472.field1058 = 0;
                this.field472.field1060 = 0;
            } catch (RuntimeException var12) {
                this.field472.method435((byte) -118);
                var4.method913(arg0 - 3566);
                if (var4.field201 && !this.field472.method443(119)) {
                    class225 var7 = this.field472.method441((byte) 2, true, arg2, this.field478, (byte) 90);
                    this.field479.method1052((long) arg2, (byte) -65, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field491.field3518[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field491.field3518[arg2];
            if (this.field488 != null) {
                this.field471.method1376(var5, true, arg2, this.field488);
                if (this.field495[arg2] != 1) {
                    this.field489++;
                    this.field495[arg2] = 1;
                }
            }
            if (!var4.field201) {
                var4.method913(-3542);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class26.field329.reset();
            class26.field329.update(var5, 0, var5.length - 2);
            int var8 = (int) class26.field329.getValue();
            if (this.field491.field3517[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field491.field3518[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field495[arg2] != 1) {
                this.field489++;
                this.field495[arg2] = 1;
            }
            if (!var4.field201) {
                var4.method913(-3542);
            }
            return var4;
        } catch (Exception var11) {
            this.field495[arg2] = -1;
            var4.method913(-3542);
            if (var4.field201 && !this.field472.method443(111)) {
                class225 var10 = this.field472.method441((byte) 2, true, arg2, this.field478, (byte) 96);
                this.field479.method1052((long) arg2, (byte) -65, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)I")
    public final int method210(int arg0) {
        field484++;
        if (arg0 != 11951) {
            this.method212(-48);
        }
        return this.field489;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method211(byte arg0) {
        field473 = null;
        if (arg0 <= -83) {
            field496 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public final void method212(int arg0) {
        field466++;
        if (this.field499 == null || this.method206(false) == null) {
            return;
        }
        class128 var2 = this.field501.method1643((byte) -31);
        int var3 = 31 % ((arg0 + 41) / 54);
        while (var2 != null) {
            int var4 = (int) var2.field2012;
            if (var4 < 0 || var4 >= this.field491.field3528 || this.field491.field3525[var4] == 0) {
                var2.method913(-3542);
            } else {
                if (this.field495[var4] == 0) {
                    this.method209(24, 1, var4);
                }
                if (this.field495[var4] == -1) {
                    this.method209(24, 2, var4);
                }
                if (this.field495[var4] == 1) {
                    var2.method913(-3542);
                }
            }
            var2 = this.field501.method1642((byte) 97);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V")
    public final void method213(int arg0, boolean arg1) {
        field470++;
        if (this.field488 == null) {
            return;
        }
        for (class128 var3 = this.field501.method1643((byte) 119); var3 != null; var3 = this.field501.method1642((byte) 69)) {
            if ((long) arg0 == var3.field2012) {
                return;
            }
        }
        class128 var4 = new class128();
        if (arg1) {
            this.field501 = null;
        }
        var4.field2012 = (long) arg0;
        this.field501.method1646(!arg1, var4);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)I")
    public final int method214(byte arg0) {
        field493++;
        if (this.field491 == null) {
            return 0;
        } else if (arg0 <= 67) {
            return -113;
        } else {
            return this.field491.field3527;
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)I")
    public final int method215(int arg0) {
        field492++;
        if (this.method206(false) == null) {
            return this.field480 == null ? 0 : this.field480.method68((byte) 123);
        } else {
            if (arg0 != 100) {
                this.method203(83, -16);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(II)Lol;")
    public static final class117 method216(int arg0, int arg1) {
        int var2 = -10 / ((70 - arg0) / 47);
        field465++;
        if (arg1 == 0) {
            return new class186();
        } else if (arg1 == 1) {
            return new class28();
        } else if (arg1 == 2) {
            return new class219();
        } else if (arg1 == 3) {
            return new class312();
        } else if (arg1 == 4) {
            return new class98();
        } else if (arg1 == 5) {
            return new class92();
        } else if (arg1 == 6) {
            return new class272();
        } else if (arg1 == 7) {
            return new class136();
        } else if (arg1 == 8) {
            return new class153();
        } else if (arg1 == 9) {
            return new class9();
        } else if (arg1 == 10) {
            return new class268();
        } else if (arg1 == 11) {
            return new class293();
        } else if (arg1 == 12) {
            return new class125();
        } else if (arg1 == 13) {
            return new class112();
        } else if (arg1 == 14) {
            return new class311();
        } else if (arg1 == 15) {
            return new class298();
        } else if (arg1 == 16) {
            return new class82();
        } else if (arg1 == 17) {
            return new class273();
        } else if (arg1 == 18) {
            return new class42();
        } else if (arg1 == 19) {
            return new class244();
        } else if (arg1 == 20) {
            return new class214();
        } else if (arg1 == 21) {
            return new class96();
        } else if (arg1 == 22) {
            return new class100();
        } else if (arg1 == 23) {
            return new class10();
        } else if (arg1 == 24) {
            return new class22();
        } else if (arg1 == 25) {
            return new class130();
        } else if (arg1 == 26) {
            return new class53();
        } else if (arg1 == 27) {
            return new class170();
        } else if (arg1 == 28) {
            return new class181();
        } else if (arg1 == 29) {
            return new class256();
        } else if (arg1 == 30) {
            return new class224();
        } else if (arg1 == 31) {
            return new class99();
        } else if (arg1 == 32) {
            return new class13();
        } else if (arg1 == 33) {
            return new class23();
        } else if (arg1 == 34) {
            return new class193();
        } else if (arg1 == 35) {
            return new class61();
        } else if (arg1 == 36) {
            return new class95();
        } else if (arg1 == 37) {
            return new class243();
        } else if (arg1 == 38) {
            return new class75();
        } else if (arg1 == 39) {
            return new class199();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)Lag;")
    public static final class211 method217(int arg0, int arg1, int arg2) {
        if (arg2 <= 110) {
            return null;
        }
        field464++;
        class211 var3 = class17.method87(arg0, -20055);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3352 == null || var3.field3352.length <= arg1) {
            return null;
        } else {
            return var3.field3352[arg1];
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILlj;Llj;Lfd;Lwk;IIZ)V")
    public class32(int arg0, class25 arg1, class25 arg2, class63 arg3, class196 arg4, int arg5, int arg6, boolean arg7) {
        this.field488 = arg1;
        this.field478 = arg0;
        if (this.field488 == null) {
            this.field498 = false;
        } else {
            this.field498 = true;
            this.field499 = new class246();
        }
        this.field467 = arg6;
        this.field475 = arg2;
        this.field472 = arg3;
        this.field503 = arg7;
        this.field471 = arg4;
        this.field476 = arg5;
        if (this.field475 != null) {
            this.field480 = this.field471.method1377((byte) -105, this.field478, this.field475);
        }
    }
}
