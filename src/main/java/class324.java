import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class324 {

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field4706 = 0;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "[Lhg;")
    public static class471[] field4707;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method2007(int arg0) {
        field4705++;
        if (arg0 > -47) {
            field4710 = 4;
        }
        return class132.field1919 == this | class302.field4477 == this;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IJ)V", line = 31)
    public static final void method2008(int arg0, long arg1) {
        field4708++;
        int var3 = class475.field6814;
        if (class677.field9587 != var3) {
            int var4 = var3 - class677.field9587;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class677.field9587 += var5;
        }
        int var6 = class35.field550;
        if (class502.field7101 != var6) {
            int var7 = var6 - class502.field7101;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class502.field7101 += var8;
        }
        if (!class335.field4872.field9499) {
            class311.field4589 += (float) arg1 * class682.field9632 / 40.0F * 8.0F;
            class528.field7602 += (float) arg1 * class457.field6595 / 40.0F * 8.0F;
        }
        class375.method2316((byte) 86);
        if (arg0 != 0) {
            field4707 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "toString", descriptor = "()Ljava/lang/String;", line = 115)
    public final String toString() {
        field4709++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V", line = 123)
    public static void method2009(byte arg0) {
        field4707 = null;
        if (arg0 >= -99) {
            method2008(-90, 75L);
        }
    }
}
