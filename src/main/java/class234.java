import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class234 extends class139 {

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "[I")
    public static int[] field3750 = new int[14];

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[I")
    public static int[] field3752 = new int[50];

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Ljava/lang/String;")
    public String field3751;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "[C")
    public char[] field3746;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "[C")
    public char[] field3749;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "[I")
    public static int[] field3738;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "[I")
    public int[] field3748;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "[I")
    public int[] field3754;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLv;)V")
    public final void method1651(byte arg0, class152 arg1) {
        while (true) {
            int var3 = arg1.method1111(255);
            if (var3 == 0) {
                if (arg0 >= -32) {
                    method1657(-13, 1);
                }
                field3739++;
                return;
            }
            this.method1659(var3, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
    public static final int method1652(int arg0, int arg1, int arg2) {
        field3742++;
        int var3 = -45 % ((-arg2 - 80) / 38);
        int var4 = arg1 >> 31 & arg0 - 1;
        return ((arg1 >>> 31) + arg1) % arg0 + var4;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public final void method1653(int arg0) {
        if (this.field3748 != null) {
            for (int var2 = 0; var2 < this.field3748.length; var2++) {
                this.field3748[var2] = class244.method1747(this.field3748[var2], 32768);
            }
        }
        int var3 = 95 / ((11 - arg0) / 55);
        if (this.field3754 != null) {
            for (int var4 = 0; var4 < this.field3754.length; var4++) {
                this.field3754[var4] = class244.method1747(this.field3754[var4], 32768);
            }
        }
        field3740++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(CB)I")
    public final int method1654(char arg0, byte arg1) {
        field3753++;
        if (this.field3748 == null) {
            return -1;
        }
        if (arg1 != 36) {
            this.field3746 = null;
        }
        for (int var3 = 0; var3 < this.field3748.length; var3++) {
            if (this.field3749[var3] == arg0) {
                return this.field3748[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Llc;B)V")
    public static final void method1655(class86 arg0, byte arg1) {
        if (arg1 == 52) {
            class229.field3696 = arg0;
            field3745++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(CI)I")
    public final int method1656(char arg0, int arg1) {
        field3743++;
        if (this.field3754 == null) {
            return -1;
        }
        if (arg1 != -21749) {
            this.field3754 = null;
        }
        for (int var3 = 0; var3 < this.field3754.length; var3++) {
            if (this.field3746[var3] == arg0) {
                return this.field3754[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Ls;")
    public static final class245 method1657(int arg0, int arg1) {
        field3741++;
        class245 var2 = (class245) class141.field2271.method1553((long) arg1, (byte) -109);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class210.field3367.method643(class276.method1911(-119, arg1), class206.method1510(arg1, -847897881), false);
        class245 var4 = new class245();
        var4.field3986 = arg1;
        if (var3 != null) {
            var4.method1754(-21183, new class152(var3));
        }
        var4.method1752(-129);
        class141.field2271.method1551(var4, arg0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public static void method1658(byte arg0) {
        field3738 = null;
        if (arg0 >= -22) {
            method1657(-119, 33);
        }
        field3750 = null;
        field3752 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILv;I)V")
    private final void method1659(int arg0, class152 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3751 = arg1.method1078(-1);
        } else if (arg0 == 2) {
            int var7 = arg1.method1111(255);
            this.field3754 = new int[var7];
            this.field3746 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3754[var8] = arg1.method1126(false);
                byte var9 = arg1.method1092((byte) -62);
                this.field3746[var8] = var9 == 0 ? 0 : class226.method1620(95, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1111(255);
            this.field3749 = new char[var4];
            this.field3748 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3748[var5] = arg1.method1126(false);
                byte var6 = arg1.method1092((byte) -62);
                this.field3749[var5] = var6 == 0 ? 0 : class226.method1620(109, var6);
            }
        }
        if (arg2 == -1) {
            field3747++;
        }
    }
}
