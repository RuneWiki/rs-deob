import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class360 extends OutputStream {

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field5579 = 0;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Lbi;")
    public static class104 field5574 = new class104(89, 8);

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field5581 = 0;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public static int field5582 = 0;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lqu;")
    public static class219 field5580 = new class219(67, 2);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "J")
    public static long field5576;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Lbw;")
    public static class20 field5583;

    @OriginalMember(owner = "client!wt", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5578++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLmn;)I")
    public static final int method2378(byte arg0, class162 arg1) {
        field5573++;
        if (arg0 != -61) {
            field5584 = -32;
        }
        int var2 = 0;
        if (arg1.method1012(class192.field2850, true)) {
            var2++;
        }
        if (arg1.method1012(class183.field2655, true)) {
            var2++;
        }
        if (arg1.method1012(class454.field7030, true)) {
            var2++;
        }
        if (arg1.method1012(class109.field1559, true)) {
            var2++;
        }
        if (arg1.method1012(class254.field4116, true)) {
            var2++;
        }
        if (arg1.method1012(class464.field7129, true)) {
            var2++;
        }
        if (arg1.method1012(class363.field5612, true)) {
            var2++;
        }
        if (arg1.method1012(class275.field4366, true)) {
            var2++;
        }
        if (arg1.method1012(class437.field6753, true)) {
            var2++;
        }
        if (arg1.method1012(class32.field330, true)) {
            var2++;
        }
        if (arg1.method1012(class538.field7879, true)) {
            var2++;
        }
        if (arg1.method1012(class402.field6056, true)) {
            var2++;
        }
        if (arg1.method1012(class229.field3809, true)) {
            var2++;
        }
        if (arg1.method1012(class4.field50, true)) {
            var2++;
        }
        if (arg1.method1012(class254.field4117, true)) {
            var2++;
        }
        if (arg1.method1012(class80.field1189, true)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static final void method2379(int arg0) {
        if (arg0 != 28958) {
            return;
        }
        field5575++;
        class501.field7514 = 0;
        class392.field5958.method2120((byte) 27);
        class392.field5958.method2124(class63.field1000, (byte) -9);
        class501.field7514++;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
    public static void method2380(int arg0) {
        field5580 = null;
        field5574 = null;
        if (arg0 != 0) {
            method2380(99);
        }
        field5583 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2381(int arg0, String arg1) {
        field5577++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 82 % ((-arg0 - 70) / 47);
        for (int var5 = 0; var5 < var2; var5++) {
            char var9 = arg1.charAt(var5);
            if (var9 == '<' || var9 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var6 = new StringBuffer(var2 + var3);
        for (int var7 = 0; var7 < var2; var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 == '<') {
                var6.append("<lt>");
            } else if (var8 == '>') {
                var6.append("<gt>");
            } else {
                var6.append(var8);
            }
        }
        return var6.toString();
    }
}
