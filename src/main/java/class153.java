import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class153 implements class733 {

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "Lcn;")
    private class512 field2306;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "Leq;")
    private class209 field2295;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "Leq;")
    private class209 field2305;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "F")
    public static float field2307;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "Ldm;")
    public static class50 field2303;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "Lda;")
    private class59 field2296;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
    public static void method1170(byte arg0) {
        if (arg0 == 6) {
            field2303 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)V")
    public static final void method1171(byte arg0) {
        if (arg0 != -76) {
            return;
        }
        field2304++;
        if (class633.field9066 != null) {
            for (int var1 = 0; var1 < class93.field1622; var1++) {
                class633.field9066[var1] = null;
            }
            class633.field9066 = null;
        }
        if (class467.field6737 != null) {
            for (int var2 = 0; var2 < class522.field7393; var2++) {
                class467.field6737[var2] = null;
            }
            class467.field6737 = null;
        }
        if (class27.field380 != null) {
            for (int var3 = 0; var3 < class650.field9180; var3++) {
                class27.field380[var3] = null;
            }
            class27.field380 = null;
        }
        class217.field3094 = null;
        class312.field4397 = -1;
        class136.field2124 = -1;
        class458.field6612 = null;
        class159.field2370 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZI)V")
    public final void method1172(boolean arg0, int arg1) {
        int var3 = -113 / (-arg1 / 39);
        field2299++;
        if (arg0) {
            int var4 = this.field2306.field7303.method2152(class57.field1064, this.field2306.field7296, -99) + this.field2306.field7298;
            int var5 = this.field2306.field7295.method3892(this.field2306.field7301, class477.field6814, 4) + this.field2306.field7307;
            this.field2296.method648(this.field2306.field7300, 0, var4, null, var5, this.field2306.field7301, null, 12673, this.field2306.field7306, this.field2306.field7296, this.field2306.field7292, this.field2306.field7299, this.field2306.field7302, this.field2306.field7294, 0, null);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public final void method1173(int arg0) {
        field2297++;
        if (arg0 < -105) {
            class323 var2 = class251.method1709(this.field2295, 1, this.field2306.field7293);
            this.field2296 = class359.field5046.method632(var2, class55.method505(this.field2305, this.field2306.field7293), true);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIBZ)V")
    public static final void method1174(int arg0, int arg1, byte arg2, boolean arg3) {
        field2300++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class595.field8698 = arg0;
        if (arg2 > -110) {
            method1170((byte) -79);
        }
        class390.field5446 = arg3;
        class215.field3077 = arg1;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILud;)Lpd;")
    public static final class256 method1175(int arg0, class35 arg1) {
        field2302++;
        class338 var2 = class405.method2488(true)[arg1.method273(255)];
        class692 var3 = class701.method3940(arg0 ^ 0x33E3)[arg1.method273(arg0 - 13027)];
        int var4 = arg1.method225((byte) 121);
        int var5 = arg1.method225((byte) 123);
        int var6 = arg1.method253(arg0 ^ 0xFFFFFA56);
        int var7 = arg1.method253(-13900);
        if (arg0 != 13282) {
            field2303 = null;
        }
        int var8 = arg1.method225((byte) 62);
        int var9 = arg1.method234((byte) -96);
        int var10 = arg1.method234((byte) -102);
        return new class256(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)Z")
    public final boolean method1176(byte arg0) {
        if (arg0 < 124) {
            return false;
        }
        field2308++;
        boolean var2 = true;
        if (!this.field2305.method1472(-25711, this.field2306.field7293)) {
            var2 = false;
        }
        if (!this.field2295.method1472(-25711, this.field2306.field7293)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILvg;)V")
    public static final void method1177(int arg0, class52 arg1) {
        if (arg0 >= -98) {
            field2298 = 126;
        }
        if ((arg1 instanceof class84)) {
            class84 var3 = (class84) arg1;
            if (var3.field1523 != null) {
                class478.method2873(var3, 0, class468.field6748.field649 != var3.field649);
            }
        } else if (arg1 instanceof class349) {
            class349 var2 = (class349) arg1;
            class657.method3703(class468.field6748.field649 != var2.field649, 0, var2);
        }
        field2301++;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Leq;Leq;Lcn;)V")
    public class153(class209 arg0, class209 arg1, class512 arg2) {
        this.field2306 = arg2;
        this.field2295 = arg1;
        this.field2305 = arg0;
    }
}
