import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 {

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Z")
    public boolean field1143 = true;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lv;")
    public static class122 field1128 = class55.method425(-58, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lv;")
    private static class122 field1131 = class55.method425(-85, "Connection lost");

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Lv;")
    public static class122 field1130 = class55.method425(-85, "Mitteilung");

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lv;")
    public static class122 field1139 = class55.method425(-117, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lv;")
    private static class122 field1132 = class55.method425(-82, "Loading textures )2 ");

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lv;")
    public static class122 field1136 = field1132;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lv;")
    public static class122 field1142 = field1131;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lv;")
    private static class122 field1141 = class55.method425(-113, " from your friend list first");

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lv;")
    public static class122 field1137 = field1141;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1133 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1146 = 3;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 20)
    public static void method369(int arg0) {
        field1142 = null;
        field1139 = null;
        field1133 = null;
        field1132 = null;
        field1128 = null;
        field1131 = null;
        field1136 = null;
        if (arg0 == 1625013320) {
            field1137 = null;
            field1141 = null;
            field1130 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILmb;ZILmb;)Lua;", line = 40)
    public static final class118 method370(int arg0, class74 arg1, boolean arg2, int arg3, class74 arg4) {
        boolean var5 = true;
        field1135++;
        int[] var6 = arg4.method604(arg0, 4);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method606(arg0, -1, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg2) {
                    var10 = arg1.method606(0, -1, var9);
                } else {
                    var10 = arg1.method606(var9, -1, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        int var11 = 120 % (arg3 / 48);
        try {
            return new class118(arg4, arg1, arg0, arg2);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIIIZ)V", line = 151)
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1140 = arg4;
        this.field1129 = arg0;
        this.field1143 = arg6;
        this.field1144 = arg2;
        this.field1138 = arg5;
        this.field1134 = arg3;
        this.field1127 = arg1;
    }
}
