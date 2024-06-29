import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class225 extends class210 {

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Lwl;")
    public static class280 field3033 = new class280();

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public static int field3043 = -2;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "[I")
    public static int[] field3045 = new int[5];

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "Lwl;")
    public static class280 field3039 = new class280();

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field3046 = -1;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "C")
    public char field3027;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "J")
    public long field3040;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "Lcs;")
    public class225 field3035;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "Z")
    public boolean field3031;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "[I")
    public static int[] field3042;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
    public final int method1332(int arg0) {
        field3030++;
        if (arg0 < 29) {
            method1412(null, -50);
        }
        return this.field3034;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V")
    public static final void method1411(int arg0, byte arg1) {
        class389.field5277 = 100;
        class392.field5309 = -1;
        field3041++;
        class491.field6838 = arg0;
        int var2 = -30 / ((15 - arg1) / 47);
        class497.field6891 = 3;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)J")
    public final long method1329(byte arg0) {
        field3044++;
        int var2 = 104 % ((arg0 - 45) / 38);
        return this.field3040;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lcr;I)V")
    public static final void method1412(class403 arg0, int arg1) {
        if (arg1 < 5) {
            method1414(21);
        }
        field3028++;
        if (class279.field3670 != arg0.field5468) {
            return;
        }
        if (class385.field5232.field7638 == null) {
            arg0.field5419 = 0;
            arg0.field5510 = 0;
            return;
        }
        arg0.field5556 = 150;
        arg0.field5546 = (int) (Math.sin((double) class31.field516 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field5510 = class391.field5305;
        arg0.field5516 = 5;
        arg0.field5419 = class177.method1184(0, class385.field5232.field7638);
        arg0.field5415 = class385.field5232.field6172;
        arg0.field5543 = class385.field5232.field6166;
        arg0.field5477 = 0;
        arg0.field5484 = class385.field5232.field6251;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)Z")
    public final boolean method1334(int arg0) {
        if (arg0 != 0) {
            this.method1333((byte) 31);
        }
        field3037++;
        return this.field3031;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(IB)V")
    public static final void method1413(int arg0, byte arg1) {
        field3036++;
        class253 var2 = class332.method1911(arg0, (byte) -120, 6);
        int var3 = -42 % ((arg1 - 43) / 55);
        var2.method1523((byte) -111);
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
    public static void method1414(int arg0) {
        field3042 = null;
        field3039 = null;
        field3033 = null;
        field3045 = null;
        if (arg0 != 5099) {
            field3045 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)C")
    public final char method1331(byte arg0) {
        field3038++;
        if (arg0 <= 59) {
            this.method1332(-106);
        }
        return this.field3027;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)I")
    public final int method1333(byte arg0) {
        if (arg0 <= 73) {
            this.field3034 = 11;
        }
        field3032++;
        return this.field3029;
    }
}
