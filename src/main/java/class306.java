import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class306 extends class130 {

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "Z")
    public boolean field5223 = true;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public int field5225 = 0;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public int field5224 = -1;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public int field5229 = 12800;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public int field5228 = 12800;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public int field5222 = 0;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public int field5227;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "Lcd;")
    public class64 field5232;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public int field5216;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "Lcd;")
    public class64 field5233;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "Lke;")
    public class106 field5217;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field5219 = 0;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Lke;")
    public static class106 field5220 = new class106();

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "Lcd;")
    public static class64 field5236 = class44.method335((byte) 71, "mem=");

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "Lcd;")
    public static class64 field5235 = class44.method335((byte) 71, "blinken2:");

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field5239 = 1;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V", line = 5)
    public static void method2130(int arg0) {
        int var1 = -17 / ((arg0 - 56) / 32);
        field5235 = null;
        field5220 = null;
        field5236 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIII)V", line = 16)
    public static final void method2131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5234++;
        int var9 = arg6 - arg7;
        int var10 = arg8 - arg1;
        int var11 = (arg5 - arg0 << 16) / var9;
        int var12 = (arg2 - arg3 << 16) / var10;
        if (arg4 != 12800) {
            method2131(-48, -69, 57, 1, -13, 67, 45, -5, -84);
        }
        class156.method1123(arg8, arg7, 0, var12, 0, arg0, 187, arg1, var11, arg6, arg3);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BII)Z", line = 35)
    public final boolean method2132(byte arg0, int arg1, int arg2) {
        if (arg0 != 83) {
            this.field5222 = 2;
        }
        field5237++;
        if (arg2 < this.field5228 || arg2 > this.field5225 || arg1 < this.field5229 || this.field5222 < arg1) {
            return false;
        }
        for (class202 var4 = (class202) this.field5217.method778(0); var4 != null; var4 = (class202) this.field5217.method775(arg0 + 26434)) {
            if (var4.method1412(arg1, (byte) -115, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V", line = 66)
    public static final void method2133(byte arg0) {
        if (class128.field2277 == 10 && class123.field2216) {
            class153.method1107(28, (byte) -97);
        }
        field5226++;
        if (class128.field2277 == 30) {
            class153.method1107(25, (byte) -92);
        }
        int var1 = -15 % ((-arg0 - 37) / 60);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lee;", line = 86)
    public static final class268 method2134(int arg0, int arg1) {
        field5230++;
        class268 var2 = (class268) class10.field201.method329((long) arg1, (byte) -63);
        if (arg0 != 0) {
            field5239 = 125;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class146.field2589.method1580(0, arg1 & 0x7FFF, 0);
        } else {
            var3 = class270.field4659.method1580(0, arg1, 0);
        }
        class268 var4 = new class268();
        if (var3 != null) {
            var4.method1876(new class13(var3), (byte) -112);
        }
        if (arg1 >= 32768) {
            var4.method1877(40);
        }
        class10.field201.method331((long) arg1, var4, (byte) 88);
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lcd;Lcd;IIIZ)V", line = 229)
    public class306(class64 arg0, class64 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field5227 = arg2;
        this.field5223 = arg5;
        this.field5232 = arg1;
        this.field5216 = arg3;
        this.field5233 = arg0;
        this.field5224 = arg4;
        this.field5217 = new class106();
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V", line = 166)
    public final void method2135(int arg0) {
        if (arg0 != -10900) {
            field5236 = (class64) null;
        }
        this.field5222 = 0;
        this.field5225 = 0;
        this.field5228 = 12800;
        this.field5229 = 12800;
        for (class202 var2 = (class202) this.field5217.method778(0); var2 != null; var2 = (class202) this.field5217.method775(arg0 + 37417)) {
            if (var2.field3463 > this.field5225) {
                this.field5225 = var2.field3463;
            }
            if (this.field5228 > var2.field3458) {
                this.field5228 = var2.field3458;
            }
            if (this.field5229 > var2.field3459) {
                this.field5229 = var2.field3459;
            }
            if (var2.field3454 > this.field5222) {
                this.field5222 = var2.field3454;
            }
        }
        field5218++;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)Z", line = 206)
    public static final boolean method2136(int arg0, int arg1) {
        field5221++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (~arg0 <= arg1 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }
}
