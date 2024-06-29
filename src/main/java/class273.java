import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class273 extends class683 {

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    private int field3966 = -1;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Leo;")
    public static class313 field3967 = new class313(6, 1);

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Z")
    public static boolean field3971 = false;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "B")
    private byte field3972;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Ljava/lang/String;")
    private String field3973;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field3967 = null;
        if (arg0 != 1) {
            field3967 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ldt;I)V")
    public final void method1666(class254 arg0, int arg1) {
        this.field3966 = arg0.method1728((byte) 112);
        field3968++;
        this.field3972 = arg0.method1737(true);
        this.field3969 = arg0.method1728((byte) 51);
        arg0.method1723(21795);
        this.field3973 = arg0.method1699(-63);
        if (arg1 > -81) {
            this.method1666(null, 35);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lhr;B)V")
    public final void method1668(class551 arg0, byte arg1) {
        if (arg1 != -60) {
            return;
        }
        field3970++;
        class85 var3 = arg0.field7598[this.field3966];
        var3.field1209 = this.field3972;
        var3.field1206 = this.field3973;
        var3.field1210 = this.field3969;
    }
}
