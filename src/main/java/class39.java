import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class39 {

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Lph;")
    private class114 field402 = new class114(256);

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Lal;")
    private class369 field401;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Lql;")
    private class346 field400;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Ljo;")
    public final class218 method185(int arg0, int arg1) {
        Object var3 = this.field402.method616(-120, (long) arg1);
        if (var3 != null) {
            return (class218) var3;
        } else if (this.field401.method1665(arg1, (byte) -125)) {
            class75 var4 = this.field401.method1660(arg1, (byte) -121);
            int var5 = var4.field825 ? 64 : 128;
            class218 var7;
            if (var4.field843 && this.field400.method1636()) {
                float[] var6 = this.field401.method1664(var5, 0.7F, false, var5, arg1, (byte) -119);
                var7 = new class218(this.field400, 3553, 34842, var5, var5, var4.field819 != 0, var6, 6408);
            } else {
                int[] var8 = this.field401.method1659(0.7F, arg1, false, var5, var5, 21196);
                short var9 = 6408;
                var7 = new class218(this.field400, 3553, var9, var5, var5, var4.field819 != 0, var8, false);
            }
            var7.method1171(var4.field828, var4.field844);
            this.field402.method615((byte) -117, (long) arg1, var7);
            return arg0 >= -117 ? (class218) null : var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public final void method186(int arg0) {
        int var2 = 71 % ((arg0 + 15) / 58);
        this.field402.method613(true);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lql;Lal;)V")
    public class39(class346 arg0, class369 arg1) {
        this.field401 = arg1;
        this.field400 = arg0;
    }
}
