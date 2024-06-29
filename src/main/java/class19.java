import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class19 extends class90 {

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "[Lrf;")
    public static class163[] field317 = new class163[100];

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "Lrf;")
    public static class163 field322 = class53.method392(-117, "me");

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "Lrf;")
    public static class163 field333 = class53.method392(122, "p12_full");

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field321 = 0;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Z")
    public static boolean field312 = false;

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "Lrf;")
    private static class163 field338 = class53.method392(-117, "Bad session id)3");

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "Lrf;")
    public static class163 field332 = field338;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Lrf;")
    public static class163 field314 = class53.method392(-93, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "Llc;")
    public class107 field328;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "Lqe;")
    public class153 field306;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Lrg;")
    public class164 field308;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "Ljb;")
    public class88 field319;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public static void method121(int arg0) {
        field332 = null;
        field322 = null;
        field333 = null;
        field317 = null;
        field314 = null;
        field338 = null;
        if (arg0 != 0) {
            method121(62);
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)Lpf;")
    public static final class145 method122(int arg0) {
        class145 var1 = new class145();
        var1.field2976 = class57.field1158[0];
        field337++;
        var1.field2974 = class167.field3393;
        int var2 = 66 / ((-arg0 - 40) / 45);
        var1.field2977 = class202.field3980[0];
        var1.field2972 = class108.field2242[0];
        var1.field2970 = class129.field2686[0];
        var1.field2971 = class206.field4036;
        var1.field2975 = class102.field2135[0];
        var1.field2973 = class81.field1639;
        class119.method814((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JB)V")
    public static final void method123(long arg0, byte arg1) {
        field327++;
        if (arg0 == 0L || arg1 != -62) {
            return;
        }
        for (int var3 = 0; var3 < class26.field479; var3++) {
            if (class130.field2713[var3] == arg0) {
                class64.field1343++;
                class26.field479--;
                for (int var4 = var3; var4 < class26.field479; var4++) {
                    class130.field2713[var4] = class130.field2713[var4 + 1];
                    class55.field1118[var4] = class55.field1118[var4 + 1];
                }
                class109.field2286 = class62.field1325;
                class141.field2896.method326(104, 128);
                class141.field2896.method373((byte) -52, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field306 = null;
        this.field319 = null;
        field324++;
        this.field328 = null;
        if (arg0 != 0) {
            method123(122L, (byte) 103);
        }
        this.field308 = null;
    }
}
