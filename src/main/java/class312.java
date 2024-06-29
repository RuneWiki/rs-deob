import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class312 {

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "B")
    public byte field4554;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "S")
    public short field4561;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "S")
    public short field4563;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public int field4555;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "B")
    public byte field4559;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "S")
    public short field4560;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Z")
    public boolean field4558;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public int field4566;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "Llp;")
    public static class272 field4570 = new class272(8);

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "Ldq;")
    public static class500 field4572;

    static {
        new class446("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)V", line = 14)
    public static final void method1964(int arg0, byte arg1) {
        field4568++;
        if (class389.field5948 == arg0) {
            return;
        }
        class398.field6071 = class528.field7734 = class257.field3559[arg0];
        class66.method472(50);
        class309.field4506 = new int[class398.field6071][class528.field7734];
        class73.field1008 = new int[class398.field6071][class528.field7734];
        class156.field2033 = new int[4][class398.field6071 >> 3][class528.field7734 >> 3];
        if (arg1 != 3) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class9.field174[var2] = class156.method1007(class528.field7734, false, class398.field6071);
        }
        class304.field4438 = new byte[4][class398.field6071][class528.field7734];
        class289.method1849(4, class528.field7734, class398.field6071, -119);
        class421.method2574(true, class398.field6071 >> 3, class400.field6090, class528.field7734 >> 3);
        class389.field5948 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 53)
    public static void method1965(byte arg0) {
        if (arg0 != 69) {
            method1968(null, 64);
        }
        field4572 = null;
        field4570 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLuu;ZLjava/lang/String;)Ljf;", line = 65)
    public static final class146 method1966(byte arg0, class191 arg1, boolean arg2, String arg3) {
        if (arg0 > -70) {
            method1966((byte) 10, null, false, null);
        }
        field4565++;
        int var4 = arg1.method1265(arg3, 82);
        if (var4 == -1) {
            return new class146(0);
        }
        int[] var5 = arg1.method1293(var4, 20938);
        class146 var6 = new class146(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field1938) {
                class164 var9 = new class164(arg1.method1281(var4, var5[var8++], 118));
                int var10 = var9.method1099(83);
                int var11 = var9.method1074(-635989152);
                int var12 = var9.method1087(false);
                if (!arg2 && var12 == 1) {
                    var6.field1938--;
                } else {
                    var6.field1942[var7] = var10;
                    var6.field1935[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(IB)Z", line = 113)
    public static final boolean method1967(int arg0, byte arg1) {
        field4556++;
        for (class54 var2 = (class54) class131.field1769.method445(33); var2 != null; var2 = (class54) class131.field1769.method451(false)) {
            if (class296.method1894(var2.field764, 125) && (long) arg0 == var2.field758) {
                return true;
            }
        }
        int var3 = 127 % ((68 - arg1) / 52);
        return false;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 134)
    public class312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4557 = arg3;
        this.field4554 = (byte) arg7;
        this.field4561 = (short) arg4;
        this.field4563 = (short) arg6;
        this.field4562 = arg2;
        this.field4555 = arg11;
        this.field4559 = (byte) arg8;
        this.field4560 = (short) arg5;
        this.field4567 = arg0;
        this.field4558 = arg10;
        this.field4566 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lnj;I)V", line = 156)
    public static final void method1968(class164 arg0, int arg1) {
        field4569++;
        int var2 = arg0.method1077((byte) -122);
        class325.field4735 = new class35[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class325.field4735[var3] = new class35();
            class325.field4735[var3].field518 = arg0.method1077((byte) -118);
            class325.field4735[var3].field520 = arg0.method1110((byte) 8);
        }
        class44.field638 = arg0.method1077((byte) -121);
        class433.field6583 = arg0.method1077((byte) -124);
        class497.field7328 = arg0.method1077((byte) -122);
        class278.field3944 = new class412[class433.field6583 + 1 - class44.field638];
        if (arg1 != 4) {
            return;
        }
        for (int var4 = 0; var4 < class497.field7328; var4++) {
            int var5 = arg0.method1077((byte) -126);
            class412 var6 = class278.field3944[var5] = new class412();
            var6.field6159 = arg0.method1087(false);
            var6.field6156 = arg0.method1099(-121);
            var6.field6264 = var5 + class44.field638;
            var6.field6260 = arg0.method1110((byte) 8);
            var6.field6257 = arg0.method1110((byte) 8);
        }
        class389.field5943 = arg0.method1099(arg1 ^ 0xFFFFFF8E);
        class370.field5657 = true;
    }
}
