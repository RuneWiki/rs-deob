import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class415 {

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field5567 = -1;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "J")
    public static long field5562 = -1L;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "[I")
    public static int[] field5563 = new int[16];

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public int field5570;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Ljava/lang/String;")
    public String field5569;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZZ)V", line = 3)
    public static final void method2334(boolean arg0, boolean arg1) {
        if (arg0) {
            if (class209.field2466 != -1) {
                class22.method100((byte) 61, class209.field2466);
            }
            for (class633 var2 = (class633) class14.field117.method3674(33); var2 != null; var2 = (class633) class14.field117.method3672(-1)) {
                if (!var2.method1925(14325)) {
                    var2 = (class633) class14.field117.method3674(28);
                    if (var2 == null) {
                        break;
                    }
                }
                class604.method3377((byte) 32, var2, false, true);
            }
            class209.field2466 = -1;
            class14.field117 = new class661(8);
            class505.method2899(61);
            class209.field2466 = class246.field3035;
            class175.method1067(false, 2620);
            class64.method346(8);
            class281.method1637(class209.field2466);
        }
        field5566++;
        class637.field8960 = true;
        if (arg1) {
            method2334(false, true);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 48)
    public static final void method2335(String arg0, int arg1) {
        field5564++;
        if (class210.field2549 == null) {
            class488.method2833(22256);
        }
        class541.field7594.setTime(new Date(class557.method3157(-83)));
        int var2 = class541.field7594.get(arg1);
        int var3 = class541.field7594.get(12);
        int var4 = class541.field7594.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class182.method1105('\n', (byte) -75, arg0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class90.field903; var8 > 0; var8--) {
                class210.field2549[var8] = class210.field2549[var8 - 1];
            }
            class210.field2549[0] = var5 + ": " + var6[var7];
            if ((class210.field2549.length - 1) > class90.field903) {
                class90.field903++;
                if (class406.field5429 > 0) {
                    class406.field5429++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 98)
    public static void method2336(int arg0) {
        field5563 = null;
        if (arg0 != 0) {
            field5567 = -14;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lhb;", line = 112)
    public static final class347 method2337(int arg0, int arg1) {
        field5568++;
        if (arg0 != 10) {
            field5563 = null;
        }
        class347[] var2 = class604.method3376(127);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class347 var4 = var2[var3];
            if (var4.field4651 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lnp;B)Lwfa;", line = 142)
    public static final class614 method2338(class115 arg0, byte arg1) {
        int var2 = -59 % ((arg1 - 76) / 50);
        field5571++;
        return new class614(arg0.method676(-5), arg0.method676(-5), arg0.method676(-5), arg0.method676(-5), arg0.method675(-126), arg0.method675(-125), arg0.method620((byte) -127));
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Ljava/net/Socket;", line = 156)
    public final Socket method2339(boolean arg0) throws IOException {
        if (!arg0) {
            method2337(12, -109);
        }
        field5565++;
        return new Socket(this.field5569, this.field5570);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method330(byte arg0) throws IOException;
}
