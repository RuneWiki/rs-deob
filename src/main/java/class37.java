import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class37 extends class30 {

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "[B")
    public byte[] field505;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "mapview!w", name = "m", descriptor = "Ld;")
    private static class7 field504 = method242("Dungeon", 1333943984);

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "Ld;")
    public static class7 field508 = method242("Please wait)3)3)3 Rendering Map", 1333943984);

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "Ld;")
    public static class7 field510 = method242("map", 1333943984);

    @OriginalMember(owner = "mapview!w", name = "l", descriptor = "[Ld;")
    public static class7[] field503;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(I)I", line = 21)
    public final int method237(int arg0) {
        int var2 = 66 / ((-arg0 - 46) / 61);
        return this.field505[this.field509++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I[BII)V", line = 32)
    public final void method238(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            arg1[var5] = this.field505[this.field509++];
        }
        if (arg0 != 40) {
            field504 = null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II)V", line = 54)
    public final void method239(int arg0, int arg1) {
        this.field505[this.field509++] = (byte) (arg1 >> 24);
        if (arg0 > 89) {
            this.field505[this.field509++] = (byte) (arg1 >> 16);
            this.field505[this.field509++] = (byte) (arg1 >> 8);
            this.field505[this.field509++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(I)I", line = 75)
    public final int method240(int arg0) {
        if (arg0 == 12103) {
            this.field509 += 3;
            return ((this.field505[this.field509 - 3] & 0xFF) << 16) + ((this.field505[this.field509 - 2] & 0xFF) << 8) + (this.field505[this.field509 + -1] & 0xFF);
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "(I)[Ld;", line = 108)
    public static final class7[] method241(int arg0) {
        return arg0 == 25578 ? new class7[] { class16.field167, class29.field430, class29.field434, class2.field19, mapview.field333, class2.field13, class16.field162, class8.field98, class29.field432, class13.field131, class30.field441, class21.field207, field504, class4.field53, class25.field236, class16.field159, class3.field23, class14.field137, class28.field422, class3.field29, class15.field147, mapview.field262, class31.field458, class20.field194, class15.field149, class3.field26, class7.field85, class34.field477, class21.field208, class28.field423, class3.field32, mapview.field315, class25.field244, class7.field83, class25.field235, class30.field442, class31.field457, class27.field378, class32.field466, class7.field80, class8.field96, class34.field481, mapview.field317, class36.field500, class29.field436, class14.field135, class27.field373, class24.field233, class3.field25, class1.field3, class34.field479, class4.field57, mapview.field297, class28.field385, class20.field197, class30.field450, class4.field51, mapview.field339, class24.field231, class7.field82, class1.field5, class25.field243, class35.field489, class20.field199, class35.field489, class27.field370, class35.field489, class15.field156, class7.field87, class35.field489, class2.field20, class35.field489, class35.field489, class35.field489 } : (class7[]) null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/lang/String;I)Ld;", line = 122)
    public static final class7 method242(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class7 var4 = new class7();
        var4.field79 = new byte[var3];
        if (arg1 != 1333943984) {
            method247(58);
        }
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field79[var4.field90++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field79[var4.field90++] = (byte) var6;
            }
        }
        var4.method69(-5);
        return var4.method75(arg1 ^ 0x4F824EB0);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(B)I", line = 163)
    public final int method243(byte arg0) {
        if (arg0 >= -116) {
            this.method246(48, null, -33, (byte) 40);
        }
        this.field509 += 2;
        return ((this.field505[this.field509 - 2] & 0xFF) << 8) + (this.field505[this.field509 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(B)I", line = 195)
    public final int method244(byte arg0) {
        if (arg0 != 117) {
            this.method246(26, null, 87, (byte) -51);
        }
        this.field509 += 4;
        return (this.field505[this.field509 - 1] & 0xFF) + ((this.field505[this.field509 - 2] & 0xFF) << 8) + ((this.field505[this.field509 + -4] & 0xFF) << 24) + ((this.field505[this.field509 + -3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(Z)B", line = 225)
    public final byte method245(boolean arg0) {
        if (arg0) {
            method242(null, 52);
        }
        return this.field505[this.field509++];
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I[IIB)V", line = 237)
    public final void method246(int arg0, int[] arg1, int arg2, byte arg3) {
        int var5 = this.field509;
        this.field509 = arg2;
        int var6 = (arg0 - arg2) / 8;
        if (arg3 <= 35) {
            return;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = -957401312;
            int var9 = -1640531527;
            int var10 = this.method244((byte) 117);
            int var11 = this.method244((byte) 117);
            int var12 = 32;
            while (var12-- > 0) {
                var11 -= (var10 << 4 ^ var10 >>> 5) + var10 ^ arg1[var8 >>> 11 & 0x3] + var8;
                var8 -= var9;
                var10 -= (var11 << 4 ^ var11 >>> 5) + var11 ^ arg1[var8 & 0x3] + var8;
            }
            this.field509 -= 8;
            this.method239(126, var10);
            this.method239(100, var11);
        }
        this.field509 = var5;
    }

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "(I)V", line = 316)
    public static void method247(int arg0) {
        field504 = null;
        field510 = null;
        field503 = null;
        field508 = null;
        if (arg0 != 255) {
            field507 = -11;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(Z)Ld;", line = 334)
    public final class7 method248(boolean arg0) {
        int var2 = this.field509;
        while (this.field505[this.field509++] != 0) {
        }
        if (!arg0) {
            field510 = null;
        }
        return class8.method82(this.field505, this.field509 - var2 - 1, (byte) -114, var2);
    }

    @OriginalMember(owner = "mapview!w", name = "<init>", descriptor = "(I)V", line = 352)
    public class37(int arg0) {
        this.field505 = class2.method18(arg0, (byte) -77);
        this.field509 = 0;
    }

    @OriginalMember(owner = "mapview!w", name = "<init>", descriptor = "([B)V", line = 362)
    public class37(byte[] arg0) {
        this.field505 = arg0;
        this.field509 = 0;
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(II)V", line = 372)
    public final void method249(int arg0, int arg1) {
        if (arg1 == -128) {
            this.field505[this.field509++] = (byte) arg0;
        }
    }
}
