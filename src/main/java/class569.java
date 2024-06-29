import java.awt.Dimension;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class569 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
    public static int[] field8213 = new int[1];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lsk;")
    public static class121 field8215;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3387(int arg0) {
        field8212++;
        if (class375.field5435 != null) {
            class375.field5435.method2221(2000);
        }
        if (class224.field3310 != null) {
            class224.field3310.method2221(2000);
        }
        if (arg0 != 0) {
            method3388(false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 30)
    public static void method3388(boolean arg0) {
        field8213 = null;
        field8215 = null;
        if (!arg0) {
            field8213 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 41)
    public static final void method3389(int arg0) {
        int var1 = -29 / ((arg0 - 24) / 47);
        field8211++;
        if (class211.field3164.method211()) {
            class211.field3164.method239(class95.field1383);
            class415.method2505(true);
            if (class416.field5919) {
                class614.method3572((byte) -92, class95.field1383);
            } else {
                Dimension var2 = class95.field1383.getSize();
                class211.field3164.method318(class95.field1383, var2.width, var2.height);
            }
            class211.field3164.method378(class95.field1383);
        } else {
            class403.method2449(false, class243.field3580.field7975.method3775(false), -98);
        }
        class328.method2021(-8586);
        class235.field3518 = true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 74)
    public static final int method3390(String arg0, boolean arg1) {
        field8216++;
        if (!class740.field10332.field4087) {
            return -1;
        } else if (!arg1) {
            return 96;
        } else if (class622.field8851.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class119.method836((byte) -80, arg0);
            if (var2 == null) {
                return -1;
            }
            String var3 = class520.field7506 + var2;
            if (!class584.field8338.method2595(28818, "", var3)) {
                return -1;
            } else if (class584.field8338.method2604(var3, -102)) {
                byte[] var4 = class584.field8338.method2591(var3, (byte) 71, "");
                Object var5 = null;
                File var6;
                try {
                    var6 = class155.method1114(var2, -115);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class321.method1994(var6, (byte) 102);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class740.field10332.method1864(var4, var6, false);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class753.method4191(arg0, 0, var6);
                return 100;
            } else {
                return class584.field8338.method2603(var3, false);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lmda;Lla;Lla;ILeg;Lla;)Z", line = 167)
    public static final boolean method3391(class349 arg0, class423 arg1, class423 arg2, int arg3, class317 arg4, class423 arg5) {
        field8214++;
        class667.field9527 = arg0;
        class202.field3005 = arg1;
        class183.field2534 = arg2;
        if (arg3 >= -108) {
            return true;
        }
        class36.field325 = arg4;
        class281.field3932 = new int[16];
        class648.field9333 = arg5;
        for (int var6 = 0; var6 < 16; var6++) {
            class281.field3932[var6] = 255;
        }
        return true;
    }
}
