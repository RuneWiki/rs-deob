import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class46 extends class12 {

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "[Ls;")
    public class163[] field729;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "[I")
    public static int[] field730 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "Lmd;")
    public static class113 field733 = new class113(4096);

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Lkb;")
    public static class93 field736 = class76.method390("null", 0);

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "J")
    public static long field735;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lkb;BLkb;ILjg;Z)V")
    public static final void method241(class93 arg0, byte arg1, class93 arg2, int arg3, class89 arg4, boolean arg5) {
        int var6 = 18 / ((-arg1 - 66) / 57);
        int var7 = arg4.method454(236, arg2);
        field728++;
        int var8 = arg4.method468(21, arg0, var7);
        method246(arg3, var8, var7, arg4, (byte) 127, arg5);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([Lkb;I)[Lkb;")
    public static final class93[] method242(class93[] arg0, int arg1) {
        class93[] var2 = new class93[5];
        field732++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class203.method1321(new class93[] { class67.method357((byte) -105, var3), class41.field684 }, class29.method159(arg1, -21824));
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class203.method1321(new class93[] { var2[var3], arg0[var3] }, 103);
            }
        }
        if (arg1 != -21826) {
            field735 = 65L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Z")
    public final boolean method243(int arg0, int arg1) {
        if (arg0 >= -50) {
            field733 = null;
        }
        field737++;
        return this.field729[arg1].field3233;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V")
    public static void method244(byte arg0) {
        field733 = null;
        field736 = null;
        if (arg0 > 120) {
            field730 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZIIZ)Lme;")
    public static final class114 method245(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 != 1000000) {
            method245(false, true, 114, -51, false);
        }
        field731++;
        class61 var5 = null;
        if (class63.field996 != null) {
            var5 = new class61(arg3, class63.field996, class126.field2377[arg3], 1000000);
        }
        return new class114(var5, class173.field3431, arg3, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljg;Ljg;IZ)V")
    public class46(class89 arg0, class89 arg1, int arg2, boolean arg3) {
        class122 var5 = new class122();
        int var6 = arg0.method456(arg2, -120);
        this.field729 = new class163[var6];
        int[] var7 = arg0.method452(186, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method461(arg2, (byte) 89, var7[var8]);
            class96 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class96 var12 = (class96) var5.method692(false); var12 != null; var12 = (class96) var5.method695(512)) {
                if (var12.field1781 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method457(0, var11, (byte) -110);
                } else {
                    var13 = arg1.method457(var11, 0, (byte) -74);
                }
                var10 = new class96(var11, var13);
                var5.method691(var10, (byte) 51);
            }
            this.field729[var7[var8]] = new class163(var9, var10);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILjg;BZ)V")
    public static final void method246(int arg0, int arg1, int arg2, class89 arg3, byte arg4, boolean arg5) {
        class101.field1852 = arg3;
        if (arg4 <= 122) {
            field736 = null;
        }
        class148.field2861 = 10000;
        class64.field1032 = arg1;
        class188.field3692 = arg2;
        class166.field3327 = arg5;
        class24.field365 = 1;
        field734++;
        class88.field1593 = arg0;
    }
}
