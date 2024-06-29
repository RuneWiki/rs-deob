import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class584 {

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Z")
    public static boolean field8436 = true;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public int field8439;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public int field8440;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "[Lkd;")
    public class258[] field8444;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
    public static final void method3343(byte arg0) {
        if (class428.field6169 != null) {
            class428.field6169.method916((byte) 52);
        }
        field8438++;
        if (class589.field8482 != null) {
            class589.field8482.method916((byte) 122);
        }
        int var1 = -6 % ((arg0 - 61) / 54);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Llk;I)V")
    public static final void method3344(class545 arg0, int arg1) {
        int var2 = -54 / ((1 - arg1) / 63);
        field8441++;
        class545 var3 = class82.method837(-106, arg0);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class506.field7173;
            var5 = class310.field4626;
        } else {
            var4 = var3.field7718;
            var5 = var3.field7652;
        }
        class141.method1145(-88, var4, var5, arg0, false);
        class601.method3436(var4, var5, (byte) -122, arg0);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public static final void method3345(int arg0) {
        field8443++;
        for (int var1 = arg0; var1 < class398.field5793; var1++) {
            int var2 = class623.field9010[var1];
            class22 var3 = ((class436) class208.field3179.method2596((long) var2, 48)).field6298;
            int var4 = class126.field2299.method732(arg0 ^ 0xDEA620D8);
            if ((var4 & 0x10) != 0) {
                var4 += class126.field2299.method732(arg0 - 559537960) << 8;
            }
            if ((var4 & 0x40) != 0) {
                var3.field866 = class126.field2299.method729((byte) -62);
                var3.field860 = class126.field2299.method753(true);
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class126.field2299.method752(arg0 - 27278);
                int var6 = class126.field2299.method734((byte) -23);
                var3.method3466(var6, class336.field5031, var5, arg0 + 961237737);
                var3.field8730 = class336.field5031 + 300;
                var3.field8765 = class126.field2299.method713(arg0 ^ 0x7F);
            }
            if ((var4 & 0x800) != 0) {
                int var7 = class126.field2299.method731(26585);
                var3.field8746 = class126.field2299.method713(arg0 + 123);
                var3.field8701 = class126.field2299.method734((byte) -23);
                var3.field8708 = var7 & 0x7FFF;
                var3.field8689 = (var7 & 0x8000) != 0;
                var3.field8742 = class336.field5031 + var3.field8708 + var3.field8746;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field8757 = class126.field2299.method692(-119);
                var3.field8715 = class126.field2299.method710((byte) 43);
                var3.field8772 = class126.field2299.method710((byte) 43);
                var3.field8697 = (byte) class126.field2299.method713(125);
                var3.field8761 = class336.field5031 + class126.field2299.method729((byte) -89);
                var3.field8680 = class336.field5031 + class126.field2299.method731(26585);
            }
            if ((var4 & 0x200) != 0) {
                int var8 = class126.field2299.method734((byte) -23);
                int[] var9 = new int[var8];
                int[] var10 = new int[var8];
                int[] var11 = new int[var8];
                for (int var12 = 0; var12 < var8; var12++) {
                    int var13 = class126.field2299.method723((byte) -25);
                    if (var13 == 65535) {
                        var13 = -1;
                    }
                    var9[var12] = var13;
                    var10[var12] = class126.field2299.method734((byte) -23);
                    var11[var12] = class126.field2299.method731(26585);
                }
                class504.method2997(var10, var3, var11, (byte) 80, var9);
            }
            if ((var4 & 0x400) != 0) {
                int var14 = class126.field2299.method752(-27278);
                int var15 = class126.field2299.method734((byte) -23);
                var3.method3466(var15, class336.field5031, var14, 961237737);
            }
            if ((var4 & 0x4) != 0) {
                int var16 = class126.field2299.method753(true);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class126.field2299.method730(-60);
                int var18 = class126.field2299.method734((byte) -23);
                var3.method3460(var17, false, var18, arg0 + 66, var16);
            }
            if ((var4 & 0x8) != 0) {
                var3.field8770 = class126.field2299.method729((byte) -111);
                if (var3.field8770 == 65535) {
                    var3.field8770 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field880.method2149(false)) {
                    class398.method2450(var3, (byte) -96);
                }
                var3.method461((byte) 7, class317.field4681.method806(class126.field2299.method731(26585), 1));
                var3.method3459(var3.field880.field4978, arg0 ^ 0x52);
                var3.field8675 = var3.field880.field4935 << 3;
                if (var3.field880.method2149(false)) {
                    class461.method2759(var3.field9814, (byte) -44, null, var3.field8787[0], 0, var3, null, var3.field8785[0]);
                }
            }
            if ((var4 & 0x20) != 0) {
                int[] var19 = new int[4];
                for (int var20 = 0; var20 < 4; var20++) {
                    var19[var20] = class126.field2299.method731(26585);
                    if (var19[var20] == 65535) {
                        var19[var20] = -1;
                    }
                }
                int var21 = class126.field2299.method713(126);
                class686.method3859(var3, var19, false, var21);
            }
            if ((var4 & 0x100) != 0) {
                int var22 = class126.field2299.method729((byte) -47);
                int var23 = class126.field2299.method719((byte) -116);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var24 = class126.field2299.method732(-559537960);
                var3.method3460(var23, true, var24, -116, var22);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field8751 = class126.field2299.method710((byte) 43);
                var3.field8750 = class126.field2299.method737(128);
                var3.field8681 = class126.field2299.method710((byte) 43);
                var3.field8711 = class126.field2299.method735(-112);
                var3.field8729 = class126.field2299.method723((byte) -25) + class336.field5031;
                var3.field8719 = class126.field2299.method729((byte) -88) + class336.field5031;
                var3.field8712 = class126.field2299.method713(123);
                var3.field8779 = 1;
                var3.field8681 += var3.field8787[0];
                var3.field8750 += var3.field8785[0];
                var3.field8751 += var3.field8787[0];
                var3.field8711 += var3.field8785[0];
                var3.field8780 = 0;
            }
            if ((var4 & 0x80) != 0) {
                var3.field8756 = class126.field2299.method747(14598);
                var3.field8709 = 100;
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILqh;)V")
    public final void method3346(int arg0, class61 arg1) {
        field8437++;
        this.field8440 = arg1.method740((byte) 99);
        this.field8439 = arg1.method723((byte) -25);
        this.field8444 = new class258[arg1.method732(-559537960)];
        if (arg0 > 51) {
            class598[] var3 = class319.method2053((byte) 121);
            for (int var4 = 0; var4 < this.field8444.length; var4++) {
                this.field8444[var4] = this.method3347(1, var3[arg1.method732(-559537960)], arg1);
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILph;Lqh;)Lkd;")
    private final class258 method3347(int arg0, class598 arg1, class61 arg2) {
        field8442++;
        if (class157.field2681 == arg1) {
            return class424.method2585(arg2, (byte) -50);
        } else if (class654.field9411 == arg1) {
            return class537.method3102(arg2, 0);
        } else if (class699.field9833 == arg1) {
            return class155.method1200(arg2, (byte) 112);
        } else if (class624.field9022 == arg1) {
            return class422.method2566(true, arg2);
        } else if (class147.field2548 == arg1) {
            return class318.method2049(arg2, 20107);
        } else if (arg0 != 1) {
            return null;
        } else if (class82.field1599 == arg1) {
            return class514.method3032(false, arg2);
        } else if (class343.field5107 == arg1) {
            return class501.method2989(arg2, 14);
        } else if (class230.field3462 == arg1) {
            return class323.method2080(false, arg2);
        } else if (class536.field7507 == arg1) {
            return class342.method2200((byte) -94, arg2);
        } else if (class165.field2754 == arg1) {
            return class173.method1300(arg2, 40);
        } else {
            return null;
        }
    }
}
