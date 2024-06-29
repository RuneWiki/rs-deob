import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Z")
    public boolean field2074 = true;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2071 = 1;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lpe;")
    private static class109 field2070 = class141.method1120("This computers address has been blocked", 0);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lpe;")
    public static class109 field2077 = class141.method1120("<col=40ff00>", 0);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2085 = -1;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lpe;")
    public static class109 field2079 = field2070;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Ljb;")
    public static class64 field2067 = new class64(4096);

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lpe;")
    public static class109 field2086 = class141.method1120("l", 0);

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lpe;")
    public static class109 field2087 = class141.method1120("VOLL", 0);

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lr;")
    public static class118 field2082;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(JZ)V")
    public static final void method797(long arg0, boolean arg1) {
        field2080++;
        if (arg1) {
            field2071 = -99;
        }
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class2.method18(19430, arg0 - 1L);
            class2.method18(19430, 1L);
        } else {
            class2.method18(19430, arg0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method798(byte arg0) {
        field2087 = null;
        if (arg0 >= -123) {
            field2085 = 126;
        }
        field2070 = null;
        field2067 = null;
        field2079 = null;
        field2082 = null;
        field2086 = null;
        field2077 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public static final void method799(byte arg0) {
        field2081++;
        if (arg0 > 17) {
            class74.field1488.method92((byte) 105);
            class112.field2417.method92((byte) 102);
            class49.field1003.method92((byte) 126);
            class35.field758.method92((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static final void method800(int arg0) {
        class42.field869 = 0;
        field2078++;
        class61.field1198 = 0;
        class120.method978((byte) -72);
        class72.method576(arg0 - 1);
        class42.method387(arg0 - 89);
        for (int var1 = 0; var1 < class61.field1198; var1++) {
            int var3 = class118.field2626[var1];
            if (class12.field264 != class52.field1067[var3].field3119) {
                class52.field1067[var3].field2265 = null;
                class52.field1067[var3] = null;
            }
        }
        if (class109.field2286 != class82.field1733.field309) {
            throw new RuntimeException("gnp1 pos:" + class82.field1733.field309 + " psize:" + class109.field2286);
        }
        for (int var2 = arg0; var2 < class131.field2885; var2++) {
            if (class52.field1067[class139.field3035[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class131.field2885);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2084 = arg0;
        this.field2068 = arg2;
        this.field2072 = arg4;
        this.field2075 = arg5;
        this.field2076 = arg3;
        this.field2069 = arg1;
        this.field2074 = arg6;
    }
}
