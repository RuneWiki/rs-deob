import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class294 extends class137 {

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Lj;")
    public class159 field4707;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "Loa;")
    public static class101 field4711 = new class101(64);

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "J")
    public static long field4712 = 0L;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Z")
    public static boolean field4713 = false;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "[Llc;")
    public static class307[] field4714 = new class307[14];

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Z")
    public static boolean field4708;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
    public static final void method1955() {
        class49.field814 = 0;
        label191: for (int var0 = 0; var0 < class261.field4200; var0++) {
            class229 var1 = class13.field133[var0];
            if (class174.field2849 != null) {
                for (int var2 = 0; var2 < class174.field2849.length; var2++) {
                    if (class174.field2849[var2] != -1000000 && (var1.field3707 <= class174.field2849[var2] || var1.field3711 <= class174.field2849[var2]) && (var1.field3716 <= class149.field2336[var2] || var1.field3706 <= class149.field2336[var2]) && (var1.field3716 >= class198.field3190[var2] || var1.field3706 >= class198.field3190[var2]) && (var1.field3693 <= class105.field1672[var2] || var1.field3703 <= class105.field1672[var2]) && (var1.field3693 >= class267.field4305[var2] || var1.field3703 >= class267.field4305[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3714 == 1) {
                int var3 = var1.field3702 + class209.field3307 - class39.field562;
                if (var3 >= 0 && var3 <= class209.field3307 + class209.field3307) {
                    int var4 = var1.field3715 + class209.field3307 - class39.field576;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3695 + class209.field3307 - class39.field576;
                    if (var5 > class209.field3307 + class209.field3307) {
                        var5 = class209.field3307 + class209.field3307;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class203.field3245[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class100.field1626 - var1.field3716;
                        if (var7 > 32) {
                            var1.field3712 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3712 = 2;
                            var7 = -var7;
                        }
                        var1.field3700 = (var1.field3693 - class238.field3823 << 8) / var7;
                        var1.field3719 = (var1.field3703 - class238.field3823 << 8) / var7;
                        var1.field3701 = (var1.field3707 - class241.field3841 << 8) / var7;
                        var1.field3710 = (var1.field3711 - class241.field3841 << 8) / var7;
                        class65.field1085[class49.field814++] = var1;
                    }
                }
            } else if (var1.field3714 == 2) {
                int var8 = var1.field3715 + class209.field3307 - class39.field576;
                if (var8 >= 0 && var8 <= class209.field3307 + class209.field3307) {
                    int var9 = var1.field3702 + class209.field3307 - class39.field562;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3698 + class209.field3307 - class39.field562;
                    if (var10 > class209.field3307 + class209.field3307) {
                        var10 = class209.field3307 + class209.field3307;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class203.field3245[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class238.field3823 - var1.field3693;
                        if (var12 > 32) {
                            var1.field3712 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3712 = 4;
                            var12 = -var12;
                        }
                        var1.field3692 = (var1.field3716 - class100.field1626 << 8) / var12;
                        var1.field3718 = (var1.field3706 - class100.field1626 << 8) / var12;
                        var1.field3701 = (var1.field3707 - class241.field3841 << 8) / var12;
                        var1.field3710 = (var1.field3711 - class241.field3841 << 8) / var12;
                        class65.field1085[class49.field814++] = var1;
                    }
                }
            } else if (var1.field3714 == 4) {
                int var13 = var1.field3707 - class241.field3841;
                if (var13 > 128) {
                    int var14 = var1.field3715 + class209.field3307 - class39.field576;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3695 + class209.field3307 - class39.field576;
                    if (var15 > class209.field3307 + class209.field3307) {
                        var15 = class209.field3307 + class209.field3307;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3702 + class209.field3307 - class39.field562;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3698 + class209.field3307 - class39.field562;
                        if (var17 > class209.field3307 + class209.field3307) {
                            var17 = class209.field3307 + class209.field3307;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class203.field3245[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3712 = 5;
                            var1.field3692 = (var1.field3716 - class100.field1626 << 8) / var13;
                            var1.field3718 = (var1.field3706 - class100.field1626 << 8) / var13;
                            var1.field3700 = (var1.field3693 - class238.field3823 << 8) / var13;
                            var1.field3719 = (var1.field3703 - class238.field3823 << 8) / var13;
                            class65.field1085[class49.field814++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)V")
    public static void method1956(int arg0) {
        if (arg0 < 47) {
            field4712 = 30L;
        }
        field4714 = null;
        field4711 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILag;IIIII)V")
    public static final void method1957(int arg0, int arg1, class211 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4710++;
        if (arg7 != 16) {
            return;
        }
        if (class308.field4926) {
            class62.field1025 = 32;
        } else {
            class62.field1025 = 0;
        }
        class308.field4926 = false;
        if (class163.field2642 != 0) {
            if (arg5 >= arg4 && (arg4 + 16) > arg5 && arg6 >= arg1 && arg6 < arg1 + 16) {
                arg2.field3369 -= 4;
                class117.method834(arg2, (byte) -57);
            } else if (arg5 >= arg4 && arg4 + 16 > arg5 && (arg0 + arg1 - 16) <= arg6 && (arg0 + arg1) > arg6) {
                arg2.field3369 += 4;
                class117.method834(arg2, (byte) -57);
            } else if (arg4 - class62.field1025 <= arg5 && arg5 < class62.field1025 + arg4 + 16 && (arg1 + 16) <= arg6 && arg6 < arg0 + arg1 - 16) {
                int var8 = (arg0 - 32) * arg0 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - var8 - 32;
                int var10 = arg6 - arg1 - (var8 / 2) - 16;
                arg2.field3369 = (arg3 - arg0) * var10 / var9;
                class117.method834(arg2, (byte) -57);
                class308.field4926 = true;
            }
        }
        if (class206.field3274 == 0) {
            return;
        }
        int var11 = arg2.field3430;
        if (arg4 - var11 <= arg5 && arg1 <= arg6 && arg4 + 16 > arg5 && (arg0 + arg1) >= arg6) {
            arg2.field3369 += class206.field3274 * 45;
            class117.method834(arg2, (byte) -57);
            return;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lj;)V")
    public class294(class159 arg0) {
        this.field4707 = arg0;
    }
}
