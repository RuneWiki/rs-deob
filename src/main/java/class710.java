import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class710 implements class657 {

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "Ljf;")
    private class217 field9917;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public int field9909;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "[I")
    public int[] field9910;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public int field9914;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "Luh;")
    private class168 field9908;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "[F")
    public float[] field9913;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field9915 = 0;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "Lkba;")
    public static class108 field9911 = new class108();

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "Lvea;")
    public static class276 field9918 = new class276(8, 0, 4, 1);

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIIIIIZZ)V", line = 3)
    public final void method3450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class536.method2954(this.field9917.field2622.field10433, arg6 ? this.field9917.field2622.field10438 : null, arg1, arg0, arg2, arg7 ? this.field9913 : null, arg5, this.field9910, arg3, arg4, arg7 ? this.field9917.field2632 : null, this.field9909, 0);
        field9912++;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 17)
    public static void method3984(int arg0) {
        field9911 = null;
        if (arg0 != -20830) {
            field9907 = 49;
        }
        field9918 = null;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(IIIIIIZZ)V", line = 38)
    public final void method3453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field9916++;
        class536.method2954(this.field9909, arg6 ? this.field9910 : null, arg1, arg0, arg2, arg7 ? this.field9917.field2632 : null, arg5, this.field9917.field2622.field10438, arg3, arg4, arg7 ? this.field9913 : null, this.field9917.field2622.field10433, 0);
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Ljf;Lufa;Luh;)V", line = 49)
    public class710(class217 arg0, class680 arg1, class168 arg2) {
        this.field9917 = arg0;
        if ((arg1 instanceof class613)) {
            class613 var5 = (class613) arg1;
            this.field9914 = var5.field8405;
            this.field9910 = var5.field8595;
            this.field9909 = var5.field8384;
        } else if ((arg1 instanceof class177)) {
            class177 var4 = (class177) arg1;
            this.field9909 = var4.field8384;
            this.field9910 = var4.field2180;
            this.field9914 = var4.field8405;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field9908 = arg2;
            if (this.field9908.field2103 != this.field9909 || this.field9908.field2102 != this.field9914) {
                throw new RuntimeException();
            }
            this.field9913 = this.field9908.field2104;
        }
    }
}
