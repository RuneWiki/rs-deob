import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class386 extends class292 {

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field5067 = -1;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "Lkg;")
    public static class179 field5068 = new class179(31, 3);

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field5073 = 0;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Lhd;")
    public static class523 field5072;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "[B")
    private byte[] field5076;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
    public static void method2178(int arg0) {
        field5068 = null;
        if (arg0 == 22407) {
            field5072 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBB)V")
    public final void method1715(int arg0, byte arg1, byte arg2) {
        field5075++;
        if (arg2 != 45) {
            method2179(-43);
        }
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var5 = arg0 * 2;
        int var6 = var5 + 1;
        this.field5076[var5] = var4;
        this.field5076[var6] = var4;
    }

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)V")
    public static final void method2179(int arg0) {
        if (arg0 != 0) {
            method2179(20);
        }
        field5069++;
        class293.field3725 = new class523[class293.field3754.method472((byte) -82)][];
        class110.field1488 = new class523[class293.field3754.method472((byte) -82)][];
        class301.field3876 = new boolean[class293.field3754.method472((byte) -82)];
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class386() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIII)[B")
    public final byte[] method2180(byte arg0, int arg1, int arg2, int arg3) {
        field5071++;
        int var5 = -29 % ((47 - arg0) / 59);
        this.field5076 = new byte[arg1 * arg2 * arg3 * 2];
        this.method2562(arg2, arg3, 128, arg1);
        return this.field5076;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lqn;Lya;B)V")
    public static final void method2181(class47 arg0, class38 arg1, byte arg2) {
        field5070++;
        class311[] var3 = class311.method1819(arg0, class522.field7551, 0);
        class420.field5954 = new class16[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class420.field5954[var4] = arg1.method345(var3[var4], true);
        }
        class311[] var5 = class311.method1819(arg0, class375.field4915, 0);
        class105.field1331 = new class16[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class105.field1331[var6] = arg1.method345(var5[var6], true);
        }
        class311[] var7 = class311.method1819(arg0, class87.field1086, 0);
        class285.field3653 = new class16[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class285.field3653[var8] = arg1.method345(var7[var8], true);
        }
        class311[] var9 = class311.method1819(arg0, class384.field5059, 0);
        class424.field5990 = new class16[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class424.field5990[var10] = arg1.method345(var9[var10], true);
        }
        class311[] var11 = class311.method1819(arg0, class227.field2910, 0);
        class465.field6715 = new class16[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class465.field6715[var12] = arg1.method345(var11[var12], true);
        }
        class311[] var13 = class311.method1819(arg0, class161.field2056, 0);
        class293.field3739 = new class16[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class293.field3739[var14] = arg1.method345(var13[var14], true);
        }
        class311[] var15 = class311.method1819(arg0, class59.field764, 0);
        class510.field7366 = new class16[var15.length];
        if (arg2 <= 21) {
            return;
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            class510.field7366[var16] = arg1.method345(var15[var16], true);
        }
        class311[] var17 = class311.method1819(arg0, class411.field5869, 0);
        class320.field4065 = new class16[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class320.field4065[var18] = arg1.method345(var17[var18], true);
        }
        class311[] var19 = class311.method1819(arg0, class266.field3357, 0);
        class223.field2828 = new class16[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class223.field2828[var20] = arg1.method345(var19[var20], true);
        }
        class311[] var21 = class311.method1819(arg0, class348.field4488, 0);
        class200.field2612 = new class16[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class200.field2612[var22] = arg1.method345(var21[var22], true);
        }
        class311[] var23 = class311.method1819(arg0, class402.field5729, 0);
        class231.field2953 = new class16[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class231.field2953[var24] = arg1.method345(var23[var24], true);
        }
        class311[] var25 = class311.method1819(arg0, class68.field886, 0);
        class6.field61 = new class16[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class6.field61[var26] = arg1.method345(var25[var26], true);
        }
        class48.field613 = arg1.method345(class311.method1816(arg0, class177.field2346, 0), true);
        class264.field3333 = arg1.method345(class311.method1816(arg0, class354.field4545, 0), true);
        class311[] var27 = class311.method1819(arg0, class80.field1027, 0);
        class532.field7820 = new class16[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class532.field7820[var28] = arg1.method345(var27[var28], true);
        }
    }
}
