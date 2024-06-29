import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class453 extends class200 {

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "[I")
    public static int[] field6773 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lug;")
    public static class392 field6769 = new class392();

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lbi;")
    public static class333 field6777;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Ljava/lang/String;")
    public String field6765;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "[C")
    public char[] field6763;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "[C")
    public char[] field6767;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "[I")
    public int[] field6772;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "[I")
    public int[] field6775;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BC)I", line = 11)
    public final int method2703(byte arg0, char arg1) {
        field6774++;
        if (this.field6772 == null) {
            return -1;
        }
        if (arg0 != 87) {
            field6773 = null;
        }
        for (int var3 = 0; var3 < this.field6772.length; var3++) {
            if (this.field6763[var3] == arg1) {
                return this.field6772[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILcu;)V", line = 35)
    public final void method2704(int arg0, class145 arg1) {
        while (true) {
            int var3 = arg1.method1063((byte) -111);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.method2706(-83, null, 72);
                }
                field6776++;
                return;
            }
            this.method2706(var3, arg1, 3);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 59)
    public static void method2705(byte arg0) {
        field6769 = null;
        int var1 = 122 % ((43 - arg0) / 32);
        field6777 = null;
        field6773 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILcu;I)V", line = 79)
    private final void method2706(int arg0, class145 arg1, int arg2) {
        if (arg2 != 3) {
            field6777 = null;
        }
        field6764++;
        if (arg0 == 1) {
            this.field6765 = arg1.method1101((byte) -121);
        } else if (arg0 == 2) {
            int var7 = arg1.method1063((byte) -84);
            this.field6763 = new char[var7];
            this.field6772 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field6772[var8] = arg1.method1069((byte) -89);
                byte var9 = arg1.method1093(15);
                this.field6763[var8] = var9 == 0 ? 0 : class305.method1999(var9, (byte) 79);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1063((byte) 123);
            this.field6767 = new char[var4];
            this.field6775 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6775[var5] = arg1.method1069((byte) -19);
                byte var6 = arg1.method1093(15);
                this.field6767[var5] = var6 == 0 ? 0 : class305.method1999(var6, (byte) 37);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IC)I", line = 144)
    public final int method2707(int arg0, char arg1) {
        field6766++;
        if (this.field6775 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field6775.length; var3++) {
            if (this.field6767[var3] == arg1) {
                return this.field6775[var3];
            }
        }
        if (arg0 >= -103) {
            this.method2704(32, null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V", line = 169)
    public final void method2708(byte arg0) {
        field6768++;
        if (this.field6775 != null) {
            for (int var2 = 0; var2 < this.field6775.length; var2++) {
                this.field6775[var2] = class121.method909(this.field6775[var2], 32768);
            }
        }
        if (arg0 != 89) {
            this.field6775 = null;
        }
        if (this.field6772 != null) {
            for (int var3 = 0; var3 < this.field6772.length; var3++) {
                this.field6772[var3] = class121.method909(this.field6772[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;B)I", line = 199)
    public static final int method2709(int arg0, String arg1, byte arg2) {
        int var3 = 4 % ((24 - arg2) / 52);
        field6770++;
        return class298.method1888(arg1, true, arg0, 100);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;)J", line = 210)
    public static final long method2710(int arg0, String arg1) {
        int var2 = -89 / ((arg0 - 14) / 57);
        field6771++;
        int var3 = arg1.length();
        long var4 = 0L;
        for (int var6 = 0; var6 < var3; var6++) {
            var4 = (var4 << 5) + (long) arg1.charAt(var6) - var4;
        }
        return var4;
    }
}
