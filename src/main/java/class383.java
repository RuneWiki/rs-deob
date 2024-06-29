import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class383 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field5592;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lbj;")
    public static class162 field5594 = new class162(78, 2);

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Ls;")
    public static class186 field5596 = new class186(37, 2);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Ls;")
    public static class186 field5602 = new class186(93, 4);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lvp;")
    public static class126 field5603;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lph;")
    public static class459 field5597;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
    public static int[] field5600;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[[[J")
    public static long[][][] field5598;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 8)
    public static void method2355(int arg0) {
        field5597 = null;
        field5596 = null;
        field5594 = null;
        field5600 = null;
        field5602 = null;
        int var1 = 74 / ((-arg0 - 18) / 56);
        field5598 = null;
        field5603 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)I", line = 23)
    public static final int method2356(int arg0, int arg1, boolean arg2) {
        field5591++;
        if (arg2) {
            method2357((byte) -30);
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z", line = 45)
    public static final boolean method2357(byte arg0) {
        field5593++;
        int var1 = -67 / ((arg0 - 40) / 58);
        if (class407.field6166) {
            try {
                class227.method1509(class497.field7305.field7072, "showVideoAd", 29436);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "toString", descriptor = "()Ljava/lang/String;", line = 68)
    public final String toString() {
        field5595++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 78)
    public class383(String arg0, int arg1) {
        this.field5592 = arg1;
    }
}
