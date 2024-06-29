import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class216 {

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "[I")
    public int[] field3140;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "[I")
    public int[] field3135;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field3136 = -50;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "Lpj;")
    public static class132 field3139;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V", line = 4)
    public static void method1405(byte arg0) {
        field3139 = null;
        if (arg0 <= 6) {
            method1407(null, false, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILql;)V", line = 14)
    public static final void method1406(int arg0, int arg1, class674 arg2) {
        class1.field11 = arg1;
        field3138++;
        class678.field9558 = false;
        class94.method687(0, arg2);
        class520.method2880(arg2, true);
        if (class678.field9558) {
            System.out.println("---endgpp---");
        }
        if (arg2.field1301 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field1301 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 36)
    public static final void method1407(String arg0, boolean arg1, byte arg2) {
        class46.method256(-1, -1, arg1, (byte) 126, arg0);
        if (arg2 >= 10) {
            field3137++;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(I)V", line = 54)
    public class216(int arg0) {
        this.field3141 = arg0;
        this.field3140 = new int[this.field3141];
        this.field3135 = new int[this.field3141];
    }
}
