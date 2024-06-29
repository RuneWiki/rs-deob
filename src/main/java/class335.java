import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class335 extends class46 {

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Z")
    public boolean field5234;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[Lsi;")
    public class335[] field5237;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Lka;")
    public static class104 field5236 = new class104(5000);

    @OriginalMember(owner = "client!si", name = "w", descriptor = "Lpg;")
    public static class320 field5238 = new class320(200);

    @OriginalMember(owner = "client!si", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field5252 = new String[100];

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public int field5230;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "J")
    public static long field5249;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Lwa;")
    public class162 field5232;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Lmk;")
    public class163 field5233;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Lqd;")
    public static class252 field5251;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZI)[[I", line = 8)
    public final int[][] method2328(int arg0, boolean arg1, int arg2) {
        field5245++;
        if (arg1) {
            this.method1649(-33);
        }
        if (!this.field5237[arg2].field5234) {
            return this.field5237[arg2].method249(arg0, (byte) 51);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field5237[arg2].method149(arg0, 621);
        var4[2] = var5;
        var4[0] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILkh;I)V", line = 44)
    public void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 <= 51) {
            this.method381(80);
        }
        field5235++;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V", line = 57)
    public void method1649(int arg0) {
        int var2 = 66 % ((-arg0 - 79) / 34);
        if (this.field5234) {
            this.field5233.method1106((byte) 126);
            this.field5233 = null;
        } else {
            this.field5232.method1105(3466);
            this.field5232 = null;
        }
        field5243++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 82)
    public static void method2329(byte arg0) {
        field5236 = null;
        field5238 = null;
        field5252 = null;
        if (arg0 != 114) {
            field5252 = (String[]) null;
        }
        field5251 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)I", line = 100)
    public int method2194(byte arg0) {
        if (arg0 != 112) {
            field5251 = (class252) null;
        }
        field5231++;
        return -1;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IZI)[I", line = 111)
    public final int[] method2330(int arg0, boolean arg1, int arg2) {
        field5242++;
        if (!arg1) {
            this.method2330(-58, false, 77);
        }
        return this.field5237[arg2].field5234 ? this.field5237[arg2].method149(arg0, 621) : this.field5237[arg2].method249(arg0, (byte) 51)[0];
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[[I", line = 138)
    public int[][] method249(int arg0, byte arg1) {
        if (arg1 != 51) {
            this.method2332(4, -98, -15);
        }
        field5248++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V", line = 156)
    public void method381(int arg0) {
        field5244++;
        int var2 = 50 % ((arg0 - 44) / 35);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLki;Ljava/awt/Frame;)V", line = 172)
    public static final void method2331(byte arg0, class180 arg1, Frame arg2) {
        field5250++;
        while (true) {
            class197 var3 = arg1.method1290(arg2, 121);
            while (var3.field2956 == 0) {
                class5.method26(arg0 ^ 0xFFFFFF9B, 10L);
            }
            if (var3.field2956 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                if (arg0 != -101) {
                    method2331((byte) -30, (class180) null, (Frame) null);
                }
                return;
            }
            class5.method26(arg0 ^ 0xFFFFFF9B, 100L);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)[I", line = 198)
    public int[] method149(int arg0, int arg1) {
        field5246++;
        if (arg1 == 621) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V", line = 213)
    public final void method2332(int arg0, int arg1, int arg2) {
        field5240++;
        int var4 = this.field5230 == 255 ? arg0 : this.field5230;
        if (arg1 != 21378) {
            this.method381(1);
        }
        if (this.field5234) {
            this.field5233 = new class163(var4, arg0, arg2);
        } else {
            this.field5232 = new class162(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)I", line = 240)
    public int method1650(boolean arg0) {
        field5241++;
        if (!arg0) {
            this.method2194((byte) -33);
        }
        return -1;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IZ)V", line = 252)
    public class335(int arg0, boolean arg1) {
        this.field5234 = arg1;
        this.field5237 = new class335[arg0];
    }
}
