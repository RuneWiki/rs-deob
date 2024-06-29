import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class261 extends class627 implements class122 {

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "[I")
    public static int[] field3311 = new int[2048];

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "Lsea;")
    public static class399 field3313 = new class399();

    @OriginalMember(owner = "client!bha", name = "x", descriptor = "I")
    public static int field3319 = 0;

    @OriginalMember(owner = "client!bha", name = "v", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "C")
    public char field3310;

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!bha", name = "s", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!bha", name = "u", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!bha", name = "y", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!bha", name = "z", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!bha", name = "t", descriptor = "J")
    public long field3315;

    @OriginalMember(owner = "client!bha", name = "w", descriptor = "Lwc;")
    public static class376 field3318;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1580(boolean arg0) {
        field3313 = null;
        field3318 = null;
        if (arg0) {
            field3313 = null;
        }
        field3311 = null;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1581(int arg0, int arg1) {
        if (arg1 >= -93) {
            method1581(-106, 94);
        }
        if (arg0 == 37) {
            class341.field4414 = 3.0F;
        } else if (arg0 == 50) {
            class341.field4414 = 4.0F;
        } else if (arg0 == 75) {
            class341.field4414 = 6.0F;
        } else if (arg0 == 100) {
            class341.field4414 = 8.0F;
        } else if (arg0 == 200) {
            class341.field4414 = 16.0F;
        }
        class345.field4470 = -1;
        field3309++;
        class345.field4470 = -1;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)I", line = 50)
    public final int method799(byte arg0) {
        if (arg0 != 112) {
            this.method799((byte) 112);
        }
        field3306++;
        return this.field3308;
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)I", line = 64)
    public final int method800(int arg0) {
        int var2 = 40 / ((arg0 - 67) / 50);
        field3305++;
        return this.field3321;
    }

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)I", line = 75)
    public final int method802(int arg0) {
        if (arg0 == -20069) {
            field3312++;
            return this.field3314;
        } else {
            return -70;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)C", line = 86)
    public final char method798(int arg0) {
        if (arg0 != -17654) {
            method1582(73);
        }
        field3316++;
        return this.field3310;
    }

    @OriginalMember(owner = "client!bha", name = "e", descriptor = "(I)V", line = 105)
    public static final void method1582(int arg0) {
        field3307++;
        int var1 = 69 / ((59 - arg0) / 53);
        if (class73.field960 == null) {
            return;
        }
        for (int var2 = 0; var2 < class73.field960.length; var2++) {
            for (int var3 = 0; var3 < class73.field960[var2].length; var3++) {
                class73.field960[var2][var3] = class636.field8805;
            }
        }
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)J", line = 145)
    public final long method801(byte arg0) {
        field3320++;
        int var2 = -61 / ((-arg0 - 32) / 43);
        return this.field3315;
    }
}
