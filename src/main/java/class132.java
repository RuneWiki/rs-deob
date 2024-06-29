import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 implements Runnable {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Z")
    public boolean field3024 = true;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field3025 = new Object();

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public int field3030 = 0;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "[I")
    public int[] field3029 = new int[500];

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
    public int[] field3032 = new int[500];

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lwc;")
    public static class156 field3031 = new class156(4096);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lec;")
    public static class32 field3037 = class73.method594("null", true);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Ltb;")
    public static class134 field3034;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lde;")
    public static class27 field3033;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "[I")
    public static int[] field3036;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[Lhb;")
    public static class51[] field3038;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBZZZ)Lga;")
    public static final class44 method1009(int arg0, byte arg1, boolean arg2, boolean arg3, boolean arg4) {
        field3026++;
        if (arg1 < 118) {
            return null;
        }
        class134 var5 = null;
        if (class44.field1033 != null) {
            var5 = new class134(arg0, class44.field1033, class118.field2834[arg0], 1000000);
        }
        return new class44(var5, field3034, arg0, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lf;B)V")
    public static final void method1010(class36 arg0, byte arg1) {
        if (class30.field563 == arg0.field841) {
            class145.field3299[arg0.field824] = true;
        }
        field3027++;
        if (arg1 > -99) {
            field3036 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
    public final void run() {
        field3023++;
        while (this.field3024) {
            Object var1 = this.field3025;
            synchronized (this.field3025) {
                if (this.field3030 < 500) {
                    this.field3029[this.field3030] = class86.field2002;
                    this.field3032[this.field3030] = class140.field3218;
                    this.field3030++;
                }
            }
            class54.method427(50L, -27166);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method1011(int arg0) {
        if (class38.field920 != null) {
            class80 var1 = class38.field920;
            synchronized (class38.field920) {
                class38.field920 = null;
            }
        }
        if (arg0 >= 16) {
            field3028++;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static void method1012(boolean arg0) {
        if (arg0) {
            field3033 = null;
        }
        field3033 = null;
        field3031 = null;
        field3036 = null;
        field3038 = null;
        field3037 = null;
        field3034 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILjava/awt/Component;I)Lgf;")
    public static final class48 method1013(int arg0, int arg1, Component arg2, int arg3) {
        int var4 = 83 / ((-arg3 - 48) / 52);
        field3022++;
        try {
            Class var5 = Class.forName("ca");
            class48 var6 = (class48) var5.getDeclaredConstructor().newInstance();
            var6.method123(-33, arg0, arg1, arg2);
            return var6;
        } catch (Throwable var8) {
            class43 var7 = new class43();
            var7.method123(-96, arg0, arg1, arg2);
            return var7;
        }
    }
}
