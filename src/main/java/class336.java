import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class336 implements class515 {

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "Llp;")
    private class414 field4531;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "Lnt;")
    private class236 field4526;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "Lmo;")
    public static class780 field4529 = new class780("", 18);

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "Lju;")
    public static class137 field4532 = new class137(14, -1);

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "Lus;")
    public static class1 field4527;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "[I")
    public static int[] field4533;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)V", line = 9)
    public static void method2102(int arg0) {
        field4532 = null;
        field4533 = null;
        field4527 = null;
        if (arg0 == 13025) {
            field4529 = null;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V", line = 23)
    public final void method1790(int arg0) {
        if (arg0 != 6187) {
            this.field4526 = null;
        }
        field4528++;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZI)V", line = 34)
    public final void method1102(boolean arg0, int arg1) {
        if (arg1 != 1164) {
            field4527 = null;
        }
        field4530++;
        class403 var3 = this.field4526.method1584(this.field4531.field5676, -75);
        if (var3 == null) {
            return;
        }
        int var4 = this.field4531.field5669.method3006(0, class374.field5075, this.field4531.field5662) + this.field4531.field5674;
        int var5 = this.field4531.field5665.method2837(2113, class412.field5635, this.field4531.field5671) + this.field4531.field5660;
        if (this.field4531.field5677) {
            class95.field1472.method519(var4, var5, this.field4531.field5662, this.field4531.field5671, this.field4531.field5668, 0);
        }
        int var6 = var5 + this.method2103(var5, var4, 5, (byte) 95, var3.field5537, class557.field7861) * 12;
        int var9 = var6 + 8;
        if (this.field4531.field5677) {
            class95.field1472.method508(var4, var9, this.field4531.field5662 + var4 - 1, var9, this.field4531.field5668, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method2103(var6, var4, 5, (byte) -120, var3.field5538, class557.field7861) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method2103(var10, var4, 5, (byte) 105, var3.field5536, class557.field7861) * 12;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)Z", line = 71)
    public final boolean method1789(byte arg0) {
        if (arg0 != 29) {
            this.method1102(false, 51);
        }
        field4523++;
        return this.field4526.method1585((byte) 124);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIBLjava/lang/String;Lda;)I", line = 86)
    private final int method2103(int arg0, int arg1, int arg2, byte arg3, String arg4, class67 arg5) {
        field4524++;
        int var7 = 113 / ((arg3 + 70) / 47);
        return arg5.method599((byte) -124, arg4, arg0 + arg2, 0, this.field4531.field5662 - (arg2 * 2), null, 0, 0, 0, this.field4531.field5671 - (arg2 * 2), 0, this.field4531.field5673, null, null, arg1 + arg2, this.field4531.field5661);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IZ)Lom;", line = 96)
    public static final class395 method2104(int arg0, boolean arg1) {
        field4525++;
        class395 var2 = (class395) class608.field8484.method266((byte) -116, (long) arg0);
        if (arg1) {
            method2104(99, false);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class475.field6432.method3732(arg0, 8906, 1);
        class395 var4 = new class395();
        var4.field5456 = arg0;
        if (var3 != null) {
            var4.method2391(19974, new class93(var3));
        }
        var4.method2387(-76);
        if (var4.field5450 == 2 && class87.field1195.method337((long) arg0, 1) == null) {
            class87.field1195.method341((long) arg0, new class345(class528.field7171), (byte) 32);
            class530.field7186[class528.field7171++] = var4;
        }
        class608.field8484.method270(var4, (long) arg0, -125);
        return var4;
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lnt;Llp;)V", line = 132)
    public class336(class236 arg0, class414 arg1) {
        this.field4531 = arg1;
        this.field4526 = arg0;
    }
}
