import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class77 extends class518 implements class83 {

    @OriginalMember(owner = "client!jda", name = "R", descriptor = "Z")
    private boolean field1263 = false;

    @OriginalMember(owner = "client!jda", name = "N", descriptor = "Lnq;")
    public class155 field1259;

    @OriginalMember(owner = "client!jda", name = "B", descriptor = "Z")
    private boolean field1247;

    @OriginalMember(owner = "client!jda", name = "G", descriptor = "F")
    public static float field1252;

    @OriginalMember(owner = "client!jda", name = "C", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!jda", name = "D", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!jda", name = "E", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!jda", name = "H", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!jda", name = "I", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!jda", name = "K", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!jda", name = "M", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!jda", name = "O", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!jda", name = "Q", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!jda", name = "S", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jda", name = "T", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!jda", name = "U", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!jda", name = "V", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!jda", name = "W", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!jda", name = "X", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!jda", name = "Y", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!jda", name = "P", descriptor = "Lifa;")
    private class62 field1261;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(Lr;I)Lifa;", line = 3)
    public final class62 method268(class98 arg0, int arg1) {
        ++field1270;
        return arg1 != 0 ? null : this.field1261;
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(Z)Z", line = 18)
    public final boolean method309(boolean arg0) {
        ++field1250;
        return !arg0 ? false : false;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZLr;)Z", line = 30)
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field1262;
        class395 var5 = this.field1259.method1110((byte) -104, false, arg3, arg2, 131072);
        if (var5 == null) {
            return false;
        } else {
            class151 var6 = arg3.method682();
            var6.method883(super.field7895, super.field7894, super.field7896);
            return class384.field5767 ? var5.method1022(arg0, arg1, var6, false, class515.field7222) : var5.method1026(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "(I)Z", line = 47)
    public final boolean method274(int arg0) {
        if (arg0 != -1510217528) {
            this.field1247 = true;
        }
        ++field1248;
        return this.field1263;
    }

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)Z", line = 60)
    public final boolean method270(int arg0) {
        if (arg0 > -42) {
            return true;
        } else {
            ++field1253;
            return false;
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lr;Llt;IIIIIZII)V", line = 72)
    public class77(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4230);
        this.field1259 = new class155(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field1247 = ~arg1.field4250 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)I", line = 81)
    public final int method263(byte arg0) {
        if (arg0 < 10) {
            this.field1247 = true;
        }
        ++field1268;
        return this.field1259.field2224;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lr;Z)V", line = 92)
    public final void method265(class98 arg0, boolean arg1) {
        ++field1249;
        if (arg1) {
            this.field1259.method1109(0, arg0);
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)I", line = 103)
    public final int method271(boolean arg0) {
        ++field1266;
        if (arg0) {
            this.field1259 = null;
        }
        return this.field1259.method1102(-26609);
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(B)V", line = 114)
    public final void method315(byte arg0) {
        if (arg0 < 101) {
            this.field1259 = null;
        }
        ++field1265;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILr;ILcaa;ZII)V", line = 125)
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 >= 24) {
            ++field1257;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I", line = 136)
    public final int method264(int arg0) {
        if (arg0 != -5273) {
            this.field1247 = true;
        }
        ++field1269;
        return this.field1259.field2207;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lr;I)Lhr;", line = 148)
    public final class218 method272(class98 arg0, int arg1) {
        ++field1251;
        class395 var3 = this.field1259.method1110((byte) -104, true, arg0, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class151 var4 = arg0.method682();
            var4.method883(super.field7895, super.field7894, super.field7896);
            class218 var5 = null;
            if (this.field1247) {
                var5 = class187.method1237(1, (byte) 44);
            }
            int var6 = super.field7895 >> 9;
            if (arg1 != -1) {
                this.field1247 = true;
            }
            int var7 = super.field7896 >> 9;
            this.field1259.method1107(var7, -29008, var6, var6, arg0, var7, var4, true, var3);
            if (!class384.field5767) {
                var3.method1054(var4, var5 == null ? null : var5.field2902[0], 0);
            } else {
                var3.method1030(var4, var5 == null ? null : var5.field2902[0], class515.field7222, 0);
            }
            if (this.field1259.field2202 != null) {
                class620 var8 = this.field1259.field2202.method112();
                if (!class384.field5767) {
                    arg0.method679(var8);
                } else {
                    arg0.method708(var8, class515.field7222);
                }
            }
            this.field1263 = var3.method1024() || this.field1259.field2202 != null;
            if (this.field1261 == null) {
                this.field1261 = class249.method1513(super.field7896, super.field7894, var3, 2, super.field7895);
            } else {
                class340.method2112(true, this.field1261, super.field7895, super.field7894, super.field7896, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V", line = 205)
    public final void method276(int arg0) {
        ++field1260;
        if (arg0 < 63) {
            this.method271(false);
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)V", line = 222)
    public static final void method448(int arg0, int arg1) {
        ++field1258;
        class489 var2 = class704.method3942(arg0, arg1, 0);
        var2.method2799(arg1 ^ -123);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(Lr;I)V", line = 232)
    public final void method259(class98 arg0, int arg1) {
        ++field1256;
        class395 var3 = this.field1259.method1110((byte) -104, true, arg0, true, 262144);
        if (var3 != null) {
            int var4 = super.field7895 >> 9;
            int var5 = super.field7896 >> 9;
            class151 var6 = arg0.method682();
            var6.method883(super.field7895, super.field7894, super.field7896);
            this.field1259.method1107(var5, -29008, var4, var4, arg0, var5, var6, false, var3);
        }
        if (arg1 != 11771) {
            this.method258(-53);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLr;)V", line = 259)
    public final void method273(byte arg0, class98 arg1) {
        this.field1259.method1100(false, arg1);
        int var3 = 91 % ((arg0 - 2) / 56);
        ++field1254;
    }

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "(I)I", line = 275)
    public final int method258(int arg0) {
        if (arg0 != -1) {
            return 67;
        } else {
            ++field1267;
            return this.field1259.method1101((byte) 108);
        }
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)Z", line = 289)
    public final boolean method266(int arg0) {
        if (arg0 != 28107) {
            return false;
        } else {
            ++field1255;
            return this.field1259.method1105(-1);
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)I", line = 300)
    public final int method277(byte arg0) {
        if (arg0 != 95) {
            this.method264(-20);
        }
        ++field1264;
        return this.field1259.field2220;
    }
}
