import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class236 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field3732 = -1;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public int field3736 = 0;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Z")
    public boolean field3737 = true;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public int field3738 = -1;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3730 = null;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3728;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILig;II)V")
    private final void method1563(int arg0, class136 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3736 = class44.method378((byte) -39, arg1.method1009(116));
        } else if (arg3 == 2) {
            this.field3738 = arg1.method1012(arg0 ^ 0xFFFFA7E4);
        } else if (arg3 == 3) {
            this.field3738 = arg1.method996(arg0 + 87840);
            if (this.field3738 == 65535) {
                this.field3738 = -1;
            }
        } else if (arg3 == 5) {
            this.field3737 = false;
        } else if (arg3 == 7) {
            this.field3732 = class44.method378((byte) -39, arg1.method1009(112));
        } else if (arg3 == 8) {
            class288.field4605 = arg2;
        } else if (arg3 == 9) {
            arg1.method996(65280);
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg1.method1012(4);
            } else if (arg3 != 12) {
                if (arg3 == 13) {
                    arg1.method1009(108);
                } else if (arg3 == 14) {
                    arg1.method1012(4);
                }
            }
        }
        field3729++;
        if (arg0 != -22560) {
            this.field3738 = 120;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILig;I)V")
    public final void method1564(int arg0, class136 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1012(arg2 + 5);
            if (var4 == 0) {
                field3731++;
                if (arg2 != -1) {
                    this.method1564(5, (class136) null, 1);
                    return;
                }
                return;
            }
            this.method1563(-22560, arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILsb;II)Lbf;")
    public static final class102 method1565(int arg0, class124 arg1, int arg2, int arg3) {
        if (arg2 == -10) {
            field3734++;
            return class113.method833(arg0, arg1, arg3, arg2 + 84) ? class153.method1110(18975) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method1566(int arg0) {
        if (arg0 == 9881) {
            field3730 = null;
            field3728 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1567(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class129.field2127 = arg1;
        class130.field2161 = arg2;
        class194.field3178 = arg3;
        class9.field127 = new class129[arg0][class129.field2127][class130.field2161];
        class161.field2627 = new int[arg0][class129.field2127 + 1][class130.field2161 + 1];
        if (arg4) {
            class5.field61 = new class129[1][class129.field2127][class130.field2161];
            class14.field209 = new int[class129.field2127][class130.field2161];
            class266.field4251 = new int[1][class129.field2127 + 1][class130.field2161 + 1];
        } else {
            class5.field61 = null;
            class14.field209 = null;
            class266.field4251 = null;
        }
        class161.method1170(false);
        class193.field3164 = new class228[500];
        class272.field4349 = 0;
        class179.field2971 = new class228[500];
        class226.field3601 = 0;
        class76.field1253 = new int[arg0][class129.field2127 + 1][class130.field2161 + 1];
        class195.field3194 = new class190[5000];
        class150.field2462 = 0;
        class7.field89 = new class190[100];
        class21.field324 = new boolean[class194.field3178 + class194.field3178 + 1][class194.field3178 + class194.field3178 + 1];
        class174.field2924 = new boolean[class194.field3178 + class194.field3178 + 2][class194.field3178 + class194.field3178 + 2];
        class273.field4356 = new byte[arg0][class129.field2127][class130.field2161];
    }
}
