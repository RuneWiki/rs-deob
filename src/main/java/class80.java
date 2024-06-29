import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class80 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lle;")
    public static class260 field1248 = new class260(5000);

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1253 = 255;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 <= 107) {
            method624((byte) -33);
        }
        if (class310.field4897 <= (arg2 - arg0) && class180.field2862 >= arg0 + arg2 && (arg3 - arg0) >= class104.field1719 && class333.field5188 >= (arg3 + arg0)) {
            class318.method2251(false, arg0, arg3, arg5, arg6, arg2, arg1);
        } else {
            class310.method2189(arg2, arg1, arg5, arg3, 1438, arg0, arg6);
        }
        field1255++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 24)
    public static void method624(byte arg0) {
        if (arg0 != -59) {
            field1248 = (class260) null;
        }
        field1248 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI[BIILjava/lang/String;)I", line = 35)
    public static final int method625(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4, String arg5) {
        int var6 = arg3 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg1 + var7] = -97;
            } else {
                arg2[arg1 + var7] = 63;
            }
        }
        field1250++;
        if (!arg0) {
            field1248 = (class260) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lpk;B)V", line = 172)
    public static final void method626(class120 arg0, byte arg1) {
        int var2 = -74 / ((arg1 - 51) / 59);
        field1247++;
        class4.field114 = arg0;
        class4.field115 = class4.field114.method962((byte) -113, 4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V", line = 185)
    public static final void method627(int arg0, int arg1) {
        field1254++;
        class30.field476 = arg0;
        if (arg1 != 1864) {
            method623(-63, -2, -43, 111, 25, 72, -56);
        }
        class79.method617((byte) -39, 3);
        class79.method617((byte) -27, 4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V", line = 201)
    public static final void method628(byte arg0, int arg1, int arg2) {
        field1249++;
        if (arg0 != -94) {
            method624((byte) 103);
        }
        class170 var3 = class221.method1613(5, arg1, arg0 ^ 0x2084);
        var3.method1269(false);
        var3.field2730 = arg2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILpk;BI)[Lwd;", line = 216)
    public static final class88[] method629(int arg0, class120 arg1, byte arg2, int arg3) {
        if (arg2 != -115) {
            method629(-13, (class120) null, (byte) -108, -91);
        }
        field1251++;
        return class107.method854(arg1, arg0, arg3, (byte) -124) ? class91.method723(arg2 + 196) : null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 232)
    public static final void method630(byte arg0) {
        field1252++;
        if (arg0 != -62) {
            field1253 = -116;
        }
        if (class78.field1222) {
            return;
        }
        class78.field1222 = true;
        class6.field134 = true;
        if (class126.field2018) {
            class86.field1388 = (float) ((int) class86.field1388 + 47 & 0xFFFFFFF0);
        } else {
            class104.field1712 += (12.0F - class104.field1712) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lui;", line = 265)
    public static final class281 method631(Component arg0, int arg1, int arg2, byte arg3) {
        field1246++;
        try {
            if (arg3 > -33) {
                method626((class120) null, (byte) -80);
            }
            Class var4 = Class.forName("tb");
            class281 var5 = (class281) var4.getDeclaredConstructor().newInstance();
            var5.method1285((byte) -86, arg0, arg1, arg2);
            return var5;
        } catch (Throwable var8) {
            class174 var7 = new class174();
            var7.method1285((byte) -77, arg0, arg1, arg2);
            return var7;
        }
    }
}
