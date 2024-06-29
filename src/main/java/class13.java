import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class13 {

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[B")
    public static byte[] field117 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
    public static int[] field121 = new int[2500];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lij;")
    public static class316 field114;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lij;")
    public static class316 field118;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)V", line = 12)
    public static final void method63(byte arg0, int arg1) {
        class346.field4679.method2531(arg1, 112);
        field120++;
        int var2 = 116 / ((arg0 - 80) / 43);
        class339.field4590.method2531(arg1, 112);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZIII)V", line = 23)
    public static final void method64(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field115++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 - 1) * var15;
        if (arg4 >= class143.field2090 && class42.field543 >= arg4) {
            int var21 = class294.method1789(arg0 + arg3, (byte) -5, class430.field6003, class80.field1119);
            int var22 = class294.method1789(arg3 - arg0, (byte) -5, class430.field6003, class80.field1119);
            class149.method1112(arg5, var21, 8, var22, class83.field1157[arg4]);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg4 - var7;
            int var24 = arg4 + var7;
            if (class143.field2090 <= var24 && var23 <= class42.field543) {
                int var25 = class294.method1789(arg3 + var6, (byte) -5, class430.field6003, class80.field1119);
                int var26 = class294.method1789(arg3 - var6, (byte) -5, class430.field6003, class80.field1119);
                if (var23 >= class143.field2090) {
                    class149.method1112(arg5, var25, 8, var26, class83.field1157[var23]);
                }
                if (var24 <= class42.field543) {
                    class149.method1112(arg5, var25, 8, var26, class83.field1157[var24]);
                }
            }
        }
        if (!arg2) {
            field118 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 139)
    public static void method66(byte arg0) {
        field121 = null;
        field118 = null;
        int var1 = -23 % ((80 - arg0) / 41);
        field114 = null;
        field117 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILij;Lij;ZI)V", line = 151)
    public static final void method67(int arg0, class316 arg1, class316 arg2, boolean arg3, int arg4) {
        class178.field2546 = arg1;
        field119++;
        class345.field4670 = arg2;
        class14.field180 = arg3;
        class264.field3621 = arg4;
        if (arg0 != 4514) {
            method64(60, 54, true, -59, -84, 121);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Z", line = 173)
    public static final boolean method69(int arg0, int arg1) {
        field112++;
        if (arg0 == 21 || arg0 == 60 || arg0 == 58 || arg0 == 3 || arg0 == 1001) {
            return true;
        } else if (arg1 <= 98) {
            return false;
        } else {
            return arg0 == 59 || arg0 == 1011;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
    public abstract int method62(int arg0, int arg1);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Ljp;")
    public abstract class404 method65(int arg0);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(BI)[B")
    public abstract byte[] method68(byte arg0, int arg1);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)V")
    public abstract void method70(int arg0, int arg1);
}
