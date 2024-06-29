import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class286 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "Laj;")
    private class287 field4263 = new class287(64);

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lom;")
    public class344 field4262;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Lom;")
    private class344 field4269;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "[Lns;")
    public static class373[] field4264 = new class373[50];

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V")
    public final void method1894(int arg0, byte arg1) {
        class287 var3 = this.field4263;
        synchronized (this.field4263) {
            this.field4263.method1908(arg0, (byte) -11);
            if (arg1 != 124) {
                this.method1897((byte) 0);
            }
        }
        field4261++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lvp;")
    public final class173 method1895(int arg0, int arg1) {
        field4267++;
        class287 var3 = this.field4263;
        class173 var4;
        synchronized (this.field4263) {
            var4 = (class173) this.field4263.method1900((long) arg0, 76);
        }
        if (arg1 <= 8) {
            this.field4262 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field4269;
        byte[] var6;
        synchronized (this.field4269) {
            var6 = this.field4269.method2216(3, arg0, true);
        }
        class173 var7 = new class173();
        var7.field2848 = this;
        if (var6 != null) {
            var7.method1303(new class61(var6), (byte) -83);
        }
        class287 var8 = this.field4263;
        synchronized (this.field4263) {
            this.field4263.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
    public static void method1896(boolean arg0) {
        field4264 = null;
        if (arg0) {
            field4264 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public final void method1897(byte arg0) {
        class287 var2 = this.field4263;
        synchronized (this.field4263) {
            int var3 = -103 / ((arg0 + 61) / 45);
            this.field4263.method1912(-2552);
        }
        field4268++;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V")
    public final void method1898(boolean arg0) {
        class287 var2 = this.field4263;
        synchronized (this.field4263) {
            if (arg0) {
                return;
            }
            this.field4263.method1913(true);
        }
        field4266++;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lmea;ILom;Lom;)V")
    public class286(class398 arg0, int arg1, class344 arg2, class344 arg3) {
        this.field4262 = arg3;
        this.field4269 = arg2;
        this.field4269.method2236(3, 0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method1899(String arg0, int arg1, String arg2, int arg3) {
        class163.field2735 = arg1;
        field4265++;
        class37.field1050 = arg3;
        class210.method1471(false, arg0, (byte) 22, arg2);
    }
}
