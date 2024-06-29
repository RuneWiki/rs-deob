import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public abstract class class599 {

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "Lsv;")
    public static class570 field8542 = new class570(8, 8);

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Ljava/lang/String;")
    public static String field8546 = "";

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "Lin;")
    public static class380 field8545 = new class380(130, 8);

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "Llo;")
    public static class451 field8548 = new class451();

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "[Lrc;")
    public static class183[] field8550 = new class183[100];

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public int field8544;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "Ljava/lang/String;")
    public String field8543;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILha;)V")
    public static final void method3489(int arg0, class475 arg1) {
        if (arg0 != -1) {
            method3489(-46, null);
        }
        for (class187 var2 = (class187) class546.field7568.method1730((byte) 104); var2 != null; var2 = (class187) class546.field7568.method1729((byte) 100)) {
            if (var2.field2826) {
                var2.method1348(arg1);
            }
        }
        field8539++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method3490(byte arg0) throws IOException {
        field8538++;
        return arg0 == 123 ? new Socket(this.field8543, this.field8544) : null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1861(int arg0) throws IOException;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)I")
    public static final int method3491(byte arg0) {
        if (arg0 <= 99) {
            field8547 = -128;
        }
        field8541++;
        if (class766.field10586 == null) {
            if (!class383.field5382 && class493.field6765 != null) {
                return class493.field6765.field7696;
            }
            int var1 = class754.field10496.method3065(-28062);
            int var2 = class754.field10496.method3066(72);
            if (class791.field10833) {
                if (var1 > class295.field4297 && (class414.field5678 + class295.field4297) > var1) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class81.field1197; var4++) {
                        if (class233.field3393) {
                            int var9 = var4 * 16 + class389.field5438 + 33;
                            if (var2 > var9 - 13 && var9 + 3 >= var2) {
                                var3 = var4;
                            }
                        } else {
                            int var8 = class389.field5438 + (var4 * 16) + 31;
                            if (var2 > var8 - 13 && var2 <= var8 + 3) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class652 var6 = new class652(class496.field6807);
                        for (class551 var7 = (class551) var6.method3671(0); var7 != null; var7 = (class551) var6.method3672(0)) {
                            if (var3 == var5++) {
                                return ((class554) var7.field7645.field332.field6213).field7696;
                            }
                        }
                    }
                } else if (class346.field4933 != null && var1 > class653.field9248 && (class653.field9248 + class362.field5138) > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class346.field4933.field7643; var11++) {
                        if (class233.field3393) {
                            int var16 = var11 * 16 + class541.field7494 + 33;
                            if (var2 > (var16 - 13) && var2 <= (var16 + 3)) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = class541.field7494 - (-(var11 * 16) - 31);
                            if (var2 > (var15 - 13) && var15 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class652 var13 = new class652(class346.field4933.field7645);
                        for (class554 var14 = (class554) var13.method3671(0); var14 != null; var14 = (class554) var13.method3672(0)) {
                            if (var10 == var12++) {
                                return var14.field7696;
                            }
                        }
                    }
                }
            } else if (class295.field4297 < var1 && var1 < (class414.field5678 + class295.field4297)) {
                int var17 = -1;
                for (int var18 = 0; var18 < class624.field8863; var18++) {
                    if (class233.field3393) {
                        int var22 = (class624.field8863 - var18 - 1) * 16 + class389.field5438 + 33;
                        if ((var22 - 13) < var2 && var2 <= (var22 + 3)) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = (class624.field8863 - var18 - 1) * 16 + (class389.field5438 + 31);
                        if (var23 - 13 < var2 && var2 <= var23 + 3) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class710 var20 = new class710(class521.field7310);
                    for (class554 var21 = (class554) var20.method3958(93); var21 != null; var21 = (class554) var20.method3957(-126)) {
                        if (var17 == var19++) {
                            return var21.field7696;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public static void method3492(int arg0) {
        field8545 = null;
        field8548 = null;
        field8542 = null;
        field8550 = null;
        if (arg0 == 33) {
            field8546 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method3493(String arg0, boolean arg1, boolean arg2) {
        field8540++;
        class221.method1520(arg2, arg0, -1, -65, -1);
        if (arg1) {
            method3489(-101, null);
        }
    }
}
