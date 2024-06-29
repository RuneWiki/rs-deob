import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class604 implements class711 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/lang/String;")
    private String field8280;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field8287 = 50;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
    public static int[] field8285 = new int[field8287];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
    public static int[] field8279 = new int[field8287];

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    public static int[] field8286 = new int[field8287];

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[I")
    public static int[] field8290 = new int[field8287];

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field8289 = 0;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field8291 = new String[field8287];

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "[I")
    public static int[] field8295 = new int[field8287];

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
    public static int[] field8292 = new int[field8287];

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lmi;")
    public static class496 field8281;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Z")
    private boolean field8297;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IJII)V", line = 3)
    public static final void method3436(int arg0, long arg1, int arg2, int arg3) {
        field8296++;
        if (arg3 <= 3) {
            method3437((byte) -121, 59);
        }
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = ((int) arg1 & 0x37D8B0) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class137.method1116(true, arg2, arg0, (byte) -119, 0, 0, 0, var5, var6);
            return;
        }
        class99 var8 = class76.field1366.method1680(0, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field1761;
            var10 = var8.field1796;
        } else {
            var9 = var8.field1796;
            var10 = var8.field1761;
        }
        int var11 = var8.field1749;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class137.method1116(true, arg2, arg0, (byte) -99, var9, var11, var10, 0, 0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Z", line = 53)
    public static final boolean method3437(byte arg0, int arg1) {
        if (arg0 != 26) {
            field8295 = null;
        }
        field8283++;
        return arg1 == 15 || arg1 == 2 || arg1 == 30 || arg1 == 49 || arg1 == 51 || arg1 == 50 || arg1 == 6;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)I", line = 81)
    public final int method1377(int arg0) {
        int var2 = 88 % ((-arg0 - 43) / 62);
        field8294++;
        int var3 = class356.method2239(this.field8280, 7468);
        if (var3 >= 0 && var3 <= 100) {
            return var3;
        } else {
            this.field8297 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[B)[B", line = 97)
    public static final byte[] method3438(int arg0, byte[] arg1) {
        field8298++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        if (arg0 >= -9) {
            field8287 = 49;
        }
        class363.method2319(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Lkea;", line = 121)
    public final class239 method1379(int arg0) {
        field8282++;
        if (arg0 != -15004) {
            field8291 = null;
        }
        return class239.field3492;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 139)
    public static void method3439(byte arg0) {
        if (arg0 < 65) {
            field8292 = null;
        }
        field8291 = null;
        field8292 = null;
        field8295 = null;
        field8286 = null;
        field8290 = null;
        field8281 = null;
        field8279 = null;
        field8285 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(BI)V", line = 161)
    public static final void method3440(byte arg0, int arg1) {
        field8293++;
        class594 var2 = class692.method3869(arg1, (byte) 105, 16);
        var2.method3383(-16058);
        int var3 = 126 / ((arg0 + 54) / 38);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILuh;ILha;)V", line = 174)
    public static final void method3441(int arg0, int arg1, class168 arg2, int arg3, class59 arg4) {
        field8284++;
        class591.field8075.method1270(125);
        if (class465.field6521) {
            return;
        }
        for (class710 var5 = (class710) arg2.method1269(4); var5 != null; var5 = (class710) arg2.method1264((byte) 104)) {
            class553 var6 = class489.field6760.method2136(var5.field9629, (byte) 82);
            if (class112.method998(var6, -4)) {
                boolean var7 = class387.method2442((byte) -31, var6, var5, arg1, arg4, arg3);
                if (var7) {
                    class356.method2241((byte) -43, var5, arg4, var6);
                }
            }
        }
        if (arg0 != -13084) {
            field8291 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Z", line = 207)
    public final boolean method3442(int arg0) {
        if (arg0 <= 99) {
            method3438(-35, null);
        }
        field8288++;
        return this.field8297;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 221)
    public class604(String arg0) {
        this.field8280 = arg0;
    }
}
