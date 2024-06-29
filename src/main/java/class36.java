import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class36 {

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field453 = 100;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lnh;")
    public class522 field455;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lo;")
    public static class363[] field444;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 3)
    public static void method232(boolean arg0) {
        if (arg0) {
            method232(true);
        }
        field444 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lfh;II)V", line = 15)
    private final void method233(class194 arg0, int arg1, int arg2) {
        field448++;
        if (arg2 >= -33) {
            return;
        }
        if (arg1 == 1) {
            this.field451 = arg0.method1396(-84);
        } else if (arg1 == 2) {
            this.field445 = arg0.method1337((byte) -107);
            this.field456 = arg0.method1337((byte) 102);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lrr;", line = 48)
    public final synchronized class309 method234(int arg0) {
        field446++;
        class309 var2 = (class309) this.field455.field7673.method1634((long) this.field451, 64);
        if (var2 != null) {
            return var2;
        }
        class309 var3 = class309.method2038(this.field455.field7665, this.field451, arg0);
        if (var3 != null) {
            this.field455.field7673.method1623((long) this.field451, 17621, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILfh;)V", line = 67)
    public final void method235(int arg0, class194 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1337((byte) -125);
            if (var3 == 0) {
                field450++;
                return;
            }
            this.method233(arg1, var3, -65);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpv;[I[IB[I)V", line = 92)
    public static final void method236(class46 arg0, int[] arg1, int[] arg2, byte arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            int var9 = arg2[var5];
            int var10 = 0;
            while (var8 != 0 && arg0.field7606.length > var10) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field7606[var10] = null;
                    } else {
                        class61 var11 = class393.field5735.method1538(-4031, var7);
                        int var12 = var11.field954;
                        class390 var13 = arg0.field7606[var10];
                        if (var13 != null) {
                            if (var13.field5716 == var7) {
                                if (var12 == 0) {
                                    var13 = arg0.field7606[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field5711 = 0;
                                    var13.field5709 = 0;
                                    var13.field5707 = 1;
                                    var13.field5710 = 0;
                                    var13.field5704 = var9;
                                    class439.method2721(false, var11, arg0.field1275, 0, (byte) 116, arg0.field1279, arg0.field1274);
                                } else if (var12 == 2) {
                                    var13.field5709 = 0;
                                }
                            } else if (var11.field971 >= class393.field5735.method1538(-4031, var13.field5716).field971) {
                                var13 = arg0.field7606[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class390 var14 = arg0.field7606[var10] = new class390();
                            var14.field5707 = 1;
                            var14.field5711 = 0;
                            var14.field5710 = 0;
                            var14.field5704 = var9;
                            var14.field5709 = 0;
                            var14.field5716 = var7;
                            class439.method2721(false, var11, arg0.field1275, 0, (byte) 116, arg0.field1279, arg0.field1274);
                        }
                    }
                }
                var10++;
                var8 >>>= 0x1;
            }
        }
        field452++;
        int var6 = -46 % ((7 - arg3) / 47);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILfi;)Lfi;", line = 186)
    public static final class38 method237(int arg0, class38 arg1) {
        field449++;
        class38 var2 = client.method3084(arg1);
        if (arg0 == 26250) {
            if (var2 == null) {
                var2 = arg1.field644;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z", line = 206)
    public static final boolean method238(int arg0, int arg1) {
        if (arg0 == 2) {
            field454++;
            return arg1 == 2 || arg1 == 3 || arg1 == 4 || arg1 == 5;
        } else {
            return false;
        }
    }
}
