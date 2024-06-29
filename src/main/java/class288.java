import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class288 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Ljq;")
    private class361 field4207 = new class361();

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lmq;")
    private class358 field4216 = new class358();

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    private int field4218;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    private int field4219;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lqi;")
    private class406 field4215;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "[S")
    public static short[] field4217 = new short[] { 58, 21, 57, 17, 25, 50, 9, 19 };

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[[[Lrb;")
    public static class239[][][] field4208;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lwm;Z)Ljava/lang/String;")
    public static final String method1776(class403 arg0, boolean arg1) {
        field4211++;
        if (!arg1) {
            method1780((byte) -2);
        }
        return class526.method3109(arg0, 32767, 26702);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public final void method1777(byte arg0) {
        this.field4216.method2120((byte) 93);
        field4210++;
        this.field4215.method2408(arg0 + 20);
        this.field4207 = new class361();
        this.field4218 = this.field4219;
        if (arg0 != 95) {
            this.field4215 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Z")
    public static final boolean method1778(int arg0, int arg1, int arg2) {
        field4212++;
        if (arg1 != 50) {
            method1780((byte) -51);
        }
        return class57.method474((byte) 29, arg0, arg2) || class414.method2453(arg2, arg0, -117);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljq;BJ)V")
    public final void method1779(class361 arg0, byte arg1, long arg2) {
        if (this.field4218 == 0) {
            class361 var5 = this.field4216.method2115((byte) -103);
            var5.method2891(arg1 + 51);
            var5.method2132(12);
            if (this.field4207 == var5) {
                class361 var6 = this.field4216.method2115((byte) -103);
                var6.method2891(-127);
                var6.method2132(12);
            }
        } else {
            this.field4218--;
        }
        if (arg1 == -27) {
            field4214++;
            this.field4215.method2413(arg2, arg0, -1);
            this.field4216.method2118(arg0, true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static void method1780(byte arg0) {
        if (arg0 == -9) {
            field4217 = null;
            field4208 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZJ)Ljq;")
    public final class361 method1781(boolean arg0, long arg1) {
        field4209++;
        class361 var4 = (class361) this.field4215.method2405(arg1, -106);
        if (var4 != null) {
            this.field4216.method2118(var4, true);
        }
        if (arg0) {
            this.method1777((byte) 79);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
    public class288(int arg0) {
        this.field4218 = arg0;
        this.field4219 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field4215 = new class406(var2);
    }
}
