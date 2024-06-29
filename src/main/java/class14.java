import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class14 extends class513 {

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "Leaa;")
    public static class380 field193 = new class380("LOCAL", 4);

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "[I")
    public static int[] field198 = new int[3];

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "Lfha;")
    public static class522 field200 = new class522();

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "[Lfh;")
    public static class381[] field199;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lkc;IIIB)V", line = 7)
    public static final void method76(class655 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field197++;
        if (arg3 != 27142) {
            return;
        }
        int var5 = arg0.field8421[0];
        int var6 = arg0.field8414[0];
        if (var5 < 0 || var5 >= class514.field7179 || var6 < 0 || var6 >= class456.field6281 || arg1 < 0 || arg1 >= class514.field7179 || arg2 < 0 || class456.field6281 <= arg2) {
            return;
        }
        int var7 = class49.method335(-4, (byte) 3, class300.field3920, class745.field10380, 0, arg1, true, class464.field6351[arg0.field9501], 0, var5, 0, arg0.method3470(arg3 ^ 0xFFFF95F9), arg2, var6, 0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method3784(class745.field10380[var8], class300.field3920[var8], 0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V", line = 43)
    public static void method77(byte arg0) {
        field193 = null;
        field198 = null;
        field199 = null;
        if (arg0 <= -125) {
            field200 = null;
        }
    }
}
