import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class264 implements Runnable {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Z")
    public boolean field4598 = true;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field4597 = new Object();

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field4606 = 0;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
    public int[] field4607 = new int[500];

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[I")
    public int[] field4608 = new int[500];

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Ldg;")
    public static class276 field4599 = new class276(50);

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Z")
    public static boolean field4602 = false;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lvf;")
    public static class265 field4605 = class87.method582(-46, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "[I")
    public static int[] field4604;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method1760(byte arg0) {
        if (arg0 == 98) {
            field4604 = null;
            field4605 = null;
            field4599 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "run", descriptor = "()V")
    public final void run() {
        field4603++;
        while (this.field4598) {
            Object var1 = this.field4597;
            synchronized (this.field4597) {
                if (this.field4606 < 500) {
                    this.field4607[this.field4606] = class79.field1497;
                    this.field4608[this.field4606] = class268.field4722;
                    this.field4606++;
                }
            }
            class19.method136(1, 50L);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lfl;I)V")
    public static final void method1761(class192 arg0, int arg1) {
        if (arg1 != 0) {
            method1761((class192) null, 101);
        }
        field4596++;
        class197.field3518 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
    public static final void method1762(int arg0, int arg1, int arg2) {
        field4600++;
        class48 var3 = class122.method817((byte) -74, arg2);
        int var4 = var3.field1030;
        int var5 = var3.field1024;
        int var6 = var3.field1028;
        int var7 = class230.field4061[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        if (arg0 != 500) {
            method1762(-110, 33, -35);
        }
        class1.method11((byte) -93, var4, ~var8 & class182.field3228[var4] | arg1 << var5 & var8);
    }
}
