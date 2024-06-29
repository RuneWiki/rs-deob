import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class198 extends class33 {

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    private int field2702;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    private int field2694;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    private int field2692;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    private int field2695;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    private int field2700;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Lij;")
    private class424 field2697;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lal;")
    public static class102 field2703 = new class102("game3", 2);

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field2704 = 1403;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "D")
    public static double field2705;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lnn;")
    private class418 field2693;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lnd;I)V", line = 5)
    public static final void method1307(class547 arg0, int arg1) {
        field2698++;
        class693.field9628 = arg0.method3161((byte) -102, "hitmarks");
        class760.field10601 = arg0.method3161((byte) -76, "hitbar_default");
        class556.field7742 = arg0.method3161((byte) -74, "timerbar_default");
        class577.field8097 = arg0.method3161((byte) -92, "headicons_pk");
        class745.field10379 = arg0.method3161((byte) -109, "headicons_prayer");
        class26.field473 = arg0.method3161((byte) -126, "hint_headicons");
        class416.field5304 = arg0.method3161((byte) -92, "hint_mapmarkers");
        class74.field1054 = arg0.method3161((byte) -42, "mapflag");
        class58.field797 = arg0.method3161((byte) -35, "cross");
        class151.field2084 = arg0.method3161((byte) -60, "mapdots");
        class19.field348 = arg0.method3161((byte) -74, "scrollbar");
        class39.field605 = arg0.method3161((byte) -65, "name_icons");
        class532.field7390 = arg0.method3161((byte) -101, "floorshadows");
        class443.field5880 = arg0.method3161((byte) -88, "compass");
        class172.field2378 = arg0.method3161((byte) -49, "otherlevel");
        if (arg1 == 0) {
            class121.field1754 = arg0.method3161((byte) -70, "hint_mapedge");
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Lnn;", line = 31)
    public final class418 method220(byte arg0) {
        field2699++;
        if (this.field2693 == null) {
            class153 var2 = this.field2697.field830;
            class506.field7144[2] = this.field2700;
            class506.field7144[0] = this.field2695;
            class506.field7144[4] = this.field2694;
            class506.field7144[5] = this.field2692;
            class506.field7144[3] = this.field2702;
            class506.field7144[1] = this.field2696;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1071((byte) 120, class506.field7144[var5])) {
                    return null;
                }
                class537 var7 = var2.method1072(class506.field7144[var5], true);
                int var8 = var7.field7460 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field7446 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class403.field5103[var6] = var2.method1069(var4, class506.field7144[var6], false, var4, 1.0F, 6766);
            }
            this.field2693 = this.field2697.method2034(var4, var3, -9866, class403.field5103);
        }
        if (arg0 < 66) {
            method1307(null, -101);
        }
        return this.field2693;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZB)V", line = 94)
    public static final void method1308(boolean arg0, byte arg1) {
        if (arg1 != 29) {
            field2704 = -98;
        }
        field2701++;
        class14.method102(true);
        if (!class102.method816(class27.field484, (byte) 127)) {
            return;
        }
        class688.field9586++;
        if (class688.field9586 < 50 && !arg0) {
            return;
        }
        class688.field9586 = 0;
        if (!class459.field6127 && class12.field143 != null) {
            class367.field4729++;
            class589 var2 = class514.method2994(-29488, class760.field10605, class393.field4991);
            class737.method4107(var2, 7);
            try {
                class402.method2242((byte) 18);
            } catch (IOException var3) {
                class459.field6127 = true;
            }
        }
        class14.method102(true);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 134)
    public static void method1309(int arg0) {
        field2703 = null;
        if (arg0 != 31462) {
            method1307(null, -72);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lij;IIIIII)V", line = 146)
    public class198(class424 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2696 = arg2;
        this.field2702 = arg4;
        this.field2694 = arg5;
        this.field2692 = arg6;
        this.field2695 = arg1;
        this.field2700 = arg3;
        this.field2697 = arg0;
    }
}
