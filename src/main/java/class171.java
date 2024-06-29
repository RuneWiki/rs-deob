import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class171 extends class49 {

    @OriginalMember(owner = "client!pja", name = "B", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!pja", name = "w", descriptor = "Ljava/lang/String;")
    public String field2169;

    @OriginalMember(owner = "client!pja", name = "I", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!pja", name = "H", descriptor = "Ljava/lang/String;")
    public String field2180;

    @OriginalMember(owner = "client!pja", name = "J", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!pja", name = "K", descriptor = "J")
    public long field2183;

    @OriginalMember(owner = "client!pja", name = "L", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!pja", name = "A", descriptor = "Z")
    public boolean field2173;

    @OriginalMember(owner = "client!pja", name = "G", descriptor = "J")
    public long field2179;

    @OriginalMember(owner = "client!pja", name = "E", descriptor = "Z")
    public boolean field2177;

    @OriginalMember(owner = "client!pja", name = "y", descriptor = "I")
    public int field2171;

    @OriginalMember(owner = "client!pja", name = "F", descriptor = "Z")
    public boolean field2178;

    @OriginalMember(owner = "client!pja", name = "z", descriptor = "[C")
    public static char[] field2172 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!pja", name = "x", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!pja", name = "C", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!pja", name = "D", descriptor = "Ljava/lang/String;")
    public String field2176;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(IILha;)Lhw;")
    public static final class300 method1098(int arg0, int arg1, class473 arg2) {
        int var3 = 47 % ((-arg1 - 21) / 53);
        field2175++;
        class485 var4 = class778.method4283(true, arg0, arg2, (byte) 2);
        return var4 == null ? null : var4.field6707;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
    public static void method1099(int arg0) {
        field2172 = null;
        if (arg0 > -42) {
            field2172 = null;
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)Z")
    public static final boolean method1100(int arg0, int arg1, int arg2) {
        field2170++;
        if (class80.method572(arg2, arg0, false)) {
            if (arg1 != 353) {
                method1100(-63, 62, -119);
            }
            return class2.method9(arg2, arg0, true) | (arg0 & 0x9000) != 0 | class627.method3610(arg2, arg1 ^ 0x161, arg0) ? true : (arg2 & 0x37) == 0 & (class183.method1155(arg0, (byte) -117, arg2) | (arg0 & 0x2000) != 0 | class190.method1187(arg2, arg1 - 256, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class171(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field2174 = arg3;
        this.field2169 = arg1;
        this.field2181 = arg6;
        this.field2180 = arg0;
        this.field2182 = arg2;
        this.field2183 = arg10;
        this.field2184 = arg7;
        this.field2173 = arg9;
        this.field2179 = arg5;
        this.field2177 = arg11;
        this.field2171 = arg4;
        this.field2178 = arg8;
    }
}
