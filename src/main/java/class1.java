import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 {

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    private int[] field11 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public int field5 = -1;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Z")
    public boolean field21 = false;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lke;")
    private static class256 field20 = class316.method2202("Created gameworld", 27626);

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lke;")
    public static class256 field8 = field20;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
    private int[] field19;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "[S")
    private short[] field13;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[S")
    private short[] field14;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[S")
    private short[] field16;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[S")
    private short[] field9;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[[[Lmh;")
    public static class271[][][] field4;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method1(int arg0) {
        field12++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field11[var3] != -1 && !class206.field3727.method1021(this.field11[var3], -88, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lfm;", line = 30)
    public final class315 method2(int arg0) {
        field3++;
        if (this.field19 == null) {
            return null;
        }
        class315[] var2 = new class315[this.field19.length];
        for (int var3 = arg0; var3 < this.field19.length; var3++) {
            var2[var3] = class315.method2191(class206.field3727, this.field19[var3], 0);
        }
        class315 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class315(var2, var2.length);
        }
        if (this.field13 != null) {
            for (int var5 = 0; var5 < this.field13.length; var5++) {
                var4.method2175(this.field13[var5], this.field14[var5]);
            }
        }
        if (this.field16 != null) {
            for (int var6 = 0; var6 < this.field16.length; var6++) {
                var4.method2193(this.field16[var6], this.field9[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Z", line = 85)
    public static final boolean method3(int arg0) {
        field1++;
        class48 var1 = class233.field3981;
        synchronized (class233.field3981) {
            if (class98.field1757 == class30.field472) {
                return false;
            } else {
                class7.field116 = class256.field4408[class98.field1757];
                class318.field5475 = class85.field1536[class98.field1757];
                class98.field1757 = arg0 & class98.field1757 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Lfm;", line = 105)
    public final class315 method4(byte arg0) {
        field10++;
        class315[] var2 = new class315[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field11[var4] != -1) {
                var2[var3++] = class315.method2191(class206.field3727, this.field11[var4], 0);
            }
        }
        class315 var5 = new class315(var2, var3);
        if (arg0 != -68) {
            this.method1(-125);
        }
        if (this.field13 != null) {
            for (int var6 = 0; var6 < this.field13.length; var6++) {
                var5.method2175(this.field13[var6], this.field14[var6]);
            }
        }
        if (this.field16 != null) {
            for (int var7 = 0; var7 < this.field16.length; var7++) {
                var5.method2193(this.field16[var7], this.field9[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V", line = 167)
    public static final void method5(int arg0, int arg1) {
        if (arg0 <= 16) {
            method10((class144) null, -127);
        }
        class100.field1785.method2075(arg1, 1);
        class14.field183.method2075(arg1, 1);
        field2++;
        class45.field837.method2075(arg1, 1);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Z", line = 183)
    public final boolean method6(byte arg0) {
        field15++;
        if (this.field19 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 < 40) {
            method3(35);
        }
        for (int var3 = 0; var3 < this.field19.length; var3++) {
            if (!class206.field3727.method1021(this.field19[var3], -101, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V", line = 209)
    public static void method7(int arg0) {
        field20 = null;
        field4 = (class271[][][]) null;
        field8 = null;
        if (arg0 > -85) {
            field8 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lra;B)V", line = 234)
    public final void method8(class41 arg0, byte arg1) {
        if (arg1 != 110) {
            this.field21 = true;
        }
        field22++;
        while (true) {
            int var3 = arg0.method357(false);
            if (var3 == 0) {
                return;
            }
            this.method11(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 254)
    public static final void method9(Component arg0, boolean arg1) {
        if (!arg1) {
            method7(-33);
        }
        arg0.addMouseListener(class129.field2261);
        field18++;
        arg0.addMouseMotionListener(class129.field2261);
        arg0.addFocusListener(class129.field2261);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lrb;I)I", line = 268)
    public static final int method10(class144 arg0, int arg1) {
        if (arg1 != 127) {
            field8 = (class256) null;
        }
        int var2 = arg0.field2512;
        field6++;
        if (arg0.field1238 == arg0.field1236) {
            var2 = arg0.field2514;
        } else if (arg0.field1236 == arg0.field1218) {
            var2 = arg0.field2558;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILra;)V", line = 289)
    private final void method11(int arg0, int arg1, class41 arg2) {
        if (arg1 != 0) {
            return;
        }
        field7++;
        if (arg0 == 1) {
            this.field5 = arg2.method357(false);
        } else if (arg0 == 2) {
            int var8 = arg2.method357(false);
            this.field19 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field19[var9] = arg2.method346(-16);
            }
        } else if (arg0 == 3) {
            this.field21 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method357(false);
            this.field14 = new short[var6];
            this.field13 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field13[var7] = (short) arg2.method346(class288.method2011(arg1, -16));
                this.field14[var7] = (short) arg2.method346(-16);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method357(false);
            this.field9 = new short[var4];
            this.field16 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field16[var5] = (short) arg2.method346(-16);
                this.field9[var5] = (short) arg2.method346(-16);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field11[arg0 - 60] = arg2.method346(-16);
        }
    }
}
