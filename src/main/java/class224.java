import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class224 implements Runnable {

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Z")
    public boolean field3771 = true;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field3768 = new Object();

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
    public int[] field3775 = new int[500];

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[I")
    public int[] field3776 = new int[500];

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public int field3777 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3766 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3765 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[Lij;")
    public static class50[] field3764 = new class50[200];

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3773 = 100;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lda;")
    public static class22 field3770;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)I")
    public static final int method1534(int arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        if (arg0 != 0) {
            field3770 = null;
        }
        field3767++;
        return arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method1535(int arg0) {
        field3770 = null;
        field3764 = null;
        if (arg0 != -28306) {
            field3764 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3771) {
            Object var1 = this.field3768;
            synchronized (this.field3768) {
                if (this.field3777 < 500) {
                    this.field3775[this.field3777] = class69.field1297;
                    this.field3776[this.field3777] = class173.field2904;
                    this.field3777++;
                }
            }
            class162.method1137(122, 50L);
        }
        field3774++;
    }
}
