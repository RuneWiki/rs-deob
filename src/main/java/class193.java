import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class193 {

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lfa;")
    private class156 field2816 = new class156(16);

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lfs;")
    private class387 field2811;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field2815 = 2;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2808 = new String[5];

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lfs;")
    public static class387 field2807;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lfs;")
    public static class387 field2812;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field2814;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public final void method1350(byte arg0) {
        if (arg0 <= 21) {
            return;
        }
        field2819++;
        class156 var2 = this.field2816;
        synchronized (this.field2816) {
            this.field2816.method1105(false);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1351(int arg0) {
        field2808 = null;
        field2807 = null;
        field2812 = null;
        field2814 = null;
        if (arg0 >= -45) {
            field2810 = 33;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public final void method1352(int arg0) {
        if (arg0 != 2) {
            field2813 = 80;
        }
        field2818++;
        class156 var2 = this.field2816;
        synchronized (this.field2816) {
            this.field2816.method1119(arg0 ^ 0x7A);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)Lii;")
    public static final class386 method1353(int arg0, int arg1, int arg2) {
        class148 var3 = class422.field6240[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2085;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)V")
    public final void method1354(byte arg0, int arg1) {
        class156 var3 = this.field2816;
        synchronized (this.field2816) {
            this.field2816.method1116(arg1, -50);
        }
        field2809++;
        if (arg0 != 37) {
            field2810 = 54;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Leb;")
    public final class439 method1355(int arg0, int arg1) {
        field2817++;
        class156 var3 = this.field2816;
        class439 var4;
        synchronized (this.field2816) {
            var4 = (class439) this.field2816.method1115((long) arg1, (byte) 58);
        }
        if (arg0 != -8321) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field2811.method2363(arg1, 30, 120);
            class439 var6 = new class439();
            if (var5 != null) {
                var6.method2685(new class65(var5), (byte) -19);
            }
            class156 var7 = this.field2816;
            synchronized (this.field2816) {
                this.field2816.method1107(1, (long) arg1, var6);
                return var6;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class193(class446 arg0, int arg1, class387 arg2) {
        this.field2811 = arg2;
        this.field2811.method2367(30, 28724);
    }
}
