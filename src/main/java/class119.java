import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class119 {

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1551 = new Rectangle[100];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1552++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lqa;Lse;III)V")
    public static final void method729(class167 arg0, class198 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class331.field4909) {
            class415 var5 = class526.field7777[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field5976 != null && var5.field5976.method167(true)) {
                arg1.method160(0, arg0, -4, 0, true, var5.field5976, class177.field2692);
            }
        }
        if (arg4 < class331.field4909) {
            class415 var6 = class526.field7777[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field5976 != null && var6.field5976.method167(true)) {
                arg1.method160(class177.field2692, arg0, -4, 0, true, var6.field5976, 0);
            }
        }
        if (arg3 < class331.field4909 && arg4 < class366.field5271) {
            class415 var7 = class526.field7777[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field5976 != null && var7.field5976.method167(true)) {
                arg1.method160(class177.field2692, arg0, -4, 0, true, var7.field5976, class177.field2692);
            }
        }
        if (arg3 < class331.field4909 && arg4 > 0) {
            class415 var8 = class526.field7777[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field5976 != null && var8.field5976.method167(true)) {
                arg1.method160(-class177.field2692, arg0, -4, 0, true, var8.field5976, class177.field2692);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BIZ)V")
    public static final void method730(byte[] arg0, int arg1, boolean arg2) {
        field1549++;
        if (arg1 != -4264) {
            field1551 = null;
        }
        if (class483.field7336 == null) {
            class483.field7336 = new class428(20000);
        }
        class483.field7336.method2612(23958, arg0.length, arg0, 0);
        if (!arg2) {
            return;
        }
        class415.method2475(class483.field7336.field6162, 1);
        class626.field9173 = new class418[class156.field1992];
        int var3 = 0;
        for (int var4 = class580.field8547; var4 <= class481.field7296; var4++) {
            class418 var5 = class627.method3658(var4, false);
            if (var5 != null) {
                class626.field9173[var3++] = var5;
            }
        }
        class346.field5041 = false;
        class281.field4179 = class450.method2719((byte) 119);
        class483.field7336 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)[Lql;")
    public static final class155[] method731(int arg0) {
        field1547++;
        if (class203.field3026 == null) {
            class155[] var1 = class455.method2732(arg0 ^ 0x62, class328.field4850);
            class155[] var2 = new class155[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class155 var8 = var1[var4];
                if ((var8.field1985 <= 0 || var8.field1985 >= 24) && var8.field1981 >= 800 && var8.field1982 >= 600 && (class223.field3276 >= 96 || class239.field3499 != 0 || var8.field1981 <= 1024 && var8.field1982 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class155 var10 = var2[var9];
                        if (var8.field1981 == var10.field1981 && var8.field1982 == var10.field1982) {
                            if (var8.field1985 > var10.field1985) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class203.field3026 = new class155[var3];
            class473.method2882(var2, 0, class203.field3026, 0, var3);
            int[] var5 = new int[class203.field3026.length];
            for (int var6 = 0; var6 < class203.field3026.length; var6++) {
                class155 var7 = class203.field3026[var6];
                var5[var6] = var7.field1982 * var7.field1981;
            }
            class137.method840(var5, 0, class203.field3026);
        }
        if (arg0 != -97) {
            field1551 = null;
        }
        return class203.field3026;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
    public static final int method732(int arg0, int arg1) {
        field1548++;
        if (arg0 != 17225) {
            method731(-81);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method733(int arg0) {
        field1551 = null;
        if (arg0 <= 122) {
            method729(null, null, 124, -97, -95);
        }
    }
}
