import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class458 {

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "S")
    public short field6673;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public int field6677;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "B")
    public byte field6669;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "S")
    public short field6670;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Z")
    public boolean field6668;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "B")
    public byte field6674;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "S")
    public short field6672;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "Lhr;")
    public static class348 field6676;

    static {
        new class194("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lss;III[Z)V", line = 14)
    public static final void method2666(class283 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class311.field4527 == class178.field2562) {
            return;
        }
        int var5 = class459.field6685[arg1].method855(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class441 var7 = class459.field6685[var6];
                if (var7 != null) {
                    var7.method849(arg0, arg2, var5 - var7.method855(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIII)Llt;", line = 42)
    public final class458 method2667(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6675++;
        return arg3 == -1 ? new class458(arg2, arg1, arg4, arg0, this.field6673, this.field6670, this.field6672, this.field6669, this.field6674, this.field6668) : null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B[I[J)V", line = 53)
    public static final void method2668(byte arg0, int[] arg1, long[] arg2) {
        class400.method2385(0, 6693, arg1, arg2, arg2.length - 1);
        if (arg0 != 80) {
            method2666(null, 127, -85, 27, null);
        }
        field6671++;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 64)
    public static final void method2669(int arg0) {
        class245.method1531(class118.field1533.field6904, -97);
        field6678++;
        if (arg0 != -11995) {
            field6676 = null;
        }
        int var1 = (class455.field6637 >> 3) + (class205.field2843 >> 10);
        int var2 = (class282.field4026 >> 10) + (class223.field3158 >> 3);
        class355.field5121 = class415.field6145.field2956 = 0;
        class415.field6145.method1886(8, 8, (byte) 127);
        byte var3 = 18;
        class105.field1410 = new int[var3];
        class191.field2708 = new byte[var3][];
        class288.field4105 = new int[var3];
        class270.field3775 = new int[var3];
        class238.field3337 = new byte[var3][];
        class55.field855 = new int[var3][4];
        class285.field4068 = new byte[var3][];
        class195.field2748 = new int[var3];
        class51.field761 = new byte[var3][];
        class454.field6602 = new int[var3];
        class76.field1081 = new int[var3];
        class369.field5535 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class362.field5442 >> 4)) / 8; var5 <= ((class362.field5442 >> 4) + var1) / 8; var5++) {
            for (int var7 = (var2 - (class203.field2813 >> 4)) / 8; var7 <= (((class203.field2813 >> 4) + var2) / 8); var7++) {
                int var8 = (var5 << 8) + var7;
                class76.field1081[var4] = var8;
                class270.field3775[var4] = class67.field1004.method1444("m" + var5 + "_" + var7, (byte) 90);
                class195.field2748[var4] = class67.field1004.method1444("l" + var5 + "_" + var7, (byte) 28);
                class288.field4105[var4] = class67.field1004.method1444("n" + var5 + "_" + var7, (byte) 86);
                class105.field1410[var4] = class67.field1004.method1444("um" + var5 + "_" + var7, (byte) 35);
                class454.field6602[var4] = class67.field1004.method1444("ul" + var5 + "_" + var7, (byte) 77);
                if (class288.field4105[var4] == -1) {
                    class270.field3775[var4] = -1;
                    class195.field2748[var4] = -1;
                    class105.field1410[var4] = -1;
                    class454.field6602[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class288.field4105.length; var6++) {
            class288.field4105[var6] = -1;
            class270.field3775[var6] = -1;
            class195.field2748[var6] = -1;
            class105.field1410[var6] = -1;
            class454.field6602[var6] = -1;
        }
        class478.method2791(false, true, var2, arg0 ^ 0xFFFFD1A5, var1);
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V", line = 150)
    public static void method2670(int arg0) {
        field6676 = null;
        if (arg0 != -3978) {
            method2670(-28);
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 162)
    public class458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field6673 = (short) arg4;
        this.field6677 = arg0;
        this.field6669 = (byte) arg7;
        this.field6670 = (short) arg5;
        this.field6668 = arg9;
        this.field6674 = (byte) arg8;
        this.field6672 = (short) arg6;
    }
}
