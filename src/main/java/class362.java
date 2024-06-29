import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class362 {

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    public int field5127;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
    public int field5129;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
    public int field5131;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "I")
    public int field5133;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
    public int field5134;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    public int field5139;

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
    public int field5141;

    @OriginalMember(owner = "client!uia", name = "p", descriptor = "I")
    public int field5142;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "Lha;")
    public static class58 field5135;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method2313(int arg0, boolean arg1) {
        class180.field2411 = arg0;
        field5138++;
        class714 var2 = class689.field9415;
        synchronized (class689.field9415) {
            class689.field9415.method4023((byte) -128);
        }
        if (arg1) {
            field5135 = null;
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 21)
    public static final byte[] method2314(String arg0, int arg1) {
        field5128++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (arg1 > -38) {
            field5135 = null;
        }
        if (var3 - 2 >= var2 || class36.method205((byte) -123, arg0.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var3 - 1 >= var2 || class36.method205((byte) -123, arg0.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class293.method1906(0, 17363, arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V", line = 59)
    public static void method2315(byte arg0) {
        int var1 = -52 % ((-arg0 - 15) / 50);
        field5135 = null;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(ILuia;)Z", line = 76)
    public final boolean method2316(int arg0, class362 arg1) {
        field5130++;
        int var3 = 79 % ((56 - arg0) / 58);
        return this.field5131 == arg1.field5131 && this.field5133 == arg1.field5133 && this.field5141 == arg1.field5141;
    }
}
