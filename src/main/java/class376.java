import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class376 extends class260 {

    @OriginalMember(owner = "client!fha", name = "p", descriptor = "Lqe;")
    public static class465 field5260 = new class465(81, 6);

    @OriginalMember(owner = "client!fha", name = "m", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!fha", name = "n", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!fha", name = "o", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!fha", name = "q", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIII)I")
    public static final int method2358(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field5259++;
        int var5 = -50 / ((arg2 - 64) / 45);
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lgs;Z[[[BIB)Z")
    public static final boolean method2359(class43 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class336.field4756) {
            return false;
        }
        int var5 = arg0.field644 >> class440.field6142;
        int var6 = var5;
        int var7 = arg0.field648 >> class440.field6142;
        int var8 = var7;
        if (arg0 instanceof class113) {
            var6 = ((class113) arg0).field1818;
            var8 = ((class113) arg0).field1810;
            var5 = ((class113) arg0).field1814;
            var7 = ((class113) arg0).field1820;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field659 < class749.field10470 && var9 >= class78.field1471 && var9 < class345.field4857 && var10 >= class249.field3503 && var10 < class63.field1152) {
                    if ((arg2 == null || arg0.field649 < arg3 || arg2[arg0.field649][var9][var10] != arg4) && arg0.method403(-28694) && !arg0.method391(0)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class155.field2331 - 16 && var9 <= class155.field2331 + 16 && var10 >= class214.field3065 - 16 && var10 <= class214.field3065 + 16) {
                        if (class190.field2741) {
                            class497.field7092[class317.field4502++].method3789((byte) -117, arg0);
                            class317.field4502 %= class368.field5159;
                        } else {
                            arg0.method401((byte) -39, class497.field7089);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "(I)V")
    public static void method2360(int arg0) {
        if (arg0 > -7) {
            field5260 = null;
        }
        field5260 = null;
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(B)V")
    public static final void method2361(byte arg0) {
        class747.field10449 = null;
        class562.field7970 = null;
        class512.field7314 = null;
        class118.field1859 = null;
        class402.field5612 = null;
        field5257++;
        class328.field4637 = null;
        class698.field9810 = null;
        int var1 = -50 / ((74 - arg0) / 46);
        class427.field5963 = null;
        class609.field8821 = null;
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(III)I")
    public static final int method2362(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            method2360(115);
        }
        field5258++;
        return arg0 == 1 || arg0 == 3 ? class591.field8303[arg1 & 0x3] : class468.field6746[arg1 & 0x3];
    }
}
