import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class322 {

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lch;")
    public class463 field4450;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field4451;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lgda;")
    public static class53 field4449 = new class53(46, 3);

    @OriginalMember(owner = "client!db", name = "i", descriptor = "F")
    public static float field4455 = 1.0F;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lqfa;")
    public static class98 field4452 = new class98(99, 2);

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[C")
    public static char[] field4457 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Loia;")
    public static class88 field4456;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    public abstract int method19(int arg0, int arg1);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Z")
    public static final boolean method2073(int arg0) {
        field4448++;
        boolean var1 = true;
        if (class727.field10177 == null) {
            if (class374.field5245.method2088(class530.field7474, 88)) {
                class727.field10177 = class204.method1247(class374.field5245, class530.field7474);
            } else {
                var1 = false;
            }
        }
        if (class192.field2564 == null) {
            if (class374.field5245.method2088(class388.field5489, arg0 ^ 0x1C8)) {
                class192.field2564 = class204.method1247(class374.field5245, class388.field5489);
            } else {
                var1 = false;
            }
        }
        if (class213.field2804 == null) {
            if (class374.field5245.method2088(class721.field10006, arg0 ^ 0x1C5)) {
                class213.field2804 = class204.method1247(class374.field5245, class721.field10006);
            } else {
                var1 = false;
            }
        }
        if (arg0 != 402) {
            method2075(-41);
        }
        if (class293.field4121 == null) {
            if (class405.field5725.method2088(class440.field6276, arg0 - 285)) {
                class293.field4121 = class228.method1422(class405.field5725, 2, class440.field6276);
            } else {
                var1 = false;
            }
        }
        if (class148.field2120 == null) {
            if (class374.field5245.method2088(class440.field6276, -124)) {
                class148.field2120 = class204.method1236(class374.field5245, class440.field6276);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4454++;
        int var8 = class24.method150(arg0, class143.field2050, false, class461.field6495);
        int var9 = class24.method150(arg7, class143.field2050, false, class461.field6495);
        int var10 = class24.method150(arg5, class71.field960, false, class549.field7665);
        int var11 = class24.method150(arg1, class71.field960, false, class549.field7665);
        int var12 = class24.method150(arg0 + arg2, class143.field2050, false, class461.field6495);
        int var13 = class24.method150(arg7 - arg2, class143.field2050, false, class461.field6495);
        for (int var14 = var8; var14 < var12; var14++) {
            class643.method3557(var10, class445.field6320[var14], (byte) 74, arg6, var11);
        }
        if (arg3 != 8222) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class643.method3557(var10, class445.field6320[var15], (byte) 76, arg6, var11);
        }
        int var16 = class24.method150(arg2 + arg5, class71.field960, false, class549.field7665);
        int var17 = class24.method150(arg1 - arg2, class71.field960, false, class549.field7665);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class445.field6320[var18];
            class643.method3557(var10, var19, (byte) 67, arg6, var16);
            class643.method3557(var16, var19, (byte) 92, arg4, var17);
            class643.method3557(var17, var19, (byte) 87, arg6, var11);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method2075(int arg0) {
        field4449 = null;
        if (arg0 < 35) {
            method2075(82);
        }
        field4457 = null;
        field4456 = null;
        field4452 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
    public abstract int method17(byte arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public abstract void method23(boolean arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
    public final void method2076(byte arg0, int arg1) {
        if (this.method19(arg1, 68) != 3) {
            this.method22(0, arg1);
        }
        if (arg0 < -107) {
            field4453++;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lch;)V")
    public class322(class463 arg0) {
        this.field4450 = arg0;
        this.field4451 = this.method17((byte) -96);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    public abstract void method22(int arg0, int arg1);

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(ILch;)V")
    public class322(int arg0, class463 arg1) {
        this.field4451 = arg0;
        this.field4450 = arg1;
    }
}
