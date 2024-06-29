import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class95 extends class29 {

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "[B")
    public byte[] field1453;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Ltl;")
    public static class222 field1454 = new class222(2);

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Lqg;")
    public static class256 field1459 = new class256();

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "Ln;")
    public static class298 field1460;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V", line = 7)
    public static void method679(byte arg0) {
        field1454 = null;
        field1460 = null;
        field1459 = null;
        if (arg0 != -102) {
            method679((byte) -10);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIB[Lde;[BI)V", line = 26)
    public static final void method680(boolean arg0, int arg1, byte arg2, class68[] arg3, byte[] arg4, int arg5) {
        field1455++;
        if (arg2 >= -119) {
            field1459 = (class256) null;
        }
        int var6 = -1;
        class192 var7 = new class192(arg4);
        while (true) {
            int var8 = var7.method1391(32767);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method1362(124);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFD1) >> 6;
                int var13 = var9 >> 12;
                int var14 = var7.method1399(-1172389784);
                int var15 = var14 >> 2;
                int var16 = var11 + arg1;
                int var17 = arg5 + var12;
                int var18 = var14 & 0x3;
                if (var17 > 0 && var16 > 0 && var17 < 103 && var16 < 103) {
                    class68 var19 = null;
                    if (!arg0) {
                        int var20 = var13;
                        if ((class81.field1229[1][var17][var16] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class49.method341(-1, var13, var13, var19, var18, var17, !arg0, arg0, var15, var6, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([B)V", line = 103)
    public class95(byte[] arg0) {
        this.field1453 = arg0;
    }
}
