import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class756 extends class189 {

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
    public int field10518;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "[I")
    public static int[] field10515 = new int[4];

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field10514;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
    public static int field10516;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field10517;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    public static int field10519;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I[I[I)V")
    public static final void method4201(int arg0, int[] arg1, int[] arg2) {
        field10517++;
        if (arg1 == null || arg2 == null) {
            class140.field2023 = null;
            class95.field1110 = null;
            class33.field435 = null;
            return;
        }
        class33.field435 = arg1;
        class95.field1110 = new int[arg1.length];
        if (arg0 != 19035) {
            field10515 = null;
        }
        class140.field2023 = new byte[arg1.length][][];
        for (int var3 = 0; var3 < class33.field435.length; var3++) {
            class140.field2023[var3] = new byte[arg2[var3]][];
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
    public static void method4202(int arg0) {
        field10515 = null;
        if (arg0 != 17511) {
            method4201(97, null, null);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(CI)Z")
    public static final boolean method4203(char arg0, int arg1) {
        field10513++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class506.method2994(arg0, -98)) {
            return true;
        } else {
            char[] var2 = class729.field10191;
            for (int var3 = arg1; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class181.field2417;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V")
    public static final void method4204(int arg0, int arg1) {
        class322.field4447 = 100;
        class515.field7342 = arg1;
        class106.field1270 = -1;
        if (arg0 == 29372) {
            field10516++;
            class236.field3170 = 3;
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "()V")
    public class756() {
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(JI)V")
    public static final void method4205(long arg0, int arg1) {
        field10519++;
        if ((long) arg1 >= arg0) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class399.method2496(arg0 - 1L, 52);
            class399.method2496(1L, arg1 + 52);
        } else {
            class399.method2496(arg0, arg1 + 52);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(I)V")
    public class756(int arg0) {
        this.field10518 = arg0;
    }
}
