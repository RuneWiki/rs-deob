import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class489 extends class48 {

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "Lwo;")
    public class445 field6770 = new class445();

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "Lqg;")
    public class212 field6779 = new class212();

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "Llfa;")
    private class51 field6774;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V", line = 4)
    public final void method255(int arg0) {
        field6772++;
        this.field6779.method255(arg0);
        for (class506 var2 = (class506) this.field6770.method2506(68); var2 != null; var2 = (class506) this.field6770.method2505(-117)) {
            if (!this.field6774.method276(var2, 124)) {
                int var3 = arg0;
                do {
                    if (var2.field6985 >= var3) {
                        this.method2804(var2, var3, -1);
                        var2.field6985 -= var3;
                        break;
                    }
                    this.method2804(var2, var2.field6985, -1);
                    var3 -= var2.field6985;
                } while (!this.field6774.method283(null, 0, (byte) -61, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lli;II[III)V", line = 46)
    private final void method2803(class506 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (arg2 >= -31) {
            this.method2803(null, -43, -67, null, 40, 24);
        }
        if ((this.field6774.field603[arg0.field6990] & 0x4) != 0 && arg0.field7001 < 0) {
            int var7 = this.field6774.field601[arg0.field6990] / class169.field2422;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field6991) / var7;
                if (arg4 < var8) {
                    arg0.field6991 += arg4 * var7;
                    break;
                }
                arg0.field6997.method253(arg3, arg1, var8);
                arg1 += var8;
                arg0.field6991 += var7 * var8 - 1048576;
                arg4 -= var8;
                int var9 = class169.field2422 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class655 var11 = arg0.field6997;
                if (this.field6774.field632[arg0.field6990] == 0) {
                    arg0.field6997 = class655.method3730(arg0.field7008, var11.method3732(), var11.method3713(), var11.method3721());
                } else {
                    arg0.field6997 = class655.method3730(arg0.field7008, var11.method3732(), 0, var11.method3721());
                    this.field6774.method304(arg0, arg0.field6988.field1976[arg0.field7006] < 0, 8);
                    arg0.field6997.method3719(var9, var11.method3713());
                }
                if (arg0.field6988.field1976[arg0.field7006] < 0) {
                    arg0.field6997.method3727(-1);
                }
                var11.method3703(var9);
                var11.method253(arg3, arg1, arg5 - arg1);
                if (var11.method3715()) {
                    this.field6779.method1341(var11);
                }
            }
        }
        field6778++;
        arg0.field6997.method253(arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([III)V", line = 110)
    public final void method253(int[] arg0, int arg1, int arg2) {
        field6775++;
        this.field6779.method253(arg0, arg1, arg2);
        for (class506 var4 = (class506) this.field6770.method2506(68); var4 != null; var4 = (class506) this.field6770.method2505(-118)) {
            if (!this.field6774.method276(var4, -91)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field6985 >= var6) {
                        this.method2803(var4, var5, -119, arg0, var6, var5 + var6);
                        var4.field6985 -= var6;
                        break;
                    }
                    this.method2803(var4, var5, -118, arg0, var4.field6985, var5 + var6);
                    var6 -= var4.field6985;
                    var5 += var4.field6985;
                } while (!this.field6774.method283(arg0, var5, (byte) -88, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "()I", line = 150)
    public final int method252() {
        field6773++;
        return 0;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "()Leg;", line = 158)
    public final class48 method254() {
        field6776++;
        class506 var1;
        do {
            var1 = (class506) this.field6770.method2505(-112);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6997 == null);
        return var1.field6997;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llfa;)V", line = 246)
    public class489(class51 arg0) {
        this.field6774 = arg0;
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "()Leg;", line = 182)
    public final class48 method257() {
        field6771++;
        class506 var1 = (class506) this.field6770.method2506(68);
        if (var1 == null) {
            return null;
        } else if (var1.field6997 == null) {
            return this.method254();
        } else {
            return var1.field6997;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lli;II)V", line = 200)
    private final void method2804(class506 arg0, int arg1, int arg2) {
        if (~(this.field6774.field603[arg0.field6990] & 0x4) != arg2 && arg0.field7001 < 0) {
            int var4 = this.field6774.field601[arg0.field6990] / class169.field2422;
            int var5 = (var4 + 1048575 - arg0.field6991) / var4;
            arg0.field6991 = arg0.field6991 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field6774.field632[arg0.field6990] == 0) {
                    arg0.field6997 = class655.method3730(arg0.field7008, arg0.field6997.method3732(), arg0.field6997.method3713(), arg0.field6997.method3721());
                } else {
                    arg0.field6997 = class655.method3730(arg0.field7008, arg0.field6997.method3732(), 0, arg0.field6997.method3721());
                    this.field6774.method304(arg0, arg0.field6988.field1976[arg0.field7006] < 0, 8);
                }
                if (arg0.field6988.field1976[arg0.field7006] < 0) {
                    arg0.field6997.method3727(-1);
                }
                arg1 = arg0.field6991 / var4;
            }
        }
        field6777++;
        arg0.field6997.method255(arg1);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZZ)Z", line = 240)
    public static boolean method2805(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
