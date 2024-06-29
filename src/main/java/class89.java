import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public abstract class class89 extends class107 {

    @OriginalMember(owner = "client!kca", name = "A", descriptor = "Ldr;")
    public class750 field1003;

    @OriginalMember(owner = "client!kca", name = "D", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!kca", name = "E", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!kca", name = "F", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "Lla;")
    public static class475 field1002;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Z")
    public abstract boolean method664(int arg0);

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V")
    public static void method665(int arg0) {
        field1002 = null;
        if (arg0 != -30548) {
            method665(-119);
        }
    }

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method666(int arg0);

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)Lbt;")
    public static final class48 method667(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        return var3 == null ? null : var3.field586;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)I")
    public static final int method668(int arg0, byte arg1) {
        field1001++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 != 45) {
            return 13;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BII)Z")
    public static final boolean method669(byte arg0, int arg1, int arg2) {
        if (arg0 == 86) {
            field1006++;
            return class270.method1751(33, arg2, arg1) | (arg1 & 0x70000) != 0 || class147.method1033((byte) 42, arg2, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Ldr;I)V")
    public class89(class750 arg0, int arg1) {
        this.field1003 = arg0;
        this.field1005 = arg1;
    }
}
