import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class242 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lhc;")
    public static class212 field4190 = new class212(512);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4193 = 0;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "J")
    public static long field4199 = 0L;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field4201 = -1;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Ldf;")
    public static class51 field4203 = class46.method233("Wordpack geladen)3", 100);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLwc;)V")
    public static final void method1658(byte arg0, class213 arg1) {
        field4198++;
        class213 var2 = class32.method162(0, arg1);
        if (arg0 < 13) {
            method1660((byte) -88, (int[]) null, 15, -65, 50);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class76.field1230;
            var4 = class95.field1578;
        } else {
            var4 = var2.field3603;
            var3 = var2.field3608;
        }
        class111.method816(5, var3, var4, false, arg1);
        class130.method958(arg1, var3, true, var4);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static final void method1659(int arg0) {
        field4194++;
        if (arg0 != -8193) {
            field4190 = null;
        }
        class97.field1600.method1353(arg0 + 8090);
        class204.field3403.method1353(-114);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B[IIII)V")
    public static final void method1660(byte arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg4--;
        field4192++;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg4 = var13 + 1;
            arg1[arg4] = arg2;
        }
        if (arg0 != -79) {
            method1658((byte) 34, (class213) null);
        }
        while (arg4 < var6) {
            arg4++;
            arg1[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static void method1661(int arg0) {
        if (arg0 == -12197) {
            field4203 = null;
            field4190 = null;
        }
    }
}
