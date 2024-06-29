import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class304 extends class331 implements class289 {

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Lul;")
    public class331 field4086;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "[F")
    public static float[] field4079 = new float[4];

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "Ldk;")
    public static class488 field4085 = new class488();

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "Lcb;")
    public static class318 field4095 = new class318(20, -1);

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "Lfl;")
    public static class648 field4096;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "[I")
    public static int[] field4089;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)I")
    public final int method128(byte arg0) {
        if (arg0 < 35) {
            this.field4086 = null;
        }
        field4092++;
        return 0;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        field4088++;
        if (!arg0) {
            this.method126(0);
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(ILoa;)V")
    public final void method129(int arg0, class689 arg1) {
        if (arg0 != 27921) {
            field4085 = null;
        }
        field4094++;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(BLoa;)V")
    public final void method123(byte arg0, class689 arg1) {
        field4087++;
        if (arg0 < 91) {
            field4079 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)Z")
    public final boolean method122(boolean arg0) {
        if (arg0) {
            field4095 = null;
        }
        field4077++;
        return false;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIILul;)V")
    public class304(int arg0, int arg1, int arg2, class331 arg3) {
        super(arg0, arg1, arg2, arg3.field4842, false, false);
        this.field4086 = arg3;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V")
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4090++;
        if (arg4 != -8763) {
            this.method128((byte) -98);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)I")
    public final int method126(int arg0) {
        if (arg0 != 20377) {
            field4095 = null;
        }
        field4098++;
        return 0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1828(int arg0, String arg1) {
        field4084++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        if (arg0 > -79) {
            method1830((byte) 22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)I")
    public final int method130(int arg0) {
        if (arg0 != -5582) {
            this.method133(null, -6, null, 85, -118, -64, false);
        }
        field4082++;
        return 0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILoa;)Z")
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        field4091++;
        if (arg2 <= 117) {
            this.method124(53, -52, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Loa;B)Llt;")
    public final class95 method136(class689 arg0, byte arg1) {
        field4081++;
        if (arg1 >= -47) {
            field4096 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILoa;)Lba;")
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        if (arg1 == 17925) {
            field4093++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 <= 118) {
            this.method135(51);
        }
        field4099++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILoa;)V")
    public final void method131(int arg0, class689 arg1) {
        if (arg0 == -20929) {
            field4097++;
        }
    }

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)Z")
    public final boolean method135(int arg0) {
        if (arg0 != 0) {
            this.method132(false);
        }
        field4078++;
        return false;
    }

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "(I)V")
    public static final void method1829(int arg0) {
        field4080++;
        if (class463.field6333 != null) {
            return;
        }
        Container var1;
        if (class250.field3376 != null) {
            var1 = class250.field3376;
        } else if (class372.field5359 == null) {
            var1 = class575.field7958;
        } else {
            var1 = class372.field5359;
        }
        class227.field2965 = var1.getSize().width;
        class649.field9200 = var1.getSize().height;
        if (class250.field3376 == var1) {
            Insets var2 = class250.field3376.getInsets();
            class649.field9200 -= var2.top + var2.bottom;
            class227.field2965 -= var2.right + var2.left;
        }
        if (~class42.method252(-128) == arg0) {
            class243.field3276 = 0;
            class211.field2763 = class384.field5582;
            class303.field4059 = class432.field5995;
            class407.field5739 = (class227.field2965 - class432.field5995) / 2;
        } else {
            class650.method3612(78);
        }
        if (class375.field5396 != class333.field4859) {
            boolean var10000;
            if (class303.field4059 < 1024 && class211.field2763 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class249.field3351.setSize(class303.field4059, class211.field2763);
        if (class9.field103 != null) {
            class9.field103.method1790(class249.field3351);
        }
        if (class250.field3376 == var1) {
            Insets var3 = class250.field3376.getInsets();
            class249.field3351.setLocation(var3.left + class407.field5739, class243.field3276 + var3.top);
        } else {
            class249.field3351.setLocation(class407.field5739, class243.field3276);
        }
        if (class316.field4599 != -1) {
            class255.method1599(true, true);
        }
        class660.method3659(-1);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
    public static void method1830(byte arg0) {
        field4089 = null;
        if (arg0 == 74) {
            field4085 = null;
            field4079 = null;
            field4096 = null;
            field4095 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLoa;)Lvg;")
    public final class162 method134(byte arg0, class689 arg1) {
        field4083++;
        return arg0 <= 121 ? null : this.field4086.method134((byte) 127, arg1);
    }
}
