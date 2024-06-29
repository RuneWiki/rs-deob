import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class233 extends class269 {

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZIII)I")
    public static final int method1405(boolean arg0, int arg1, int arg2, int arg3) {
        field3527++;
        class148 var4 = class432.method2655((byte) 121, arg0, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field2049.length > arg2) {
            if (arg1 != 0) {
                method1406(-97, 22);
            }
            return var4.field2049[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(IIII)V")
    public class233(int arg0, int arg1, int arg2, int arg3) {
        this.field3528 = arg1;
        this.field3525 = arg0;
        this.field3524 = arg2;
        this.field3526 = arg3;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
    public static final void method1406(int arg0, int arg1) {
        if (arg1 == 0) {
            field3523++;
            class32 var2 = class136.method854(3, (byte) 88, arg0);
            var2.method192(-17451);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLje;)I")
    public static final int method1407(byte arg0, class169 arg1) {
        int var2 = 58 / ((22 - arg0) / 58);
        field3521++;
        int var3 = arg1.field2420;
        class433 var4 = arg1.method902(26647);
        if (arg1.field1933) {
            var3 = arg1.field2466;
        } else if (arg1.field1936 == var4.field6357 || arg1.field1936 == var4.field6358 || arg1.field1936 == var4.field6369 || arg1.field1936 == var4.field6361) {
            var3 = arg1.field2455;
        } else if (arg1.field1936 == var4.field6367 || arg1.field1936 == var4.field6386 || arg1.field1936 == var4.field6384 || arg1.field1936 == var4.field6353) {
            var3 = arg1.field2421;
        }
        return var3;
    }
}
