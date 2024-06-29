import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class141 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Ljt;")
    public static class106 field1858 = new class106(32);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public static void method984(boolean arg0) {
        if (!arg0) {
            field1858 = null;
        }
        field1858 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZZI)I")
    public static final int method985(int arg0, boolean arg1, boolean arg2, int arg3) {
        field1859++;
        class384 var4 = class529.method3090(arg1, (byte) 61, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field5809.length; var6++) {
                if (var4.field5804[var6] == arg3) {
                    var5 += var4.field5809[var6];
                }
            }
            if (arg2) {
                field1858 = null;
            }
            return var5;
        }
    }
}
