import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class146 {

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Lff;")
    private class9 field2077 = new class9(64);

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Lff;")
    public class9 field2085 = new class9(2);

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "Lvh;")
    private class240 field2084;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Lvh;")
    public class240 field2082;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Ljm;")
    public static class485 field2079 = new class485(20, -1);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public final void method934(int arg0) {
        field2078++;
        class9 var2 = this.field2077;
        synchronized (this.field2077) {
            if (arg0 != 33) {
                this.method938(68, 28);
            }
            this.field2077.method67(arg0 ^ 0x18);
        }
        class9 var3 = this.field2085;
        synchronized (this.field2085) {
            this.field2085.method67(100);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public static void method935(byte arg0) {
        field2079 = null;
        if (arg0 >= -49) {
            field2079 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
    public final void method936(int arg0, int arg1) {
        field2080++;
        class9 var3 = this.field2077;
        synchronized (this.field2077) {
            this.field2077.method61((byte) -67, arg1);
            if (arg0 != 22566) {
                this.field2082 = null;
            }
        }
        class9 var4 = this.field2085;
        synchronized (this.field2085) {
            this.field2085.method61((byte) -67, arg1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public final void method937(int arg0) {
        class9 var2 = this.field2077;
        synchronized (this.field2077) {
            this.field2077.method65(false);
        }
        field2083++;
        if (arg0 < -62) {
            class9 var3 = this.field2085;
            synchronized (this.field2085) {
                this.field2085.method65(false);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)Lct;")
    public final class97 method938(int arg0, int arg1) {
        field2076++;
        class9 var3 = this.field2077;
        class97 var4;
        synchronized (this.field2077) {
            var4 = (class97) this.field2077.method56((long) arg0, 42);
        }
        if (arg1 <= 118) {
            this.method938(101, -112);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2084.method1411(true, arg0, 33);
        class97 var6 = new class97();
        var6.field1342 = this;
        if (var5 != null) {
            var6.method660(new class365(var5), (byte) 91);
        }
        class9 var7 = this.field2077;
        synchronized (this.field2077) {
            this.field2077.method73((long) arg0, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Llf;ILvh;Lvh;)V")
    public class146(class157 arg0, int arg1, class240 arg2, class240 arg3) {
        this.field2084 = arg2;
        this.field2082 = arg3;
        this.field2084.method1397((byte) -122, 33);
    }
}
