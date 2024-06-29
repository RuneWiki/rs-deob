import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class354 {

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public int field5147;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public int field5149;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public int field5150;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public int field5156;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public int field5157;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public int field5158;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public int field5159;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public int field5160;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public int field5163;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public int field5164;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lia;III[Z)V")
    public static final void method2211(class424 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class477.field6942 == class146.field2262) {
            return;
        }
        int var5 = class393.field5594[arg1].method143(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class24 var7 = class393.field5594[var6];
                if (var7 != null) {
                    var7.method148(arg0, arg2, var5 - var7.method143(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
