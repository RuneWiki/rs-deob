import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class88 extends class461 {

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "Lhi;")
    public static class193 field1335 = new class193(3);

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IIIIII)V")
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1328 = arg1;
        this.field1333 = arg2;
        this.field1339 = arg0;
        this.field1334 = arg3;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
    public static void method702(int arg0) {
        int var1 = 45 % ((arg0 - 38) / 57);
        field1335 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)V")
    public final void method703(int arg0, int arg1, int arg2) {
        ++field1336;
        int var4 = this.field1339 * arg2 >> 12;
        int var5 = this.field1333 * arg2 >> 12;
        if (arg1 >= -88) {
            this.method704((byte) 69, -89, -76);
        }
        int var6 = this.field1328 * arg0 >> 12;
        int var7 = this.field1334 * arg0 >> 12;
        class331.method1969(var4, (byte) 126, super.field6248, var7, var5, var6);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BII)V")
    public final void method704(byte arg0, int arg1, int arg2) {
        ++field1331;
        if (arg0 <= 79) {
            this.method705(-84, -68, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIB)V")
    public final void method705(int arg0, int arg1, byte arg2) {
        if (arg2 != -56) {
            method702(-99);
        }
        ++field1337;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;ZIZ)I")
    public static final int method706(String arg0, boolean arg1, int arg2, boolean arg3) {
        ++field1332;
        if (~arg2 <= -3 && arg2 <= 36) {
            boolean var4 = false;
            boolean var5 = arg3;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                char var9 = arg0.charAt(var8);
                if (~var8 == -1) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || var9 > 'z') {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (~arg2 >= ~var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if (var10 / arg2 != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }
}
