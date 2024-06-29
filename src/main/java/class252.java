import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class class252 {

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public int field3448;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field3445 = 0;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII)V")
    public abstract void method380(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIII)V")
    public static final void method1402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3446++;
        int var9 = arg5 + 1;
        class296.method1740(arg4, class153.field1932[arg5], (byte) 81, arg3, arg0);
        int var8 = arg1 - 1;
        class296.method1740(arg4, class153.field1932[arg1], (byte) 81, arg3, arg0);
        if (arg2 != 0) {
            field3445 = 12;
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class153.field1932[var6];
            var7[arg4] = var7[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static final void method1403(int arg0) {
        if (arg0 <= 56) {
            method1404((byte) -81);
        }
        field3443++;
        class88.field995.method613(true);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
    public abstract void method378(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V")
    public abstract void method377(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public static final void method1404(byte arg0) {
        field3444++;
        int var1 = 80 % ((-arg0 - 2) / 61);
        class114 var2 = class374.field5258;
        synchronized (class374.field5258) {
            class374.field5258.method606((byte) 103);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(III)V")
    public class252(int arg0, int arg1, int arg2) {
        this.field3447 = arg1;
        this.field3450 = arg0;
        this.field3448 = arg2;
    }
}
