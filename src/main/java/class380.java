import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class380 {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Lgn;")
    public static class475 field5669 = new class475(49, 6);

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lit;")
    public static class439 field5670 = null;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Lhe;")
    public static class239 field5671;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)Ljq;", line = 4)
    public static final class338 method2294(byte arg0, int arg1, int arg2) {
        if (arg0 < 60) {
            return null;
        }
        field5664++;
        class338 var3 = (class338) class390.field5787.method2310((byte) -104, (long) arg1 | (long) arg2 << 32);
        if (var3 == null) {
            var3 = new class338(arg2, arg1);
            class390.field5787.method2317(-1, var3.field1177, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Ljava/lang/String;", line = 24)
    public static final String method2295(int arg0, int arg1) {
        if (arg0 == 109) {
            field5666++;
            return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF8E78) >> 16) + "." + ((arg1 & 0xFF45) >> 8) + "." + (arg1 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Lne;", line = 35)
    public static final class199 method2296(boolean arg0) {
        if (arg0) {
            field5667 = 119;
        }
        field5668++;
        try {
            return (class199) Class.forName("fv").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 55)
    public static void method2297(int arg0) {
        field5669 = null;
        field5671 = null;
        field5670 = null;
        if (arg0 >= -61) {
            field5670 = null;
        }
    }
}
