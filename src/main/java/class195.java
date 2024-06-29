import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class195 extends class481 implements class161 {

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Les;")
    public class481 field3048;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field3044 = 1401;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "Z")
    public static boolean field3060 = false;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "Lnv;")
    public static class44 field3056 = new class44();

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field3064 = 0;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "Ltk;")
    public static class306 field3052;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "[Laa;")
    public static class76[] field3065;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;IIILps;IZ)V", line = 4)
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 != -750) {
            field3052 = null;
        }
        field3062++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;IZ)Le;", line = 16)
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        field3050++;
        if (!arg2) {
            method1404(-65);
        }
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)Z", line = 28)
    public final boolean method107(byte arg0) {
        if (arg0 == -88) {
            field3058++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;III)Z", line = 39)
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 23) {
            field3056 = null;
        }
        field3046++;
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I", line = 52)
    public final int method99(byte arg0) {
        field3059++;
        if (arg0 != -107) {
            method1404(-54);
        }
        return 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIILfi;)V", line = 64)
    public static final void method1402(int arg0, int arg1, int arg2, class38 arg3) {
        field3043++;
        class340 var4 = arg3.method260(46, class376.field5542);
        if (arg1 != 65532) {
            method1405((byte) -77);
        }
        if (var4 == null) {
            return;
        }
        class376.field5542.method571(arg0, arg2, arg3.field629 + arg0, arg3.field591 + arg2);
        if (class378.field5573 < 3) {
            class56.field863.method2322((float) arg3.field629 / 2.0F + (float) arg0, (float) arg3.field591 / 2.0F + (float) arg2, 4096, (int) (-class434.field6466) & 0x3FFF << 2, var4, arg0, arg2);
        } else {
            class376.field5542.method604(-16777216, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lne;", line = 88)
    public static final class139 method1403(int arg0, int arg1) {
        field3057++;
        int var2 = -69 / ((37 - arg1) / 32);
        class139[] var3 = class315.method2096(-1);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class139 var5 = var3[var4];
            if (var5.field2097 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIILes;)V", line = 113)
    public class195(int arg0, int arg1, int arg2, class481 arg3) {
        super(arg0, arg1, arg2, arg3.field7053, false, false);
        this.field3048 = arg3;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V", line = 121)
    public static final void method1404(int arg0) {
        class312.field4752.method1348((byte) -65, class368.field5421.method736(107));
        field3054++;
        class312.field4752.method1348((byte) -65, class415.field6098.method736(99));
        class312.field4752.method1348((byte) -65, class103.field1596.method736(arg0 ^ 0x7E));
        if (arg0 != 0) {
            method1402(34, 85, -124, null);
        }
        class312.field4752.method1348((byte) -65, class397.field5860.method736(arg0 ^ 0x5E));
        class312.field4752.method1348((byte) -65, class365.field5379.method736(arg0 ^ 0x5E));
        class312.field4752.method1348((byte) -65, class130.field1931.method736(arg0 ^ 0x65));
        class312.field4752.method1348((byte) -65, class417.field6135.method736(88));
        class312.field4752.method1348((byte) -65, class59.field910.method736(arg0 ^ 0x68));
        class312.field4752.method1348((byte) -65, class510.field7431.method736(83));
        class312.field4752.method1348((byte) -65, class489.field7145.method736(arg0 ^ 0x6B));
        class312.field4752.method1348((byte) -65, class274.field4307.method736(75));
        class312.field4752.method1348((byte) -65, class1.field8.method736(arg0 + 100));
        class312.field4752.method1348((byte) -65, class151.field2261.method736(102));
        class312.field4752.method1348((byte) -65, class312.field4754.method736(74));
        class312.field4752.method1348((byte) -65, class144.field2122.method736(117));
        class312.field4752.method1348((byte) -65, class470.field6896.method736(93));
        class312.field4752.method1348((byte) -65, class472.field6932.method736(115));
        class312.field4752.method1348((byte) -65, class105.field1610.method736(107));
        class312.field4752.method1348((byte) -65, class83.field1337.method736(arg0 ^ 0x4F));
        class312.field4752.method1348((byte) -65, class93.field1495.method736(115));
        class312.field4752.method1348((byte) -65, class55.field836.method736(arg0 + 84));
        class312.field4752.method1348((byte) -65, class12.field133.method736(115));
        class312.field4752.method1348((byte) -65, class1.field11.method736(85));
        class312.field4752.method1348((byte) -65, class531.field7764.method736(arg0 ^ 0x47));
        class312.field4752.method1348((byte) -65, class451.field6712.method736(arg0 ^ 0x49));
        class312.field4752.method1348((byte) -65, class486.field7121.method736(94));
        class312.field4752.method1348((byte) -65, class414.field6094.method736(arg0 + 76));
        class312.field4752.method1348((byte) -65, class262.field4175.method736(122));
        class312.field4752.method1348((byte) -65, class93.field1493.method736(110));
        class312.field4752.method1348((byte) -65, class454.field6750.method736(101));
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;B)V", line = 162)
    public final void method96(class299 arg0, byte arg1) {
        field3045++;
        if (arg1 < 78) {
            method1405((byte) -47);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILza;)V", line = 176)
    public final void method98(int arg0, class299 arg1) {
        field3063++;
        if (arg0 != 31203) {
            field3052 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)V", line = 193)
    public static void method1405(byte arg0) {
        field3056 = null;
        field3052 = null;
        if (arg0 > -81) {
            field3065 = null;
        }
        field3065 = null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I", line = 205)
    public final int method103(int arg0) {
        field3042++;
        if (arg0 > -10) {
            this.method104((byte) 28);
        }
        return 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLza;)V", line = 220)
    public final void method100(byte arg0, class299 arg1) {
        field3047++;
        if (arg0 != 51) {
            field3065 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 230)
    public final void method108(int arg0) {
        field3053++;
        int var2 = 76 / ((arg0 - 48) / 37);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I", line = 241)
    public final int method97(int arg0) {
        field3041++;
        return arg0 < 82 ? 34 : 0;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)Z", line = 253)
    public final boolean method104(byte arg0) {
        field3049++;
        int var2 = -48 / ((-arg0 - 41) / 38);
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(ILza;)Lhp;", line = 263)
    public final class293 method110(int arg0, class299 arg1) {
        field3055++;
        if (arg0 != 0) {
            this.method110(109, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 281)
    public final void method106(int arg0) {
        if (arg0 == -19159) {
            field3061++;
        }
    }
}
