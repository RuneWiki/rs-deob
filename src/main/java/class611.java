import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class611 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Z")
    public boolean field8916;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8925 = new String[] { method4518(method4517("\u007fERUN")), method4518(method4517("\u007fERVN")), method4518(method4517("\u007fERWN")), method4518(method4517("\u007fER(\u000fxH\b*N")), method4518(method4517("\u007fERPN")) };

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lel;")
    public static class573 field8919 = new class573(72, 1);

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field8922 = 0;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lje;")
    public class421 field8920;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lje;")
    public class421 field8923;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Z")
    public boolean field8917;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method4513(byte arg0, int arg1) {
        try {
            if (class520.field7621 == null) {
                class520.field7621 = new byte[4][class648.field9378][class659.field9506];
            }
            if (arg1 != -5) {
                method4513((byte) -100, -70);
            }
            field8921++;
            for (int var2 = 0; var2 < 4; var2++) {
                for (int var3 = 0; var3 < class648.field9378; var3++) {
                    for (int var4 = 0; var4 < class659.field9506; var4++) {
                        class520.field7621[var2][var3][var4] = arg0;
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8925[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 42)
    public final void method4514(int arg0) {
        try {
            if (this.field8923 != null) {
                this.field8923.method20(true);
            }
            if (arg0 == 0) {
                field8918++;
                this.field8917 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8925[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z", line = 65)
    public final boolean method4515(byte arg0) {
        try {
            field8924++;
            if (arg0 == 77) {
                return this.field8917 && !this.field8916;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8925[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 76)
    public static void method4516(int arg0) {
        try {
            if (arg0 < 42) {
                method4516(123);
            }
            field8919 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8925[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Z)V", line = 89)
    public class611(boolean arg0) {
        try {
            this.field8916 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8925[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4517(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!id", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4518(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 124;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
