import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class167 extends class199 {

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "[I")
    public static int[] field2333 = new int[200];

    @OriginalMember(owner = "client!se", name = "X", descriptor = "Ljava/lang/String;")
    public static String field2330 = "Loading textures - ";

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "Lfh;")
    public static class140 field2332;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field2331;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "Ljava/lang/String;")
    public static String field2336;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "[Luj;")
    public static class158[] field2329;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lfd;I)V", line = 9)
    public static final void method1243(class299 arg0, int arg1) {
        field2335++;
        byte[] var2 = new byte[24];
        if (arg1 != -1) {
            method1248(94, 92, -13, -91, -127, 124, -68, 101);
        }
        if (class134.field1825 != null) {
            try {
                class134.field1825.method97(true, 0L);
                class134.field1825.method102(0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method2061(0, var2, 24, (byte) -78);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(III)I", line = 55)
    private final int method1244(int arg0, int arg1, int arg2) {
        field2327++;
        int var4 = arg2 + (arg0 * 57);
        int var5 = var4 << 1 ^ var4;
        return arg1 == -9228 ? 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) : 57;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V", line = 76)
    public static final void method1245(int arg0, int arg1) {
        field2334++;
        class341.field5323.method2264((byte) 30, arg1);
        if (arg0 < -59) {
            class82.field1044.method2264((byte) 108, arg1);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I", line = 95)
    public final int[] method190(int arg0, int arg1) {
        int[] var3 = this.field2802.method2502(arg1, arg0 ^ 0xFFFFF960);
        field2328++;
        if (this.field2802.field5637) {
            int var4 = class274.field3919[arg1];
            for (int var5 = 0; var5 < class95.field1235; var5++) {
                var3[var5] = this.method1244(var4, -9228, class82.field1062[var5]) % 4096;
            }
        }
        if (arg0 != -1735) {
            method1247(true, (class299) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V", line = 126)
    public static void method1246(int arg0) {
        field2331 = null;
        field2336 = null;
        field2332 = null;
        field2333 = null;
        int var1 = -35 % ((-arg0 - 16) / 57);
        field2330 = null;
        field2329 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLfd;)Lin;", line = 140)
    public static final class284 method1247(boolean arg0, class299 arg1) {
        if (!arg0) {
            method1245(-25, 107);
        }
        field2325++;
        return new class284(arg1.method2043(true), arg1.method2043(arg0), arg1.method2043(true), arg1.method2043(true), arg1.method2043(true), arg1.method2043(true), arg1.method2043(arg0), arg1.method2043(true), arg1.method2085((byte) 62), arg1.method2096((byte) -122));
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 150)
    public class167() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V", line = 155)
    public static final void method1248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2326++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class180.field2466 - class251.field3692) * var8 / 100 + class251.field3692;
        int var10 = arg4 * var9 >> 8;
        int var11 = 2048 - arg1 & 0x7FF;
        int var12 = 0;
        int var13 = 2048 - arg3 & 0x7FF;
        int var14 = 0;
        int var15 = var10;
        if (var13 != 0) {
            int var16 = class350.field5476[var13];
            int var17 = class350.field5474[var13];
            var12 = -var10 * var16 >> 16;
            var15 = var10 * var17 >> 16;
        }
        if (var11 != 0) {
            int var18 = class350.field5474[var11];
            int var19 = class350.field5476[var11];
            var14 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class248.field3606 = arg5 - var15;
        class343.field5332 = arg2 - var12;
        class112.field1453 = arg7 - var14;
        if (arg0 != 57) {
            field2331 = (String) null;
        }
        class347.field5398 = arg1;
        class94.field1222 = arg3;
    }
}
