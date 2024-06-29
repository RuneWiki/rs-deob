import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class150 {

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "J")
    public static long field2346 = 0L;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2343 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lna;")
    public static class26 field2347 = class69.method505("Lade Titelbild )2 ", (byte) -123);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lab;Lab;I)V", line = 6)
    public static final void method1020(class147 arg0, class147 arg1, int arg2) {
        field2350++;
        if (arg0.field2304 != null) {
            arg0.method1006(-1024);
        }
        arg0.field2296 = arg1;
        arg0.field2304 = arg1.field2304;
        if (arg2 == -16) {
            arg0.field2304.field2296 = arg0;
            arg0.field2296.field2304 = arg0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 24)
    public static void method1021(int arg0) {
        field2347 = null;
        if (arg0 != 33) {
            field2343 = 15;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)Lce;", line = 54)
    public static final class246 method1022(int arg0, int arg1, byte arg2) {
        field2348++;
        class246 var3 = new class246();
        for (class66 var4 = (class66) class287.field4796.method264(-58); var4 != null; var4 = (class66) class287.field4796.method263(4)) {
            if (var4.field1035 && var4.method489(arg1, (byte) 97, arg0)) {
                var3.method1695(var4, (byte) -127);
            }
        }
        int var5 = 30 % ((64 - arg2) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V", line = 81)
    public static final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 + arg5;
        field2345++;
        int var8 = arg4 - arg5;
        if (arg0 != -19619) {
            method1023(-17, 11, -118, -38, 115, -2, 113);
        }
        int var9 = arg5 + arg6;
        for (int var10 = arg2; var10 < var7; var10++) {
            class76.method543(class45.field710[var10], arg6, -91, arg1, arg3);
        }
        for (int var11 = arg4; var11 > var8; var11--) {
            class76.method543(class45.field710[var11], arg6, -113, arg1, arg3);
        }
        int var12 = arg1 - arg5;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class45.field710[var13];
            class76.method543(var14, arg6, -111, var9, arg3);
            class76.method543(var14, var12, -124, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
    public abstract void method111(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public abstract void method113(int arg0, int arg1);
}
