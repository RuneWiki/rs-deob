import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 extends class117 {

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "Lvp;")
    public static class123 field481 = new class123(77, 8);

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "[I")
    public static int[] field493 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Ljava/lang/String;")
    public String field482;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "[C")
    public char[] field485;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "[C")
    public char[] field488;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "[I")
    public int[] field490;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "[I")
    public int[] field491;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(CB)I")
    public final int method247(char arg0, byte arg1) {
        field489++;
        if (this.field490 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field490.length; var3++) {
            if (this.field488[var3] == arg0) {
                return this.field490[var3];
            }
        }
        if (arg1 != -77) {
            field492 = 86;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILti;I)V")
    private final void method248(int arg0, class303 arg1, int arg2) {
        field484++;
        if (~arg0 == arg2) {
            this.field482 = arg1.method1879(30669);
        } else if (arg0 == 2) {
            int var7 = arg1.method1918((byte) -47);
            this.field488 = new char[var7];
            this.field490 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field490[var8] = arg1.method1868(class113.method838(arg2, -2));
                byte var9 = arg1.method1899((byte) 41);
                this.field488[var8] = var9 == 0 ? 0 : class470.method2804(63, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1918((byte) -89);
            this.field491 = new int[var4];
            this.field485 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field491[var5] = arg1.method1868(0);
                byte var6 = arg1.method1899((byte) -91);
                this.field485[var5] = var6 == 0 ? 0 : class470.method2804(63, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
    public static void method249(byte arg0) {
        if (arg0 > 99) {
            field493 = null;
            field481 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
    public final void method250(byte arg0) {
        if (this.field491 != null) {
            for (int var2 = 0; var2 < this.field491.length; var2++) {
                this.field491[var2] = class29.method239(this.field491[var2], 32768);
            }
        }
        field486++;
        if (arg0 <= 74) {
            field481 = null;
        }
        if (this.field490 != null) {
            for (int var3 = 0; var3 < this.field490.length; var3++) {
                this.field490[var3] = class29.method239(this.field490[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lti;I)V")
    public final void method251(class303 arg0, int arg1) {
        int var3 = -115 / ((arg1 + 48) / 40);
        while (true) {
            int var4 = arg0.method1918((byte) 84);
            if (var4 == 0) {
                field483++;
                return;
            }
            this.method248(var4, arg0, -2);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(CB)I")
    public final int method252(char arg0, byte arg1) {
        field487++;
        if (this.field491 == null) {
            return -1;
        } else if (arg1 == -79) {
            for (int var3 = 0; var3 < this.field491.length; var3++) {
                if (this.field485[var3] == arg0) {
                    return this.field491[var3];
                }
            }
            return -1;
        } else {
            return -16;
        }
    }
}
