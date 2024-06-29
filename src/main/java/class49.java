import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class49 extends RuntimeException {

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field760;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Ljava/lang/String;")
    public String field758;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
    public static int[] field755 = new int[25];

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[I")
    public static int[] field757 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field763 = 0;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field764 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III[[III)I", line = 13)
    public static final int method452(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
        if (arg5 != -11908) {
            field764 = (BigInteger) null;
        }
        field761++;
        int var6 = (128 - arg4) * arg3[arg2][arg1] + arg3[arg2 + 1][arg1] * arg4 >> 7;
        int var7 = (128 - arg4) * arg3[arg2][arg1 + 1] + (arg3[arg2 + 1][arg1 + 1] * arg4) >> 7;
        return (128 - arg0) * var6 + arg0 * var7 >> 7;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 29)
    public static final void method453(int arg0) {
        field759++;
        if (arg0 != -3) {
            method457(-46, 70, -78, 65, -120);
        }
        class208.method1485(arg0 + 131, false);
        System.gc();
        class113.method889(114, 25);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 44)
    public static final void method454(byte arg0) {
        if (class175.field2588 > class79.field1111) {
            class79.field1111 = (float) ((double) class79.field1111 / 30.0D + (double) class79.field1111);
            if (class175.field2588 < class79.field1111) {
                class79.field1111 = class175.field2588;
            }
            class62.method546(-105);
        } else if (class79.field1111 > class175.field2588) {
            class79.field1111 = (float) ((double) class79.field1111 - (double) class79.field1111 / 30.0D);
            if (class79.field1111 < class175.field2588) {
                class79.field1111 = class175.field2588;
            }
            class62.method546(-106);
        }
        int var1 = -13 / ((arg0 - 62) / 52);
        if (class257.field3832 != -1 && class45.field713 != -1) {
            int var2 = class257.field3832 - class12.field136;
            int var3 = class45.field713 - class241.field3631;
            if (var3 < 2 || var3 > 2) {
                var3 >>= 0x4;
            }
            class241.field3631 += var3;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var2 == 0 && var3 == 0) {
                class45.field713 = -1;
                class257.field3832 = -1;
            }
            class12.field136 += var2;
            class62.method546(-126);
        }
        field754++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V", line = 99)
    public static final void method455(int arg0, int arg1) {
        class307.field4788.method1429((byte) 127, arg1);
        class106.field1623.method1429((byte) 127, arg1);
        field756++;
        if (arg0 != 4) {
            method452(89, -92, 25, (int[][]) ((int[][]) null), -127, -32);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 111)
    public static void method456(byte arg0) {
        field764 = null;
        field755 = null;
        if (arg0 < 35) {
            field757 = (int[]) null;
        }
        field757 = null;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 129)
    public class49(Throwable arg0, String arg1) {
        this.field760 = arg0;
        this.field758 = arg1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 145)
    public static final void method457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -29605) {
            return;
        }
        if (arg4 >= arg2) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class320.field4990[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class320.field4990[var6][arg3] = arg1;
            }
        }
        field762++;
    }
}
