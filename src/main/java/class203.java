import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class203 extends class182 {

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    private int field3981;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "[[I")
    public int[][] field3969;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "[I")
    public int[] field3971;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Lsg;")
    public static class169 field3967 = class165.method1060("Diese Welt ist voll)3", 1536);

    @OriginalMember(owner = "client!we", name = "C", descriptor = "[Lsg;")
    public static class169[] field3975 = new class169[1000];

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Lsg;")
    public static class169 field3977 = class165.method1060(" )2> <col=ffff00>", 1536);

    @OriginalMember(owner = "client!we", name = "A", descriptor = "Lsg;")
    public static class169 field3973 = class165.method1060("<col=80ff00>", 1536);

    @OriginalMember(owner = "client!we", name = "F", descriptor = "[I")
    public static int[] field3978 = new int[1000];

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Lsg;")
    private static class169 field3970 = class165.method1060("Please wait )2 attempting to reestablish)3", 1536);

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "Lsg;")
    public static class169 field3982 = field3970;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "Lke;")
    public static class95 field3980;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "[I")
    public static int[] field3976;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public static final void method1320(int arg0) {
        field3972++;
        if (arg0 != -3119) {
            return;
        }
        int var1 = (class4.field79.field3698 >> 7) + class179.field3489;
        int var2 = (class4.field79.field3679 >> 7) + class191.field3761;
        class23.field486 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class23.field486 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class23.field486 = 1;
        }
        if (class23.field486 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class23.field486 = 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method1321(boolean arg0, int arg1, Object arg2) {
        field3979++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class22.method157((byte) -31, var3) : var3;
        } else if (arg2 instanceof class137) {
            class137 var4 = (class137) arg2;
            return var4.method245(99);
        } else {
            if (arg1 != 0) {
                method1320(-71);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field3976 = null;
        field3973 = null;
        field3982 = null;
        field3977 = null;
        field3978 = null;
        field3967 = null;
        field3980 = null;
        field3970 = null;
        int var1 = -115 / ((arg0 + 35) / 48);
        field3975 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I[B)V")
    public class203(int arg0, byte[] arg1) {
        this.field3968 = arg0;
        class127 var3 = new class127(arg1);
        this.field3981 = var3.method819((byte) 22);
        this.field3969 = new int[this.field3981][];
        this.field3971 = new int[this.field3981];
        for (int var4 = 0; var4 < this.field3981; var4++) {
            this.field3971[var4] = var3.method819((byte) 22);
        }
        for (int var5 = 0; var5 < this.field3981; var5++) {
            this.field3969[var5] = new int[var3.method819((byte) 22)];
        }
        for (int var6 = 0; var6 < this.field3981; var6++) {
            for (int var7 = 0; var7 < this.field3969[var6].length; var7++) {
                this.field3969[var6][var7] = var3.method819((byte) 22);
            }
        }
    }
}
