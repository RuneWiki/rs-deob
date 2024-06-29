import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class106 extends class180 {

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "Ljava/lang/String;")
    public String field1514;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "Z")
    public boolean field1518;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "Z")
    public boolean field1528;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "Ljava/lang/String;")
    public String field1522;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "J")
    public long field1515;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field1516 = 0;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field1529 = new String[5];

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "Lfc;")
    public static class343 field1530;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "[Lwj;")
    public static class334[] field1527;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V", line = 10)
    public static void method673(int arg0) {
        field1530 = null;
        if (arg0 != 0) {
            method673(-1);
        }
        field1527 = null;
        field1529 = null;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 37)
    public class106(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1514 = arg0;
        this.field1524 = arg4;
        this.field1518 = arg9;
        this.field1528 = arg8;
        this.field1521 = arg6;
        this.field1519 = arg7;
        this.field1520 = arg2;
        this.field1522 = arg1;
        this.field1515 = arg5;
        this.field1517 = arg3;
    }
}
