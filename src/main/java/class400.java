import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class400 extends class525 {

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "B")
    public byte field5513 = 5;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Lvl;")
    public static class15 field5512 = new class15(22, 3);

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public int field5509;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public int field5511;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public int field5514;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    public int field5516;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public int field5517;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
    public int field5518;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "Z")
    public boolean field5519;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V")
    public static final void method2400(byte arg0) {
        class567.field8014 = 0;
        class615.field8571 = 0;
        field5515++;
        if (arg0 >= -99) {
            method2401(true);
        }
        for (int var1 = 0; var1 < class317.field4324; var1++) {
            int var2 = class262.field3681 * var1;
            for (int var3 = 0; var3 < class262.field3681; var3++) {
                int var4 = var2 + var3;
                class687.field9555[var4].method2768(class658.field9108 * var3, class471.field6394 * var1, class658.field9108, class471.field6394, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
    public static void method2401(boolean arg0) {
        if (arg0) {
            field5512 = null;
        }
    }
}
