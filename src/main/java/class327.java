import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class327 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5072 = 100;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5077 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5073 = " is already on your ignore list.";

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field5075 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2237(int arg0) {
        class290.field4566 = -1;
        class138.field2146 = -1;
        class270.field4083 = arg0;
        class67.field982 = false;
        class79.field1112 = 0;
        field5075 = 0;
        field5076++;
        class159.field2372.field455 = 0;
        class6.field62 = 0;
        class32.field406 = 0;
        class88.field1293.field455 = 0;
        class3.field14 = 0;
        class109.field1705 = 0;
        class320.field4983 = -1;
        for (int var1 = 0; var1 < class319.field4964.length; var1++) {
            if (class319.field4964[var1] != null) {
                class319.field4964[var1].field4494 = -1;
            }
        }
        for (int var2 = 0; var2 < class161.field2394.length; var2++) {
            if (class161.field2394[var2] != null) {
                class161.field2394[var2].field4494 = -1;
            }
        }
        class65.method555((byte) 17);
        class78.field1104 = 1;
        class113.method889(98, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class40.field597[var3] = true;
        }
        class290.method2051(arg0 + 72);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 60)
    public static void method2238(int arg0) {
        if (arg0 > -51) {
            field5073 = (String) null;
        }
        field5073 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 73)
    public static final String method2239(String arg0, int arg1) {
        int var2 = 107 / ((arg1 - 30) / 60);
        field5071++;
        int var3 = class114.method893((byte) 115, arg0);
        return var3 == -1 ? "" : class13.method104(" ", class213.field3390.field119[var3], -8622, "<br>");
    }
}
