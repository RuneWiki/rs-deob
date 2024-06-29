import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class283 extends class314 {

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Lud;")
    public static class279 field5045 = class130.method1024("p11_full", 255);

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lud;")
    public static class279 field5046 = class130.method1024(")4", 255);

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "Lud;")
    public static class279 field5059 = class130.method1024(")4p=", 255);

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "Lhc;")
    public static class171 field5052 = new class171(5);

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field5062 = 0;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "Lud;")
    public static class279 field5061 = class130.method1024("Bitte warten Sie)3)3)3", 255);

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Lud;")
    private static class279 field5064 = class130.method1024("flash2:", 255);

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field5063 = 0;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "Lud;")
    public static class279 field5065 = field5064;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "Lud;")
    public static class279 field5067 = field5064;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "Lud;")
    public static class279 field5066 = class130.method1024("hint_mapedge", 255);

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public int field5048;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public int field5050;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public int field5057;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public int field5058;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public int field5060;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Z", line = 26)
    public static final boolean method2031(int arg0, int arg1) {
        field5044++;
        if (class142.field2573[arg1]) {
            return true;
        } else if (class112.field2056.method1185(arg1, 124)) {
            int var2 = class112.field2056.method1174(arg1, -17680);
            if (var2 == 0) {
                class142.field2573[arg1] = true;
                return true;
            }
            if (class18.field545[arg1] == null) {
                class18.field545[arg1] = new class8[var2];
            }
            if (arg0 != 20714) {
                field5067 = (class279) null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class18.field545[arg1][var3] == null) {
                    byte[] var4 = class112.field2056.method1192(0, arg1, var3);
                    if (var4 != null) {
                        class8 var5 = class18.field545[arg1][var3] = new class8();
                        var5.field299 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method53(new class53(var4), (byte) 126);
                        } else {
                            var5.method57(new class53(var4), 1);
                        }
                    }
                }
            }
            class142.field2573[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V", line = 88)
    public static final void method2032(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class69.field1363; var3++) {
            for (int var4 = 0; var4 < class207.field3668; var4++) {
                for (int var5 = 0; var5 < class54.field1193; var5++) {
                    class191 var6 = class24.field619[var3][var4][var5];
                    if (var6 != null) {
                        class17 var7 = var6.field3439;
                        if (var7 != null && var7.field522.method895()) {
                            class276.method1951(var7.field522, var3, var4, var5, 1, 1);
                            if (var7.field525 != null && var7.field525.method895()) {
                                class276.method1951(var7.field525, var3, var4, var5, 1, 1);
                                var7.field522.method894(var7.field525, 0, 0, 0, false);
                                var7.field525 = var7.field525.method893(arg0, arg1, arg2);
                            }
                            var7.field522 = var7.field522.method893(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3451; var8++) {
                            class18 var9 = var6.field3455[var8];
                            if (var9 != null && var9.field563.method895()) {
                                class276.method1951(var9.field563, var3, var4, var5, var9.field562 + 1 - var9.field560, var9.field556 - var9.field564 + 1);
                                var9.field563 = var9.field563.method893(arg0, arg1, arg2);
                            }
                        }
                        class243 var10 = var6.field3440;
                        if (var10 != null && var10.field4316.method895()) {
                            class211.method1547(var10.field4316, var3, var4, var5);
                            var10.field4316 = var10.field4316.method893(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 171)
    public static void method2033(int arg0) {
        field5045 = null;
        field5059 = null;
        field5064 = null;
        field5052 = null;
        field5067 = null;
        field5066 = null;
        field5065 = null;
        field5061 = null;
        field5046 = null;
        if (arg0 != 1) {
            field5046 = (class279) null;
        }
    }
}
