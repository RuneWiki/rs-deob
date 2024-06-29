import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class259 {

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public int field4364 = 0;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Z")
    public boolean field4367 = false;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public int field4369 = 0;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
    public static int[] field4363 = new int[99];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lhi;")
    public static class26 field4368;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lcb;")
    public class34 field4366;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4362;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4363[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([Lmh;[SI)V", line = 28)
    public static final void method1802(class62[] arg0, short[] arg1, int arg2) {
        class97.method783(arg0, arg2, arg0.length - 1, 0, arg1);
        field4365++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 40)
    public static void method1803(int arg0) {
        if (arg0 != 0) {
            method1802((class62[]) null, (short[]) null, 123);
        }
        field4368 = null;
        field4363 = null;
    }
}
