import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class160 extends class153 {

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "[Lhh;")
    public class116[] field2876;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Lpj;")
    public static class237 field2870 = class33.method353("<img=0>", 88);

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "[I")
    public static int[] field2872 = new int[32];

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "Lpj;")
    public static class237 field2881 = class33.method353(")3runescape)3com)4l=", 87);

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "Lpj;")
    public static class237 field2878 = class33.method353("Spielwelt erstellt)3", 51);

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Lpj;")
    public static class237 field2875 = class33.method353("Clientscript error )2 check log for details", 15);

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "Lpj;")
    public static class237 field2883 = class33.method353("(U2", 79);

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "Lcj;")
    public static class115 field2880;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Lfa;")
    public static class239 field2882;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)[Lcj;")
    public static final class115[] method1126(int arg0) {
        class115[] var1 = new class115[class92.field1668];
        for (int var2 = 0; var2 < class92.field1668; var2++) {
            int var3 = class175.field3063[var2] * class174.field3060[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class127.field2221[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class139.field2398[class272.method1817(255, var5[var6])];
            }
            var1[var2] = new class225(class52.field1094, class43.field944, class252.field4341[var2], class226.field3868[var2], class174.field3060[var2], class175.field3063[var2], var4);
        }
        field2869++;
        class190.method1291((byte) 103);
        if (arg0 != 3) {
            field2878 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public static final void method1127(byte arg0) {
        for (int var1 = 0; var1 < class155.field2752; var1++) {
            int var2 = class117.field2062[var1];
            class271 var3 = class232.field4025[var2];
            int var4 = class65.field1288.method316((byte) -112);
            if ((var4 & 0x20) != 0) {
                var4 += class65.field1288.method316((byte) -112) << 8;
            }
            class255.method1722(arg0 ^ 0xFFFFFFB5, var4, var2, var3);
        }
        if (arg0 != -41) {
            field2882 = null;
        }
        field2877++;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lfa;Lfa;IZ)V")
    public class160(class239 arg0, class239 arg1, int arg2, boolean arg3) {
        class88 var5 = new class88();
        int var6 = arg0.method1638(arg2, (byte) -73);
        this.field2876 = new class116[var6];
        int[] var7 = arg0.method1636(arg2, (byte) -34);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class264 var9 = null;
            byte[] var10 = arg0.method1645(true, var7[var8], arg2);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class264 var12 = (class264) var5.method673(false); var12 != null; var12 = (class264) var5.method680(20)) {
                if (var12.field4512 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1648(var11, 0, 30);
                } else {
                    var13 = arg1.method1648(0, var11, -110);
                }
                var9 = new class264(var11, var13);
                var5.method675(var9, (byte) -46);
            }
            this.field2876[var7[var8]] = new class116(var10, var9);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V")
    public static void method1128(byte arg0) {
        field2872 = null;
        field2878 = null;
        field2870 = null;
        field2882 = null;
        field2883 = null;
        if (arg0 > -90) {
            field2870 = null;
        }
        field2880 = null;
        field2881 = null;
        field2875 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1129(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        field2871++;
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 8 - arg4 - arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg2;
        } else {
            if (arg5 > -17) {
                field2881 = null;
            }
            return arg6;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIIII)V")
    public static final void method1130(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2873++;
        class270 var5 = class202.method1368(-15, 10, arg4);
        var5.method1793(13);
        var5.field4617 = arg3;
        var5.field4619 = arg2;
        if (arg0 < 90) {
            method1127((byte) 73);
        }
        var5.field4628 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z")
    public final boolean method1131(int arg0, int arg1) {
        field2874++;
        if (arg0 != 0) {
            field2870 = null;
        }
        return this.field2876[arg1].field2044;
    }
}
