import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class571 {

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public int field7888 = 8;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public int field7891 = 16777215;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "[F")
    public static float[] field7885 = new float[4];

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "Lkr;")
    public static class602 field7880 = new class602(87, 1);

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "Lkr;")
    public static class602 field7895 = new class602(81, 0);

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "Z")
    public static boolean field7897 = false;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public int field7884;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public int field7886;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public int field7887;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
    public int field7890;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
    public int field7894;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "Z")
    public boolean field7882;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "[I")
    public static int[] field7883;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V", line = 4)
    public static void method3347(int arg0) {
        field7895 = null;
        field7885 = null;
        field7880 = null;
        if (arg0 != 2) {
            field7880 = null;
        }
        field7883 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BLdc;)V", line = 20)
    public final void method3348(byte arg0, class63 arg1) {
        field7881++;
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                if (arg0 > -126) {
                    this.field7891 = 3;
                    return;
                } else {
                    return;
                }
            }
            this.method3350(-6, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILjava/awt/Canvas;Ld;Z)Lha;", line = 41)
    public static final class548 method3349(int arg0, int arg1, Canvas arg2, class270 arg3, boolean arg4) {
        if (arg4) {
            field7897 = true;
        }
        field7893++;
        return new class276(arg2, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILdc;)V", line = 58)
    private final void method3350(int arg0, int arg1, class63 arg2) {
        field7889++;
        if (arg0 != -6) {
            method3351(-25, 94, -8, 63, -117, -93, -63);
        }
        if (arg1 == 1) {
            this.field7888 = arg2.method482(-772591672);
        } else if (arg1 == 2) {
            this.field7882 = true;
        } else if (arg1 == 3) {
            this.field7886 = arg2.method496(-69);
            this.field7884 = arg2.method496(-79);
            this.field7894 = arg2.method496(-120);
        } else if (arg1 == 4) {
            this.field7890 = arg2.method505((byte) -119);
        } else if (arg1 == 5) {
            this.field7887 = arg2.method482(-772591672);
        } else if (arg1 == 6) {
            this.field7891 = arg2.method476((byte) -94);
            return;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIII)J", line = 118)
    public static final long method3351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 14301) {
            method3347(-65);
        }
        class614.field8255.clear();
        field7896++;
        class614.field8255.set(arg4, arg0, arg3, arg2, arg6, arg1);
        return class614.field8255.getTime().getTime();
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)Laea;", line = 135)
    public static final class261 method3352(boolean arg0) {
        field7892++;
        if (arg0) {
            field7895 = null;
        }
        return class149.field2066;
    }
}
