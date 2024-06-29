import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class350 extends class744 {

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public static int field4448 = 0;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "Lqk;")
    public static class148 field4452 = new class148(11, 6);

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "[B")
    private byte[] field4449;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V")
    public static final void method1993(int arg0) {
        field4451++;
        if (arg0 != 26779) {
            field4452 = null;
        }
        if (class510.field7114 != null) {
            class510.field7114.method3139((byte) 104);
        }
        if (class435.field5966 != null) {
            class435.field5966.method3139((byte) 80);
        }
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)V")
    public static void method1994(int arg0) {
        if (arg0 != -7483) {
            field4448 = 87;
        }
        field4452 = null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(IIII)[B")
    public final byte[] method1995(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 102) {
            return null;
        } else {
            field4450++;
            this.field4449 = new byte[arg1 * 2 * arg0 * arg2];
            this.method1217(122, arg1, arg2, arg0);
            return this.field4449;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)V")
    public final void method1074(int arg0, int arg1, byte arg2) {
        if (arg1 != 4096) {
            this.field4449 = null;
        }
        field4453++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4449[var10001] = (byte) (var5 * 3 >> 5);
        this.field4449[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
    public class350() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
