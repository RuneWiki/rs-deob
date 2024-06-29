import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class17 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field240 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field245 = -1;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[[[Lok;")
    public static class131[][][] field241;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)I")
    public static final int method125(byte arg0, int arg1, int arg2) {
        if (arg0 != -118) {
            method125((byte) 36, 108, 122);
        }
        class255 var3 = (class255) class168.field2428.method1218((long) arg1, -3);
        field242++;
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field3867.length > arg2) {
            return var3.field3867[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method126(int arg0) {
        field243++;
        class271.method1821((byte) -110, 5);
        class89.method605(arg0 + 1019, 5);
        class272.method1830(5, 113);
        class233.method1519(5, 67);
        class86.method575((byte) 109, 5);
        class77.method512((byte) -89, 5);
        class153.method1039(2, 5);
        class145.method972((byte) 125, arg0);
        class48.method326(-17331, 5);
        class180.method1165((byte) 122, 5);
        class94.method636((byte) -122, 5);
        class150.method1017(false, 5);
        class193.method1239(-53, 5);
        class26.method194(23952, 5);
        class172.method1136(false, 5);
        class102.method682(50, (byte) 27);
        class217.method1402(5, (byte) 93);
        class240.method1563(arg0 ^ 0xFFFF9B53, 5);
        class268.field4193.method258(5, (byte) 60);
        class242.field3625.method258(5, (byte) 89);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)[Llk;")
    public static final class244[] method127(int arg0) {
        field239++;
        class244[] var1 = new class244[class160.field2321];
        for (int var2 = 0; var2 < class160.field2321; var2++) {
            int var3 = class282.field4500[var2] * class246.field3682[var2];
            byte[] var4 = class263.field3965[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class128.field1883[class184.method1188(255, var4[var6])];
            }
            var1[var2] = new class244(class68.field1056, class141.field2041, class91.field1386[var2], class211.field3035[var2], class246.field3682[var2], class282.field4500[var2], var5);
        }
        if (arg0 != 22330) {
            method129((Object) null, (class83) null, 81);
        }
        class290.method1935(0);
        return var1;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static void method128(int arg0) {
        field240 = null;
        field241 = null;
        if (arg0 <= 116) {
            method129((Object) null, (class83) null, -72);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/Object;Lca;I)V")
    public static final void method129(Object arg0, class83 arg1, int arg2) {
        field244++;
        if (arg1.field1283 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field1283.peekEvent() != null; var3++) {
            class98.method660(1L, -120);
        }
        if (arg2 > -99) {
            method127(115);
        }
        if (arg0 != null) {
            arg1.field1283.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method130(Component arg0, byte arg1) {
        arg0.removeMouseListener(class158.field2300);
        field246++;
        arg0.removeMouseMotionListener(class158.field2300);
        arg0.removeFocusListener(class158.field2300);
        if (arg1 != -5) {
            field240 = null;
        }
        class234.field3529 = 0;
    }
}
