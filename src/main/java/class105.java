import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class105 extends class308 {

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Z")
    public volatile boolean field1513 = true;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "Lil;")
    public static class4 field1517 = new class4(16);

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1523 = "Allocated memory";

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "[I")
    public static int[] field1520 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "[Laf;")
    public static class201[] field1524 = new class201[0];

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "Lnm;")
    public static class221 field1525;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Z")
    public boolean field1515;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "Z")
    public boolean field1518;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "[Llj;")
    public static class289[] field1521;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "[[B")
    public static byte[][] field1522;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V", line = 15)
    public static final void method695(int arg0) {
        for (class250 var1 = (class250) class250.field3988.method1081(-83); var1 != null; var1 = (class250) class250.field3988.method1083((byte) 113)) {
            if (var1.field3990) {
                var1.method1776((byte) 95);
            }
        }
        for (class250 var2 = (class250) class49.field701.method1081(-8); var2 != null; var2 = (class250) class49.field701.method1083((byte) 113)) {
            if (var2.field3990) {
                var2.method1776((byte) 87);
            }
        }
        if (arg0 != -10907) {
            method698(88);
        }
        field1514++;
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)V", line = 55)
    public static final void method698(int arg0) {
        field1516++;
        if (arg0 < -21) {
            class211.field3219 = null;
            class273.field4495 = -1;
        }
    }

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(I)V", line = 67)
    public static void method699(int arg0) {
        field1525 = null;
        field1521 = null;
        field1520 = null;
        field1523 = null;
        field1522 = (byte[][]) null;
        field1524 = null;
        field1517 = null;
        if (arg0 >= -53) {
            method699(-93);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I")
    public abstract int method696(byte arg0);

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)[B")
    public abstract byte[] method697(int arg0);
}
