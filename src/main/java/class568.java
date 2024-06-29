import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class568 {

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Lum;")
    public class108 field7933 = new class108();

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "Luv;")
    public static class3 field7949 = new class3(79, 16);

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "[I")
    public static int[] field7950 = new int[1];

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "[Z")
    public static boolean[] field7952 = new boolean[8];

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "F")
    public static float field7951 = 1024.0F;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "Lnc;")
    public static class538 field7953;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "Lum;")
    private class108 field7944;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ltaa;Ltaa;IIZ)I")
    public static final int method3175(class272 arg0, class272 arg1, int arg2, int arg3, boolean arg4) {
        field7943++;
        if (arg3 == 1) {
            int var5 = arg0.field2516;
            int var6 = arg1.field2516;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class550.method3031(arg1.method1666(-1).field6891, class245.field3103, (byte) -52, arg0.method1666(-1).field6891);
        } else {
            if (arg2 != 16) {
                method3180(104, 5, -49, 60, 119, -51);
            }
            if (arg3 == 3) {
                if (arg0.field3454.equals("-")) {
                    if (arg1.field3454.equals("-")) {
                        return 0;
                    } else if (arg4) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (arg1.field3454.equals("-")) {
                    return arg4 ? 1 : -1;
                } else {
                    return class550.method3031(arg1.field3454, class245.field3103, (byte) -52, arg0.field3454);
                }
            } else if (arg3 == 4) {
                if (arg0.method1244(73)) {
                    return arg1.method1244(arg2 ^ 0xFFFFFF93) ? 0 : 1;
                } else if (arg1.method1244(112)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 5) {
                if (arg0.method1240(122)) {
                    return arg1.method1240(87) ? 0 : 1;
                } else if (arg1.method1240(123)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 6) {
                if (arg0.method1243(12709)) {
                    return arg1.method1243(12709) ? 0 : 1;
                } else if (arg1.method1243(12709)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 7) {
                if (arg0.method1245(arg2 ^ 0xFFFFFF82)) {
                    return arg1.method1245(-110) ? 0 : 1;
                } else if (arg1.method1245(arg2 ^ 0xFFFFFF99)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var7 = arg0.field3456;
                int var8 = arg1.field3456;
                if (arg4) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg0.field3452 - arg1.field3452;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)I")
    public final int method3176(boolean arg0) {
        field7948++;
        int var2 = 0;
        class108 var3 = this.field7933.field1403;
        while (this.field7933 != var3) {
            var3 = var3.field1403;
            var2++;
        }
        if (arg0) {
            field7949 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Lum;")
    public final class108 method3177(int arg0) {
        field7937++;
        class108 var2 = this.field7944;
        if (arg0 != 0) {
            field7952 = null;
        }
        if (this.field7933 == var2) {
            this.field7944 = null;
            return null;
        } else {
            this.field7944 = var2.field1399;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
    public final void method3178(int arg0) {
        field7936++;
        if (arg0 != -8299) {
            return;
        }
        while (true) {
            class108 var2 = this.field7933.field1403;
            if (this.field7933 == var2) {
                this.field7944 = null;
                return;
            }
            var2.method589(-8880);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)Z")
    public final boolean method3179(boolean arg0) {
        field7939++;
        if (!arg0) {
            this.field7944 = null;
        }
        return this.field7933.field1403 == this.field7933;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIII)V")
    public static final void method3180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7940++;
        if (arg1 == arg4) {
            class59.method334(arg3, arg1, arg2, arg5, (byte) -59);
            return;
        }
        if (class594.field8575 <= (arg5 - arg1) && class355.field4972 >= arg1 + arg5 && arg2 - arg4 >= class535.field7467 && arg2 + arg4 <= class113.field1453) {
            class202.method1293(arg3, 111, arg1, arg4, arg5, arg2);
        } else {
            class202.method1287(arg4, arg1, (byte) -38, arg2, arg3, arg5);
        }
        if (arg0 <= 112) {
            method3175(null, null, -31, -30, false);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lum;Z)V")
    public final void method3181(class108 arg0, boolean arg1) {
        if (!arg1) {
            field7952 = null;
        }
        if (arg0.field1399 != null) {
            arg0.method589(-8880);
        }
        field7934++;
        arg0.field1403 = this.field7933;
        arg0.field1399 = this.field7933.field1399;
        arg0.field1399.field1403 = arg0;
        arg0.field1403.field1399 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)Lum;")
    public final class108 method3182(byte arg0) {
        field7941++;
        if (arg0 >= -1) {
            method3189(-93);
        }
        class108 var2 = this.field7944;
        if (this.field7933 == var2) {
            this.field7944 = null;
            return null;
        } else {
            this.field7944 = var2.field1403;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lbv;I)V")
    public final void method3183(class568 arg0, int arg1) {
        field7947++;
        this.method3186(this.field7933.field1403, (byte) 125, arg0);
        if (arg1 > -63) {
            field7953 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)Lum;")
    public final class108 method3184(int arg0) {
        if (arg0 != -5295) {
            this.field7933 = null;
        }
        field7945++;
        class108 var2 = this.field7933.field1403;
        if (this.field7933 == var2) {
            return null;
        } else {
            var2.method589(-8880);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)Lum;")
    public final class108 method3185(int arg0) {
        field7942++;
        if (arg0 != 8) {
            this.method3177(122);
        }
        class108 var2 = this.field7933.field1399;
        if (this.field7933 == var2) {
            this.field7944 = null;
            return null;
        } else {
            this.field7944 = var2.field1399;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lum;BLbv;)V")
    private final void method3186(class108 arg0, byte arg1, class568 arg2) {
        field7935++;
        int var4 = -10 / ((arg1 - 50) / 57);
        class108 var5 = this.field7933.field1399;
        this.field7933.field1399 = arg0.field1399;
        arg0.field1399.field1403 = this.field7933;
        if (this.field7933 != arg0) {
            arg0.field1399 = arg2.field7933.field1399;
            arg0.field1399.field1403 = arg0;
            arg2.field7933.field1399 = var5;
            var5.field1403 = arg2.field7933;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lum;B)V")
    public final void method3187(class108 arg0, byte arg1) {
        if (arg0.field1399 != null) {
            arg0.method589(-8880);
        }
        field7938++;
        if (arg1 >= -123) {
            this.method3182((byte) -102);
        }
        arg0.field1399 = this.field7933;
        arg0.field1403 = this.field7933.field1403;
        arg0.field1399.field1403 = arg0;
        arg0.field1403.field1399 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
    public class568() {
        this.field7933.field1399 = this.field7933;
        this.field7933.field1403 = this.field7933;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)Lum;")
    public final class108 method3188(byte arg0) {
        if (arg0 != -100) {
            field7951 = -0.82848096F;
        }
        field7946++;
        class108 var2 = this.field7933.field1403;
        if (this.field7933 == var2) {
            this.field7944 = null;
            return null;
        } else {
            this.field7944 = var2.field1403;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(I)V")
    public static void method3189(int arg0) {
        field7950 = null;
        field7953 = null;
        if (arg0 == -1) {
            field7952 = null;
            field7949 = null;
        }
    }

    static {
        new class344("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field7953 = new class538(16);
    }
}
