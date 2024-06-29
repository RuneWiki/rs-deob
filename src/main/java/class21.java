import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class21 {

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Z")
    public static boolean field317 = false;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLvl;)Lnk;", line = 14)
    public static final class326 method208(boolean arg0, class6 arg1) {
        field321++;
        arg1.method58(-288140008);
        int var2 = arg1.method58(-288140008);
        class326 var3 = class244.method1747(arg0, var2);
        var3.field5116 = arg1.method58(-288140008);
        int var4 = arg1.method58(-288140008);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method58(-288140008);
            var3.method98(var6, false, arg1);
        }
        var3.method99((byte) 31);
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Ldk;", line = 47)
    public static final class226 method209(int arg0, int arg1) {
        class226 var2 = (class226) class339.field5284.method1351((long) arg1, 63);
        field319++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class18.field285.method1813(0, arg1, true);
        class226 var4 = new class226(var3);
        var4.method2247(class333.field5190, (int[]) null);
        class339.field5284.method1347(var4, (long) arg1, (byte) -127);
        if (arg0 != -31640) {
            field317 = false;
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 72)
    public static final void method210(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 75 % ((25 - arg0) / 51);
        int var5 = class204.field3233 * arg3 >> 8;
        if (var5 != 0 && arg2 != -1) {
            class76.method573(arg2, var5, -1, false, 0, class175.field2873);
            class4.field43 = true;
        }
        field315++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZIZBII)V", line = 98)
    public static final void method211(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        field320++;
        if (arg4 >= -33) {
            method211(-34, true, 58, false, (byte) 0, -42, 113);
        }
        if (arg6 >= arg5) {
            return;
        }
        int var7 = (arg5 + arg6) / 2;
        int var8 = arg6;
        class187 var9 = class318.field5036[var7];
        class318.field5036[var7] = class318.field5036[arg5];
        class318.field5036[arg5] = var9;
        for (int var10 = arg6; var10 < arg5; var10++) {
            if (class72.method554(arg0, arg1, class318.field5036[var10], arg3, arg2, var9, -109) <= 0) {
                class187 var11 = class318.field5036[var10];
                class318.field5036[var10] = class318.field5036[var8];
                class318.field5036[var8++] = var11;
            }
        }
        class318.field5036[arg5] = class318.field5036[var8];
        class318.field5036[var8] = var9;
        method211(arg0, arg1, arg2, arg3, (byte) -71, var8 - 1, arg6);
        method211(arg0, arg1, arg2, arg3, (byte) -93, arg5, var8 + 1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lnn;", line = 144)
    public static final class187 method212(int arg0) {
        field312++;
        class253.field3974 = 0;
        return arg0 == -16777216 ? class27.method251(false) : (class187) null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 161)
    public static final void method213(int arg0, int arg1) {
        class171.field2811.method1353(-1, arg0);
        int var2 = 10 % ((arg1 - 23) / 44);
        field318++;
    }
}
