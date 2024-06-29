import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class50 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    private int field987 = 0;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    private int field999 = -1;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lli;")
    private class191 field1000 = new class191();

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Z")
    public boolean field1005 = false;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "[[I")
    private int[][] field1004;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "[Lff;")
    private class42[] field994;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lvh;")
    public static class43 field996 = null;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lgf;")
    public static class7 field1001;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
    public static boolean field993;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)[[I")
    public final int[][] method301(int arg0) {
        field998++;
        if (this.field989 != this.field1002) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1002; var2++) {
            this.field994[var2] = class207.field3805;
        }
        if (arg0 > -66) {
            method304(73, -31, 52, -67, 106);
        }
        return this.field1004;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvh;BII)V")
    public static final void method302(class43 arg0, byte arg1, int arg2, int arg3) {
        field988++;
        if (arg0.field821 == 0) {
            arg0.field748 = arg0.field833;
        } else if (arg0.field821 == 1) {
            arg0.field748 = (arg2 - arg0.field831) / 2 + arg0.field833;
        } else if (arg0.field821 == 2) {
            arg0.field748 = arg2 - arg0.field831 - arg0.field833;
        } else if (arg0.field821 == 3) {
            arg0.field748 = arg0.field833 * arg2 >> 14;
        } else if (arg0.field821 == 4) {
            arg0.field748 = (arg0.field833 * arg2 >> 14) + (arg2 - arg0.field831) / 2;
        } else {
            arg0.field748 = arg2 - (arg0.field833 * arg2 >> 14) - arg0.field831;
        }
        if (arg0.field820 == 0) {
            arg0.field873 = arg0.field832;
        } else if (arg0.field820 == 1) {
            arg0.field873 = (arg3 - arg0.field735) / 2 + arg0.field832;
        } else if (arg0.field820 == 2) {
            arg0.field873 = arg3 - arg0.field735 - arg0.field832;
        } else if (arg0.field820 == 3) {
            arg0.field873 = arg0.field832 * arg3 >> 14;
        } else if (arg0.field820 == 4) {
            arg0.field873 = (arg0.field832 * arg3 >> 14) + (arg3 - arg0.field735) / 2;
        } else {
            arg0.field873 = arg3 - (arg0.field832 * arg3 >> 14) - arg0.field735;
        }
        int var4 = -32 % ((arg1 + 7) / 57);
        if (!class184.field3341) {
            return;
        }
        if (client.method1514(arg0) == 0 && arg0.field769 != 0) {
            return;
        }
        if (arg0.field873 < 0) {
            arg0.field873 = 0;
        } else if (arg3 < (arg0.field873 + arg0.field735)) {
            arg0.field873 = arg3 - arg0.field735;
        }
        if (arg0.field748 < 0) {
            arg0.field748 = 0;
            return;
        }
        if (arg2 < (arg0.field748 + arg0.field831)) {
            arg0.field748 = arg2 - arg0.field831;
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method303(byte arg0) {
        field1001 = null;
        field996 = null;
        if (arg0 > -44) {
            method302((class43) null, (byte) -112, -91, 42);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)I")
    public static final int method304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            method305(-59);
        }
        field985++;
        int var5 = 65536 - class196.field3630[arg1 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static final void method305(int arg0) {
        if (arg0 != 2) {
            method304(60, -81, -66, 40, -70);
        }
        field990++;
        class262.field4673.method1826((byte) 61);
        class225.field4078.method1695(true);
        class231.field4228.method1695(true);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
    public final int[] method306(int arg0, int arg1) {
        field997++;
        if (arg1 != -23179) {
            return null;
        } else if (this.field989 == this.field1002) {
            this.field1005 = this.field994[arg0] == null;
            this.field994[arg0] = class207.field3805;
            return this.field1004[arg0];
        } else if (this.field1002 == 1) {
            this.field1005 = this.field999 != arg0;
            this.field999 = arg0;
            return this.field1004[0];
        } else {
            class42 var3 = this.field994[arg0];
            if (var3 == null) {
                this.field1005 = true;
                if (this.field987 < this.field1002) {
                    var3 = new class42(arg0, this.field987);
                    this.field987++;
                } else {
                    class42 var4 = (class42) this.field1000.method1296(arg1 ^ 0x5AB4);
                    var3 = new class42(arg0, var4.field702);
                    this.field994[var4.field701] = null;
                    var4.method349(0);
                }
                this.field994[arg0] = var3;
            } else {
                this.field1005 = false;
            }
            this.field1000.method1297((byte) 23, var3);
            return this.field1004[var3.field702];
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILgf;Lgf;)I")
    public static final int method307(int arg0, class7 arg1, class7 arg2) {
        int var3 = 0;
        if (arg2.method40(class149.field2744, 113)) {
            var3++;
        }
        if (arg2.method40(class247.field4443, -120)) {
            var3++;
        }
        field991++;
        if (arg2.method40(class155.field2799, arg0 ^ 0x5083)) {
            var3++;
        }
        if (arg1.method40(class149.field2744, -89)) {
            var3++;
        }
        if (arg1.method40(class247.field4443, -71)) {
            var3++;
        }
        if (arg0 != 20720) {
            field996 = null;
        }
        if (arg1.method40(class155.field2799, arg0 ^ 0xFFFFAF43)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZLgf;Lfd;Lgf;)V")
    public static final void method308(int arg0, boolean arg1, class7 arg2, class213 arg3, class7 arg4) {
        field995++;
        class176.field3150 = arg2;
        class22.field362 = arg4;
        class179.field3203 = arg1;
        int var5 = arg0 + class176.field3150.method32((byte) -20);
        class112.field1967 = var5 * 256 + class176.field3150.method60(-21, var5);
        class170.field3036 = arg3;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public final void method309(int arg0) {
        for (int var2 = arg0; var2 < this.field1002; var2++) {
            this.field1004[var2] = null;
        }
        this.field994 = null;
        this.field1004 = null;
        field992++;
        this.field1000.method1293(false);
        this.field1000 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(III)V")
    public class50(int arg0, int arg1, int arg2) {
        this.field1002 = arg0;
        this.field1004 = new int[this.field1002][arg2];
        this.field989 = arg1;
        this.field994 = new class42[this.field989];
    }
}
