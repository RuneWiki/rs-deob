import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class394 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5560 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field5561 = 0;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field5564 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lkp;")
    public static class454 field5565;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method723(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method2383(int arg0) {
        field5565 = null;
        if (arg0 != 0) {
            field5561 = -47;
        }
    }

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method710();

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method712(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method711(class394 arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method2384(String arg0, boolean arg1, boolean arg2) {
        field5566++;
        if (arg1) {
            field5564 = 58;
        }
        class496.method2889(-1, -1, arg2, arg0, -93);
    }

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method709(int[] arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Z")
    public static final boolean method2385(byte arg0) {
        field5562++;
        if (arg0 != 124) {
            field5560 = 101;
        }
        if (class16.field296) {
            try {
                if ((Boolean) class140.method923(class627.field8991, (byte) -89, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method720(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class394 method708();

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method713(int arg0);

    @OriginalMember(owner = "client!q", name = "DA", descriptor = "(III[I)V")
    public abstract void method725(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method714(int arg0);

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method718(int arg0);

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method722(int arg0);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method721(int arg0);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method724(int arg0);

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method717(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILgda;ZIIILn;ILua;Lla;Ljava/lang/String;)V")
    public static final void method2386(int arg0, int arg1, class50 arg2, boolean arg3, int arg4, int arg5, int arg6, class17 arg7, int arg8, class616 arg9, class419 arg10, String arg11) {
        field5563++;
        int var12;
        if (class586.field8507 == 4) {
            var12 = (int) class115.field1495 & 0x3FFF;
        } else {
            var12 = (int) class115.field1495 + class186.field2277 & 0x3FFF;
        }
        int var13 = Math.max(arg7.field414 / 2, arg7.field402 / 2) + 10;
        int var14 = arg4 * arg4 + arg8 * arg8;
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class395.field5579[var12];
        int var16 = class395.field5582[var12];
        if (class586.field8507 != 4) {
            var15 = var15 * 256 / (class680.field9743 + 256);
            var16 = var16 * 256 / (class680.field9743 + 256);
        }
        int var17 = arg4 * var16 + arg8 * var15 >> 14;
        int var18 = arg8 * var16 - (arg4 * var15) >> 14;
        int var19 = arg2.method551(100, null, arg11, arg3);
        int var20 = var17 - var19 / 2;
        int var21 = arg2.method555(1, 100, arg11, null, 0);
        if (-arg7.field414 <= var20 && arg7.field414 >= var20 && var18 >= (-arg7.field402) && var18 <= arg7.field402) {
            arg10.method2518(0, arg1, arg6, null, arg11, var19, 0, (byte) 117, arg0, arg9, arg7.field402 / 2 + (arg6 - var18) - var21 - arg5, null, 50, arg7.field414 / 2 + (var20 + arg0), 0, 1);
        }
    }
}
