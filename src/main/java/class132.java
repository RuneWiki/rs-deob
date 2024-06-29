import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Ltd;")
    public static class136 field3114 = class145.method1172("Wordpack geladen)3", 45);

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Ltd;")
    public static class136 field3116 = class145.method1172("<col=ffff00>", 45);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lsb;")
    public static class127 field3113 = new class127(8);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field3119 = 0;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3118 = 0;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field3120 = 0;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "[I")
    public static int[] field3122 = new int[500];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lc;")
    public static class15 field3121;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIBI)I")
    public static final int method1069(int arg0, int arg1, byte arg2, int arg3) {
        field3112++;
        int var4 = arg3 / arg0;
        int var5 = arg1 / arg0;
        int var6 = arg0 - 1 & arg3;
        int var7 = class142.method1156(var5, var4, (byte) 113);
        int var8 = class142.method1156(var5, var4 + 1, (byte) 113);
        int var9 = arg0 - 1 & arg1;
        int var10 = class142.method1156(var5 + 1, var4, (byte) 113);
        int var11 = class142.method1156(var5 + 1, var4 + 1, (byte) 113);
        if (arg2 != -124) {
            field3119 = -79;
        }
        int var12 = class143.method1167(var7, var6, arg0, (byte) -116, var8);
        int var13 = class143.method1167(var10, var6, arg0, (byte) 59, var11);
        return class143.method1167(var12, var9, arg0, (byte) -106, var13);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1070(byte arg0) {
        field3114 = null;
        field3122 = null;
        field3113 = null;
        field3121 = null;
        field3116 = null;
        if (arg0 != -30) {
            field3118 = -73;
        }
    }
}
