import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class10 extends class175 {

    @OriginalMember(owner = "client!se", name = "y", descriptor = "[Lae;")
    public class252[] field144;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Z")
    public static boolean field149 = false;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "Lwe;")
    public static class43 field150;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II[Lpi;I[BZ)V")
    public static final void method59(int arg0, int arg1, class281[] arg2, int arg3, byte[] arg4, boolean arg5) {
        field147++;
        if (arg0 != 0) {
            field149 = true;
        }
        class264 var6 = new class264(arg4);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1753((byte) -69);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1729(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFFF) >> 6;
                int var13 = var9 >> 12;
                int var14 = var12 + arg3;
                int var15 = var6.method1779(-92);
                int var16 = var15 & 0x3;
                int var17 = arg1 + var11;
                int var18 = var15 >> 2;
                if (var14 > 0 && var17 > 0 && var14 < 103 && var17 < 103) {
                    class281 var19 = null;
                    if (!arg5) {
                        int var20 = var13;
                        if ((class134.field2251[1][var14][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class150.method1021(arg5, var13, var16, var17, !arg5, var14, 79, var13, var7, var18, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z")
    public final boolean method60(int arg0, int arg1) {
        int var3 = -58 / ((37 - arg1) / 34);
        field145++;
        return this.field144[arg0].field4030;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static final void method61(byte arg0) {
        field148++;
        class246.field3947.method1831(-103);
        class57.field794.method1831(-119);
        int var1 = 72 / ((arg0 + 58) / 53);
        class113.field1936.method1831(-121);
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V")
    public static void method62(int arg0) {
        field150 = null;
        if (arg0 != 1779218854) {
            method59(-52, 74, (class281[]) null, 108, (byte[]) null, true);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Z")
    public final boolean method63(int arg0, int arg1) {
        if (arg0 == 1) {
            field146++;
            return this.field144[arg1].field4035;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljj;Ljj;IZ)V")
    public class10(class134 arg0, class134 arg1, int arg2, boolean arg3) {
        class48 var5 = new class48();
        int var6 = arg0.method948((byte) -97, arg2);
        this.field144 = new class252[var6];
        int[] var7 = arg0.method919(-114, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method940((byte) 113, var7[var8], arg2);
            class160 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class160 var12 = (class160) var5.method365(3); var12 != null; var12 = (class160) var5.method372((byte) 7)) {
                if (var12.field2606 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method932(var11, 1, 0);
                } else {
                    var13 = arg1.method932(0, 1, var11);
                }
                var10 = new class160(var11, var13);
                var5.method363(-124, var10);
            }
            this.field144[var7[var8]] = new class252(var9, var10);
        }
    }
}
