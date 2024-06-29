import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class326 extends class57 implements class111 {

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "B")
    private byte field4427;

    @OriginalMember(owner = "client!rq", name = "W", descriptor = "Z")
    private boolean field4434;

    @OriginalMember(owner = "client!rq", name = "U", descriptor = "S")
    private short field4432;

    @OriginalMember(owner = "client!rq", name = "Q", descriptor = "B")
    private byte field4429;

    @OriginalMember(owner = "client!rq", name = "T", descriptor = "Z")
    private boolean field4431;

    @OriginalMember(owner = "client!rq", name = "fb", descriptor = "B")
    private byte field4443;

    @OriginalMember(owner = "client!rq", name = "ab", descriptor = "Z")
    private boolean field4438;

    @OriginalMember(owner = "client!rq", name = "bb", descriptor = "Lug;")
    private class325 field4439;

    @OriginalMember(owner = "client!rq", name = "gb", descriptor = "Lsj;")
    private class73 field4444;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4421 = null;

    @OriginalMember(owner = "client!rq", name = "Y", descriptor = "B")
    public static byte field4436;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!rq", name = "R", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!rq", name = "V", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!rq", name = "X", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!rq", name = "Z", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!rq", name = "cb", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!rq", name = "db", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!rq", name = "eb", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!rq", name = "hb", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!rq", name = "ib", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)I")
    public final int method580(int arg0) {
        if (arg0 != 24493) {
            return 73;
        } else {
            ++field4445;
            return this.field4427;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public final void method573(byte arg0) {
        if (arg0 > -100) {
            this.method530(-85);
        }
        ++field4418;
        if (this.field4444 != null) {
            this.field4444.method458();
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILpe;I)Z")
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field4420;
        class73 var5 = this.method2072((byte) -127, arg3, arg2);
        if (var5 != null) {
            class156 var6 = arg2.method226();
            var6.method308(super.field919, super.field920, super.field910);
            return var5.method455(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lpe;B)Lca;")
    public final class415 method572(class391 arg0, byte arg1) {
        ++field4435;
        if (this.field4444 == null) {
            return null;
        } else {
            class156 var3 = arg0.method226();
            if (arg1 > -45) {
                this.field4434 = false;
            }
            var3.method308(super.field922 + super.field919, super.field920, super.field913 + super.field910);
            class415 var4 = null;
            if (this.field4431) {
                var4 = class340.method2159(24579, 1);
            }
            this.field4444.method478(var3, var4 == null ? null : var4.field5799[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILpe;)Lsj;")
    private final class73 method2072(byte arg0, int arg1, class391 arg2) {
        ++field4424;
        if (arg0 >= -117) {
            return null;
        } else if (this.field4444 != null && arg2.method183(this.field4444.method426(), arg1) == 0) {
            return this.field4444;
        } else {
            class265 var4 = this.method2075(arg2, false, arg1, (byte) 13);
            return var4 != null ? var4.field3562 : null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lpe;I)V")
    public final void method574(class391 arg0, int arg1) {
        ++field4419;
        Object var3 = null;
        class325 var5;
        if (this.field4439 == null && this.field4438) {
            class265 var4 = this.method2075(arg0, true, 131072, (byte) 13);
            var5 = var4 == null ? null : var4.field3561;
        } else {
            var5 = this.field4439;
            this.field4439 = null;
        }
        if (var5 != null) {
            class400.method2453(var5, this.field4443, super.field919, super.field910, (boolean[]) null);
        }
        if (arg1 != -28992) {
            method2074((class391) null, -69, 6, (class166) null, -117);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLpe;)V")
    public final void method570(byte arg0, class391 arg1) {
        int var3 = 122 % ((arg0 - 66) / 39);
        ++field4425;
        Object var4 = null;
        class325 var6;
        if (this.field4439 == null && this.field4438) {
            class265 var5 = this.method2075(arg1, true, 131072, (byte) 13);
            var6 = var5 == null ? null : var5.field3561;
        } else {
            var6 = this.field4439;
            this.field4439 = null;
        }
        if (var6 != null) {
            class415.method2573(var6, this.field4443, super.field919, super.field910, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "(I)V")
    public static final void method2073(int arg0) {
        ++field4437;
        while (class417.field5851.method1803(class213.field2961, true) >= 11) {
            int var1 = class417.field5851.method1808(11, -11904);
            if (~var1 == -2048) {
                break;
            }
            boolean var2 = false;
            if (class220.field3044[var1] == null) {
                class220.field3044[var1] = new class338();
                class220.field3044[var1].field4957 = var1;
                var2 = true;
                if (class267.field3604[var1] != null) {
                    class220.field3044[var1].method2143(-128, class267.field3604[var1]);
                }
            }
            class134.field1921[class174.field2579++] = var1;
            class338 var3 = class220.field3044[var1];
            var3.field4937 = class414.field5793;
            int var4 = class88.field1309[class417.field5851.method1808(3, -11904)];
            int var5 = class417.field5851.method1808(5, -11904);
            if (~var5 < -16) {
                var5 -= 32;
            }
            int var6 = class417.field5851.method1808(5, arg0 ^ -31269);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class417.field5851.method1808(1, arg0 + -33499);
            if (~var7 == -2) {
                class344.field4664[class166.field2464++] = var1;
            }
            int var8 = class417.field5851.method1808(1, -11904);
            if (var2) {
                var3.method2274((byte) -67, var4);
            }
            var3.method2149(class95.field1379.field4998[0] + var6, ~var8 == -2, class69.field1046, 55, class95.field1379.field5005[0] - -var5);
        }
        class417.field5851.method1807(arg0 ^ 5516);
        if (arg0 != 21595) {
            method2078(75);
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lpe;Lkk;IIIIZIIIII)V")
    public class326(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class187.method1357(arg10, arg11, -123));
        this.field4427 = (byte) arg11;
        this.field4434 = arg6;
        super.field910 = (short) arg5;
        this.field4432 = (short) arg1.field5157;
        this.field4429 = (byte) arg10;
        this.field4431 = ~arg1.field5204 != -1;
        this.field4443 = (byte) arg2;
        super.field919 = (short) arg3;
        this.field4438 = arg0.method227() && arg1.field5215 && !this.field4434 && ~class179.field2633 != -1;
        class265 var13 = this.method2075(arg0, this.field4438, 1024, (byte) 13);
        if (var13 != null) {
            this.field4439 = var13.field3561;
            this.field4444 = var13.field3562;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lpe;IILfi;I)V")
    public static final void method2074(class391 arg0, int arg1, int arg2, class166 arg3, int arg4) {
        if (arg2 <= 30) {
            method2077((class427) null, (class427) null, 58);
        }
        class71.field1081.method1250(10346);
        ++field4423;
        if (!class315.field4278) {
            for (class430 var5 = (class430) arg3.method1240((byte) -75); var5 != null; var5 = (class430) arg3.method1245(1)) {
                class384 var6 = class212.method1451(var5.field6119, 36);
                if (class387.method2395(42, var6)) {
                    boolean var7 = class43.method405(arg4, var5, var6, arg0, 352, arg1);
                    if (var7) {
                        class334.method2115(var6, var5, 0, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lpe;ZIB)Lil;")
    private final class265 method2075(class391 arg0, boolean arg1, int arg2, byte arg3) {
        ++field4422;
        if (arg3 != 13) {
            return null;
        } else {
            class372 var5 = class10.method53(this.field4432 & 65535, true);
            class411 var6;
            class411 var7;
            if (!this.field4434) {
                var6 = class265.field3566[this.field4443];
                if (this.field4443 >= 3) {
                    var7 = null;
                } else {
                    var7 = class265.field3566[this.field4443 + 1];
                }
            } else {
                var6 = class244.field3367[this.field4443];
                var7 = class265.field3566[0];
            }
            return var5.method2318(super.field910, this.field4427, arg1, arg0, (byte) -30, var6, var7, this.field4429, super.field920, arg2, super.field919);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)I")
    public final int method582(byte arg0) {
        if (arg0 != 22) {
            this.field4443 = -116;
        }
        ++field4428;
        return this.field4432 & 65535;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILpe;)V")
    public final void method581(int arg0, class391 arg1) {
        ++field4433;
        if (arg0 != 0) {
            method2073(-94);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2076(String arg0, int arg1) {
        ++field4446;
        int var2 = arg0.length();
        if (arg1 <= 85) {
            method2073(-57);
        }
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            var3 = arg0.charAt(var4) + -var3 + (var3 << 5);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lrk;Lrk;I)V")
    public static final void method2077(class427 arg0, class427 arg1, int arg2) {
        class89.field1312 = arg0;
        ++field4426;
        if (arg2 == -26873) {
            class293.field3961 = arg1;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lpe;II)Lsj;")
    public final class73 method576(class391 arg0, int arg1, int arg2) {
        ++field4440;
        if (arg2 != -2705) {
            method2073(-94);
        }
        return this.method2072((byte) -128, arg1, arg0);
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)Z")
    public final boolean method577(int arg0) {
        ++field4442;
        if (arg0 != -16528) {
            this.field4439 = null;
        }
        return this.field4438;
    }

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "(I)I")
    public final int method530(int arg0) {
        if (arg0 >= -100) {
            return 50;
        } else {
            ++field4430;
            return this.field4444 != null ? this.field4444.method420() : 0;
        }
    }

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "(I)V")
    public static void method2078(int arg0) {
        field4421 = null;
        if (arg0 != -16) {
            method2073(11);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I")
    public final int method575(int arg0) {
        ++field4441;
        if (arg0 != -15863) {
            this.field4438 = false;
        }
        return this.field4429;
    }
}
