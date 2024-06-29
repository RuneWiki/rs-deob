import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class225 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public static int[] field3779 = new int[128];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method1536(byte arg0) {
        field3779 = null;
        if (arg0 > -103) {
            field3779 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public static final void method1537(byte arg0) {
        field3781++;
        if (arg0 == -101 && class178.field2970 == 5) {
            class178.field2970 = 6;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZB)V")
    public static final void method1538(boolean arg0, byte arg1) {
        if (arg1 != 81) {
            method1538(false, (byte) 79);
        }
        class244.method1665(0);
        field3778++;
        if (class25.field537 != 30 && class25.field537 != 25) {
            return;
        }
        class205.field3404++;
        if (class205.field3404 < 50 && !arg0) {
            return;
        }
        class205.field3404 = 0;
        if (!class122.field2149 && class148.field2547 != null) {
            class221.field3705++;
            class190.field3141.method1598((byte) -126, 155);
            try {
                class148.field2547.method632(0, class190.field3141.field3633, class190.field3141.field3581, true);
                class190.field3141.field3581 = 0;
            } catch (IOException var2) {
                class122.field2149 = true;
            }
        }
        class244.method1665(0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lda;BI)Lnf;")
    public static final class213 method1539(class22 arg0, byte arg1, int arg2) {
        byte[] var3 = arg0.method183(true, arg2);
        field3780++;
        if (var3 == null) {
            return null;
        } else if (arg1 == -113) {
            return new class213(var3);
        } else {
            return null;
        }
    }
}
