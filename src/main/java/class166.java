import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class166 extends class385 {

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field2346 = 0;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "Llf;")
    public static class157 field2348 = new class157("runescape", 0);

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "F")
    public static float field2350;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "[B")
    private byte[] field2349;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(BII)V")
    public final void method1026(byte arg0, int arg1, int arg2) {
        field2351++;
        int var4 = arg2 * 2;
        int var5 = arg0 & 0xFF;
        if (arg1 != 100) {
            this.field2349 = null;
        }
        this.field2349[var4++] = (byte) (var5 * 3 >> 5);
        this.field2349[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class166() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1027(int arg0, int arg1, int arg2, int arg3) {
        this.field2349 = new byte[arg1 * arg2 * arg3 * 2];
        if (arg0 != -87335540) {
            field2352 = 19;
        }
        field2347++;
        this.method1674(arg2, (byte) 124, arg1, arg3);
        return this.field2349;
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(I)V")
    public static void method1028(int arg0) {
        field2348 = null;
        if (arg0 != 0) {
            method1029();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
    public static final void method1029() {
        if (class22.field358 != null) {
            for (int var0 = 0; var0 < class22.field358.length; var0++) {
                for (int var1 = 0; var1 < class469.field6860; var1++) {
                    for (int var2 = 0; var2 < class472.field6900; var2++) {
                        if (class22.field358[var0][var1][var2] != null) {
                            class22.field358[var0][var1][var2].method389(5);
                        }
                        class22.field358[var0][var1][var2] = null;
                    }
                }
            }
        }
        class22.field358 = null;
        class19.field195 = null;
        if (class336.field4640 != null) {
            for (int var3 = 0; var3 < class336.field4640.length; var3++) {
                for (int var4 = 0; var4 < class469.field6860; var4++) {
                    for (int var5 = 0; var5 < class472.field6900; var5++) {
                        if (class336.field4640[var3][var4][var5] != null) {
                            class336.field4640[var3][var4][var5].method389(5);
                        }
                        class336.field4640[var3][var4][var5] = null;
                    }
                }
            }
        }
        class336.field4640 = null;
        class364.field5058 = null;
        class385.field5410 = null;
        class383.field5391 = null;
        class61.field835 = 0;
        if (class300.field4131 != null) {
            for (int var6 = 0; var6 < class61.field835; var6++) {
                class300.field4131[var6] = null;
            }
        }
        if (class26.field406 != null) {
            for (int var7 = 0; var7 < class451.field6505; var7++) {
                class26.field406[var7] = null;
            }
            class451.field6505 = 0;
        }
        if (class461.field6699 != null) {
            for (int var8 = 0; var8 < class34.field482; var8++) {
                class461.field6699[var8] = null;
            }
            for (int var9 = 0; var9 < class401.field5574; var9++) {
                for (int var10 = 0; var10 < class469.field6860; var10++) {
                    for (int var11 = 0; var11 < class472.field6900; var11++) {
                        class171.field2450[var9][var10][var11] = 0L;
                    }
                }
            }
            class34.field482 = 0;
        }
        class379.field5349 = null;
        class274.method1554(true);
        class521.field7677.method2301(false);
        class393.field5478 = null;
        class453.field6629 = null;
        class171.field2451 = null;
        class210.field2984 = null;
        class246.field3427 = null;
        class344.field4741 = null;
    }

    static {
        new class83("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field2352 = 0;
        field2353 = 0;
    }
}
