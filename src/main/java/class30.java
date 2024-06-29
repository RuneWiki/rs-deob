import java.awt.event.KeyEvent;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 {

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "J")
    private long field721 = -1L;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "J")
    private long field728 = -1L;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    private int field748 = 0;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Lo;")
    private class84 field747;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "J")
    private long field719;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
    private long field717;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[B")
    private byte[] field736;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "[B")
    private byte[] field746;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "J")
    private long field732;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lad;")
    public static class5 field722 = class88.method674("Keine Antwort vom Server)3", 12);

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[I")
    public static int[] field733 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "Lad;")
    private static class5 field750 = class88.method674("Members object", -63);

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Lad;")
    private static class5 field744 = class88.method674("Accept trade", 86);

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Lad;")
    public static class5 field740 = field744;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lad;")
    public static class5 field734 = field750;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Lad;")
    public static class5 field752 = class88.method674("Bitte warten Sie)3)3)3", 44);

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Lbb;")
    public static class9 field749 = new class9(30);

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "[I")
    public static int[] field754 = new int[25];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "J")
    private long field720;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lrd;")
    public static class106 field724;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "[Luc;")
    public static class123[] field725;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[Luc;")
    public static class123[] field739;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 3)
    private final void method240(int arg0) throws IOException {
        if (this.field728 != -1L) {
            if (this.field728 != this.field720) {
                this.field747.method647(1, this.field728);
                this.field720 = this.field728;
            }
            this.field747.method644(0, this.field748, 120, this.field746);
            long var2 = -1L;
            if (this.field721 <= this.field728 && (long) this.field753 + this.field721 > this.field728) {
                var2 = this.field728;
            } else if (this.field728 <= this.field721 && this.field721 < (long) this.field748 + this.field728) {
                var2 = this.field721;
            }
            this.field720 += this.field748;
            long var4 = -1L;
            if (this.field720 > this.field719) {
                this.field719 = this.field720;
            }
            if ((long) this.field748 + this.field728 > this.field721 && (long) this.field753 + this.field721 >= (long) this.field748 + this.field728) {
                var4 = this.field728 + (long) this.field748;
            } else if (this.field728 < (long) this.field753 + this.field721 && (long) this.field748 + this.field728 >= (long) this.field753 + this.field721) {
                var4 = (long) this.field753 + this.field721;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class29.method239(this.field746, (int) (var2 - this.field728), this.field736, (int) (var2 - this.field721), var6);
            }
            this.field728 = -1L;
            this.field748 = 0;
        }
        field726++;
        if (arg0 != -2250) {
            this.method242(-12, 58L);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lo;II)V", line = 761)
    public class30(class84 arg0, int arg1, int arg2) throws IOException {
        this.field747 = arg0;
        this.field717 = this.field719 = arg0.method642(-96);
        this.field736 = new byte[arg1];
        this.field746 = new byte[arg2];
        this.field732 = 0L;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lvd;", line = 103)
    public static final class130 method241(byte arg0) {
        field730++;
        class130 var1 = new class130(class38.field930, class16.field432, class43.field1095, class46.field1198, class17.field458);
        class21.method169((byte) 25);
        if (arg0 > -34) {
            field734 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V", line = 118)
    public final void method242(int arg0, long arg1) {
        field729++;
        if (arg1 >= 0L) {
            this.field732 = arg1;
            int var4 = 118 / ((-arg0 - 18) / 47);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)J", line = 139)
    public final long method243(byte arg0) {
        int var2 = -80 % ((14 - arg0) / 42);
        field738++;
        return this.field717;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 153)
    public static void method244(int arg0) {
        field725 = null;
        field750 = null;
        field752 = null;
        field734 = null;
        field754 = null;
        field724 = null;
        field722 = null;
        field749 = null;
        field739 = null;
        field744 = null;
        field740 = null;
        int var1 = -27 / ((-arg0 - 34) / 59);
        field733 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 180)
    private final void method245(boolean arg0) throws IOException {
        if (arg0) {
            return;
        }
        this.field753 = 0;
        field742++;
        if (this.field732 != this.field720) {
            this.field747.method647(1, this.field732);
            this.field720 = this.field732;
        }
        this.field721 = this.field732;
        while (this.field736.length > this.field753) {
            int var2 = this.field747.method645(this.field753, this.field736, 24137, this.field736.length - this.field753);
            if (var2 == -1) {
                break;
            }
            this.field720 += var2;
            this.field753 += var2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 218)
    public static final int method246(KeyEvent arg0, int arg1) {
        field737++;
        int var2 = arg0.getKeyChar();
        if (var2 <= arg1 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lrd;Lrd;ZZ)V", line = 231)
    public static final void method247(class106 arg0, class106 arg1, boolean arg2, boolean arg3) {
        field718++;
        class100.field2430 = arg2;
        class60.field1492 = arg0;
        class100.field2413 = arg1;
        if (!arg3) {
            method241((byte) -76);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BI)V", line = 248)
    public final void method248(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field731++;
        try {
            if (arg0 != 11483) {
                method246(null, 49);
            }
            if ((long) arg3 + this.field732 > this.field717) {
                this.field717 = (long) arg3 + this.field732;
            }
            if (this.field728 != -1L && (this.field728 > this.field732 || this.field732 > (long) this.field748 + this.field728)) {
                this.method240(arg0 ^ 0xFFFFDBED);
            }
            if (this.field728 != -1L && (long) this.field746.length + this.field728 < (long) arg3 + this.field732) {
                int var5 = (int) (this.field728 + (long) this.field746.length - this.field732);
                class29.method239(arg2, arg1, this.field746, (int) (this.field732 - this.field728), var5);
                this.field732 += var5;
                arg1 += var5;
                this.field748 = this.field746.length;
                this.method240(-2250);
                arg3 -= var5;
            }
            if (arg3 > this.field746.length) {
                if (this.field732 != this.field720) {
                    this.field747.method647(1, this.field732);
                    this.field720 = this.field732;
                }
                long var6 = -1L;
                this.field747.method644(arg1, arg3, 127, arg2);
                this.field720 += arg3;
                if (this.field719 < this.field720) {
                    this.field719 = this.field720;
                }
                long var8 = -1L;
                if (this.field732 >= this.field721 && (long) this.field753 + this.field721 > this.field732) {
                    var6 = this.field732;
                } else if (this.field721 >= this.field732 && this.field721 < (long) arg3 + this.field732) {
                    var6 = this.field721;
                }
                if ((long) arg3 + this.field732 > this.field721 && (long) this.field753 + this.field721 >= (long) arg3 + this.field732) {
                    var8 = this.field732 + (long) arg3;
                } else if (this.field732 < (long) this.field753 + this.field721 && (long) arg3 + this.field732 >= (long) this.field753 + this.field721) {
                    var8 = (long) this.field753 + this.field721;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class29.method239(arg2, (int) ((long) arg1 + var6 - this.field732), this.field736, (int) (var6 - this.field721), var10);
                }
                this.field732 += arg3;
            } else if (arg3 > 0) {
                if (this.field728 == -1L) {
                    this.field728 = this.field732;
                }
                class29.method239(arg2, arg1, this.field746, (int) (this.field732 - this.field728), arg3);
                this.field732 += arg3;
                if (this.field732 - this.field728 > (long) this.field748) {
                    this.field748 = (int) (this.field732 - this.field728);
                }
            }
        } catch (IOException var12) {
            this.field720 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Lad;", line = 381)
    public static final class5 method249(int arg0, byte arg1) {
        if (arg1 == 76) {
            field741++;
            return class69.method546(true, new class5[] { class106.method864(18413, arg0 >> 24 & 0xFF), class108.field2717, class106.method864(18413, arg0 >> 16 & 0xFF), class108.field2717, class106.method864(18413, arg0 >> 8 & 0xFF), class108.field2717, class106.method864(arg1 + 18337, arg0 & 0xFF) });
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V", line = 406)
    public final void method250(int arg0) throws IOException {
        field723++;
        this.method240(-2250);
        if (arg0 > 123) {
            this.field747.method646((byte) -76);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIBLsd;)V", line = 430)
    public static final void method251(int arg0, int arg1, int arg2, byte arg3, class112 arg4) {
        field727++;
        if (class82.field1932 == arg4 || class4.field145 >= 400) {
            return;
        }
        class5 var5;
        if (arg4.field2812 == 0) {
            var5 = class69.method546(true, new class5[] { arg4.field2801, class5.method41(arg4.field2790, 32636, class82.field1932.field2790), class50.field1292, class12.field366, class106.method864(18413, arg4.field2790), class42.field1063 });
        } else {
            var5 = class69.method546(true, new class5[] { arg4.field2801, class50.field1292, class116.field2878, class106.method864(18413, arg4.field2812), class42.field1063 });
        }
        if (arg3 <= 48) {
            method244(-109);
        }
        if (class112.field2814 == 1) {
            class72.method580(class69.method546(true, new class5[] { class53.field1337, class95.field2253, var5 }), 17, class9.field318, -119, arg0, arg1, arg2);
            class109.field2729++;
        } else if (class118.field2920 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class129.field3136[var6] != null) {
                    class106.field2677++;
                    short var7 = 0;
                    int var8 = 0;
                    if (class129.field3136[var6].method75(false, class8.field292)) {
                        if (class82.field1932.field2790 < arg4.field2790) {
                            var7 = 2000;
                        }
                        if (class82.field1932.field2813 != 0 && arg4.field2813 != 0) {
                            if (class82.field1932.field2813 == arg4.field2813) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class43.field1105[var6]) {
                        var7 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var7 + 58;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 52;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 10;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 18;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 48;
                    }
                    class72.method580(class69.method546(true, new class5[] { class50.field1291, var5 }), var8, class129.field3136[var6], -123, arg0, arg1, arg2);
                }
            }
        } else if ((class73.field1752 & 0x8) == 8) {
            class72.method580(class69.method546(true, new class5[] { class38.field940, class95.field2253, var5 }), 24, class105.field2631, -123, arg0, arg1, arg2);
            class59.field1443++;
        }
        for (int var9 = 0; var9 < class4.field145; var9++) {
            if (class22.field562[var9] == 47) {
                class121.field3008[var9] = class69.method546(true, new class5[] { class50.field1286, class4.field144, class50.field1291, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB[BI)V", line = 543)
    public final void method252(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field745++;
        try {
            if (arg1 >= -13) {
                return;
            }
            if (arg2.length < arg0 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (this.field728 != -1L && this.field732 >= this.field728 && (long) arg0 + this.field732 <= (long) this.field748 + this.field728) {
                class29.method239(this.field746, (int) (this.field732 - this.field728), arg2, arg3, arg0);
                this.field732 += arg0;
                return;
            }
            long var5 = this.field732;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field732 >= this.field721 && (long) this.field753 + this.field721 > this.field732) {
                int var9 = (int) (this.field721 + (long) this.field753 - this.field732);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class29.method239(this.field736, (int) (this.field732 - this.field721), arg2, arg3, var9);
                arg3 += var9;
                arg0 -= var9;
                this.field732 += var9;
            }
            if (arg0 > this.field736.length) {
                this.field747.method647(1, this.field732);
                this.field720 = this.field732;
                while (arg0 > 0) {
                    int var10 = this.field747.method645(arg3, arg2, 24137, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field732 += var10;
                    arg0 -= var10;
                    arg3 += var10;
                    this.field720 += var10;
                }
            } else if (arg0 > 0) {
                this.method245(false);
                int var11 = arg0;
                if (this.field753 < arg0) {
                    var11 = this.field753;
                }
                class29.method239(this.field736, 0, arg2, arg3, var11);
                arg0 -= var11;
                arg3 += var11;
                this.field732 += var11;
            }
            if (this.field728 != -1L) {
                if (this.field732 < this.field728 && arg0 > 0) {
                    int var12 = arg3 + (int) (this.field728 - this.field732);
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2[arg3++] = 0;
                        arg0--;
                        this.field732++;
                    }
                }
                long var13 = -1L;
                if (this.field728 >= var5 && this.field728 < (long) var8 + var5) {
                    var13 = this.field728;
                } else if (this.field728 <= var5 && var5 < (long) this.field748 + this.field728) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < this.field728 + (long) this.field748 && (long) var8 + var5 >= (long) this.field748 + this.field728) {
                    var15 = (long) this.field748 + this.field728;
                } else if (var5 + (long) var8 > this.field728 && var5 + (long) var8 <= (long) this.field748 + this.field728) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class29.method239(this.field746, (int) (var13 - this.field728), arg2, var7 + (int) (var13 - var5), var17);
                    if (var15 > this.field732) {
                        arg0 = (int) ((long) arg0 + this.field732 - var15);
                        this.field732 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field720 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }
}
