import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class107 {

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "B")
    private byte field1959;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public int field1957;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "[I")
    public static int[] field1952 = new int[100];

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field1950 = 0;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lsg;")
    private static class169 field1954 = class165.method1060("Loading wordpack )2 ", 1536);

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lsg;")
    public static class169 field1953 = class165.method1060("Bitte benutzen Sie eine andere Welt)3", 1536);

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "[I")
    public static int[] field1960 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "[I")
    public static int[] field1961 = new int[128];

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field1964 = 0;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lsg;")
    public static class169 field1965 = class165.method1060("null", 1536);

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Lsg;")
    public static class169 field1955 = field1954;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "[I")
    public static int[] field1956;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Lgb;")
    public static final class58 method626(int arg0) {
        if (arg0 <= 19) {
            field1956 = null;
        }
        if (class75.field1416 == null) {
            class75.field1416 = new class58();
        }
        field1948++;
        return class75.field1416;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I")
    public final int method627(boolean arg0) {
        if (arg0) {
            field1954 = null;
        }
        field1962++;
        return (this.field1959 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1956 = null;
        field1955 = null;
        field1954 = null;
        field1961 = null;
        if (arg0 == 0) {
            field1952 = null;
            field1953 = null;
            field1965 = null;
            field1960 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)I")
    public final int method629(boolean arg0) {
        if (arg0) {
            field1947++;
            return this.field1959 & 0x7;
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZLsg;)V")
    public static final void method630(int arg0, boolean arg1, class169 arg2) {
        int var3 = -47 % ((arg0 + 54) / 45);
        field1949++;
        short[] var4 = new short[16];
        class169 var5 = arg2.method1131((byte) -75);
        int var6 = 0;
        for (int var7 = 0; var7 < class121.field2233; var7++) {
            class73 var14 = class180.method1196(var7, 0);
            if ((!arg1 || var14.field1366) && var14.field1383.method1131((byte) -69).method1116(-248, var5) != -1) {
                if (var6 >= 100) {
                    class80.field1481 = null;
                    class20.field434 = -1;
                    return;
                }
                if (var6 >= var4.length) {
                    short[] var15 = new short[var4.length * 2];
                    for (int var16 = 0; var16 < var6; var16++) {
                        var15[var16] = var4[var16];
                    }
                    var4 = var15;
                }
                var4[var6++] = (short) var7;
            }
        }
        class80.field1481 = var4;
        class20.field434 = var6;
        class15.field322 = 0;
        int var8 = var6;
        boolean var9;
        do {
            if (var8 <= 0) {
                return;
            }
            var8--;
            var9 = true;
            for (int var10 = 0; var10 < var8; var10++) {
                class73 var11 = class180.method1196(var4[var10], 0);
                class73 var12 = class180.method1196(var4[var10 + 1], 0);
                if (var11.field1383.method1112((byte) 125, var12.field1383) > 0) {
                    var9 = false;
                    short var13 = var4[var10];
                    var4[var10] = var4[var10 + 1];
                    var4[var10 + 1] = var13;
                }
            }
        } while (!var9);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class107() {
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Loa;)V")
    public class107(class127 arg0) {
        this.field1959 = arg0.method824((byte) 48);
        this.field1958 = arg0.method785(true);
        this.field1951 = arg0.method814(8);
        this.field1966 = arg0.method814(8);
        this.field1963 = arg0.method814(8);
        this.field1957 = arg0.method814(8);
    }
}
