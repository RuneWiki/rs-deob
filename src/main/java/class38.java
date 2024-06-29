import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class38 extends class8 {

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "[B")
    public byte[] field500;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "Ll;")
    private static class22 field499 = class33.method229("Hunter Training", -82);

    @OriginalMember(owner = "mapview!w", name = "v", descriptor = "I")
    public static int field502 = 20;

    @OriginalMember(owner = "mapview!w", name = "z", descriptor = "I")
    public static volatile int field506 = 0;

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "Ll;")
    private static class22 field497 = class33.method229("Altar", -128);

    @OriginalMember(owner = "mapview!w", name = "w", descriptor = "Ll;")
    private static class22 field503 = class33.method229("Bank", -54);

    @OriginalMember(owner = "mapview!w", name = "A", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "mapview!w", name = "C", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "mapview!w", name = "x", descriptor = "Ln;")
    public static class26 field504;

    @OriginalMember(owner = "mapview!w", name = "y", descriptor = "Ljava/lang/String;")
    public static String field505;

    @OriginalMember(owner = "mapview!w", name = "u", descriptor = "[I")
    public static int[] field501;

    @OriginalMember(owner = "mapview!w", name = "B", descriptor = "[I")
    public static int[] field508;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(B)B", line = 5)
    public static final byte method242(byte arg0) {
        if (arg0 > -38) {
            return 39;
        } else if (class25.field247 == null) {
            return 0;
        } else {
            return class25.field247[class35.field471];
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IB)V", line = 50)
    public final void method243(int arg0, byte arg1) {
        this.field500[this.field498++] = (byte) (arg0 >> 24);
        if (arg1 != 6) {
            field509 = 60;
        }
        this.field500[this.field498++] = (byte) (arg0 >> 16);
        this.field500[this.field498++] = (byte) (arg0 >> 8);
        this.field500[this.field498++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(I)I", line = 76)
    public final int method244(int arg0) {
        if (arg0 != 1918432520) {
            this.method245(-97, 40);
        }
        this.field498 += 4;
        return (this.field500[this.field498 - 1] & 0xFF) + (((this.field500[this.field498 - 3] & 0xFF) << 16) + ((this.field500[this.field498 - 4] & 0xFF) << 24) + ((this.field500[this.field498 + -2] & 0xFF) << 8));
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(II)V", line = 95)
    public final void method245(int arg0, int arg1) {
        this.field500[this.field498++] = (byte) arg0;
        if (arg1 != -13827) {
            this.field498 = -124;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(I)I", line = 107)
    public final int method246(int arg0) {
        if (arg0 != -1) {
            this.method252(-22, 104, null, -11);
        }
        return this.field500[this.field498++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(Z)Ll;", line = 131)
    public final class22 method247(boolean arg0) {
        int var2 = this.field498;
        if (arg0) {
            return (class22) null;
        } else {
            while (this.field500[this.field498++] != 0) {
            }
            return class30.method209(10, this.field500, var2, this.field498 - var2 - 1);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II[BI)V", line = 162)
    public final void method248(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            arg2[var5] = this.field500[this.field498++];
        }
        if (arg0 < 20) {
            field509 = -60;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(B)[Ll;", line = 185)
    public static final class22[] method249(byte arg0) {
        return arg0 > -2 ? (class22[]) null : new class22[] { class5.field41, class8.field60, class14.field150, class12.field130, class13.field145, field503, class8.field55, class16.field161, class34.field455, class8.field53, class23.field223, class2.field13, class12.field124, class25.field250, class19.field194, class37.field496, class13.field143, class33.field442, class16.field157, field497, mapview.field269, class13.field141, class17.field172, class35.field477, class13.field139, class1.field4, class34.field461, class34.field456, class32.field440, class28.field366, class29.field388, class13.field138, class16.field156, class5.field43, mapview.field267, class5.field49, class27.field362, class23.field225, class19.field183, class28.field371, class2.field11, class13.field137, class8.field54, class21.field210, class29.field374, class8.field65, class8.field59, class33.field449, class19.field195, class33.field445, class17.field170, class35.field475, class37.field492, class35.field470, class27.field365, mapview.field272, class37.field488, class8.field57, class14.field146, class33.field451, class34.field462, class33.field448, class34.field464, field499, class34.field464, class30.field415, class34.field464, class27.field363, class10.field87, class34.field464, class2.field15, class34.field464, class34.field464, class5.field46, class34.field464, class34.field464 };
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(I)V", line = 197)
    public static void method250(int arg0) {
        field501 = null;
        field503 = null;
        field508 = null;
        field497 = null;
        field504 = null;
        field505 = null;
        if (arg0 == 8) {
            field499 = null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(B)B", line = 215)
    public final byte method251(byte arg0) {
        int var2 = 110 / ((32 - arg0) / 39);
        return this.field500[this.field498++];
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II[II)V", line = 228)
    public final void method252(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != 8773) {
            this.method248(-119, -102, null, 34);
        }
        int var5 = (arg1 - arg3) / 8;
        int var6 = this.field498;
        this.field498 = arg3;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method244(1918432520);
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            int var12 = this.method244(1918432520);
            while (var11-- > 0) {
                var12 -= var9 + arg2[var9 >>> 11 & 0xD7E00003] ^ (var8 >>> 5 ^ var8 << 4) - -var8;
                var9 -= var10;
                var8 -= arg2[var9 & 0x3] + var9 ^ (var12 << 4 ^ var12 >>> 5) + var12;
            }
            this.field498 -= 8;
            this.method243(var8, (byte) 6);
            this.method243(var12, (byte) 6);
        }
        this.field498 = var6;
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(B)I", line = 271)
    public final int method253(byte arg0) {
        this.field498 += 3;
        int var2 = 127 / ((-arg0 - 85) / 40);
        return (this.field500[this.field498 - 1] & 0xFF) + (((this.field500[this.field498 - 3] & 0xFF) << 16) + ((this.field500[this.field498 - 2] & 0xFF) << 8));
    }

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "(I)I", line = 302)
    public final int method254(int arg0) {
        this.field498 += 2;
        if (arg0 != -1092048568) {
            field506 = 25;
        }
        return ((this.field500[this.field498 - 2] & 0xFF) << 8) + (this.field500[this.field498 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!w", name = "<init>", descriptor = "(I)V", line = 312)
    public class38(int arg0) {
        this.field500 = class1.method2(arg0, 13929);
        this.field498 = 0;
    }

    @OriginalMember(owner = "mapview!w", name = "<init>", descriptor = "([B)V", line = 324)
    public class38(byte[] arg0) {
        this.field500 = arg0;
        this.field498 = 0;
    }
}
