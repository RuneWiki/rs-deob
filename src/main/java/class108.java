import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class108 extends class106 {

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static volatile int field1957 = 0;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "Loa;")
    public static class99 field1959 = class221.method1463(2844, "Cache:");

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "Lic;")
    public class141 field1951;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "Lbj;")
    public static class155 field1954;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "[B")
    public byte[] field1956;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "[I")
    public static int[] field1947;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "[S")
    public static short[] field1958;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)Lqc;")
    public static final class63 method745(int arg0, boolean arg1) {
        class63 var2 = (class63) class76.field1350.method512((byte) 123, (long) arg0);
        ++field1948;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg0 > -32769) {
                var3 = class39.field670.method1242(arg0, 1, 6801);
            } else {
                var3 = class76.field1342.method1242(arg0 & 32767, 1, 6801);
            }
            class63 var4 = new class63();
            if (var3 != null) {
                var4.method410(new class261(var3), (byte) -102);
            }
            if (!arg1) {
                field1958 = null;
            }
            if (arg0 >= 32768) {
                var4.method418((byte) -110);
            }
            class76.field1350.method511(-128, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V")
    public static void method746(int arg0) {
        field1959 = null;
        field1954 = null;
        field1947 = null;
        field1958 = null;
        if (arg0 < 24) {
            method745(15, true);
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)[B")
    public final byte[] method136(int arg0) {
        if (arg0 != 100) {
            method747(true, (class99) null);
        }
        ++field1953;
        if (super.field1766) {
            throw new RuntimeException();
        } else {
            return this.field1956;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLoa;)Lrg;")
    public static final class229 method747(boolean arg0, class99 arg1) {
        ++field1950;
        if (arg0) {
            field1958 = null;
        }
        for (class229 var2 = (class229) class168.field3005.method529(10); var2 != null; var2 = (class229) class168.field3005.method533(-69)) {
            if (var2.field3968.method679((byte) 25, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V")
    public static final void method748(int arg0) {
        class35.field621 = null;
        if (arg0 != 100) {
            method747(false, (class99) null);
        }
        ++field1946;
        class13.field120 = null;
        class278.field4879 = null;
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)I")
    public final int method133(int arg0) {
        ++field1949;
        if (arg0 != -108) {
            field1955 = -70;
        }
        return super.field1766 ? 0 : 100;
    }
}
