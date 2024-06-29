import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class99 {

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "B")
    public byte field1163 = 0;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "S")
    public short field1164;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "B")
    public byte field1166;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "B")
    public byte field1178;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "S")
    public short field1165;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "Z")
    public static boolean field1160 = false;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "F")
    public static float field1159 = 0.0F;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lkca;")
    public static class73 field1157 = new class73(7, 3);

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "B")
    public byte field1179;

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "B")
    public byte field1180;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "B")
    public byte field1182;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "B")
    public byte field1184;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "Lfv;")
    public class104 field1167;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "Lhh;")
    public class111 field1174;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "Ltr;")
    public class247 field1177;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "Lbe;")
    public class33 field1171;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "Lmf;")
    public class356 field1161;

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "Lmf;")
    public class356 field1175;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "Lbw;")
    public class599 field1168;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "Lbw;")
    public class599 field1176;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "Luaa;")
    public class99 field1162;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "S")
    public short field1169;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "Z")
    public boolean field1170;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "Z")
    public boolean field1172;

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "Z")
    public boolean field1181;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method615(String arg0, byte arg1) {
        field1173++;
        if (!class410.field6246.field7804) {
            return -1;
        } else if (class463.field6891.containsKey(arg0)) {
            return 100;
        } else {
            int var2 = -35 / ((arg1 - 8) / 54);
            String var3 = class513.method3046(arg0, -1);
            if (var3 == null) {
                return -1;
            }
            String var4 = class421.field6307 + var3;
            if (!class353.field5026.method1288(var4, "", -1)) {
                return -1;
            } else if (class353.field5026.method1289(var4, 112)) {
                byte[] var5 = class353.field5026.method1281((byte) -37, "", var4);
                File var6 = class370.method2386(var3, 61);
                if (var5 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class430.method2679(var6, (byte) 117);
                if (var8 != null && var5.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var5[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class410.field6246.method3159(100, var5, var6);
                    }
                } catch (Throwable var10) {
                    return -1;
                }
                class42.method226(var6, arg0, (byte) 101);
                return 100;
            } else {
                return class353.field5026.method1310(var4, 1);
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
    public static void method616(boolean arg0) {
        if (arg0) {
            field1157 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(III)V")
    public class99(int arg0, int arg1, int arg2) {
        this.field1164 = (short) arg2;
        this.field1178 = this.field1166 = (byte) arg0;
        this.field1165 = (short) arg1;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        field1158++;
        if (arg0 != -1) {
            this.field1171 = null;
        }
        while (this.field1167 != null) {
            class104 var2 = this.field1167.field1251;
            this.field1167.method647(124);
            this.field1167 = var2;
        }
        this.field1163 = 0;
    }
}
