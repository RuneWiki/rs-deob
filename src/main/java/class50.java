import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class50 extends class209 {

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "[Lib;")
    public class158[] field820;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field812 = " ";

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "F")
    public static float field818 = 0.0F;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field813 = 0;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)I")
    public static final int method414(int arg0, byte arg1) {
        field819++;
        if (arg1 != 40) {
            method414(9, (byte) -81);
        }
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IB)Z")
    public final boolean method415(int arg0, byte arg1) {
        int var3 = 47 % ((-arg1 - 28) / 50);
        field821++;
        return this.field820[arg0].field2366;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)Z")
    public final boolean method416(boolean arg0, int arg1) {
        field815++;
        if (!arg0) {
            this.field820 = null;
        }
        return this.field820[arg1].field2357;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
    public static void method417(byte arg0) {
        field812 = null;
        if (arg0 >= -120) {
            method417((byte) -27);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lub;Lub;IZ)V")
    public class50(class92 arg0, class92 arg1, int arg2, boolean arg3) {
        class2 var5 = new class2();
        int var6 = arg0.method700((byte) -95, arg2);
        this.field820 = new class158[var6];
        int[] var7 = arg0.method724(arg2, -109);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method721((byte) -117, arg2, var7[var8]);
            int var10 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            class8 var11 = null;
            for (class8 var12 = (class8) var5.method6(-119); var12 != null; var12 = (class8) var5.method11((byte) 39)) {
                if (var12.field130 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method720(var10, 0, -116);
                } else {
                    var13 = arg1.method720(0, var10, -96);
                }
                var11 = new class8(var10, var13);
                var5.method12(var11, 12);
            }
            this.field820[var7[var8]] = new class158(var9, var11);
        }
    }
}
