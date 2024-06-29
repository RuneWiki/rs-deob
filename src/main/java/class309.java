import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class309 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Z")
    public static boolean field4966 = false;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4975 = new String[100];

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lpj;")
    public static class172 field4972 = new class172();

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "[Z")
    public static boolean[] field4977 = new boolean[112];

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4978 = "Loading config - ";

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Laf;")
    private class168 field4969;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Ltf;")
    public static class244 field4971;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lbk;")
    private class59 field4974;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)I")
    public static final int method2083(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -5293) {
            field4971 = null;
        }
        field4973++;
        if ((class74.field1121[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class74.field1121[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Lbk;")
    public final class59 method2084(byte arg0) {
        field4976++;
        int var2 = -105 / ((arg0 - 54) / 43);
        class59 var3 = this.field4974;
        if (this.field4969.field2586 == var3) {
            this.field4974 = null;
            return null;
        } else {
            this.field4974 = var3.field866;
            return var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Lde;")
    public static final class58 method2085(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class58 var4 = var3.field1650;
            var3.field1650 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(JB)V")
    public static final void method2086(long arg0, byte arg1) {
        field4967++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class84.field1302; var3++) {
            if (class58.field863[var3] == arg0) {
                class33.field396++;
                class84.field1302--;
                for (int var4 = var3; var4 < class84.field1302; var4++) {
                    class58.field863[var4] = class58.field863[var4 + 1];
                    field4975[var4] = field4975[var4 + 1];
                    class82.field1249[var4] = class82.field1249[var4 + 1];
                }
                class250.field4088 = client.field3871;
                class150.field2218.method445(159, 7);
                class150.field2218.method1160(-25643, arg0);
                break;
            }
        }
        int var5 = -42 % ((arg1 - 67) / 35);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method2087(int arg0) {
        field4975 = null;
        if (arg0 != -3257) {
            method2083(27, -117, -109, -11);
        }
        field4977 = null;
        field4971 = null;
        field4978 = null;
        field4972 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lbk;")
    public final class59 method2088(int arg0) {
        if (arg0 != -1115) {
            field4975 = null;
        }
        field4968++;
        class59 var2 = this.field4969.field2586.field866;
        if (this.field4969.field2586 == var2) {
            this.field4974 = null;
            return null;
        } else {
            this.field4974 = var2.field866;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLaf;)V")
    public final void method2089(byte arg0, class168 arg1) {
        this.field4969 = arg1;
        if (arg0 == 126) {
            field4970++;
        }
    }
}
