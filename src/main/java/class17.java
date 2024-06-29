import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class17 extends class86 {

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "[Lis;")
    public static class350[] field169 = new class350[14];

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field172 = 0;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "J")
    public static long field168 = -1L;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "Lff;")
    public static class607 field159;

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(ILsf;)V", line = 3)
    public class17(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Lkj;", line = 7)
    public static final class307 method69(int arg0) {
        ++field164;
        if (class402.field5329 != null && class403.field5359 != null) {
            class403.field5359.method2582(-30364, class402.field5329);
            class307 var1 = (class307) class403.field5359.method2583((byte) -30);
            if (var1 == null) {
                return null;
            } else {
                int var2 = -118 / ((arg0 - 34) / 42);
                class624 var3 = class402.field5322.method2323(var1.field3860, true);
                return var3 != null && var3.field7915 && var3.method3344(-26373, class402.field5325) ? var1 : class151.method859(0);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZ)V", line = 34)
    public static final void method70(byte arg0, boolean arg1) {
        ++field171;
        if (arg1) {
            if (~client.field6070 != 0) {
                class70.method422(0, client.field6070);
            }
            for (class278 var2 = (class278) class149.field1895.method2610((byte) -90); var2 != null; var2 = (class278) class149.field1895.method2620(arg0 + 105)) {
                if (!var2.method1942(27475)) {
                    var2 = (class278) class149.field1895.method2610((byte) -108);
                    if (var2 == null) {
                        break;
                    }
                }
                class24.method107((byte) -94, var2, true, false);
            }
            client.field6070 = -1;
            class149.field1895 = new class467(8);
            class55.method337(-25572);
            client.field6070 = class318.field3956;
            class575.method3093(false, (byte) 108);
            class135.method783(0);
            class760.method4142(client.field6070);
        }
        if (arg0 != -105) {
            field168 = 15L;
        }
        class435.field5717 = true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V", line = 81)
    public final void method71(byte arg0) {
        if (~super.field1200 != -1 && super.field1203.field6915.method2297(false) != 1) {
            super.field1200 = 0;
        }
        if (arg0 != -65) {
            method69(-110);
        }
        ++field167;
        if (~super.field1200 > -1 || super.field1200 > 1) {
            super.field1200 = this.method73(0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)I", line = 99)
    public final int method72(int arg0, int arg1) {
        ++field163;
        if (~arg0 != -1 && ~super.field1203.field6915.method2297(false) != -2) {
            if (arg1 != -2) {
                this.method71((byte) 8);
            }
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I", line = 113)
    public final int method73(int arg0) {
        if (arg0 != 0) {
            return 21;
        } else {
            ++field160;
            return 1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lsf;)V", line = 124)
    public class17(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "()V", line = 131)
    public static final void method74() {
        for (int var0 = 0; var0 < class166.field2206.length; ++var0) {
            class166.field2206[var0].method3837();
        }
        class166.field2206 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I", line = 141)
    public final int method75(boolean arg0) {
        ++field161;
        if (arg0) {
            method78(67, 37, -10, 64, 63);
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V", line = 152)
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        if (arg1) {
            method69(27);
        }
        ++field170;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Z", line = 163)
    public final boolean method77(int arg0) {
        int var2 = -34 / ((-57 - arg0) / 57);
        ++field162;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIII)V", line = 178)
    public static final void method78(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -588) {
            method70((byte) -75, true);
        }
        ++field166;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        class54.method333(arg1 + arg3, class207.field2840[arg4], 7, -arg3 + arg1, arg2);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (~var7 <= -1) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class207.field2840[arg4 + var6];
                int[] var10 = class207.field2840[-var6 + arg4];
                int var11 = arg1 - -var5;
                int var12 = arg1 - var5;
                class54.method333(var11, var9, 7, var12, arg2);
                class54.method333(var11, var10, 7, var12, arg2);
            }
            int var13 = arg1 + var6;
            int var14 = -var6 + arg1;
            int[] var15 = class207.field2840[arg4 + var5];
            int[] var16 = class207.field2840[-var5 + arg4];
            class54.method333(var13, var15, 7, var14, arg2);
            class54.method333(var13, var16, 7, var14, arg2);
        }
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V", line = 242)
    public static void method79(int arg0) {
        field159 = null;
        if (arg0 != -1) {
            method78(-79, -49, -103, 16, 124);
        }
        field169 = null;
    }
}
