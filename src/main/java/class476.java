import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class476 extends class111 {

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
    private int field6492;

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "Lep;")
    private class371 field6493;

    @OriginalMember(owner = "client!dga", name = "s", descriptor = "I")
    private int field6500;

    @OriginalMember(owner = "client!dga", name = "q", descriptor = "I")
    private int field6498;

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
    private int field6495;

    @OriginalMember(owner = "client!dga", name = "r", descriptor = "I")
    private int field6499;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    private int field6494;

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "Lrh;")
    private class633 field6496;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)Lrh;", line = 16)
    public final class633 method748(int arg0) {
        if (arg0 != 8448) {
            this.method748(24);
        }
        field6497++;
        if (this.field6496 == null) {
            class193.field2796[2] = this.field6500;
            class193.field2796[0] = this.field6495;
            class268 var2 = this.field6493.field7694;
            class193.field2796[3] = this.field6492;
            class193.field2796[1] = this.field6499;
            class193.field2796[4] = this.field6498;
            class193.field2796[5] = this.field6494;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method86((byte) 117, class193.field2796[var5])) {
                    return null;
                }
                class468 var7 = var2.method91(class193.field2796[var5], arg0 - 31253);
                int var8 = var7.field6391 ? 64 : 128;
                if (var7.field6397 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class66.field909[var6] = var2.method87(false, var4, 1.0F, var4, true, class193.field2796[var6]);
            }
            this.field6496 = new class633(this.field6493, 6407, var4, var3, class66.field909);
        }
        return this.field6496;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lep;IIIIII)V", line = 76)
    public class476(class371 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6492 = arg4;
        this.field6493 = arg0;
        this.field6500 = arg3;
        this.field6498 = arg5;
        this.field6495 = arg1;
        this.field6499 = arg2;
        this.field6494 = arg6;
    }
}
