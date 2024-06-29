import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class451 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "J")
    public long field6727;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lad;")
    private class362 field6728;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Lfea;")
    public static class123 field6730 = new class123();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[[B")
    public static byte[][] field6731;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method2787(int arg0) {
        if (arg0 < -82) {
            field6730 = null;
            field6731 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6729++;
        this.field6728.method2292((byte) 14, this.field6727);
        super.finalize();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lrt;Z)V")
    public static final void method2788(class194 arg0, boolean arg1) {
        field6732++;
        byte[] var2 = new byte[24];
        if (class27.field287 != null) {
            try {
                class27.field287.method1665(0, 0L);
                class27.field287.method1664(88, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (!arg1) {
            field6733 = 30;
        }
        arg0.method1198(255, 24, var2, 0);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lad;JI)V")
    public class451(class362 arg0, long arg1, int arg2) {
        this.field6727 = arg1;
        this.field6728 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(JB)V")
    public static final void method2789(long arg0, byte arg1) {
        class468.field6960.field2610 = 0;
        field6734++;
        class468.field6960.method1205((byte) -69, class129.field1609.field9114);
        class468.field6960.method1206(arg0, 4);
        class468.field6960.method1205((byte) -69, class35.field396);
        class489.field7134 = 0;
        if (arg1 >= -83) {
            field6733 = 55;
        }
        class572.field8266 = 0;
        class360.field5099 = 1;
        class523.field7601 = -3;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public static final void method2790(int arg0, int arg1) {
        field6726++;
        class59.field682 = -1;
        class212.field2909 = -1;
        class421.field6299 = arg1;
        if (arg0 == -11900) {
            class171.method986((byte) 31);
        }
    }
}
