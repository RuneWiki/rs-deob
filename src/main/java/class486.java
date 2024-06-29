import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class486 {

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "Ljn;")
    private class117 field6927 = new class117(128);

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "Ljn;")
    public class117 field6939 = new class117(64);

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "Lvo;")
    public class345 field6937;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "Lvo;")
    private class345 field6931;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Lgca;")
    public static class627 field6928 = new class627();

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "Leda;")
    public static class116 field6935 = new class116(49, -2);

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public static int field6941 = 0;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "Lgn;")
    public static class529 field6942 = null;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)Lrca;", line = 12)
    public final class30 method2837(int arg0, int arg1) {
        field6934++;
        if (arg1 > -59) {
            this.method2841((byte) -116);
        }
        class117 var3 = this.field6927;
        class30 var4;
        synchronized (this.field6927) {
            var4 = (class30) this.field6927.method941((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field6931;
        byte[] var6;
        synchronized (this.field6931) {
            var6 = this.field6931.method2081(-124, arg0, 36);
        }
        class30 var7 = new class30();
        var7.field439 = this;
        var7.field412 = arg0;
        if (var6 != null) {
            var7.method281(124, new class465(var6));
        }
        var7.method283(false);
        class117 var8 = this.field6927;
        synchronized (this.field6927) {
            this.field6927.method949((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BLjava/lang/String;)V", line = 46)
    public static final void method2838(byte arg0, String arg1) {
        field6930++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class57.method494(arg1, (byte) 75);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class90.field1333; var3++) {
            String var4 = class623.field8878[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class57.method494(var4, (byte) 116);
            if (var5 != null && var5.equals(var2)) {
                class90.field1333--;
                for (int var6 = var3; var6 < class90.field1333; var6++) {
                    class623.field8878[var6] = class623.field8878[var6 + 1];
                    class57.field854[var6] = class57.field854[var6 + 1];
                    class409.field5848[var6] = class409.field5848[var6 + 1];
                    class617.field8817[var6] = class617.field8817[var6 + 1];
                    class373.field5181[var6] = class373.field5181[var6 + 1];
                }
                class453.field6517++;
                class419.field5960 = class330.field4562;
                class699 var7 = class452.method2630(class699.field9897, class335.field4672, (byte) 125);
                var7.field9908.method2753((byte) 71, class252.method1609(arg0 - 4, arg1));
                var7.field9908.method2703(false, arg1);
                class149.method1134(var7, true);
                break;
            }
        }
        if (arg0 != 4) {
            field6941 = 49;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V", line = 109)
    public static void method2839(int arg0) {
        field6928 = null;
        field6935 = null;
        field6942 = null;
        if (arg0 != 1) {
            method2843(67, false, null);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BII)V", line = 123)
    public final void method2840(byte arg0, int arg1, int arg2) {
        field6932++;
        if (arg0 <= 42) {
            field6938 = -107;
        }
        this.field6927 = new class117(arg2);
        this.field6939 = new class117(arg1);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 136)
    public final void method2841(byte arg0) {
        field6936++;
        class117 var2 = this.field6927;
        synchronized (this.field6927) {
            this.field6927.method950((byte) 32);
            if (arg0 != -64) {
                this.method2844((byte) 104);
            }
        }
        class117 var3 = this.field6939;
        synchronized (this.field6939) {
            this.field6939.method950((byte) 26);
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)V", line = 156)
    public final void method2842(int arg0, int arg1) {
        field6933++;
        class117 var3 = this.field6927;
        synchronized (this.field6927) {
            if (arg1 < 65) {
                return;
            }
            this.field6927.method939(28093, arg0);
        }
        class117 var4 = this.field6939;
        synchronized (this.field6939) {
            this.field6939.method939(28093, arg0);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZLis;)V", line = 173)
    public static final void method2843(int arg0, boolean arg1, class101 arg2) {
        field6929++;
        int var3 = -61 / ((arg0 + 58) / 32);
        int var4 = arg2.field1557 == 0 ? arg2.field1604 : arg2.field1557;
        int var5 = arg2.field1592 == 0 ? arg2.field1651 : arg2.field1592;
        class47.method371(arg2.field1577, var5, var4, arg1, class265.field3806[arg2.field1577 >> 16], 0);
        if (arg2.field1578 != null) {
            class47.method371(arg2.field1577, var5, var4, arg1, arg2.field1578, 0);
        }
        class259 var6 = (class259) class199.field3098.method2818(-22803, (long) arg2.field1577);
        if (var6 != null) {
            class154.method1159(var5, var4, -1, var6.field3716, arg1);
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)V", line = 197)
    public final void method2844(byte arg0) {
        field6940++;
        class117 var2 = this.field6927;
        synchronized (this.field6927) {
            if (arg0 != -10) {
                field6941 = -30;
            }
            this.field6927.method936(-127);
        }
        class117 var3 = this.field6939;
        synchronized (this.field6939) {
            this.field6939.method936(-98);
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lgn;ILvo;Lvo;)V", line = 231)
    public class486(class529 arg0, int arg1, class345 arg2, class345 arg3) {
        this.field6937 = arg3;
        this.field6931 = arg2;
        this.field6931.method2098(0, 36);
    }
}
