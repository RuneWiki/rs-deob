import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class720 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lgm;")
    public static class134 field9788 = new class134("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 6)
    public static final void method3972(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class34.field372 = arg0;
        class419.field6025 = arg1;
        class522.field7253 = class419.field6025 > 1 && class34.field372.method458();
        class478.field6717 = arg2;
        class30.field299 = 0x1 << class478.field6717;
        class281.field4067 = class30.field299 >> 1;
        Math.sqrt((double) (class281.field4067 * class281.field4067 + class281.field4067 * class281.field4067));
        class504.field7090 = arg3;
        class196.field2540 = arg4;
        class247.field3229 = arg5;
        class278.field4025 = arg6;
        class56.field683 = class92.method724(1);
        class654.method3638((byte) -79);
        class611.field8264 = new class194[arg3][class196.field2540][class247.field3229];
        class648.field8748 = new class295[arg3];
        if (arg7) {
            class455.field6521 = new int[class196.field2540][class247.field3229];
            class456.field6537 = new byte[class196.field2540][class247.field3229];
            class43.field462 = new short[class196.field2540][class247.field3229];
            class187.field2445 = new class194[1][class196.field2540][class247.field3229];
            class737.field10008 = new class295[1];
        } else {
            class455.field6521 = null;
            class456.field6537 = null;
            class43.field462 = null;
            class187.field2445 = null;
            class737.field10008 = null;
        }
        if (arg8) {
            class160.field2148 = new long[arg3][arg4][arg5];
            class82.field1135 = new class447[65535];
            class489.field6818 = new boolean[65535];
            class563.field7717 = 0;
        } else {
            class160.field2148 = null;
            class82.field1135 = null;
            class489.field6818 = null;
            class563.field7717 = 0;
        }
        class416.method2507(false);
        class737.field10005 = new class214[2];
        class151.field2056 = new class214[2];
        class570.field7774 = new class214[2];
        class98.field1437 = new class214[10000];
        class781.field10714 = 0;
        class347.field4909 = new class214[5000];
        class683.field9124 = 0;
        class281.field4062 = new class539[5000];
        class25.field250 = 0;
        class408.field5778 = new boolean[class278.field4025 + class278.field4025 + 1][class278.field4025 + class278.field4025 + 1];
        class368.field5311 = new boolean[class278.field4025 + class278.field4025 + 2][class278.field4025 + class278.field4025 + 2];
        class41.field434 = new int[class278.field4025 + class278.field4025 + 2];
        class627.field8492 = class627.field8497;
        if (class522.field7253) {
            class767.field10529 = new boolean[arg3][class278.field4025 + class278.field4025 + 1][class278.field4025 + class278.field4025 + 1];
            class281.field4064 = new boolean[arg3][][];
            if (class97.field1384 != null) {
                class414.method2496();
            }
            class97.field1384 = new class71[class419.field6025];
            class34.field372.method495(class97.field1384.length + 1);
            class34.field372.method505(0);
            for (int var9 = 0; var9 < class97.field1384.length; var9++) {
                class97.field1384[var9] = new class71(var9 + 1, class34.field372);
                (new Thread(class97.field1384[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class419.field6025 == 2) {
                var10 = 4;
                class496.field6975 = 2;
            } else if (class419.field6025 == 3) {
                var10 = 6;
                class496.field6975 = 3;
            } else {
                var10 = 8;
                class496.field6975 = 4;
            }
            class267.field3910 = new class157[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class267.field3910[var11] = new class157(class419.field6022[class419.field6025 - 2][var11]);
            }
        } else {
            class496.field6975 = 1;
        }
        class641.field8642 = new int[class496.field6975 - 1];
        class533.field7398 = new int[class496.field6975 - 1];
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 125)
    public static void method3973(byte arg0) {
        if (arg0 > 125) {
            field9788 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)S", line = 140)
    public static final short method3974(int arg0, int arg1) {
        field9787++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        if (arg0 != -594362713) {
            method3975(false, null);
        }
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLofa;)V", line = 169)
    public static final void method3975(boolean arg0, class347 arg1) {
        field9790++;
        if (class494.field6963 == arg1.field4970) {
            if (class625.field8475.field10367 == null) {
                arg1.field4925 = 0;
                arg1.field5037 = 0;
            } else {
                arg1.field5001 = 150;
                arg1.field5010 = (int) (Math.sin((double) class572.field7788 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field5037 = class349.field5065;
                arg1.field4985 = 5;
                arg1.field4925 = class411.method2470(-111, class625.field8475.field10367);
                arg1.field4992 = class625.field8475.field6111;
                arg1.field4984 = class625.field8475.field6121;
                arg1.field4906 = class625.field8475.field6112;
                arg1.field5022 = 0;
                class317 var2 = arg1.field4992 == -1 ? null : class693.field9223.method2388(arg1.field4992, 0);
                if (var2 != null) {
                    class159.method1101(arg1.field4906, (byte) -86, var2);
                }
            }
        } else if (arg0) {
            field9788 = null;
        }
    }
}
