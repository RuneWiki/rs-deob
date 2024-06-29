import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class48 {

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public int field885 = 128;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public int field884 = 128;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lrn;")
    public static class174 field887 = new class174(81, 2);

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "J")
    public static long field888 = 0L;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lob;I)I")
    public static final int method452(class517 arg0, int arg1) {
        field882++;
        if (arg0.field7638 == 0) {
            return 0;
        } else if (arg1 < 83) {
            return -116;
        } else {
            if (arg0.field7602 != -1) {
                class517 var2 = null;
                if (arg0.field7602 < 32768) {
                    var2 = class34.field668[arg0.field7602];
                } else if (arg0.field7602 >= 32768) {
                    var2 = class183.field2747[arg0.field7602 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field6228 - var2.field6228;
                    int var4 = arg0.field6233 - var2.field6233;
                    if (var3 != 0 || var4 != 0) {
                        arg0.method3088((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, -55);
                    }
                }
            }
            if (arg0 instanceof class256) {
                class256 var5 = (class256) arg0;
                if (var5.field3726 != -1 && (var5.field7690 == 0 || var5.field7695 > 0)) {
                    var5.method3088(var5.field3726, -123);
                    var5.field3726 = -1;
                }
            } else if (arg0 instanceof class255) {
                class255 var6 = (class255) arg0;
                if (var6.field3657 != -1 && (var6.field7690 == 0 || var6.field7695 > 0)) {
                    int var7 = var6.field6228 - ((var6.field3657 - class200.field2931 - class200.field2931) * 64);
                    int var8 = var6.field6233 - ((var6.field3663 - class403.field6059 - class403.field6059) * 64);
                    if (var7 != 0 || var8 != 0) {
                        var6.method3088((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, -75);
                    }
                    var6.field3657 = -1;
                }
            }
            return arg0.method3092(true);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Lqh;")
    public final class48 method453(int arg0) {
        field878++;
        return arg0 == 0 ? new class48(this.field886, this.field884, this.field885, this.field881, this.field879, this.field883) : null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 85) {
            field888 = 55L;
        }
        field889++;
        if (!class355.method2252(arg6, arg5 ^ 0xFFFFFFB0)) {
            return;
        }
        if (class388.field5835[arg6] == null) {
            client.method1357(class22.field438[arg6], -1, arg7, arg0, arg8, arg4, arg1, arg2, arg3, arg9);
        } else {
            client.method1357(class388.field5835[arg6], -1, arg7, arg0, arg8, arg4, arg1, arg2, arg3, arg9);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public static void method455(int arg0) {
        if (arg0 <= 24) {
            method454(-121, 83, -85, -53, -30, (byte) -25, -43, -90, 83, 102);
        }
        field887 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lqh;Z)V")
    public final void method456(class48 arg0, boolean arg1) {
        this.field883 = arg0.field883;
        this.field881 = arg0.field881;
        this.field879 = arg0.field879;
        this.field886 = arg0.field886;
        this.field885 = arg0.field885;
        field880++;
        this.field884 = arg0.field884;
        if (!arg1) {
            this.field883 = -71;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I)V")
    public class48(int arg0) {
        this.field886 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIII)V")
    private class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field883 = arg5;
        this.field884 = arg1;
        this.field886 = arg0;
        this.field879 = arg4;
        this.field881 = arg3;
        this.field885 = arg2;
    }
}
