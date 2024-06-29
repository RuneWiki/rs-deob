import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class70 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "J")
    public long field1197 = 0L;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lmb;")
    private static class96 field1199 = class243.method1708("red:", (byte) 118);

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lmb;")
    public static class96 field1203 = field1199;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lmb;")
    public static class96 field1210 = field1199;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "J")
    public static long field1207;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lnb;")
    public class108 field1214;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1206++;
        int var8 = class268.method1841(class9.field149, client.field1994, 0, arg3);
        int var9 = class268.method1841(class9.field149, client.field1994, arg2, arg6);
        int var10 = class268.method1841(class162.field2884, class9.field145, 0, arg1);
        int var11 = class268.method1841(class162.field2884, class9.field145, 0, arg5);
        int var12 = class268.method1841(class9.field149, client.field1994, arg2 ^ arg2, arg3 + arg7);
        int var13 = class268.method1841(class9.field149, client.field1994, 0, arg6 - arg7);
        for (int var14 = var8; var14 < var12; var14++) {
            class36.method283(var10, class229.field3939[var14], var11, (byte) -62, arg0);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class36.method283(var10, class229.field3939[var15], var11, (byte) -90, arg0);
        }
        int var16 = class268.method1841(class162.field2884, class9.field145, arg2, arg1 + arg7);
        int var17 = class268.method1841(class162.field2884, class9.field145, 0, arg5 - arg7);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class229.field3939[var18];
            class36.method283(var10, var19, var16, (byte) -125, arg0);
            class36.method283(var16, var19, var17, (byte) -68, arg4);
            class36.method283(var17, var19, var11, (byte) -89, arg0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method480(int arg0) {
        field1210 = null;
        field1199 = null;
        field1203 = null;
        if (arg0 != -25309) {
            method479(38, -84, -15, -16, -46, 100, 88, -57);
        }
    }
}
