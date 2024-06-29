import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class222 extends class320 {

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "[[I")
    public int[][] field3709;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "[I")
    public int[] field3710;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "[Z")
    public boolean[] field3711;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "[I")
    public int[] field3697;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Z")
    public static boolean field3705 = false;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Llk;")
    public static class304 field3708;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "[I")
    public static int[] field3702;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[[[I")
    public static int[][][] field3700;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 8)
    public static final void method1620(int arg0) {
        for (int var1 = 0; var1 < client.field4375; var1++) {
            class295 var2 = class254.method1766(var1, 96);
            if (var2 != null && var2.field4713 == 0) {
                class334.field5302[var1] = 0;
                class116.field2006[var1] = 0;
            }
        }
        class104.field1741 = new class79(arg0);
        field3703++;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 33)
    public static final void method1621(int arg0) {
        if (arg0 != 0) {
            method1624((class49) null, (class49) null, (byte) -80, (class49) null, (class49) null);
        }
        class4.field56.method466(~arg0);
        field3699++;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V", line = 44)
    public static final void method1622(int arg0) {
        class4.field54.method734(1);
        if (arg0 != 6160) {
            field3708 = (class304) null;
        }
        class135.field2357.method845(arg0 - 9288);
        field3701++;
        class253.field4074.method845(-3128);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJ)V", line = 62)
    public static final void method1623(int arg0, long arg1) {
        field3706++;
        if (arg0 == 1540 && arg1 != 0L) {
            class84.field1353++;
            class341.field5443.method26(228, 7);
            class341.field5443.method2333(arg1, arg0 ^ 0x63E);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lcg;Lcg;BLcg;Lcg;)V", line = 87)
    public static final void method1624(class49 arg0, class49 arg1, byte arg2, class49 arg3, class49 arg4) {
        class261.field4222 = arg0;
        class12.field150 = arg3;
        if (arg2 != -52) {
            return;
        }
        class51.field803 = arg4;
        class300.field4775 = arg1;
        class109.field1852 = new class137[class51.field803.method453(24190)][];
        field3707++;
        class356.field5615 = new boolean[class51.field803.method453(24190)];
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I[B)V", line = 109)
    public class222(int arg0, byte[] arg1) {
        this.field3704 = arg0;
        class336 var3 = new class336(arg1);
        this.field3698 = var3.method2364(-9069);
        this.field3709 = new int[this.field3698][];
        this.field3710 = new int[this.field3698];
        this.field3711 = new boolean[this.field3698];
        this.field3697 = new int[this.field3698];
        for (int var4 = 0; var4 < this.field3698; var4++) {
            this.field3697[var4] = var3.method2364(-9069);
        }
        for (int var5 = 0; var5 < this.field3698; var5++) {
            this.field3711[var5] = var3.method2364(-9069) == 1;
        }
        for (int var6 = 0; var6 < this.field3698; var6++) {
            this.field3710[var6] = var3.method2339((byte) -46);
        }
        for (int var7 = 0; var7 < this.field3698; var7++) {
            this.field3709[var7] = new int[var3.method2364(-9069)];
        }
        for (int var8 = 0; var8 < this.field3698; var8++) {
            for (int var9 = 0; var9 < this.field3709[var8].length; var9++) {
                this.field3709[var8][var9] = var3.method2364(-9069);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 169)
    public static void method1625(byte arg0) {
        field3708 = null;
        field3702 = null;
        if (arg0 <= -76) {
            field3700 = (int[][][]) null;
        }
    }
}
