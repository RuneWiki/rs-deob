import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class329 extends class28 {

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    private int field4828;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public int field4830;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "F")
    public float field4832;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    private int field4824;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Z")
    public static boolean field4819 = true;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IF)V")
    public abstract void method1720(int arg0, float arg1);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)B")
    public static final byte method2108(int arg0, int arg1, byte arg2) {
        field4822++;
        if (arg2 >= -109) {
            field4819 = false;
        }
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
    public final int method2109(int arg0) {
        field4825++;
        if (arg0 != 14463) {
            this.method2115((byte) 58);
        }
        return this.field4824;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)I")
    public final int method2110(boolean arg0) {
        if (arg0) {
            field4818++;
            return this.field4828;
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
    public abstract void method1721(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
    public static final void method2111(boolean arg0) {
        field4821++;
        int var1 = class552.field7552.length;
        if (arg0) {
            method2111(true);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class552.field7552[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class294.field3947; var4++) {
                    if (class527.field7302[var4] == class339.field4957[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class527.field7302[class294.field3947] = class339.field4957[var2];
                    var3 = class294.field3947++;
                }
                class138 var5 = new class138(class552.field7552[var2]);
                int var6 = 0;
                while (var5.field1745 < class552.field7552[var2].length && var6 < 511 && class306.field4106 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method922((byte) -119);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class339.field4957[var2] >> 8) * 64 + var10 - class253.field3490;
                    int var13 = (class339.field4957[var2] & 0xFF) * 64 - (class186.field2280 - var11);
                    class195 var14 = class318.field4640.method3384((byte) 114, var5.method922((byte) -114));
                    class637 var15 = (class637) class77.field955.method2506(111, (long) var7);
                    if (var15 == null && (var14.field2562 & 0x1) > 0 && class160.field2028 == var9 && var12 >= 0 && class588.field8082 > (var14.field2591 + var12) && var13 >= 0 && var14.field2591 + var13 < class12.field113) {
                        class676 var16 = new class676();
                        var16.field463 = var7;
                        class637 var17 = new class637(var16);
                        class77.field955.method2504((long) var7, 116, var17);
                        class42.field541[class327.field4786++] = var17;
                        class690.field9742[class306.field4106++] = var7;
                        var16.field428 = class430.field5984;
                        var16.method3740(var14, -30929);
                        var16.method238((byte) -81, var16.field9594.field2591);
                        var16.field474 = var16.field9594.field2590 << 3;
                        var16.method240((var16.field9594.field2580 + 4 & 0x25800007) << 11, 0, true);
                        var16.method3732(var9, var13, var12, (byte) 107, true, var16.method241(-25747));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I")
    public final int method2112(int arg0) {
        field4831++;
        if (arg0 != 0) {
            field4827 = 100;
        }
        return this.field4823;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)F")
    public final float method2113(byte arg0) {
        field4829++;
        int var2 = -103 / ((-arg0 - 4) / 36);
        return this.field4832;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)I")
    public final int method2114(byte arg0) {
        if (arg0 > -96) {
            field4827 = 108;
        }
        field4817++;
        return this.field4820;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)I")
    public final int method2115(byte arg0) {
        field4826++;
        return arg0 == -63 ? this.field4830 : 35;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIIF)V")
    public class329(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field4828 = arg3;
        this.field4820 = arg2;
        this.field4830 = arg1;
        this.field4823 = arg0;
        this.field4832 = arg5;
        this.field4824 = arg4;
    }
}
