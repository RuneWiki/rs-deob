import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class41 extends class19 {

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "I")
    public int field1005 = 0;

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "Z")
    public boolean field1004 = true;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
    public int field1003 = -1;

    @OriginalMember(owner = "client!g", name = "tb", descriptor = "I")
    public int field1009 = -1;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "Lkc;")
    public static class67 field988 = class19.method144("Fertigkeit)2", 124);

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "Lkc;")
    public static class67 field996 = class19.method144("Bitte laden Sie die Seite neu)3", 85);

    @OriginalMember(owner = "client!g", name = "db", descriptor = "Lkc;")
    private static class67 field993 = class19.method144("System update in: ", 107);

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "Lkc;")
    public static class67 field999 = class19.method144("Einloggen", 112);

    @OriginalMember(owner = "client!g", name = "sb", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public static int field992 = -1;

    @OriginalMember(owner = "client!g", name = "ub", descriptor = "Lkc;")
    public static class67 field1010 = field993;

    @OriginalMember(owner = "client!g", name = "rb", descriptor = "[I")
    public static int[] field1007 = new int[4000];

    @OriginalMember(owner = "client!g", name = "vb", descriptor = "Lkc;")
    public static class67 field1011 = class19.method144("gelb:", 116);

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!g", name = "qb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "Lac;")
    public static class4 field995;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lwd;IB)V", line = 14)
    public final void method349(class140 arg0, int arg1, byte arg2) {
        if (arg2 != -28) {
            return;
        }
        field991++;
        while (true) {
            int var4 = arg0.method1105(255);
            if (var4 == 0) {
                return;
            }
            this.method352((byte) 118, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBI)V", line = 35)
    public static final void method350(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -118) {
            field995 = null;
        }
        if (class65.field1531 != 0 && arg0 != 0 && class138.field3303 < 50) {
            class133.field3167[class138.field3303] = arg3;
            class98.field2215[class138.field3303] = arg0;
            class91.field2116[class138.field3303] = arg1;
            class122.field2874[class138.field3303] = null;
            class74.field1773[class138.field3303] = 0;
            class138.field3303++;
        }
        field1000++;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V", line = 59)
    private final void method351(int arg0, int arg1) {
        field990++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 > var7) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        if (arg0 != -1778) {
            field999 = null;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 < var7) {
            var11 = var7;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var15 = (var7 - var5) / (-var9 + var11);
            } else if (var7 == var11) {
                var15 = (var5 - var3) / (-var9 + var11) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var15 / 6.0D;
        this.field1002 = (int) (var13 * 256.0D);
        if (this.field1002 < 0) {
            this.field1002 = 0;
        } else if (this.field1002 > 255) {
            this.field1002 = 255;
        }
        this.field987 = (int) (var17 * 256.0D);
        if (this.field987 < 0) {
            this.field987 = 0;
        } else if (this.field987 > 255) {
            this.field987 = 255;
        }
        this.field994 = (int) (var19 * 256.0D);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BIILwd;)V", line = 142)
    private final void method352(byte arg0, int arg1, int arg2, class140 arg3) {
        if (arg1 == 1) {
            this.field1005 = arg3.method1114(false);
        } else if (arg1 == 2) {
            this.field1009 = arg3.method1105(255);
        } else if (arg1 == 5) {
            this.field1004 = false;
        } else if (arg1 == 7) {
            this.field1003 = arg3.method1114(false);
        }
        field1006++;
        if (arg0 <= 12) {
            field999 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V", line = 201)
    public static void method353(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1007 = null;
        field1011 = null;
        field996 = null;
        field1010 = null;
        field993 = null;
        field988 = null;
        field999 = null;
        field995 = null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V", line = 219)
    public final void method354(byte arg0) {
        if (this.field1003 != -1) {
            this.method351(-1778, this.field1003);
            this.field986 = this.field987;
            this.field989 = this.field994;
            this.field985 = this.field1002;
        }
        this.method351(-1778, this.field1005);
        if (arg0 != -41) {
            this.method354((byte) -78);
        }
        field998++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)I", line = 245)
    public static final int method355(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 256 - arg3;
        if (arg0 <= 41) {
            method355(85, 116, -29, 123);
        }
        field1001++;
        return ((arg1 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg3 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III[Lkc;)Lkc;", line = 267)
    public static final class67 method356(int arg0, int arg1, int arg2, class67[] arg3) {
        int var4 = 0;
        field997++;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class114.field2665;
            }
            var4 += arg3[arg1 + var5].field1572;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = arg0; var8 < arg2; var8++) {
            class67 var10 = arg3[arg1 + var8];
            class43.method371(var10.field1597, 0, var6, var7, var10.field1572);
            var7 += var10.field1572;
        }
        class67 var9 = new class67();
        var9.field1597 = var6;
        var9.field1572 = var4;
        return var9;
    }
}
