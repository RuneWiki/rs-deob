import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class380 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field5342 = -1;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field5343 = -1;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field5346 = 0;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field5345 = 0;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field5351 = 0;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
    public int[] field5350;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILdg;)V")
    public final void method2444(byte arg0, int arg1, class236 arg2) {
        field5344++;
        while (true) {
            int var4 = arg2.method1574(-55);
            if (var4 == 0) {
                if (arg0 >= -78) {
                    this.method2444((byte) 82, 13, (class236) null);
                    return;
                } else {
                    return;
                }
            }
            this.method2445(arg1, var4, arg2, (byte) -1);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILdg;B)V")
    private final void method2445(int arg0, int arg1, class236 arg2, byte arg3) {
        field5348++;
        if (arg3 != -1) {
            return;
        }
        if (arg1 == 1) {
            this.field5342 = arg2.method1617((byte) 48);
        } else if (arg1 == 2) {
            this.field5350 = new int[arg2.method1574(arg3 - 52)];
            for (int var5 = 0; var5 < this.field5350.length; var5++) {
                this.field5350[var5] = arg2.method1617((byte) 48);
            }
            return;
        } else if (arg1 == 3) {
            this.field5343 = arg2.method1574(-117);
            return;
        }
    }
}
