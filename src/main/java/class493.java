import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class493 {

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[F")
    public static float[] field7528 = new float[16];

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[Z")
    public static boolean[] field7530;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lih;")
    public static class474 field7525;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lqc;")
    public static class502 field7529;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static final void method2965(byte arg0) {
        field7526++;
        if (class473.field6841 < 1024.0F) {
            class473.field6841 = 1024.0F;
        }
        if (class473.field6841 > 3072.0F) {
            class473.field6841 = 3072.0F;
        }
        while (class506.field7722 >= 16384.0F) {
            class506.field7722 -= 16384.0F;
        }
        while (class506.field7722 < 0.0F) {
            class506.field7722 += 16384.0F;
        }
        int var1 = class318.field4665 >> 7;
        int var2 = class356.field5150 >> 7;
        int var3 = class103.method620(class355.field5121, class356.field5150, (byte) 20, class318.field4665);
        if (arg0 != 124) {
            return;
        }
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class362.field5442 - 4) > var1 && class203.field2813 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class355.field5121;
                    if (var7 < 3 && class352.method2137(var6, 47, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class453.field6588.field110 != null && class453.field6588.field110[var7] != null) {
                        var8 = (class453.field6588.field110[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 - (class311.field4527[var7].method848(var5, var6) - var3);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class247.field3540) {
            class247.field3540 += (var10 - class247.field3540) / 24;
        } else if (class247.field3540 > var10) {
            class247.field3540 += (var10 - class247.field3540) / 80;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method2966(int arg0) {
        field7529 = null;
        if (arg0 != -4) {
            field7525 = null;
        }
        field7525 = null;
        field7530 = null;
        field7528 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
    public static final void method2967(int arg0, int arg1, int arg2) {
        field7527++;
        if (arg1 != -4) {
            field7528 = null;
        }
        class338 var3 = class380.method2294((byte) 66, arg0, 5);
        var3.method2052((byte) -28);
        var3.field4930 = arg2;
    }

    static {
        new class194("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field7530 = new boolean[8];
    }
}
