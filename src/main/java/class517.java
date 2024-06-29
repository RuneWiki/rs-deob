import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class517 extends class508 {

    @OriginalMember(owner = "client!it", name = "E", descriptor = "Lwp;")
    public static class453 field7062 = new class453(45, 19);

    @OriginalMember(owner = "client!it", name = "K", descriptor = "I")
    public static int field7068 = -1;

    @OriginalMember(owner = "client!it", name = "J", descriptor = "[[I")
    public static int[][] field7067 = new int[128][128];

    @OriginalMember(owner = "client!it", name = "L", descriptor = "I")
    public static int field7069 = 1;

    @OriginalMember(owner = "client!it", name = "M", descriptor = "Lrga;")
    public static class280 field7070 = new class280(76, 4);

    @OriginalMember(owner = "client!it", name = "N", descriptor = "I")
    public static int field7071 = -1;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public int field7051;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    public int field7056;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "I")
    public int field7058;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public int field7059;

    @OriginalMember(owner = "client!it", name = "F", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!it", name = "H", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "Lqfa;")
    public class372 field7061;

    @OriginalMember(owner = "client!it", name = "I", descriptor = "Ljava/lang/String;")
    public String field7066;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "[I")
    public int[] field7054;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "[I")
    public int[] field7060;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "[Lil;")
    public class68[] field7057;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field7064;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V", line = 5)
    public static final void method2797(byte arg0) {
        field7063++;
        class577.field8054.method2412((byte) 41);
        if (arg0 != 25) {
            field7062 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I", line = 16)
    public static final int method2798(int arg0, int arg1) {
        if (arg0 != -24420) {
            return 1;
        }
        field7065++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BIIIII)V", line = 68)
    public static final void method2799(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class510.field6934 = arg5;
        class389.field4906 = arg1;
        class133.field1726 = arg4;
        class72.field971 = arg3;
        class257.field3130 = arg2;
        field7055++;
        if (class510.field6934 >= 100) {
            int var6 = class257.field3130 * 512 + 256;
            int var7 = class72.field971 * 512 + 256;
            int var8 = class467.method2469(var6, class476.field6039, -20214, var7) - class133.field1726;
            int var9 = var6 - class20.field292;
            int var10 = var8 - class571.field7982;
            int var11 = var7 - class276.field3464;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class215.field2673 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class693.field9826 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class215.field2673 < 1024) {
                class215.field2673 = 1024;
            }
            class654.field9226 = 0;
            if (class215.field2673 > 3072) {
                class215.field2673 = 3072;
            }
        }
        class196.field2471 = -1;
        class306.field3890 = -1;
        class296.field3661 = 2;
        int var13 = 17 % ((arg0 - 37) / 36);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lpl;I)V", line = 120)
    public static final void method2800(class612 arg0, int arg1) {
        field7052++;
        class152.field1947 = arg0.method3341("hitmarks", -62);
        class13.field236 = arg0.method3341("hitbar_default", -86);
        class138.field1796 = arg0.method3341("timerbar_default", 73);
        class145.field1876 = arg0.method3341("headicons_pk", 95);
        class26.field389 = arg0.method3341("headicons_prayer", -72);
        class622.field8707 = arg0.method3341("hint_headicons", -97);
        class387.field4867 = arg0.method3341("hint_mapmarkers", -94);
        class677.field9506 = arg0.method3341("mapflag", arg1 ^ 0xFFFFAD34);
        class487.field6449 = arg0.method3341("cross", arg1 ^ 0x529F);
        class20.field316 = arg0.method3341("mapdots", -77);
        class257.field3135 = arg0.method3341("scrollbar", 46);
        class183.field2334 = arg0.method3341("name_icons", 126);
        if (arg1 != -21243) {
            method2802(true);
        }
        class135.field1755 = arg0.method3341("floorshadows", 41);
        class207.field2626 = arg0.method3341("compass", -65);
        class462.field5891 = arg0.method3341("otherlevel", -66);
        class594.field8351 = arg0.method3341("hint_mapedge", 82);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 146)
    public static final int method2801(Random arg0, int arg1, int arg2) {
        field7050++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class4.method36(arg1, (byte) 98)) {
            return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            if (arg2 < 120) {
                method2798(23, -94);
            }
            return class678.method3797(arg1, 67, var4);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V", line = 178)
    public static void method2802(boolean arg0) {
        field7070 = null;
        field7062 = null;
        field7067 = null;
        if (arg0) {
            method2801(null, 38, 80);
        }
    }
}
