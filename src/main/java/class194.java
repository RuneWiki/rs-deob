import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class194 {

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Loc;")
    private class192 field3435 = new class192();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field3425 = 0;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Loh;")
    public static class258 field3431 = class153.method1046("RuneScape wird geladen )2 bitte warten)3)3)3", 106);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
    public static int[] field3434 = new int[100];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Loc;")
    private class192 field3436;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Loc;", line = 9)
    public final class192 method1304(int arg0) {
        class192 var2 = this.field3435.field3400;
        if (arg0 != 10) {
            field3434 = (int[]) null;
        }
        field3427++;
        if (this.field3435 == var2) {
            return null;
        } else {
            var2.method1298(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loc;I)V", line = 28)
    public final void method1305(class192 arg0, int arg1) {
        if (arg0.field3390 != null) {
            arg0.method1298(true);
        }
        field3433++;
        arg0.field3390 = this.field3435.field3390;
        arg0.field3400 = this.field3435;
        arg0.field3390.field3400 = arg0;
        arg0.field3400.field3390 = arg0;
        if (arg1 != 0) {
            field3419 = -26;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I", line = 54)
    public final int method1306(int arg0) {
        field3420++;
        class192 var2 = this.field3435.field3400;
        int var3 = arg0;
        while (this.field3435 != var2) {
            var2 = var2.field3400;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 72)
    public static void method1307(byte arg0) {
        if (arg0 > -32) {
            field3431 = (class258) null;
        }
        field3431 = null;
        field3434 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)Loc;", line = 87)
    public final class192 method1308(byte arg0) {
        field3430++;
        if (arg0 != -100) {
            method1312(7, 62, -125, 106);
        }
        class192 var2 = this.field3435.field3400;
        if (this.field3435 == var2) {
            this.field3436 = null;
            return null;
        } else {
            this.field3436 = var2.field3400;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)Loc;", line = 117)
    public final class192 method1309(byte arg0) {
        if (arg0 > -120) {
            this.method1308((byte) -109);
        }
        class192 var2 = this.field3436;
        field3429++;
        if (this.field3435 == var2) {
            this.field3436 = null;
            return null;
        } else {
            this.field3436 = var2.field3400;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V", line = 142)
    public final void method1310(byte arg0) {
        while (true) {
            class192 var2 = this.field3435.field3400;
            if (this.field3435 == var2) {
                field3424++;
                if (arg0 <= 95) {
                    this.method1304(-8);
                }
                this.field3436 = null;
                return;
            }
            var2.method1298(true);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqj;IIII)V", line = 161)
    public static final void method1311(class231 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3432++;
        if (class152.field2606 == arg0 || class69.field1195 >= 400) {
            return;
        }
        class258 var5;
        if (arg0.field3993 == 0) {
            boolean var6 = true;
            if (class152.field2606.field3983 != -1 && arg0.field3983 != -1) {
                int var7 = arg0.field3996 < class152.field2606.field3996 ? class152.field2606.field3996 : arg0.field3996;
                int var8 = class152.field2606.field3983 < arg0.field3983 ? class152.field2606.field3983 : arg0.field3983;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class152.field2606.field3996 - arg0.field3996;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            if (arg0.field3978 > arg0.field3996) {
                var5 = class100.method755(-6, new class258[] { arg0.method1547((byte) 122), var6 ? class246.method1683(class152.field2606.field3996, arg0.field3996, 110) : class169.field2869, class121.field2148, class279.field4782, class218.method1481(arg3 + 61, arg0.field3996), class268.field4672, class218.method1481(-69, arg0.field3978 - arg0.field3996), class37.field487 });
            } else {
                var5 = class100.method755(-6, new class258[] { arg0.method1547((byte) 122), var6 ? class246.method1683(class152.field2606.field3996, arg0.field3996, -67) : class169.field2869, class121.field2148, class279.field4782, class218.method1481(-53, arg0.field3996), class37.field487 });
            }
        } else {
            var5 = class100.method755(-6, new class258[] { arg0.method1547((byte) 122), class121.field2148, class225.field3868, class218.method1481(arg3 ^ 0x49, arg0.field3993), class37.field487 });
        }
        if (class145.field2453 == 1) {
            class201.method1335(class218.field3770, class100.method755(-6, new class258[] { class64.field1135, class50.field764, var5 }), arg2, (byte) -104, (long) arg1, arg4, (short) 38);
            class148.field2513++;
        } else if (!class130.field2293) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class283.field4860[var11] != null) {
                    class204.field3534++;
                    short var12 = 0;
                    boolean var13 = false;
                    if (class155.field2663 == 0 && class283.field4860[var11].method1778(-11925, class55.field872)) {
                        if (arg0.field3996 > class152.field2606.field3996) {
                            var12 = 2000;
                        }
                        if (class152.field2606.field3968 != 0 && arg0.field3968 != 0) {
                            if (class152.field2606.field3968 == arg0.field3968) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class76.field1323[var11]) {
                        var12 = 2000;
                    }
                    short var14 = class228.field3944[var11];
                    short var15 = (short) (var12 + var14);
                    class201.method1335(class283.field4860[var11], class100.method755(-6, new class258[] { class169.field2869, var5 }), arg2, (byte) -122, (long) arg1, arg4, var15);
                }
            }
        } else if ((class42.field581 & 0x8) == 8) {
            class281.field4822++;
            class201.method1335(class109.field1924, class100.method755(-6, new class258[] { class96.field1684, class50.field764, var5 }), arg2, (byte) -128, (long) arg1, arg4, (short) 6);
        }
        for (int var16 = 0; var16 < class69.field1195; var16++) {
            if (class227.field3910[var16] == 41) {
                class225.field3849[var16] = class100.method755(class139.method962(arg3, -1), new class258[] { class169.field2869, var5 });
                break;
            }
        }
        if (arg3 != 5) {
            method1311((class231) null, 30, 8, 99, -64);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)I", line = 291)
    public static final int method1312(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        field3421++;
        return arg0 == -6773 ? (arg3 >> 5 << 7) + ((arg1 >> 2 << 10) + (arg2 >> 1)) : -35;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V", line = 336)
    public static final void method1313(int arg0, byte arg1) {
        field3426++;
        if (arg1 < -66) {
            class238 var2 = (class238) class287.field4943.method986((long) arg0, 0);
            if (var2 != null) {
                var2.method1054((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 363)
    public class194() {
        this.field3435.field3400 = this.field3435;
        this.field3435.field3390 = this.field3435;
    }
}
