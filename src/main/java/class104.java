import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "J")
    public static long field1585 = 0L;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1584 = 0;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1591 = 0;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1587 = new CRC32();

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Z")
    public static boolean field1594 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Z")
    public static boolean field1595 = true;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[Z")
    public static boolean[] field1596 = new boolean[8];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lsb;")
    public static class124 field1588;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method774(byte arg0) {
        field1588 = null;
        field1587 = null;
        field1596 = null;
        if (arg0 > -66) {
            method777(false, 22);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZII[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method775(boolean arg0, int arg1, int arg2, String[] arg3) {
        field1589++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg3[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            if (!arg0) {
                method778((byte) 123);
            }
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method776(int arg0) {
        field1590++;
        if (arg0 != -191) {
            method778((byte) -39);
        }
        if (class107.field1630) {
            return;
        }
        if (class256.field4075) {
            class1.field1 = (float) ((int) class1.field1 + 191 & 0xFFFFFF80);
        } else {
            class290.field4630 += (24.0F - class290.field4630) / 2.0F;
        }
        class107.field1630 = true;
        class10.field141 = true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)I")
    public static final int method777(boolean arg0, int arg1) {
        field1592++;
        if (!arg0) {
            field1584 = -125;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)Lth;")
    public static final class119 method778(byte arg0) {
        if (arg0 <= 109) {
            field1584 = -7;
        }
        field1586++;
        return class152.field2484;
    }
}
