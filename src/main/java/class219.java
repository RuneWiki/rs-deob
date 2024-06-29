import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class219 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public int field3153 = -1;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field3149 = -1;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lae;")
    public class164 field3148;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    public int[] field3151;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field3152;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Canvas;IILga;)Lya;")
    public static final class38 method1499(Canvas arg0, int arg1, int arg2, class277 arg3) {
        field3154++;
        if (arg1 != 23932) {
            method1499(null, -44, 2, null);
        }
        return new class246(arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1500(int arg0, int arg1, byte arg2) {
        field3150++;
        int var3 = -9 % ((arg2 - 4) / 41);
        return class457.method2754(arg0, -24, arg1) & class480.method2896(arg0, arg1, -125);
    }
}
