import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class527 {

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Z")
    public static boolean field7689 = false;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field7690 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Lo;")
    public static class359 field7694;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "[I")
    public static int[] field7696;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IC)I", line = 5)
    public static final int method3120(String arg0, int arg1, char arg2) {
        field7693++;
        int var3 = 3 / ((49 - arg1) / 54);
        int var4 = 0;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6++) {
            if (arg0.charAt(var6) == arg2) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lpf;I)V", line = 34)
    public static final void method3121(class487 arg0, int arg1) {
        field7695++;
        if (arg1 != -21627) {
            return;
        }
        class374 var2 = (class374) class481.field6955.method1592((byte) -25, (long) arg0.field179);
        if (var2 == null) {
            class461.method2683(arg0.field257[0], arg0.field263[0], null, 0, null, arg0, arg0.field6279, arg1 + 16681);
        } else {
            var2.method2244((byte) 120);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)Z", line = 53)
    public static final boolean method3122(byte arg0, int arg1) {
        field7697++;
        if (arg0 != 97) {
            method3122((byte) 10, -46);
        }
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 73)
    public static void method3123(byte arg0) {
        field7696 = null;
        if (arg0 >= 32) {
            field7694 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIBI)V", line = 89)
    public static final void method3124(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -6) {
            return;
        }
        class68.field977 = arg4;
        field7688++;
        class219.field3097 = arg2;
        class429.field6225 = arg0;
        class256.field3488 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BII)[B")
    public abstract byte[] method2383(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B)V")
    public abstract void method2384(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)[B")
    public abstract byte[] method2385(int arg0);
}
