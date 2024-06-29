import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class260 extends IOException {

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field3536 = 0;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "[I")
    public static int[] field3534 = new int[25];

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "Lqk;")
    public static class148 field3533 = new class148(100, 2);

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field3538 = -1;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)Lbc;", line = 3)
    public static final class330 method1615(int arg0, int arg1) {
        if (arg1 == -1) {
            field3535++;
            return arg0 >= 0 && arg0 < 100 ? class290.field3804[arg0] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V", line = 20)
    public static final void method1616(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        if (var3 != null) {
            class481.method2836(var3.field532);
            if (var3.field532 != null) {
                var3.field532 = null;
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(JB)V", line = 33)
    public static final void method1617(long arg0, byte arg1) {
        if (arg1 > -38) {
            return;
        }
        field3537++;
        int var3 = class264.field3603;
        if (class595.field8572 != var3) {
            int var4 = var3 - class595.field8572;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class595.field8572 += var5;
        }
        int var6 = class668.field9412;
        class403.field5597 += (float) arg0 * class675.field9508 / 40.0F * 8.0F;
        class223.field3131 += (float) arg0 * class196.field2836 / 40.0F * 8.0F;
        if (class128.field1755 != var6) {
            int var7 = var6 - class128.field1755;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class128.field1755 += var8;
        }
        class143.method935(-41);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 114)
    public class260(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 118)
    public static void method1618(int arg0) {
        field3534 = null;
        if (arg0 != -101) {
            field3536 = 32;
        }
        field3533 = null;
    }
}
