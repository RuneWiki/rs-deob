import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class499 extends class356 {

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "Ltq;")
    private class572 field7192;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 3)
    public static final void method2866(int arg0, boolean arg1, String arg2) {
        field7200++;
        if (arg2 == null) {
            return;
        }
        if (class601.field8535 >= 100) {
            class638.method3593(true, 4, class221.field2758.method1296(class226.field2899, (byte) -72));
            return;
        }
        String var3 = class487.method2819(2, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = arg0; var4 < class601.field8535; var4++) {
            String var8 = class487.method2819(arg0 + 2, class278.field3521[var4]);
            if (var8 != null && var8.equals(var3)) {
                class638.method3593(true, 4, arg2 + class221.field2759.method1296(class226.field2899, (byte) 53));
                return;
            }
            if (class305.field3983[var4] != null) {
                String var9 = class487.method2819(2, class305.field3983[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class638.method3593(true, 4, arg2 + class221.field2759.method1296(class226.field2899, (byte) 100));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class210.field2549; var5++) {
            String var6 = class487.method2819(2, class314.field4077[var5]);
            if (var6 != null && var6.equals(var3)) {
                class638.method3593(true, 4, class221.field2764.method1296(class226.field2899, (byte) 59) + arg2 + class221.field2765.method1296(class226.field2899, (byte) -105));
                return;
            }
            if (class485.field7061[var5] != null) {
                String var7 = class487.method2819(2, class485.field7061[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class638.method3593(true, 4, class221.field2764.method1296(class226.field2899, (byte) -106) + arg2 + class221.field2765.method1296(class226.field2899, (byte) -87));
                    return;
                }
            }
        }
        if (class487.method2819(2, class377.field4914.field6324).equals(var3)) {
            class638.method3593(true, 4, class221.field2761.method1296(class226.field2899, (byte) 112));
            return;
        }
        class446.field6136++;
        class480.method2802(class73.field775, 16751);
        class334.field4314.method2525(class265.method1504(arg2, (byte) 88) + 1, -81849);
        class334.field4314.method2573(arg2, 16746);
        class334.field4314.method2525(arg1 ? 1 : 0, arg0 ^ 0xFFFEC047);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Liaa;I)V", line = 92)
    public final void method2867(class452 arg0, int arg1) {
        if (arg1 != -27836) {
            return;
        }
        field7195++;
        while (true) {
            int var3 = arg0.method2541(118);
            if (var3 == 0) {
                return;
            }
            this.method2869((byte) 112, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBII)I", line = 114)
    public static final int method2868(int arg0, byte arg1, int arg2, int arg3) {
        field7197++;
        if (class376.field4887 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class637.field9039;
        int var7 = -40 / (arg1 / 48);
        int var8 = arg3 - class637.field9043;
        for (class276 var9 = (class276) class637.field9021.method3174((byte) 49); var9 != null; var9 = (class276) class637.field9021.method3168(false)) {
            if (var9.field3483 == arg0) {
                int var10 = var9.field3479;
                int var11 = var9.field3484;
                int var12 = var11 + class637.field9043 | class637.field9039 + var10 << 14;
                int var13 = (var6 - var10) * (var6 - var10) + (var8 - var11) * (var8 - var11);
                if (var4 < 0 || var5 > var13) {
                    var4 = var12;
                    var5 = var13;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BILiaa;)V", line = 163)
    private final void method2869(byte arg0, int arg1, class452 arg2) {
        if (arg1 == 249) {
            int var4 = arg2.method2541(83);
            if (this.field7192 == null) {
                int var5 = class146.method799(var4, -114);
                this.field7192 = new class572(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method2541(46) == 1;
                int var8 = arg2.method2524(3);
                class270 var9;
                if (var7) {
                    var9 = new class210(arg2.method2516(98));
                } else {
                    var9 = new class337(arg2.method2575((byte) -48));
                }
                this.field7192.method3235((long) var8, -1, var9);
            }
        }
        field7198++;
        int var10 = 68 % ((39 - arg0) / 62);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)I", line = 210)
    public final int method2870(int arg0, int arg1, int arg2) {
        field7194++;
        if (arg0 != 14055) {
            return 79;
        } else if (this.field7192 == null) {
            return arg1;
        } else {
            class337 var4 = (class337) this.field7192.method3234((byte) -41, (long) arg2);
            return var4 == null ? arg1 : var4.field4415;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)V", line = 230)
    public static final void method2871(byte arg0, int arg1, int arg2) {
        field7196++;
        class530 var3 = class242.method1402(-30, 6, arg2);
        var3.method3025((byte) -69);
        var3.field7593 = arg1;
        if (arg0 != -111) {
            method2866(24, true, null);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 244)
    public static final void method2872(int arg0) {
        class389.field5193.method3684(-17200);
        field7193++;
        if (arg0 == -5750) {
            ;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(III)Las;", line = 256)
    public static final class139 method2873(int arg0, int arg1, int arg2) {
        class287 var3 = class97.field1074[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class139 var4 = var3.field3687;
            var3.field3687 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;", line = 266)
    public final String method2874(int arg0, byte arg1, String arg2) {
        field7199++;
        if (arg1 != 40) {
            return null;
        } else if (this.field7192 == null) {
            return arg2;
        } else {
            class210 var4 = (class210) this.field7192.method3234((byte) -66, (long) arg0);
            return var4 == null ? arg2 : var4.field2548;
        }
    }
}
