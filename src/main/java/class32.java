import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class32 extends class127 {

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    private int field610 = 0;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lld;")
    private class118 field605 = new class118(16);

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    private int field625 = 0;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "Llc;")
    private class160 field619 = new class160();

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "J")
    private long field627 = 0L;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lmd;")
    private class245 field586;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Z")
    private boolean field620;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Llc;")
    private class160 field618;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Ldi;")
    private class147 field612;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "Z")
    private boolean field626;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lmd;")
    private class245 field589;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lng;")
    private class156 field596;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Lel;")
    private class115 field603;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Lok;")
    public static class146 field608 = class235.method1724(-12908, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Llc;")
    public static class160 field601 = new class160();

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "[I")
    public static int[] field615 = new int[25];

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "Lok;")
    public static class146 field617 = class235.method1724(-12908, " )2>");

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field623 = 1;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Loh;")
    public static class15 field600;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "Loh;")
    public static class15 field621;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lrc;")
    private class320 field587;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "Lje;")
    public static class70 field622;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "Z")
    private boolean field624;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[B")
    private byte[] field602;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)Lel;", line = 12)
    private final class115 method225(byte arg0, int arg1, int arg2) {
        class115 var4 = (class115) this.field605.method810((byte) -93, (long) arg2);
        field591++;
        if (var4 != null && arg1 == 0 && !var4.field1849 && var4.field1856) {
            var4.method1325(-2935);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field586 == null || this.field602[arg2] == -1) {
                    if (this.field596.method1227(2476)) {
                        return null;
                    }
                    var4 = this.field596.method1225((byte) -99, arg2, true, this.field590, (byte) 2);
                } else {
                    var4 = this.field612.method1133(this.field586, arg2, 5);
                }
            } else if (arg1 == 1) {
                if (this.field586 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field612.method1135(arg2, (byte) -94, this.field586);
            } else if (arg1 == 2) {
                if (this.field586 == null) {
                    throw new RuntimeException();
                }
                if (this.field602[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field596.method1213(100)) {
                    return null;
                }
                var4 = this.field596.method1225((byte) -62, arg2, false, this.field590, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field605.method805(var4, (long) arg2, 83);
        }
        if (var4.field1856) {
            return null;
        }
        if (arg0 <= 29) {
            this.field587 = (class320) null;
        }
        byte[] var5 = var4.method706(100);
        if (!var4 instanceof class123) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class313.field5334.reset();
                class313.field5334.update(var5, 0, var5.length - 2);
                int var6 = (int) class313.field5334.getValue();
                if (this.field587.field5470[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field596.field2635 = 0;
                this.field596.field2632 = 0;
            } catch (RuntimeException var14) {
                this.field596.method1215(-102);
                var4.method1325(-2935);
                if (var4.field1849 && !this.field596.method1227(2476)) {
                    class103 var8 = this.field596.method1225((byte) 102, arg2, true, this.field590, (byte) 2);
                    this.field605.method805(var8, (long) arg2, 72);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field587.field5472[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field587.field5472[arg2];
            if (this.field586 != null) {
                this.field612.method1136(var5, arg2, -4133, this.field586);
                if (this.field602[arg2] != 1) {
                    this.field610++;
                    this.field602[arg2] = 1;
                }
            }
            if (!var4.field1849) {
                var4.method1325(-2935);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class313.field5334.reset();
            class313.field5334.update(var5, 0, var5.length - 2);
            int var9 = (int) class313.field5334.getValue();
            if (this.field587.field5470[arg2] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field587.field5472[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field602[arg2] != 1) {
                if (this.field602[arg2] != 0) {
                }
                this.field610++;
                this.field602[arg2] = 1;
            }
            if (!var4.field1849) {
                var4.method1325(-2935);
            }
            return var4;
        } catch (Exception var13) {
            this.field602[arg2] = -1;
            var4.method1325(-2935);
            if (var4.field1849 && !this.field596.method1227(2476)) {
                class103 var12 = this.field596.method1225((byte) -26, arg2, true, this.field590, (byte) 2);
                this.field605.method805(var12, (long) arg2, 82);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I", line = 231)
    public final int method226(int arg0, int arg1) {
        if (arg0 != 2479) {
            this.method230((byte) -53);
        }
        field597++;
        class115 var3 = (class115) this.field605.method810((byte) -125, (long) arg1);
        return var3 == null ? 0 : var3.method703(arg0 ^ 0x789E);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V", line = 255)
    public final void method227(int arg0, int arg1) {
        field598++;
        if (this.field586 == null) {
            return;
        }
        for (class171 var3 = this.field619.method1251(90); var3 != null; var3 = this.field619.method1253(94)) {
            if (((long) arg1) == var3.field2883) {
                return;
            }
        }
        int var4 = 99 % ((-arg0 - 57) / 50);
        class171 var5 = new class171();
        var5.field2883 = (long) arg1;
        this.field619.method1258(0, var5);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)I", line = 283)
    public final int method228(int arg0) {
        field611++;
        int var2 = 125 / ((-arg0 - 1) / 59);
        if (this.method233(-17675) == null) {
            return this.field603 == null ? 0 : this.field603.method703(28977);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)[B", line = 304)
    public final byte[] method229(boolean arg0, int arg1) {
        field594++;
        class115 var3 = this.method225((byte) 107, 0, arg1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method706(100);
        if (!arg0) {
            this.method225((byte) 71, 21, -115);
        }
        var3.method1325(-2935);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 326)
    public final void method230(byte arg0) {
        field613++;
        if (this.field618 == null || this.method233(-17675) == null) {
            return;
        }
        if (arg0 > -43) {
            this.method236(false);
        }
        for (class171 var2 = this.field619.method1251(-60); var2 != null; var2 = this.field619.method1253(52)) {
            int var3 = (int) var2.field2883;
            if (var3 < 0 || this.field587.field5467 <= var3 || this.field587.field5475[var3] == 0) {
                var2.method1325(-2935);
            } else {
                if (this.field602[var3] == 0) {
                    this.method225((byte) 113, 1, var3);
                }
                if (this.field602[var3] == -1) {
                    this.method225((byte) 33, 2, var3);
                }
                if (this.field602[var3] == 1) {
                    var2.method1325(-2935);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILoh;)I", line = 374)
    public static final int method231(int arg0, class15 arg1) {
        int var2 = 0;
        field592++;
        if (arg1.method117(-32236, class282.field4833)) {
            var2++;
        }
        if (arg1.method117(-32236, class278.field4769)) {
            var2++;
        }
        if (arg0 != -28742) {
            method231(93, (class15) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 393)
    public static void method232(int arg0) {
        field621 = null;
        field600 = null;
        field617 = null;
        field601 = null;
        field608 = null;
        field615 = null;
        field622 = null;
        int var1 = 97 / ((arg0 - 4) / 32);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Lrc;", line = 415)
    public final class320 method233(int arg0) {
        field606++;
        if (this.field587 != null) {
            return this.field587;
        }
        if (this.field603 == null) {
            if (this.field596.method1227(2476)) {
                return null;
            }
            this.field603 = this.field596.method1225((byte) 126, this.field590, true, 255, (byte) 0);
        }
        if (this.field603.field1856) {
            return null;
        } else if (arg0 == -17675) {
            byte[] var2 = this.field603.method706(100);
            if (this.field603 instanceof class123) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field587 = new class320(var2, this.field614);
                    if (this.field587.field5466 != this.field599) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field587 = null;
                    if (this.field596.method1227(2476)) {
                        this.field603 = null;
                    } else {
                        this.field603 = this.field596.method1225((byte) -26, this.field590, true, 255, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field587 = new class320(var2, this.field614);
                } catch (RuntimeException var6) {
                    this.field596.method1215(-85);
                    this.field587 = null;
                    if (this.field596.method1227(arg0 + 20151)) {
                        this.field603 = null;
                    } else {
                        this.field603 = this.field596.method1225((byte) 127, this.field590, true, 255, (byte) 0);
                    }
                    return null;
                }
                if (this.field589 != null) {
                    this.field612.method1136(var2, this.field590, -4133, this.field589);
                }
            }
            this.field603 = null;
            if (this.field586 != null) {
                this.field602 = new byte[this.field587.field5467];
                this.field610 = 0;
            }
            return this.field587;
        } else {
            return (class320) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)Lhj;", line = 515)
    public static final class28 method234(int arg0) {
        field593++;
        if (arg0 != -32466) {
            field600 = (class15) null;
        }
        class28 var1;
        if (class271.field4640) {
            var1 = new class154(class177.field3006, class242.field4027, class226.field3776[0], class23.field424[0], class238.field3967[0], class150.field2562[0], class17.field353[0], class94.field1514);
        } else {
            var1 = new class315(class177.field3006, class242.field4027, class226.field3776[0], class23.field424[0], class238.field3967[0], class150.field2562[0], class17.field353[0], class94.field1514);
        }
        class301.method2122((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)I", line = 539)
    public final int method235(byte arg0) {
        if (arg0 != 0) {
            this.field587 = (class320) null;
        }
        field595++;
        return this.field587 == null ? 0 : this.field587.field5465;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I", line = 554)
    public final int method236(boolean arg0) {
        field609++;
        if (this.field587 == null) {
            return 0;
        } else if (arg0) {
            return -75;
        } else if (this.field620) {
            class171 var2 = this.field618.method1251(117);
            return var2 == null ? 0 : (int) var2.field2883;
        } else {
            return this.field587.field5465;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(ILmd;Lmd;Lng;Ldi;IIZ)V", line = 833)
    public class32(int arg0, class245 arg1, class245 arg2, class156 arg3, class147 arg4, int arg5, int arg6, boolean arg7) {
        this.field590 = arg0;
        this.field586 = arg1;
        if (this.field586 == null) {
            this.field620 = false;
        } else {
            this.field620 = true;
            this.field618 = new class160();
        }
        this.field612 = arg4;
        this.field626 = arg7;
        this.field589 = arg2;
        this.field596 = arg3;
        this.field614 = arg5;
        this.field599 = arg6;
        if (this.field589 != null) {
            this.field603 = this.field612.method1133(this.field589, this.field590, 5);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V", line = 583)
    public final void method237(byte arg0) {
        field588++;
        if (this.field618 != null) {
            if (this.method233(-17675) == null) {
                return;
            }
            if (this.field620) {
                boolean var2 = true;
                for (class171 var3 = this.field618.method1251(91); var3 != null; var3 = this.field618.method1253(arg0 ^ 0x1C)) {
                    int var4 = (int) var3.field2883;
                    if (this.field602[var4] == 0) {
                        this.method225((byte) 37, 1, var4);
                    }
                    if (this.field602[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method1325(-2935);
                    }
                }
                while (this.field625 < this.field587.field5475.length) {
                    if (this.field587.field5475[this.field625] == 0) {
                        this.field625++;
                    } else {
                        if (this.field612.field2501 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field602[this.field625] == 0) {
                            this.method225((byte) 99, 1, this.field625);
                        }
                        if (this.field602[this.field625] == 0) {
                            var2 = false;
                            class171 var5 = new class171();
                            var5.field2883 = (long) this.field625;
                            this.field618.method1258(0, var5);
                        }
                        this.field625++;
                    }
                }
                if (var2) {
                    this.field625 = 0;
                    this.field620 = false;
                }
            } else if (this.field624) {
                boolean var6 = true;
                for (class171 var7 = this.field618.method1251(-111); var7 != null; var7 = this.field618.method1253(85)) {
                    int var8 = (int) var7.field2883;
                    if (this.field602[var8] != 1) {
                        this.method225((byte) 110, 2, var8);
                    }
                    if (this.field602[var8] == 1) {
                        var7.method1325(-2935);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field587.field5475.length > this.field625) {
                    if (this.field587.field5475[this.field625] == 0) {
                        this.field625++;
                    } else {
                        if (this.field596.method1213(arg0 ^ 0x31)) {
                            var6 = false;
                            break;
                        }
                        if (this.field602[this.field625] != 1) {
                            this.method225((byte) 87, 2, this.field625);
                        }
                        if (this.field602[this.field625] != 1) {
                            class171 var9 = new class171();
                            var9.field2883 = (long) this.field625;
                            var6 = false;
                            this.field618.method1258(0, var9);
                        }
                        this.field625++;
                    }
                }
                if (var6) {
                    this.field624 = false;
                    this.field625 = 0;
                }
            } else {
                this.field618 = null;
            }
        }
        if (arg0 != 85) {
            this.field602 = (byte[]) null;
        }
        if (!this.field626 || this.field627 > class67.method501(arg0 - 187)) {
            return;
        }
        for (class115 var10 = (class115) this.field605.method807(-58); var10 != null; var10 = (class115) this.field605.method806(94)) {
            if (!var10.field1856) {
                if (var10.field1847) {
                    if (!var10.field1849) {
                        throw new RuntimeException();
                    }
                    var10.method1325(arg0 ^ 0xFFFFF4DC);
                } else {
                    var10.field1847 = true;
                }
            }
        }
        this.field627 = class67.method501(arg0 ^ 0xFFFFFFD7) + 1000L;
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V", line = 761)
    public final void method238(int arg0) {
        field607++;
        if (this.field586 == null) {
            return;
        }
        this.field624 = true;
        if (this.field618 == null) {
            this.field618 = new class160();
        }
        int var2 = 6 % ((arg0 + 67) / 55);
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)I", line = 778)
    public final int method239(int arg0) {
        if (arg0 == 0) {
            field604++;
            return this.field610;
        } else {
            return -37;
        }
    }
}
