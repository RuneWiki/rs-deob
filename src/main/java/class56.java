import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class56 extends class268 {

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Ljd;")
    public static class95 field732;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "Ljd;")
    public static class95 field739;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field736;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljd;ILjd;Ljd;)V", line = 7)
    public static final void method399(class95 arg0, int arg1, class95 arg2, class95 arg3) {
        class135.field2050 = arg0;
        class85.field1237 = arg2;
        class338.field5254 = arg3;
        field734++;
        if (arg1 != -1) {
            field732 = (class95) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V", line = 21)
    public final void method400(int arg0, int arg1, int arg2) {
        field727++;
        int var4 = 16 / ((-arg1 - 74) / 43);
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(III)V", line = 30)
    public static final void method401(int arg0, int arg1, int arg2) {
        if (class79.field1166 > 0) {
            class171.method1293(class79.field1166, true);
            class79.field1166 = 0;
        }
        field737++;
        short var3 = 256;
        if (arg0 != 65280) {
            method403(7);
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = class287.field4452 * arg2;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class77.field1123[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class166.field2690[var5++];
                int var11 = class287.field4453[arg1 + var6++];
                if (var10 == 0) {
                    class201.field3091.field3017[var4++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = -(var10 - 256) - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class25.field278[var10];
                    class201.field3091.field3017[var4++] = class149.method1117(-16711936, class149.method1117(var14, 16711935) * var12 + (class149.method1117(var11, 16711935) * var13)) + class149.method1117(16711680, class149.method1117(65280, var14) * var12 + (class149.method1117(var11, 65280) * var13)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class201.field3091.field3017[var4++] = class287.field4453[arg1 + (var6++)];
            }
            var6 += class287.field4452 - 128;
        }
        if (class73.field1058) {
            class175.method1315(class201.field3091.field3017, arg1, arg2, class201.field3091.field4175, class201.field3091.field4184);
        } else {
            class201.field3091.method121(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)I", line = 116)
    public static final int method402(int arg0, byte arg1, int arg2) {
        field730++;
        if (arg2 == -1) {
            return 12345678;
        }
        if (arg1 != 108) {
            field739 = (class95) null;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 139)
    public static void method403(int arg0) {
        field736 = null;
        if (arg0 != -233256472) {
            method399((class95) null, -70, (class95) null, (class95) null);
        }
        field739 = null;
        field732 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 151)
    public static final boolean method404(byte arg0, String arg1) {
        if (arg0 >= -71) {
            method403(49);
        }
        field733++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class153.field2321; var2++) {
            if (arg1.equalsIgnoreCase(class102.field1469[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(III)V", line = 188)
    public final void method405(int arg0, int arg1, int arg2) {
        field726++;
        if (arg2 <= 63) {
            method403(111);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIIII)V", line = 202)
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field735 = arg2;
        this.field740 = arg3;
        this.field731 = arg0;
        this.field738 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V", line = 215)
    public final void method406(int arg0, int arg1, int arg2) {
        field728++;
        int var4 = this.field731 * arg0 >> 12;
        int var5 = this.field738 * arg2 >> 12;
        int var6 = this.field740 * arg2 >> 12;
        int var7 = this.field735 * arg0 >> 12;
        if (arg1 != 219) {
            method402(22, (byte) 62, -21);
        }
        class35.method269(var7, var5, var4, true, var6, this.field4173);
    }
}
