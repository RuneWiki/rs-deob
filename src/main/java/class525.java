import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class525 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
    public static boolean field7616 = false;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "B")
    public byte field7619;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public int field7617;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/lang/String;")
    public String field7618;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Ljava/lang/String;")
    public String field7621;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Ljava/lang/String;")
    public String field7622;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Ljava/lang/String;")
    public String field7623;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)I", line = 8)
    public static final int method3092(int arg0) {
        if (arg0 != -13) {
            method3092(125);
        }
        field7625++;
        if (class39.field425 == null) {
            if (!class600.field8764 && class111.field1359 > 0) {
                if (class565.field8057 && class280.field3915.method284(41, 81) && class111.field1359 > 2) {
                    return ((class631) class436.field6487.field1413.field4677.field4677).field9102;
                }
                return ((class631) class436.field6487.field1413.field4677).field9102;
            }
            int var1 = class32.field369.method778(6);
            int var2 = class32.field369.method777((byte) 112);
            int var3 = class291.field4026;
            int var4 = class614.field8924;
            int var5 = class421.field6308;
            if (var3 < var1 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class111.field1359; var7++) {
                    if (class438.field6510) {
                        int var11 = (class111.field1359 - var7 - 1) * 16 + var4 + 33;
                        if (var11 - 13 < var2 && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class111.field1359 - var7 - 1) * 16 + var4 + 31;
                        if (var12 - 13 < var2 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class89 var9 = new class89(class436.field6487);
                    for (class631 var10 = (class631) var9.method572(12491); var10 != null; var10 = (class631) var9.method575(18032)) {
                        if ((var8++) == var6) {
                            return var10.field9102;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I", line = 102)
    public static final int method3093(int arg0, byte arg1) {
        field7620++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            int var2 = -36 % ((19 - arg1) / 63);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([IILad;[III)Lvd;", line = 138)
    public static final class34 method3094(int[] arg0, int arg1, class362 arg2, int[] arg3, int arg4, int arg5) {
        field7624++;
        byte[] var6 = new byte[arg1 * arg5];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg5 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg4 > -65) {
            method3093(13, (byte) 78);
        }
        return new class34(arg2, arg5, arg1, var6);
    }
}
