import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class155 extends class273 {

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    private int field2429 = 0;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "I")
    private int field2435 = 1;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "I")
    private int field2437 = 0;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field2425 = -1;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "Z")
    public static boolean field2434 = true;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "Lnk;")
    public static class2 field2431 = new class2();

    @OriginalMember(owner = "client!in", name = "X", descriptor = "Ljava/lang/String;")
    public static String field2438 = "white:";

    @OriginalMember(owner = "client!in", name = "Y", descriptor = "I")
    public static int field2439 = 0;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lwf;III)Lbd;", line = 8)
    public static final class20 method1078(class306 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field2438 = (String) null;
        }
        field2430++;
        return class156.method1093(true, arg1, arg3, arg0) ? class59.method405(0) : null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I", line = 29)
    public final int[] method331(int arg0, int arg1) {
        int[] var3 = this.field4204.method365(arg0, 0);
        field2432++;
        if (arg1 != -14650) {
            field2431 = (class2) null;
        }
        if (this.field4204.field792) {
            int var4 = class96.field1473[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class27.field346; var6++) {
                int var7 = class151.field2384[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field2437 == 0) {
                    var11 = (var7 - var4) * this.field2435;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field2435 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field2429 == 0) {
                    var12 = class159.field2477[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field2429 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BILgn;)V", line = 96)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field2428++;
        if (arg0 <= 27) {
            method1080((byte) -22);
        }
        if (arg1 == 0) {
            this.field2437 = arg2.method2043((byte) -112);
        } else if (arg1 == 1) {
            this.field2429 = arg2.method2043((byte) -125);
        } else if (arg1 == 3) {
            this.field2435 = arg2.method2043((byte) -122);
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 144)
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V", line = 150)
    public static final void method1079(int arg0) {
        field2424++;
        int var1 = class307.field4832;
        int var2 = class246.field3858;
        int var3 = class179.field2748;
        int var4 = 6116423;
        int var5 = class116.field1797;
        if (class333.field5166) {
            class238.method1636(var2, var1, var3, var5, var4);
            class238.method1636(var2 + 1, var1 - -1, var3 - 2, 16, 0);
            class238.method1621(var2 + 1, var1 + 18, var3 - 2, var5 + -19, 0);
        } else {
            class57.method375(var2, var1, var3, var5, var4);
            class57.method375(var2 + 1, var1 + 1, var3 - 2, 16, 0);
            class57.method388(var2 + 1, var1 - -18, var3 - 2, var5 + -19, 0);
        }
        class286.field4380.method1237(class82.field1224, var2 - arg0, var1 - -14, var4, -1);
        int var6 = class199.field2985;
        int var7 = class107.field1636;
        for (int var8 = 0; var8 < class168.field2565; var8++) {
            int var9 = (class168.field2565 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var6 > var2 && var6 < var2 + var3 && var7 > (var9 - 13) && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            class286.field4380.method1237(class234.method1597(0, var8), var2 + 3, var9, var10, 0);
        }
        class117.method804(class116.field1797, class307.field4832, arg0 + 99, class246.field3858, class179.field2748);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 203)
    public final void method349(int arg0) {
        field2433++;
        if (arg0 != 1) {
            this.method349(-2);
        }
        class27.method207((byte) 44);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V", line = 231)
    public static void method1080(byte arg0) {
        if (arg0 == 48) {
            field2438 = null;
            field2431 = null;
        }
    }
}
