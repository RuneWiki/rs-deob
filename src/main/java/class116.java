import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class116 extends class206 {

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    private int field1954;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[Z")
    public boolean[] field1967;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "[I")
    public int[] field1956;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "[[I")
    public int[][] field1960;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Lgb;")
    public static class158 field1958 = new class158(260);

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "Lwa;")
    public static class75 field1964 = class66.method560("settings", false);

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field1965 = 0;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Lwa;")
    private static class75 field1963 = class66.method560("Attack", false);

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lwa;")
    public static class75 field1962 = field1963;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Z")
    public static boolean field1970 = true;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Lei;")
    public static class184 field1966;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Lcb;")
    public static class267 field1969;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "[I")
    public static int[] field1968;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "[Lje;")
    public static class68[] field1957;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I", line = 5)
    public static final int method887(int arg0, int arg1) {
        field1953++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (~arg0 == arg1) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V", line = 28)
    public static void method888(int arg0) {
        field1958 = null;
        field1968 = null;
        field1957 = null;
        if (arg0 > -65) {
            method888(85);
        }
        field1962 = null;
        field1964 = null;
        field1966 = null;
        field1963 = null;
        field1969 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lre;B)V", line = 65)
    public static final void method889(class262 arg0, byte arg1) {
        field1955++;
        if (arg1 != -96) {
            return;
        }
        class262 var2 = class166.method1234((byte) 65, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class188.field3141;
            var3 = class244.field4111;
        } else {
            var3 = var2.field4517;
            var4 = var2.field4531;
        }
        class255.method1822(false, arg0, -55, var3, var4);
        class28.method188(arg0, 2, var3, var4);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I[B)V", line = 115)
    public class116(int arg0, byte[] arg1) {
        this.field1961 = arg0;
        class60 var3 = new class60(arg1);
        this.field1954 = var3.method501(0);
        this.field1967 = new boolean[this.field1954];
        this.field1956 = new int[this.field1954];
        this.field1960 = new int[this.field1954][];
        for (int var4 = 0; var4 < this.field1954; var4++) {
            this.field1956[var4] = var3.method501(0);
        }
        for (int var5 = 0; var5 < this.field1954; var5++) {
            this.field1967[var5] = var3.method501(0) == 1;
        }
        for (int var6 = 0; var6 < this.field1954; var6++) {
            this.field1960[var6] = new int[var3.method501(0)];
        }
        for (int var7 = 0; var7 < this.field1954; var7++) {
            for (int var8 = 0; var8 < this.field1960[var7].length; var8++) {
                this.field1960[var7][var8] = var3.method501(0);
            }
        }
    }
}
