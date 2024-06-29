import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class44 extends class87 {

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    private int field572 = 4096;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    private int field581 = 4096;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    private int field585 = 4096;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field580 = 0;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field584 = 0;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "[I")
    public static int[] field573 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field587 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "Lsi;")
    public static class230 field586 = new class230();

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "[Z")
    public static boolean[] field578;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            this.method40((class53) null, 87, 57);
        }
        ++field582;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field581 = arg0.method331(arg2 ^ -25634);
                }
            } else {
                this.field585 = arg0.method331(-81);
            }
        } else {
            this.field572 = arg0.method331(-4);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static final void method266(boolean arg0) {
        class195.field2878.method1420((byte) 109);
        class159.field2467.method1420((byte) 12);
        class211.field3110.method1420((byte) 116);
        class299.field4823.method1420((byte) -10);
        ++field574;
        if (arg0) {
            field587 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V")
    public static void method267(int arg0) {
        if (arg0 != -25216) {
            field586 = null;
        }
        field587 = null;
        field578 = null;
        field573 = null;
        field586 = null;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class44() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)V")
    public static final void method268(int arg0) {
        ++field583;
        if (!class119.field1937 && class113.field1868 != 2) {
            try {
                class150.method1120(class91.field1466, false, "tbrefresh");
                int var1 = -11 % ((arg0 - 80) / 44);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)Lqa;")
    public static final class98 method269(int arg0, int arg1) {
        ++field579;
        class98 var2 = (class98) class40.field531.method1418((long) arg0, arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class65.field986.method1868(arg0, 29, arg1 ^ 1);
            class98 var4 = new class98();
            if (var3 != null) {
                var4.method770((byte) -95, new class53(var3), arg0);
            }
            class40.field531.method1421((long) arg0, var4, (byte) 111);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field577;
        int[][] var3 = super.field1390.method1902(-110, arg0);
        if (super.field1390.field4428) {
            int[][] var4 = this.method648(arg0, -109, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class206.field3032 < ~var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var12 == ~var14) {
                    var8[var11] = this.field572 * var13 >> 12;
                    var10[var11] = this.field585 * var12 >> 12;
                    var9[var11] = this.field581 * var14 >> 12;
                } else {
                    var8[var11] = this.field572;
                    var10[var11] = this.field585;
                    var9[var11] = this.field581;
                }
            }
        }
        if (arg1 != 6) {
            method266(true);
        }
        return var3;
    }
}
