import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class77 {

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Z")
    public boolean field1048 = false;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field1046 = -1;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "Lwi;")
    public class325 field1051;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Ldv;")
    public static class467 field1041;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLya;II)Ll;", line = 3)
    public final class16 method713(boolean arg0, class38 arg1, int arg2, int arg3) {
        field1043++;
        long var5 = (long) (arg1.field430 << 19 | (arg0 ? 262144 : 0) | this.field1042 | arg2 << 16);
        class16 var7 = (class16) this.field1051.field4575.method1115(var5, (byte) 58);
        if (var7 != null) {
            return var7;
        } else if (this.field1051.field4565.method2384(-1, this.field1042)) {
            if (arg3 != 16306) {
                this.method714(null, -83);
            }
            class218 var8 = class218.method1488(this.field1051.field4565, this.field1042, 0);
            if (var8 != null) {
                var8.field3147 = var8.field3142 = var8.field3143 = var8.field3146 = 0;
                if (arg0) {
                    var8.method1491();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1490();
                }
            }
            class16 var10 = arg1.method389(var8, true);
            if (var10 != null) {
                this.field1051.field4575.method1107(1, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Liv;I)V", line = 50)
    public final void method714(class65 arg0, int arg1) {
        field1049++;
        if (arg1 != -8616) {
            this.method715(61, null, -74);
        }
        while (true) {
            int var3 = arg0.method577(255);
            if (var3 == 0) {
                return;
            }
            this.method715(var3, arg0, -21210);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILiv;I)V", line = 70)
    private final void method715(int arg0, class65 arg1, int arg2) {
        field1050++;
        if (arg2 != -21210) {
            this.field1051 = null;
        }
        if (arg0 == 1) {
            this.field1042 = arg1.method623((byte) 110);
        } else if (arg0 == 2) {
            this.field1045 = arg1.method580((byte) 29);
            return;
        } else if (arg0 == 3) {
            this.field1048 = true;
            return;
        } else if (arg0 == 4) {
            this.field1042 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 101)
    public static void method716(int arg0) {
        field1041 = null;
        int var1 = 116 / ((arg0 - 71) / 54);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)Z", line = 124)
    public final boolean method717(byte arg0) {
        if (arg0 >= -32) {
            method716(-51);
        }
        field1044++;
        return this.field1051.field4565.method2384(-1, this.field1042);
    }
}
