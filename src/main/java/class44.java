import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class44 extends class601 {

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field574 = new String[8];

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "Ljava/lang/String;")
    public static String field576;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "[Laba;")
    public static class177[] field575;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        if (arg0 != -40) {
            method318((byte) 108, null);
        }
        field573++;
        return class453.field6186;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class44() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLee;)Lgl;")
    public static final class601 method318(byte arg0, class677 arg1) {
        field577++;
        arg1.method3821((byte) 99);
        int var2 = arg1.method3821((byte) -85);
        class601 var3 = class63.method545(128, var2);
        var3.field7898 = arg1.method3821((byte) 72);
        int var4 = arg1.method3821((byte) -95);
        if (arg0 < 98) {
            return null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method3821((byte) 108);
            var3.method6(arg1, (byte) -61, var6);
        }
        var3.method108(8351);
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
    public static void method319(int arg0) {
        if (arg0 == 0) {
            field576 = null;
            field574 = null;
            field575 = null;
        }
    }
}
