import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class195 extends class287 {

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "Lmh;")
    public static class128 field3427 = class22.method156(126, "");

    @OriginalMember(owner = "client!og", name = "A", descriptor = "Lmh;")
    public static class128 field3430 = class22.method156(125, ")0");

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Z")
    public static boolean field3424;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lbg;IB)Lmh;", line = 4)
    public static final class128 method1355(class194 arg0, int arg1, byte arg2) {
        field3429++;
        try {
            class128 var3 = new class128();
            var3.field2181 = arg0.method1345((byte) 33);
            if (arg1 < var3.field2181) {
                var3.field2181 = arg1;
            }
            var3.field2224 = new byte[var3.field2181];
            int var4 = -40 / ((arg2 + 60) / 59);
            arg0.field3380 += class263.field4554.method574(arg0.field3417, 0, arg0.field3380, false, var3.field2224, var3.field2181);
            return var3;
        } catch (Exception var6) {
            return class152.field2622;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 40)
    public static final void method1356(int arg0) {
        field3421++;
        int var1 = -107 % ((3 - arg0) / 42);
        class88.method547(-1741557305);
        System.gc();
        class298.method2039((byte) -52, 25);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILdj;)[Lvd;", line = 53)
    public static final class127[] method1357(int arg0, int arg1, class314 arg2) {
        if (arg1 != 24508) {
            field3427 = (class128) null;
        }
        field3425++;
        return class285.method1972(arg0, arg2, -128) ? class306.method2092(4) : null;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V", line = 68)
    public static void method1358(int arg0) {
        field3427 = null;
        field3430 = null;
        int var1 = -17 % ((64 - arg0) / 43);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V", line = 84)
    public static final void method1359(boolean arg0) {
        class246.field4195.method1834(17);
        field3428++;
        if (arg0) {
            class264.field4573.method1834(17);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(II)V", line = 100)
    public class195(int arg0, int arg1) {
        this.field3426 = arg0;
        this.field3422 = arg1;
    }
}
