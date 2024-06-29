import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class27 {

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "Lkb;")
    private static class93 field149 = class76.method390("Please subscribe)1 or use a different world)3", 0);

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "Lkb;")
    public static class93 field147 = field149;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "[I")
    public static int[] field148 = new int[32];

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Lkb;")
    public static class93 field146 = class76.method390("Okay", 0);

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field150 = 0;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "Lmd;")
    public static class113 field142 = new class113(32);

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "Lna;")
    public static class119 field155;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lef;")
    public static class45 field144;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        int var3 = 37 % ((arg0 - 42) / 54);
        int[][] var4 = super.field436.method537(0, arg1);
        ++field153;
        if (super.field436.field1771) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class159.field3209 < ~var8; ++var8) {
                var5[var8] = this.field140;
                var6[var8] = this.field156;
                var7[var8] = this.field145;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V")
    private class9(int arg0) {
        super(0, false);
        this.method48(arg0, (byte) 62);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IB)V")
    private final void method48(int arg0, byte arg1) {
        this.field156 = (arg0 & 65280) >> 4;
        if (arg1 == 62) {
            this.field145 = (arg0 & 255) << 4;
            ++field151;
            this.field140 = arg0 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method49(Component arg0, byte arg1) {
        arg0.removeKeyListener(class203.field3915);
        if (arg1 <= -61) {
            arg0.removeFocusListener(class203.field3915);
            class161.field3227 = -1;
            ++field152;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public static void method50(int arg0) {
        field149 = null;
        field155 = null;
        field147 = null;
        field142 = null;
        field148 = null;
        if (arg0 == -1152534036) {
            field146 = null;
            field144 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg1 == 0) {
            this.method48(arg2.method1060(255), (byte) 62);
        }
        if (arg0 <= 106) {
            field149 = null;
        }
        ++field154;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class9() {
        this(0);
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
    public static final void method51(int arg0) {
        client.field496 = new class113(32);
        ++field143;
        int var1 = -14 / ((arg0 - -63) / 63);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V")
    public static final void method52(boolean arg0) {
        class28.field456.method676(30626);
        if (!arg0) {
            field146 = null;
        }
        ++field141;
        class152.field2938.method676(30626);
        class76.field1376.method676(30626);
    }
}
