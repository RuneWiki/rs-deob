import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class30 extends class478 implements class278 {

    @OriginalMember(owner = "client!rt", name = "W", descriptor = "Lja;")
    public class101 field492;

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "Z")
    private boolean field479;

    @OriginalMember(owner = "client!rt", name = "X", descriptor = "J")
    public static long field493 = -1L;

    @OriginalMember(owner = "client!rt", name = "eb", descriptor = "Z")
    public static boolean field500 = false;

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "Ltm;")
    public static class112 field482 = new class112("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!rt", name = "Q", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!rt", name = "R", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!rt", name = "S", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!rt", name = "U", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!rt", name = "V", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!rt", name = "Y", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!rt", name = "Z", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!rt", name = "ab", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!rt", name = "bb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!rt", name = "cb", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!rt", name = "db", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!rt", name = "fb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
    public static final void method239(short[] arg0, int arg1, String[] arg2) {
        class73.method501(arg2, 0, arg0, false, arg2.length + -1);
        if (arg1 == 15883) {
            ++field478;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)I")
    public final int method211(boolean arg0) {
        if (!arg0) {
            this.method195(-51);
        }
        ++field496;
        return this.field492.field1413;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lkm;II)Lab;")
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        int var4 = 10 % ((-12 - arg1) / 47);
        ++field488;
        return this.field492.method636(0, false, false, 0, arg0, arg2, (byte) -125);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)V")
    public static final void method240(int arg0, int arg1, int arg2) {
        ++field480;
        int var3 = class328.field4531.method522(arg1 ^ 16941, class180.field2614.method695(-123, class487.field6867));
        for (class106 var4 = (class106) class250.field3514.method1544(-103); var4 != null; var4 = (class106) class250.field3514.method1546((byte) -42)) {
            int var8 = class431.method2523(var4, arg1 + 16868);
            if (~var3 > ~var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class161.field2310 * 16 + 21;
        int var6 = -(var3 / 2) + arg2;
        if (~class67.field987 > ~(var3 + var6)) {
            var6 = -var3 + class67.field987;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg0;
        if (~(arg0 - -var5) < ~class371.field5248) {
            var7 = class371.field5248 - var5;
        }
        if (~var7 > -1) {
            var7 = 0;
        }
        class393.field5531 = var6;
        class351.field4800 = true;
        class214.field3036 = var7;
        class183.field2661 = class161.field2310 * 16 + (!class490.field6921 ? 22 : 26);
        class23.field405 = var3;
        if (arg1 != -16991) {
            method244((byte) -106);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
    public final void method217(boolean arg0) {
        ++field499;
        if (arg0) {
            field493 = 72L;
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)I")
    public final int method219(int arg0) {
        ++field495;
        if (arg0 != -17942) {
            this.method211(false);
        }
        return this.field492.field1425;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)Z")
    public final boolean method214(int arg0) {
        ++field491;
        return arg0 < 24 ? true : this.field492.method638(0);
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(Lkm;I)V")
    public final void method197(class487 arg0, int arg1) {
        ++field494;
        class232 var3 = this.field492.method636(super.field6746, true, true, super.field6765, arg0, 131072, (byte) -126);
        int var4 = -30 % ((arg1 - 64) / 59);
        if (var3 != null) {
            this.field492.method642(super.field6753, super.field6751, super.field6749, arg0, -44, super.field6747, var3, false);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
    public final void method202(byte arg0) {
        ++field501;
        if (arg0 < 42) {
            this.method211(false);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILkm;IZILkj;B)V")
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        ++field489;
        if (arg6 != 59) {
            field493 = 80L;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z[[[Lui;)V")
    public static final void method241(boolean arg0, class406[][][] arg1) {
        if (!arg0) {
            field500 = false;
        }
        for (int var2 = 0; ~arg1.length < ~var2; ++var2) {
            class406[][] var3 = arg1[var2];
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                for (int var5 = 0; ~var5 > ~var3[var4].length; ++var5) {
                    class406 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5621 instanceof class278) {
                            ((class278) var6.field5621).method217(false);
                        }
                        if (var6.field5625 instanceof class278) {
                            ((class278) var6.field5625).method217(false);
                        }
                        if (var6.field5608 instanceof class278) {
                            ((class278) var6.field5608).method217(false);
                        }
                        if (var6.field5617 instanceof class278) {
                            ((class278) var6.field5617).method217(false);
                        }
                        if (var6.field5624 instanceof class278) {
                            ((class278) var6.field5624).method217(false);
                        }
                        for (class146 var7 = var6.field5613; var7 != null; var7 = var7.field2066) {
                            class478 var8 = var7.field2062;
                            if (var8 instanceof class278) {
                                ((class278) var8).method217(false);
                            }
                        }
                    }
                }
            }
        }
        ++field477;
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V")
    public static final void method242(byte arg0) {
        ++field490;
        if (!class449.field6189) {
            if (class104.field1498) {
                class418.field5750 = (float) (-128 & (int) class418.field5750 + 191);
            } else {
                class244.field3452 += (24.0F - class244.field3452) / 2.0F;
            }
            class449.field6189 = true;
            if (arg0 >= -55) {
                method242((byte) 118);
            }
            class343.field4704 = true;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(Lkm;I)V")
    public final void method218(class487 arg0, int arg1) {
        this.field492.method637(false, arg0);
        ++field486;
        if (arg1 >= -73) {
            field493 = 9L;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lkm;I)V")
    public final void method216(class487 arg0, int arg1) {
        int var3 = 49 % ((arg1 - -12) / 60);
        ++field485;
        this.field492.method645(arg0, true);
    }

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)V")
    public static final void method243(int arg0) {
        ++field481;
        class167.field2451 = null;
        if (arg0 < 51) {
            field482 = null;
        }
        class41.field690 = null;
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)Z")
    public final boolean method195(int arg0) {
        ++field484;
        if (arg0 < 91) {
            method244((byte) 80);
        }
        return false;
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)I")
    public final int method205(byte arg0) {
        ++field487;
        return arg0 != 114 ? 124 : this.field492.method640(0);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lkm;Lcj;IIIIIZIIIIIII)V")
    public class30(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field6729 == -2, class464.method2735(arg13, (byte) -105, arg12));
        this.field492 = new class101(arg0, arg1, arg12, arg13, super.field6766, arg3, arg4, arg6, arg7, arg14);
        this.field479 = arg1.field6681 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lkm;BII)Z")
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        ++field498;
        class232 var5 = this.field492.method636(super.field6746, false, false, super.field6765, arg0, 65536, (byte) -116);
        if (var5 == null) {
            return false;
        } else {
            class250 var6 = arg0.method1105();
            if (arg1 < 123) {
                this.method208((class487) null, 123, 82);
            }
            var6.method1382(super.field6765, super.field6755, super.field6746);
            return var5.method75(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
    public final int method215(int arg0) {
        ++field497;
        if (arg0 != -11524) {
            this.field479 = true;
        }
        return this.field492.field1444;
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(Lkm;I)Lto;")
    public final class370 method193(class487 arg0, int arg1) {
        ++field483;
        class232 var3 = this.field492.method636(super.field6746, false, true, super.field6765, arg0, 1024, (byte) -125);
        if (var3 == null) {
            return null;
        } else {
            class250 var4 = arg0.method1105();
            var4.method1382(super.field6765, super.field6755, super.field6746);
            class370 var5 = null;
            if (this.field479) {
                var5 = class277.method1737((byte) 28, 1);
            }
            if (this.field492.field1445 != null) {
                class473 var6 = this.field492.field1445.method567();
                arg0.method1063(var3, var6, var4, var5 != null ? var5.field5233[0] : null, 0);
            } else {
                var3.method41(var4, var5 == null ? null : var5.field5233[0], 0);
            }
            this.field492.method642(super.field6753, super.field6751, super.field6749, arg0, -15, super.field6747, var3, true);
            if (arg1 >= -6) {
                method242((byte) 15);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)V")
    public static void method244(byte arg0) {
        field482 = null;
        int var1 = -11 / ((arg0 - -66) / 41);
    }
}
