import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class267 {

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4254 = "Loading config - ";

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Luk;")
    public static class100 field4259 = new class100(64);

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field4266 = 0;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "J")
    public long field4263;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Lbk;")
    public static class21 field4258;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "Lhc;")
    public static class235 field4269;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lji;")
    public class43 field4255;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lji;")
    public class43 field4256;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lji;")
    public class43 field4260;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[[[B")
    public static byte[][][] field4267;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILai;)Ljava/lang/String;")
    public static final String method1800(int arg0, int arg1, class88 arg2) {
        field4270++;
        try {
            int var3 = arg2.method666(false);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field1535 += class227.field3462.method573(arg2.field1535, (byte) 57, var3, arg2.field1471, 0, var4);
            return class41.method307(27, var4, var3, arg0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field4254 = null;
        field4259 = null;
        if (arg0 != 0) {
            field4258 = null;
        }
        field4269 = null;
        field4258 = null;
        field4267 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method1802(byte arg0) {
        field4251++;
        class113.field1847.method1898((byte) -122);
        class62.field1072.method1898((byte) -85);
        if (arg0 != -19) {
            field4259 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V")
    public static final void method1803(boolean arg0, int arg1) {
        field4253++;
        if (arg0) {
            method1801(11);
        }
        class41 var2 = class221.method1492((byte) -42, arg1, 11);
        var2.method303(23981);
    }
}
