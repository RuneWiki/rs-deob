import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class470 {

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Ld;")
    private class242 field6898 = new class242(64);

    @OriginalMember(owner = "client!et", name = "d", descriptor = "Lum;")
    private class83 field6899;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public int field6901;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Ljp;")
    public static class55 field6900 = new class55(0, 6);

    @OriginalMember(owner = "client!et", name = "i", descriptor = "Lhv;")
    public static class150 field6904;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "Ljp;")
    public static class55 field6905;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Lum;")
    public static class83 field6896;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "[Lo;")
    public static class363[] field6906;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "[[[Lvt;")
    public static class281[][][] field6902;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)I")
    public static final int method2851(int arg0, int arg1) {
        field6903++;
        if (arg0 != -17453) {
            method2851(-48, -3);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Li;III[Z)V")
    public static final void method2852(class200 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class407.field6024 == class288.field4475) {
            return;
        }
        int var5 = class274.field4306[arg1].method68(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class11 var7 = class274.field4306[var6];
                if (var7 != null) {
                    var7.method55(arg0, arg2, var5 - var7.method68(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static void method2853(int arg0) {
        field6904 = null;
        field6905 = null;
        field6902 = null;
        field6896 = null;
        field6900 = null;
        if (arg0 != 13882) {
            method2851(-10, -32);
        }
        field6906 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)Lan;")
    public final class186 method2854(int arg0, byte arg1) {
        field6897++;
        class242 var3 = this.field6898;
        class186 var4;
        synchronized (this.field6898) {
            var4 = (class186) this.field6898.method1634((long) arg0, arg1 ^ 0xFFFFFFC6);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field6899;
        byte[] var6;
        synchronized (this.field6899) {
            var6 = this.field6899.method731(arg1 + 122, arg0, 19);
        }
        class186 var7 = new class186();
        if (var6 != null) {
            var7.method1295(new class194(var6), arg1 + 151);
        }
        class242 var8 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method1623((long) arg0, arg1 + 17743, var7);
            if (arg1 != -122) {
                field6902 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lpt;ILum;)V")
    public class470(class308 arg0, int arg1, class83 arg2) {
        this.field6899 = arg2;
        this.field6901 = this.field6899.method748(19, 12408);
    }

    static {
        new class179("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field6904 = new class150();
        field6905 = new class55(60, 8);
    }
}
