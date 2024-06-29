import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class163 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Loh;")
    public static class263 field2961 = class253.method1681(-126, "; Expires=");

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Llb;")
    public static class127 field2964 = new class127(100);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field2967 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[[[I")
    public static int[][][] field2968;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1069(byte arg0) {
        if (arg0 != 55) {
            field2966 = 51;
        }
        field2961 = null;
        field2964 = null;
        field2968 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
    public abstract void method1070(int arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)I")
    public abstract int method1071(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1072(int arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[Lpg;ZI[B)V")
    public static final void method1073(int arg0, int arg1, class73[] arg2, boolean arg3, int arg4, byte[] arg5) {
        field2963++;
        class194 var6 = new class194(arg5);
        int var7 = -1;
        if (arg1 != 4697) {
            method1073(-96, -42, (class73[]) null, true, -127, (byte[]) null);
        }
        while (true) {
            int var8 = var6.method1303(-73);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1311(arg1 - 4825);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var6.method1301(-8317);
                int var14 = (var9 & 0xFE9) >> 6;
                int var15 = var13 >> 2;
                int var16 = var14 + arg4;
                int var17 = var13 & 0x3;
                int var18 = arg0 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class73 var19 = null;
                    if (!arg3) {
                        int var20 = var12;
                        if ((class77.field1576[1][var16][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class13.method107(var7, arg3, var17, var12, (byte) -21, var18, var15, var16, var12, var19, !arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lsc;")
    public abstract class239 method1074(int arg0);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method1075(int arg0) {
        field2965++;
        class101.field1922.method825(arg0 + 1930);
        class212.field3795.method825(arg0 ^ arg0);
        class47.field1010.method825(0);
    }
}
