import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class375 extends class168 {

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "Liia;")
    public class89 field4807;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "Z")
    public boolean field4810;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "Z")
    public boolean field4804;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "Z")
    public boolean field4805;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "Z")
    public boolean field4806;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method2152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4809++;
        float var5 = (float) class73.field1034 / (float) class73.field1051;
        int var6 = arg1;
        int var7 = arg4;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg2 - (arg1 - var6) / 2;
        int var9 = arg0 - (arg4 - var7) / arg3;
        class557.field7751 = -1;
        class687.field9571 = class73.field1034 - (class73.field1034 * var9 / var7);
        class108.field1561 = -1;
        class756.field10543 = class73.field1051 * var8 / var6;
        class358.method2080(-127);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(ILiia;IZ)V", line = 37)
    public class375(int arg0, class89 arg1, int arg2, boolean arg3) {
        this.field4808 = arg0;
        this.field4803 = arg2;
        this.field4807 = arg1;
        this.field4810 = arg3;
    }
}
