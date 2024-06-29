import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class742 {

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "Z")
    public boolean field10047 = false;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "Z")
    public static boolean field10037 = false;

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "F")
    public static float field10045;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    public int field10036;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public static int field10039;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public int field10040;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field10041;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "Llh;")
    public class552 field10044;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Ldt;I)V")
    public final void method4076(class254 arg0, int arg1) {
        field10046++;
        if (arg1 != 649239184) {
            this.method4079(54, null, (byte) 29);
        }
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method4079(var3, arg0, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)I")
    public static final int method4077(int arg0, int arg1) {
        field10048++;
        return arg0 == -17388 ? arg1 & 0xFF : -43;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lha;IZZ)Lhh;")
    public final class140 method4078(class66 arg0, int arg1, boolean arg2, boolean arg3) {
        field10042++;
        long var5 = (long) ((arg2 ? 262144 : 0) | arg1 << 16 | this.field10040 | arg0.field906 << 19);
        class140 var7 = (class140) this.field10044.field7626.method3109((byte) 110, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field10044.field7622.method1185(this.field10040, 9330)) {
            if (arg3) {
                this.field10040 = -122;
            }
            class162 var8 = class162.method1115(this.field10044.field7622, this.field10040, 0);
            if (var8 != null) {
                var8.field2162 = var8.field2159 = var8.field2158 = var8.field2161 = 0;
                if (arg2) {
                    var8.method1117();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method1123();
                }
            }
            class140 var10 = arg0.method466(var8, true);
            if (var10 != null) {
                this.field10044.field7626.method3108(var5, 16337, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILdt;B)V")
    private final void method4079(int arg0, class254 arg1, byte arg2) {
        if (arg2 != -66) {
            field10037 = false;
        }
        if (arg0 == 1) {
            this.field10040 = arg1.method1728((byte) 105);
        } else if (arg0 == 2) {
            this.field10036 = arg1.method1722(false);
        } else if (arg0 == 3) {
            this.field10047 = true;
        } else if (arg0 == 4) {
            this.field10040 = -1;
        }
        field10038++;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BIJ)Ljava/lang/String;")
    public static final String method4080(byte arg0, int arg1, long arg2) {
        if (arg0 < 121) {
            return null;
        }
        class215.method1391(false, arg2);
        field10041++;
        int var4 = class79.field1085.get(5);
        int var5 = class79.field1085.get(2);
        int var6 = class79.field1085.get(1);
        return arg1 == 3 ? class213.method1382(arg2, arg1, false) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class631.field8535[arg1][var5] + "-" + var6;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)Z")
    public final boolean method4081(int arg0) {
        if (arg0 != -22613) {
            this.method4079(123, null, (byte) 102);
        }
        field10039++;
        return this.field10044.field7622.method1185(this.field10040, 9330);
    }
}
