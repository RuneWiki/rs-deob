import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class178 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
    public static int[] field2807 = new int[8];

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2806 = null;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lvl;")
    public static class15 field2811 = new class15(88, 18);

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Z")
    public static boolean field2814 = false;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lbn;")
    public static class469 field2808;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lha;")
    public static class66 field2810;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lhn;")
    public static class752 field2812;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[Ls;")
    public static class296[] field2805;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method1346(int arg0) {
        class663.field9208.method272(20);
        field2804++;
        int var1 = -86 / ((-arg0 - 46) / 62);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method1347(byte arg0) {
        field2806 = null;
        field2807 = null;
        field2811 = null;
        if (arg0 < 108) {
            field2807 = null;
        }
        field2812 = null;
        field2810 = null;
        field2808 = null;
        field2805 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1348(int arg0, int arg1) {
        field2809++;
        if (arg0 != -1) {
            return null;
        } else if (arg1 == 100 && class757.field10433 > 0) {
            byte[] var2 = class415.field5694[--class757.field10433];
            class415.field5694[class757.field10433] = null;
            return var2;
        } else if (arg1 == 5000 && class741.field10227 > 0) {
            byte[] var3 = class395.field5447[--class741.field10227];
            class395.field5447[class741.field10227] = null;
            return var3;
        } else if (arg1 == 30000 && class643.field8898 > 0) {
            byte[] var4 = class507.field6968[--class643.field8898];
            class507.field6968[class643.field8898] = null;
            return var4;
        } else {
            if (class278.field3848 != null) {
                for (int var5 = 0; var5 < class652.field9028.length; var5++) {
                    if (class652.field9028[var5] == arg1 && class658.field9110[var5] > 0) {
                        byte[] var6 = class278.field3848[var5][--class658.field9110[var5]];
                        class278.field3848[var5][class658.field9110[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B[B)V")
    public static final synchronized void method1349(byte arg0, byte[] arg1) {
        field2813++;
        int var2 = 42 % ((-arg0 - 85) / 39);
        if (arg1.length == 100 && class757.field10433 < 1000) {
            class415.field5694[class757.field10433++] = arg1;
        } else if (arg1.length == 5000 && class741.field10227 < 250) {
            class395.field5447[class741.field10227++] = arg1;
        } else if (arg1.length == 30000 && class643.field8898 < 50) {
            class507.field6968[class643.field8898++] = arg1;
        } else if (class278.field3848 != null) {
            for (int var3 = 0; var3 < class652.field9028.length; var3++) {
                if (class652.field9028[var3] == arg1.length && class278.field3848[var3].length > class658.field9110[var3]) {
                    class278.field3848[var3][class658.field9110[var3]++] = arg1;
                    return;
                }
            }
        }
    }
}
