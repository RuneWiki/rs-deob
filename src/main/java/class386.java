import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class386 implements class490 {

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Lqia;")
    public static class547 field5379 = new class547();

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "Lmq;")
    public static class78 field5380 = new class78(41, 2);

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "Ler;")
    public static class222 field5381 = new class222();

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "[S")
    public static short[] field5383 = new short[] { 18, 45, 2, 6, 20, 13, 16, 57 };

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "Lmq;")
    public static class78 field5382 = new class78(30, -1);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 6)
    public static void method2315(byte arg0) {
        field5382 = null;
        field5379 = null;
        field5383 = null;
        int var1 = -55 % ((3 - arg0) / 33);
        field5380 = null;
        field5381 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lfq;[IBJ)Ljava/lang/String;", line = 19)
    public final String method2316(class141 arg0, int[] arg1, byte arg2, long arg3) {
        field5378++;
        if (class210.field2690 == arg0) {
            class258 var6 = class186.field2453.method726(arg1[0], -4);
            return var6.method1572((byte) -83, (int) arg3);
        } else if (class494.field6993 == arg0 || class170.field2237 == arg0) {
            class167 var7 = class190.field2488.method3944(256, (int) arg3);
            return var7.field2149;
        } else if (class97.field1210 == arg0 || class689.field9797 == arg0 || class632.field8769 == arg0) {
            return class186.field2453.method726(arg1[0], -4).method1572((byte) -109, (int) arg3);
        } else {
            if (arg2 <= 83) {
                method2317(91);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 56)
    public static final void method2317(int arg0) {
        if (arg0 < 116) {
            field5382 = null;
        }
        field5377++;
        if (class272.field3446 == 0) {
            return;
        }
        try {
            if ((++class722.field10163) > 2000) {
                if (class426.field6057 != null) {
                    class426.field6057.method872(-1);
                    class426.field6057 = null;
                }
                if (class486.field6915 >= 2) {
                    class219.field2784 = -5;
                    class272.field3446 = 0;
                    return;
                }
                class86.field1102.method1193((byte) -68);
                class486.field6915++;
                class722.field10163 = 0;
                class272.field3446 = 1;
            }
            if (class272.field3446 == 1) {
                class641.field8859 = class86.field1102.method1192((byte) 120, class681.field9312);
                class272.field3446 = 2;
            }
            if (class272.field3446 == 2) {
                if (class641.field8859.field6124 == 2) {
                    throw new IOException();
                }
                if (class641.field8859.field6124 != 1) {
                    return;
                }
                class426.field6057 = class5.method24((Socket) class641.field8859.field6123, (byte) -80, 7500);
                class641.field8859 = null;
                class704.method3905((byte) 119);
                class272.field3446 = 4;
            }
            if (class272.field3446 == 4 && class426.field6057.method873(1, (byte) -127)) {
                class426.field6057.method870(0, 1, class24.field414.field2325, false);
                int var1 = class24.field414.field2325[0] & 0xFF;
                class272.field3446 = 0;
                class219.field2784 = var1;
                class426.field6057.method872(-1);
                class426.field6057 = null;
            }
        } catch (IOException var2) {
            if (class426.field6057 != null) {
                class426.field6057.method872(-1);
                class426.field6057 = null;
            }
            if (class486.field6915 >= 2) {
                class272.field3446 = 0;
                class219.field2784 = -4;
            } else {
                class86.field1102.method1193((byte) -68);
                class722.field10163 = 0;
                class486.field6915++;
                class272.field3446 = 1;
            }
        }
    }
}
