import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class19 extends class30 {

    @OriginalMember(owner = "mapview!j", name = "q", descriptor = "[B")
    public byte[] field193;

    @OriginalMember(owner = "mapview!j", name = "t", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "mapview!j", name = "o", descriptor = "I")
    public static int field191 = 0;

    @OriginalMember(owner = "mapview!j", name = "n", descriptor = "[J")
    public static long[] field190 = new long[32];

    @OriginalMember(owner = "mapview!j", name = "p", descriptor = "Lu;")
    public static class38 field192 = class28.method177("fonts", (byte) -84);

    @OriginalMember(owner = "mapview!j", name = "u", descriptor = "Lu;")
    public static class38 field197 = class28.method177("Estate Agent", (byte) -84);

    @OriginalMember(owner = "mapview!j", name = "r", descriptor = "Lu;")
    public static class38 field194 = class28.method177("Sword Shop", (byte) -84);

    @OriginalMember(owner = "mapview!j", name = "w", descriptor = "Lu;")
    public static class38 field199 = class28.method177("Cookery Shop", (byte) -84);

    @OriginalMember(owner = "mapview!j", name = "v", descriptor = "Lu;")
    public static class38 field198 = class28.method177("Slayer Master", (byte) -84);

    @OriginalMember(owner = "mapview!j", name = "s", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "mapview!j", name = "x", descriptor = "Lu;")
    public static class38 field200 = class28.method177("Tannery", (byte) -84);

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "[I")
    public static int[] field189;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 4)
    public static final void method107(Component arg0, byte arg1) {
        arg0.removeMouseListener(class9.field87);
        arg0.removeMouseMotionListener(class9.field87);
        arg0.removeFocusListener(class9.field87);
        class9.field91 = 0;
        if (arg1 < 44) {
            field192 = null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Z)Lu;", line = 18)
    public final class38 method108(boolean arg0) {
        if (!arg0) {
            this.method119((byte) -93);
        }
        int var2 = this.field196;
        while (this.field193[this.field196++] != 0) {
        }
        return class8.method45(this.field196 - var2 - 1, var2, this.field193, (byte) 127);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIZI)Lu;", line = 44)
    public static final class38 method109(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = arg3 / arg0;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg0;
            var5++;
        }
        int var6 = var5;
        if (arg3 < 0 || arg2) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg3 % arg0;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg3 /= arg0;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class38 var10 = new class38();
        var10.field483 = var7;
        int var11 = -83 % ((-arg1 - 1) / 32);
        var10.field494 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(II)V", line = 120)
    public final void method110(int arg0, int arg1) {
        this.field193[this.field196++] = (byte) arg0;
        if (arg1 != -2) {
            this.field196 = 51;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(III[I)V", line = 134)
    public final void method111(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != -25850) {
            return;
        }
        int var5 = (arg2 - arg1) / 8;
        int var6 = this.field196;
        this.field196 = arg1;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = -1640531527;
            int var9 = -957401312;
            int var10 = this.method117(false);
            int var11 = 32;
            int var12 = this.method117(false);
            while (var11-- > 0) {
                var12 -= (var10 << 4 ^ var10 >>> 5) + var10 ^ arg3[var9 >>> 11 & 0x3] + var9;
                var9 -= var8;
                var10 -= (var12 << 4 ^ var12 >>> 5) + var12 ^ arg3[var9 & 0x3] + var9;
            }
            this.field196 -= 8;
            this.method113(var10, true);
            this.method113(var12, true);
        }
        this.field196 = var6;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)I", line = 213)
    public final int method112(int arg0) {
        this.field196 += 3;
        if (arg0 != 30419) {
            field191 = -118;
        }
        return (this.field193[this.field196 - 1] & 0xFF) + ((this.field193[this.field196 - 2] & 0xFF) << 8) + ((this.field193[this.field196 + -3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IZ)V", line = 227)
    public final void method113(int arg0, boolean arg1) {
        this.field193[this.field196++] = (byte) (arg0 >> 24);
        if (!arg1) {
            this.method120(false);
        }
        this.field193[this.field196++] = (byte) (arg0 >> 16);
        this.field193[this.field196++] = (byte) (arg0 >> 8);
        this.field193[this.field196++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 247)
    public static final void method114(int arg0, Component arg1) {
        if (arg0 != 128) {
            method109(-67, 41, true, -26);
        }
        arg1.removeKeyListener(class29.field364);
        arg1.removeFocusListener(class29.field364);
        class31.field389 = -1;
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)I", line = 261)
    public final int method115(int arg0) {
        return arg0 == -2 ? this.field193[this.field196++] & 0xFF : 100;
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(I)V", line = 291)
    public static void method116(int arg0) {
        field197 = null;
        field192 = null;
        field199 = null;
        if (arg0 >= -117) {
            method114(23, null);
        }
        field200 = null;
        field189 = null;
        field194 = null;
        field190 = null;
        field198 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(Z)I", line = 313)
    public final int method117(boolean arg0) {
        if (arg0) {
            this.method115(-114);
        }
        this.field196 += 4;
        return ((this.field193[this.field196 - 3] & 0xFF) << 16) + ((this.field193[this.field196 - 4] & 0xFF) << 24) + ((this.field193[this.field196 + -2] & 0xFF) << 8) + (this.field193[this.field196 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IB[B)I", line = 333)
    public static final int method118(int arg0, byte arg1, byte[] arg2) {
        int var3 = 64 / ((29 - arg1) / 35);
        return class37.method217(0, arg0, arg2, 0);
    }

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "(B)I", line = 356)
    public final int method119(byte arg0) {
        if (arg0 <= 106) {
            return 23;
        } else {
            this.field196 += 2;
            return ((this.field193[this.field196 - 2] & 0xFF) << 8) + (this.field193[this.field196 - 1] & 0xFF);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(Z)B", line = 374)
    public final byte method120(boolean arg0) {
        return arg0 ? this.field193[this.field196++] : -80;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIB[B)V", line = 423)
    public final void method121(int arg0, int arg1, byte arg2, byte[] arg3) {
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            arg3[var5] = this.field193[this.field196++];
        }
        int var6 = -30 / ((arg2 + 49) / 63);
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(I)V", line = 445)
    public class19(int arg0) {
        this.field193 = class20.method123((byte) -87, arg0);
        this.field196 = 0;
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "([B)V", line = 453)
    public class19(byte[] arg0) {
        this.field193 = arg0;
        this.field196 = 0;
    }
}
