import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class290 extends class247 {

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "J")
    public long field4675;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field4673 = 0;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Lvh;")
    public static class49 field4671;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Lvl;")
    public static class73 field4672;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIBLpg;)Z")
    public static final boolean method1968(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class191 arg6) {
        field4674++;
        class299 var7 = class29.method160(arg6.field3034, (byte) -52);
        if (var7.field4768 == -1) {
            return true;
        }
        int var9;
        if (arg6.field3028) {
            int var8 = arg6.field3024 + arg1;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class91 var10 = var7.method2012(var9, true, arg6.field2964);
        if (var10 == null) {
            return false;
        }
        int var11 = arg6.field2993;
        int var12 = arg6.field3039;
        if (arg5 != -106) {
            return true;
        }
        if ((var9 & 0x1) == 1) {
            var12 = arg6.field2993;
            var11 = arg6.field3039;
        }
        int var13 = var10.field2951;
        int var14 = var10.field2945;
        if (var7.field4767) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field4766 == 0) {
            var10.method623(arg0 * 4 + 48, 48 - -((104 - arg3 - var12) * 4), var13, var14);
        } else {
            var10.method615(arg0 * 4 + 48, (-arg3 + 104 + -var12) * 4 + 48, var13, var14, var7.field4766);
        }
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public static final void method1969(int arg0, int arg1, int arg2) {
        field4666++;
        if (class190.method1322(arg1, (byte) 97) && arg2 == 6404) {
            class114.method752(arg0, 27780, class68.field1018[arg1]);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Z")
    public static final boolean method1970(int arg0, int arg1) {
        field4670++;
        class210 var2 = class187.method1314(-94, arg0);
        if (var2 == null) {
            return false;
        } else if (class239.field3844 == 1 || class239.field3844 == 2 || class73.field1104 == 2) {
            class67.field991 = var2.field3273;
            if (class73.field1104 != 0) {
                class47.field598 = class67.field991 + 50000;
                class277.field4546 = class67.field991 + 40000;
                class231.field3697 = class277.field4546;
            }
            class142.field2109 = var2.field3274;
            return true;
        } else {
            if (arg1 != 104) {
                field4673 = 43;
            }
            String var3 = "";
            if (class73.field1104 != 0) {
                var3 = ":" + (var2.field3273 + 7000);
            }
            String var4 = "";
            if (class140.field2003 != null) {
                var4 = "/p=" + class140.field2003;
            }
            String var5 = "http://" + var2.field3274 + var3 + "/l=" + class46.field571 + "/a=" + class158.field2371 + var4 + "/j" + (class293.field4697 ? "1" : "0") + ",o" + (class265.field4294 ? "1" : "0") + ",a2,m" + (class197.field3121 ? "1" : "0");
            try {
                class197.field3117.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public static void method1971(int arg0) {
        field4672 = null;
        if (arg0 == -1) {
            field4671 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public static final void method1972(byte arg0) {
        if (arg0 == 33) {
            class175.field2756.method1510(10283);
            field4669++;
            class152.field2261.method1510(10283);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lrg;")
    public static final class89 method1973(int arg0, byte arg1) {
        field4676++;
        class89 var2 = (class89) class272.field4427.method707((long) arg0, (byte) -84);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class64.field929.method501(-2, class263.method1844(arg0, 255), class19.method111(arg0, 64));
        class89 var4 = new class89();
        if (var3 != null) {
            var4.method597(-84, new class170(var3));
        }
        if (arg1 <= 123) {
            return null;
        } else {
            class272.field4427.method712(false, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class290() {
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public static final void method1974(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class49.field623[var1] = false;
        }
        class28.field348 = -1;
        class211.field3292 = 0;
        class49.field628 = 0;
        if (arg0 != -16) {
            method1975(-73, 25, 8);
        }
        class243.field3886 = -1;
        field4667++;
        class158.field2370 = 1;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
    public static final void method1975(int arg0, int arg1, int arg2) {
        class299.field4770[arg1] = arg2;
        if (arg0 <= 117) {
            field4672 = null;
        }
        class290 var3 = (class290) class7.field98.method1064(-1, (long) arg1);
        if (var3 == null) {
            class290 var4 = new class290(class98.method665(true) + 500L);
            class7.field98.method1054(-3510, var4, (long) arg1);
        } else {
            var3.field4675 = class98.method665(true) + 500L;
        }
        field4665++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILvl;)V")
    public static final void method1976(int arg0, class73 arg1) {
        field4668++;
        if (arg0 != -10936) {
            field4673 = -49;
        }
        class5.field72 = arg1.method498(0, "titlebg");
        class265.field4311 = arg1.method498(0, "logo");
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(J)V")
    public class290(long arg0) {
        this.field4675 = arg0;
    }
}
