import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class58 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "J")
    public long field1081 = 0L;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1079 = 0;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1082 = 0;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "[I")
    public static int[] field1089 = new int[100];

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[Z")
    public static boolean[] field1093 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lia;")
    public class88 field1084;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lia;")
    public class88 field1086;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)[Lji;")
    public static final class106[] method445(int arg0) {
        field1094++;
        int var1 = 33 % ((arg0 - 26) / 38);
        class106[] var2 = new class106[class113.field2018];
        for (int var3 = 0; var3 < class113.field2018; var3++) {
            int var4 = class238.field4336[var3] * class174.field3308[var3];
            byte[] var5 = class217.field4040[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class5.field42[method449(255, var5[var7])];
            }
            var2[var3] = new class182(class67.field1207, class160.field3030, class166.field3162[var3], class7.field77[var3], class174.field3308[var3], class238.field4336[var3], var6);
        }
        class97.method644(true);
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method446(int arg0) {
        field1089 = null;
        field1093 = null;
        if (arg0 != 0) {
            field1079 = -89;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBI)V")
    public static final void method447(int arg0, int arg1, byte arg2, int arg3) {
        field1085++;
        if (arg2 != 65) {
            field1089 = null;
        }
        if (class8.field95 == 0 || arg0 == 0 || class225.field4159 >= 50 || arg3 == -1) {
            return;
        }
        class124.field2213[class225.field4159] = arg3;
        class29.field546[class225.field4159] = arg0;
        class117.field2099[class225.field4159] = arg1;
        class210.field3940[class225.field4159] = null;
        class198.field3691[class225.field4159] = 0;
        class225.field4159++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)I")
    public static final int method448(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 65536 - class169.field3220[arg0 * 1024 / arg4] >> 1;
        if (arg3 == 0) {
            field1090++;
            return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public static int method449(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
