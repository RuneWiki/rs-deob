import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class26 extends InputStream {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[[[I")
    public static int[][][] field469 = new int[2][][];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field470 = "wishes to trade with you.";

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[S")
    public static short[] field478 = new short[500];

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[Lwk;")
    public static class294[] field472 = new class294[14];

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILgi;Z)[Lrk;")
    public static final class292[] method203(int arg0, int arg1, class164 arg2, boolean arg3) {
        field475++;
        if (arg3) {
            field472 = null;
        }
        return class284.method1927(arg1, (byte) -78, arg0, arg2) ? class120.method825((byte) 100) : null;
    }

    @OriginalMember(owner = "client!gh", name = "read", descriptor = "()I")
    public final int read() {
        class33.method250(30000L, 256);
        field473++;
        return -1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII)V")
    public static final void method204(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field477++;
            class291 var3 = class61.method389(arg1, 13, 0);
            var3.method2009(-114);
            var3.field4763 = arg2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIIII)V")
    public static final void method205(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field468 == 1) {
            class102.field1620[class115.field1750 / 100].method451(class40.field610 - 8, class224.field3521 + -8);
        }
        if (field468 == 2) {
            class102.field1620[class115.field1750 / 100 + 4].method451(class40.field610 - 8, class224.field3521 + -8);
        }
        if (arg0 != -104) {
            field469 = null;
        }
        field479++;
        class27.method211(-451202265);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method206(byte arg0) {
        field469 = null;
        field470 = null;
        if (arg0 == 20) {
            field478 = null;
            field472 = null;
        }
    }
}
