import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class631 {

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "Z")
    public boolean field8793 = false;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "Lnj;")
    public static class415 field8796 = new class415(22, -1);

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
    public static int field8808 = 0;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "Ljava/util/Random;")
    public static Random field8802 = new Random();

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "F")
    public static float field8801;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public int field8797;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public int field8803;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "Ltp;")
    public class545 field8807;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lufa;Lpe;I)V")
    public static final void method3496(class140 arg0, class615 arg1, int arg2) {
        field8795++;
        class619.field8351 = arg1;
        class192.field2461 = "";
        class265.field3542 = arg0;
        if (class356.field4612.startsWith("win")) {
            class192.field2461 = class192.field2461 + "windows/";
        } else if (class356.field4612.startsWith("linux")) {
            class192.field2461 = class192.field2461 + "linux/";
        } else if (class356.field4612.startsWith("mac")) {
            class192.field2461 = class192.field2461 + "macos/";
        }
        if (class265.field3542.field1841) {
            class192.field2461 = class192.field2461 + "msjava/";
        } else if (class356.field4608.startsWith("amd64") || class356.field4608.startsWith("x86_64")) {
            class192.field2461 = class192.field2461 + "x86_64/";
        } else if (class356.field4608.startsWith("i386") || class356.field4608.startsWith("i486") || class356.field4608.startsWith("i586") || class356.field4608.startsWith("x86")) {
            class192.field2461 = class192.field2461 + "x86/";
        } else if (class356.field4608.startsWith("ppc")) {
            class192.field2461 = class192.field2461 + "ppc/";
        } else {
            class192.field2461 = class192.field2461 + "universal/";
        }
        if (arg2 != 15363) {
            field8808 = 89;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)Lfs;")
    public static final class546 method3497(int arg0, int arg1) {
        field8798++;
        class546[] var2 = class501.method2714(4);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class546 var4 = var2[var3];
            if (var4.field7087 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZLfd;)V")
    public final void method3498(boolean arg0, class418 arg1) {
        while (true) {
            int var3 = arg1.method2396(125);
            if (var3 == 0) {
                if (arg0) {
                    return;
                }
                field8794++;
                return;
            }
            this.method3501(arg1, var3, 124);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjava/lang/String;Lfd;)I")
    public static final int method3499(int arg0, String arg1, class418 arg2) {
        field8805++;
        if (arg0 < 91) {
            method3499(-114, null, null);
        }
        int var3 = arg2.field5367;
        byte[] var4 = class145.method1082(arg1, (byte) 61);
        arg2.method2397(false, var4.length);
        arg2.field5367 += class416.field5353.method2738(var4, arg2.field5393, var4.length, 0, arg2.field5367, -1);
        return arg2.field5367 - var3;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)V")
    public static void method3500(boolean arg0) {
        field8796 = null;
        if (!arg0) {
            field8802 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lfd;II)V")
    private final void method3501(class418 arg0, int arg1, int arg2) {
        field8799++;
        if (arg1 == 1) {
            this.field8803 = arg0.method2393(-30727);
        } else if (arg1 == 2) {
            this.field8797 = arg0.method2364(-96);
        } else if (arg1 == 3) {
            this.field8793 = true;
        } else if (arg1 == 4) {
            this.field8803 = -1;
        }
        if (arg2 < 102) {
            this.field8797 = -114;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIII)V")
    public static final void method3502(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class260.field3509.field1276 * arg2 >> 8;
        field8800++;
        if (arg0 == arg3 && !class60.field823) {
            class81.method633((byte) -122);
        } else if (arg3 != -1 && (class166.field2085 != arg3 || !class193.method1268((byte) 106)) && var4 != 0 && !class60.field823) {
            class570.method3046(arg1, arg3, var4, false, class6.field53, false, 0);
        }
        class166.field2085 = arg3;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Loa;BZI)Lxa;")
    public final class511 method3503(class43 arg0, byte arg1, boolean arg2, int arg3) {
        field8804++;
        long var5 = (long) (this.field8803 | arg3 << 16 | (arg2 ? 262144 : 0) | arg0.field604 << 19);
        class511 var7 = (class511) this.field8807.field7084.method3655(95, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field8807.field7079.method3362(this.field8803, -114)) {
            if (arg1 > 0) {
                method3497(-62, 58);
            }
            class506 var8 = class506.method2732(this.field8807.field7079, this.field8803, 0);
            if (var8 != null) {
                var8.field6653 = var8.field6646 = var8.field6645 = var8.field6652 = 0;
                if (arg2) {
                    var8.method2728();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method2735();
                }
            }
            class511 var10 = arg0.method325(var8, true);
            if (var10 != null) {
                this.field8807.field7084.method3650(var5, -119, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)Z")
    public final boolean method3504(byte arg0) {
        int var2 = 61 % ((arg0 + 41) / 63);
        field8806++;
        return this.field8807.field7079.method3362(this.field8803, -106);
    }
}
