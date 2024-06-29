import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class82 extends class269 {

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "Lks;")
    public static class460 field1091 = new class460("", 10);

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "Z")
    public static boolean field1092 = false;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Liw;I)V")
    public static final void method605(class331 arg0, int arg1) {
        arg0.method2137(1112311075);
        field1085++;
        int var2 = class223.field3199;
        class559 var3 = class251.field3549 = class581.field8250[var2] = new class559();
        var3.field6361 = var2;
        int var4 = arg0.method2138(30, (byte) -105);
        if (arg1 != 2048) {
            field1091 = null;
        }
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFED6A) >> 14;
        var3.field6448[0] = var6 - class103.field1295;
        int var7 = var4 & 0x3FFF;
        var3.field7718 = (var3.field6448[0] << 9) + (var3.method2692((byte) -126) << 8);
        var3.field6445[0] = var7 - class175.field2496;
        var3.field7719 = (var3.field6445[0] << 9) + (var3.method2692((byte) 59) << 8);
        class410.field5771 = var3.field7710 = var3.field7711 = var5;
        if (class627.method3593(var3.field6448[0], (byte) -90, var3.field6445[0])) {
            var3.field7711++;
        }
        if (class698.field9864[var2] != null) {
            var3.method3248(true, class698.field9864[var2]);
        }
        class147.field1873 = 0;
        class568.field8045[class147.field1873++] = var2;
        class495.field7019[var2] = 0;
        class395.field5610 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2138(18, (byte) -105);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class711 var13 = class359.field5218[var8] = new class711();
                var13.field10008 = 0;
                var13.field10009 = -1;
                var13.field10003 = false;
                var13.field10002 = (var10 << 28) + var12 + (var11 << 14);
                var13.field10006 = false;
                class176.field2679[class395.field5610++] = var8;
                class495.field7019[var8] = 0;
            }
        }
        arg0.method2146(false);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)Lve;")
    public class527 method606(int arg0) {
        if (arg0 == 0) {
            field1090++;
            return class16.field269;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lfda;Laba;IIIIIIIIIIIII)V")
    public class82(class336 arg0, class185 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1089 = arg14;
        this.field1084 = arg9;
        this.field1086 = arg12;
        this.field1088 = arg10;
        this.field1093 = arg11;
        this.field1087 = arg13;
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1091 = null;
        if (arg0 <= 117) {
            field1091 = null;
        }
    }
}
