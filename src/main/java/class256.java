import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class256 {

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public int field3695 = 1;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Lao;")
    public static class188 field3690 = new class188(53, -2);

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3696 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "C")
    public char field3689;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "[Lne;")
    public static class207[] field3687;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLti;)V")
    public final void method1622(byte arg0, class303 arg1) {
        field3692++;
        if (arg0 >= -3) {
            method1625(true);
        }
        while (true) {
            int var3 = arg1.method1918((byte) -38);
            if (var3 == 0) {
                return;
            }
            this.method1627(var3, arg1, (byte) -26);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII[B)Z")
    public static final boolean method1623(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field3693++;
        int var6 = -93 % ((arg4 - 53) / 44);
        boolean var7 = true;
        class303 var8 = new class303(arg5);
        int var9 = -1;
        label56: while (true) {
            int var10 = var8.method1877((byte) 121);
            if (var10 == 0) {
                return var7;
            }
            var9 += var10;
            int var11 = 0;
            boolean var12 = false;
            while (true) {
                while (!var12) {
                    int var14 = var8.method1891(false);
                    if (var14 == 0) {
                        continue label56;
                    }
                    var11 += var14 - 1;
                    int var15 = var11 & 0x3F;
                    int var16 = (var11 & 0xFDE) >> 6;
                    int var17 = var8.method1918((byte) -108) >> 2;
                    int var18 = arg3 + var16;
                    int var19 = arg0 + var15;
                    if (var18 > 0 && var19 > 0 && var18 < (arg2 - 1) && (arg1 - 1) > var19) {
                        class510 var20 = class246.field3567.method609(111, var9);
                        if (var17 != 22 || class397.field5830.field123 || var20.field7491 != 0 || var20.field7492 == 1 || var20.field7495) {
                            if (!var20.method3026(-83)) {
                                class360.field5439++;
                                var7 = false;
                            }
                            var12 = true;
                        }
                    }
                }
                int var13 = var8.method1891(false);
                if (var13 == 0) {
                    break;
                }
                var8.method1918((byte) 86);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)Z")
    public static final boolean method1624(int arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            field3691++;
            return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
    public static final void method1625(boolean arg0) {
        class82.field1358 = new String[500];
        if (arg0) {
            field3687 = null;
        }
        field3688++;
        class507.field7417 = class42.field639.field194 + class42.field639.field201 + 2;
        class436.field6340 = class476.field6998.field194 + class476.field6998.field201 + 2;
        for (int var1 = 0; var1 < class82.field1358.length; var1++) {
            class82.field1358[var1] = "";
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method1626(int arg0) {
        field3696 = null;
        field3690 = null;
        if (arg0 != -1) {
            method1623(19, -118, -22, -58, 46, null);
        }
        field3687 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILti;B)V")
    private final void method1627(int arg0, class303 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3689 = class470.method2804(63, arg1.method1899((byte) 46));
        } else if (arg0 == 2) {
            this.field3695 = 0;
        }
        field3694++;
        if (arg2 != -26) {
            method1628(-82, -25);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)I")
    public static final int method1628(int arg0, int arg1) {
        return class436.field6338 == null ? 0 : class436.field6338[arg0][arg1] & 0xFFFFFF;
    }
}
