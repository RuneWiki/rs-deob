import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class269 {

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "I")
    public int field3846 = 0;

    @OriginalMember(owner = "client!tia", name = "h", descriptor = "I")
    public int field3851 = 0;

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "Ljt;")
    private class106 field3848 = new class106(64);

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "Lrw;")
    private class759 field3855 = null;

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "Lvd;")
    private class39 field3845;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "Lvd;")
    private class39 field3844;

    @OriginalMember(owner = "client!tia", name = "i", descriptor = "Lada;")
    public static class164 field3852 = new class164();

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "D")
    public static double field3849;

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "F")
    public static float field3850;

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!tia", name = "k", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(B)V")
    public static void method1718(byte arg0) {
        field3852 = null;
        if (arg0 < 0) {
            field3849 = -1.3780533435642581D;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "([ILfa;JI)Ljava/lang/String;")
    public final String method1719(int[] arg0, class235 arg1, long arg2, int arg3) {
        field3847++;
        int var6 = -37 / ((arg3 + 77) / 38);
        if (this.field3855 != null) {
            String var7 = this.field3855.method1190(4064, arg0, arg1, arg2);
            if (var7 != null) {
                return var7;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Llq;")
    public final class554 method1720(int arg0, int arg1) {
        field3853++;
        class554 var3 = (class554) this.field3848.method803(118, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field3844.method211(true, 1, arg0);
        } else {
            var4 = this.field3845.method211(true, 1, arg0 & 0x7FFF);
        }
        class554 var5 = new class554();
        var5.field7913 = this;
        if (var4 != null) {
            var5.method3236(-53, new class645(var4));
        }
        if (arg0 >= 32768) {
            var5.method3229(120);
        }
        this.field3848.method801(arg1, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(ILvd;Lvd;Lrw;)V")
    public class269(int arg0, class39 arg1, class39 arg2, class759 arg3) {
        this.field3845 = arg2;
        this.field3855 = arg3;
        this.field3844 = arg1;
        if (this.field3844 != null) {
            this.field3846 = this.field3844.method229(1, 0);
        }
        if (this.field3845 != null) {
            this.field3851 = this.field3845.method229(1, 0);
        }
    }
}
