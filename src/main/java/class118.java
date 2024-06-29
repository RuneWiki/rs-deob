import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class118 {

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field1535 = 0;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "B")
    public byte field1528;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "B")
    public byte field1530;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "B")
    public byte field1534;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "B")
    public byte field1537;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "B")
    public byte field1540;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "B")
    public byte field1541;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "B")
    public byte field1542;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Lbo;")
    public static class492 field1533;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "S")
    public short field1532;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Z")
    public boolean field1523;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
    public boolean field1524;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Z")
    public boolean field1529;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "Z")
    public boolean field1531;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "Z")
    public boolean field1536;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "Z")
    public boolean field1539;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Z")
    public boolean field1543;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "Z")
    public boolean field1544;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "Z")
    public boolean field1545;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)Lgl;")
    public static final class408 method675(int arg0, int arg1) {
        field1527++;
        class30[] var2 = class325.field4752;
        synchronized (class325.field4752) {
            if (arg0 > -111) {
                method676((byte) -61);
            }
            class408 var3;
            if (class325.field4752.length <= arg1 || class325.field4752[arg1].method240(5)) {
                var3 = new class408();
                var3.field5983 = new class299[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field5983[var4] = new class299();
                }
            } else {
                var3 = (class408) class325.field4752[arg1].method245((byte) 38);
                var3.method1435(true);
                int var10002 = class242.field3481[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method676(byte arg0) {
        if (arg0 < -109) {
            field1533 = null;
        }
    }
}
