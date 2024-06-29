import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class75 {

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    private int field1239 = 0;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Loa;")
    private class276 field1235;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lne;")
    public static class137 field1234 = new class137(50);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lki;")
    private class103 field1238;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[B")
    public static byte[] field1232;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lda;I)I")
    public static final int method493(class275 arg0, int arg1) {
        field1231++;
        int var2 = -61 % ((59 - arg1) / 56);
        return arg0.method1838(3) + 1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Lki;")
    public final class103 method494(byte arg0) {
        field1236++;
        if (this.field1239 > 0 && this.field1235.field4800[this.field1239 - 1] != this.field1238) {
            class103 var2 = this.field1238;
            this.field1238 = var2.field1716;
            return var2;
        }
        while (this.field1235.field4812 > this.field1239) {
            class103 var4 = this.field1235.field4800[this.field1239++].field1716;
            if (this.field1235.field4800[this.field1239 - 1] != var4) {
                this.field1238 = var4.field1716;
                return var4;
            }
        }
        int var3 = -71 / ((arg0 - 50) / 62);
        return null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Lki;")
    public final class103 method495(int arg0) {
        field1233++;
        this.field1239 = 0;
        if (arg0 < 116) {
            this.field1235 = null;
        }
        return this.method494((byte) 113);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static void method496(boolean arg0) {
        field1234 = null;
        field1232 = null;
        if (!arg0) {
            method496(true);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lma;Ltk;BLma;)V")
    public static final void method497(class105 arg0, class27 arg1, byte arg2, class105 arg3) {
        class269.field4678 = arg3;
        if (arg2 <= 121) {
            field1234 = null;
        }
        class147.field2557 = arg1;
        field1240++;
        class151.field2636 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Loa;)V")
    public class75(class276 arg0) {
        this.field1235 = arg0;
    }
}
