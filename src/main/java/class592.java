import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class592 {

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public int field8161;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "[I")
    public int[] field8156;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "[I")
    public int[] field8163;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "[I")
    public static int[] field8160 = new int[25];

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "Lgba;")
    public static class388 field8167;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "Ltl;")
    public static class566 field8154;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)Lwv;")
    public static final class423 method3271(int arg0, byte arg1) {
        field8166++;
        if (arg1 > -70) {
            method3271(-5, (byte) -40);
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class124.field1729[var2] == null || class124.field1729[var2][var3] == null) {
            boolean var4 = class60.method341(var2, 0);
            if (!var4) {
                return null;
            }
        }
        return class124.field1729[var2][var3];
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Z")
    public static final boolean method3272(int arg0, int arg1, int arg2) {
        field8164++;
        if (arg0 >= -34) {
            method3272(81, -122, 52);
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        class600 var3 = class118.field1510.method3921(arg2, -82);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method3337((byte) 89, arg1);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V")
    public static final void method3273(boolean arg0) {
        field8159++;
        if (arg0) {
            field8154 = null;
        }
        class323.field4357.method2168((byte) -98);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZZIILjava/lang/String;ZJIIILjava/lang/String;)V")
    public static final void method3274(boolean arg0, boolean arg1, int arg2, int arg3, String arg4, boolean arg5, long arg6, int arg7, int arg8, int arg9, String arg10) {
        field8155++;
        if (class674.field9590 || class137.field1873 >= 500) {
            return;
        }
        int var12 = arg7 == -1 ? class689.field9739 : arg7;
        class354 var13 = new class354(arg4, arg10, var12, arg3, arg2, arg6, arg9, arg8, arg1, arg5);
        if (!arg0) {
            class101.field1211.method2507(var13, (byte) -127);
            class137.field1873++;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLgba;Lga;)V")
    public static final void method3275(byte arg0, class388 arg1, class332 arg2) {
        field8158++;
        class307.field4105 = arg2;
        class417.field5484 = "";
        class28.field412 = arg1;
        if (class58.field736.startsWith("win")) {
            class417.field5484 = class417.field5484 + "windows/";
        } else if (class58.field736.startsWith("linux")) {
            class417.field5484 = class417.field5484 + "linux/";
        } else if (class58.field736.startsWith("mac")) {
            class417.field5484 = class417.field5484 + "macos/";
        }
        int var3 = 70 / ((15 - arg0) / 51);
        if (class28.field412.field5192) {
            class417.field5484 = class417.field5484 + "msjava/";
        } else if (class58.field738.startsWith("amd64") || class58.field738.startsWith("x86_64")) {
            class417.field5484 = class417.field5484 + "x86_64/";
        } else if (class58.field738.startsWith("i386") || class58.field738.startsWith("i486") || class58.field738.startsWith("i586") || class58.field738.startsWith("x86")) {
            class417.field5484 = class417.field5484 + "x86/";
        } else if (class58.field738.startsWith("ppc")) {
            class417.field5484 = class417.field5484 + "ppc/";
        } else {
            class417.field5484 = class417.field5484 + "universal/";
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
    public static void method3276(byte arg0) {
        field8154 = null;
        field8160 = null;
        field8167 = null;
        if (arg0 >= -51) {
            method3271(-84, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BFFIF)F")
    public static final float method3277(byte arg0, float arg1, float arg2, int arg3, float arg4) {
        field8162++;
        float[] var5 = class75.field891[arg3];
        if (arg0 != -54) {
            field8154 = null;
        }
        return var5[2] * arg2 + var5[0] * arg4 + var5[1] * arg1;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3278(byte arg0, String arg1) {
        field8157++;
        if (class187.field2606 == null) {
            class402.method2297(-24268);
        }
        class427.field5754.setTime(new Date(class529.method2982((byte) -69)));
        int var2 = class427.field5754.get(11);
        int var3 = class427.field5754.get(12);
        int var4 = class427.field5754.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class87.method475('\n', arg1, false);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class627.field8682; var8 > 0; var8--) {
                class187.field2606[var8] = class187.field2606[var8 - 1];
            }
            class187.field2606[0] = var5 + ": " + var6[var7];
            if (class187.field2606.length - 1 > class627.field8682) {
                class627.field8682++;
                if (class410.field5398 > 0) {
                    class410.field5398++;
                }
            }
        }
        if (arg0 != -59) {
            method3276((byte) -41);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BII)Lah;")
    public static final class256 method3279(byte arg0, int arg1, int arg2) {
        field8168++;
        class256 var3 = (class256) class595.field8206.method3057(1, (long) arg1 << 32 | (long) arg2);
        if (arg0 > -20) {
            field8167 = null;
        }
        if (var3 == null) {
            var3 = new class256(arg1, arg2);
            class595.field8206.method3061(123, var3.field545, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(I)V")
    public class592(int arg0) {
        this.field8161 = arg0;
        this.field8156 = new int[this.field8161];
        this.field8163 = new int[this.field8161];
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3280(int arg0, byte arg1, int arg2) {
        field8165++;
        if (arg1 > -111) {
            return true;
        } else {
            return (arg0 & 0x800) != 0;
        }
    }
}
