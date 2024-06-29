import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class133 extends class22 {

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "S")
    public short field1517;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "B")
    public byte field1525;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "S")
    public short field1512;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "B")
    public byte field1528;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Z")
    public boolean field1522;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "S")
    public short field1510;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "S")
    public short field1518;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Z")
    public static boolean field1513 = false;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Z")
    public static boolean field1515 = true;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "[Lc;")
    public static class436[] field1527;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V", line = 3)
    public void method240(byte arg0) {
        if (arg0 != -59) {
            this.method240((byte) 77);
        }
        field1520++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V", line = 16)
    public static final void method864(int arg0, int arg1) {
        class416.field5691 = new int[arg0];
        class186.field2160 = new int[arg0];
        class17.field188 = new int[arg0];
        class440.field6074 = new int[arg0];
        field1524++;
        if (arg1 > -108) {
            field1527 = null;
        }
        class336.field4584 = new int[arg0];
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)I", line = 36)
    public static final int method865(int arg0, int arg1, byte arg2) {
        if (arg2 > -3) {
            field1515 = false;
        }
        field1511++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Los;", line = 59)
    public static final class337 method866(int arg0, int arg1, int arg2) {
        class316 var3 = class347.field4722[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class337 var4 = var3.field4254;
            var3.field4254 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V", line = 78)
    public static void method867(byte arg0) {
        if (arg0 > 25) {
            field1527 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 88)
    public static final void method868(boolean arg0, String arg1) {
        class175.field2033 = arg1;
        field1526++;
        if (class401.field5525.field6077 == null) {
            return;
        }
        try {
            String var2 = class401.field5525.field6077.getParameter("cookieprefix");
            String var3 = class401.field5525.field6077.getParameter("cookiehost");
            if (!arg0) {
                method864(121, -19);
            }
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class401.method2499((byte) -46, class164.method1038(8635) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class443.method2741("document.cookie=\"" + var5 + "\"", -30916, class401.field5525.field6077);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 128)
    public class133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1517 = (short) arg7;
        this.field1521 = (short) arg2;
        this.field1525 = arg9;
        this.field1516 = (short) arg1;
        this.field1512 = (short) arg4;
        this.field1528 = (byte) arg0;
        this.field1522 = arg8;
        this.field1510 = (short) arg5;
        this.field1518 = (short) arg6;
        this.field1514 = (short) arg3;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)I")
    public abstract int method246(byte arg0);
}
