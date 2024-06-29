import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class148 {

    @OriginalMember(owner = "client!we", name = "f", descriptor = "J")
    private long field3609 = -1L;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    private int field3629 = 0;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "J")
    private long field3642 = -1L;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lbb;")
    private class10 field3612;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "J")
    private long field3641;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "J")
    private long field3627;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "J")
    private long field3616;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[B")
    private byte[] field3619;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "[B")
    private byte[] field3631;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
    public static int[] field3610 = new int[500];

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lrd;")
    public static class117 field3621 = class95.method812("Spiel)2Fenster geladen)3", (byte) 8);

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Lrd;")
    private static class117 field3628 = class95.method812("Loading textures )2 ", (byte) 8);

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Lrd;")
    private static class117 field3626 = class95.method812("Please reload this page)3", (byte) 8);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lrd;")
    public static class117 field3617 = field3626;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lrd;")
    public static class117 field3622 = class95.method812("titlebutton", (byte) 8);

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field3633 = 0;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "Lrd;")
    private static class117 field3643 = class95.method812("Ok", (byte) 8);

    @OriginalMember(owner = "client!we", name = "I", descriptor = "Lrd;")
    public static class117 field3638 = class95.method812("Bitte versuchen Sie)1", (byte) 8);

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field3644 = -1;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "Lrd;")
    public static class117 field3640 = field3628;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "Lrd;")
    public static class117 field3645 = class95.method812("Lade Konfiguration )2 ", (byte) 8);

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lrd;")
    public static class117 field3611 = field3643;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "Lrd;")
    private static class117 field3635 = class95.method812("Moderator option: Mute player for 48 hours: <ON>", (byte) 8);

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lrd;")
    public static class117 field3605 = field3635;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    private int field3607;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "J")
    private long field3634;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "Lga;")
    public static class44 field3632;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lge;")
    public static class47 field3618;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Z")
    public static boolean field3623;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    private final void method1192(byte arg0) throws IOException {
        field3636++;
        this.field3607 = 0;
        if (this.field3634 != this.field3616) {
            this.field3612.method72(this.field3616, 13811);
            this.field3634 = this.field3616;
        }
        this.field3609 = this.field3616;
        if (arg0 != -42) {
            method1200(111, -38);
        }
        while (this.field3607 < this.field3619.length) {
            int var2 = this.field3612.method74(this.field3619, this.field3619.length - this.field3607, this.field3607, -1666);
            if (var2 == -1) {
                break;
            }
            this.field3634 += var2;
            this.field3607 += var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lrd;ILbf;)I")
    public static final int method1193(class117 arg0, int arg1, class14 arg2) {
        if (arg1 != 0) {
            field3633 = 72;
        }
        field3613++;
        int var3 = arg2.field314;
        arg2.method145(115, arg0.field2858);
        arg2.field314 += class61.field1706.method104(arg2.field326, arg0.field2858, -33, arg0.field2851, arg2.field314, 0);
        return arg2.field314 - var3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static final void method1194(byte arg0) {
        if (arg0 < 27) {
            return;
        }
        field3615++;
        if (!class46.field1292) {
            return;
        }
        class144 var1 = class84.method761(class46.field1306, 0, class105.field2630);
        if (var1 != null && var1.field3418 != null) {
            class118.method980((byte) 89, var1.field3418, var1, 0, 0, null, 0);
        }
        class46.field1292 = false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III[B)V")
    public final void method1195(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3625++;
        try {
            if (arg0 + arg1 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg3.length);
            }
            if (this.field3642 != -1L && this.field3616 >= this.field3642 && (long) arg0 + this.field3616 <= (long) this.field3629 + this.field3642) {
                class91.method797(this.field3631, (int) (this.field3616 - this.field3642), arg3, arg1, arg0);
                this.field3616 += arg0;
                return;
            }
            long var5 = this.field3616;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field3609 <= this.field3616 && (long) this.field3607 + this.field3609 > this.field3616) {
                int var9 = (int) ((long) this.field3607 + this.field3609 - this.field3616);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class91.method797(this.field3619, (int) (this.field3616 - this.field3609), arg3, arg1, var9);
                this.field3616 += var9;
                arg1 += var9;
            }
            if (arg0 > this.field3619.length) {
                this.field3612.method72(this.field3616, 13811);
                this.field3634 = this.field3616;
                while (arg0 > 0) {
                    int var10 = this.field3612.method74(arg3, arg0, arg1, arg2 - 1665);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3616 += var10;
                    this.field3634 += var10;
                    arg0 -= var10;
                    arg1 += var10;
                }
            } else if (arg0 > 0) {
                this.method1192((byte) -42);
                int var11 = arg0;
                if (this.field3607 < arg0) {
                    var11 = this.field3607;
                }
                class91.method797(this.field3619, 0, arg3, arg1, var11);
                arg0 -= var11;
                this.field3616 += var11;
                arg1 += var11;
            }
            if (this.field3642 != -1L) {
                if (this.field3642 > this.field3616 && arg0 > 0) {
                    int var12 = (int) (this.field3642 - this.field3616) + arg1;
                    if (arg0 + arg1 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (arg1 < var12) {
                        arg3[arg1++] = 0;
                        this.field3616++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (this.field3642 >= var5 && this.field3642 < (long) var7 + var5) {
                    var13 = this.field3642;
                } else if (var5 >= this.field3642 && var5 < (long) this.field3629 + this.field3642) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field3629 + this.field3642 && (long) this.field3629 + this.field3642 <= var5 - -((long) var7)) {
                    var15 = (long) this.field3629 + this.field3642;
                } else if (this.field3642 < (long) var7 + var5 && (long) var7 + var5 <= this.field3642 - -((long) this.field3629)) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class91.method797(this.field3631, (int) (var13 - this.field3642), arg3, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field3616) {
                        arg0 = (int) ((long) arg0 + this.field3616 - var15);
                        this.field3616 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3634 = -1L;
            throw var19;
        }
        if (~arg0 < arg2) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILge;I)Z")
    public static final boolean method1196(int arg0, class47 arg1, int arg2) {
        field3639++;
        if (arg2 != 0) {
            method1201((byte) 118);
        }
        byte[] var3 = arg1.method533(arg0, (byte) 25);
        if (var3 == null) {
            return false;
        } else {
            class64.method647((byte) 108, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)J")
    public final long method1197(boolean arg0) {
        field3614++;
        if (!arg0) {
            field3623 = true;
        }
        return this.field3627;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    private final void method1198(byte arg0) throws IOException {
        if (this.field3642 != -1L) {
            if (this.field3642 != this.field3634) {
                this.field3612.method72(this.field3642, 13811);
                this.field3634 = this.field3642;
            }
            this.field3612.method73(1, this.field3629, 0, this.field3631);
            long var2 = -1L;
            if (this.field3642 >= this.field3609 && this.field3642 < (long) this.field3607 + this.field3609) {
                var2 = this.field3642;
            } else if (this.field3609 >= this.field3642 && this.field3609 < this.field3642 + (long) this.field3629) {
                var2 = this.field3609;
            }
            this.field3634 += this.field3629;
            long var4 = -1L;
            if (this.field3641 < this.field3634) {
                this.field3641 = this.field3634;
            }
            if (this.field3609 < this.field3642 + (long) this.field3629 && (long) this.field3629 + this.field3642 <= (long) this.field3607 + this.field3609) {
                var4 = (long) this.field3629 + this.field3642;
            } else if ((long) this.field3607 + this.field3609 > this.field3642 && (long) this.field3607 + this.field3609 <= (long) this.field3629 + this.field3642) {
                var4 = (long) this.field3607 + this.field3609;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class91.method797(this.field3631, (int) (var2 - this.field3642), this.field3619, (int) (var2 - this.field3609), var6);
            }
            this.field3629 = 0;
            this.field3642 = -1L;
        }
        if (arg0 > -13) {
            field3635 = null;
        }
        field3620++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II[BI)V")
    public final void method1199(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3630++;
        try {
            if (this.field3627 < (long) arg0 + this.field3616) {
                this.field3627 = this.field3616 + (long) arg0;
            }
            if (this.field3642 != -1L && (this.field3616 < this.field3642 || (long) this.field3629 + this.field3642 < this.field3616)) {
                this.method1198((byte) -124);
            }
            if (this.field3642 != -1L && (long) arg0 + this.field3616 > (long) this.field3631.length + this.field3642) {
                int var5 = (int) (this.field3642 + (long) this.field3631.length - this.field3616);
                arg0 -= var5;
                class91.method797(arg2, arg3, this.field3631, (int) (this.field3616 - this.field3642), var5);
                this.field3616 += var5;
                arg3 += var5;
                this.field3629 = this.field3631.length;
                this.method1198((byte) -83);
            }
            if (this.field3631.length < arg0) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3634 != this.field3616) {
                    this.field3612.method72(this.field3616, 13811);
                    this.field3634 = this.field3616;
                }
                this.field3612.method73(1, arg0, arg3, arg2);
                this.field3634 += arg0;
                if (this.field3616 >= this.field3609 && (long) this.field3607 + this.field3609 > this.field3616) {
                    var6 = this.field3616;
                } else if (this.field3616 <= this.field3609 && (long) arg0 + this.field3616 > this.field3609) {
                    var6 = this.field3609;
                }
                if (this.field3609 < this.field3616 + (long) arg0 && (long) this.field3607 + this.field3609 >= (long) arg0 + this.field3616) {
                    var8 = this.field3616 + (long) arg0;
                } else if ((long) this.field3607 + this.field3609 > this.field3616 && (long) this.field3607 + this.field3609 <= (long) arg0 + this.field3616) {
                    var8 = (long) this.field3607 + this.field3609;
                }
                if (this.field3634 > this.field3641) {
                    this.field3641 = this.field3634;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class91.method797(arg2, (int) ((long) arg3 + var6 - this.field3616), this.field3619, (int) (var6 - this.field3609), var10);
                }
                this.field3616 += arg0;
            } else if (~arg0 < arg1) {
                if (this.field3642 == -1L) {
                    this.field3642 = this.field3616;
                }
                class91.method797(arg2, arg3, this.field3631, (int) (this.field3616 - this.field3642), arg0);
                this.field3616 += arg0;
                if (this.field3616 - this.field3642 > (long) this.field3629) {
                    this.field3629 = (int) (this.field3616 - this.field3642);
                }
            }
        } catch (IOException var12) {
            this.field3634 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lrd;")
    public static final class117 method1200(int arg0, int arg1) {
        field3637++;
        class117 var2 = class142.method1131(arg0, true);
        int var3 = var2.method954(-97) - 3;
        if (arg1 >= -116) {
            field3635 = null;
        }
        while (var3 > 0) {
            var2 = class18.method193(new class117[] { var2.method963(var3, 0, (byte) -127), class124.field2990, var2.method949(var3, 0) }, 27);
            var3 -= 3;
        }
        if (var2.method954(97) > 8) {
            var2 = class18.method193(new class117[] { class134.field3211, var2.method963(var2.method954(126) - 8, 0, (byte) -127), class127.field3024, class143.field3412, var2, class136.field3234 }, 85);
        } else if (var2.method954(88) > 4) {
            var2 = class18.method193(new class117[] { class97.field2427, var2.method963(var2.method954(111) - 4, 0, (byte) -127), class65.field1857, class143.field3412, var2, class136.field3234 }, 87);
        }
        return class18.method193(new class117[] { class45.field1261, var2 }, 21);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
    public static final void method1201(byte arg0) {
        class32.field951.method766(5);
        int var1 = -64 / ((arg0 - 20) / 51);
        field3646++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BILnc;I)V")
    public static final void method1202(byte[] arg0, int arg1, class92 arg2, int arg3) {
        field3606++;
        class27 var4 = new class27();
        var4.field2048 = arg1;
        var4.field804 = 0;
        var4.field791 = arg2;
        var4.field792 = arg0;
        if (arg3 != -21271) {
            method1202(null, -73, null, -78);
        }
        class1 var5 = class132.field3168;
        synchronized (class132.field3168) {
            class132.field3168.method10(var4, (byte) 96);
        }
        class16.method179(-97);
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V")
    public static void method1203(byte arg0) {
        field3632 = null;
        field3635 = null;
        field3643 = null;
        field3640 = null;
        field3645 = null;
        field3605 = null;
        field3638 = null;
        if (arg0 != 57) {
            method1196(39, null, 29);
        }
        field3611 = null;
        field3622 = null;
        field3618 = null;
        field3626 = null;
        field3628 = null;
        field3610 = null;
        field3621 = null;
        field3617 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V")
    public final void method1204(int arg0, long arg1) {
        if (arg0 > -74) {
            this.method1197(true);
        }
        field3624++;
        if (arg1 >= 0L) {
            this.field3616 = arg1;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public final void method1205(int arg0) throws IOException {
        field3608++;
        if (arg0 != 28248) {
            this.field3609 = 13L;
        }
        this.method1198((byte) -76);
        this.field3612.method75(-30200);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lbb;II)V")
    public class148(class10 arg0, int arg1, int arg2) throws IOException {
        this.field3612 = arg0;
        this.field3627 = this.field3641 = arg0.method71(-18378);
        this.field3616 = 0L;
        this.field3619 = new byte[arg1];
        this.field3631 = new byte[arg2];
    }
}
