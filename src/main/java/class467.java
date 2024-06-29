import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class467 extends class311 {

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[I")
    public int[] field6581;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "[I")
    public int[] field6577;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
    public static int[] field6572 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field6573 = 0;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field6579 = 64;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "J")
    public static long field6578 = 0L;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field6580 = 0;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static void method2815(int arg0) {
        field6572 = null;
        int var1 = -89 / ((arg0 - 8) / 39);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIB)B")
    public static final byte method2816(int arg0, int arg1, byte arg2) {
        if (arg2 != 92) {
            method2817(-20);
        }
        field6576++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)[Luq;")
    public static final class142[] method2817(int arg0) {
        field6575++;
        if (class638.field9310 == null) {
            class142[] var1 = class106.method788(class442.field5896, -24188);
            class142[] var2 = new class142[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class142 var8 = var1[var4];
                if ((var8.field1995 <= 0 || var8.field1995 >= 24) && var8.field2003 >= 800 && var8.field1999 >= 600 && (field6579 >= 96 || class526.field7533 != 0 || var8.field2003 <= 1024 && var8.field1999 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class142 var10 = var2[var9];
                        if (var8.field2003 == var10.field2003 && var8.field1999 == var10.field1999) {
                            if (var10.field1995 < var8.field1995) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class638.field9310 = new class142[var3];
            class648.method3738(var2, 0, class638.field9310, 0, var3);
            int[] var5 = new int[class638.field9310.length];
            for (int var6 = 0; var6 < class638.field9310.length; var6++) {
                class142 var7 = class638.field9310[var6];
                var5[var6] = var7.field2003 * var7.field1999;
            }
            class592.method3512(class638.field9310, var5, arg0 + 1164);
        }
        if (arg0 != -1164) {
            field6573 = 120;
        }
        return class638.field9310;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IC)Z")
    public static final boolean method2818(int arg0, char arg1) {
        if (arg0 < 24) {
            field6580 = 40;
        }
        field6574++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class360.field4900;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II[I[I)V")
    public class467(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field6581 = arg3;
        this.field6577 = arg2;
    }
}
