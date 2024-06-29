import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class122 {

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field1720 = 0;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "B")
    public byte field1706;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "B")
    public byte field1709;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "B")
    public byte field1710;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "B")
    public byte field1711;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "B")
    public byte field1714;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "B")
    public byte field1718;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "B")
    public byte field1719;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "S")
    public short field1707;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Z")
    public boolean field1701;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Z")
    public boolean field1702;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
    public boolean field1703;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Z")
    public boolean field1708;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
    public boolean field1713;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Z")
    public boolean field1715;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Z")
    public boolean field1716;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Z")
    public boolean field1721;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Z")
    public boolean field1722;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[[I")
    public static int[][] field1712;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 3)
    public static final void method960(int arg0) {
        field1704++;
        int var1 = 0;
        if (class385.field5429) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class204.method1420(-98, var1);
        class118.method943(16974, var1);
        class448.method2792(var1, (byte) 113);
        class255.method1666((byte) 95, var1);
        class233.method1551(var1, 14373);
        class220.method1498(arg0 ^ 0xFFFFC6DB, var1);
        class328.method2084(var1, arg0 + 12667);
        class363.method2285(var1, arg0 ^ 0x18A);
        if (arg0 != -12581) {
            method962((byte) -108, -14);
        }
        class313.method1995(82, var1);
        if (class166.field2472 == 10) {
            class29.method340(28, (byte) -58);
        } else if (class166.field2472 == 30) {
            class29.method340(25, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 45)
    public static void method961(byte arg0) {
        if (arg0 != -15) {
            field1717 = 39;
        }
        field1712 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V", line = 71)
    public static final void method962(byte arg0, int arg1) {
        if (arg0 != 18) {
            field1717 = -60;
        }
        class156.field2361.method2534(0, arg1);
        field1705++;
    }
}
