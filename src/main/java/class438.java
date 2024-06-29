import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class class438 {

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "[S")
    public static short[] field6395 = new short[256];

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "Lmt;")
    public static class410 field6394;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "[Lit;")
    public static class34[] field6393;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIBI)V", line = 4)
    public static final void method2696(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6392++;
        if (class554.field7897 != 1) {
            return;
        }
        int var5 = arg4 / class412.field6070;
        int var6 = arg2 / class412.field6070;
        int var7 = arg0 / class362.field5468;
        if (arg3 < 73) {
            method2699((byte) -18);
        }
        int var8 = arg1 / class362.field5468;
        if (var5 >= class390.field5830 || var6 < 0 || class245.field3937 <= var7 || var8 < 0) {
            return;
        }
        if (var8 >= class245.field3937) {
            var8 = class245.field3937 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class390.field5830 <= var6) {
            var6 = class390.field5830 - 1;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class590.method3390(class245.field3937, 31019, var9 + class285.field4381) * class390.field5830;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class590.method3390(class390.field5830, 31019, class84.field1241 + var11);
                class693.field9827[var12] = class418.field6149;
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V", line = 65)
    public static void method2699(byte arg0) {
        field6393 = null;
        field6394 = null;
        if (arg0 > 4) {
            field6395 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)[B")
    public abstract byte[] method2697(boolean arg0, int arg1);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)V")
    public abstract void method2698(int arg0, int arg1);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)Luj;")
    public abstract class436 method2700(boolean arg0);

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)I")
    public abstract int method2701(int arg0, int arg1);
}
