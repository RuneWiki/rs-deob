import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class104 extends class282 {

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "[I")
    public static int[] field1127 = new int[1];

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lsb;")
    public static class305 field1122 = new class305(42, -1);

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "Lho;")
    public static class463 field1128;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "[B")
    private byte[] field1123;

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class104() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)[B")
    public final byte[] method564(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -2) {
            field1127 = null;
        }
        this.field1123 = new byte[arg0 * arg2 * arg1 * 2];
        field1121++;
        this.method774(-104, arg0, arg1, arg2);
        return this.field1123;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static void method565(int arg0) {
        field1122 = null;
        int var1 = 66 % ((-arg0 - 42) / 34);
        field1128 = null;
        field1127 = null;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V")
    public static final void method566(byte arg0) {
        class36.field365 = 0;
        class458.field6509 = 0;
        class291.field3638 = 0;
        class333.field4178 = 0;
        field1124++;
        int var1 = 79 / ((-arg0 - 44) / 63);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBB)V")
    public final void method567(int arg0, byte arg1, byte arg2) {
        field1125++;
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field1123[var10001] = (byte) (var5 * 3 >> 5);
        this.field1123[var6] = (byte) (var5 * 3 >> 5);
        if (arg2 != 26) {
            field1127 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lnp;I)Lig;")
    public static final class322 method568(class115 arg0, int arg1) {
        field1126++;
        if (arg1 != -29127) {
            return null;
        }
        String var2 = arg0.method626(arg1 ^ 0xFFFF8E70);
        class240 var3 = class579.method3275(arg1 + 29127)[arg0.method620((byte) -128)];
        class648 var4 = class564.method3198(25624)[arg0.method620((byte) -128)];
        int var5 = arg0.method676(-5);
        int var6 = arg0.method676(-5);
        int var7 = arg0.method620((byte) 83);
        int var8 = arg0.method620((byte) 58);
        int var9 = arg0.method620((byte) 2);
        int var10 = arg0.method643((byte) -77);
        int var11 = arg0.method643((byte) -77);
        int var12 = arg0.method631(false);
        int var13 = arg0.method631(false);
        int var14 = arg0.method631(false);
        return new class322(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Z")
    public static final boolean method569(byte arg0, int arg1) {
        field1129++;
        if (arg0 <= 117) {
            return false;
        } else {
            return arg1 == 7 || arg1 == 9;
        }
    }
}
