import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class81 extends class363 {

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field1055 = 1;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "Lcga;")
    public static class449 field1050 = new class449(60, -1);

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "[Lsm;")
    public class264[] field1045;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "[[B")
    private byte[][] field1047;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V")
    public static final void method616(int arg0) {
        field1046++;
        if (arg0 != 10522) {
            field1050 = null;
        }
        class448 var1 = null;
        try {
            var1 = class476.method2591(arg0 - 23594, "2");
            class572 var2 = new class572(class383.field4924 * 6 + 3);
            var2.method3090(1, 3);
            var2.method3080((byte) -50, class383.field4924);
            for (int var3 = 0; var3 < class500.field6238.length; var3++) {
                if (class656.field8925[var3]) {
                    var2.method3080((byte) -98, var3);
                    var2.method3061(class500.field6238[var3], (byte) 115);
                }
            }
            var1.method2449(var2.field7318, var2.field7313, (byte) 63, 0);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2451(true);
            }
        } catch (Exception var4) {
        }
        class141.field1689 = class321.method1854(-114);
        class290.field3668 = false;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static void method617(byte arg0) {
        int var1 = -123 % ((23 - arg0) / 55);
        field1050 = null;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
    public static final void method618(boolean arg0) {
        class539.field6796 = new class333();
        field1048++;
        if (arg0) {
            method621(-36);
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)Z")
    public final boolean method619(int arg0, int arg1) {
        if (arg0 < 45) {
            this.field1051 = -46;
        }
        field1054++;
        return this.field1045[arg1].field3332;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILe;ILjava/awt/Canvas;)Loa;")
    public static final class650 method620(int arg0, class498 arg1, int arg2, Canvas arg3) {
        if (arg2 != 1) {
            method621(-56);
        }
        field1052++;
        return new class576(arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V")
    public static final void method621(int arg0) {
        field1056++;
        class125.field1528 = null;
        class210.field2486 = null;
        if (arg0 != 0) {
            field1055 = 66;
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)Z")
    public final boolean method622(byte arg0) {
        field1044++;
        if (this.field1045 != null) {
            return true;
        }
        if (this.field1047 == null) {
            if (!class557.field6973.method1662(this.field1051, -110)) {
                return false;
            }
            int[] var2 = class557.field6973.method1639(this.field1051, arg0 ^ 0xBB6);
            this.field1047 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1047[var3] = class557.field6973.method1659(111, var2[var3], this.field1051);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field1047.length; var5++) {
            byte[] var15 = this.field1047[var5];
            class572 var16 = new class572(var15);
            var16.field7313 = 1;
            int var17 = var16.method3031(-1);
            var4 &= class395.field5030.method1669((byte) -79, var17);
        }
        if (arg0 != -21) {
            this.field1045 = null;
        }
        if (!var4) {
            return false;
        }
        class333 var6 = new class333();
        int var7 = class557.field6973.method1655(this.field1051, (byte) -82);
        this.field1045 = new class264[var7];
        int[] var8 = class557.field6973.method1639(this.field1051, -2979);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field1047[var9];
            class572 var11 = new class572(var10);
            var11.field7313 = 1;
            int var12 = var11.method3031(-1);
            class465 var13 = null;
            for (class465 var14 = (class465) var6.method1909(true); var14 != null; var14 = (class465) var6.method1916((byte) 96)) {
                if (var14.field5770 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class465(var12, class395.field5030.method1648(-89, var12));
                var6.method1904(var13, arg0 ^ 0x18);
            }
            this.field1045[var8[var9]] = new class264(var10, var13);
        }
        this.field1047 = null;
        return true;
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(II)Z")
    public final boolean method623(int arg0, int arg1) {
        field1053++;
        int var3 = 5 / ((arg0 - 29) / 35);
        return this.field1045[arg1].field3334;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
    public class81(int arg0) {
        this.field1051 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(II)Z")
    public final boolean method624(int arg0, int arg1) {
        field1049++;
        if (arg0 != 1) {
            method621(93);
        }
        return this.field1045[arg1].field3326;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lpv;IIIII)V")
    public static final void method625(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field794 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field797[var6] != null) {
                arg0.field794++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field794; var7++) {
            long var8 = class189.field2250[arg1][arg2][arg3];
            while (var8 != 0L) {
                class660 var14 = class370.field4785[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field797[var7] == var14.field8960) {
                    continue label50;
                }
            }
            long var10 = class189.field2250[arg1][arg4][arg5];
            while (var10 != 0L) {
                class660 var13 = class370.field4785[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field797[var7] == var13.field8960) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field794 - 1; var12++) {
                arg0.field797[var12] = arg0.field797[var12 + 1];
            }
            arg0.field794--;
        }
    }
}
