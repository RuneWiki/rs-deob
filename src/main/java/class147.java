import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class147 {

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "Lh;")
    private class571 field2268 = new class571(64);

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "Lan;")
    private class21 field2262;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "Lan;")
    private class21 field2266;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field2265 = 0;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "[I")
    public static int[] field2269 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "F")
    public static float field2267;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIII)I")
    public static final int method975(int arg0, int arg1, int arg2, int arg3) {
        field2260++;
        if (arg1 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg0;
        int var5 = (arg1 & 0x7F) * arg0 + (arg3 & 0x7F) * var4 >> 7;
        int var6 = (arg3 & 0x380) * var4 + ((arg1 & 0x380) * arg0) >> 7;
        int var7 = (arg1 & 0xFC00) * arg0 + (arg3 & arg2) * var4 >> 7;
        return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)V")
    public static final void method976(int arg0, int arg1) {
        class619.field8860 = arg1;
        field2263++;
        class571 var2 = class263.field3675;
        synchronized (class263.field3675) {
            class263.field3675.method3246(false);
            if (arg0 != 25765) {
                field2264 = -69;
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        field2269 = null;
        if (arg0 != 32768) {
            method977(89);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BI)Lwq;")
    public final class144 method978(byte arg0, int arg1) {
        field2259++;
        class144 var3 = (class144) this.field2268.method3252((long) arg1, (byte) 98);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field2262.method240(0, arg1 & 0x7FFF, (byte) -124);
        } else {
            var4 = this.field2266.method240(0, arg1, (byte) -124);
        }
        class144 var5 = new class144();
        if (var4 != null) {
            var5.method951(0, new class11(var4));
        }
        if (arg1 >= 32768) {
            var5.method948((byte) 89);
        }
        if (arg0 <= 58) {
            return null;
        } else {
            this.field2268.method3243(var5, (long) arg1, -122);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
    public static final boolean method979(int arg0, int arg1, int arg2) {
        field2261++;
        if (arg0 >= -89) {
            field2267 = -0.69673264F;
        }
        if (class208.method1373(8827, arg1, arg2)) {
            return class491.method2849(arg1, arg2, false) | (arg2 & 0x9000) != 0 | class145.method958(arg1, true, arg2) ? true : ((arg2 & 0x2000) != 0 | class63.method540(arg2, arg1, -24587) | class566.method3223(arg1, -34, arg2)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(ILan;Lan;)V")
    public class147(int arg0, class21 arg1, class21 arg2) {
        this.field2262 = arg2;
        this.field2266 = arg1;
        if (this.field2266 != null) {
            this.field2266.method231(0, -119);
        }
        if (this.field2262 != null) {
            this.field2262.method231(0, -121);
        }
    }
}
