import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class41 extends class518 {

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lea;")
    public static class474 field450 = new class474("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Z")
    public static final boolean method218(int arg0, int arg1, int arg2) {
        ++field447;
        int var3 = -101 / ((arg1 - 42) / 46);
        return ((8192 & arg0) != 0 | class449.method2785(arg0, -21297, arg2) | class159.method917(8, arg2, arg0)) & class113.method696(0, arg0, arg2);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method219(int arg0) {
        if (arg0 < -10) {
            field450 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIII)V")
    public class41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field451 = arg2;
        this.field454 = arg0;
        this.field453 = arg3;
        this.field448 = arg1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
    public final void method220(int arg0, int arg1, int arg2) {
        ++field455;
        int var4 = this.field454 * arg0 >> 12;
        int var5 = this.field451 * arg0 >> 12;
        int var6 = this.field448 * arg2 >> 12;
        int var7 = this.field453 * arg2 >> 12;
        class341.method2194(var5, var7, var6, super.field7535, arg1 + arg1, super.field7534, super.field7537, var4);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lxa;)V")
    public static final void method221(int arg0, class433[] arg1) {
        class421.field6305 = arg1.length;
        ++field449;
        class286.field3960 = new class433[class421.field6305 + 10];
        class229.field3233 = new int[class421.field6305 + 10];
        class210.method1327(arg1, arg0, class286.field3960, 0, class421.field6305);
        for (int var2 = 0; ~var2 > ~class421.field6305; ++var2) {
            class229.field3233[var2] = class286.field3960[var2].method1568();
        }
        for (int var3 = class421.field6305; ~var3 > ~class286.field3960.length; ++var3) {
            class229.field3233[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)I")
    public static final int method222(boolean arg0, int arg1) {
        ++field445;
        if (!arg0) {
            return -54;
        } else if (~arg1 > -97) {
            return 0;
        } else {
            return arg1 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)V")
    public final void method223(int arg0, byte arg1, int arg2) {
        if (arg1 < -86) {
            ++field446;
            int var4 = this.field454 * arg2 >> 12;
            int var5 = this.field451 * arg2 >> 12;
            int var6 = this.field448 * arg0 >> 12;
            int var7 = this.field453 * arg0 >> 12;
            class550.method3194(var6, super.field7534, var7, var4, var5, super.field7535, -24);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZ)V")
    public final void method224(int arg0, int arg1, boolean arg2) {
        ++field452;
        int var4 = this.field454 * arg0 >> 12;
        if (arg2) {
            int var5 = this.field451 * arg0 >> 12;
            int var6 = this.field448 * arg1 >> 12;
            int var7 = this.field453 * arg1 >> 12;
            class89.method573(var7, var5, var4, 14, var6, super.field7537);
        }
    }

    static {
        new class474("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }
}
