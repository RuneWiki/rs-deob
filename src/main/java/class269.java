import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class269 extends class129 {

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field3480;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field3470 = 0;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field3478 = 0;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public static int field3473 = 0;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "[Z")
    public static boolean[] field3475 = new boolean[8];

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "F")
    public static float field3474;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 21)
    public final Object method825(int arg0) {
        int var2 = 125 % ((42 - arg0) / 37);
        field3479++;
        return this.field3480;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIZ)V", line = 34)
    public static final void method1683(byte arg0, int arg1, boolean arg2) {
        field3477++;
        class391 var3 = class70.method415(arg0 ^ 0x8000004C, arg1, arg2);
        if (var3 == null) {
            return;
        }
        if (arg0 != 76) {
            field3475 = null;
        }
        for (int var4 = 0; var4 < var3.field5330.length; var4++) {
            var3.field5330[var4] = -1;
            var3.field5332[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILjava/lang/String;)I", line = 60)
    public static final int method1684(int arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            field3476++;
            return class396.method2450(arg2, -104, true, arg0);
        } else {
            return 121;
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)V", line = 72)
    public static void method1685(byte arg0) {
        field3475 = null;
        if (arg0 <= 60) {
            field3478 = 87;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lqk;)V", line = 83)
    public static final void method1686(class6 arg0) {
        if (class208.field2534 >= 255) {
            return;
        }
        class349.field4761[class208.field2534] = arg0;
        class174.field2007[class208.field2534] = false;
        class208.field2534++;
        int var1 = arg0.field52;
        if (arg0.field45) {
            var1 = 0;
        }
        int var2 = arg0.field52;
        if (arg0.field51) {
            var2 = class238.field3149 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field1071 + 64 - arg0.field1076 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field1076 + arg0.field1071 - 64 >> 7;
            if (var6 >= class262.field3367) {
                var6 = class262.field3367 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field60[var4++];
                int var9 = (var8 >>> 8) + (arg0.field1073 + 64 - arg0.field1076 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class43.field512) {
                    var10 = class43.field512 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class59.field747[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class59.field747[var3][var11][var7] = var12 | class208.field2534;
                    } else if ((var12 & 0xFF00) == 0) {
                        class59.field747[var3][var11][var7] = var12 | class208.field2534 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class59.field747[var3][var11][var7] = var12 | class208.field2534 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class59.field747[var3][var11][var7] = var12 | class208.field2534 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)V", line = 176)
    public static final void method1687(byte arg0) {
        class372.field5043.method2298(arg0 ^ 0xFFFFFF96);
        field3472++;
        if (arg0 != -106) {
            field3475 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 189)
    public class269(Object arg0) {
        this.field3480 = arg0;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)Z", line = 197)
    public final boolean method824(int arg0) {
        field3481++;
        return arg0 == 5342 ? false : false;
    }
}
