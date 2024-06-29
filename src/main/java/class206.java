import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class206 extends class212 {

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "Lle;")
    public static class47 field3547 = new class47(0, 0);

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "[S")
    public static short[] field3550;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field3548;
        int[] var3 = super.field3640.method737(true, arg0);
        if (arg1 <= 25) {
            return null;
        } else {
            if (super.field3640.field1813) {
                int[] var4 = this.method1405(arg0, 0, 34);
                for (int var5 = 0; class26.field452 > var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        if (arg1 != 16383) {
            field3550 = null;
        }
        ++field3546;
        int[][] var3 = super.field3645.method1352(arg0, -127);
        if (super.field3645.field3477) {
            int[][] var4 = this.method1410(arg0, 0, (byte) -63);
            int[] var5 = var3[0];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class26.field452; ++var11) {
                var5[var11] = -var6[var11] + 4096;
                var8[var11] = -var9[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V")
    public static final void method1374(byte arg0) {
        ++field3545;
        class137.method882((byte) 23);
        class87.method586(-82);
        class173.method1155((byte) 91);
        class7.method53(-9437);
        class203.method1362(66);
        class163.method1090(13624);
        class126.method819(true);
        class110.method732(true);
        class86.method578(-962871295);
        class140.method900(-114);
        class216.method1434(11567);
        class120.method792(12800);
        class219.method1457((byte) -117);
        class212.method1403((byte) 59);
        ((class145) class72.field1157).method945((byte) 87);
        class217.field3736.method986(-12939);
        if (arg0 > 69) {
            class21.field382.method96((byte) 125);
            class99.field1626.method96((byte) 119);
            class69.field1111.method96((byte) 68);
            class264.field4600.method96((byte) 79);
            class90.field1435.method96((byte) 97);
            class13.field266.method96((byte) 45);
            class45.field692.method96((byte) 71);
            class254.field4453.method96((byte) 107);
            class196.field3427.method96((byte) 108);
            class132.field2189.method96((byte) 114);
            class229.field3921.method96((byte) 74);
            class148.field2473.method1790(0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field3544;
        if (~arg1 == -1) {
            super.field3651 = ~arg0.method1516((byte) 82) == -2;
        }
        if (arg2 != -3) {
            field3550 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(B)V")
    public static void method1375(byte arg0) {
        if (arg0 == 97) {
            field3547 = null;
            field3550 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class206() {
        super(1, false);
    }
}
