import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class120 {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Ljv;")
    private class55 field1956 = new class55(128);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lbu;")
    private class17 field1954;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Liv;")
    public static class64 field1957 = new class64(41, 1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Lpr;")
    public final class308 method886(int arg0, byte arg1) {
        field1958++;
        class55 var3 = this.field1956;
        class308 var4;
        synchronized (this.field1956) {
            var4 = (class308) this.field1956.method494(arg1 ^ 0xFFFFFFB2, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1954.method114(class526.method3127((byte) 22, arg0), class124.method950(arg0, 0), -89);
        class308 var6 = new class308();
        if (var5 != null) {
            var6.method2021((byte) -100, new class145(var5));
        }
        if (arg1 != -78) {
            this.method886(-4, (byte) 24);
        }
        class55 var7 = this.field1956;
        synchronized (this.field1956) {
            this.field1956.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method887(int arg0) {
        field1957 = null;
        if (arg0 != 1) {
            method887(-15);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method888(int arg0, int arg1) {
        class382.field5785 = new int[arg1];
        class414.field6181 = new int[arg1];
        field1955++;
        int var2 = -55 / ((-arg0 - 3) / 34);
        class378.field5720 = new int[arg1];
        class400.field6024 = new int[arg1];
        class32.field643 = new int[arg1];
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Loq;ILbu;)V")
    public class120(class239 arg0, int arg1, class17 arg2) {
        this.field1954 = arg2;
        if (this.field1954 != null) {
            int var4 = this.field1954.method138(false) - 1;
            this.field1954.method119(29630, var4);
        }
    }
}
