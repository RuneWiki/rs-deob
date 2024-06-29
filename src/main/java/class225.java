import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class225 extends class400 {

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "Luh;")
    public class168 field3203 = new class168();

    @OriginalMember(owner = "client!bea", name = "C", descriptor = "Lsq;")
    public class180 field3210 = new class180();

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "Lma;")
    private class12 field3207;

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "Lkn;")
    public static class737 field3208 = new class737(11, 8);

    @OriginalMember(owner = "client!bea", name = "F", descriptor = "Lej;")
    public static class124 field3212 = new class124(54, 15);

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!bea", name = "B", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!bea", name = "D", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!bea", name = "G", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!bea", name = "H", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "()Ljba;")
    public final class400 method69() {
        field3211++;
        class326 var1;
        do {
            var1 = (class326) this.field3203.method1264((byte) 122);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4526 == null);
        return var1.field4526;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "([III)V")
    public final void method92(int[] arg0, int arg1, int arg2) {
        field3202++;
        this.field3210.method92(arg0, arg1, arg2);
        for (class326 var4 = (class326) this.field3203.method1269(4); var4 != null; var4 = (class326) this.field3203.method1264((byte) 121)) {
            if (!this.field3207.method77(-107, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field4531 >= var6) {
                        this.method1587(var5 + var6, var4, var5, (byte) -114, var6, arg0);
                        var4.field4531 -= var6;
                        break;
                    }
                    this.method1587(var5 + var6, var4, var5, (byte) -114, var4.field4531, arg0);
                    var5 += var4.field4531;
                    var6 -= var4.field4531;
                } while (!this.field3207.method82(arg0, var6, var4, var5, (byte) -4));
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILua;I)V")
    public static final void method1584(int arg0, class665 arg1, int arg2) {
        class495.field6867 = 0;
        field3201++;
        class291.field4066 = false;
        if (arg0 >= -17) {
            return;
        }
        class104.method951(-21478, arg1);
        class278.method1827(75, arg1);
        if (class291.field4066) {
            System.out.println("---endgpp---");
        }
        if (arg1.field3109 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field3109 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
    public static void method1585(int arg0) {
        if (arg0 != 0) {
            method1585(33);
        }
        field3212 = null;
        field3208 = null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IBLvv;)V")
    private final void method1586(int arg0, byte arg1, class326 arg2) {
        if ((this.field3207.field165[arg2.field4512] & 0x4) != 0 && arg2.field4532 < 0) {
            int var4 = this.field3207.field176[arg2.field4512] / class103.field1834;
            int var5 = (var4 + 1048575 - arg2.field4527) / var4;
            arg2.field4527 = arg0 * var4 + arg2.field4527 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3207.field184[arg2.field4512] == 0) {
                    arg2.field4526 = class563.method3253(arg2.field4522, arg2.field4526.method3256(), arg2.field4526.method3248(), arg2.field4526.method3234());
                } else {
                    arg2.field4526 = class563.method3253(arg2.field4522, arg2.field4526.method3256(), 0, arg2.field4526.method3234());
                    this.field3207.method107(95, arg2.field4530.field3147[arg2.field4516] < 0, arg2);
                }
                if (arg2.field4530.field3147[arg2.field4516] < 0) {
                    arg2.field4526.method3259(-1);
                }
                arg0 = arg2.field4527 / var4;
            }
        }
        field3204++;
        int var6 = -70 / ((14 - arg1) / 61);
        arg2.field4526.method89(arg0);
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "()I")
    public final int method111() {
        field3213++;
        return 0;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public final void method89(int arg0) {
        this.field3210.method89(arg0);
        field3205++;
        for (class326 var2 = (class326) this.field3203.method1269(4); var2 != null; var2 = (class326) this.field3203.method1264((byte) 38)) {
            if (!this.field3207.method77(53, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4531) {
                        this.method1586(var3, (byte) 84, var2);
                        var2.field4531 -= var3;
                        break;
                    }
                    this.method1586(var2.field4531, (byte) 115, var2);
                    var3 -= var2.field4531;
                } while (!this.field3207.method82(null, var3, var2, 0, (byte) -4));
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILvv;IBI[I)V")
    private final void method1587(int arg0, class326 arg1, int arg2, byte arg3, int arg4, int[] arg5) {
        field3214++;
        if (arg3 != -114) {
            this.method111();
        }
        if ((this.field3207.field165[arg1.field4512] & 0x4) != 0 && arg1.field4532 < 0) {
            int var7 = this.field3207.field176[arg1.field4512] / class103.field1834;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field4527) / var7;
                if (arg4 < var8) {
                    arg1.field4527 += arg4 * var7;
                    break;
                }
                arg1.field4526.method92(arg5, arg2, var8);
                arg2 += var8;
                arg1.field4527 += var7 * var8 - 1048576;
                arg4 -= var8;
                int var9 = class103.field1834 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class563 var11 = arg1.field4526;
                if (this.field3207.field184[arg1.field4512] == 0) {
                    arg1.field4526 = class563.method3253(arg1.field4522, var11.method3256(), var11.method3248(), var11.method3234());
                } else {
                    arg1.field4526 = class563.method3253(arg1.field4522, var11.method3256(), 0, var11.method3234());
                    this.field3207.method107(116, arg1.field4530.field3147[arg1.field4516] < 0, arg1);
                    arg1.field4526.method3258(var9, var11.method3248());
                }
                if (arg1.field4530.field3147[arg1.field4516] < 0) {
                    arg1.field4526.method3259(-1);
                }
                var11.method3244(var9);
                var11.method92(arg5, arg2, arg0 - arg2);
                if (var11.method3237()) {
                    this.field3210.method1324(var11);
                }
            }
        }
        arg1.field4526.method92(arg5, arg2, arg4);
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)Lio;")
    public static final class439 method1588(int arg0) {
        field3200++;
        try {
            return (class439) Class.forName("ne").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return arg0 == 15 ? new class446() : null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "()Ljba;")
    public final class400 method103() {
        field3206++;
        class326 var1 = (class326) this.field3203.method1269(4);
        if (var1 == null) {
            return null;
        } else if (var1.field4526 == null) {
            return this.method69();
        } else {
            return var1.field4526;
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lma;)V")
    public class225(class12 arg0) {
        this.field3207 = arg0;
    }
}
