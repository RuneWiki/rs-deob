import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class324 {

    @OriginalMember(owner = "client!av", name = "i", descriptor = "Ltb;")
    private class450 field4167 = new class450(256);

    @OriginalMember(owner = "client!av", name = "h", descriptor = "Lpl;")
    private class612 field4166;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Lcg;")
    public static class601 field4165 = new class601();

    @OriginalMember(owner = "client!av", name = "j", descriptor = "Z")
    public static boolean field4168 = false;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Lcba;")
    public static class250 field4171;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "Lpl;")
    public static class612 field4170;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z")
    public static final boolean method1855(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method1859(107, -16, false, null, null);
        }
        field4164++;
        return class554.method3054((byte) 106, arg1, arg0) || class37.method231(1, arg0, arg1);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Lbh;")
    public final class549 method1856(int arg0, int arg1) {
        field4163++;
        class450 var3 = this.field4167;
        class549 var4;
        synchronized (this.field4167) {
            var4 = (class549) this.field4167.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 17796) {
            this.field4167 = null;
        }
        class612 var5 = this.field4166;
        byte[] var6;
        synchronized (this.field4166) {
            var6 = this.field4166.method3365(arg0, 54, 26);
        }
        class549 var7 = new class549();
        if (var6 != null) {
            var7.method3033(new class630(var6), 13);
        }
        class450 var8 = this.field4167;
        synchronized (this.field4167) {
            this.field4167.method2409((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
    public final void method1857(int arg0, boolean arg1) {
        field4160++;
        class450 var3 = this.field4167;
        synchronized (this.field4167) {
            if (arg1) {
                field4165 = null;
            }
            this.field4167.method2411(!arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public static void method1858(int arg0) {
        if (arg0 < 116) {
            method1859(-3, 52, false, null, null);
        }
        field4171 = null;
        field4170 = null;
        field4165 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZLiw;Liw;)I")
    public static final int method1859(int arg0, int arg1, boolean arg2, class532 arg3, class532 arg4) {
        field4161++;
        if (arg1 == 1) {
            int var5 = arg3.field2901;
            int var6 = arg4.field2901;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class454.method2431(class250.field3068, arg4.method2889((byte) 125).field193, arg3.method2889((byte) 121).field193, -125);
        } else if (arg1 == 3) {
            if (arg3.field7183.equals("-")) {
                if (arg4.field7183.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field7183.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class454.method2431(class250.field3068, arg4.field7183, arg3.field7183, -104);
            }
        } else if (arg1 == 4) {
            if (arg3.method1402(arg0 + 62085)) {
                return arg4.method1402(arg0 ^ 0xFFFFF287) ? 0 : 1;
            } else if (arg4.method1402(29342)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg3.method1401(2)) {
                return arg4.method1401(2) ? 0 : 1;
            } else if (arg4.method1401(2)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 != 6) {
            if (arg0 != -32743) {
                field4170 = null;
            }
            if (arg1 == 7) {
                if (arg3.method1403((byte) 90)) {
                    return arg4.method1403((byte) 40) ? 0 : 1;
                } else if (arg4.method1403((byte) 91)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 8) {
                int var7 = arg3.field7177;
                int var8 = arg4.field7177;
                if (arg2) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg3.field7180 - arg4.field7180;
            }
        } else if (arg3.method1404((byte) -105)) {
            return arg4.method1404((byte) -102) ? 0 : 1;
        } else if (arg4.method1404((byte) -126)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public final void method1860(byte arg0) {
        if (arg0 < 101) {
            return;
        }
        class450 var2 = this.field4167;
        synchronized (this.field4167) {
            this.field4167.method2412((byte) -21);
        }
        field4169++;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public final void method1861(int arg0) {
        field4159++;
        class450 var2 = this.field4167;
        synchronized (this.field4167) {
            this.field4167.method2406(18385);
            if (arg0 != 1) {
                method1858(-65);
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lrf;ILpl;)V")
    public class324(class112 arg0, int arg1, class612 arg2) {
        this.field4166 = arg2;
        this.field4166.method3349(26, true);
    }
}
