import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class136 extends class154 {

    @OriginalMember(owner = "client!un", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2149 = null;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "[I")
    public static int[] field2150 = new int[4096];

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    public static int field2152 = 0;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "Z")
    public static boolean field2153 = false;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "B")
    public byte field2147;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!un", name = "V", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!un", name = "W", descriptor = "Lkh;")
    public class166 field2156;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)[B", line = 9)
    public final byte[] method410(boolean arg0) {
        if (arg0) {
            this.field2156 = (class166) null;
        }
        field2151++;
        if (this.field2317 || this.field2156.field2532 < this.field2156.field2500.length - this.field2147) {
            throw new RuntimeException();
        }
        return this.field2156.field2500;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I[B)[B", line = 34)
    public static final byte[] method989(int arg0, byte[] arg1) {
        field2154++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class343.method2373(arg1, 0, var2, 0, arg1.length);
            int var3 = 127 % ((arg0 - 57) / 38);
            return var2;
        }
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V", line = 55)
    public static void method990(int arg0) {
        field2150 = null;
        field2149 = null;
        if (arg0 < 115) {
            field2153 = true;
        }
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)I", line = 70)
    public final int method414(int arg0) {
        field2146++;
        if (this.field2156 == null) {
            return 0;
        } else if (arg0 == 7434) {
            return this.field2156.field2532 * 100 / (this.field2156.field2500.length - this.field2147);
        } else {
            return -5;
        }
    }
}
