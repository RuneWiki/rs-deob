import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class91 {

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1395 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Ljava/lang/Object;")
    public static Object field1394;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[B")
    public byte[] field1385;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[B")
    public byte[] field1386;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[Lko;")
    public static class292[] field1384;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lkp;", line = 7)
    public static final class384 method505(int arg0) {
        if (arg0 != 3689) {
            field1395 = -89;
        }
        field1391++;
        return class196.method1276(1, 0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 22)
    public static void method506(byte arg0) {
        field1394 = null;
        if (arg0 <= -21) {
            field1384 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BC)B", line = 35)
    public static final byte method507(byte arg0, char arg1) {
        if (arg0 < 71) {
            return -69;
        }
        field1383++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lha;III[Z)V", line = 168)
    public static final void method508(class425 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class383.field5753 == class178.field2480) {
            return;
        }
        int var5 = class262.field3404[arg1].method3824(arg2, 121, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class682 var7 = class262.field3404[var6];
                if (var7 != null) {
                    var7.method2181(arg0, arg2, var5 - var7.method3824(arg2, 125, arg3), arg3, 0, false);
                }
            }
        }
    }
}
