import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class348 {

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "Lak;")
    private class498 field5139;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
    private int field5147;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    private int field5131;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "Lqp;")
    private class715 field5148;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "Lufa;")
    public static class740 field5136 = new class740(9, 7);

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public static int field5140 = 0;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "Lgr;")
    public static class530 field5153 = new class530(69, 3);

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "Z")
    public static boolean field5154 = false;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "Z")
    public static boolean field5156;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/Object;IBJ)V")
    public final void method2204(Object arg0, int arg1, byte arg2, long arg3) {
        field5141++;
        if (arg1 > this.field5131) {
            throw new IllegalStateException("s>cs");
        }
        this.method2214(true, arg3);
        this.field5147 -= arg1;
        while (this.field5147 < 0) {
            class533 var8 = (class533) this.field5139.method3030(89);
            this.method2208((byte) 31, var8);
        }
        class555 var6 = new class555(arg0, arg1);
        int var7 = 71 / ((3 - arg2) / 39);
        this.field5148.method4022(var6, 102, arg3);
        this.field5139.method3029(0, var6);
        var6.field5602 = 0L;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public static final void method2205(byte arg0) {
        field5134++;
        class321.field4375++;
        class88 var1 = class448.method2741((byte) 41, class15.field151, class583.field8319);
        int var2 = -22 % ((-arg0 - 43) / 48);
        var1.field1260.method2881(0, (byte) 127);
        class523.method3183(var1, (byte) 31);
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)V")
    public static void method2206(byte arg0) {
        field5136 = null;
        if (arg0 != 120) {
            method2217(43, null, -117);
        }
        field5153 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)V")
    public final void method2207(int arg0, int arg1) {
        if (class400.field5733 != null) {
            for (class533 var3 = (class533) this.field5139.method3025(false); var3 != null; var3 = (class533) this.field5139.method3026(true)) {
                if (var3.method2837(arg1 + 14558)) {
                    if (var3.method2838((byte) -107) == null) {
                        var3.method2656((byte) 125);
                        var3.method2381(15735);
                        this.field5147 += var3.field7775;
                    }
                } else if (++var3.field5602 > (long) arg0) {
                    class533 var4 = class400.field5733.method80(-21361, var3);
                    this.field5148.method4022(var4, arg1 ^ 0xFFFFFF97, var3.field6188);
                    class589.method3465(var4, var3, 111);
                    var3.method2656((byte) 125);
                    var3.method2381(15735);
                }
            }
        }
        field5142++;
        if (arg1 != 1) {
            field5153 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BLci;)V")
    private final void method2208(byte arg0, class533 arg1) {
        if (arg1 != null) {
            arg1.method2656((byte) 125);
            arg1.method2381(15735);
            this.field5147 += arg1.field7775;
        }
        field5146++;
        if (arg0 != 31) {
            field5153 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(II)V")
    public static final void method2209(int arg0, int arg1) {
        if (arg0 > -19) {
            field5154 = true;
        }
        class709.field9963 = -1;
        field5137++;
        class120.field1639 = -1;
        class488.field7039 = arg1;
        class91.method710(false);
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(I)V")
    public class348(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2210(byte arg0) {
        field5149++;
        if (arg0 <= 80) {
            this.field5148 = null;
        }
        class533 var2 = (class533) this.field5148.method4023((byte) -88);
        while (var2 != null) {
            Object var3 = var2.method2838((byte) -107);
            if (var3 != null) {
                return var3;
            }
            class533 var4 = var2;
            var2 = (class533) this.field5148.method4021((byte) 80);
            var4.method2656((byte) 117);
            var4.method2381(15735);
            this.field5147 += var4.field7775;
        }
        return null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2211(int arg0) {
        field5150++;
        class533 var2 = (class533) this.field5148.method4021((byte) 80);
        if (arg0 != 0) {
            this.method2204(null, 81, (byte) 91, 125L);
        }
        while (var2 != null) {
            Object var3 = var2.method2838((byte) -107);
            if (var3 != null) {
                return var3;
            }
            class533 var4 = var2;
            var2 = (class533) this.field5148.method4021((byte) 80);
            var4.method2656((byte) 120);
            var4.method2381(arg0 ^ 0x3D77);
            this.field5147 += var4.field7775;
        }
        return null;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I")
    public final int method2212(int arg0) {
        field5144++;
        if (arg0 != 1) {
            field5140 = 125;
        }
        return this.field5131;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BJLjava/lang/Object;)V")
    public final void method2213(byte arg0, long arg1, Object arg2) {
        field5130++;
        this.method2204(arg2, 1, (byte) 114, arg1);
        if (arg0 != -16) {
            this.method2219(-75);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZJ)V")
    private final void method2214(boolean arg0, long arg1) {
        if (arg0) {
            field5145++;
            class533 var4 = (class533) this.field5148.method4020(arg1, (byte) -88);
            this.method2208((byte) 31, var4);
        }
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(B)I")
    public final int method2215(byte arg0) {
        int var2 = 107 % ((49 - arg0) / 57);
        field5138++;
        return this.field5147;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method2216(int arg0, long arg1) {
        if (arg0 != 0) {
            field5154 = false;
        }
        field5132++;
        class533 var4 = (class533) this.field5148.method4020(arg1, (byte) -65);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2838((byte) -107);
        if (var5 == null) {
            var4.method2656((byte) 123);
            var4.method2381(15735);
            this.field5147 += var4.field7775;
            return null;
        }
        if (var4.method2837(arg0 ^ 0x38DF)) {
            class555 var6 = new class555(var5, var4.field7775);
            this.field5148.method4022(var6, arg0 ^ 0xFFFFFF82, var4.field6188);
            this.field5139.method3029(0, var6);
            var6.field5602 = 0L;
            var4.method2656((byte) 125);
            var4.method2381(15735);
        } else {
            this.field5139.method3029(0, var4);
            var4.field5602 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILvo;I)V")
    public static final void method2217(int arg0, class131 arg1, int arg2) {
        field5133++;
        if (class279.field3914 >= 50 || arg1 == null || arg1.field1797 == null || arg1.field1797.length <= arg2 || arg1.field1797[arg2] == null) {
            return;
        }
        int var3 = arg1.field1797[arg2][0];
        int var4 = var3 >> 8;
        int var5 = (var3 & 0xEF) >> 5;
        if (arg1.field1797[arg2].length > 1) {
            int var6 = (int) (Math.random() * (double) arg1.field1797[arg2].length);
            if (var6 > 0) {
                var4 = arg1.field1797[arg2][var6];
            }
        }
        int var7 = arg0;
        if (arg1.field1804 != null && arg1.field1785 != null) {
            var7 = class68.method603(arg1.field1804[arg2], arg0 ^ 0x1FF, arg1.field1785[arg2]);
        }
        if (arg1.field1787) {
            class588.method3458(var5, var4, 0, false, var7, (byte) -64, 255);
        } else {
            class298.method1856(var4, 0, var7, 255, var5, 50);
        }
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)I")
    public final int method2218(int arg0) {
        field5151++;
        int var2 = arg0;
        for (class533 var3 = (class533) this.field5139.method3025(false); var3 != null; var3 = (class533) this.field5139.method3026(true)) {
            if (!var3.method2837(14559)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V")
    public final void method2219(int arg0) {
        if (arg0 != -5300) {
            this.method2215((byte) -115);
        }
        for (class533 var2 = (class533) this.field5139.method3025(false); var2 != null; var2 = (class533) this.field5139.method3026(true)) {
            if (var2.method2837(14559)) {
                var2.method2656((byte) 120);
                var2.method2381(15735);
                this.field5147 += var2.field7775;
            }
        }
        field5143++;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
    public final void method2220(boolean arg0) {
        field5135++;
        this.field5139.method3031(17294);
        if (!arg0) {
            this.field5148.method4013(-3);
            this.field5147 = this.field5131;
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(II)V")
    public class348(int arg0, int arg1) {
        this.field5139 = new class498();
        this.field5147 = arg0;
        this.field5131 = arg0;
        int var3;
        for (var3 = 1; (var3 + var3) < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field5148 = new class715(var3);
    }
}
