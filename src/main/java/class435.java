import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class435 extends class218 {

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Lvr;")
    public class306 field6459 = new class306();

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "Ljj;")
    public class177 field6472 = new class177();

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lwo;")
    private class225 field6456;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lcm;")
    public static class449 field6454 = new class449(17, 11);

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "[I")
    public static int[] field6464 = new int[6];

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "[I")
    public static int[] field6470 = new int[5];

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field6469 = -1;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Ljava/awt/Image;")
    public static Image field6467;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZIIIIIIF)[[I", line = 4)
    public static final int[][] method2605(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
        field6460++;
        int[][] var9 = new int[arg5][arg0];
        int var10 = 79 % ((4 - arg2) / 33);
        class75 var11 = new class75();
        var11.field1015 = arg7;
        var11.field1010 = arg6;
        var11.field1013 = arg3;
        var11.field1003 = (int) (arg8 * 4096.0F);
        var11.field1005 = arg1;
        var11.method99(-124);
        class170.method1197(arg0, -1072879284, arg5);
        for (int var12 = 0; var12 < arg5; var12++) {
            var11.method499(var12, (byte) 117, var9[var12]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)[Lsi;", line = 35)
    public static final class512[] method2606(int arg0) {
        field6458++;
        if (arg0 > -72) {
            field6454 = null;
        }
        return new class512[] { class437.field6485, class86.field1170, class495.field7239, class265.field3679, class277.field3844, class362.field5611, class332.field5143, class494.field7233, class472.field6904, class389.field5906, class85.field1165, class237.field3375, class269.field3729, class66.field916, class265.field3703 };
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()I", line = 47)
    public final int method1237() {
        field6465++;
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 55)
    public final void method1225(int arg0) {
        field6455++;
        this.field6472.method1225(arg0);
        for (class296 var2 = (class296) this.field6459.method1970(64); var2 != null; var2 = (class296) this.field6459.method1960(24)) {
            if (!this.field6456.method1527(128, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4374) {
                        this.method2608(var2, (byte) 127, var3);
                        var2.field4374 -= var3;
                        break;
                    }
                    this.method2608(var2, (byte) 126, var2.field4374);
                    var3 -= var2.field4374;
                } while (!this.field6456.method1519(false, 0, var3, var2, null));
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V", line = 94)
    public static void method2607(int arg0) {
        field6464 = null;
        field6467 = null;
        field6470 = null;
        int var1 = -74 / ((-arg0 - 60) / 36);
        field6454 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "([III)V", line = 106)
    public final void method1235(int[] arg0, int arg1, int arg2) {
        field6463++;
        this.field6472.method1235(arg0, arg1, arg2);
        for (class296 var4 = (class296) this.field6459.method1970(64); var4 != null; var4 = (class296) this.field6459.method1960(24)) {
            if (!this.field6456.method1527(128, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field4374) {
                        this.method2609(arg0, var4, var6, false, var5, var5 + var6);
                        var4.field4374 -= var5;
                        break;
                    }
                    this.method2609(arg0, var4, var6, false, var4.field4374, var6 + var5);
                    var5 -= var4.field4374;
                    var6 += var4.field4374;
                } while (!this.field6456.method1519(false, var6, var5, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lwm;BI)V", line = 145)
    private final void method2608(class296 arg0, byte arg1, int arg2) {
        if (arg1 < 109) {
            field6467 = null;
        }
        if ((this.field6456.field3232[arg0.field4378] & 0x4) != 0 && arg0.field4397 < 0) {
            int var4 = this.field6456.field3182[arg0.field4378] / class462.field6769;
            int var5 = (var4 + 1048575 - arg0.field4388) / var4;
            arg0.field4388 = arg2 * var4 + arg0.field4388 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field6456.field3227[arg0.field4378] == 0) {
                    arg0.field4390 = class175.method1240(arg0.field4377, arg0.field4390.method1253(), arg0.field4390.method1241(), arg0.field4390.method1230());
                } else {
                    arg0.field4390 = class175.method1240(arg0.field4377, arg0.field4390.method1253(), 0, arg0.field4390.method1230());
                    this.field6456.method1520(arg0, arg0.field4396.field6595[arg0.field4383] < 0, 0);
                }
                if (arg0.field4396.field6595[arg0.field4383] < 0) {
                    arg0.field4390.method1257(-1);
                }
                arg2 = arg0.field4388 / var4;
            }
        }
        field6466++;
        arg0.field4390.method1225(arg2);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([ILwm;IZII)V", line = 185)
    private final void method2609(int[] arg0, class296 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if ((this.field6456.field3232[arg1.field4378] & 0x4) != 0 && arg1.field4397 < 0) {
            int var7 = this.field6456.field3182[arg1.field4378] / class462.field6769;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field4388) / var7;
                if (arg4 < var8) {
                    arg1.field4388 += arg4 * var7;
                    break;
                }
                arg1.field4390.method1235(arg0, arg2, var8);
                arg1.field4388 += var7 * var8 - 1048576;
                arg2 += var8;
                arg4 -= var8;
                int var9 = class462.field6769 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class175 var11 = arg1.field4390;
                if (this.field6456.field3227[arg1.field4378] == 0) {
                    arg1.field4390 = class175.method1240(arg1.field4377, var11.method1253(), var11.method1241(), var11.method1230());
                } else {
                    arg1.field4390 = class175.method1240(arg1.field4377, var11.method1253(), 0, var11.method1230());
                    this.field6456.method1520(arg1, arg1.field4396.field6595[arg1.field4383] < 0, 0);
                    arg1.field4390.method1227(var9, var11.method1241());
                }
                if (arg1.field4396.field6595[arg1.field4383] < 0) {
                    arg1.field4390.method1257(-1);
                }
                var11.method1233(var9);
                var11.method1235(arg0, arg2, arg5 - arg2);
                if (var11.method1250()) {
                    this.field6472.method1272(var11);
                }
            }
        }
        if (arg3) {
            this.field6472 = null;
        }
        field6462++;
        arg1.field4390.method1235(arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()Lho;", line = 246)
    public final class218 method1251() {
        field6461++;
        class296 var1 = (class296) this.field6459.method1970(64);
        if (var1 == null) {
            return null;
        } else if (var1.field4390 == null) {
            return this.method1260();
        } else {
            return var1.field4390;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lwo;)V", line = 316)
    public class435(class225 arg0) {
        this.field6456 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()Lho;", line = 294)
    public final class218 method1260() {
        field6457++;
        class296 var1;
        do {
            var1 = (class296) this.field6459.method1960(24);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4390 == null);
        return var1.field4390;
    }
}
