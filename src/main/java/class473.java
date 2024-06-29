import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class473 extends class139 {

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
    private int field6646 = 0;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    private int field6650 = 0;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    private int field6647 = 20;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    private int field6649 = 1365;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "Ldk;")
    public static class326 field6651 = new class326("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "[I")
    public static int[] field6653 = new int[25];

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "Lwf;")
    public static class79 field6654 = new class79(58, 8);

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
    public class473() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
    public static final void method2777(int arg0) {
        ++field6648;
        try {
            if (~class327.field4741 == -2) {
                int var1 = class330.field4781.method778(18497);
                if (var1 > 0 && class330.field4781.method753(arg0 ^ -29713)) {
                    int var2 = var1 - class70.field883;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class330.field4781.method776(var2, false);
                    return;
                }
                class330.field4781.method766((byte) -119);
                class330.field4781.method779(true);
                if (client.field2623 != null) {
                    class327.field4741 = 2;
                } else {
                    class327.field4741 = 0;
                }
                class132.field1744 = null;
                class24.field311 = null;
            }
            if (arg0 != 29712) {
                method2778((byte) 122);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class330.field4781.method766((byte) -126);
            class132.field1744 = null;
            class24.field311 = null;
            class327.field4741 = 0;
            client.field2623 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(B)V")
    public static void method2778(byte arg0) {
        field6654 = null;
        if (arg0 != 94) {
            method2777(-45);
        }
        field6651 = null;
        field6653 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field6650 = arg0.method1729(65280);
                    }
                } else {
                    this.field6646 = arg0.method1729(arg1 + 65325);
                }
            } else {
                this.field6647 = arg0.method1729(65280);
            }
        } else {
            this.field6649 = arg0.method1729(65280);
        }
        if (arg1 == -45) {
            ++field6652;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            return null;
        } else {
            ++field6655;
            int[] var3 = super.field1844.method2176(arg0, 0);
            if (super.field1844.field5045) {
                for (int var4 = 0; ~var4 > ~class356.field5147; ++var4) {
                    int var5 = (class216.field3245[var4] << 12) / this.field6649 + this.field6646;
                    int var6 = (class237.field3559[arg0] << 12) / this.field6649 + this.field6650;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 - -var12) > -16385 && ~var13 > ~this.field6647) {
                        var10 = (var9 * var10 >> 12) * 2 - -var8;
                        var9 = var11 - var12 + var7;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = ~(this.field6647 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field6647;
                }
            }
            return var3;
        }
    }
}
