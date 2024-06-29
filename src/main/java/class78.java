import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class78 extends class176 {

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "[Ldb;")
    public class33[] field1573;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field1582 = 0;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1574 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "[I")
    public static int[] field1581;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lpe;Lpe;B)V")
    public static final void method538(class154 arg0, class154 arg1, byte arg2) {
        if (arg2 != 26) {
            field1582 = -19;
        }
        class92.field1850 = arg1;
        class164.field3166 = arg0;
        field1578++;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Z")
    public final boolean method539(int arg0, int arg1) {
        if (arg0 != -30419) {
            method540(36, -107, 107);
        }
        field1577++;
        return this.field1573[arg1].field680;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)I")
    public static final int method540(int arg0, int arg1, int arg2) {
        field1572++;
        if (arg0 == -1) {
            return 12345678;
        }
        if (arg1 != 18459) {
            method538(null, null, (byte) -72);
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public static void method541(int arg0) {
        field1574 = null;
        field1581 = null;
        if (arg0 != 0) {
            method540(53, 41, -122);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIIIII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1583++;
        if (arg2 >= 60) {
            for (int var6 = arg3; var6 <= arg5; var6++) {
                class180.method1217(arg0, (byte) 52, arg4, arg1, class41.field805[var6]);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Lob;")
    public static final class141 method543(byte arg0, int arg1) {
        field1576++;
        if (arg0 != 93) {
            field1581 = null;
        }
        return class107.method709((byte) -41, arg1, 10, false);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lpe;Lpe;IZ)V")
    public class78(class154 arg0, class154 arg1, int arg2, boolean arg3) {
        class158 var5 = new class158();
        int var6 = arg0.method1058(arg2, (byte) -59);
        this.field1573 = new class33[var6];
        int[] var7 = arg0.method1057(arg2, (byte) 55);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1065((byte) -114, var7[var8], arg2);
            class88 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class88 var12 = (class88) var5.method1103((byte) -9); var12 != null; var12 = (class88) var5.method1106((byte) -69)) {
                if (var12.field1751 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1070(var11, 0, 34);
                } else {
                    var13 = arg1.method1070(0, var11, 34);
                }
                var10 = new class88(var11, var13);
                var5.method1098(0, var10);
            }
            this.field1573[var7[var8]] = new class33(var9, var10);
        }
    }
}
