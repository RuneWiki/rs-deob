import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class308 extends class159 {

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
    public static int[] field5017 = new int[32];

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5021 = "Loaded textures";

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field5013 = 0;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Z")
    public static boolean field5022 = false;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "J")
    public long field5011;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lph;")
    public class308 field5009;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Lph;")
    public class308 field5012;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[[Ljb;")
    public static class226[][] field5020;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V", line = 6)
    public static final void method2146(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2150(-75);
        }
        field5014++;
        class170.field2650[arg2] = arg0;
        class255 var3 = (class255) class98.field1410.method29((long) arg2, arg1 + 103);
        if (var3 == null) {
            class255 var4 = new class255(class19.method122(-12169) + 500L);
            class98.field1410.method37(false, var4, (long) arg2);
        } else {
            var3.field4044 = class19.method122(-12169) + 500L;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIBI)V", line = 45)
    public static final void method2147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field5018++;
        int var8 = arg1 + arg7;
        int var9 = arg5 - arg1;
        int var10 = arg2 - arg1;
        int var11 = arg0 + arg1;
        for (int var12 = arg7; var12 < var8; var12++) {
            class270.method1906(arg4, arg2, arg0, class306.field4998[var12], 125);
        }
        for (int var13 = arg5; var13 > var9; var13--) {
            class270.method1906(arg4, arg2, arg0, class306.field4998[var13], 122);
        }
        int var14 = 39 / ((27 - arg6) / 58);
        for (int var15 = var8; var15 <= var9; var15++) {
            int[] var16 = class306.field4998[var15];
            class270.method1906(arg4, var11, arg0, var16, 119);
            class270.method1906(arg3, var10, var11, var16, 122);
            class270.method1906(arg4, arg2, var10, var16, 126);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 91)
    public final void method2148(byte arg0) {
        field5015++;
        if (this.field5009 == null) {
            return;
        }
        this.field5009.field5012 = this.field5012;
        this.field5012.field5009 = this.field5009;
        if (arg0 < 103) {
            field5020 = (class226[][]) ((class226[][]) null);
        }
        this.field5012 = null;
        this.field5009 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Lcl;", line = 110)
    public static final class118 method2149(int arg0, byte arg1) {
        field5016++;
        if (arg1 >= -124) {
            method2147(54, -125, 62, -20, 87, 0, (byte) 124, 114);
        }
        class118 var2 = (class118) class41.field624.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class130.field1981.method1504(arg0, true, 32);
        class118 var4 = new class118();
        if (var3 != null) {
            var4.method762(99, new class313(var3));
        }
        var4.method761(-128);
        class41.field624.method642(var4, (long) arg0, -108);
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V", line = 139)
    public static void method2150(int arg0) {
        field5021 = null;
        field5017 = null;
        if (arg0 != 32) {
            method2149(55, (byte) -1);
        }
        field5020 = (class226[][]) null;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z", line = 159)
    public final boolean method2151(int arg0) {
        if (arg0 != -4854) {
            field5020 = (class226[][]) ((class226[][]) null);
        }
        field5019++;
        return this.field5009 != null;
    }
}
