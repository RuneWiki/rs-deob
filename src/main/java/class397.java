import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class397 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Llu;")
    public static class610 field5465 = new class610(50, 7);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lqo;")
    public static class21 field5459;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 4)
    public static void method2354(int arg0) {
        if (arg0 == 1009) {
            field5465 = null;
            field5459 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 18)
    public static final void method2355(byte arg0) {
        class117 var1 = class236.field3411;
        synchronized (class236.field3411) {
            class236.field3411.method846(0);
        }
        field5461++;
        class117 var2 = class120.field1690;
        synchronized (class120.field1690) {
            class120.field1690.method846(0);
            int var3 = -84 % ((arg0 + 6) / 51);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 33)
    public static final String method2356(String arg0, int arg1) {
        int var2 = 73 % ((arg1 + 24) / 48);
        field5463++;
        if (class331.field4577.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class331.field4577.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class331.field4577.startsWith("mac")) {
            return "lib" + arg0 + ".jnilib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 55)
    public static final void method2357(byte arg0) {
        field5460++;
        class403.method2371(class307.field4210, (byte) -62);
        class188.field2801++;
        if (class200.field2951 && class394.field5425) {
            int var1 = class623.field9182.method1587((byte) 8);
            int var2 = class623.field9182.method1594(2028208128);
            if (arg0 != 121) {
                method2356(null, 34);
            }
            int var3 = var1 - class114.field1610;
            int var4 = var2 - class595.field8796;
            if (var3 < class180.field2735) {
                var3 = class180.field2735;
            }
            if (class383.field5267 > var4) {
                var4 = class383.field5267;
            }
            if (var3 + class307.field4210.field2527 > class180.field2735 + class57.field716.field2527) {
                var3 = class180.field2735 + class57.field716.field2527 - class307.field4210.field2527;
            }
            if ((class307.field4210.field2459 + var4) > (class383.field5267 + class57.field716.field2459)) {
                var4 = class383.field5267 + class57.field716.field2459 - class307.field4210.field2459;
            }
            int var5 = class57.field716.field2521 + var3 - class180.field2735;
            int var6 = class57.field716.field2404 + var4 - class383.field5267;
            if (class623.field9182.method2333(false)) {
                if (class307.field4210.field2518 < class188.field2801) {
                    int var8 = var3 - class194.field2881;
                    int var9 = var4 - class19.field190;
                    if (var8 > class307.field4210.field2453 || (-class307.field4210.field2453) > var8 || class307.field4210.field2453 < var9 || var9 < (-class307.field4210.field2453)) {
                        class199.field2932 = true;
                    }
                }
                if (class307.field4210.field2414 != null && class199.field2932) {
                    class518 var10 = new class518();
                    var10.field7386 = var6;
                    var10.field7379 = var5;
                    var10.field7383 = class307.field4210.field2414;
                    var10.field7376 = class307.field4210;
                    class98.method757(var10);
                }
            } else {
                if (class199.field2932) {
                    class429.method2511(true);
                    if (class307.field4210.field2545 != null) {
                        class518 var7 = new class518();
                        var7.field7376 = class307.field4210;
                        var7.field7383 = class307.field4210.field2545;
                        var7.field7384 = class569.field8395;
                        var7.field7379 = var5;
                        var7.field7386 = var6;
                        class98.method757(var7);
                    }
                    if (class569.field8395 != null && client.method1621(class307.field4210) != null) {
                        class286.method1777(class307.field4210, (byte) 18, class569.field8395);
                    }
                } else if ((class299.field4105 == 1 || class93.method736(false)) && class103.field1484 > 2) {
                    class102.method770(-16156, class595.field8796 + class19.field190, class114.field1610 - -class194.field2881);
                } else if (class55.method357(arg0 - 122)) {
                    class102.method770(-16156, class595.field8796 + class19.field190, class194.field2881 + class114.field1610);
                }
                class307.field4210 = null;
            }
        } else if (class188.field2801 > 1) {
            class307.field4210 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z", line = 176)
    public static final boolean method2358(int arg0, int arg1, int arg2) {
        field5464++;
        if (arg1 != 8468) {
            field5459 = null;
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Z", line = 190)
    public static final boolean method2359(int arg0, byte arg1) {
        field5462++;
        int var2 = -12 / ((arg1 + 72) / 41);
        if (arg0 == 13 || arg0 == 6 || arg0 == 21 || arg0 == 60 || arg0 == 59) {
            return true;
        } else {
            return arg0 == 20 || arg0 == 1009;
        }
    }
}
