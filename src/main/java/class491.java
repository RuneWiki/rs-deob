import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class491 {

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Ljn;")
    private class117 field7050 = new class117(64);

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "Lvo;")
    private class345 field7049;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "[I")
    public static int[] field7056 = new int[32];

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "Lqaa;")
    public static class309 field7053;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "Lqba;")
    public static class369 field7055;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lis;I)Ljava/lang/String;")
    public static final String method2874(class101 arg0, int arg1) {
        field7054++;
        if (client.method707(arg0).method1958((byte) -122) == arg1) {
            return null;
        } else if (arg0.field1513 == null || arg0.field1513.trim().length() == 0) {
            return class88.field1324 ? "Hidden-use" : null;
        } else {
            return arg0.field1513;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
    public static void method2875(int arg0) {
        int var1 = 108 / ((56 - arg0) / 63);
        field7055 = null;
        field7053 = null;
        field7056 = null;
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
    public final void method2876(int arg0) {
        field7057++;
        class117 var2 = this.field7050;
        synchronized (this.field7050) {
            this.field7050.method936(-71);
        }
        if (arg0 <= 51) {
            field7055 = null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)V")
    public final void method2877(int arg0, byte arg1) {
        if (arg1 >= -51) {
            this.method2876(-127);
        }
        field7048++;
        class117 var3 = this.field7050;
        synchronized (this.field7050) {
            this.field7050.method939(28093, arg0);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Lks;")
    public final class423 method2878(int arg0, int arg1) {
        field7052++;
        class117 var3 = this.field7050;
        class423 var4;
        synchronized (this.field7050) {
            var4 = (class423) this.field7050.method941((long) arg0, arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field7049;
        byte[] var6;
        synchronized (this.field7049) {
            var6 = this.field7049.method2081(-124, arg0, 35);
        }
        class423 var7 = new class423();
        if (var6 != null) {
            var7.method2495(arg1 + 23324, new class465(var6));
        }
        var7.method2494(3);
        class117 var8 = this.field7050;
        synchronized (this.field7050) {
            this.field7050.method949((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)V")
    public final void method2879(int arg0) {
        class117 var2 = this.field7050;
        synchronized (this.field7050) {
            this.field7050.method950((byte) 34);
            int var3 = -89 % ((arg0 + 5) / 37);
        }
        field7051++;
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lgn;ILvo;)V")
    public class491(class529 arg0, int arg1, class345 arg2) {
        this.field7049 = arg2;
        if (this.field7049 != null) {
            this.field7049.method2098(0, 35);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Z")
    public static final boolean method2880(int arg0, int arg1, int arg2) {
        field7047++;
        if (arg0 >= -72) {
            return false;
        } else {
            return (arg1 & 0x10) != 0;
        }
    }
}
