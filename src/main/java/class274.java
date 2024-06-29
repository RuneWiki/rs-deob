import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class274 extends class71 {

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field4353 = 0;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field4351 = 0;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lkb;")
    public static class39 field4348;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[[Lga;")
    public static class21[][] field4345;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 4)
    public static final void method1951(int arg0) {
        if (arg0 >= 80) {
            field4347++;
            class138.field2067.method1615(43);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLkb;)V", line = 15)
    public static final void method1952(byte arg0, class39 arg1) {
        field4346++;
        if (arg0 > -66) {
            method1955((byte) -115);
        }
        class127.field1900 = arg1.method266(-124, "runes");
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 31)
    public static void method1953(int arg0) {
        if (arg0 != -6) {
            field4351 = -104;
        }
        field4345 = (class21[][]) null;
        field4348 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIZIILkb;)V", line = 47)
    public static final void method1954(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class39 arg6) {
        class64.field853 = arg6;
        field4352++;
        class12.field147 = arg5;
        class59.field770 = arg3;
        class37.field497 = arg2;
        class310.field4845 = arg1;
        class226.field3585 = arg0;
        class305.field4753 = arg4;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V", line = 72)
    public static final void method1955(byte arg0) {
        field4350++;
        for (int var1 = 0; var1 < 5; var1++) {
            class36.field483[var1] = false;
        }
        class282.field4461 = 1;
        class314.field4889 = -1;
        class160.field2464 = -1;
        class286.field4522 = 0;
        if (arg0 >= -19) {
            field4351 = -85;
        }
        class93.field1442 = 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Lkd;)V", line = 98)
    public static final void method1956(int arg0, class83[] arg1) {
        class326.field5088[arg0] = arg1;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V", line = 100)
    public class274(int arg0, int arg1) {
        this.field4354 = arg0;
        this.field4349 = arg1;
    }
}
