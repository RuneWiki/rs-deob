import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class100 {

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "S")
    public short field1651;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "B")
    public byte field1643;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "S")
    public short field1655;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "S")
    public short field1649;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "B")
    public byte field1644;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
    public boolean field1640;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
    public static boolean field1648 = true;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lrn;")
    public static class174 field1642 = new class174(78, -1);

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lbu;")
    public static class17 field1641;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lqj;")
    public static class351 field1654;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIBI)Lmg;")
    public final class100 method742(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -88) {
            method745(8, -93, 83, -115, true, -97);
        }
        field1645++;
        return new class100(arg0, arg2, arg4, arg1, this.field1649, this.field1651, this.field1655, this.field1643, this.field1644, this.field1640);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method743(int arg0) {
        field1642 = null;
        int var1 = -120 % ((arg0 + 69) / 52);
        field1654 = null;
        field1641 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static final void method744(int arg0) {
        field1652++;
        if (class446.field6658 == 0) {
            return;
        }
        try {
            if ((++class513.field7549) > 1500) {
                if (class116.field1927 != null) {
                    class116.field1927.method1305((byte) 104);
                    class116.field1927 = null;
                }
                if (class83.field1447 >= 1) {
                    class446.field6658 = 0;
                    class68.field1169 = -5;
                    return;
                }
                if (class503.field7420 == class307.field4693) {
                    class503.field7420 = class308.field4706;
                } else {
                    class503.field7420 = class307.field4693;
                }
                class446.field6658 = 1;
                class513.field7549 = 0;
                class83.field1447++;
            }
            if (class446.field6658 == 1) {
                class337.field5081 = class368.field5553.method1852(class503.field7420, class171.field2649, (byte) 38);
                class446.field6658 = 2;
            }
            if (arg0 > -45) {
                method744(-7);
            }
            if (class446.field6658 == 2) {
                if (class337.field5081.field4940 == 2) {
                    throw new IOException();
                }
                if (class337.field5081.field4940 != 1) {
                    return;
                }
                class116.field1927 = new class187((Socket) class337.field5081.field4939, class368.field5553);
                class337.field5081 = null;
                class116.field1927.method1304(class410.field6141.field2270, 0, class410.field6141.field2289, (byte) 105);
                class25.method313(false);
                int var1 = class116.field1927.method1309(121);
                class25.method313(false);
                if (var1 != 101) {
                    class68.field1169 = var1;
                    class446.field6658 = 0;
                    class116.field1927.method1305((byte) 126);
                    class116.field1927 = null;
                    return;
                }
                class446.field6658 = 3;
            }
            if (class446.field6658 == 3 && class116.field1927.method1308(14971) >= 2) {
                int var2 = class116.field1927.method1309(107) << 8 | class116.field1927.method1309(119);
                class305.method2000((byte) -65, var2);
                if (class487.field7219 == -1) {
                    class446.field6658 = 0;
                    class68.field1169 = 6;
                    class116.field1927.method1305((byte) -47);
                    class116.field1927 = null;
                } else {
                    class446.field6658 = 0;
                    class116.field1927.method1305((byte) -87);
                    class116.field1927 = null;
                    class148.method1141((byte) 121);
                }
            }
        } catch (IOException var3) {
            if (class116.field1927 != null) {
                class116.field1927.method1305((byte) 118);
                class116.field1927 = null;
            }
            if (class83.field1447 < 1) {
                class513.field7549 = 0;
                class83.field1447++;
                if (class503.field7420 == class307.field4693) {
                    class503.field7420 = class308.field4706;
                } else {
                    class503.field7420 = class307.field4693;
                }
                class446.field6658 = 1;
            } else {
                class446.field6658 = 0;
                class68.field1169 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIZI)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1646++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (!arg4) {
            return;
        }
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class70.field1213 <= arg2 && arg2 <= class389.field5859) {
            int var20 = class9.method50(class315.field4754, arg1 + arg3, class156.field2455, true);
            int var21 = class9.method50(class315.field4754, arg1 - arg3, class156.field2455, true);
            class179.method1269(class21.field430[arg2], arg5, var21, var20, 26985);
        }
        int var22 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var22 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (class70.field1213 <= var24 && var23 <= class389.field5859) {
                int var25 = class9.method50(class315.field4754, arg1 + var6, class156.field2455, true);
                int var26 = class9.method50(class315.field4754, arg1 - var6, class156.field2455, arg4);
                if (var23 >= class70.field1213) {
                    class179.method1269(class21.field430[var23], arg5, var26, var25, 26985);
                }
                if (class389.field5859 >= var24) {
                    class179.method1269(class21.field430[var24], arg5, var26, var25, 26985);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field1651 = (short) arg5;
        this.field1643 = (byte) arg7;
        this.field1655 = (short) arg6;
        this.field1649 = (short) arg4;
        this.field1653 = arg0;
        this.field1644 = (byte) arg8;
        this.field1640 = arg9;
    }
}
