import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field3092 = 0;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Ldd;")
    public static class35 field3097 = class180.method1196((byte) 126, ":assist:");

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field3098 = 0;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field3100 = 0;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Ldd;")
    private static class35 field3099 = class180.method1196((byte) 126, "Cancel");

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Ldd;")
    public static class35 field3102 = field3099;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[S")
    public static short[] field3095 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lhf;")
    public static class76 field3094;

    @OriginalMember(owner = "client!pd", name = "run", descriptor = "()V")
    public final void run() {
        field3093++;
        try {
            while (true) {
                class187 var1 = class71.field1698;
                class161 var2;
                synchronized (class71.field1698) {
                    var2 = (class161) class71.field1698.method1232(25831);
                }
                if (var2 == null) {
                    class204.method1347(100L, false);
                    Object var3 = class97.field2149;
                    synchronized (class97.field2149) {
                        if (class69.field1673 <= 1) {
                            class69.field1673 = 0;
                            class97.field2149.notifyAll();
                            return;
                        }
                        class69.field1673--;
                    }
                } else {
                    if (var2.field3284 == 0) {
                        var2.field3281.method575(var2.field3274, var2.field3274.length, (int) var2.field2416, true);
                        class187 var5 = class71.field1698;
                        synchronized (class71.field1698) {
                            var2.method799(-24265);
                        }
                    } else if (var2.field3284 == 1) {
                        var2.field3274 = var2.field3281.method578((int) var2.field2416, (byte) -87);
                        class187 var4 = class71.field1698;
                        synchronized (class71.field1698) {
                            class19.field373.method1236((byte) -85, var2);
                        }
                    }
                    Object var6 = class97.field2149;
                    synchronized (class97.field2149) {
                        if (class69.field1673 <= 1) {
                            class69.field1673 = 0;
                            class97.field2149.notifyAll();
                            return;
                        }
                        class69.field1673 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class173.method1145((byte) -65, null, var17);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field3095 = null;
        field3094 = null;
        field3102 = null;
        int var1 = 17 / ((arg0 - 36) / 63);
        field3099 = null;
        field3097 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ldd;Ldd;ILag;)[Lba;")
    public static final class12[] method1007(class35 arg0, class35 arg1, int arg2, class8 arg3) {
        field3101++;
        int var4 = arg3.method37(arg0, (byte) -62);
        if (arg2 != -1) {
            field3094 = null;
        }
        int var5 = arg3.method51(var4, arg1, (byte) -65);
        return class88.method648(var4, (byte) 124, var5, arg3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(JB)Ldd;")
    public static final class35 method1008(long arg0, byte arg1) {
        class210.field4152.setTime(new Date(arg0));
        field3096++;
        int var3 = class210.field4152.get(7);
        int var4 = class210.field4152.get(5);
        int var5 = class210.field4152.get(2);
        int var6 = class210.field4152.get(1);
        int var7 = class210.field4152.get(11);
        int var8 = class210.field4152.get(12);
        if (arg1 == -104) {
            int var9 = class210.field4152.get(13);
            return class63.method529(new class35[] { class5.field83[var3 - 1], class170.field3400, class3.method19(var4 / 10, -29578), class3.method19(var4 % 10, arg1 ^ 0x73EE), class148.field3114, class152.field3159[var5], class148.field3114, class3.method19(var6, -29578), class1.field2, class3.method19(var7 / 10, arg1 ^ 0x73EE), class3.method19(var7 % 10, -29578), class38.field842, class3.method19(var8 / 10, -29578), class3.method19(var8 % 10, -29578), class38.field842, class3.method19(var9 / 10, -29578), class3.method19(var9 % 10, -29578), class176.field3591 }, (byte) 69);
        } else {
            return null;
        }
    }
}
