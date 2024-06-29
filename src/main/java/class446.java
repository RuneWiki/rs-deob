import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class446 extends class260 {

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lmga;")
    public static class739 field6252 = new class739(30, -1);

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field6256 = -1;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "Lmw;")
    public static class519 field6253;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method2675(int arg0) {
        ++field6247;
        int var2 = 123 / ((56 - arg0) / 53);
        return class526.method3031(super.field3867.field1270.method4293(36), (byte) 52);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I", line = 18)
    public final int method8(byte arg0) {
        ++field6248;
        if (arg0 != 4) {
            field6252 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 29)
    public static final void method2676(byte arg0) {
        ++field6259;
        if (class674.field9468 == 10) {
            class674.field9468 = 11;
            if (arg0 >= -115) {
                method2680(-19, 6, (String) null);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(ILfca;)V", line = 44)
    public class446(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lfca;)V", line = 50)
    public class446(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)V", line = 53)
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        ++field6251;
        if (arg1 != -107) {
            this.method9(-5, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIBLlda;Llda;)I", line = 64)
    public static final int method2677(boolean arg0, int arg1, byte arg2, class513 arg3, class513 arg4) {
        ++field6258;
        if (arg1 == 1) {
            int var5 = arg3.field10842;
            int var6 = arg4.field10842;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (~arg1 == -3) {
            return class295.method1875(arg3.method2985(-1).field740, false, arg4.method2985(-1).field740, class38.field589);
        } else if (~arg1 == -4) {
            if (!arg3.field7030.equals("-")) {
                if (arg4.field7030.equals("-")) {
                    return !arg0 ? -1 : 1;
                } else {
                    return class295.method1875(arg3.field7030, false, arg4.field7030, class38.field589);
                }
            } else if (arg4.field7030.equals("-")) {
                return 0;
            } else {
                return !arg0 ? 1 : -1;
            }
        } else if (arg1 == 4) {
            if (!arg3.method4355(-115)) {
                return arg4.method4355(-122) ? -1 : 0;
            } else {
                return arg4.method4355(-89) ? 0 : 1;
            }
        } else if (~arg1 == -6) {
            if (arg3.method4352((byte) 48)) {
                return !arg4.method4352((byte) 48) ? 1 : 0;
            } else {
                return arg4.method4352((byte) 48) ? -1 : 0;
            }
        } else if (arg1 == 6) {
            if (arg3.method4351(64)) {
                return arg4.method4351(64) ? 0 : 1;
            } else {
                return arg4.method4351(64) ? -1 : 0;
            }
        } else if (arg1 == 7) {
            if (!arg3.method4359((byte) 16)) {
                return !arg4.method4359((byte) 16) ? 0 : -1;
            } else {
                return !arg4.method4359((byte) 16) ? 1 : 0;
            }
        } else if (~arg1 == -9) {
            int var7 = arg3.field7032;
            int var8 = arg4.field7032;
            if (arg0) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (~var7 == -1001) {
                    var7 = -1;
                }
            } else {
                if (~var7 == 0) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg2 < 13 ? 85 : -arg4.field7034 + arg3.field7034;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLor;)V", line = 162)
    public static final void method2678(int arg0, boolean arg1, class668 arg2) {
        ++field6246;
        int var3 = arg2.field9237 != 0 ? arg2.field9237 : arg2.field9282;
        int var4 = arg2.field9296 == 0 ? arg2.field9297 : arg2.field9296;
        class341.method2160(arg2.field9221, (byte) -118, var3, class111.field1528[arg2.field9221 >> 16], var4, arg1);
        if (arg2.field9289 != null) {
            class341.method2160(arg2.field9221, (byte) -118, var3, arg2.field9289, var4, arg1);
        }
        class237 var5 = (class237) class609.field8283.method3953((long) arg2.field9221, 14);
        if (arg0 >= 120) {
            if (var5 != null) {
                class152.method1121((byte) -112, var4, var3, var5.field3202, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 186)
    public static void method2679(int arg0) {
        field6253 = null;
        if (arg0 != 6) {
            method2676((byte) 116);
        }
        field6252 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILjava/lang/String;)Lob;", line = 197)
    public static final class769 method2680(int arg0, int arg1, String arg2) {
        ++field6254;
        class769 var3;
        try {
            var3 = (class769) Class.forName("oia").newInstance();
        } catch (Throwable var4) {
            var3 = new class102();
        }
        var3.field10596 = arg1;
        var3.field10597 = arg2;
        if (arg0 != 1) {
            field6260 = 31;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I", line = 218)
    public final int method2681(int arg0) {
        ++field6250;
        if (arg0 <= 3) {
            this.method2681(101);
        }
        return super.field3868;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)I", line = 237)
    public final int method4(int arg0, byte arg1) {
        int var3 = -117 / ((arg1 - -53) / 50);
        ++field6249;
        return !class526.method3031(super.field3867.field1270.method4293(112), (byte) 119) ? 3 : 1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 252)
    public final void method2(boolean arg0) {
        if (super.field3867.field1270.method4291(8192) && !class526.method3031(super.field3867.field1270.method4293(67), (byte) 27)) {
            super.field3868 = 0;
        }
        if (arg0) {
            field6253 = null;
        }
        ++field6255;
        if (~super.field3868 > -1 || ~super.field3868 < -2) {
            super.field3868 = this.method8((byte) 4);
        }
    }
}
