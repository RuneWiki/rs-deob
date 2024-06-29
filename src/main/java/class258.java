import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class258 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field3842;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lig;")
    public static class258 field3841 = new class258(1);

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lig;")
    public static class258 field3845 = new class258(2);

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lig;")
    public static class258 field3846 = new class258(4);

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lig;")
    public static class258 field3847 = new class258(1);

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lig;")
    public static class258 field3848 = new class258(2);

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lig;")
    public static class258 field3849 = new class258(4);

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lig;")
    public static class258 field3850 = new class258(2);

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Lig;")
    public static class258 field3851 = new class258(4);

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field3853 = -1;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Ljw;")
    public static class581 field3852 = new class581(10, 0);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method1712(byte arg0) {
        field3847 = null;
        field3841 = null;
        field3845 = null;
        field3852 = null;
        int var1 = 27 / ((arg0 - 43) / 37);
        field3849 = null;
        field3846 = null;
        field3851 = null;
        field3850 = null;
        field3848 = null;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
    private class258(int arg0) {
        this.field3842 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public static final void method1713(int arg0, int arg1) {
        class195 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class296 var4 = class412.field5933[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class710.field9947; var5++) {
                    for (int var6 = 0; var6 < class405.field5875; var6++) {
                        var2 = var4.method1147(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class26.field388;
                            int var8 = var5 << class26.field388;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class296 var10 = class412.field5933[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1880(var6, false, var5) - var10.method1880(var6, false, var5);
                                    int var12 = var4.method1880(var6 + 1, false, var5) - var10.method1880(var6 + 1, false, var5);
                                    int var13 = var4.method1880(var6 + 1, false, var5 + 1) - var10.method1880(var6 + 1, false, var5 + 1);
                                    int var14 = var4.method1880(var6, false, var5 + 1) - var10.method1880(var6, false, var5 + 1);
                                    var10.method1152(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public static final void method1714(byte arg0) {
        if (arg0 <= 4) {
            method1714((byte) -33);
        }
        field3843++;
        if (class226.field3100 <= 0) {
            class704.field9864 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class257.field3837.length; var2++) {
            if (class257.field3837[var2].indexOf("--> ") != -1) {
                var1++;
                if (class226.field3100 == var1) {
                    class704.field9864 = class257.field3837[var2].substring(class257.field3837[var2].indexOf(">") + 2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3844++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method1715(int arg0) {
        field3840++;
        class242.method1567();
        int var1 = -20 % ((-arg0 - 72) / 33);
    }
}
