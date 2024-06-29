import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class73 implements class623 {

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1023 = 0;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Leba;")
    public static class590 field1020;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 3)
    public static void method621(byte arg0) {
        field1020 = null;
        int var1 = -11 % ((-arg0 - 58) / 39);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I", line = 15)
    public static final int method622(int arg0, int arg1) {
        field1022++;
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        if (arg0 != -461024383) {
            method621((byte) 25);
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!oi", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field1024++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 54)
    public class73(String arg0, int arg1) {
        this.field1025 = arg1;
    }
}
