import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class623 {

    @OriginalMember(owner = "client!us", name = "w", descriptor = "Laq;")
    public class160 field2;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "[I")
    public static int[] field3 = new int[4096];

    @OriginalMember(owner = "client!us", name = "y", descriptor = "Lbga;")
    public static class356 field4;

    @OriginalMember(owner = "client!us", name = "z", descriptor = "Ldh;")
    public static class320 field5;

    @OriginalMember(owner = "client!us", name = "A", descriptor = "Lbq;")
    public static class289 field6;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "[Lhu;")
    public static class131[] field7;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
    public static void method1(byte arg0) {
        if (arg0 <= 105) {
            method2(10, -7, null, (byte) 86);
        }
        field6 = null;
        field3 = null;
        field5 = null;
        field4 = null;
        field7 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILjava/lang/Object;B)[B")
    public static final byte[] method2(int arg0, int arg1, Object arg2, byte arg3) {
        if (arg3 != -7) {
            field6 = null;
        }
        field1++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class134.method865(arg1, var4, arg0, -24901);
        } else if (arg2 instanceof class13) {
            class13 var5 = (class13) arg2;
            return var5.method61(arg1, arg0, (byte) 118);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Laq;)V")
    public class1(class160 arg0) {
        this.field2 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3[var0] = class604.method3431(var0, -61440);
        }
        field4 = new class356();
        field5 = new class320(104, 7);
        field6 = new class289();
    }
}
