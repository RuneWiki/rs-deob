import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class27 extends class32 {

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "[I")
    public static int[] field563 = new int[32];

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "Z")
    public static volatile boolean field579 = false;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "Lij;")
    public static class50 field584;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "Z")
    public static boolean field589;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "Lij;")
    public static class50 field588;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "Lbj;")
    public class107 field587;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "Lwb;")
    public class170 field573;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "Lnf;")
    public class213 field580;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "Lwi;")
    public static class21 field585;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Lkb;")
    public class23 field566;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public final void method246(int arg0) {
        field570++;
        this.field580 = null;
        this.field566 = null;
        if (arg0 != 25243) {
            field589 = true;
        }
        this.field573 = null;
        this.field587 = null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)V")
    public static void method247(boolean arg0) {
        field585 = null;
        if (!arg0) {
            field588 = null;
        }
        field584 = null;
        field588 = null;
        field563 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[Lce;B)V")
    public static final void method248(int arg0, class10[] arg1, byte arg2) {
        field560++;
        if (arg2 != -17) {
            method250(109, -127, 124, 50);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class10 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field227 == 0) {
                    if (var4.field297 != null) {
                        method248(arg0, var4.field297, (byte) -17);
                    }
                    class87 var5 = (class87) class132.field2304.method443((long) var4.field155, (byte) -113);
                    if (var5 != null) {
                        class160.method1127(arg2 - 17109, var5.field1678, arg0);
                    }
                }
                if (arg0 == 0 && var4.field253 != null) {
                    class93 var6 = new class93();
                    var6.field1739 = var4.field253;
                    var6.field1740 = var4;
                    class214.method1422(var6, -15181);
                }
                if (arg0 == 1 && var4.field177 != null) {
                    if (var4.field216 >= 0) {
                        class10 var7 = class89.method698(var4.field155, (byte) 94);
                        if (var7 == null || var7.field297 == null || var4.field216 >= var7.field297.length || var7.field297[var4.field216] != var4) {
                            continue;
                        }
                    }
                    class93 var8 = new class93();
                    var8.field1740 = var4;
                    var8.field1739 = var4.field177;
                    class214.method1422(var8, -15181);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
    public static final void method249(byte arg0, int arg1) {
        if (arg0 < -16) {
            field564++;
            if (class100.field1833 == null || arg1 > class100.field1833.length) {
                class100.field1833 = new int[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIII)V")
    public static final void method250(int arg0, int arg1, int arg2, int arg3) {
        class57.field1027 = new class65[arg0][arg1][arg2];
        class254.field4390 = new int[arg0][arg1 + 1][arg2 + 1];
        class43.method321(false);
        class139.field2421 = arg1;
        class54.field978 = arg2;
        class206.field3416 = new int[arg0][arg1 + 1][arg2 + 1];
        class51.method415();
        class80.field1461 = arg3;
        class210.field3497 = new boolean[class80.field1461 + class80.field1461 + 1][class80.field1461 + class80.field1461 + 1];
        class35.field679 = new boolean[class80.field1461 + class80.field1461 + 2][class80.field1461 + class80.field1461 + 2];
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field563[var1] = var0 - 1;
            var0 += var0;
        }
        field584 = class78.method578(125, "<col=ffffff> )4 ");
        field589 = false;
        field588 = class78.method578(121, "blinken2:");
    }
}
