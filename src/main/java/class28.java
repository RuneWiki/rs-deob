import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class28 {

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "[I")
    private int[] field334;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "I")
    public static int field331 = 20;

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Ll;")
    public static class21 field330 = method185(-20839, "75(U");

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Ll;")
    public static class21 field332 = method185(-20839, "Tannery");

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Ll;")
    public static class21 field333 = method185(-20839, "u_pass");

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "I")
    public static int field335 = 1;

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "I")
    public static int field336 = 0;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IB)I", line = 12)
    public final int method179(int arg0, byte arg1) {
        int var3 = -87 % ((arg1 - 47) / 46);
        int var4 = this.field334.length - 2;
        int var5 = var4 & arg0 << 1;
        while (true) {
            int var6 = this.field334[var5];
            if (arg0 == var6) {
                return this.field334[var5 + 1];
            }
            if (var6 == -1) {
                return -1;
            }
            var5 = var5 + 2 & var4;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([BIII)I", line = 43)
    public static final int method180(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = -1;
        int var5 = -38 % ((arg1 + 63) / 43);
        for (int var6 = arg3; var6 < arg2; var6++) {
            var4 = var4 >>> 8 ^ class2.field11[(var4 ^ arg0[var6]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 66)
    public static void method181(byte arg0) {
        int var1 = -94 % ((-arg0 - 54) / 42);
        field332 = null;
        field333 = null;
        field330 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 82)
    public static final void method182(int arg0, Component arg1) {
        arg1.removeKeyListener(class5.field38);
        arg1.removeFocusListener(class5.field38);
        if (arg0 != -18917) {
            field331 = -78;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I[Ll;)Ll;", line = 104)
    public static final class21 method183(int arg0, class21[] arg1) {
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 0) {
            field330 = null;
        }
        return class17.method76(arg1, 0, arg1.length, 0);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(BLl;Ll;Lka;)[Lf;", line = 132)
    public static final Pix24[] method184(byte arg0, class21 arg1, class21 arg2, class20 arg3) {
        int var4 = arg3.method92((byte) 4, arg1);
        if (arg0 <= 95) {
            return (Pix24[]) null;
        } else {
            int var5 = arg3.method94(arg2, var4, -467);
            return class20.method84(var4, var5, -15554, arg3);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ILjava/lang/String;)Ll;", line = 146)
    public static final class21 method185(int arg0, String arg1) {
        if (arg0 != -20839) {
            method182(62, null);
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class21 var4 = new class21();
        var4.field197 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field197[var4.field204++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field197[var4.field204++] = (byte) var6;
            }
        }
        var4.method105((byte) 111);
        return var4.method103(arg0 + 20885);
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "([I)V", line = 184)
    public class28(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field334 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field334[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field334[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field334[var5 + var5] = arg0[var4];
            this.field334[var5 + var5 + 1] = var4++;
        }
    }
}
