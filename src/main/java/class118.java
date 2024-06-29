import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class118 {

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public int field1592 = 0;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public int field1586 = 0;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Ljk;")
    private class449 field1591 = new class449(64);

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Ltp;")
    private class373 field1594 = null;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lqn;")
    private class47 field1585;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lqn;")
    private class47 field1590;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
    public static int[] field1583 = new int[13];

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field1587 = 10;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([IIJLud;)Ljava/lang/String;")
    public final String method846(int[] arg0, int arg1, long arg2, class27 arg3) {
        field1588++;
        if (this.field1594 != null) {
            String var6 = this.field1594.method778(arg3, -75, arg2, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg1 <= 124) {
            this.method846(null, -92, -4L, null);
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Luj;")
    public final class261 method847(int arg0, int arg1) {
        field1584++;
        class261 var3 = (class261) this.field1591.method2647(-124, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field1585.method481(1, arg0 & 0x7FFF, -120);
        } else {
            var4 = this.field1590.method481(1, arg0, -108);
        }
        class261 var5 = new class261();
        var5.field3290 = this;
        if (var4 != null) {
            var5.method1559(new class463(var4), true);
        }
        if (arg1 <= arg0) {
            var5.method1563((byte) -63);
        }
        this.field1591.method2635((long) arg0, arg1 ^ 0xFFFF1821, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public static void method848(boolean arg0) {
        field1583 = null;
        if (!arg0) {
            field1593 = -92;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static final void method849(int arg0) {
        field1589++;
        if (arg0 != -1) {
            method848(false);
        }
        if (class316.field4042 != -1) {
            class49.method504((byte) -22, -1, -1, class316.field4042, false);
            class316.field4042 = -1;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILqn;Lqn;Ltp;)V")
    public class118(int arg0, class47 arg1, class47 arg2, class373 arg3) {
        this.field1585 = arg2;
        this.field1590 = arg1;
        this.field1594 = arg3;
        if (this.field1590 != null) {
            this.field1592 = this.field1590.method469(30322, 1);
        }
        if (this.field1585 != null) {
            this.field1586 = this.field1585.method469(30322, 1);
        }
    }
}
