import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class296 {

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public static int[] field4516 = new int[32];

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field4518 = -1;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4515 = new String[500];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4509 = new String[200];

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
    public static int[] field4511;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BIILjava/lang/String;II)I", line = 15)
    public static final int method1978(byte[] arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field4510++;
        int var6 = arg5 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg1 + var7] = -97;
            } else {
                arg0[arg1 + var7] = 63;
            }
        }
        if (arg2 != 8249) {
            field4509 = (String[]) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 158)
    public static void method1979(int arg0) {
        int var1 = -21 % ((arg0 + 51) / 60);
        field4511 = null;
        field4515 = null;
        field4516 = null;
        field4509 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)I", line = 170)
    public static final int method1980(int arg0, byte arg1, int arg2) {
        int var3 = arg0 >>> 31;
        field4512++;
        if (arg1 > -95) {
            method1984(-8, (byte) -126);
        }
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 184)
    public static final void method1981(byte arg0) {
        field4513++;
        if (arg0 != 26) {
            method1981((byte) -20);
        }
        if (class210.field3387 == null) {
            return;
        }
        class336 var1 = new class336();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class210.field3387[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V", line = 218)
    public static final void method1982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 13) {
            return;
        }
        field4517++;
        if ((arg3 - arg6) >= class147.field2416 && class259.field4024 >= arg3 + arg6 && (arg5 - arg6) >= class59.field1162 && class186.field3028 >= arg5 + arg6) {
            class224.method1483(arg4 ^ 0x78, arg3, arg5, arg0, arg1, arg6, arg2);
        } else {
            class136.method889(arg3, arg0, arg2, arg5, arg1, arg6, -27801);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;III)Lr;", line = 238)
    public static final class48 method1983(Component arg0, int arg1, int arg2, int arg3) {
        field4514++;
        try {
            Class var4 = Class.forName("jm");
            class48 var5 = (class48) var4.getDeclaredConstructor().newInstance();
            if (arg1 != 8217) {
                field4511 = (int[]) null;
            }
            var5.method269(arg2, arg3, arg0, (byte) -116);
            return var5;
        } catch (Throwable var8) {
            class33 var7 = new class33();
            var7.method269(arg2, arg3, arg0, (byte) -116);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I", line = 272)
    public static final int method1984(int arg0, byte arg1) {
        if (arg1 > -53) {
            method1983((Component) null, 77, 84, 122);
        }
        field4519++;
        return arg0 & 0xFF;
    }
}
