import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class132 {

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "[I")
    private int[] field2647;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Ljd;")
    public static class92 field2640 = class202.method1325((byte) 90, "title_mute");

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljd;")
    public static class92 field2637 = class202.method1325((byte) 90, "blaugr-Un:");

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Ljd;")
    private static class92 field2642 = class202.method1325((byte) 90, "level)2");

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[Ljd;")
    public static class92[] field2644 = new class92[100];

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Ljd;")
    public static class92 field2646 = field2642;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)I")
    public final int method868(int arg0, boolean arg1) {
        if (arg1) {
            return -98;
        }
        int var3 = (this.field2647.length >> 1) - 1;
        field2641++;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field2647[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2647[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public static final int method869(int arg0, int arg1) {
        if (arg1 != -267741749) {
            method871(-69);
        }
        field2639++;
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lrc;")
    public static final class164 method870(int arg0, int arg1) {
        field2643++;
        if (arg1 != 0) {
            return null;
        }
        class164 var2 = (class164) class213.field4118.method930(-65, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field991.method899((byte) 87, class97.method684(15287, arg0), class4.method25(arg0, (byte) -96));
        class164 var4 = new class164();
        if (var3 != null) {
            var4.method1062(new class70(var3), arg1);
        }
        class213.field4118.method927(arg1 + 24744, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method871(int arg0) {
        field2640 = null;
        field2642 = null;
        if (arg0 == -32276) {
            field2646 = null;
            field2637 = null;
            field2644 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([I)V")
    public class132(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2647 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2647[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2647[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2647[var5 + var5] = arg0[var4];
            this.field2647[var5 + var5 + 1] = var4++;
        }
    }
}
