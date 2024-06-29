import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class170 extends class304 {

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "[I")
    public static int[] field2745 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Lqi;")
    public static class257 field2743 = new class257();

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field2753 = 0;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field2756 = "wave:";

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field2757 = null;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "Lec;")
    public static class99 field2752 = new class99(20);

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "[S")
    public static short[] field2758 = new short[256];

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "Lrl;")
    public static class329 field2755;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Ljd;")
    public static class95 field2741;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "Ljava/awt/Frame;")
    public static Frame field2747;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "[Lrj;")
    public static class269[] field2754;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 6)
    public class170() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 11)
    public static final void method1284(Component arg0, int arg1) {
        arg0.addMouseListener(class209.field3195);
        arg0.addMouseMotionListener(class209.field3195);
        arg0.addFocusListener(class209.field3195);
        field2751++;
        if (arg1 != 10151) {
            field2755 = (class329) null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            return (int[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        field2742++;
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1, 0, (byte) 112);
            for (int var5 = 0; var5 < class218.field3333; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lan;", line = 59)
    public static final class12 method1285(Throwable arg0, String arg1) {
        field2750++;
        class12 var2;
        if ((arg0 instanceof class12)) {
            var2 = (class12) arg0;
            var2.field159 = var2.field159 + ' ' + arg1;
        } else {
            var2 = new class12(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)J", line = 80)
    public static final long method1286(byte arg0) {
        if (arg0 != -26) {
            field2752 = (class99) null;
        }
        field2744++;
        return class49.field670.method193((byte) -65);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lwm;II)V", line = 94)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg2 == -2828) {
            field2746++;
            if (arg1 == 0) {
                this.field4652 = arg0.method1774((byte) 22) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)[[I", line = 108)
    public final int[][] method75(int arg0, int arg1) {
        field2748++;
        if (arg1 != 0) {
            this.method69((class254) null, -43, -29);
        }
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[][] var4 = this.method2082(0, (byte) -116, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class218.field3333; var11++) {
                var10[var11] = 4096 - var5[var11];
                var8[var11] = 4096 - var6[var11];
                var9[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V", line = 157)
    public static void method1287(int arg0) {
        field2754 = null;
        field2752 = null;
        field2747 = null;
        field2756 = null;
        field2758 = null;
        field2743 = null;
        field2755 = null;
        if (arg0 != 2) {
            method1287(94);
        }
        field2741 = null;
        field2745 = null;
        field2757 = null;
    }
}
