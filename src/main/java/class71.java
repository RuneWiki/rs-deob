import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class71 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public int field880 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Z")
    public boolean field881 = false;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public int field886 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field882 = 0;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "J")
    public static long field887 = 0L;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lvh;")
    public static class62 field883 = new class62(4);

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[I")
    public static int[] field891 = new int[100];

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
    public static boolean field889 = false;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lan;")
    public class354 field884;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field885;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 18)
    public static void method440(byte arg0) {
        field891 = null;
        if (arg0 >= -7) {
            method440((byte) 112);
        }
        field883 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V", line = 44)
    public static final void method441(byte arg0, int arg1) {
        field888++;
        class64 var2 = (class64) class6.field67.method770((long) arg1, -109);
        if (var2 == null) {
            return;
        }
        if (arg0 > -24) {
            field891 = (int[]) null;
        }
        for (int var3 = 0; var3 < var2.field773.length; var3++) {
            var2.field773[var3] = -1;
            var2.field768[var3] = 0;
        }
    }
}
