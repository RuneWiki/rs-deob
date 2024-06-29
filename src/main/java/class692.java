import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class692 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field9641 = 1;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
    public static int[] field9642 = new int[4];

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static final void method3902(int arg0) {
        field9643++;
        int var1 = class586.field7665;
        int[] var2 = class20.field351;
        if (arg0 != 32684) {
            method3902(-41);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class383 var9 = class248.field3438[var2[var3]];
            if (var9 != null && var9.field10294 > 0) {
                var9.field10294--;
                if (var9.field10294 == 0) {
                    var9.field10267 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class306.field4404; var4++) {
            long var5 = (long) class628.field8351[var4];
            class134 var7 = (class134) class390.field5470.method2135(var5, (byte) 31);
            if (var7 != null) {
                class556 var8 = var7.field2154;
                if (var8.field10294 > 0) {
                    var8.field10294--;
                    if (var8.field10294 == 0) {
                        var8.field10267 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static void method3903(int arg0) {
        field9642 = null;
        int var1 = 1 % ((75 - arg0) / 32);
    }
}
