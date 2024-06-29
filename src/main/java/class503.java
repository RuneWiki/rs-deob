import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class503 {

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "[B")
    public byte[] field7302 = new byte[5000];

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public volatile int field7301 = 0;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field7307 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public volatile int field7294 = 0;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[F")
    public float[] field7306 = new float[5000];

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "[Ljava/lang/Object;")
    public Object[] field7308 = new Object[5000];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public int field7299 = 0;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Lpu;")
    public static class179 field7298 = new class179("M", "M", "M", "M");

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lpn;")
    public static class49 field7309 = new class49(40, 3);

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Z")
    public static boolean field7310 = true;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "[I")
    public static int[] field7311 = new int[2];

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "Lwn;")
    public static class177 field7312;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "Lnw;")
    public static class255 field7313;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "Lum;")
    public static class83 field7314;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZZI[Lfi;)V", line = 11)
    public static final void method2996(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, class38[] arg5) {
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class38 var7 = arg5[var6];
            if (var7 != null && var7.field600 == arg4) {
                class290.method1945(arg0, var7, arg1, -5, arg2);
                class425.method2657(125, var7, arg1, arg0);
                if (var7.field488 > var7.field595 - var7.field629) {
                    var7.field488 = var7.field595 - var7.field629;
                }
                if (var7.field488 < 0) {
                    var7.field488 = 0;
                }
                if ((var7.field604 - var7.field591) < var7.field504) {
                    var7.field504 = var7.field604 - var7.field591;
                }
                if (var7.field504 < 0) {
                    var7.field504 = 0;
                }
                if (var7.field503 == 0) {
                    class93.method789(arg2, (byte) -100, var7);
                }
            }
        }
        field7297++;
        if (!arg3) {
            field7312 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)I", line = 59)
    public static final int method2997(int arg0, int arg1, int arg2) {
        field7296++;
        if (arg2 == -12294) {
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg1 - var3;
        } else {
            return -32;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 73)
    public static void method2998(int arg0) {
        field7313 = null;
        field7311 = null;
        if (arg0 != -1715) {
            method2999(null, -112);
        }
        field7298 = null;
        field7309 = null;
        field7314 = null;
        field7312 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lum;I)V", line = 90)
    public static final void method2999(class83 arg0, int arg1) {
        field7305++;
        class294.field4539 = arg0.method737("p11_full", -1);
        class380.field5596 = arg0.method737("p12_full", -1);
        class53.field821 = arg0.method737("b12_full", -1);
        class29.field322 = arg0.method737("hitmarks", -1);
        class536.field7859 = arg0.method737("hitbar_default", -1);
        class517.field7516 = arg0.method737("timerbar_default", -1);
        class133.field1952 = arg0.method737("headicons_pk", -1);
        class265.field4235 = arg0.method737("headicons_prayer", -1);
        class295.field4541 = arg0.method737("hint_headicons", -1);
        class348.field5191 = arg0.method737("hint_mapmarkers", -1);
        class417.field6134 = arg0.method737("mapflag", ~arg1);
        class321.field4859 = arg0.method737("cross", -1);
        if (arg1 != 0) {
            method2996(-86, -43, false, true, 79, null);
        }
        class342.field5112 = arg0.method737("mapdots", -1);
        class59.field898 = arg0.method737("scrollbar", -1);
        class109.field1641 = arg0.method737("name_icons", -1);
        class431.field6381 = arg0.method737("floorshadows", arg1 - 1);
        class112.field1672 = arg0.method737("compass", -1);
        class413.field6092 = arg0.method737("otherlevel", -1);
        class306.field4687 = arg0.method737("hint_mapedge", -1);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IFFIIIFFFLcc;I)[B", line = 120)
    public static final byte[] method3000(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, class351 arg9, int arg10) {
        field7295++;
        byte[] var11 = new byte[arg4 * arg10 * arg3];
        if (arg5 != 6992) {
            field7313 = null;
        }
        class413.method2592((byte) 78, var11, arg0, arg3, arg7, arg9, arg8, arg2, 0, arg1, arg6, arg4, arg10);
        return var11;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIBI)I", line = 135)
    public static final int method3001(int arg0, int arg1, byte arg2, int arg3) {
        field7304++;
        int var4 = arg1 / arg3;
        int var5 = arg1 & arg3 - 1;
        int var6 = arg0 / arg3;
        int var7 = arg0 & arg3 - 1;
        int var8 = class114.method874(var4, false, var6);
        int var9 = class114.method874(var4 + 1, false, var6);
        int var10 = class114.method874(var4, false, var6 + 1);
        int var11 = class114.method874(var4 + 1, false, var6 + 1);
        int var12 = class147.method1050(var9, var8, (byte) -69, var5, arg3);
        if (arg2 != -81) {
            field7313 = null;
        }
        int var13 = class147.method1050(var11, var10, (byte) -119, var5, arg3);
        return class147.method1050(var13, var12, (byte) -67, var7, arg3);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILfi;)V", line = 220)
    public static final void method3002(int arg0, class38 arg1) {
        field7300++;
        if (arg0 != -11766) {
            field7312 = null;
        }
        if (arg1.field503 == 5 && arg1.field499 != -1) {
            class307.method2027(arg1, (byte) 106, class376.field5542);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILvt;)V")
    public abstract void method276(int arg0, class281 arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public abstract void method269(int arg0);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lvt;I)V")
    public abstract void method274(class281 arg0, int arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lya;IIZF)V")
    public abstract void method268(class11 arg0, int arg1, int arg2, boolean arg3, float arg4);

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(ILvt;)V")
    public abstract void method278(int arg0, class281 arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V")
    public abstract void method267(byte arg0, int arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public abstract void method270(int arg0, int arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public abstract void method273(byte arg0);
}
