import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class297 extends class622 {

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "Lov;")
    public static class171 field4066;

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field4067;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(II[BIILjava/lang/String;)I")
    public static final int method1806(int arg0, int arg1, byte[] arg2, int arg3, int arg4, String arg5) {
        field4064++;
        int var6 = arg1 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg3 + var7] = -97;
            } else {
                arg2[arg3 + var7] = 63;
            }
        }
        if (arg0 == 8222) {
            return var6;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)V")
    public static void method1807(byte arg0) {
        field4067 = null;
        int var1 = -112 % ((arg0 - 41) / 43);
        field4066 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lou;B)I")
    public static final int method1808(class562 arg0, byte arg1) {
        if (arg1 > -74) {
            method1806(-34, 66, null, -27, -113, null);
        }
        field4068++;
        if (class543.field7375 == arg0) {
            return 9216;
        } else if (class669.field9395 == arg0) {
            return 34065;
        } else if (class563.field7604 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
