import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class477 extends class487 {

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "Lv;")
    public class165 field6612 = new class165();

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "Lkca;")
    public class411 field6621 = new class411();

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "Llp;")
    private class82 field6616;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "Z")
    public static boolean field6613 = false;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field6611 = 0;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "Ljl;")
    public static class729 field6620;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILbf;I)V", line = 3)
    private final void method2840(int arg0, class761 arg1, int arg2) {
        if (arg2 != 0) {
            this.field6616 = null;
        }
        if ((this.field6616.field952[arg1.field10454] & 0x4) != 0 && arg1.field10445 < 0) {
            int var4 = this.field6616.field962[arg1.field10454] / class223.field3174;
            int var5 = (var4 + 1048575 - arg1.field10456) / var4;
            arg1.field10456 = arg1.field10456 + (arg0 * var4) & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field6616.field927[arg1.field10454] == 0) {
                    arg1.field10452 = class168.method1076(arg1.field10467, arg1.field10452.method1087(), arg1.field10452.method1060(), arg1.field10452.method1063());
                } else {
                    arg1.field10452 = class168.method1076(arg1.field10467, arg1.field10452.method1087(), 0, arg1.field10452.method1063());
                    this.field6616.method607(false, arg1, arg1.field10447.field8297[arg1.field10444] < 0);
                }
                if (arg1.field10447.field8297[arg1.field10444] < 0) {
                    arg1.field10452.method1056(-1);
                }
                arg0 = arg1.field10456 / var4;
            }
        }
        field6619++;
        arg1.field10452.method599(arg0);
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "()I", line = 44)
    public final int method613() {
        field6623++;
        return 0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "()Lqp;", line = 54)
    public final class487 method614() {
        field6622++;
        class761 var1 = (class761) this.field6612.method1041(1048832);
        if (var1 == null) {
            return null;
        } else if (var1.field10452 == null) {
            return this.method615();
        } else {
            return var1.field10452;
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "()Lqp;", line = 79)
    public final class487 method615() {
        field6617++;
        class761 var1;
        do {
            var1 = (class761) this.field6612.method1033(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field10452 == null);
        return var1.field10452;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIII)V", line = 100)
    public static final void method2841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class53.field642 = arg2;
        class754.field10395 = arg0;
        if (arg4 >= -101) {
            return;
        }
        class123.field1630 = arg3;
        field6610++;
        class426.field5952 = arg1;
        class439.field6071 = arg5;
        if (class426.field5952 >= 100) {
            int var6 = class123.field1630 * 512 + 256;
            int var7 = class754.field10395 * 512 + 256;
            int var8 = class373.method2316(var6, class435.field6040, var7, -125) - class439.field6071;
            int var9 = var6 - class497.field6818;
            int var10 = var8 - class479.field6645;
            int var11 = var7 - class412.field5779;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class472.field6537 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class326.field4589 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class480.field6657 = 0;
            if (class472.field6537 < 1024) {
                class472.field6537 = 1024;
            }
            if (class472.field6537 > 3072) {
                class472.field6537 = 3072;
            }
        }
        class362.field5225 = -1;
        class5.field30 = -1;
        class695.field9691 = 2;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 148)
    public final void method599(int arg0) {
        this.field6621.method599(arg0);
        field6618++;
        for (class761 var2 = (class761) this.field6612.method1041(1048832); var2 != null; var2 = (class761) this.field6612.method1033(-1)) {
            if (!this.field6616.method610(var2, (byte) -102)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field10450) {
                        this.method2840(var3, var2, 0);
                        var2.field10450 -= var3;
                        break;
                    }
                    this.method2840(var2.field10450, var2, 0);
                    var3 -= var2.field10450;
                } while (!this.field6616.method602(null, var3, var2, -38, 0));
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIII)V", line = 184)
    public static final void method2842(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6624++;
        float var5 = (float) class46.field516 / (float) class46.field509;
        int var6 = arg3;
        int var7 = arg0;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        if (arg2 >= -62) {
            return;
        }
        int var8 = arg1 - (arg0 - var7) / 2;
        int var9 = arg4 - (arg3 - var6) / 2;
        class759.field10432 = -1;
        class612.field8623 = class46.field509 * var9 / var6;
        class83.field1004 = -1;
        class744.field10276 = class46.field516 - class46.field516 * var8 / var7;
        class418.method2528(0);
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Llp;)V", line = 335)
    public class477(class82 arg0) {
        this.field6616 = arg0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "([III)V", line = 217)
    public final void method604(int[] arg0, int arg1, int arg2) {
        field6615++;
        this.field6621.method604(arg0, arg1, arg2);
        for (class761 var4 = (class761) this.field6612.method1041(1048832); var4 != null; var4 = (class761) this.field6612.method1033(-1)) {
            if (!this.field6616.method610(var4, (byte) -102)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field10450 >= var6) {
                        this.method2844(var5 + var6, -7410, var5, var6, var4, arg0);
                        var4.field10450 -= var6;
                        break;
                    }
                    this.method2844(var5 + var6, -7410, var5, var4.field10450, var4, arg0);
                    var6 -= var4.field10450;
                    var5 += var4.field10450;
                } while (!this.field6616.method602(arg0, var6, var4, -70, var5));
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 257)
    public static void method2843(byte arg0) {
        field6620 = null;
        if (arg0 > -55) {
            field6613 = true;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIILbf;[I)V", line = 268)
    private final void method2844(int arg0, int arg1, int arg2, int arg3, class761 arg4, int[] arg5) {
        field6614++;
        if ((this.field6616.field952[arg4.field10454] & 0x4) != 0 && arg4.field10445 < 0) {
            int var7 = this.field6616.field962[arg4.field10454] / class223.field3174;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field10456) / var7;
                if (arg3 < var8) {
                    arg4.field10456 += arg3 * var7;
                    break;
                }
                arg4.field10452.method604(arg5, arg2, var8);
                arg4.field10456 += var7 * var8 - 1048576;
                arg2 += var8;
                arg3 -= var8;
                int var9 = class223.field3174 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class168 var11 = arg4.field10452;
                if (this.field6616.field927[arg4.field10454] == 0) {
                    arg4.field10452 = class168.method1076(arg4.field10467, var11.method1087(), var11.method1060(), var11.method1063());
                } else {
                    arg4.field10452 = class168.method1076(arg4.field10467, var11.method1087(), 0, var11.method1063());
                    this.field6616.method607(false, arg4, arg4.field10447.field8297[arg4.field10444] < 0);
                    arg4.field10452.method1054(var9, var11.method1060());
                }
                if (arg4.field10447.field8297[arg4.field10444] < 0) {
                    arg4.field10452.method1056(-1);
                }
                var11.method1070(var9);
                var11.method604(arg5, arg2, arg0 - arg2);
                if (var11.method1059()) {
                    this.field6621.method2510(var11);
                }
            }
        }
        arg4.field10452.method604(arg5, arg2, arg3);
        if (arg1 != -7410) {
            this.method2844(-125, -109, 29, -22, null, null);
        }
    }
}
