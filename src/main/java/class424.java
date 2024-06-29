import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class424 extends class456 {

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    private int field6065 = 20;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private int field6067 = 0;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    private int field6066 = 0;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    private int field6064 = 1365;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "Lct;")
    public static class285 field6062 = new class285(70, 3);

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "[I")
    public static int[] field6069;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lrt;")
    public static class124 field6068;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "Lct;")
    public static class285 field6073;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "Lqq;")
    public static class459 field6071;

    static {
        new class332("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field6069 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
        field6068 = new class124(1);
        field6073 = new class285(26, 7);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILtq;II)V", line = 3)
    public static final void method2499(int arg0, class63 arg1, int arg2, int arg3) {
        class336.field5036 = arg1;
        ++field6063;
        class401.field5864 = new class484[arg0][arg2];
        if (class363.field5508 != null) {
            class473.field6633 = class466.method2736(class363.field5508[3], class363.field5508[0], 87, class363.field5508[1], class363.field5508[5], class363.field5508[4], class363.field5508[2]);
        }
        class95.field1337 = new class484();
        class361.method2219(arg3 + arg3);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)V", line = 19)
    public static final void method2500(int arg0, int arg1) {
        if (arg0 != 1) {
            field6062 = null;
        }
        ++field6061;
        if (class161.method1094(2007241424, arg1)) {
            class179.method1239(-7, -1, class467.field6572[arg1]);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 33)
    public class424() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBLre;)V", line = 37)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field6066 = arg2.method2631(arg1 ^ 2517);
                    }
                } else {
                    this.field6067 = arg2.method2631(arg1 + 2475);
                }
            } else {
                this.field6065 = arg2.method2631(2530);
            }
        } else {
            this.field6064 = arg2.method2631(2530);
        }
        if (arg1 != 55) {
            field6062 = null;
        }
        ++field6072;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[I", line = 97)
    public final int[] method33(int arg0, int arg1) {
        ++field6060;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            return null;
        } else {
            if (super.field6466.field6153) {
                for (int var4 = 0; ~var4 > ~class156.field2169; ++var4) {
                    int var5 = (class288.field4397[var4] << 12) / this.field6064 + this.field6067;
                    int var6 = (class14.field206[arg1] << 12) / this.field6064 + this.field6066;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 + var12 < 16384 && var13 < this.field6065) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var7 + var11;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = ~(this.field6065 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field6065;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Ljava/lang/String;", line = 167)
    public static final String method2501(byte arg0) {
        ++field6070;
        if (arg0 > -91) {
            return null;
        } else {
            String var1 = "www";
            if (class212.field3183 == class103.field1445) {
                var1 = "www-wtrc";
            } else if (class318.field4777 != class103.field1445) {
                if (class371.field5587 == class103.field1445) {
                    var1 = "www-wtwip";
                }
            } else {
                var1 = "www-wtqa";
            }
            String var2 = "";
            if (class229.field3374 != null) {
                var2 = "/p=" + class229.field3374;
            }
            return "http://" + var1 + "." + class124.field1710.field6121 + ".com/l=" + class4.field85 + "/a=" + class64.field891 + var2 + "/";
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V", line = 197)
    public static void method2502(boolean arg0) {
        field6073 = null;
        if (!arg0) {
            field6062 = null;
            field6071 = null;
            field6069 = null;
            field6068 = null;
        }
    }
}
