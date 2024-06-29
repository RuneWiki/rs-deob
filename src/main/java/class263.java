import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class263 extends class98 {

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    private int field4648 = 0;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "Z")
    private boolean field4649 = false;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Z")
    public boolean field4655 = false;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    private int field4666 = 0;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    private int field4656 = -32768;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public int field4647;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    private int field4652;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    public int field4663;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Ljb;")
    private class270 field4653;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Loa;")
    private static class99 field4641 = class221.method1463(2844, "red:");

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Loa;")
    public static class99 field4642 = field4641;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field4658 = 0;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "Loa;")
    public static class99 field4665 = class221.method1463(2844, " <col=00ff80>");

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "Loa;")
    public static class99 field4661 = null;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "Loa;")
    public static class99 field4662 = field4641;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "Loa;")
    private static class99 field4668 = class221.method1463(2844, "Loaded sprites");

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "Loa;")
    public static class99 field4650 = field4668;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "Lkg;")
    private class136 field4667;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLcl;)V")
    private final void method1757(byte arg0, class195 arg1) {
        class27 var3 = (class27) arg1;
        if ((this.field4667 == null || this.field4667.field2374) && (var3.field451 != null || var3.field472 != null)) {
            this.field4667 = new class136(class56.field926, 1, 1);
        }
        if (this.field4667 != null) {
            this.field4667.method928(var3.field451, var3.field472, false, var3.field462, var3.field455, var3.field469);
        }
        if (arg0 != -121) {
            field4658 = 22;
        }
        field4644++;
        this.field4649 = true;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method1758(byte arg0) {
        field4662 = null;
        field4642 = null;
        field4641 = null;
        field4665 = null;
        field4661 = null;
        field4668 = null;
        field4650 = null;
        if (arg0 != 49) {
            method1761((class61) null, -69, -50, 87, 37, 20, 8, true);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Lcl;")
    private final class195 method1759(boolean arg0) {
        field4659++;
        class180 var2 = class90.method610(this.field4652, !arg0);
        class195 var3;
        if (this.field4655) {
            var3 = var2.method1206(120, -1);
        } else {
            var3 = var2.method1206(51, this.field4648);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0) {
                field4662 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
    public final void method1760(int arg0, int arg1) {
        field4654++;
        if (this.field4655) {
            return;
        }
        if (arg1 != 0) {
            this.method1760(92, -65);
        }
        this.field4666 += arg0;
        while (this.field4653.field4749[this.field4648] < this.field4666) {
            this.field4666 -= this.field4653.field4749[this.field4648];
            this.field4648++;
            if (this.field4648 >= this.field4653.field4740.length) {
                this.field4655 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Loc;IIIIIIZ)V")
    public static final void method1761(class61 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1006.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field1006[var9] - class260.field4540;
            int var23 = arg0.field1021[var9] - class240.field4154;
            int var24 = arg0.field1020[var9] - class163.field2869;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1014 != null) {
                class61.field1016[var9] = var25;
                class61.field1009[var9] = var28;
                class61.field1019[var9] = var29;
            }
            class61.field1024[var9] = (var25 << 9) / var29 + class134.field2337;
            class61.field1025[var9] = (var28 << 9) / var29 + class134.field2347;
        }
        class134.field2334 = 0;
        int var10 = arg0.field1023.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field1023[var11];
            int var13 = arg0.field1005[var11];
            int var14 = arg0.field1012[var11];
            int var15 = class61.field1024[var12];
            int var16 = class61.field1024[var13];
            int var17 = class61.field1024[var14];
            int var18 = class61.field1025[var12];
            int var19 = class61.field1025[var13];
            int var20 = class61.field1025[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class281.field4917 && class244.method1581(class134.field2337 + class100.field1718, class196.field3413 + class134.field2347, var18, var19, var20, var15, var16, var17)) {
                    class206.field3570 = arg5;
                    class261.field4598 = arg6;
                }
                if (!arg7) {
                    class134.field2340 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class134.field2345 || var16 > class134.field2345 || var17 > class134.field2345) {
                        class134.field2340 = true;
                    }
                    if (arg0.field1014 == null || arg0.field1014[var11] == -1) {
                        if (arg0.field1007[var11] != 12345678) {
                            class134.method911(var18, var19, var20, var15, var16, var17, arg0.field1007[var11], arg0.field1022[var11], arg0.field1018[var11]);
                        }
                    } else if (!class186.field3294) {
                        int var21 = class134.field2338.method836(arg0.field1014[var11], 11775);
                        class134.method911(var18, var19, var20, var15, var16, var17, class165.method1110(var21, arg0.field1007[var11]), class165.method1110(var21, arg0.field1022[var11]), class165.method1110(var21, arg0.field1018[var11]));
                    } else if (arg0.field1008) {
                        class134.method901(var18, var19, var20, var15, var16, var17, arg0.field1007[var11], arg0.field1022[var11], arg0.field1018[var11], class61.field1016[0], class61.field1016[1], class61.field1016[3], class61.field1009[0], class61.field1009[1], class61.field1009[3], class61.field1019[0], class61.field1019[1], class61.field1019[3], arg0.field1014[var11]);
                    } else {
                        class134.method901(var18, var19, var20, var15, var16, var17, arg0.field1007[var11], arg0.field1022[var11], arg0.field1018[var11], class61.field1016[var12], class61.field1016[var13], class61.field1016[var14], class61.field1009[var12], class61.field1009[var13], class61.field1009[var14], class61.field1019[var12], class61.field1019[var13], class61.field1019[var14], arg0.field1014[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4664++;
        if (!this.field4649) {
            class195 var6 = this.method1759(false);
            if (var6 == null) {
                return;
            }
            this.method1757((byte) -121, var6);
        }
        if (this.field4667 != null) {
            this.field4667.method922(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()I")
    public final int method226() {
        field4646++;
        return this.field4656;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIIJILkg;)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class136 arg10) {
        class195 var13 = this.method1759(false);
        field4657++;
        if (var13 != null) {
            this.method1757((byte) -121, var13);
            var13.method233(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4667);
            this.field4656 = var13.method226();
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIIIIII)V")
    public class263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4645 = arg5 + arg6;
        this.field4647 = arg1;
        this.field4652 = arg0;
        this.field4663 = arg2;
        this.field4643 = arg3;
        this.field4660 = arg4;
        int var8 = class90.method610(this.field4652, true).field3137;
        if (var8 == -1) {
            this.field4655 = true;
        } else {
            this.field4655 = false;
            this.field4653 = class38.method297(132, var8);
        }
    }
}
