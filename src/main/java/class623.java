import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class623 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Z")
    public static boolean field8997 = false;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lcba;")
    public static class471 field8991 = new class471(71, -2);

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Ldm;")
    public static class46 field8998 = new class46();

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lan;")
    public static class21 field8995;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lhv;I)I")
    public static final int method3632(class442 arg0, int arg1) {
        field8993++;
        String var2 = class611.method3576(23974, arg0);
        int[] var3 = null;
        if (class311.method1946(arg0.field6298, 101)) {
            var3 = class181.field2574.method866((int) arg0.field6297, (byte) 79).field8892;
        } else if (arg0.field6294 != -1) {
            var3 = class181.field2574.method866(arg0.field6294, (byte) 79).field8892;
        } else if (class35.method366(arg0.field6298, (byte) 2)) {
            class576 var4 = (class576) class278.field3837.method1242(0, (long) ((int) arg0.field6297));
            if (var4 != null) {
                class109 var5 = var4.field7929;
                class593 var6 = var5.field1669;
                if (var6.field8532 != null) {
                    var6 = var6.method3516(class189.field2681, 126);
                }
                if (var6 != null) {
                    var3 = var6.field8566;
                }
            }
        } else if (class532.method3060(arg0.field6298, 59)) {
            Object var7 = null;
            class364 var8;
            if (arg0.field6298 == 1008) {
                var8 = class18.field227.method1201((byte) 113, (int) arg0.field6297);
            } else {
                var8 = class18.field227.method1201((byte) -91, (int) (arg0.field6297 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field4904 != null) {
                var8 = var8.method2183(true, class189.field2681);
            }
            if (var8 != null) {
                var3 = var8.field4905;
            }
        }
        if (arg1 >= -67) {
            return 22;
        }
        if (var3 != null) {
            var2 = var2 + class387.method2264(true, var3);
        }
        int var9 = class40.field798.method2811(class160.field2344, var2, 83);
        if (arg0.field6296) {
            var9 += class427.field6061.method429() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIILdj;)Ljava/awt/Frame;")
    public static final Frame method3633(int arg0, int arg1, int arg2, int arg3, int arg4, class288 arg5) {
        field8992++;
        if (!arg5.method1836(arg0 ^ 0xFFFFFFEE)) {
            return null;
        }
        if (arg0 != -2) {
            field8997 = false;
        }
        if (arg3 == 0) {
            class368[] var6 = class97.method692(arg5, (byte) 105);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5008 == arg1 && var6[var8].field5009 == arg4 && (arg2 == 0 || var6[var8].field5003 == arg2) && (!var7 || var6[var8].field5004 > arg3)) {
                    var7 = true;
                    arg3 = var6[var8].field5004;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class382 var9 = arg5.method1832(arg2, arg3, -106, arg1, arg4);
        while (var9.field5134 == 0) {
            class21.method220(0, 10L);
        }
        Frame var10 = (Frame) var9.field5132;
        if (var10 == null) {
            return null;
        } else if (var9.field5134 == 2) {
            class634.method3681(arg5, 12837, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
    public static final boolean method3634(int arg0, int arg1, int arg2) {
        field8996++;
        boolean var3 = (arg1 & arg2) == 0 ? class147.method979(-96, arg1, arg0) : class571.method3251(arg1, arg2 ^ 0xFFFFFFAF, arg0);
        return (arg0 & 0x10000) != 0 | class63.method540(arg0, arg1, -24587) | var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method3635(int arg0) {
        field8998 = null;
        field8995 = null;
        if (arg0 != -1415865760) {
            field8998 = null;
        }
        field8991 = null;
    }
}
