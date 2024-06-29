import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class454 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lpn;")
    public static class49 field6745 = new class49(15, 3);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Ljp;")
    public static class55 field6753 = new class55(59, 12);

    @OriginalMember(owner = "client!df", name = "j", descriptor = "S")
    public static short field6754 = 256;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[[I")
    public static int[][] field6755 = new int[128][128];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field6746;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field6748;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public int field6751;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lum;")
    public static class83 field6750;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method2780(int arg0) {
        field6755 = null;
        if (arg0 == 0) {
            field6745 = null;
            field6753 = null;
            field6750 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lem;")
    public static final class501 method2781(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4380;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lfh;I)V")
    public final void method2782(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1337((byte) 27);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field6747++;
                return;
            }
            this.method2783((byte) 127, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLfh;I)V")
    private final void method2783(byte arg0, class194 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6746 = arg1.method1396(53);
            this.field6748 = arg1.method1337((byte) -114);
            this.field6751 = arg1.method1337((byte) 72);
        }
        field6752++;
        if (arg0 <= 104) {
            this.field6746 = -30;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2784(char arg0, int arg1, String arg2) {
        field6749++;
        int var3 = class311.method2067(arg2, arg0, (byte) 75);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 1) {
            method2781(124, -28, -122);
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }
}
