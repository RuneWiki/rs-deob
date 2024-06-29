import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class370 extends class179 {

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Ljava/lang/String;")
    public String field5432;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "J")
    public static long field5433 = -1L;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "[J")
    public static long[] field5439 = new long[32];

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field5438 = 0;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Lnd;")
    public static class366 field5437 = new class366(7, 15);

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method2241(byte arg0, int arg1, int arg2) {
        if (arg0 >= -70) {
            return true;
        } else {
            field5440++;
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIII)V", line = 14)
    public static final void method2242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5435++;
        int var7 = class167.method1056(class478.field7310, (byte) -127, class248.field3808, arg3);
        int var8 = class167.method1056(class478.field7310, (byte) -124, class248.field3808, arg5);
        int var9 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, arg2);
        int var10 = class167.method1056(class320.field4818, (byte) -122, class355.field5296, arg6);
        int var11 = class167.method1056(class478.field7310, (byte) -126, class248.field3808, arg0 + arg3);
        int var12 = class167.method1056(class478.field7310, (byte) -123, class248.field3808, arg5 - arg0);
        for (int var13 = var7; var13 < var11; var13++) {
            class78.method566(class69.field1212[var13], var10, arg1, arg4 - 14, var9);
        }
        int var14 = var8;
        if (arg4 != 7) {
            method2242(-120, -58, -104, 31, 68, 106, -78);
        }
        while (var14 > var12) {
            class78.method566(class69.field1212[var14], var10, arg1, -7, var9);
            var14--;
        }
        int var15 = class167.method1056(class320.field4818, (byte) -123, class355.field5296, arg2 + arg0);
        int var16 = class167.method1056(class320.field4818, (byte) -127, class355.field5296, arg6 - arg0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class69.field1212[var17];
            class78.method566(var18, var15, arg1, -7, var9);
            class78.method566(var18, var10, arg1, arg4 - 14, var16);
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 67)
    public class370() {
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLlt;)I", line = 70)
    public static final int method2243(boolean arg0, class458 arg1) {
        field5436++;
        if (!arg0) {
            return -72;
        }
        int var2 = 0;
        if (arg1.method2729(class183.field2907, -9055)) {
            var2++;
        }
        if (arg1.method2729(class255.field3883, -9055)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 98)
    public class370(String arg0, int arg1) {
        this.field5432 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)V", line = 114)
    public static void method2244(boolean arg0) {
        if (arg0) {
            field5437 = null;
            field5439 = null;
        }
    }
}
