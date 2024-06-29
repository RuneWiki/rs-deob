import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class431 extends class228 {

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field5942 = new String[5];

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "Lpi;")
    public static class340 field5945 = new class340(41, 18);

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "[[I")
    public static int[][] field5946 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public int field5941;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public int field5947;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "J")
    public long field5936;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lqa;Ldn;B)V", line = 5)
    public static final void method2552(class129 arg0, class201 arg1, byte arg2) {
        field5937++;
        if (class126.field1733) {
            return;
        }
        if (arg2 >= -80) {
            method2552(null, null, (byte) 127);
        }
        arg0.method900(0);
        class473.field6921 = arg0.method851(class136.method958(arg1, class352.field4499), true);
        class473.field6921.method2406((class23.field419 - class473.field6921.method370()) / 2, (class92.field1281 - class473.field6921.method369()) / 2);
        class517.field7621 = arg0.method851(class136.method958(arg1, class333.field4262), true);
        class517.field7621.method2406((class23.field419 - class517.field7621.method370()) / 2, 18);
        class126.field1733 = true;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)J", line = 25)
    public final long method1440(int arg0) {
        if (arg0 >= -114) {
            method2552(null, null, (byte) 74);
        }
        field5944++;
        return this.field5936;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)I", line = 38)
    public final int method1442(byte arg0) {
        if (arg0 == 71) {
            field5938++;
            return this.field5947;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I", line = 50)
    public final int method1444(int arg0) {
        if (arg0 >= -92) {
            field5946 = null;
        }
        field5940++;
        return this.field5941;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)I", line = 61)
    public final int method1439(int arg0) {
        if (arg0 > -107) {
            this.method1442((byte) -2);
        }
        field5939++;
        return this.field5943;
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V", line = 76)
    public static void method2553(int arg0) {
        if (arg0 <= 99) {
            field5945 = null;
        }
        field5942 = null;
        field5945 = null;
        field5946 = null;
    }
}
