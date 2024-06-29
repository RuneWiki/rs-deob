import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class300 extends class72 {

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    private final int field5127;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    private final int field5135;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    private final int field5134;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    private final int field5131;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5133 = 0;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static volatile int field5125 = 0;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Loh;")
    public static class258 field5137 = class153.method1046("Bitte warten Sie)3)3)3", 105);

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "Lkk;")
    public static class112 field5136;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Lgb;")
    public static class213 field5132;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V", line = 5)
    public final void method494(int arg0, int arg1, int arg2) {
        field5128++;
        if (arg1 != 17898) {
            field5129 = 82;
        }
        int var4 = this.field5135 * arg2 >> 12;
        int var5 = this.field5131 * arg2 >> 12;
        int var6 = this.field5127 * arg0 >> 12;
        int var7 = this.field5134 * arg0 >> 12;
        class171.method1147(this.field1264, this.field1269, var6, arg1 - 30892, var5, var7, var4);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIII)V", line = 33)
    public class300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5127 = arg1;
        this.field5135 = arg0;
        this.field5134 = arg3;
        this.field5131 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V", line = 58)
    public static final void method2109(byte arg0) {
        field5138++;
        try {
            if (class292.field5027 == 1) {
                int var1 = class224.field3844.method851((byte) 12);
                if (var1 > 0 && class224.field3844.method829(arg0 - 32)) {
                    int var2 = var1 - class59.field984;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class224.field3844.method858((byte) -64, var2);
                    return;
                }
                class224.field3844.method822((byte) -78);
                class224.field3844.method840(16384);
                class119.field2108 = null;
                class236.field4127 = null;
                if (class272.field4706 == null) {
                    class292.field5027 = 0;
                } else {
                    class292.field5027 = 2;
                }
            }
            if (arg0 != 26) {
                method2109((byte) -38);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class224.field3844.method822((byte) -76);
            class292.field5027 = 0;
            class119.field2108 = null;
            class272.field4706 = null;
            class236.field4127 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 106)
    public final void method495(int arg0, int arg1, int arg2) {
        if (arg2 != 512) {
            return;
        }
        field5124++;
        int var4 = this.field5131 * arg1 >> 12;
        int var5 = this.field5127 * arg0 >> 12;
        int var6 = this.field5135 * arg1 >> 12;
        int var7 = this.field5134 * arg0 >> 12;
        class255.method1722(this.field1264, var6, var5, var7, -64, var4, this.field1269, this.field1267);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 131)
    public static void method2110(int arg0) {
        field5136 = null;
        field5132 = null;
        if (arg0 > 38) {
            field5137 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)V", line = 144)
    public final void method492(int arg0, int arg1, byte arg2) {
        int var4 = this.field5135 * arg0 >> 12;
        field5123++;
        int var5 = this.field5131 * arg0 >> 12;
        int var6 = this.field5127 * arg1 >> 12;
        int var7 = this.field5134 * arg1 >> 12;
        class285.method2007((byte) -80, var7, var5, var6, this.field1267, var4);
        if (arg2 >= -120) {
            field5132 = (class213) null;
        }
    }
}
