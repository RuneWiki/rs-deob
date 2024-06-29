import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 extends class196 {

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    private int field182 = 32768;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "Ldf;")
    private static class51 field186 = class46.method233("slide:", 100);

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "Ldf;")
    public static class51 field188 = field186;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Ldf;")
    public static class51 field178 = field186;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "[J")
    public static long[] field187 = new long[32];

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "Ldf;")
    public static class51 field185 = class46.method233("<br>(X100(U(Y", 100);

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Lu;")
    public static class111 field180;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)I")
    public static final int method69(int arg0, int arg1, int arg2, int arg3) {
        ++field189;
        int var4 = arg0 & arg1;
        if (~var4 == -1) {
            return arg3;
        } else if (~var4 == -2) {
            return -arg2 + 7;
        } else {
            return var4 == 2 ? -arg3 + 7 : arg2;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class12() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public static void method70(int arg0) {
        field180 = null;
        field187 = null;
        field186 = null;
        field178 = null;
        if (arg0 != 0) {
            method69(20, 59, 49, 10);
        }
        field188 = null;
        field185 = null;
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V")
    public static final void method71(int arg0) {
        class243.field4206 = class98.field1642;
        class215.method1477((byte) -22, false);
        ++field183;
        class20.method99((byte) -66);
        class20.method103(class243.field4206, (byte) -96);
        class44.field706 = new class103();
        class44.field706.field4319 = 3000;
        class44.field706.field4348 = 3000;
        if (arg0 == 302) {
            class14.method77(class162.field2651, -115);
            class100.method734(true, 10);
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(B)V")
    public static final void method72(byte arg0) {
        ++field184;
        if (arg0 != -95) {
            field186 = null;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~var2 > ~(class39.field616 + -1); ++var2) {
                if (~class67.field1103[var2] > -1001 && ~class67.field1103[var2 + 1] < -1001) {
                    class51 var3 = class77.field1235[var2];
                    var1 = false;
                    class77.field1235[var2] = class77.field1235[var2 - -1];
                    class77.field1235[var2 - -1] = var3;
                    class51 var4 = class129.field2166[var2];
                    class129.field2166[var2] = class129.field2166[var2 + 1];
                    class129.field2166[var2 + 1] = var4;
                    int var5 = class156.field2579[var2];
                    class156.field2579[var2] = class156.field2579[var2 + 1];
                    class156.field2579[var2 + 1] = var5;
                    int var6 = class263.field4599[var2];
                    class263.field4599[var2] = class263.field4599[var2 + 1];
                    class263.field4599[var2 + 1] = var6;
                    short var7 = class67.field1103[var2];
                    class67.field1103[var2] = class67.field1103[var2 + 1];
                    class67.field1103[var2 + 1] = var7;
                    long var8 = class13.field192[var2];
                    class13.field192[var2] = class13.field192[var2 - -1];
                    class13.field192[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        class124.method930((byte) -108);
        int var2 = -13 % ((arg0 - 43) / 41);
        ++field190;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field3291 = arg1.method897(-78) == 1;
            }
        } else {
            this.field182 = arg1.method876(false) << 4;
        }
        if (arg2 == 82) {
            ++field179;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        ++field177;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -77);
        if (super.field3285.field3963) {
            int[] var4 = this.method1390(arg1, 1, arg0 + -91);
            int[] var5 = this.method1390(arg1, 2, -121);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; class49.field767 > var9; ++var9) {
                int var10 = var5[var9] * this.field182 >> 12;
                int var11 = 255 & var4[var9] * 255 >> 12;
                int var12 = class118.field1975[var11] * var10 >> 12;
                int var13 = class115.field1952[var11] * var10 >> 12;
                int var14 = class135.field2245 & (var12 >> 12) + var9;
                int var15 = class214.field3717 & arg1 - -(var13 >> 12);
                int[][] var16 = this.method1387(102, 0, var15);
                var7[var9] = var16[0][var14];
                var6[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return arg0 != 11 ? null : var3;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field191;
        if (arg1 != 10565) {
            method70(-125);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(arg0, 1, -121);
            int[] var5 = this.method1390(arg0, 2, -98);
            for (int var6 = 0; var6 < class49.field767; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field182 >> 12;
                int var9 = class118.field1975[var7] * var8 >> 12;
                int var10 = class115.field1952[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class135.field2245;
                int var12 = class214.field3717 & (var10 >> 12) + arg0;
                int[] var13 = this.method1390(var12, 0, arg1 ^ -10544);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }
}
