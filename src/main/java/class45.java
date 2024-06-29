import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class45 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Ldf;")
    public static class51 field717 = class46.method233("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 100);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[I")
    public static int[] field720 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Ldf;")
    public static class51 field725 = class46.method233("Clientscript error )2 check log for details", 100);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lu;")
    public static class111 field723;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field718;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[[[I")
    public static int[][][] field716;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
    public static final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class245 var7 = new class245();
        var7.field4236 = arg1 / 128;
        var7.field4248 = arg2 / 128;
        var7.field4241 = arg3 / 128;
        var7.field4242 = arg4 / 128;
        var7.field4234 = arg0;
        var7.field4240 = arg1;
        var7.field4243 = arg2;
        var7.field4239 = arg3;
        var7.field4245 = arg4;
        var7.field4247 = arg5;
        var7.field4235 = arg6;
        class147.field2471[class46.field730++] = var7;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static final void method227(boolean arg0) {
        field722++;
        int var1 = 0;
        int[] var2 = new int[class19.field270];
        for (int var3 = 0; var3 < class19.field270; var3++) {
            class222 var5 = class219.method1508(var3, (byte) 123);
            if (var5.field3857 >= 0 || var5.field3867 >= 0) {
                var2[var1++] = var3;
            }
        }
        class77.field1234 = new int[var1];
        if (!arg0) {
            field725 = null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            class77.field1234[var4] = var2[var4];
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[BLbf;)V")
    public static final void method228(int arg0, int arg1, byte[] arg2, class188 arg3) {
        class124 var4 = new class124();
        field721++;
        var4.field2098 = arg2;
        var4.field2107 = 0;
        var4.field2102 = arg3;
        var4.field1760 = (long) arg1;
        int var5 = -60 % ((arg0 - 55) / 63);
        class252 var6 = class14.field207;
        synchronized (class14.field207) {
            class14.field207.method1709(-124, var4);
        }
        class264.method1795(5);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public static void method229(boolean arg0) {
        field723 = null;
        field725 = null;
        field717 = null;
        field718 = null;
        if (arg0) {
            method226(-105, 105, 93, -55, 34, 54, 89);
        }
        field716 = null;
        field720 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)J")
    public static final long method230(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        return var3 == null || var3.field1614 == null ? 0L : var3.field1614.field2660;
    }
}
