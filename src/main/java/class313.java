import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class313 extends class259 {

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public int field5011 = 0;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "[I")
    public int[] field5021 = new int[5];

    @OriginalMember(owner = "client!f", name = "O", descriptor = "[Lah;")
    public class156[] field5037 = new class156[5];

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public int field5025;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field5008;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field5007 = 0;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "[Lta;")
    public static class81[] field5026 = new class81[6];

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field5035 = 0;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "B")
    public byte field5034;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public int field5031;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public int field5033;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public int field5036;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Lde;")
    public class214 field5027;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lgh;")
    public class226 field5013;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lug;")
    public class231 field5012;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lnf;")
    public class239 field5016;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Llc;")
    public static class270 field5017;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Lbl;")
    public class272 field5023;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Led;")
    public class297 field5015;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lcc;")
    public class304 field5014;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lf;")
    public class313 field5009;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Z")
    public boolean field5020;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Z")
    public boolean field5028;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Z")
    public boolean field5029;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmh;II)Ljava/lang/String;")
    public static final String method2105(class263 arg0, int arg1, int arg2) {
        field5018++;
        if (!client.method903(arg0).method1732(arg2, (byte) 125) && arg0.field4117 == null) {
            return null;
        } else if (arg1 < 110) {
            return null;
        } else if (arg0.field4092 == null || arg0.field4092.length <= arg2 || arg0.field4092[arg2] == null || arg0.field4092[arg2].trim().length() == 0) {
            return class270.field4368 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field4092[arg2];
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(III)V")
    public class313(int arg0, int arg1, int arg2) {
        this.field5025 = arg2;
        this.field5008 = this.field5019 = arg0;
        this.field5010 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    public static final void method2106(int arg0, int arg1) {
        field5024++;
        class287.field4602.method1416(arg1, 0);
        class269.field4333.method1416(arg1, arg0);
        class82.field1314.method1416(arg1, arg0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JI)V")
    public static final void method2107(long arg0, int arg1) {
        field5032++;
        class144.field2338.field735 = 0;
        if (arg1 < 8) {
            method2108((byte) -107);
        }
        class144.field2338.method360(21, 25759);
        class144.field2338.method382(902642416, arg0);
        class43.field569 = 0;
        class145.field2347 = -3;
        field5007 = 0;
        class291.field4629 = 1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method2108(byte arg0) {
        field5017 = null;
        field5026 = null;
        if (arg0 > -46) {
            field5035 = 26;
        }
    }
}
