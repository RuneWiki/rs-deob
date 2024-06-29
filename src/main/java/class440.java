import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class440 extends class198 {

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Lsd;")
    public static class63 field6387 = new class63(11, 0, 1, 2);

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lho;")
    public static class103 field6390 = new class103(38, 7);

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field6391 = new String[100];

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public int field6381;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public int field6383;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public int field6389;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lwk;")
    public class96 field6382;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method2693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6386++;
        int var9 = arg2 + 1;
        class476.method2907(arg3, 78, arg0, class5.field54[arg2], arg5);
        int var8 = arg1 - 1;
        class476.method2907(arg3, 88, arg0, class5.field54[arg1], arg5);
        int var6 = var9;
        if (arg4 != 1671548872) {
            return;
        }
        while (var8 >= var6) {
            int[] var7 = class5.field54[var6];
            var7[arg5] = var7[arg3] = arg0;
            var6++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 29)
    public static final void method2694(byte arg0) {
        field6388++;
        class220.field2973.method3034((byte) 74);
        if (arg0 < 36) {
            field6390 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V", line = 46)
    public static void method2695(byte arg0) {
        field6391 = null;
        field6387 = null;
        if (arg0 >= 118) {
            field6390 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 62)
    public static final void method2696(int arg0) {
        class116.field1512 = 0;
        field6384++;
        int var1 = class334.field4414.method2426((byte) 117);
        int var2 = class334.field4414.method2447(4339);
        boolean var3 = class334.field4414.method2414(true) == 1;
        int var4 = class334.field4414.method2387((byte) 125);
        class60.method361(var2, (byte) -18);
        int var5 = (class132.field1742 - class334.field4414.field5729) / 16;
        class48.field496 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class48.field496[var6][var10] = class334.field4414.method2406((byte) -105);
            }
        }
        class245.field3230 = new int[var5];
        class467.field6937 = new int[var5];
        class409.field5862 = new byte[var5][];
        class180.field2346 = null;
        class68.field775 = null;
        class396.field5734 = new byte[var5][];
        class391.field5650 = new int[var5];
        class31.field318 = new byte[var5][];
        class318.field4245 = new int[var5];
        class195.field2507 = new int[var5];
        class47.field494 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - (class308.field4128 >> 4)) / 8; var8 <= (var1 + (class308.field4128 >> 4)) / 8; var8++) {
            for (int var9 = (var4 - (class426.field6200 >> 4)) / 8; var9 <= ((class426.field6200 >> 4) + var4) / 8; var9++) {
                class467.field6937[var7] = (var8 << 8) + var9;
                class318.field4245[var7] = class426.field6186.method2148("m" + var8 + "_" + var9, 0);
                class391.field5650[var7] = class426.field6186.method2148("l" + var8 + "_" + var9, 0);
                class245.field3230[var7] = class426.field6186.method2148("um" + var8 + "_" + var9, 0);
                class195.field2507[var7] = class426.field6186.method2148("ul" + var8 + "_" + var9, 0);
                var7++;
            }
        }
        class514.method3066(10, var1, var3, var4, arg0 ^ arg0);
    }
}
