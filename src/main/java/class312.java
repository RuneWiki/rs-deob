import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class312 extends class744 implements class722 {

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "Z")
    private boolean field4213 = false;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Lvo;")
    public class43 field4214;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "Z")
    private boolean field4225;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "Llga;")
    public static class712 field4232 = new class712(6, 8);

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Loia;")
    private class90 field4212;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lha;I)Lbd;")
    public final class62 method127(class60 arg0, int arg1) {
        ++field4230;
        class472 var3 = this.field4214.method264(-1, false, 2048, arg0, true);
        if (var3 == null) {
            return null;
        } else {
            class10 var4 = arg0.method410();
            if (arg1 >= -12) {
                this.field4225 = true;
            }
            var4.method33(super.field10345 + super.field2170, super.field2178, super.field10340 + super.field2165);
            class62 var5 = class413.method2384(1, (byte) -47, this.field4225);
            int var6 = super.field2170 >> 9;
            int var7 = super.field2165 >> 9;
            this.field4214.method262(var3, var6, var7, var4, true, var6, arg0, false, var7);
            if (class670.field9312) {
                var3.method243(var4, var5.field678[0], class661.field9249, 0);
            } else {
                var3.method230(var4, var5.field678[0], 0);
            }
            if (this.field4214.field474 != null) {
                class583 var8 = this.field4214.field474.method3116();
                if (class670.field9312) {
                    arg0.method397(var8, class661.field9249);
                } else {
                    arg0.method452(var8);
                }
            }
            this.field4213 = var3.method219() || this.field4214.field474 != null;
            if (this.field4212 != null) {
                class412.method2379(super.field2178, super.field2170, 18, super.field2165, var3, this.field4212);
            } else {
                this.field4212 = class185.method1041(super.field2178, super.field2170, var3, super.field2165, 4);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILha;)V")
    public final void method678(int arg0, class60 arg1) {
        this.field4214.method261((byte) 125, arg1);
        if (arg0 != -25163) {
            this.method134((byte) 25, (class60) null);
        }
        ++field4221;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
    public final int method680(int arg0) {
        if (arg0 != 30472) {
            this.method123(119);
        }
        ++field4218;
        return this.field4214.field460;
    }

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)I")
    public final int method132(int arg0) {
        ++field4227;
        if (arg0 != 0) {
            this.method685(-34);
        }
        return this.field4214.method266((byte) 126);
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        ++field4211;
        if (arg0 != 6540) {
            this.field4213 = false;
        }
        return this.field4213;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)I")
    public final int method686(byte arg0) {
        if (arg0 != 20) {
            this.method123(-38);
        }
        ++field4217;
        return this.field4214.field439;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)I")
    public final int method128(boolean arg0) {
        ++field4219;
        if (arg0) {
            this.method123(-53);
        }
        return this.field4214.method270((byte) -127);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(Lha;I)V")
    public final void method136(class60 arg0, int arg1) {
        ++field4215;
        class472 var3 = this.field4214.method264(-1, false, 262144, arg0, true);
        if (var3 != null) {
            int var4 = super.field2170 >> 9;
            int var5 = super.field2165 >> 9;
            class10 var6 = arg0.method410();
            var6.method33(super.field2170, super.field2178, super.field2165);
            this.field4214.method262(var3, var4, var5, var6, false, var4, arg0, false, var5);
        }
        int var7 = 72 / ((arg1 - 53) / 46);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public final void method681(byte arg0) {
        if (arg0 != -96) {
            this.method136((class60) null, 0);
        }
        ++field4210;
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(B)V")
    public static void method1870(byte arg0) {
        field4232 = null;
        if (arg0 != -94) {
            method1870((byte) 106);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Z")
    public final boolean method682(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field4223;
            return this.field4214.method265(99);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lha;I)V")
    public final void method679(class60 arg0, int arg1) {
        ++field4222;
        if (arg1 != 24447) {
            this.method680(106);
        }
        this.field4214.method259(arg0, 103);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lmg;Z)V")
    public final void method1871(class150 arg0, boolean arg1) {
        this.field4214.method268(arg0, -108);
        ++field4231;
        if (arg1) {
            this.field4213 = true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILha;BI)Z")
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        ++field4226;
        class472 var5 = this.field4214.method264(-1, false, 131072, arg1, false);
        if (var5 == null) {
            return false;
        } else {
            class10 var6 = arg1.method410();
            var6.method33(super.field10345 + super.field2170, super.field2178, super.field10340 + super.field2165);
            if (arg2 < 59) {
                this.method680(111);
            }
            return !class670.field9312 ? var5.method206(arg0, arg3, var6, false, 0) : var5.method196(arg0, arg3, var6, false, 0, class661.field9249);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lha;Lvha;IIIIIZIIIII)V")
    public class312(class60 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field4214 = new class43(arg0, arg1, arg10, arg11, super.field2175, arg3, this, arg7, arg12);
        this.field4225 = arg1.field9610 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Z")
    public final boolean method123(int arg0) {
        int var2 = -92 % ((arg0 - -76) / 47);
        ++field4220;
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
    public static final void method1872(int arg0, boolean arg1) {
        ++class607.field8480;
        ++field4224;
        if (arg0 != -1) {
            method1870((byte) 63);
        }
        class103 var2 = class752.method4186(260, class116.field1541, class449.field6285);
        class27.method104(false, var2);
        for (class526 var3 = (class526) class520.field6994.method2560(94); var3 != null; var3 = (class526) class520.field6994.method2557(arg0)) {
            if (!var3.method314((byte) 78)) {
                var3 = (class526) class520.field6994.method2560(95);
                if (var3 == null) {
                    break;
                }
            }
            if (~var3.field7064 == -1) {
                class303.method1815(16398, arg1, var3, true);
            }
        }
        if (class414.field5851 != null) {
            class277.method1652(1, class414.field5851);
            class414.field5851 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
    public final int method685(int arg0) {
        ++field4216;
        if (arg0 != 4657) {
            field4232 = null;
        }
        return this.field4214.field471;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLha;)Loia;")
    public final class90 method134(byte arg0, class60 arg1) {
        if (arg0 != -53) {
            return null;
        } else {
            ++field4228;
            return this.field4212;
        }
    }
}
