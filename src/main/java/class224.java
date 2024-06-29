import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class224 {

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "B")
    public byte field3119 = 0;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "S")
    public short field3123;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "S")
    public short field3118;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "B")
    public byte field3112;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "B")
    public byte field3107;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3100 = " more options";

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field3104 = 0;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
    public static int[] field3105 = new int[13];

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "B")
    public byte field3115;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "B")
    public byte field3122;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "B")
    public byte field3126;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "B")
    public byte field3127;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "Ldg;")
    public class224 field3114;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lgb;")
    public class241 field3110;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "Ldb;")
    public class26 field3129;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lgl;")
    public class339 field3108;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Lgl;")
    public class339 field3125;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lbg;")
    public class374 field3113;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "Lbe;")
    public class44 field3124;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Lf;")
    public class57 field3116;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "Lf;")
    public class57 field3121;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "S")
    public short field3128;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Z")
    public boolean field3109;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Z")
    public boolean field3111;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "Z")
    public boolean field3120;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[Z")
    public static boolean[] field3103;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V")
    public static final void method1525(int arg0, boolean arg1) {
        if (arg1) {
            field3102++;
            class450 var2 = class59.method540(9, arg0, 1000);
            var2.method2798(-664528978);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method1526(int arg0) {
        field3101++;
        class404.field5626.method776((byte) 100);
        for (int var1 = 0; var1 < 32; var1++) {
            class180.field2641[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class3.field21[var2] = 0L;
        }
        if (arg0 >= -81) {
            method1525(80, false);
        }
        class190.field2735 = 0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static final void method1527(byte arg0) {
        class334.field4531.method2539(arg0 + 182);
        field3106++;
        if (arg0 != -120) {
            method1526(-117);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static void method1528(int arg0) {
        if (arg0 != -11390) {
            method1525(71, true);
        }
        field3100 = null;
        field3105 = null;
        field3103 = null;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public final void method1529(int arg0) {
        while (this.field3129 != null) {
            class26 var2 = this.field3129.field463;
            this.field3129.method323(0);
            this.field3129 = var2;
        }
        if (arg0 != 26318) {
            method1527((byte) -124);
        }
        field3117++;
        this.field3119 = 0;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(III)V")
    public class224(int arg0, int arg1, int arg2) {
        this.field3123 = (short) arg1;
        this.field3118 = (short) arg2;
        this.field3107 = this.field3112 = (byte) arg0;
    }
}
