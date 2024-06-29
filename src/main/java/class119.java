import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class119 {

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "B")
    private byte field1954;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lui;")
    public static class236 field1941 = new class236(32);

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lqe;")
    public static class168 field1951 = class66.method448("Starte 3D)2Softwarebibliothek)3", -126);

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "J")
    public static long field1953 = 0L;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII[B)Lqe;")
    public static final class168 method812(byte arg0, int arg1, int arg2, byte[] arg3) {
        field1945++;
        int var4 = -123 % ((arg0 - 12) / 47);
        class168 var5 = new class168();
        var5.field2870 = 0;
        var5.field2904 = new byte[arg1];
        for (int var6 = arg2; var6 < arg2 + arg1; var6++) {
            if (arg3[var6] != 0) {
                var5.field2904[var5.field2870++] = arg3[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method813(int arg0) {
        field1941 = null;
        if (arg0 < -49) {
            field1951 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
    public final int method814(int arg0) {
        field1942++;
        if (arg0 != -9) {
            this.method815(false);
        }
        return this.field1954 & 0x7;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class119() {
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)I")
    public final int method815(boolean arg0) {
        field1940++;
        if (arg0) {
            this.field1949 = -123;
        }
        return (this.field1954 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lnh;)V")
    public class119(class112 arg0) {
        this.field1954 = arg0.method750(-97);
        this.field1949 = arg0.method731(false);
        this.field1952 = arg0.method769((byte) -86);
        this.field1939 = arg0.method769((byte) -86);
        this.field1950 = arg0.method769((byte) -86);
        this.field1946 = arg0.method769((byte) -86);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Z")
    public static final boolean method816(byte arg0) {
        if (arg0 < 8) {
            field1951 = null;
        }
        field1944++;
        return class62.field844;
    }
}
