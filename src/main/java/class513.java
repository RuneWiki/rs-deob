import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class513 extends class89 {

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    private int field7435;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "Ldq;")
    public static class493 field7441;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "Ltf;")
    public static class194 field7443;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "[Lrl;")
    public class509[] field7440;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "[[B")
    private byte[][] field7430;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILya;)V")
    public static final void method3061(int arg0, class38 arg1) {
        if (class122.field1646) {
            class354.method2033(-1, arg1);
        } else {
            class126.method884(-16, arg1);
        }
        if (arg0 >= -108) {
            field7443 = null;
        }
        field7431++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public static final void method3062(int arg0) {
        if (arg0 != -1) {
            return;
        }
        for (int var1 = 0; var1 < class379.field4998.length; var1++) {
            for (int var2 = 0; var2 < class379.field4998[0].length; var2++) {
                for (int var3 = 0; var3 < class379.field4998[0][0].length; var3++) {
                    class379.field4998[var1][var2][var3] = 0;
                }
            }
        }
        field7439++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)Z")
    public final boolean method3063(int arg0, int arg1) {
        if (arg0 != -12216) {
            method3061(95, null);
        }
        field7438++;
        return this.field7440[arg1].field7327;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)Z")
    public final boolean method3064(int arg0, int arg1) {
        field7433++;
        return arg0 > -56 ? false : this.field7440[arg1].field7324;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIB)V")
    public static final void method3065(int arg0, int arg1, int arg2, byte arg3) {
        field7436++;
        if (arg1 == 0) {
            class166.field2110++;
            class282.method1669(class344.field4408, false);
        }
        if (arg1 == 1) {
            class462.field6614++;
            class282.method1669(class483.field7067, false);
        }
        class40.field511.method2748(class320.field4064 + arg2, 8016);
        class40.field511.method2726(arg3 ^ 0xFFFF8985, class343.field4392.method834(false, 82) ? 1 : 0);
        if (arg3 != 112) {
            return;
        }
        class40.field511.method2783(class441.field6317 + arg0, -578373112);
        class247.field3176 = arg2;
        class274.field3441 = arg0;
        class199.field2593 = false;
        class394.method2264((byte) -90);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)Z")
    public final boolean method3066(int arg0, byte arg1) {
        if (arg1 != 35) {
            this.method3067(3);
        }
        field7434++;
        return this.field7440[arg0].field7330;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)Z")
    public final boolean method3067(int arg0) {
        field7432++;
        if (this.field7440 != null) {
            return true;
        }
        if (this.field7430 == null) {
            if (!class65.field838.method476(this.field7435, 10859)) {
                return false;
            }
            int[] var2 = class65.field838.method456(this.field7435, (byte) -123);
            this.field7430 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field7430[var3] = class65.field838.method481(this.field7435, var2[var3], -63);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field7430.length; var5++) {
            byte[] var14 = this.field7430[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class228.field2922.method486(false, var15);
        }
        if (!var4) {
            return false;
        }
        class18 var6 = new class18();
        int var7 = class65.field838.method469(30322, this.field7435);
        this.field7440 = new class509[var7];
        int[] var8 = class65.field838.method456(this.field7435, (byte) -123);
        for (int var9 = arg0; var9 < var8.length; var9++) {
            byte[] var10 = this.field7430[var9];
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            class382 var12 = null;
            for (class382 var13 = (class382) var6.method153(0); var13 != null; var13 = (class382) var6.method161(-52)) {
                if (var13.field5034 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class382(var11, class228.field2922.method457(var11, arg0 ^ 0xFFFFFFA3));
                var6.method163(var12, 0);
            }
            this.field7440[var8[var9]] = new class509(var10, var12);
        }
        this.field7430 = null;
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method3068(byte arg0) {
        field7443 = null;
        field7441 = null;
        if (arg0 != 76) {
            method3068((byte) 7);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
    public class513(int arg0) {
        this.field7435 = arg0;
    }

    static {
        new class335("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field7441 = new class493(3, 11);
        field7442 = -1;
        field7443 = new class194(5000);
    }
}
