import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class99 extends class167 {

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "[I")
    public static int[] field1813 = new int[200];

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "Lkh;")
    public static class117 field1819 = class224.method1450((byte) -75, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "Lai;")
    public static class10 field1815;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public static void method670(int arg0) {
        field1819 = null;
        if (arg0 == 3) {
            field1813 = null;
            field1815 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZILab;III)V")
    public static final void method671(int arg0, boolean arg1, int arg2, class3 arg3, int arg4, int arg5, int arg6) {
        field1814++;
        long var7 = 0L;
        if (arg4 == 0) {
            var7 = class93.method640(arg5, arg0, arg2);
        }
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (!arg1) {
            method670(-116);
        }
        if (arg4 == 1) {
            var7 = class149.method1070(arg5, arg0, arg2);
        }
        if (arg4 == 2) {
            var7 = client.method294(arg5, arg0, arg2);
        }
        if (arg4 == 3) {
            var7 = class207.method1363(arg5, arg0, arg2);
        }
        if (var7 == 0L) {
            return;
        }
        int var12 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        int var13 = (int) var7 >> 14 & 0x1F;
        int var14 = (int) var7 >> 20 & 0x3;
        class211 var15 = class48.method379(107, var12);
        if (arg4 == 0) {
            class6.method49(arg5, arg0, arg2);
            if (var15.field3811 != 0) {
                arg3.method14(var13, var15.field3825, arg2, arg0, var14, (byte) -46);
            }
        }
        if (arg4 == 1) {
            class227.method1471(arg5, arg0, arg2);
        }
        if (arg4 == 2) {
            class213.method1401(arg5, arg0, arg2);
            if (var15.field3811 != 0 && var15.field3814 + arg0 < 104 && var15.field3814 + arg2 < 104 && arg0 + var15.field3804 < 104 && var15.field3804 + arg2 < 104) {
                arg3.method12((byte) -71, arg2, var15.field3814, var15.field3825, arg0, var14, var15.field3804);
            }
        }
        if (arg4 != 3) {
            return;
        }
        class51.method391(arg5, arg0, arg2);
        if (var15.field3811 == 1) {
            arg3.method18(arg0, arg2, (byte) 81);
            return;
        }
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public static final void method672(int arg0) {
        field1816++;
        class14.field435 = new class36();
        if (arg0 <= 80) {
            method671(-71, true, -83, null, -25, -44, 81);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZLpj;I)V")
    public static final void method673(int arg0, int arg1, int arg2, boolean arg3, class174 arg4, int arg5) {
        field1812++;
        if (class219.field3975 >= 50 || (arg4.field3136 == null || arg4.field3136.length < 1 || arg1 >= arg4.field3136.length || arg4.field3136[arg1] == null)) {
            return;
        }
        int var6 = arg4.field3136[arg1][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        if (arg2 != 32521) {
            return;
        }
        if (arg4.field3136[arg1].length > 1) {
            int var9 = (int) ((double) arg4.field3136[arg1].length * Math.random());
            if (var9 > 0) {
                var7 = arg4.field3136[arg1][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg3) {
                class73.method515(var7, var8, -98, 0);
            }
        } else if (class86.field1617 != 0) {
            class178.field3226[class219.field3975] = var7;
            class5.field65[class219.field3975] = var8;
            int var11 = (arg0 - 64) / 128;
            class34.field803[class219.field3975] = 0;
            class80.field1508[class219.field3975] = null;
            int var12 = (arg5 - 64) / 128;
            class174.field3127[class219.field3975] = (var11 << 16) + (var12 << 8) + var10;
            class219.field3975++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
    public static final void method674(int arg0, boolean arg1) {
        field1817++;
        byte[][] var2 = class13.field412;
        if (arg0 >= -63) {
            return;
        }
        int var3 = class30.field718.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class216.field3936[var4] >> 8) * 64 - class143.field2591;
                int var7 = (class216.field3936[var4] & 0xFF) * 64 - class184.field3319;
                class93.method637(10000);
                class166.method1175((byte) 114, arg1, var7, var5, var6, class173.field3123);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        field1818++;
        if (arg0 != -96) {
            this.method53((byte) -56, -50);
        }
        return class70.field1350;
    }
}
