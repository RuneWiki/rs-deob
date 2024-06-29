import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class77 {

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "[S")
    public short[] field1119;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "[S")
    public short[] field1121;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "J")
    public long field1120;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "[I")
    public int[] field1126;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field1117 = -1;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
    public static int field1124 = 0;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "[Lhw;")
    public static class616[] field1127;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BZ)V", line = 5)
    public static final void method570(byte arg0, boolean arg1) {
        field1125++;
        class580.field7942++;
        class583 var2 = class54.method400(class213.field2800, (byte) 119, class31.field370);
        int var3 = 113 % ((-arg0 - 2) / 55);
        class463.method2838(var2, (byte) 123);
        for (class654 var4 = (class654) class259.field3747.method821((byte) 120); var4 != null; var4 = (class654) class259.field3747.method818(54)) {
            if (!var4.method550(false)) {
                var4 = (class654) class259.field3747.method821((byte) 116);
                if (var4 == null) {
                    break;
                }
            }
            if (var4.field8746 == 0) {
                class39.method217((byte) 119, var4, true, arg1);
            }
        }
        if (class13.field127 != null) {
            class27.method159((byte) -105, class13.field127);
            class13.field127 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z", line = 46)
    public static final boolean method571(int arg0) {
        field1123++;
        return ~class217.field2826 == arg0 ? class149.field2066.method1790((byte) 113) : true;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V", line = 57)
    public static void method572(int arg0) {
        if (arg0 == -1) {
            field1127 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)V", line = 75)
    public static final void method573(int arg0, int arg1, int arg2, int arg3) {
        field1118++;
        class346 var4 = class299.method1976(arg3 ^ arg3, 9, arg1);
        var4.method2209(255);
        var4.field4916 = arg0;
        var4.field4926 = arg2;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IC)Z", line = 89)
    public static final boolean method574(int arg0, char arg1) {
        field1122++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class758.method4206(-91, arg1)) {
            return true;
        } else {
            char[] var2 = class138.field1957;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class449.field6214;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            if (arg0 != 3805) {
                method571(61);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(J[I[S[S)V", line = 139)
    public class77(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field1119 = arg3;
        this.field1121 = arg2;
        this.field1120 = arg0;
        this.field1126 = arg1;
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "()V", line = 149)
    protected class77() {
    }
}
