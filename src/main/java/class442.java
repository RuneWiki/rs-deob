import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class442 extends class550 {

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    private int field6461;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    private int field6465;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    private int field6456;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    private int field6467;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field6463 = 328;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Z")
    public static boolean field6457 = false;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "[Lwq;")
    public static class351[] field6468 = new class351[2048];

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Lqu;")
    public static class364 field6460 = new class364(45, 4);

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ)Ltg;")
    public static final class621 method2691(int arg0, int arg1, boolean arg2) {
        ++field6462;
        class621 var3 = (class621) class293.field4303.method1333((long) arg0 | (long) arg1 << 32, false);
        if (!arg2) {
            method2692(39);
        }
        if (var3 == null) {
            var3 = new class621(arg1, arg0);
            class293.field4303.method1341(var3, (byte) 83, var3.field7465);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIII)V")
    public class442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6461 = arg3;
        this.field6465 = arg1;
        this.field6456 = arg2;
        this.field6467 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IBI)V")
    public final void method646(int arg0, byte arg1, int arg2) {
        ++field6464;
        int var4 = this.field6467 * arg0 >> 12;
        int var5 = this.field6456 * arg0 >> 12;
        int var6 = 9 % ((62 - arg1) / 38);
        int var7 = this.field6465 * arg2 >> 12;
        int var8 = this.field6461 * arg2 >> 12;
        class355.method2182(var8, var7, super.field8199, var4, var5, (byte) 127);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method2692(int arg0) {
        field6460 = null;
        if (arg0 != 24147) {
            method2693(-56, (String) null);
        }
        field6468 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V")
    public final void method648(int arg0, byte arg1, int arg2) {
        ++field6466;
        int var4 = this.field6467 * arg0 >> 12;
        if (arg1 < -25) {
            int var5 = this.field6456 * arg0 >> 12;
            int var6 = this.field6465 * arg2 >> 12;
            int var7 = this.field6461 * arg2 >> 12;
            class350.method2143(super.field8195, var6, var7, 1, var5, super.field8200, super.field8199, var4);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZII)V")
    public final void method647(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method647(true, 112, 104);
        }
        ++field6459;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2693(int arg0, String arg1) {
        ++field6458;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 2048) {
            method2693(73, (String) null);
        }
        while (~var4 > ~var2) {
            char var5 = arg1.charAt(var4);
            if (var5 <= 127) {
                ++var3;
            } else if (~var5 < -2048) {
                var3 += 3;
            } else {
                var3 += 2;
            }
            ++var4;
        }
        return var3;
    }
}
