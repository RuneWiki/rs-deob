import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class47 {

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Lji;")
    private class622 field668;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "J")
    public long field667;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[Ldl;")
    public static class64[] field666 = new class64[50];

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field664 = 0;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "Lsga;")
    public static class547 field665;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lpe;")
    public static class615 field670;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method431(boolean arg0, int arg1) {
        field669++;
        if (arg1 <= 85) {
            method433(-28, null, 93L, null, 127, 58, false, -77, 56, false, (byte) -104);
        }
        boolean var2 = class520.field6799.method211();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class520.field6799.method179();
        } else if (!class520.field6799.method231()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class260.field3509.field1261 = arg0;
            class260.field3509.method1574(class688.field9413, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILjava/lang/Class;)Lmca;", line = 44)
    public static final class34 method432(int arg0, int arg1, int arg2, Class arg3) {
        class530 var4 = class483.field6438[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class571 var5 = var4.field6887; var5 != null; var5 = var5.field7445) {
            class34 var6 = var5.field7444;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field497 == arg1 && var6.field502 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/lang/String;JLjava/lang/String;IIZIIZB)V", line = 72)
    public static final void method433(int arg0, String arg1, long arg2, String arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        field662++;
        if (class594.field8025 || class291.field3758 >= 500) {
            return;
        }
        int var12 = arg7 == -1 ? client.field1223 : arg7;
        class57 var13 = new class57(arg3, arg1, var12, arg4, arg5, arg2, arg8, arg0, arg9, arg6);
        int var14 = 61 % ((61 - arg10) / 58);
        class658.field9176.method2087(var13, -117);
        class291.field3758++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;ZZII)V", line = 90)
    public static final void method434(String arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class426.method2451(arg4, null, arg3, arg2, 43, arg1, arg0);
        field663++;
    }

    @OriginalMember(owner = "client!hq", name = "finalize", descriptor = "()V", line = 99)
    protected final void finalize() throws Throwable {
        field671++;
        this.field668.method3457(this.field667, 0);
        super.finalize();
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lji;J[Lkk;)V", line = 112)
    public class47(class622 arg0, long arg1, class238[] arg2) {
        this.field668 = arg0;
        this.field667 = arg1;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 123)
    public static void method435(int arg0) {
        field670 = null;
        field665 = null;
        if (arg0 >= -99) {
            field666 = null;
        }
        field666 = null;
    }
}
