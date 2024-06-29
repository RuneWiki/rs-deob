import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class67 {

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "Lng;")
    private class226 field1030 = new class226(64);

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "Lic;")
    private class491 field1033;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Lic;")
    public class491 field1029;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "Lic;")
    public static class491 field1032;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ)Leq;", line = 3)
    public final class140 method396(int arg0, boolean arg1) {
        field1028++;
        class226 var3 = this.field1030;
        class140 var4;
        synchronized (this.field1030) {
            var4 = (class140) this.field1030.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1033.method2945(3, arg0, true);
        class140 var6 = new class140();
        var6.field2105 = this;
        if (var5 != null) {
            var6.method929(new class209(var5), false);
        }
        class226 var7 = this.field1030;
        synchronized (this.field1030) {
            this.field1030.method1542(var6, (byte) 112, (long) arg0);
        }
        if (arg1) {
            field1032 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V", line = 32)
    public final void method397(byte arg0) {
        class226 var2 = this.field1030;
        synchronized (this.field1030) {
            this.field1030.method1539(-57);
        }
        field1031++;
        if (arg0 != -45) {
            this.field1033 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(IZ)V", line = 54)
    public final void method398(int arg0, boolean arg1) {
        field1035++;
        if (arg1) {
            method401((byte) -96);
        }
        class226 var3 = this.field1030;
        synchronized (this.field1030) {
            this.field1030.method1534(0, arg0);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V", line = 70)
    public static final void method399(int arg0, int arg1) {
        field1034++;
        if (~arg1 != arg0 && class45.field718[arg1]) {
            class354.field5428.method2932(arg1, -104);
            class185.field2754[arg1] = null;
            class231.field3450[arg1] = null;
            class45.field718[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V", line = 90)
    public final void method400(int arg0) {
        class226 var2 = this.field1030;
        synchronized (this.field1030) {
            this.field1030.method1540(arg0 ^ arg0);
        }
        field1027++;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lai;ILic;Lic;)V", line = 102)
    public class67(class423 arg0, int arg1, class491 arg2, class491 arg3) {
        this.field1033 = arg2;
        this.field1029 = arg3;
        this.field1033.method2942(false, 3);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V", line = 118)
    public static void method401(byte arg0) {
        field1032 = null;
        if (arg0 != -52) {
            method401((byte) 37);
        }
    }
}
