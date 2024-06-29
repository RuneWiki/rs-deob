import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class640 extends class50 {

    @OriginalMember(owner = "client!cia", name = "C", descriptor = "I")
    private int field9169;

    @OriginalMember(owner = "client!cia", name = "D", descriptor = "I")
    private int field9168;

    @OriginalMember(owner = "client!cia", name = "N", descriptor = "I")
    private int field9176;

    @OriginalMember(owner = "client!cia", name = "v", descriptor = "I")
    private int field9165;

    @OriginalMember(owner = "client!cia", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field9187 = new String[] { method4640(method4639("\u0016O+Do\u001cH#\u001em]")), method4640(method4639("\u0016O+D\u0016]")), method4640(method4639("\u0016O+D\u0010]")), method4640(method4639("\u0016O+D\u0012]")), method4640(method4639("\u0016O+D\u001b]")), method4640(method4639("\u0016O+D\u001a]")), method4640(method4639("\u0016O+D\u0011]")) };

    @OriginalMember(owner = "client!cia", name = "M", descriptor = "Ljava/util/Calendar;")
    public static Calendar field9166 = Calendar.getInstance(TimeZone.getTimeZone(method4640(method4639("2k\u001e"))));

    @OriginalMember(owner = "client!cia", name = "G", descriptor = "Liha;")
    public static class29 field9178 = new class29(20);

    @OriginalMember(owner = "client!cia", name = "J", descriptor = "Lhl;")
    public static class556 field9180 = new class556(117, 2);

    @OriginalMember(owner = "client!cia", name = "x", descriptor = "Llt;")
    public static class706 field9181 = new class706(14, 8);

    @OriginalMember(owner = "client!cia", name = "E", descriptor = "Lhl;")
    public static class556 field9184 = new class556(30, 6);

    @OriginalMember(owner = "client!cia", name = "B", descriptor = "Ljava/util/Random;")
    public static Random field9185 = new Random();

    @OriginalMember(owner = "client!cia", name = "y", descriptor = "I")
    private int field9167;

    @OriginalMember(owner = "client!cia", name = "P", descriptor = "I")
    private int field9170;

    @OriginalMember(owner = "client!cia", name = "A", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!cia", name = "F", descriptor = "I")
    private int field9172;

    @OriginalMember(owner = "client!cia", name = "w", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!cia", name = "H", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!cia", name = "K", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!cia", name = "O", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!cia", name = "u", descriptor = "I")
    private int field9182;

    @OriginalMember(owner = "client!cia", name = "L", descriptor = "Lnp;")
    public static class518 field9183;

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "[B")
    private byte[] field9177;

    @OriginalMember(owner = "client!cia", name = "I", descriptor = "[Ltn;")
    public static class92[] field9186;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "(I)V")
    public static void method4637(int arg0) {
        try {
            if (arg0 != 4096) {
                field9180 = null;
            }
            field9181 = null;
            field9184 = null;
            field9186 = null;
            field9166 = null;
            field9183 = null;
            field9178 = null;
            field9185 = null;
            field9180 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9187[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIB)V")
    public final void method520(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 < 75) {
                method4637(84);
            }
            if (arg1 == 0) {
                this.field9170 = this.field9169 - (arg0 >= 0 ? arg0 : -arg0);
                this.field9170 = this.field9170 * this.field9170 >> 12;
                this.field9167 = 4096;
                this.field9182 = this.field9170;
            } else {
                this.field9167 = this.field9170 * this.field9168 >> 12;
                if (this.field9167 < 0) {
                    this.field9167 = 0;
                } else if (this.field9167 > 4096) {
                    this.field9167 = 4096;
                }
                this.field9170 = this.field9169 - (arg0 >= 0 ? arg0 : -arg0);
                this.field9170 = this.field9170 * this.field9170 >> 12;
                this.field9170 = this.field9170 * this.field9167 >> 12;
                this.field9182 += this.field9170 * this.field9165 >> 12;
                this.field9165 = this.field9176 * this.field9165 >> 12;
            }
            field9173++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9187[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
    public final void method513(byte arg0) {
        try {
            if (arg0 > 95) {
                this.field9182 = 0;
                field9179++;
                this.field9172 = 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9187[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IB)Z")
    public static final boolean method4638(int arg0, byte arg1) {
        try {
            if (arg1 > -68) {
                method4638(-72, (byte) 124);
            }
            field9174++;
            return arg0 == 9 || arg0 == 10;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9187[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class640(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field9169 = (int) (arg6 * 4096.0F);
            this.field9168 = (int) (arg7 * 4096.0F);
            this.field9165 = this.field9176 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field9187[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(IIB)V")
    public void method2724(int arg0, int arg1, byte arg2) {
        try {
            this.field9177[arg1] = arg2;
            field9171++;
            int var4 = -99 % ((arg0 + 21) / 40);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9187[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)V")
    public final void method511(int arg0) {
        try {
            field9175++;
            this.field9165 = this.field9176;
            if (arg0 != -1815138708) {
                field9166 = null;
            }
            this.field9182 >>= 0x4;
            if (this.field9182 < 0) {
                this.field9182 = 0;
            } else if (this.field9182 > 255) {
                this.field9182 = 255;
            }
            this.method2724(-125, this.field9172++, (byte) this.field9182);
            this.field9182 = 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9187[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4639(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4640(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
