import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class62 extends class78 {

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    private final int field1187;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    private final int field1188;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    private final int field1175;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    private final int field1179;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    private final int field1172;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    private final int field1174;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    private final int field1183;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    private final int field1185;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Lqd;")
    public static class40 field1170 = class147.method1106(" zuerst von Ihrer Freunde)2Liste(Q", (byte) -77);

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "Z")
    public static volatile boolean field1173 = true;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Z")
    public static boolean field1176 = false;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "Lqd;")
    private static class40 field1189 = class147.method1106("Members object", (byte) -48);

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Lqd;")
    public static class40 field1177 = field1189;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "[[[B")
    public static byte[][][] field1169;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)I", line = 10)
    public static final int method512(int arg0) {
        field1180++;
        if ((double) class186.field3008 == 3.0D) {
            return 37;
        } else if ((double) class186.field3008 == 4.0D) {
            return 50;
        } else {
            if (arg0 != -4145) {
                method512(-18);
            }
            return (double) class186.field3008 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)V", line = 34)
    public final void method5(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field1178++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V", line = 59)
    public static void method513(int arg0) {
        field1170 = null;
        if (arg0 != -12352) {
            field1181 = -26;
        }
        field1169 = (byte[][][]) null;
        field1177 = null;
        field1189 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI)V", line = 82)
    public final void method3(int arg0, byte arg1, int arg2) {
        field1184++;
        if (arg1 >= -71) {
            field1173 = true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lti;", line = 96)
    public static final class214 method514(int arg0, int arg1) {
        field1168++;
        class214 var2 = (class214) class128.field2199.method1345((long) arg0, 28150);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class7.field97.method1651(arg1, arg0, -1);
        class214 var4 = new class214();
        if (var3 != null) {
            var4.method1514(-1, new class26(var3));
        }
        class128.field2199.method1350(var4, (long) arg0, -111);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V", line = 123)
    public final void method2(int arg0, int arg1, int arg2) {
        int var4 = this.field1188 * arg1 >> 12;
        field1186++;
        int var5 = this.field1185 * arg1 >> 12;
        int var6 = this.field1179 * arg2 >> 12;
        if (arg0 <= 33) {
            return;
        }
        int var7 = this.field1172 * arg2 >> 12;
        int var8 = this.field1187 * arg2 >> 12;
        int var9 = this.field1174 * arg1 >> 12;
        int var10 = this.field1183 * arg2 >> 12;
        int var11 = this.field1175 * arg1 >> 12;
        class227.method1594(this.field1325, var10, var5, var9, -64, var7, var4, var11, var8, var6);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 168)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1187 = arg5;
        this.field1188 = arg0;
        this.field1175 = arg6;
        this.field1179 = arg1;
        this.field1172 = arg3;
        this.field1174 = arg4;
        this.field1183 = arg7;
        this.field1185 = arg2;
    }
}
