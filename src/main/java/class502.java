import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class502 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Laca;")
    public class130 field7506 = new class130();

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
    public static int[] field7502 = new int[14];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "J")
    public static long field7510;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Laca;")
    private class130 field7514;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Laca;", line = 8)
    public final class130 method3013(byte arg0) {
        field7507++;
        class130 var2 = this.field7514;
        if (this.field7506 == var2) {
            this.field7514 = null;
            return null;
        } else if (arg0 <= 112) {
            return null;
        } else {
            this.field7514 = var2.field1710;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V", line = 28)
    public final void method3014(byte arg0) {
        field7504++;
        while (true) {
            class130 var2 = this.field7506.field1710;
            if (this.field7506 == var2) {
                this.field7514 = null;
                if (arg0 == 75) {
                    return;
                } else {
                    field7502 = null;
                    return;
                }
            }
            var2.method805((byte) 83);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 55)
    public static final void method3015(boolean arg0) {
        field7511++;
        class139.field1826 = arg0;
        class598.method3494(class475.field7252, class290.field4257, (byte) -123, class452.field6607, class218.field3232);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILih;Lqa;)V", line = 70)
    public static final void method3016(int arg0, int arg1, int arg2, int arg3, class158 arg4, class167 arg5) {
        field7509++;
        class402 var6 = class402.field5766.method1711((byte) -96, arg4.field2040);
        if (var6.field5763 == -1) {
            return;
        }
        int var7;
        if (arg4.field2089) {
            int var8 = arg4.field2019 + arg3;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class116 var9 = var6.method2413(arg4.field2083, arg5, (byte) -56, var7);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field2017;
        int var11 = arg4.field2014;
        if ((var7 & 0x1) == 1) {
            var10 = arg4.field2014;
            var11 = arg4.field2017;
        }
        if (arg1 != 0) {
            return;
        }
        int var12 = var9.method722();
        int var13 = var9.method714();
        if (var6.field5762) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field5768 == 0) {
            var9.method715(arg2, arg0 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method234(arg2, arg0 + 4 - (var11 * 4), var12, var13, 0, var6.field5768 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILps;Ljava/lang/String;)I", line = 126)
    public static final int method3017(int arg0, class428 arg1, String arg2) {
        field7505++;
        int var3 = arg1.field6221;
        byte[] var4 = class59.method375(-115, arg2);
        arg1.method2581(true, var4.length);
        arg1.field6221 += class312.field4688.method1988(arg1.field6221, true, arg1.field6162, var4.length, var4, arg0);
        return arg1.field6221 - var3;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 230)
    public class502() {
        this.field7506.field1716 = this.field7506;
        this.field7506.field1710 = this.field7506;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I", line = 146)
    public final int method3018(int arg0) {
        field7513++;
        int var2 = arg0;
        class130 var3 = this.field7506.field1710;
        while (this.field7506 != var3) {
            var3 = var3.field1710;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V", line = 165)
    public static final void method3019(byte arg0) {
        field7512++;
        int var1 = 102 / ((47 - arg0) / 54);
        class170.field2315.method2037(true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Laca;I)V", line = 180)
    public final void method3020(class130 arg0, int arg1) {
        if (arg0.field1716 != null) {
            arg0.method805((byte) 112);
        }
        field7508++;
        if (arg1 == 28598) {
            arg0.field1710 = this.field7506;
            arg0.field1716 = this.field7506.field1716;
            arg0.field1716.field1710 = arg0;
            arg0.field1710.field1716 = arg0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Laca;", line = 200)
    public final class130 method3021(int arg0) {
        field7503++;
        class130 var2 = this.field7506.field1710;
        if (arg0 != -9706) {
            return null;
        } else if (this.field7506 == var2) {
            this.field7514 = null;
            return null;
        } else {
            this.field7514 = var2.field1710;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 221)
    public static void method3022(int arg0) {
        field7502 = null;
        if (arg0 != 0) {
            method3022(21);
        }
    }
}
