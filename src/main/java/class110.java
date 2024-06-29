import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class110 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[Lmb;")
    public class96[] field2028;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[B")
    public byte[] field2031;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[I")
    public int[] field2034;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[S")
    public short[] field2035;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[S")
    public short[] field2029;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Lmb;")
    public static class96 field2037 = class243.method1708("Benutzeroberfl-=che geladen)3", (byte) 108);

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Luc;")
    public static class11 field2038 = new class11(20);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
    public final boolean method841(int arg0, int arg1) {
        if (arg0 < 17) {
            field2038 = null;
        }
        field2036++;
        return (this.field2031[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)I")
    public final int method842(int arg0, int arg1) {
        field2033++;
        if (arg1 != 3) {
            field2039 = 0;
        }
        return this.field2031[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method843(byte arg0) {
        if (arg0 != 92) {
            field2030 = 83;
        }
        field2037 = null;
        field2038 = null;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(II)Z")
    public static final boolean method844(int arg0, int arg1) {
        field2026++;
        if (arg0 == 1318177530) {
            return ((arg1 & 0x4E91CAFA) >> 30) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
    public class110(int arg0) {
        this.field2027 = arg0;
        this.field2028 = new class96[this.field2027];
        this.field2031 = new byte[this.field2027];
        this.field2034 = new int[this.field2027];
        this.field2035 = new short[this.field2027];
        this.field2029 = new short[this.field2027];
    }
}
