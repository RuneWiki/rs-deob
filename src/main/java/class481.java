import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class481 {

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Luf;")
    private class380 field6692 = new class380(64);

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lga;")
    private class332 field6695;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Luf;")
    public static class380 field6687 = new class380(128, 4);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
    public static final void method2764(boolean arg0, int arg1) {
        if (arg0) {
            if (class164.field2349 != -1) {
                class190.method1254(class164.field2349, false);
            }
            for (class137 var2 = (class137) class152.field2079.method3053((byte) 100); var2 != null; var2 = (class137) class152.field2079.method3056(18113)) {
                if (!var2.method241(true)) {
                    var2 = (class137) class152.field2079.method3053((byte) 57);
                    if (var2 == null) {
                        break;
                    }
                }
                class3.method17(-1718294864, var2, true, false);
            }
            class164.field2349 = -1;
            class152.field2079 = new class546(8);
            class99.method562((byte) -114);
            class164.field2349 = class431.field5793;
            class166.method1012(34, false);
            class398.method2275(arg1 ^ 0xFFFFD610);
            class656.method3741(class164.field2349);
        }
        field6693++;
        class188.field2614 = true;
        if (arg1 != 10735) {
            field6687 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method2765(byte arg0) {
        field6691++;
        int var2 = 97 % ((arg0 - 31) / 48);
        class380 var3 = this.field6692;
        synchronized (this.field6692) {
            this.field6692.method2168((byte) -115);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZII)I")
    public static final int method2766(int arg0, boolean arg1, int arg2, int arg3) {
        field6694++;
        int var4 = arg0 / arg2;
        int var5 = arg2 - 1 & arg0;
        int var6 = arg3 / arg2;
        int var7 = arg3 & arg2 - 1;
        int var8 = class67.method376(var6, (byte) 91, var4);
        int var9 = class67.method376(var6, (byte) 91, var4 + 1);
        int var10 = class67.method376(var6 + 1, (byte) 91, var4);
        int var11 = class67.method376(var6 + 1, (byte) 91, var4 + 1);
        int var12 = class664.method3787(arg2, var5, var8, true, var9);
        int var13 = class664.method3787(arg2, var5, var10, arg1, var11);
        return class664.method3787(arg2, var7, var12, true, var13);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
    public static final void method2767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6689++;
        if (arg2 == arg3) {
            class488.method2802(arg4, arg2, (byte) 118, arg5, arg0);
            return;
        }
        if (arg1 != 8) {
            method2766(-64, false, -6, -37);
        }
        if (class281.field3703 <= (arg4 - arg2) && class255.field3350 >= arg2 + arg4 && class6.field66 <= (arg5 - arg3) && arg3 + arg5 <= class151.field2071) {
            class4.method22(arg5, arg0, arg2, arg3, arg4, (byte) -122);
        } else {
            class603.method3359((byte) -41, arg5, arg3, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public final void method2768(boolean arg0) {
        field6688++;
        class380 var2 = this.field6692;
        synchronized (this.field6692) {
            this.field6692.method2172(-15112);
        }
        if (arg0) {
            this.method2765((byte) 115);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)Lfb;")
    public final class53 method2769(int arg0, boolean arg1) {
        field6696++;
        class380 var3 = this.field6692;
        class53 var4;
        synchronized (this.field6692) {
            var4 = (class53) this.field6692.method2176(-128, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field6695;
        byte[] var6;
        synchronized (this.field6695) {
            var6 = this.field6695.method1938(arg0, 35, -17);
        }
        if (!arg1) {
            field6687 = null;
        }
        class53 var7 = new class53();
        if (var6 != null) {
            var7.method310(new class157(var6), !arg1);
        }
        var7.method313((byte) 42);
        class380 var8 = this.field6692;
        synchronized (this.field6692) {
            this.field6692.method2174(var7, (long) arg0, (byte) 122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public final void method2770(int arg0, int arg1) {
        class380 var3 = this.field6692;
        synchronized (this.field6692) {
            this.field6692.method2179(false, arg0);
        }
        int var4 = 115 / ((-arg1 - 2) / 55);
        field6690++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
    public static void method2771(boolean arg0) {
        if (!arg0) {
            method2764(false, 53);
        }
        field6687 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lnq;ILga;)V")
    public class481(class650 arg0, int arg1, class332 arg2) {
        this.field6695 = arg2;
        if (this.field6695 != null) {
            this.field6695.method1939(0, 35);
        }
    }
}
