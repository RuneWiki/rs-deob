import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class333 extends class429 {

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    private int field4302;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    private int field4309;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Lkba;")
    public static final class92 method1875(int arg0) {
        if (arg0 <= 87) {
            method1876(true, 69, true, 44, (class382) null);
        }
        ++field4307;
        try {
            return (class92) Class.forName("ms").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIZILep;)V")
    public static final void method1876(boolean arg0, int arg1, boolean arg2, int arg3, class382 arg4) {
        ++field4301;
        int var5 = arg4.field5035;
        if (arg0) {
            int var6 = arg4.field4958;
            if (arg4.field4970 != 0) {
                if (~arg4.field4970 == -2) {
                    arg4.field5035 = -arg4.field5102 + arg1;
                } else if (arg4.field4970 == 2) {
                    arg4.field5035 = arg4.field5102 * arg1 >> 14;
                }
            } else {
                arg4.field5035 = arg4.field5102;
            }
            if (arg4.field4971 != 0) {
                if (arg4.field4971 != 1) {
                    if (~arg4.field4971 == -3) {
                        arg4.field4958 = arg4.field5124 * arg3 >> 14;
                    }
                } else {
                    arg4.field4958 = -arg4.field5124 + arg3;
                }
            } else {
                arg4.field4958 = arg4.field5124;
            }
            if (arg4.field4970 == 4) {
                arg4.field5035 = arg4.field5062 * arg4.field4958 / arg4.field5080;
            }
            if (arg4.field4971 == 4) {
                arg4.field4958 = arg4.field5080 * arg4.field5035 / arg4.field5062;
            }
            if (class87.field933 && (~client.method1530(arg4).field3339 != -1 || ~arg4.field5112 == -1)) {
                if (~arg4.field4958 > -6 && arg4.field5035 < 5) {
                    arg4.field5035 = 5;
                    arg4.field4958 = 5;
                } else {
                    if (~arg4.field5035 >= -1) {
                        arg4.field5035 = 5;
                    }
                    if (arg4.field4958 <= 0) {
                        arg4.field4958 = 5;
                    }
                }
            }
            if (class44.field495 == arg4.field5091) {
                class113.field1320 = arg4;
            }
            if (arg2 && arg4.field5097 != null) {
                if (arg4.field5035 != var5 || ~arg4.field4958 != ~var6) {
                    class676 var7 = new class676();
                    var7.field9580 = arg4.field5097;
                    var7.field9585 = arg4;
                    class522.field7480.method3164(var7, 256);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)V")
    public final void method55(int arg0, int arg1, byte arg2) {
        ++field4304;
        if (arg2 <= 108) {
            method1877((String) null, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)V")
    public final void method57(int arg0, byte arg1, int arg2) {
        if (arg1 != -122) {
            method1875(-62);
        }
        ++field4310;
        int var4 = this.field4302 * arg0 >> 12;
        int var5 = this.field4309 * arg0 >> 12;
        int var6 = this.field4306 * arg2 >> 12;
        int var7 = this.field4305 * arg2 >> 12;
        class5.method25(super.field5686, var4, 75, super.field5685, var6, super.field5688, var5, var7);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(IBI)V")
    public final void method54(int arg0, byte arg1, int arg2) {
        ++field4308;
        int var4 = this.field4302 * arg0 >> 12;
        int var5 = this.field4309 * arg0 >> 12;
        int var6 = this.field4306 * arg2 >> 12;
        int var7 = this.field4305 * arg2 >> 12;
        class126.method724(102, super.field5686, var5, var4, var7, var6);
        if (arg1 <= 62) {
            this.field4309 = 94;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIIII)V")
    public class333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4306 = arg1;
        this.field4305 = arg3;
        this.field4302 = arg0;
        this.field4309 = arg2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1877(String arg0, byte arg1) {
        ++field4303;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            int var2 = -17 / ((68 - arg1) / 49);
            String var3 = class487.method2819(2, arg0);
            if (var3 != null) {
                for (int var4 = 0; var4 < class601.field8535; ++var4) {
                    String var5 = class278.field3521[var4];
                    if (var5.startsWith("*")) {
                        var5 = var5.substring(1);
                    }
                    String var6 = class487.method2819(2, var5);
                    if (var6 != null && var6.equals(var3)) {
                        --class601.field8535;
                        for (int var7 = var4; ~class601.field8535 < ~var7; ++var7) {
                            class278.field3521[var7] = class278.field3521[var7 - -1];
                            class13.field113[var7] = class13.field113[var7 + 1];
                            class305.field3983[var7] = class305.field3983[var7 + 1];
                            class30.field354[var7] = class30.field354[var7 + 1];
                            class54.field558[var7] = class54.field558[var7 + 1];
                        }
                        ++class342.field4442;
                        class491.field7117 = class204.field2494;
                        class480.method2802(class459.field6387, 16751);
                        class334.field4314.method2525(class265.method1504(arg0, (byte) 88), -81849);
                        class334.field4314.method2573(arg0, 16746);
                        return;
                    }
                }
            }
        }
    }
}
