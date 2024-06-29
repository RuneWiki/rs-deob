import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class118 extends class86 {

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "[B")
    public byte[] field1826;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
    public static int[] field1823 = new int[14];

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Lkf;")
    public static class184 field1829;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "[B")
    public static byte[] field1830;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "[[[I")
    public static int[][][] field1825;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method850(byte arg0) {
        field1827++;
        if (field1829 != null) {
            field1829.method1242((byte) 113);
            field1829 = null;
        }
        class238.method1600(64);
        class219.method1461();
        for (int var1 = 0; var1 < 4; var1++) {
            class72.field1142[var1].method612(2359552);
        }
        class220.method1471(-1, false);
        System.gc();
        class214.method1428(255, 2);
        class295.field4633 = -1;
        class28.field421 = false;
        class202.method1357((byte) 28, true);
        class272.field4298 = 0;
        class187.field2824 = false;
        class147.field2279 = 0;
        class129.field2008 = 0;
        field1828 = 0;
        for (int var2 = 0; var2 < class217.field3360.length; var2++) {
            class217.field3360[var2] = null;
        }
        class62.field1006 = 0;
        class5.field78 = 0;
        int var3 = -71 / ((arg0 + 82) / 44);
        for (int var4 = 0; var4 < 2048; var4++) {
            class41.field675[var4] = null;
            class81.field1347[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class72.field1144[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class293.field4613[var6][var7][var8] = null;
                }
            }
        }
        class103.method789((byte) -1);
        class109.field1741 = 0;
        class37.method316(2204);
        class3.method47(true, (byte) -44);
        try {
            class138.method959("loggedout", (byte) -120, class22.field329.field934);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)I")
    public static final int method851(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        if (arg1 != -23456) {
            method850((byte) -114);
        }
        field1824++;
        return (arg0 >> 2 << 10) + (arg3 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static void method852(int arg0) {
        field1825 = null;
        if (arg0 == 0) {
            field1823 = null;
            field1830 = null;
            field1829 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V")
    public class118(byte[] arg0) {
        this.field1826 = arg0;
    }
}
