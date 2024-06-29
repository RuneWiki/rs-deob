import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class548 {

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "Ljava/lang/String;")
    public String field7499;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "Ljava/lang/String;")
    public String field7491;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "Ljava/lang/String;")
    public String field7498;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "Lcb;")
    public static class318 field7495 = new class318(66, -1);

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "Z")
    public static boolean field7497 = false;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "F")
    public static float field7493;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "Lxa;")
    public static class424 field7494;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method3080(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -64) {
            return 60;
        } else {
            field7492++;
            int var4 = ((arg2 & 0xFF00) * arg3 & 0xFF0000 | (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
            int var5 = 255 - arg3;
            return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIII)Z", line = 26)
    public static final boolean method3081(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7496++;
        if ((class645.field9140[0][arg1][arg2] & 0x2) != 0) {
            return true;
        } else if ((class645.field9140[arg0][arg1][arg2] & 0x10) != 0) {
            return false;
        } else if (arg3 == class56.method353(-100, arg0, arg1, arg2)) {
            return true;
        } else {
            if (arg4 != -16623) {
                method3083(73);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "([BB)V", line = 49)
    public static final void method3082(byte[] arg0, byte arg1) {
        field7500++;
        if (arg1 != 1) {
            method3081(122, 80, 99, -37, -97);
        }
        class138 var2 = new class138(arg0);
        while (true) {
            while (true) {
                while (true) {
                    int var3 = var2.method957((byte) -104);
                    if (var3 == 0) {
                        return;
                    }
                    if (var3 == 1) {
                        int[] var8 = class623.field8469 = new int[6];
                        var8[0] = var2.method922((byte) -125);
                        var8[1] = var2.method922((byte) -125);
                        var8[2] = var2.method922((byte) -113);
                        var8[3] = var2.method922((byte) -126);
                        var8[4] = var2.method922((byte) -117);
                        var8[5] = var2.method922((byte) -118);
                    } else if (var3 == 4) {
                        int var4 = var2.method957((byte) -115);
                        class110.field1327 = new int[var4];
                        for (int var5 = 0; var5 < var4; var5++) {
                            class110.field1327[var5] = var2.method922((byte) -118);
                            if (class110.field1327[var5] == 65535) {
                                class110.field1327[var5] = -1;
                            }
                        }
                    } else if (var3 == 5) {
                        int var6 = var2.method957((byte) -87);
                        class671.field9526 = new int[var6];
                        for (int var7 = 0; var7 < var6; var7++) {
                            class671.field9526[var7] = var2.method922((byte) -120);
                            if (class671.field9526[var7] == 65535) {
                                class671.field9526[var7] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 133)
    public static void method3083(int arg0) {
        field7495 = null;
        field7494 = null;
        if (arg0 < 76) {
            method3083(112);
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 144)
    public class548(String arg0, String arg1, String arg2) {
        this.field7499 = arg1;
        this.field7491 = arg2;
        this.field7498 = arg0;
    }
}
