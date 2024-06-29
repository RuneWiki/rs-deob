import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class57 {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    private int field1213 = 0;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lcd;")
    private class69 field1218;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[Lud;")
    public static class279[] field1216 = new class279[100];

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[Lud;")
    public static class279[] field1217 = null;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lig;")
    public static class175 field1215;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Lsi;")
    private class314 field1214;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 16)
    public static void method521(int arg0) {
        field1216 = null;
        field1217 = null;
        if (arg0 != 1) {
            method521(-118);
        }
        field1215 = null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Lsi;", line = 33)
    public final class314 method522(int arg0) {
        if (arg0 != -1) {
            method521(-48);
        }
        field1219++;
        if (this.field1213 > 0 && this.field1218.field1358[this.field1213 - 1] != this.field1214) {
            class314 var2 = this.field1214;
            this.field1214 = var2.field5538;
            return var2;
        }
        class314 var3;
        do {
            if (this.field1213 >= this.field1218.field1353) {
                return null;
            }
            var3 = this.field1218.field1358[this.field1213++].field5538;
        } while (this.field1218.field1358[this.field1213 - 1] == var3);
        this.field1214 = var3.field5538;
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Lsi;", line = 95)
    public final class314 method523(int arg0) {
        if (arg0 == -24650) {
            this.field1213 = 0;
            field1220++;
            return this.method522(-1);
        } else {
            return (class314) null;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lcd;)V", line = 110)
    public class57(class69 arg0) {
        this.field1218 = arg0;
    }
}
