import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class439 implements class418 {

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Luu;")
    private class237 field6128;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Ljava/lang/String;")
    private String field6129;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lmga;")
    public static class30 field6122 = new class30("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field6126 = 0;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Z")
    public static boolean field6125 = false;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)I", line = 3)
    public final int method1338(byte arg0) {
        if (arg0 >= -107) {
            this.field6128 = null;
        }
        field6124++;
        return this.field6128.method1590(0, this.field6129) ? 100 : 0;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 19)
    public static void method2701(int arg0) {
        if (arg0 == 0) {
            field6122 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method2702(boolean arg0) {
        field6123++;
        class736.method4101(-47);
        class400.field5735 = null;
        class352.field5071.field956 = 0;
        class84.field1188 = 0;
        class113.field1523 = null;
        class357.field5125 = 0;
        class68.field1048 = 0;
        class594.field8063 = null;
        class600.field8121 = null;
        class269.method1824((byte) 80);
        class210.method1249(1728073164);
        for (int var1 = 0; var1 < 2048; var1++) {
            class251.field3675[var1] = null;
        }
        class388.field5601 = null;
        if (!arg0) {
            method2701(-21);
        }
        for (int var2 = 0; var2 < class445.field6185; var2++) {
            class679 var4 = class757.field10568[var2].field3471;
            if (var4 != null) {
                var4.field7122 = -1;
            }
        }
        class420.method2600(256);
        class720.field10023 = 1;
        class221.field2987 = -1;
        class388.field5597 = -1;
        class647.method3624(10, arg0);
        for (int var3 = 0; var3 < 100; var3++) {
            class669.field9236[var3] = true;
        }
        class122.method755(-47);
        class726.field10075 = null;
        class60.field874 = 0L;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lcca;", line = 92)
    public final class464 method1337(int arg0) {
        if (arg0 != 4790) {
            field6125 = false;
        }
        field6121++;
        return class464.field6458;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Luu;Ljava/lang/String;)V", line = 113)
    public class439(class237 arg0, String arg1) {
        this.field6128 = arg0;
        this.field6129 = arg1;
    }
}
