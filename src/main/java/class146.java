import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class146 {

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Z")
    public static boolean field2067 = false;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "Lfn;")
    public static class52 field2061 = new class52(47, 5);

    @OriginalMember(owner = "client!np", name = "k", descriptor = "Lms;")
    public static class363 field2070 = null;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public int field2065;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Lnp;")
    public class146 field2066;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "Ltq;")
    public class478 field2062;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "[S")
    public static short[] field2069;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Les;IIBIII)V")
    public static final void method903(class75 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class145.method887(arg1, arg6, arg0.field6766, 0, arg0.field6765, arg4, arg2, arg0.field6746, arg5, 0);
        if (arg3 == -110) {
            field2060++;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
    public static void method904(boolean arg0) {
        if (arg0) {
            field2070 = null;
            field2069 = null;
            field2061 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public final void method905(int arg0) {
        field2063++;
        if (~class444.field6120 <= arg0) {
            return;
        }
        this.field2066 = class117.field1637;
        this.field2062 = null;
        this.field2065 = 0;
        class117.field1637 = this;
        class444.field6120++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
    public static final boolean method906(int arg0, int arg1, int arg2) {
        field2064++;
        int var3 = -10 % ((arg1 - 7) / 35);
        if (!class351.field4800) {
            return false;
        }
        int var4 = arg0 >> 16;
        int var5 = arg0 & 0xFFFF;
        if (class39.field666[var4] == null || class39.field666[var4][var5] == null) {
            return false;
        }
        class363 var6 = class39.field666[var4][var5];
        if (arg2 == -1 && var6.field5093 == 0) {
            for (class106 var7 = (class106) class250.field3514.method1544(-112); var7 != null; var7 = (class106) class250.field3514.method1546((byte) -42)) {
                if (var7.field1517 == 23 || var7.field1517 == 1004 || var7.field1517 == 13 || var7.field1517 == 50 || var7.field1517 == 59) {
                    for (class363 var8 = class292.method1804((byte) -113, var7.field1519); var8 != null; var8 = class198.method1258(var8, -122)) {
                        if (var6.field5096 == var8.field5096) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class106 var9 = (class106) class250.field3514.method1544(-126); var9 != null; var9 = (class106) class250.field3514.method1546((byte) -42)) {
                if (var9.field1521 == arg2 && var6.field5096 == var9.field1519 && (var9.field1517 == 23 || var9.field1517 == 1004 || var9.field1517 == 13 || var9.field1517 == 50 || var9.field1517 == 59)) {
                    return true;
                }
            }
        }
        return false;
    }
}
