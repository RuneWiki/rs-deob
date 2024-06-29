import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class239 extends class28 {

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public int field4171 = 0;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "Lvf;")
    public static class265 field4170 = null;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "[I")
    public static int[] field4178 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field4176 = -1;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "Lak;")
    public static class269 field4173 = new class269(512);

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "Lvf;")
    public static class265 field4182 = class87.method582(-46, "; Expires=");

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "Lvf;")
    public static class265 field4183 = class87.method582(-46, "T");

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "J")
    public static volatile long field4181 = 0L;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public static void method1596(int arg0) {
        field4183 = null;
        field4170 = null;
        field4173 = null;
        field4178 = null;
        field4182 = null;
        int var1 = 73 / ((35 - arg0) / 55);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
    public static final void method1597(byte arg0, int arg1) {
        if (arg0 == -28) {
            field4177++;
            class178 var2 = class188.method1282(arg1, 5, 261360480);
            var2.method1160(118);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public static final void method1598(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1596(71);
        }
        field4169++;
        if (class105.field1868 != 0 && arg2 != -1) {
            class171.method1131(0, false, 10000, arg2, class147.field2748, class105.field1868);
            class112.field1964 = true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIILba;)V")
    public static final void method1599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6) {
        if (arg4 != 4456) {
            method1598(2, 68, 127);
        }
        field4180++;
        class260.method1731(arg2, arg0, arg3, arg1, arg5, (byte) -6, arg6.field2600, arg6.field2564);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)Lte;")
    public static final class251 method1600(boolean arg0, int arg1) {
        field4174++;
        class251 var2 = (class251) class82.field1538.method1887(116, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class73.field1414.method1332(arg0, 0, arg1);
        class251 var4 = new class251(var3);
        var4.method764(class97.field1714, (int[]) null);
        class82.field1538.method1892(var4, (long) arg1, (byte) 10);
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILng;I)V")
    private final void method1601(int arg0, class135 arg1, int arg2) {
        if (arg0 != 14305) {
            field4178 = null;
        }
        field4175++;
        if (arg2 == 2) {
            this.field4171 = arg1.method927(arg0 ^ 0x379F);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILng;)V")
    public final void method1602(int arg0, class135 arg1) {
        field4179++;
        while (true) {
            int var3 = arg1.method920((byte) 113);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    method1598(-59, -66, -36);
                    return;
                }
            }
            this.method1601(14305, arg1, var3);
        }
    }
}
