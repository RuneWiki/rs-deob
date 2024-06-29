import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class518 {

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "B")
    public byte field7567 = 0;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "S")
    public short field7568;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "S")
    public short field7565;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "B")
    public byte field7549;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "B")
    public byte field7553;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field7543 = -1;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Z")
    public static boolean field7546 = false;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field7545 = -1;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "B")
    public byte field7555;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "B")
    public byte field7556;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "B")
    public byte field7562;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "B")
    public byte field7572;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Lsm;")
    public class185 field7550;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Lub;")
    public class18 field7563;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "Llg;")
    public class284 field7569;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Llh;")
    public class364 field7559;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Llh;")
    public class364 field7570;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Lpo;")
    public class389 field7564;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "Lfl;")
    public class518 field7571;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "Lwo;")
    public class522 field7551;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lwo;")
    public class522 field7552;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "S")
    public short field7554;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Z")
    public boolean field7557;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
    public boolean field7560;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Z")
    public boolean field7566;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[I")
    public static int[] field7548;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 5)
    public final void method3048(int arg0) {
        field7558++;
        int var2 = 18 / ((arg0 + 35) / 57);
        while (this.field7569 != null) {
            class284 var3 = this.field7569.field4087;
            this.field7569.method1837(-119);
            this.field7569 = var3;
        }
        this.field7567 = 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([Lvg;BI)V", line = 23)
    public static final void method3049(class38[] arg0, byte arg1, int arg2) {
        field7544++;
        if (arg1 != -72) {
            field7542 = 110;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class38 var4 = arg0[var3];
            if (var4 != null && var4.field480 == arg2 && !client.method1333(var4)) {
                if (var4.field492 == 0) {
                    method3049(arg0, (byte) -72, var4.field467);
                    if (var4.field452 != null) {
                        method3049(var4.field452, (byte) -72, var4.field467);
                    }
                    class92 var5 = (class92) class431.field6450.method2605(false, (long) var4.field467);
                    if (var5 != null) {
                        class325.method2011(var5.field1378, 125);
                    }
                }
                if (var4.field492 == 6 && var4.field407 != -1) {
                    class329 var6 = class84.field1295.method1182(var4.field407, 8);
                    if (var6 != null) {
                        var4.field455 += class500.field7364;
                        while (var4.field455 > var6.field4665[var4.field522]) {
                            var4.field455 -= var6.field4665[var4.field522];
                            var4.field522++;
                            if (var6.field4670.length <= var4.field522) {
                                var4.field522 -= var6.field4658;
                                if (var4.field522 < 0 || var6.field4670.length <= var4.field522) {
                                    var4.field522 = 0;
                                }
                            }
                            var4.field443 = var4.field522 + 1;
                            if (var4.field443 >= var6.field4670.length) {
                                var4.field443 -= var6.field4658;
                                if (var4.field443 < 0 || var4.field443 >= var6.field4670.length) {
                                    var4.field443 = -1;
                                }
                            }
                            class350.method2203((byte) -116, var4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIBI)V", line = 110)
    public static final void method3050(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field7547++;
        if (arg4 != 85) {
            return;
        }
        if (arg1 == arg5) {
            class447.method2693(arg0, arg5, 0, arg3, arg2);
        } else if (class494.field7297 <= arg3 - arg5 && class445.field6629 >= (arg3 + arg5) && class37.field393 <= (arg2 - arg1) && class509.field7436 >= arg2 + arg1) {
            class297.method1885(arg2, arg3, arg0, arg1, (byte) 33, arg5);
        } else {
            class12.method77(arg2, arg5, 35, arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 141)
    public static void method3051(boolean arg0) {
        if (!arg0) {
            method3050(-25, 57, 92, -73, (byte) 83, -18);
        }
        field7548 = null;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(III)V", line = 150)
    public class518(int arg0, int arg1, int arg2) {
        this.field7568 = (short) arg1;
        this.field7565 = (short) arg2;
        this.field7553 = this.field7549 = (byte) arg0;
    }
}
