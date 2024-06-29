import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class class71 {

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Lmg;")
    public static class530 field1020 = new class530();

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Lqh;")
    public static class230 field1021 = class116.method863(false);

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field1023 = -1;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "[F")
    public static float[] field1022 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZII)V", line = 3)
    public static final void method568(boolean arg0, boolean arg1, int arg2, int arg3) {
        field1025++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        } else if (!arg1) {
            class372.field5342 = arg2;
            class506.field7397 = arg3;
            class163.field2472 = arg0;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 25)
    public static final String method569(int arg0, long arg1) {
        if (arg0 != 11854) {
            return null;
        }
        field1019++;
        class454.field6636.setTime(new Date(arg1));
        int var3 = class454.field6636.get(7);
        int var4 = class454.field6636.get(5);
        int var5 = class454.field6636.get(2);
        int var6 = class454.field6636.get(1);
        int var7 = class454.field6636.get(11);
        int var8 = class454.field6636.get(12);
        int var9 = class454.field6636.get(13);
        return class36.field551[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class454.field6640[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 58)
    public static void method570(int arg0) {
        if (arg0 != 10) {
            method570(47);
        }
        field1020 = null;
        field1021 = null;
        field1022 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)I")
    public abstract int method151(byte arg0, int arg1);

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)J")
    public abstract long method153(int arg0);
}
