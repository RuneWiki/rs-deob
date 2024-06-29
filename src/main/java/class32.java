import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 implements class127 {

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
    private boolean field651 = true;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lec;")
    public static class32 field632 = class73.method594("logo", true);

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "[[[I")
    public static int[][][] field641 = new int[4][13][13];

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "Lec;")
    private static class32 field655 = class73.method594("Welcome to RuneScape", true);

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "Lec;")
    private static class32 field657 = class73.method594("Free world", true);

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "I")
    public static int field677 = -1;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lec;")
    public static class32 field626 = field655;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lec;")
    public static class32 field628 = field657;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Ljava/awt/Font;")
    public static Font field656;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field680;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[B")
    public byte[] field618;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIII[B)I")
    public final int method235(byte arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field639++;
        class60.method458(this.field618, arg2, arg4, arg1, arg3 - arg2);
        if (arg0 != -126) {
            field655 = null;
        }
        return arg3 - arg2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
    private final boolean method236(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 > -117) {
            this.method248(-61);
        }
        field662++;
        for (int var6 = 0; var6 < this.field674; var6++) {
            int var7 = this.field618[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var5 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg1) {
                return false;
            }
            if (var5) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if (var8 / arg1 != var4) {
                return false;
            }
            var4 = var8;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Z")
    public static final boolean method237(byte arg0, int arg1) {
        field634++;
        if (arg1 < 0) {
            return false;
        }
        if (arg0 != 93) {
            method276(true, 86);
        }
        int var2 = class44.field1035[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1005;
    }

    @OriginalMember(owner = "client!ec", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field621++;
        if (!(arg0 instanceof class32)) {
            throw new IllegalArgumentException();
        }
        return this.method272(true, (class32) arg0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILec;)I")
    public final int method238(int arg0, class32 arg1) {
        field648++;
        int var3;
        if (arg1.field674 < this.field674) {
            var3 = arg1.field674;
        } else {
            var3 = this.field674;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field618[var4] & 0xFF) > (this.field618[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field618[var4] & 0xFF) > (arg1.field618[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field674 < arg1.field674) {
            return -1;
        } else if (arg0 != -39) {
            return 45;
        } else if (arg1.field674 < this.field674) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method239(int arg0) {
        field657 = null;
        field655 = null;
        field632 = null;
        field628 = null;
        field656 = null;
        field626 = null;
        int var1 = -89 % ((arg0 + 61) / 54);
        field641 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
    public final int method240(byte arg0) {
        field679++;
        if (arg0 <= 8) {
            this.method246(-8);
        }
        return this.field674;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)Lec;")
    public final class32 method241(byte arg0, int arg1, int arg2) {
        int var4 = -32 % ((-arg0 - 62) / 49);
        field624++;
        class32 var5 = new class32();
        var5.field674 = arg2 - arg1;
        var5.field618 = new byte[arg2 - arg1];
        class60.method458(this.field618, arg1, var5.field618, 0, var5.field674);
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static final void method242(byte arg0) {
        field660++;
        int var1 = -67 / ((-arg0 - 62) / 38);
        for (int var2 = 0; var2 < class61.field1353; var2++) {
            int var3 = class62.field1419[var2];
            class111 var4 = class14.field230[var3];
            int var5 = class158.field3614.method533(255);
            if ((var5 & 0x1) != 0) {
                var4.field2597 = class17.method130(-99, class158.field3614.method525((byte) 116));
                var4.field2731 = var4.field2597.field2213;
                var4.field2713 = var4.field2597.field2198;
                var4.field2718 = var4.field2597.field2187;
                var4.field2725 = var4.field2597.field2221;
                var4.field2689 = var4.field2597.field2197;
                var4.field2711 = var4.field2597.field2204;
                var4.field2695 = var4.field2597.field2220;
                var4.field2736 = var4.field2597.field2203;
                var4.field2746 = var4.field2597.field2211;
            }
            if ((var5 & 0x8) != 0) {
                var4.field2733 = class158.field3614.method520((byte) 126);
                int var6 = class158.field3614.method510(34);
                var4.field2706 = (var6 & 0xFFFF) + class140.field3219;
                if (var4.field2733 == 65535) {
                    var4.field2733 = -1;
                }
                var4.field2729 = var6 >> 16;
                var4.field2703 = 0;
                var4.field2756 = 0;
                if (var4.field2706 > class140.field3219) {
                    var4.field2756 = -1;
                }
            }
            if ((var5 & 0x4) != 0) {
                int var7 = class158.field3614.method530((byte) 95);
                int var8 = class158.field3614.method530((byte) 95);
                var4.method908(-24726, class140.field3219, var8, var7);
                var4.field2693 = class140.field3219 + 300;
                var4.field2757 = class158.field3614.method521(67);
                var4.field2740 = class158.field3614.method536(13285);
            }
            if ((var5 & 0x40) != 0) {
                var4.field2723 = class158.field3614.method556(1347418632);
                var4.field2708 = 100;
            }
            if ((var5 & 0x20) != 0) {
                var4.field2758 = class158.field3614.method525((byte) 116);
                if (var4.field2758 == 65535) {
                    var4.field2758 = -1;
                }
            }
            if ((var5 & 0x80) != 0) {
                int var9 = class158.field3614.method533(255);
                int var10 = class158.field3614.method521(64);
                var4.method908(-24726, class140.field3219, var10, var9);
                var4.field2693 = class140.field3219 + 300;
                var4.field2757 = class158.field3614.method521(100);
                var4.field2740 = class158.field3614.method533(255);
            }
            if ((var5 & 0x10) != 0) {
                int var11 = class158.field3614.method520((byte) 113);
                int var12 = class158.field3614.method521(81);
                if (var11 == 65535) {
                    var11 = -1;
                }
                if (var4.field2714 == var11 && var11 != -1) {
                    int var13 = class97.method762((byte) 108, var11).field3397;
                    if (var13 == 1) {
                        var4.field2739 = 0;
                        var4.field2716 = 0;
                        var4.field2717 = var12;
                        var4.field2727 = 0;
                    }
                    if (var13 == 2) {
                        var4.field2716 = 0;
                    }
                } else if (var11 == -1 || var4.field2714 == -1 || class97.method762((byte) 90, var11).field3386 >= class97.method762((byte) 90, var4.field2714).field3386) {
                    var4.field2750 = var4.field2698;
                    var4.field2716 = 0;
                    var4.field2714 = var11;
                    var4.field2727 = 0;
                    var4.field2717 = var12;
                    var4.field2739 = 0;
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field2743 = class158.field3614.method525((byte) 116);
                var4.field2699 = class158.field3614.method520((byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lec;B)Lec;")
    public final class32 method243(class32 arg0, byte arg1) {
        field623++;
        if (!this.field651) {
            throw new IllegalArgumentException();
        }
        this.field619 = 0;
        if (this.field674 + arg0.field674 > this.field618.length) {
            int var3;
            for (var3 = 1; var3 < this.field674 + arg0.field674; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class60.method458(this.field618, 0, var4, 0, this.field674);
            this.field618 = var4;
        }
        class60.method458(arg0.field618, 0, this.field618, this.field674, arg0.field674);
        int var5 = 38 / ((arg1 - 54) / 36);
        this.field674 += arg0.field674;
        return this;
    }

    @OriginalMember(owner = "client!ec", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field658++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)Lec;")
    public final class32 method244(byte arg0) {
        if (arg0 < 114) {
            return null;
        }
        field672++;
        class32 var2 = new class32();
        var2.field618 = new byte[12];
        int var3 = 0;
        var2.field674 = 0;
        for (int var4 = 0; var4 < this.field674; var4++) {
            if (this.field618[var4] >= 65 && this.field618[var4] <= 90) {
                var2.field618[var3++] = (byte) (this.field618[var4] + 97 - 65);
                var2.field674 = var3;
            } else if (this.field618[var4] >= 97 && this.field618[var4] <= 122 || this.field618[var4] >= 48 && this.field618[var4] <= 57) {
                var2.field618[var3++] = this.field618[var4];
                var2.field674 = var3;
            } else if (var3 > 0) {
                var2.field618[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(ILec;)I")
    public final int method245(int arg0, class32 arg1) {
        int var3;
        if (this.field674 > arg1.field674) {
            var3 = arg1.field674;
        } else {
            var3 = this.field674;
        }
        field669++;
        if (arg0 != 1) {
            this.method264((byte) 61);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class77.field1808[this.field618[var4] & 0xFF] < class77.field1808[arg1.field618[var4] & 0xFF]) {
                return -1;
            }
            if (class77.field1808[this.field618[var4] & 0xFF] > class77.field1808[arg1.field618[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field674 < arg1.field674) {
            return -1;
        } else if (arg1.field674 < this.field674) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)J")
    private final long method246(int arg0) {
        field671++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 <= 80) {
            this.method247(3);
        }
        while (this.field674 > var4) {
            var2 = (var2 << 5) + (long) (this.field618[var4] & 0xFF) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I")
    public final int method247(int arg0) {
        field661++;
        int var2 = 0;
        if (arg0 != -44) {
            this.method247(30);
        }
        for (int var3 = 0; var3 < this.field674; var3++) {
            var2 = (var2 << 5) + (this.field618[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Lec;")
    public final class32 method248(int arg0) {
        field631++;
        class32 var2 = new class32();
        var2.field674 = this.field674;
        if (arg0 != -7726) {
            this.method269(-85);
        }
        var2.field618 = new byte[this.field674];
        for (int var3 = 0; var3 < this.field674; var3++) {
            var2.field618[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lec;II)I")
    private final int method249(class32 arg0, int arg1, int arg2) {
        int[] var4 = new int[arg0.field674];
        field629++;
        int[] var5 = new int[256];
        int[] var6 = new int[arg0.field674];
        int var7 = 36 / ((arg2 - 29) / 56);
        for (int var8 = 0; var8 < var5.length; var8++) {
            var5[var8] = arg0.field674;
        }
        for (int var9 = 1; var9 <= arg0.field674; var9++) {
            var4[var9 - 1] = (arg0.field674 << 1) - var9;
            var5[class41.method326(255, arg0.field618[var9 - 1])] = arg0.field674 - var9;
        }
        int var10 = arg0.field674 + 1;
        for (int var11 = arg0.field674; var11 > 0; var11--) {
            var6[var11 - 1] = var10;
            while (arg0.field674 >= var10 && arg0.field618[var10 - 1] != arg0.field618[var11 - 1]) {
                if (var4[var10 - 1] >= arg0.field674 - var11) {
                    var4[var10 - 1] = arg0.field674 - var11;
                }
                var10 = var6[var10 - 1];
            }
            var10--;
        }
        int var12 = var10;
        int var13 = 0;
        int var14 = 1;
        int var15 = arg0.field674 + 1 - var10;
        int var16 = 1;
        while (var15 >= var16) {
            var6[var16 - 1] = var13;
            while (var13 >= 1 && arg0.field618[var13 - 1] != arg0.field618[var16 - 1]) {
                var13 = var6[var13 - 1];
            }
            var16++;
            var13++;
        }
        while (arg0.field674 > var12) {
            for (int var19 = var14; var19 <= var12; var19++) {
                if (arg0.field674 + var12 - var19 <= var4[var19 - 1]) {
                    var4[var19 - 1] = arg0.field674 + var12 - var19;
                }
            }
            var14 = var12 + 1;
            var12 = var12 + var15 - var6[var15 + -1];
            var15 = var6[var15 - 1];
        }
        int var18;
        for (int var17 = arg1 + arg0.field674 - 1; var17 < this.field674; var17 += Math.max(var5[this.field618[var17] & 0xFF], var4[var18])) {
            for (var18 = arg0.field674 - 1; var18 >= 0 && this.field618[var17] == arg0.field618[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I")
    private final int method250(int arg0, int arg1, int arg2) {
        field659++;
        byte var4 = (byte) arg1;
        if (arg2 != -34) {
            return -110;
        }
        for (int var5 = arg0; var5 < this.field674; var5++) {
            if (this.field618[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILo;III)V")
    public static final void method251(int arg0, class97 arg1, int arg2, int arg3, int arg4) {
        field647++;
        if (class119.field2851 >= 400) {
            return;
        }
        if (arg1.field2216 != null) {
            arg1 = arg1.method759(122);
        }
        if (arg1 == null || !arg1.field2190) {
            return;
        }
        class32 var5 = arg1.field2206;
        if (arg1.field2200 != 0) {
            var5 = class52.method403(new class32[] { var5, class27.method187(arg1.field2200, arg2 - 3957, class20.field373.field1636), class41.field955, class62.field1438, class159.method1230(arg1.field2200, 0), class23.field403 }, (byte) -20);
        }
        if (arg2 != 801) {
            method257((byte) 124, 32, -41, 68, 2, -107);
        }
        if (class125.field2915 == 1) {
            class17.field341++;
            class56.method443(arg3, class41.field966, 3231, arg4, 58, class52.method403(new class32[] { class50.field1149, class75.field1756, var5 }, (byte) -20), arg0);
        } else if (!class151.field3470) {
            class3.field33++;
            class32[] var6 = arg1.field2191;
            if (class94.field2166) {
                var6 = class125.method986(var6, 3);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method271((byte) 110, class72.field1705)) {
                        class33.field691++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 14;
                        }
                        if (var7 == 1) {
                            var8 = 28;
                        }
                        if (var7 == 2) {
                            var8 = 10;
                        }
                        if (var7 == 3) {
                            var8 = 9;
                        }
                        if (var7 == 4) {
                            var8 = 24;
                        }
                        class56.method443(arg3, var6[var7], 3231, arg4, var8, class52.method403(new class32[] { class137.field3184, var5 }, (byte) -20), arg0);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method271((byte) 105, class72.field1705)) {
                        class66.field1539++;
                        short var10 = 0;
                        if (arg1.field2200 > class20.field373.field1636) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 14;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 28;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 10;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 9;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 24;
                        }
                        class56.method443(arg3, var6[var9], 3231, arg4, var11, class52.method403(new class32[] { class137.field3184, var5 }, (byte) -20), arg0);
                    }
                }
            }
            class56.method443(arg3, class135.field3142, arg2 ^ 0xFBE, arg4, 1006, class52.method403(new class32[] { class137.field3184, var5 }, (byte) -20), arg0);
        } else if ((class88.field2047 & 0x2) == 2) {
            class56.method443(arg3, class147.field3355, arg2 + 2430, arg4, 12, class52.method403(new class32[] { class14.field234, class75.field1756, var5 }, (byte) -20), arg0);
            class88.field2050++;
            return;
        }
    }

    @OriginalMember(owner = "client!ec", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field654++;
        return this.method247(-44);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method252(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field618, arg0, this.field674, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field618, 0, this.field674);
        }
        field678++;
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method253(int arg0, int arg1, int arg2, Graphics arg3) {
        field664++;
        String var5;
        try {
            var5 = new String(this.field618, arg2, this.field674, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field618, 0, this.field674);
        }
        arg3.drawString(var5, arg0, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)Lec;")
    public final class32 method254(byte arg0) {
        field676++;
        if (arg0 != 10) {
            return null;
        }
        long var2 = this.method246(arg0 ^ 0x68);
        synchronized (field680 == null ? (field680 = method279("ec")) : field680) {
            if (class157.field3599 == null) {
                class157.field3599 = new class156(4096);
            } else {
                for (class39 var5 = (class39) class157.field3599.method1198(var2, (byte) -106); var5 != null; var5 = (class39) class157.field3599.method1204((byte) -36)) {
                    if (this.method272(true, var5.field930)) {
                        return var5.field930;
                    }
                }
            }
            class39 var7 = new class39();
            this.field651 = false;
            var7.field930 = this;
            class157.field3599.method1203(true, var2, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)[B")
    public final byte[] method255(int arg0) {
        field633++;
        if (arg0 == 122) {
            byte[] var2 = new byte[this.field674];
            class60.method458(this.field618, 0, var2, 0, this.field674);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)I")
    public final int method256(boolean arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = arg0;
        field649++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field674; var6++) {
            int var7 = this.field618[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if (var8 / arg1 != var4) {
                throw new NumberFormatException();
            }
            var4 = var8;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIIII)V")
    public static final void method257(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class98.field2254[0].method400(arg3, arg2);
        class98.field2254[1].method400(arg3, arg2 + arg5 - 16);
        if (arg0 != 53) {
            method276(false, 62);
        }
        field627++;
        class141.method1055(arg3, arg2 + 16, 16, arg5 - 32, class112.field2617);
        int var6 = (arg5 - 32) * arg5 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg1 / (arg4 - arg5);
        class141.method1055(arg3, var7 + arg2 + 16, 16, var6, class73.field1728);
        class141.method1062(arg3, arg2 + var7 + 16, var6, class143.field3277);
        class141.method1062(arg3 + 1, var7 + 16 + arg2, var6, class143.field3277);
        class141.method1065(arg3, arg2 + var7 + 16, 16, class143.field3277);
        class141.method1065(arg3, arg2 + var7 + 17, 16, class143.field3277);
        class141.method1062(arg3 + 15, arg2 + 16 + var7, var6, class109.field2568);
        class141.method1062(arg3 + 14, arg2 - -var7 + 17, var6 - 1, class109.field2568);
        class141.method1065(arg3, arg2 + var7 + var6 + 15, 16, class109.field2568);
        class141.method1065(arg3 + 1, var6 + 14 + arg2 - -var7, 15, class109.field2568);
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)Lec;")
    public final class32 method258(int arg0) {
        class32 var2 = new class32();
        if (arg0 != 97) {
            return null;
        }
        byte var3 = 2;
        field645++;
        var2.field674 = this.field674;
        var2.field618 = new byte[this.field674];
        for (int var4 = 0; var4 < this.field674; var4++) {
            byte var5 = this.field618[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field618[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)J")
    public final long method259(int arg0) {
        field644++;
        long var2 = 0L;
        for (int var4 = arg0; this.field674 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field618[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I")
    public final int method260(int arg0, int arg1) {
        field637++;
        int var3 = -84 / ((arg0 + 79) / 37);
        return this.field618[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)I")
    public final int method261(int arg0) {
        int var2 = -7 % ((arg0 + 49) / 48);
        field675++;
        return this.method256(false, 10);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lec;Z)Z")
    public final boolean method262(class32 arg0, boolean arg1) {
        field642++;
        if (this.field674 < arg0.field674) {
            return false;
        } else if (arg1) {
            for (int var3 = 0; var3 < arg0.field674; var3++) {
                if (this.field618[var3] != arg0.field618[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)I")
    public final int method263(int arg0, byte arg1) {
        field625++;
        if (arg1 >= -90) {
            this.field651 = false;
        }
        return this.method250(0, arg0, -34);
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)Lec;")
    public final class32 method264(byte arg0) {
        class32 var2 = new class32();
        field620++;
        var2.field674 = this.field674;
        boolean var3 = true;
        var2.field618 = new byte[this.field674];
        for (int var4 = 0; var4 < this.field674; var4++) {
            byte var5 = this.field618[var4];
            if (var5 == 95) {
                var2.field618[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field618[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field618[var4] = var5;
                var3 = false;
            }
        }
        if (arg0 == 52) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB)V")
    public static final void method265(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -121) {
            field677 = 127;
        }
        for (int var5 = 0; var5 < class133.field3083; var5++) {
            if (arg2 < class144.field3289[var5] + class28.field512[var5] && class144.field3289[var5] < arg0 + arg2 && class20.field366[var5] + class124.field2894[var5] > arg1 && class124.field2894[var5] < arg1 + arg3) {
                class81.field1864[var5] = true;
            }
        }
        field668++;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(ILec;)Z")
    public final boolean method266(int arg0, class32 arg1) {
        field638++;
        if (this.field674 < arg1.field674) {
            return false;
        }
        int var3 = this.field674 - arg1.field674;
        for (int var4 = arg0; var4 < arg1.field674; var4++) {
            if (this.field618[var3 + var4] != arg1.field618[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(ILec;)I")
    public final int method267(int arg0, class32 arg1) {
        field640++;
        return arg0 == 1 ? this.method249(arg1, 0, 121) : -50;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(BI)Lec;")
    public final class32 method268(byte arg0, int arg1) {
        field663++;
        if (arg0 >= -1) {
            this.method266(9, null);
        }
        return this.method241((byte) -125, arg1, this.field674);
    }

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)Lec;")
    public final class32 method269(int arg0) {
        field673++;
        if (!this.field651) {
            throw new IllegalArgumentException();
        }
        this.field619 = 0;
        if (this.field618.length != this.field674) {
            byte[] var2 = new byte[this.field674];
            class60.method458(this.field618, 0, var2, 0, this.field674);
            this.field618 = var2;
        }
        if (arg0 != -8087) {
            field628 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Lec;")
    public final class32 method270(boolean arg0) {
        if (arg0) {
            this.field618 = null;
        }
        field667++;
        class32 var2 = new class32();
        var2.field674 = this.field674;
        var2.field618 = new byte[this.field674];
        for (int var3 = 0; var3 < this.field674; var3++) {
            byte var4 = this.field618[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field618[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLec;)Z")
    public final boolean method271(byte arg0, class32 arg1) {
        field630++;
        if (arg1 == null) {
            return false;
        } else if (this.field674 == arg1.field674) {
            for (int var3 = 0; var3 < this.field674; var3++) {
                byte var4 = arg1.field618[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field618[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 <= 98) {
                this.method267(48, null);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLec;)Z")
    public final boolean method272(boolean arg0, class32 arg1) {
        field653++;
        if (arg1 == null) {
            return false;
        } else if (this.field674 == arg1.field674) {
            if (!this.field651 || !arg1.field651) {
                if (this.field619 == 0) {
                    this.field619 = this.method247(-44);
                    if (this.field619 == 0) {
                        this.field619 = 1;
                    }
                }
                if (arg1.field619 == 0) {
                    arg1.field619 = arg1.method247(-44);
                    if (arg1.field619 == 0) {
                        arg1.field619 = 1;
                    }
                }
                if (this.field619 != arg1.field619) {
                    return false;
                }
            }
            if (!arg0) {
                this.method275(85);
            }
            for (int var3 = 0; var3 < this.field674; var3++) {
                if (this.field618[var3] != arg1.field618[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)Lec;")
    public final class32 method273(int arg0, int arg1) {
        if (arg1 != -5) {
            return null;
        }
        field646++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field651) {
            this.field619 = 0;
            if (this.field618.length == this.field674) {
                int var3;
                for (var3 = 1; var3 <= this.field674; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class60.method458(this.field618, 0, var4, 0, this.field674);
                this.field618 = var4;
            }
            this.field618[this.field674++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)Z")
    public final boolean method274(byte arg0) {
        field650++;
        if (arg0 != -36) {
            method276(false, 59);
        }
        return this.method236(-119, 10);
    }

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "(I)Lec;")
    public final class32 method275(int arg0) {
        int var2 = 0;
        if (arg0 != -91) {
            this.method245(97, null);
        }
        field670++;
        while (this.field674 > var2 && (this.field618[var2] >= 0 && this.field618[var2] <= 32 || (this.field618[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field674; var2 < var3 && (this.field618[var3 - 1] >= 0 && this.field618[var3 - 1] <= 32 || (this.field618[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field674 == var3) {
            return this;
        }
        class32 var4 = new class32();
        var4.field674 = var3 - var2;
        var4.field618 = new byte[var4.field674];
        for (int var5 = 0; var5 < var4.field674; var5++) {
            var4.field618[var5] = this.field618[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(ZI)Lud;")
    public static final class143 method276(boolean arg0, int arg1) {
        class143 var2 = (class143) class50.field1147.method486(-28825, (long) arg1);
        field665++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class98.field2248.method206(arg1, 0, -118);
        if (var3 == null) {
            return null;
        }
        class143 var4 = new class143();
        class66 var5 = new class66(var3);
        int var6 = 0;
        var5.field1569 = var5.field1587.length - 12;
        int var7 = var5.method539(arg0);
        var4.field3261 = var5.method532(0);
        var4.field3266 = var5.method532(0);
        var4.field3269 = var5.method532(0);
        var4.field3265 = var5.method532(0);
        var5.field1569 = 0;
        var4.field3263 = var5.method508((byte) 32);
        var4.field3267 = new int[var7];
        var4.field3270 = new class32[var7];
        var4.field3272 = new int[var7];
        while (var5.field1587.length - 12 > var5.field1569) {
            int var8 = var5.method532(0);
            if (var8 == 3) {
                var4.field3270[var6] = var5.method556(1347418632);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3272[var6] = var5.method533(255);
            } else {
                var4.field3272[var6] = var5.method539(arg0);
            }
            var4.field3267[var6++] = var8;
        }
        class50.field1147.method485((long) arg1, (byte) -119, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(II)Lec;")
    public final class32 method277(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method261(15);
        }
        field636++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class32 var3 = new class32();
        var3.field618 = new byte[this.field674 + 1];
        var3.field674 = this.field674 + 1;
        class60.method458(this.field618, 0, var3.field618, 0, this.field674);
        var3.field618[this.field674] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "(I)Ljava/net/URL;")
    public final URL method278(int arg0) throws MalformedURLException {
        field666++;
        if (arg0 > -76) {
            field641 = null;
        }
        return new URL(new String(this.field618, 0, this.field674));
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method279(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
