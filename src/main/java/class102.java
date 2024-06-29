import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class102 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
    public boolean field1516 = false;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
    private int[] field1520 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field1517 = -1;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field1511 = -1;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Lve;")
    public static class233 field1522;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
    private int[] field1514;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[I")
    public static int[] field1531;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[S")
    private short[] field1519;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[S")
    private short[] field1525;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[S")
    private short[] field1527;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "[S")
    private short[] field1530;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Z")
    public final boolean method676(byte arg0) {
        field1526++;
        if (this.field1514 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 <= 94) {
            this.field1516 = false;
        }
        while (this.field1514.length > var3) {
            if (!class280.field4471.method1520(false, this.field1514[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Lva;")
    public final class127 method677(byte arg0) {
        field1515++;
        int var2 = 0;
        class127[] var3 = new class127[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1520[var4] != -1) {
                var3[var2++] = class127.method866(class280.field4471, this.field1520[var4], 0);
            }
        }
        class127 var5 = new class127(var3, var2);
        if (this.field1519 != null) {
            for (int var6 = 0; var6 < this.field1519.length; var6++) {
                var5.method869(this.field1519[var6], this.field1527[var6]);
            }
        }
        if (arg0 != -85) {
            return null;
        }
        if (this.field1525 != null) {
            for (int var7 = 0; var7 < this.field1525.length; var7++) {
                var5.method872(this.field1525[var7], this.field1530[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)Lfi;")
    public static final class228 method678(byte arg0, int arg1) {
        field1521++;
        class228 var2 = (class228) class91.field1389.method1501((long) arg1, (byte) -20);
        if (var2 != null) {
            return var2;
        }
        int var3 = -21 % ((-arg0 - 71) / 43);
        byte[] var4 = class152.field2200.method1538(11, arg1, (byte) 125);
        class228 var5 = new class228();
        if (var4 != null) {
            var5.method1487(new class114(var4), -61);
        }
        class91.field1389.method1499((long) arg1, -85, var5);
        return var5;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Z")
    public final boolean method679(int arg0) {
        boolean var2 = true;
        field1513++;
        if (arg0 != -12564) {
            this.method684(-55, -35, (class114) null);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1520[var3] != -1 && !class280.field4471.method1520(false, this.field1520[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static void method680(int arg0) {
        field1522 = null;
        field1531 = null;
        int var1 = 95 % ((28 - arg0) / 47);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLkl;)V")
    public final void method681(byte arg0, class114 arg1) {
        field1523++;
        int var3 = 107 % ((arg0 - 57) / 59);
        while (true) {
            int var4 = arg1.method760(false);
            if (var4 == 0) {
                return;
            }
            this.method684(0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)V")
    public static final void method682(int arg0, byte arg1) {
        field1518++;
        class161.field2332.method258(arg0, (byte) 91);
        class54.field824.method258(arg0, (byte) 89);
        int var2 = -37 / ((arg1 + 62) / 54);
        class24.field316.method258(arg0, (byte) 87);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)I")
    public static final int method683(byte arg0) {
        if (arg0 <= 0) {
            method682(95, (byte) 125);
        }
        field1524++;
        return 6;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILkl;)V")
    private final void method684(int arg0, int arg1, class114 arg2) {
        if (arg1 == 1) {
            this.field1517 = arg2.method760(false);
        } else if (arg1 == 2) {
            int var4 = arg2.method760(false);
            this.field1514 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1514[var5] = arg2.method756(-29901);
            }
        } else if (arg1 == 3) {
            this.field1516 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method760(false);
            this.field1527 = new short[var6];
            this.field1519 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1519[var7] = (short) arg2.method756(-29901);
                this.field1527[var7] = (short) arg2.method756(-29901);
            }
        } else if (arg1 == 41) {
            int var8 = arg2.method760(false);
            this.field1530 = new short[var8];
            this.field1525 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1525[var9] = (short) arg2.method756(class182.method1175(arg0, -29901));
                this.field1530[var9] = (short) arg2.method756(-29901);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1520[arg1 - 60] = arg2.method756(class182.method1175(arg0, -29901));
        }
        field1529++;
        if (arg0 != 0) {
            this.method677((byte) -39);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
    public static final boolean method685(boolean arg0, String arg1, String arg2) {
        field1512++;
        int var3 = arg1.length();
        int var4 = arg2.length();
        if (arg0) {
            method685(false, (String) null, (String) null);
        }
        if (var3 < var4) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)Lva;")
    public final class127 method686(int arg0) {
        field1528++;
        if (this.field1514 == null) {
            return null;
        }
        class127[] var2 = new class127[this.field1514.length];
        for (int var3 = arg0; var3 < this.field1514.length; var3++) {
            var2[var3] = class127.method866(class280.field4471, this.field1514[var3], 0);
        }
        class127 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class127(var2, var2.length);
        }
        if (this.field1519 != null) {
            for (int var5 = 0; var5 < this.field1519.length; var5++) {
                var4.method869(this.field1519[var5], this.field1527[var5]);
            }
        }
        if (this.field1525 != null) {
            for (int var6 = 0; var6 < this.field1525.length; var6++) {
                var4.method872(this.field1525[var6], this.field1530[var6]);
            }
        }
        return var4;
    }
}
