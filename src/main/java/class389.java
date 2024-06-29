import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class389 extends class269 {

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Luv;")
    public static class2 field5861 = new class2(42, 3);

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field5863 = 0;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "Ll;")
    public static class127 field5862;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "Ljm;")
    public static class210 field5857;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public static final void method2331(int arg0) {
        field5859++;
        int var1 = class146.field2203;
        int[] var2 = class457.field6694;
        for (int var3 = 0; var3 < var1; var3++) {
            class480 var7 = class83.field1327[var2[var3]];
            if (var7 != null && var7.field6010 > 0) {
                var7.field6010--;
                if (var7.field6010 == 0) {
                    var7.field6007 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < class519.field7609; var4++) {
            int var5 = class327.field5114[var4];
            class351 var6 = class88.field1375[var5];
            if (var6 != null && var6.field6010 > 0) {
                var6.field6010--;
                if (var6.field6010 == 0) {
                    var6.field6007 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IJ)V")
    public static final void method2332(int arg0, long arg1) {
        field5860++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class170.method1176((byte) 119, arg1 - 1L);
            class170.method1176((byte) 18, 1L);
        } else {
            class170.method1176((byte) 42, arg1);
        }
        int var3 = 12 / ((arg0 + 54) / 42);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public static void method2333(int arg0) {
        field5857 = null;
        if (arg0 > -21) {
            field5863 = -41;
        }
        field5862 = null;
        field5861 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lgk;I)Lhg;")
    public static final class370 method2334(class468 arg0, int arg1) {
        field5858++;
        if (arg1 != -26956) {
            field5861 = null;
        }
        return new class370(arg0.method2745(-1), arg0.method2745(-1), arg0.method2745(arg1 + 26955), arg0.method2745(-1), arg0.method2759(1919914864), arg0.method2759(1919914864), arg0.method2765(96));
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Llf;")
    public static final class512 method2335(int arg0, int arg1, int arg2) {
        class306 var3 = class236.field3305[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4582;
    }
}
