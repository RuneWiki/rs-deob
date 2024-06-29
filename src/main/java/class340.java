import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class340 extends class38 {

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "[I")
    public static int[] field5314 = new int[256];

    @OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
    public static int field5312 = 0;

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field5317 = new String[200];

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!kn", name = "F", descriptor = "Lfh;")
    public static class140 field5313;

    @OriginalMember(owner = "client!kn", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field5311;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 8)
    public static final void method2363(int arg0) {
        field5316++;
        if (!class176.field2416) {
            return;
        }
        if (arg0 != 256) {
            method2363(127);
        }
        class176.field2416 = false;
        class312.field4590 = null;
        class30.field358 = null;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V", line = 26)
    public static void method2364(int arg0) {
        field5317 = null;
        if (arg0 <= 79) {
            field5313 = (class140) null;
        }
        field5313 = null;
        field5314 = null;
        field5311 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V", line = 39)
    public static final void method2365(boolean arg0) {
        class293.field4260.method2258((byte) 86);
        if (arg0) {
            field5315++;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)J", line = 51)
    public static final long method2366(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        return var3 == null || var3.field1577 == null ? 0L : var3.field1577.field267;
    }
}
