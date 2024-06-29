import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class289 extends class1 {

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4298 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!id", name = "X", descriptor = "[Ltl;")
    public static class91[] field4303 = new class91[2048];

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "[Lnl;")
    public static class472[] field4304 = new class472[14];

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "Z")
    public static boolean field4305 = false;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "Lpg;")
    public static class492 field4301 = new class492(70, -1);

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Z")
    public static boolean field4300;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "[B")
    private byte[] field4299;

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 5)
    public class289() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBI)V", line = 8)
    public final void method10(int arg0, byte arg1, int arg2) {
        field4297++;
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4299[var10001] = (byte) (var5 * 3 >> 5);
        this.field4299[var6] = (byte) (var5 * 3 >> 5);
        if (arg0 != 4096) {
            this.method1870(-40, -31, 19, -21);
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V", line = 28)
    public static void method1869(int arg0) {
        field4303 = null;
        field4301 = null;
        field4304 = null;
        int var1 = -10 % ((64 - arg0) / 37);
        field4298 = null;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(IIII)[B", line = 51)
    public final byte[] method1870(int arg0, int arg1, int arg2, int arg3) {
        field4302++;
        this.field4299 = new byte[arg2 * arg3 * 2 * arg0];
        this.method1378(arg3, arg0, -29917, arg2);
        int var5 = 35 / ((arg1 - 2) / 33);
        return this.field4299;
    }
}
