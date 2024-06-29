import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class200 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Z")
    public static boolean field3042 = false;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field3043 = -1;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field3038 = 0;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[I")
    public static int[] field3041 = new int[14];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field3040 = 0;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[I")
    public static int[] field3044 = new int[50];

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lbf;")
    public static class108 field3039;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public static final void method1256(int arg0, int arg1, int arg2) {
        field3047++;
        class307 var3 = class218.method1425(arg2, (byte) -124);
        int var4 = var3.field4940;
        int var5 = var3.field4935;
        int var6 = var3.field4943;
        int var7 = class250.field3900[var5 - var4];
        if (arg1 > arg0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class13.method83(~var8 & class31.field470[var6] | arg0 << var4 & var8, var6, 20954);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method1257(int arg0) {
        field3041 = null;
        field3039 = null;
        field3044 = null;
        if (arg0 > -73) {
            method1257(-35);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public static final void method1258(int arg0, int arg1) {
        field3046++;
        class242.field3795.method943(arg1, true);
        if (arg0 != 0) {
            method1258(-125, -43);
        }
        class115.field1657.method943(arg1, true);
        class202.field3053.method943(arg1, true);
    }
}
