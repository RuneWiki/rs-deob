import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class114 extends class401 {

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Ljava/lang/String;")
    public String field1573;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Lem;")
    public static class206 field1577 = new class206(84, -2);

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljca;")
    public static class637 field1574;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "Lsea;")
    public static class648 field1580;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "[I")
    public static int[] field1578;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method818(int arg0) {
        field1574 = null;
        field1580 = null;
        field1578 = null;
        if (arg0 == 0) {
            field1577 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method819(byte arg0, int arg1, String arg2) {
        class628.method3510("", -1, 0, arg1, "", arg2, "");
        field1576++;
        if (arg0 >= -30) {
            field1579 = 120;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class114() {
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class114(String arg0, int arg1) {
        this.field1573 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method820(byte arg0) {
        field1575++;
        if (!class426.field5971) {
            return;
        }
        class78 var1 = class89.method650(127, class340.field4555, class544.field7389);
        if (var1 != null && var1.field1064 != null) {
            class368 var2 = new class368();
            var2.field4957 = var1;
            var2.field4962 = var1.field1064;
            class97.method708(var2);
        }
        if (arg0 > -76) {
            return;
        }
        class426.field5971 = false;
        class112.field1563 = -1;
        class301.field4099 = -1;
        if (var1 != null) {
            class26.method255(var1, -20229);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public static final void method821(byte arg0) {
        field1572++;
        if (arg0 != 108) {
            method819((byte) 122, 27, null);
        }
        int var1 = (int) ((double) class401.field5620 * 34.46D);
        int var2 = var1 << 2;
        if (class334.field4506.method127()) {
            var2 += 512;
        }
        class334.field4506.method182(200, var2);
    }
}
