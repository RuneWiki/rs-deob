import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class469 extends class206 {

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public int field6808;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public int field6817;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6818 = new String[] { method3566(method3565("\u0019,DZ@")), method3566(method3565("\u0019,D$\u0001\u00063\u001e&@")), method3566(method3565("\u0019,DY@")), method3566(method3565("\u0019,D^@")), method3566(method3565("\u0019,D\\@")), method3566(method3565("\u0019,D]@")), method3566(method3565("\u0019,D[@")), method3566(method3565("\u0019,D_@")) };

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public static int field6815 = 4;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)Z")
    public final boolean method3558(boolean arg0, int arg1) {
        try {
            if (!arg0) {
                this.method3558(true, 78);
            }
            field6814++;
            return (this.field6808 >> arg1 + 1 & 0x1) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6818[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "(I)Z")
    public final boolean method3559(int arg0) {
        try {
            if (arg0 != -20823) {
                this.field6808 = 31;
            }
            field6811++;
            return (this.field6808 & 0x72784B) >> 22 != 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6818[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)Z")
    public final boolean method3560(int arg0) {
        try {
            field6816++;
            if (arg0 != -1) {
                this.field6817 = -84;
            }
            return (this.field6808 >> 21 & 0x1) != 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6818[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)Z")
    public final boolean method3561(int arg0) {
        try {
            field6812++;
            if (arg0 == -1) {
                return (this.field6808 & 0x1) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6818[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)I")
    public final int method3562(int arg0) {
        try {
            field6809++;
            if (arg0 != -766732782) {
                this.method3560(70);
            }
            return this.field6808 >> 18 & 0x7;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6818[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IC)Z")
    public static final boolean method3563(int arg0, char arg1) {
        try {
            if (arg0 != -14402) {
                field6815 = 105;
            }
            field6810++;
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6818[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(II)V")
    public class469(int arg0, int arg1) {
        try {
            this.field6808 = arg0;
            this.field6817 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6818[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)I")
    public final int method3564(int arg0) {
        try {
            if (arg0 != 122) {
                this.field6808 = -36;
            }
            field6813++;
            return class454.method3479(2016053707, this.field6808);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6818[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3565(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3566(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
