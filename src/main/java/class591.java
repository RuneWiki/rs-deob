import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class591 implements class649 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Lqk;")
    private class156 field7493;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "[I")
    public int[] field7492;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field7491;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field7495;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "Loh;")
    private class711 field7500;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "[F")
    public float[] field7499;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Z")
    public static boolean field7497 = false;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(JI)V", line = 4)
    public static final void method3181(long arg0, int arg1) {
        field7496++;
        if (arg1 != 0 || arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class437.method2503(27090, arg0 - 1L);
            class437.method2503(27090, 1L);
        } else {
            class437.method2503(27090, arg0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIIZZ)V", line = 34)
    public final void method3182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field7498++;
        class762.method4154(arg0, arg7 ? this.field7499 : null, arg1, arg4, arg2, this.field7493.field1983.field3467, this.field7495, arg6 ? this.field7492 : null, arg7 ? this.field7493.field2025 : null, arg3, arg5, -1, this.field7493.field1983.field3468);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(IIIIIIZZ)V", line = 45)
    public final void method3183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field7494++;
        class762.method4154(arg0, arg7 ? this.field7493.field2025 : null, arg1, arg4, arg2, this.field7492, this.field7493.field1983.field3468, arg6 ? this.field7493.field1983.field3467 : null, arg7 ? this.field7499 : null, arg3, arg5, -1, this.field7495);
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lqk;Lpu;Loh;)V", line = 54)
    public class591(class156 arg0, class772 arg1, class711 arg2) {
        this.field7493 = arg0;
        if ((arg1 instanceof class360)) {
            class360 var5 = (class360) arg1;
            this.field7492 = var5.field4388;
            this.field7491 = var5.field8163;
            this.field7495 = var5.field8160;
        } else if ((arg1 instanceof class782)) {
            class782 var4 = (class782) arg1;
            this.field7492 = var4.field10705;
            this.field7491 = var4.field8163;
            this.field7495 = var4.field8160;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field7500 = arg2;
            if (this.field7500.field9390 != this.field7495 || this.field7500.field9387 != this.field7491) {
                throw new RuntimeException();
            }
            this.field7499 = this.field7500.field9391;
        }
    }
}
