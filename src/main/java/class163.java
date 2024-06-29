import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class163 {

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Z")
    public boolean field2529 = false;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field2523 = -1;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[I")
    public static int[] field2519;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BB)Z")
    public static final boolean method1176(byte[] arg0, byte arg1) {
        field2524++;
        class53 var2 = new class53(arg0);
        int var3 = var2.method366(-16505);
        if (var3 != 1) {
            return false;
        }
        if (arg1 > -57) {
            method1176((byte[]) null, (byte) 127);
        }
        boolean var4 = var2.method366(-16505) == 1;
        if (var4) {
            class180.method1276(var2, (byte) 119);
        }
        class51.method311(var2, 11020);
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method1177(int arg0) {
        int var1 = 62 % ((66 - arg0) / 48);
        field2519 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BILhc;I)V")
    private final void method1178(byte arg0, int arg1, class53 arg2, int arg3) {
        field2527++;
        if (arg1 == 1) {
            this.field2522 = arg2.method331(-51);
        } else if (arg1 == 2) {
            this.field2525 = arg2.method362(-4);
        } else if (arg1 == 3) {
            this.field2529 = true;
        } else if (arg1 == 4) {
            this.field2522 = -1;
        }
        if (arg0 >= -49) {
            this.method1179(true, false, -36);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZZI)Laf;")
    public final class176 method1179(boolean arg0, boolean arg1, int arg2) {
        field2526++;
        class176 var4 = (class176) class159.field2480.method1418((long) ((arg1 ? 262144 : 0) | this.field2522 | arg2 << 16), 0);
        if (var4 != null) {
            return var4;
        }
        if (arg0) {
            field2523 = 47;
        }
        class142.field2302.method1885(2, this.field2522);
        class176 var5 = class6.method30((byte) 80, this.field2522, class142.field2302, 0);
        if (var5 != null) {
            var5.method1257(class139.field2266, class126.field2122, class245.field3611);
            var5.field2247 = var5.field2255;
            var5.field2253 = var5.field2258;
            if (arg1) {
                var5.method1254();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1258();
            }
            class159.field2480.method1421((long) (arg2 << 16 | this.field2522 | (arg1 ? 262144 : 0)), var5, (byte) -117);
        }
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZILhc;)V")
    public final void method1180(boolean arg0, int arg1, class53 arg2) {
        field2521++;
        while (true) {
            int var4 = arg2.method366(-16505);
            if (var4 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method1180(true, -112, (class53) null);
                    return;
                }
            }
            this.method1178((byte) -83, var4, arg2, arg1);
        }
    }
}
