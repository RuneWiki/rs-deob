import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 extends class46 {

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public int field1609 = 0;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "[I")
    public static int[] field1608 = new int[100];

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    public static volatile int field1611 = -1;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "Lsc;")
    public static class128 field1619 = class129.method1017(false, ": ");

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public static int field1617 = 0;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "Lsc;")
    public static class128 field1621 = class129.method1017(false, "(Udns");

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "Z")
    public static boolean field1615 = false;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "Lcf;")
    public static class21 field1620;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "[Li;")
    public static class56[] field1610;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLmc;)V")
    public final void method545(byte arg0, class86 arg1) {
        while (true) {
            int var3 = arg1.method646(-15447);
            if (var3 == 0) {
                field1622++;
                if (arg0 != 57) {
                    this.method545((byte) 45, null);
                    return;
                }
                return;
            }
            this.method547(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public static void method546(int arg0) {
        field1619 = null;
        field1610 = null;
        field1621 = null;
        if (arg0 == -1) {
            field1620 = null;
            field1608 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZLmc;)V")
    private final void method547(int arg0, boolean arg1, class86 arg2) {
        if (arg1) {
            if (arg0 == 5) {
                this.field1609 = arg2.method632((byte) -80);
            }
            field1613++;
        }
    }
}
