import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class3 extends class118 {

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    private int field37 = 0;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    private int field33 = 4096;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "[[I")
    public static int[][] field40;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(ZI)I")
    public static final int method19(boolean arg0, int arg1) {
        ++field35;
        long var2 = class445.method2750(-27580);
        if (arg1 >= -115) {
            return -99;
        } else {
            for (class106 var4 = arg0 ? (class106) class456.field6773.method2296(5773) : (class106) class456.field6773.method2304(100); var4 != null; var4 = (class106) class456.field6773.method2304(100)) {
                if ((4611686018427387903L & var4.field1418) < var2) {
                    if ((4611686018427387904L & var4.field1418) != 0L) {
                        int var5 = (int) var4.field1339;
                        class287.field4375[var5] = class306.field4631[var5];
                        var4.method625((byte) -50);
                        return var5;
                    }
                    var4.method625((byte) -50);
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field38;
        if (arg0 != 1) {
            this.field37 = 53;
        }
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int[] var4 = this.method703(0, arg1, -2);
            for (int var5 = 0; ~var5 > ~class440.field6474; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field37 >= ~var6 && this.field33 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(I)V")
    public static final void method21(int arg0) {
        class265.field4045.method1482((byte) 118);
        int var1 = 59 / ((66 - arg0) / 46);
        ++field36;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
    public class3() {
        super(1, true);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILfh;)V")
    public static final void method22(int arg0, class170 arg1) {
        if (arg0 == 0) {
            ++field34;
            if (~class415.field6165 == ~arg1.field2473) {
                if (class113.field1500.field2459 == null) {
                    arg1.field2616 = 0;
                    arg1.field2604 = 0;
                } else {
                    arg1.field2620 = 150;
                    arg1.field2587 = (int) (Math.sin((double) class26.field332 / 40.0D) * 256.0D) & 2047;
                    arg1.field2606 = 5;
                    arg1.field2616 = class386.field5703;
                    arg1.field2604 = class394.method2496(-96, class113.field1500.field2459);
                    arg1.field2619 = class113.field1500.field1934;
                    arg1.field2609 = class113.field1500.field1989;
                    arg1.field2576 = class113.field1500.field1936;
                    arg1.field2489 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V")
    public static void method23(int arg0) {
        if (arg0 <= 64) {
            method22(-5, (class170) null);
        }
        field40 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field31;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field33 = arg2.method2323(arg1 + -14);
            }
        } else {
            this.field37 = arg2.method2323(-59);
        }
        if (arg1 != 1) {
            method23(-123);
        }
    }

    static {
        new class151("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field40 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
    }
}
