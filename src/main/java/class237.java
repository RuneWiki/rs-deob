import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class237 extends class117 {

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Lea;")
    public class243 field4207 = new class243();

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Lj;")
    public class114 field4220 = new class114();

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Lac;")
    private class165 field4205;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Lqj;")
    private static class196 field4203 = class80.method502("glow1:", -48);

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field4215 = 0;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "[I")
    public static int[] field4214 = new int[2];

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Lqj;")
    public static class196 field4212 = field4203;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "[I")
    public static int[] field4206 = new int[5];

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Lqj;")
    public static class196 field4221 = field4203;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "Lcj;")
    public static class184 field4210;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        field4206 = null;
        field4203 = null;
        field4212 = null;
        field4221 = null;
        field4214 = null;
        if (arg0 == 122) {
            field4210 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
    public static final void method1590(byte arg0) {
        class236.field4201.method135(76);
        field4216++;
        if (arg0 >= -43) {
            field4213 = -36;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()I")
    public final int method689() {
        field4218++;
        return 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lwb;II)V")
    private final void method1591(class220 arg0, int arg1, int arg2) {
        int var4 = -59 / ((6 - arg1) / 33);
        if ((this.field4205.field2671[arg0.field3951] & 0x4) != 0 && arg0.field3968 < 0) {
            int var5 = this.field4205.field2658[arg0.field3951] / class216.field3884;
            int var6 = (var5 + 1048575 - arg0.field3953) / var5;
            arg0.field3953 = arg0.field3953 + arg2 * var5 & 0xFFFFF;
            if (var6 <= arg2) {
                if (this.field4205.field2669[arg0.field3951] == 0) {
                    arg0.field3945 = class239.method1621(arg0.field3964, arg0.field3945.method1601(), arg0.field3945.method1631(), arg0.field3945.method1608());
                } else {
                    arg0.field3945 = class239.method1621(arg0.field3964, arg0.field3945.method1601(), 0, arg0.field3945.method1608());
                    this.field4205.method1066(arg0.field3950.field4031[arg0.field3959] < 0, arg0, true);
                }
                if (arg0.field3950.field4031[arg0.field3959] < 0) {
                    arg0.field3945.method1611(-1);
                }
                arg2 = arg0.field3953 / var5;
            }
        }
        arg0.field3945.method696(arg2);
        field4204++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()Lbe;")
    public final class117 method699() {
        field4219++;
        class220 var1;
        do {
            var1 = (class220) this.field4207.method1656(-128);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3945 == null);
        return var1.field3945;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public final void method696(int arg0) {
        this.field4220.method696(arg0);
        field4217++;
        for (class220 var2 = (class220) this.field4207.method1651((byte) -93); var2 != null; var2 = (class220) this.field4207.method1656(-73)) {
            if (!this.field4205.method1046(var2, -118)) {
                int var3 = arg0;
                do {
                    if (var2.field3969 >= var3) {
                        this.method1591(var2, -96, var3);
                        var2.field3969 -= var3;
                        break;
                    }
                    this.method1591(var2, 91, var2.field3969);
                    var3 -= var2.field3969;
                } while (!this.field4205.method1063(var2, null, 0, (byte) 73, var3));
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()Lbe;")
    public final class117 method695() {
        class220 var1 = (class220) this.field4207.method1651((byte) -15);
        field4211++;
        if (var1 == null) {
            return null;
        } else if (var1.field3945 == null) {
            return this.method699();
        } else {
            return var1.field3945;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "([III)V")
    public final void method688(int[] arg0, int arg1, int arg2) {
        field4208++;
        this.field4220.method688(arg0, arg1, arg2);
        for (class220 var4 = (class220) this.field4207.method1651((byte) -68); var4 != null; var4 = (class220) this.field4207.method1656(-17)) {
            if (!this.field4205.method1046(var4, -126)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3969 >= var6) {
                        this.method1592(var5 + var6, var4, true, arg0, var5, var6);
                        var4.field3969 -= var6;
                        break;
                    }
                    this.method1592(var5 + var6, var4, true, arg0, var5, var4.field3969);
                    var5 += var4.field3969;
                    var6 -= var4.field3969;
                } while (!this.field4205.method1063(var4, arg0, var5, (byte) 86, var6));
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILwb;Z[III)V")
    private final void method1592(int arg0, class220 arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        if ((this.field4205.field2671[arg1.field3951] & 0x4) != 0 && arg1.field3968 < 0) {
            int var7 = this.field4205.field2658[arg1.field3951] / class216.field3884;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3953) / var7;
                if (var8 > arg5) {
                    arg1.field3953 += arg5 * var7;
                    break;
                }
                arg1.field3945.method688(arg3, arg4, var8);
                arg5 -= var8;
                arg4 += var8;
                arg1.field3953 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                int var10 = class216.field3884 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                class239 var11 = arg1.field3945;
                if (this.field4205.field2669[arg1.field3951] == 0) {
                    arg1.field3945 = class239.method1621(arg1.field3964, var11.method1601(), var11.method1631(), var11.method1608());
                } else {
                    arg1.field3945 = class239.method1621(arg1.field3964, var11.method1601(), 0, var11.method1608());
                    this.field4205.method1066(arg1.field3950.field4031[arg1.field3959] < 0, arg1, true);
                    arg1.field3945.method1632(var10, var11.method1631());
                }
                if (arg1.field3950.field4031[arg1.field3959] < 0) {
                    arg1.field3945.method1611(-1);
                }
                var11.method1614(var10);
                var11.method688(arg3, arg4, arg0 - arg4);
                if (var11.method1600()) {
                    this.field4220.method697(var11);
                }
            }
        }
        if (arg2) {
            arg1.field3945.method688(arg3, arg4, arg5);
            field4209++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lac;)V")
    public class237(class165 arg0) {
        this.field4205 = arg0;
    }
}
