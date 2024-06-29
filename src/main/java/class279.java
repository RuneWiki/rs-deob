import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class279 {

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field3793 = 0;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "Lmg;")
    public static class530 field3799 = new class530();

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "Ljava/lang/String;")
    public String field3796;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIII)Ldc;", line = 3)
    public static final class16 method1613(int arg0, int arg1, int arg2, int arg3) {
        field3798++;
        if (arg2 != 0) {
            return null;
        }
        class532 var4 = class103.field1632[arg3][arg0][arg1];
        if (var4 == null) {
            return null;
        }
        class16 var5 = null;
        int var6 = -1;
        for (class201 var7 = var4.field7828; var7 != null; var7 = var7.field2918) {
            class434 var8 = var7.field2915;
            if (var8 instanceof class16) {
                class16 var9 = (class16) var8;
                int var10 = (var9.method116(8569) - 1) * 64 + 60;
                int var11 = var9.field6284 - var10 >> 7;
                int var12 = var9.field6287 - var10 >> 7;
                int var13 = var9.field6284 + var10 >> 7;
                int var14 = var9.field6287 + var10 >> 7;
                if (var11 <= arg0 && var12 <= arg1 && var13 >= arg0 && arg1 <= var14) {
                    int var15 = (var13 + 1 - arg0) * (var14 + 1 - arg1);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BII)Z", line = 68)
    public static final boolean method1614(byte arg0, int arg1, int arg2) {
        if (arg0 > -79) {
            method1615((byte) -127);
        }
        field3794++;
        return false;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V", line = 79)
    public static final void method1615(byte arg0) {
        if (arg0 < 93) {
            method1616(null, true);
        }
        field3791++;
        if (class494.field7155 == 6) {
            class384.method2276(0, false);
        } else if (class492.field7133 > 0) {
            class384.method2276(0, class527.field7689);
        } else {
            class412.field5875 = class104.field1702;
            class104.field1702 = null;
            class63.method421(12, true);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lsv;Z)Lst;", line = 109)
    public static final class104 method1616(class319 arg0, boolean arg1) {
        field3795++;
        if (!arg1) {
            method1617(-75, (byte) -48);
        }
        class104 var2 = new class104();
        var2.field1706 = arg0.method1844(-113);
        var2.field1709 = class188.field2772.method1387((byte) 109, var2.field1706);
        return var2;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IB)I", line = 131)
    public static final int method1617(int arg0, byte arg1) {
        field3797++;
        if (arg1 <= 98) {
            method1614((byte) -107, 7, -124);
        }
        return arg0 == 16711935 ? -1 : class353.method2117(8, arg0);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)V", line = 146)
    public static void method1618(byte arg0) {
        int var1 = 18 / ((63 - arg0) / 58);
        field3799 = null;
    }
}
