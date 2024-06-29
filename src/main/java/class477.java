import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class477 {

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public static int field6857 = 7000;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "Z")
    public static boolean field6864 = false;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public int field6852;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public int field6853;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public int field6854;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public int field6859;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public int field6861;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public int field6862;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "J")
    public static long field6860;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "[B")
    public byte[] field6858;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "[B")
    public byte[] field6863;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2902(String arg0, byte arg1) {
        if (arg1 != -78) {
            field6857 = 63;
        }
        class428.method2605("", "", "", 0, 0, 4096, arg0);
        field6856++;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIII)V")
    public static final void method2903(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class125.field2257 != null) {
            class125.field2257[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class177.field2893 != null) {
            class177.field2893[arg0][arg1] = (short) arg3;
        }
        if (class6.field501 != null) {
            class6.field501[arg0][arg1] = (byte) arg4;
        }
    }
}
