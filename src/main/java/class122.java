import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class122 {

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public int field1578 = 0;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    public int field1579 = 0;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Lqc;")
    private class325 field1573 = new class325(64);

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "Lrl;")
    private class633 field1582 = null;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "Ldda;")
    private class597 field1570;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "Ldda;")
    private class597 field1580;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field1574 = 1;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Lqp;")
    public static class586 field1571 = new class586(38, 9);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "[[I")
    public static int[][] field1576;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([ILrb;JB)Ljava/lang/String;", line = 4)
    public final String method739(int[] arg0, class352 arg1, long arg2, byte arg3) {
        field1572++;
        if (this.field1582 != null) {
            String var6 = this.field1582.method2217(arg1, (byte) -104, arg0, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg3 != -53) {
            method742(-124);
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 26)
    public static void method740(int arg0) {
        field1571 = null;
        field1576 = null;
        if (arg0 != 28651) {
            field1576 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Ltt;", line = 38)
    public final class313 method741(int arg0, int arg1) {
        if (arg0 != -3877) {
            return null;
        }
        field1569++;
        class313 var3 = (class313) this.field1573.method2025((long) arg1, 2);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field1570.method3486((byte) -96, arg1 & 0x7FFF, 1);
        } else {
            var4 = this.field1580.method3486((byte) -61, arg1, 1);
        }
        class313 var5 = new class313();
        var5.field4706 = this;
        if (var4 != null) {
            var5.method1925(57, new class428(var4));
        }
        if (arg1 >= 32768) {
            var5.method1927(0);
        }
        this.field1573.method2029(false, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 76)
    public static final void method742(int arg0) {
        class336.field4936 = true;
        field1575++;
        if (arg0 != 38) {
            field1571 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(ILdda;Ldda;Lrl;)V", line = 115)
    public class122(int arg0, class597 arg1, class597 arg2, class633 arg3) {
        this.field1582 = arg3;
        this.field1570 = arg2;
        this.field1580 = arg1;
        if (this.field1580 != null) {
            this.field1579 = this.field1580.method3462(1, -58);
        }
        if (this.field1570 != null) {
            this.field1578 = this.field1570.method3462(1, 109);
        }
    }
}
