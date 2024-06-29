import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class510 {

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public int field7488;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public int field7482;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    private int field7485;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public int field7490;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "B")
    public byte field7491;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7496 = new String[] { method3898(method3897("\u0016j-zq\u0013twx0")), method3898(method3897("\u0016j-\u00040")), method3898(method3897("\u00063-he")), method3898(method3897("\u0013ho*")), method3898(method3897("\u0016j-\u00050")), method3898(method3897("\u0016j-\u00020")), method3898(method3897("\u0016j-\u00070")) };

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "Lmv;")
    public static class125 field7484 = new class125(38, 4);

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public int field7477;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
    public int field7478;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public int field7479;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
    public int field7480;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public int field7481;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
    public int field7489;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public int field7492;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public int field7493;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    public int field7494;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "Lkw;")
    public class510 field7487;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static void method3893(int arg0) {
        try {
            if (arg0 == 4392) {
                field7484 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7496[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILhi;)V")
    public static final void method3894(int arg0, class606 arg1) {
        try {
            field7486++;
            if (arg0 != -24234) {
                method3893(-37);
            }
            class142.field1840 = arg1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7496[4] + arg0 + ',' + (arg1 == null ? field7496[3] : field7496[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIII)Lkw;")
    public final class510 method3895(int arg0, int arg1, int arg2, int arg3) {
        try {
            field7483++;
            if (arg0 != 18147) {
                this.field7485 = -80;
            }
            return new class510(this.field7485, arg3, arg2, arg1, this.field7491);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7496[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)Lpf;")
    public final class424 method3896(byte arg0) {
        try {
            if (arg0 < 76) {
                return null;
            } else {
                field7476++;
                return class734.method5336(0, this.field7485);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7496[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IIIIB)V")
    public class510(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            this.field7488 = arg1;
            this.field7482 = arg2;
            this.field7485 = arg0;
            this.field7490 = arg3;
            this.field7491 = arg4;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7496[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3897(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3898(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
