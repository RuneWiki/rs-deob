import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public abstract class class430 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lqk;")
    public static class148 field5921 = new class148(39, 6);

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Lmaa;")
    public static class505 field5925 = new class505();

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "Lwu;")
    public static class557 field5923;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Luha;")
    public static class723 field5926;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Loq;")
    public static class742 field5924;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "Ljava/awt/Font;")
    public static Font field5927;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
    public abstract void method2269(boolean arg0, int arg1);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public static void method2605(boolean arg0) {
        field5927 = null;
        field5926 = null;
        if (!arg0) {
            field5925 = null;
        }
        field5923 = null;
        field5921 = null;
        field5924 = null;
        field5925 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public static final void method2606(byte arg0) {
        field5922++;
        int var1 = class147.field2030;
        int[] var2 = class351.field4456;
        if (arg0 < 57) {
            field5927 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class655 var9 = class40.field563[var2[var3]];
            if (var9 != null && var9.field8338 > 0) {
                var9.field8338--;
                if (var9.field8338 == 0) {
                    var9.field8314 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class676.field9533; var4++) {
            long var5 = (long) class731.field10231[var4];
            class15 var7 = (class15) class403.field5587.method1381(true, var5);
            if (var7 != null) {
                class55 var8 = var7.field204;
                if (var8.field8338 > 0) {
                    var8.field8338--;
                    if (var8.field8338 == 0) {
                        var8.field8314 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)[B")
    public abstract byte[] method2271(int arg0, int arg1);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Lsia;")
    public abstract class153 method2280(int arg0);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
    public abstract int method2276(int arg0, byte arg1);
}
