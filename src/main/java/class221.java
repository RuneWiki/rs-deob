import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class221 extends class181 {

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "[I")
    public int[] field3436;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "[[I")
    public int[][] field3447;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[Z")
    public boolean[] field3438;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[I")
    public int[] field3437;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "[I")
    public static int[] field3443 = new int[2];

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "[I")
    public static int[] field3446;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1515(String arg0, int arg1) {
        field3445++;
        if (class154.field2251 == null || arg0.length() == 0) {
            return -1;
        }
        if (arg1 != -4402) {
            method1515((String) null, -19);
        }
        for (int var2 = 0; var2 < class154.field2251.field3727; var2++) {
            if (class162.method1093((byte) -112, " ", "<br>", class154.field2251.field3731[var2]).equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I[B)V")
    public class221(int arg0, byte[] arg1) {
        this.field3441 = arg0;
        class54 var3 = new class54(arg1);
        this.field3442 = var3.method407(255);
        this.field3436 = new int[this.field3442];
        this.field3447 = new int[this.field3442][];
        this.field3438 = new boolean[this.field3442];
        this.field3437 = new int[this.field3442];
        for (int var4 = 0; var4 < this.field3442; var4++) {
            this.field3437[var4] = var3.method407(255);
        }
        for (int var5 = 0; var5 < this.field3442; var5++) {
            this.field3438[var5] = var3.method407(255) == 1;
        }
        for (int var6 = 0; var6 < this.field3442; var6++) {
            this.field3436[var6] = var3.method423(68);
        }
        for (int var7 = 0; var7 < this.field3442; var7++) {
            this.field3447[var7] = new int[var3.method407(255)];
        }
        for (int var8 = 0; var8 < this.field3442; var8++) {
            for (int var9 = 0; var9 < this.field3447[var8].length; var9++) {
                this.field3447[var8][var9] = var3.method407(255);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)I")
    public static final int method1516(byte arg0, int arg1) {
        if (arg0 <= 25) {
            return 88;
        } else {
            field3440++;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public static void method1517(int arg0) {
        field3443 = null;
        field3446 = null;
        if (arg0 != 16777215) {
            method1516((byte) -67, 45);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLwi;)V")
    public static final void method1518(int arg0, boolean arg1, class192 arg2) {
        field3448++;
        if (arg1) {
            int var3 = class85.field1311;
            int var4 = var3 * 956 / 503;
            class190.field2876.method1225((class126.field1854 - var4) / 2, 0, var4, var3);
            class60.field979.method368(class126.field1854 / 2 - (class60.field979.field3546 / 2), 18);
        }
        arg2.method1303(class285.field4372, class126.field1854 / 2, class85.field1311 / 2 - 26, 16777215, -1);
        int var5 = class85.field1311 / 2 - 18;
        class72.method564(class126.field1854 / 2 - 152, var5, 304, 34, 9179409);
        class72.method564(class126.field1854 / 2 - 151, var5 + 1, 302, 32, 0);
        class72.method576(class126.field1854 / 2 - 150, var5 - -2, class297.field4660 * 3, 30, 9179409);
        if (arg0 != -28279) {
            method1515((String) null, 23);
        }
        class72.method576(class297.field4660 * 3 + class126.field1854 / 2 - 150, var5 + 2, 300 - (class297.field4660 * 3), 30, 0);
        arg2.method1303(class149.field2160, class126.field1854 / 2, class85.field1311 / 2 + 4, 16777215, -1);
    }
}
