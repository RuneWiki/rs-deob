import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class145 extends class278 {

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "I")
    private int field2065 = 1;

    @OriginalMember(owner = "client!cu", name = "K", descriptor = "I")
    private int field2066 = 0;

    @OriginalMember(owner = "client!cu", name = "S", descriptor = "I")
    private int field2074 = 0;

    @OriginalMember(owner = "client!cu", name = "T", descriptor = "Ljm;")
    public static class485 field2075 = new class485(29, -1);

    @OriginalMember(owner = "client!cu", name = "L", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!cu", name = "M", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!cu", name = "N", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!cu", name = "O", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!cu", name = "P", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!cu", name = "Q", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!cu", name = "R", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "(I)V")
    public static final void method929(int arg0) {
        ++field2067;
        if (!class337.field4644) {
            if (arg0 == -16) {
                class337.field4644 = true;
                class351.field4800 = true;
                if (!class437.field6374.field4261) {
                    class260.field3580 += (-12.0F - class260.field3580) / 2.0F;
                } else {
                    class510.field7495 = (float) (-16 & (int) class510.field7495 - 17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILdm;)V")
    public static final void method930(int arg0, class37 arg1) {
        if (arg0 != 7507) {
            field2075 = null;
        }
        arg1.field509 = false;
        ++field2073;
        if (arg1.field508 != null) {
            arg1.field508.field6260 = 0;
        }
        for (class37 var2 = arg1.method242(); var2 != null; var2 = arg1.method244()) {
            method930(7507, var2);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field2065 = arg0.method2099(255);
                }
            } else {
                this.field2066 = arg0.method2099(255);
            }
        } else {
            this.field2074 = arg0.method2099(255);
        }
        ++field2072;
        if (arg1 != -30446) {
            method929(20);
        }
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)V")
    public final void method207(int arg0) {
        ++field2070;
        if (arg0 == 2) {
            class99.method664((byte) -69);
        }
    }

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "(I)V")
    public static void method931(int arg0) {
        if (arg0 < 108) {
            method930(-46, (class37) null);
        }
        field2075 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method932(String arg0, int arg1) {
        ++field2069;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            var3 = (var3 << 5) + (-var3 - -arg0.charAt(var4));
        }
        return arg1 >= -68 ? 123 : var3;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field2068;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (arg0 != -9) {
            this.method207(-27);
        }
        if (super.field3750.field554) {
            int var4 = class454.field6637[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class507.field7456 < ~var6; ++var6) {
                int var7 = class192.field2736[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field2074 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field2065 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field2065;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field2066 == -1) {
                    var12 = class65.field888[(4088 & var12) >> 4] - -4096 >> 1;
                } else if (this.field2066 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BILpk;ILqa;I)V")
    public static final void method933(byte arg0, int arg1, class132 arg2, int arg3, class162 arg4, int arg5) {
        ++field2071;
        class526 var6 = class414.field6075.method1558(-1265, arg2.field1887);
        if (~var6.field7727 != 0) {
            if (arg0 > 64) {
                int var8;
                if (arg2.field1834) {
                    int var7 = arg2.field1905 + arg3;
                    var8 = var7 & 3;
                } else {
                    var8 = 0;
                }
                class529 var9 = var6.method3082(arg4, -106, arg2.field1827, var8);
                if (var9 != null) {
                    int var10 = arg2.field1880;
                    int var11 = arg2.field1881;
                    if ((var8 & 1) == 1) {
                        var10 = arg2.field1881;
                        var11 = arg2.field1880;
                    }
                    int var12 = var9.method126();
                    int var13 = var9.method121();
                    if (var6.field7725) {
                        var12 = var10 * 4;
                        var13 = var11 * 4;
                    }
                    if (var6.field7726 == 0) {
                        var9.method3106(arg1, -(var11 * 4) + arg5 + 4, var12, var13);
                    } else {
                        var9.method119(arg1, -(var11 * 4) + arg5 + 4, var12, var13, 0, var6.field7726 | -16777216, 1);
                    }
                }
            }
        }
    }

    static {
        new class83((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
    }
}
