import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class183 extends class252 {

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3034 = "yellow:";

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3041 = "Loading...";

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "Lge;")
    public static class73 field3043;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "Ljava/lang/String;")
    public String field3036;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "[C")
    public char[] field3032;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "[C")
    public char[] field3039;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "[I")
    public int[] field3038;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "[I")
    public int[] field3044;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V")
    public static void method1290(byte arg0) {
        field3034 = null;
        field3043 = null;
        field3041 = null;
        int var1 = -4 % ((arg0 - 5) / 44);
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V")
    public final void method1291(byte arg0) {
        field3037++;
        if (this.field3044 != null) {
            for (int var2 = 0; var2 < this.field3044.length; var2++) {
                this.field3044[var2] = class76.method555(this.field3044[var2], 32768);
            }
        }
        if (arg0 != 30) {
            this.method1295(34, false, (class274) null);
        }
        if (this.field3038 != null) {
            for (int var3 = 0; var3 < this.field3038.length; var3++) {
                this.field3038[var3] = class76.method555(this.field3038[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IC)I")
    public final int method1292(int arg0, char arg1) {
        field3033++;
        if (this.field3038 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3038.length; var3++) {
            if (this.field3039[var3] == arg1) {
                return this.field3038[var3];
            }
        }
        if (arg0 != -1) {
            this.method1291((byte) 53);
        }
        return -1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)J")
    public static final long method1293(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        return var3 == null || var3.field1780 == null ? 0L : var3.field1780.field3446;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lfj;B)V")
    public final void method1294(class274 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1849(255);
            if (var3 == 0) {
                field3031++;
                int var4 = -116 / ((arg1 - 20) / 57);
                return;
            }
            this.method1295(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZLfj;)V")
    private final void method1295(int arg0, boolean arg1, class274 arg2) {
        if (arg0 == 1) {
            this.field3036 = arg2.method1855(113);
        } else if (arg0 == 2) {
            int var7 = arg2.method1849(255);
            this.field3038 = new int[var7];
            this.field3039 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3038[var8] = arg2.method1837(252);
                byte var9 = arg2.method1830((byte) 102);
                this.field3039[var8] = var9 == 0 ? 0 : class88.method614(var9, (byte) -85);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1849(255);
            this.field3032 = new char[var4];
            this.field3044 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3044[var5] = arg2.method1837(252);
                byte var6 = arg2.method1830((byte) -71);
                this.field3032[var5] = var6 == 0 ? 0 : class88.method614(var6, (byte) -85);
            }
        }
        field3040++;
        if (arg1) {
            this.method1295(64, false, (class274) null);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lu;B)V")
    public static final void method1296(class127 arg0, byte arg1) {
        field3042++;
        long var2 = 0L;
        int var4 = -1;
        if (arg1 < 36) {
            field3041 = null;
        }
        if (arg0.field2037 == 0) {
            var2 = class180.method1266(arg0.field2028, arg0.field2035, arg0.field2024);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0.field2037 == 1) {
            var2 = method1293(arg0.field2028, arg0.field2035, arg0.field2024);
        }
        if (arg0.field2037 == 2) {
            var2 = class195.method1361(arg0.field2028, arg0.field2035, arg0.field2024);
        }
        if (arg0.field2037 == 3) {
            var2 = class275.method1874(arg0.field2028, arg0.field2035, arg0.field2024);
        }
        if (var2 != 0L) {
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = (int) var2 >> 20 & 0x3;
            var5 = (int) var2 >> 14 & 0x1F;
        }
        arg0.field2036 = var5;
        arg0.field2025 = var6;
        arg0.field2027 = var4;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(CZ)I")
    public final int method1297(char arg0, boolean arg1) {
        field3045++;
        if (this.field3044 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3044.length; var3++) {
            if (this.field3032[var3] == arg0) {
                return this.field3044[var3];
            }
        }
        if (arg1) {
            method1293(-122, 71, 117);
        }
        return -1;
    }
}
