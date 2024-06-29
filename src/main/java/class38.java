import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class38 extends class261 {

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    private int field581 = 585;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "Ldm;")
    public static class273 field584 = null;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "[[[I")
    public static int[][][] field582;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "[[[I")
    public static int[][][] field585;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Ltd;", line = 14)
    public static final class229 method225(int arg0, int arg1) {
        class229 var2 = (class229) class22.field345.method58(0, (long) arg1);
        field586++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class249.field4168.method636(1, (byte) 122, arg1);
        } else {
            var3 = class68.field1013.method636(1, (byte) 108, arg1 & 0x7FFF);
        }
        if (arg0 != 1) {
            field584 = (class273) null;
        }
        class229 var4 = new class229();
        if (var3 != null) {
            var4.method1596(new class70(var3), true);
        }
        if (arg1 >= 32768) {
            var4.method1594(0);
        }
        class22.field345.method63(0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)[I", line = 47)
    public final int[] method21(byte arg0, int arg1) {
        int[] var3 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int var4 = class20.field324[arg1];
            for (int var5 = 0; var5 < class92.field1576; var5++) {
                int var6 = class245.field4120[var5];
                if (this.field581 < var6 && (4096 - this.field581) > var6 && 2048 - this.field581 < var4 && var4 < (this.field581 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field581);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field581 && var6 < this.field581 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field581;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field581);
                } else if (this.field581 > var4 || var4 > 4096 - this.field581) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field581;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field581);
                } else if (var6 >= this.field581 && var6 <= 4096 - this.field581) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field581);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        field589++;
        int var23 = -34 / ((-arg0 - 49) / 33);
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 124)
    public class38() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 139)
    public static final void method226(int arg0) {
        field583++;
        if (arg0 != -710) {
            field582 = (int[][][]) ((int[][][]) null);
        }
        if (class166.field2795 == 2) {
            if (class9.field126 == class251.field4239 && class197.field3306 == class196.field3236) {
                class166.field2795 = 0;
                class271.method1893((byte) -128, class136.field2272 - 1);
            }
        } else if (class251.field4239 == class184.field2973 && class197.field3306 == class115.field1953) {
            class166.field2795 = 0;
            class271.method1893((byte) -128, class136.field2272 - 1);
        } else {
            class9.field126 = class184.field2973;
            class166.field2795 = 2;
            class196.field3236 = class115.field1953;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(Z)V", line = 186)
    public static void method227(boolean arg0) {
        field585 = (int[][][]) null;
        field582 = (int[][][]) null;
        field584 = null;
        if (arg0) {
            field584 = (class273) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lpb;BI)V", line = 198)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field587++;
        if (arg2 == 0) {
            this.field581 = arg0.method423(255);
        }
        if (arg1 >= -115) {
            method228(-114, -51, -28);
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(III)I", line = 226)
    public static final int method228(int arg0, int arg1, int arg2) {
        int var3 = class53.method323(arg2 - 1, arg0 + -1, 57) - (-class53.method323(arg2 + 1, arg0 + -1, 57) - class53.method323(arg2 - 1, arg0 + 1, 57) - class53.method323(arg2 + 1, arg0 + 1, 57));
        field588++;
        int var4 = class53.method323(arg2 - 1, arg0, 57) + (class53.method323(arg2 + 1, arg0, 57) - (-class53.method323(arg2, arg0 - 1, 57) - class53.method323(arg2, arg0 + 1, 57)));
        if (arg1 > -105) {
            method226(72);
        }
        int var5 = class53.method323(arg2, arg0, 57);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }
}
