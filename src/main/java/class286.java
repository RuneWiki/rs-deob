import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class286 extends class292 {

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "[Lid;")
    public class150[] field4501;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "Z")
    public static boolean field4492 = false;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field4495 = new String[100];

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "Lgb;")
    public static class149 field4493 = new class149();

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)Z")
    public final boolean method1921(int arg0, int arg1) {
        field4496++;
        if (arg0 != 12651) {
            method1922(-97, -120);
        }
        return this.field4501[arg1].field2315;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)Lgl;")
    public static final class216 method1922(int arg0, int arg1) {
        if (arg0 != 255) {
            field4493 = null;
        }
        field4494++;
        class216 var2 = (class216) class221.field3457.method1780((long) arg1, (byte) -118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field3800.method1163(1, arg1, 48);
        class216 var4 = new class216();
        if (var3 != null) {
            var4.method1440(new class37(var3), (byte) -107, arg1);
        }
        class221.field3457.method1784(var4, false, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZIIZLkd;BLkd;)I")
    public static final int method1923(boolean arg0, int arg1, int arg2, boolean arg3, class209 arg4, byte arg5, class209 arg6) {
        field4499++;
        int var7 = -115 % ((21 - arg5) / 58);
        int var8 = class203.method1363(10, arg3, arg4, arg2, arg6);
        if (var8 != 0) {
            return arg3 ? -var8 : var8;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var9 = class203.method1363(10, arg0, arg4, arg1, arg6);
            return arg0 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)Z")
    public final boolean method1924(boolean arg0, int arg1) {
        field4497++;
        if (arg0) {
            method1926(97, 116L);
        }
        return this.field4501[arg1].field2314;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static void method1925(int arg0) {
        field4493 = null;
        if (arg0 != 0) {
            field4492 = true;
        }
        field4495 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Luf;Luf;IZ)V")
    public class286(class176 arg0, class176 arg1, int arg2, boolean arg3) {
        class149 var5 = new class149();
        int var6 = arg0.method1165(3, arg2);
        this.field4501 = new class150[var6];
        int[] var7 = arg0.method1157(arg2, false);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1163(arg2, var7[var8], 48);
            class121 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class121 var12 = (class121) var5.method1010(108); var12 != null; var12 = (class121) var5.method1008((byte) 88)) {
                if (var12.field1866 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1154(var11, (byte) -79, 0);
                } else {
                    var13 = arg1.method1154(0, (byte) -79, var11);
                }
                var10 = new class121(var11, var13);
                var5.method1013(312991604, var10);
            }
            this.field4501[var7[var8]] = new class150(var9, var10);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IJ)V")
    public static final void method1926(int arg0, long arg1) {
        field4500++;
        if (arg0 != 26740) {
            method1922(-114, -26);
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }
}
