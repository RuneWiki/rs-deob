import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class378 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
    public static final void method2256(int arg0, int arg1, int arg2, int arg3) {
        field5444++;
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg3 & 0x3F);
        int var5 = -28 % ((arg1 + 60) / 40);
        System.out.println(var4);
        class142.method989(false, var4, -10, true);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
    public static final void method2257(int arg0, int arg1) {
        field5442++;
        if (arg1 == -1 || !class210.field3004[arg1]) {
            return;
        }
        class41.field614.method2495(arg1, 78);
        class505.field7387[arg1] = null;
        class302.field4121[arg1] = null;
        if (arg0 != -17958) {
            field5445 = -10;
        }
        class210.field3004[arg1] = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILza;)V")
    public static final void method2258(int arg0, class295 arg1) {
        field5443++;
        if (arg0 != 8135) {
            method2256(-70, 16, 68, 87);
        }
        if (class41.field615 != class81.field1158.field6279 && class103.field1632 != null && class55.method355(class81.field1158.field6279, -3, arg1)) {
            class41.field615 = class81.field1158.field6279;
        }
    }
}
