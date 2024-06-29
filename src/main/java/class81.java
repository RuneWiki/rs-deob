import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class81 {

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "Lpt;")
    public static class308 field1327 = new class308("runescape", 0);

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Ld;")
    public static class242 field1329 = new class242(4);

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field1331 = 1;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Ljp;")
    public static class55 field1330 = new class55(6, 3);

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field1328;

    static {
        new class179("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field1332 = -1;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)B", line = 5)
    public static final byte method715(int arg0, int arg1, int arg2) {
        field1325++;
        if (arg1 == 9) {
            return (byte) ((arg2 & arg0) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 22)
    public static void method716(int arg0) {
        if (arg0 != -9444) {
            method716(33);
        }
        field1329 = null;
        field1327 = null;
        field1330 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V", line = 36)
    public static final void method717(int arg0, int arg1) {
        if (arg1 != 1) {
            field1330 = null;
        }
        field1324++;
        class188 var2 = class10.method48((byte) 106, 11, arg0);
        var2.method1306(-23128);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 53)
    public static final void method718(int arg0) {
        int var1 = -63 / ((arg0 + 37) / 37);
        class326.field4937.method1630(-10);
        field1328++;
    }
}
