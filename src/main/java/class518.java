import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class518 extends class159 {

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "Lqw;")
    public static class84 field7196 = new class84();

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "[I")
    public static int[] field7213 = new int[120];

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public int field7195;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public int field7197;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
    public int field7198;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
    public int field7200;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
    public int field7201;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    public int field7202;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "I")
    public int field7203;

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "I")
    public int field7204;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public int field7205;

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "I")
    public int field7208;

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "I")
    public int field7209;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "I")
    public int field7210;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
    public int field7212;

    @OriginalMember(owner = "client!ew", name = "D", descriptor = "I")
    public int field7214;

    @OriginalMember(owner = "client!ew", name = "E", descriptor = "I")
    public int field7215;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "I")
    public int field7216;

    @OriginalMember(owner = "client!ew", name = "H", descriptor = "I")
    public int field7218;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "Luga;")
    public class221 field7207;

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "Lvca;")
    public class296 field7211;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "Llq;")
    public class578 field7199;

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "Lpv;")
    public class78 field7217;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)V")
    public static void method3015(boolean arg0) {
        field7213 = null;
        field7196 = null;
        if (!arg0) {
            method3016(-88, -61);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I")
    public static final int method3016(int arg0, int arg1) {
        return class43.field462 == null ? 0 : class43.field462[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public final void method3017(int arg0) {
        this.field7207 = null;
        field7206++;
        if (arg0 != 26043) {
            this.field7200 = 26;
        }
        this.field7211 = null;
        this.field7217 = null;
        this.field7199 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field7213[var1] = var0 / 4;
        }
        field7219 = 0;
    }
}
