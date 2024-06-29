import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class249 {

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3742 = -1;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[Lgf;")
    public static class8[] field3738;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[Lbb;")
    public static class91[] field3739;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 14)
    public static void method1726(byte arg0) {
        int var1 = 59 / ((-arg0 - 51) / 55);
        field3738 = null;
        field3739 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;B)Luc;", line = 31)
    public static final class190 method1727(String arg0, byte arg1) {
        field3743++;
        for (class190 var2 = (class190) class87.field1276.method986(false); var2 != null; var2 = (class190) class87.field1276.method982(14877)) {
            if (var2.field3021.equals(arg0)) {
                return var2;
            }
        }
        if (arg1 == 0) {
            return null;
        } else {
            return (class190) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lwg;", line = 57)
    public static final class290 method1728(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class290 var4 = var3.field1474;
            var3.field1474 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIJ)Z", line = 69)
    public static final boolean method1729(int arg0, int arg1, int arg2, long arg3) {
        field3740++;
        int var5 = ((int) arg3 & 0x398BA5) >> 20;
        int var6 = ((int) arg3 & 0x7DE3E) >> 14;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class101 var8 = class281.method1984(var7, false);
            int var9 = var8.field1529;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field1524;
                var11 = var8.field1533;
            } else {
                var10 = var8.field1533;
                var11 = var8.field1524;
            }
            if (var5 != 0) {
                var9 = (var9 >> 4 - var5) + (var9 << var5 & 0xF);
            }
            class328.method2241(var11, class235.field3602.field4470[0], 2, var9, (byte) 12, true, class235.field3602.field4477[0], var10, 0, 0, arg0, arg1);
        } else {
            class328.method2241(0, class235.field3602.field4470[0], 2, 0, (byte) 12, true, class235.field3602.field4477[0], 0, var6 + 1, var5, arg0, arg1);
        }
        class128.field2027 = class97.field1446;
        class113.field1783 = arg2;
        class99.field1462 = class38.field573;
        class3.field11 = 2;
        return true;
    }
}
