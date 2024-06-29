import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class24 {

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field263 = -1;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 15)
    public static final void method129(int arg0) {
        field259++;
        int var1 = 0;
        if (class260.field3509.method734((byte) 86, class364.field4697)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class260.field3509.field1286) {
            var1 |= 0x40;
        }
        class408.method2310(var1, 118);
        class348.field4436.method1897(var1, arg0 - 28207);
        class232.field3109.method1294(29518, var1);
        class646.field8998.method514(var1, 19402);
        class91.field1202.method984(false, var1);
        if (arg0 != 28260) {
            field263 = -25;
        }
        class418.method2411(var1, (byte) -99);
        class14.method82(var1, 11474);
        class150.method1102(var1, arg0 ^ 0x6E65);
        class434.method2482(var1, (byte) -66);
        class469.method2607((byte) 86);
    }
}
