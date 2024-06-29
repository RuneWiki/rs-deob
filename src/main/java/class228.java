import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class228 extends class25 {

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "[I")
    public static int[] field3977 = new int[50];

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Ldf;")
    public static class51 field3981 = class46.method233("<img=1>", 100);

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field3983 = -1;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "B")
    public byte field3976;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "Lja;")
    public class55 field3979;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public static void method1566(int arg0) {
        field3981 = null;
        if (arg0 == -1) {
            field3977 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)Z")
    public static final boolean method1567(byte arg0) {
        field3982++;
        class29 var1 = class208.field3475;
        synchronized (class208.field3475) {
            if (class195.field3261 == class164.field2688) {
                return false;
            } else if (arg0 > -111) {
                return true;
            } else {
                class42.field686 = class92.field1517[class195.field3261];
                class128.field2148 = class203.field3400[class195.field3261];
                class195.field3261 = class195.field3261 + 1 & 0x7F;
                return true;
            }
        }
    }
}
