import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class181 {

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Loc;")
    public static class151 field3278 = class137.method873(2, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field3280 = 1;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field3277 = 1;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Loc;")
    private static class151 field3272 = class137.method873(2, "Unexpected server response)3");

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static volatile int field3276 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Loc;")
    public static class151 field3270 = field3272;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field3273 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
    public static int[] field3271;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[[I")
    public static int[][] field3268;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public abstract void method50(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)I")
    public static final int method1140(int arg0, byte arg1) {
        field3269++;
        class152 var2 = class138.method880((byte) -115, arg0);
        int var3 = var2.field2755;
        int var4 = var2.field2749;
        int var5 = var2.field2747;
        int var6 = class212.field3726[var4 - var5];
        if (arg1 >= -120) {
            field3270 = null;
        }
        return var6 & class156.field2836[var3] >> var5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)V")
    public abstract void method47(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(BII)V")
    public abstract void method48(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method1141(int arg0) {
        field3270 = null;
        field3271 = null;
        field3278 = null;
        field3268 = null;
        if (arg0 > -79) {
            method1141(84);
        }
        field3272 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(III)V")
    public class181(int arg0, int arg1, int arg2) {
        this.field3275 = arg0;
        this.field3279 = arg1;
        this.field3274 = arg2;
    }
}
