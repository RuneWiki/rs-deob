import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class74 {

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "B")
    public byte field1023;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "B")
    public byte field1022;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "Lpn;")
    public class682 field1021;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "S")
    public short field1026;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "Lfc;")
    public static class235 field1025 = new class235(4, -1);

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "Lpj;")
    public static class132 field1027;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public static final void method591(int arg0) {
        if (class503.field6878.field1084 && class475.field6637.field5522 != -1) {
            class328.method1994((byte) -104, class475.field6637.field5522, class475.field6637.field5516);
        }
        if (arg0 > -47) {
            method592(33);
        }
        field1020++;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V")
    public static final void method592(int arg0) {
        if (arg0 != 0) {
            method592(-17);
        }
        field1024++;
        if (class552.field7489 != null) {
            class552.field7489.method2227(98);
        }
        if (class173.field2597 != null) {
            class173.field2597.method2227(79);
        }
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
    public static void method593(int arg0) {
        if (arg0 != 14977) {
            method591(24);
        }
        field1027 = null;
        field1025 = null;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lpn;III)V")
    public class74(class682 arg0, int arg1, int arg2, int arg3) {
        this.field1023 = (byte) arg2;
        this.field1022 = (byte) arg3;
        this.field1021 = arg0;
        this.field1026 = (short) arg1;
    }
}
