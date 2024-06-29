import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class135 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lno;")
    private class494 field2056 = null;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    private int field2064 = 65000;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lno;")
    private class494 field2067 = null;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[[I")
    public static int[][] field2059 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2065 = -1;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lwt;")
    public static class202 field2057 = new class202("", 16);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lic;")
    public static class491 field2068;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[B")
    public final byte[] method893(int arg0, int arg1) {
        field2063++;
        class494 var3 = this.field2067;
        synchronized (this.field2067) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field2056.method2962(-105)) {
                    return null;
                }
                this.field2056.method2960(0, (long) (arg1 * 6));
                this.field2056.method2958(6, 0, false, class48.field777);
                int var5 = (class48.field777[0] & 0xFF << 16) + (class48.field777[1] & 0xFF << 8) + (class48.field777[2] & 0xFF);
                int var6 = (class48.field777[3] & 0xFF << 16) + (class48.field777[4] & 0xFF << 8) + (arg0 & class48.field777[5]);
                if (var5 < 0 || var5 > this.field2064) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field2067.method2962(arg0 - 363) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2067.method2960(arg0 ^ 0xFF, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2067.method2958(var13 + 8, 0, false, class48.field777);
                        int var14 = (class48.field777[0] & 0xFF << 8) + (class48.field777[1] & 0xFF);
                        int var15 = (class48.field777[2] & 0xFF << 8) + (class48.field777[3] & 0xFF);
                        int var16 = (class48.field777[5] & 0xFF << 8) + ((class48.field777[4] & 0xFF) << 16) + (class48.field777[6] & 0xFF);
                        int var17 = class48.field777[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field2058 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field2067.method2962(-55) / 520L) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class48.field777[var20 + 8];
                                }
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIZI)Z")
    private final boolean method894(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2061++;
        class494 var6 = this.field2067;
        synchronized (this.field2067) {
            try {
                int var7;
                if (arg3) {
                    if (this.field2056.method2962(-111) < ((long) (arg1 * 6 + 6))) {
                        return false;
                    }
                    this.field2056.method2960(0, (long) (arg1 * 6));
                    this.field2056.method2958(6, 0, false, class48.field777);
                    var7 = (class48.field777[4] & 0xFF << 8) + (class48.field777[3] & 0xFF << 16) + (class48.field777[5] & 0xFF);
                    if (var7 <= 0 || this.field2067.method2962(-119) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2067.method2962(-57) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class48.field777[5] = (byte) var7;
                class48.field777[3] = (byte) (var7 >> 16);
                class48.field777[1] = (byte) (arg4 >> 8);
                class48.field777[4] = (byte) (var7 >> 8);
                class48.field777[2] = (byte) arg4;
                class48.field777[0] = (byte) (arg4 >> 16);
                this.field2056.method2960(0, (long) (arg1 * arg2));
                this.field2056.method2965(-28186, 6, class48.field777, 0);
                int var10 = 0;
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label105: {
                            this.field2067.method2960(0, (long) (var7 * 520));
                            try {
                                this.field2067.method2958(8, 0, false, class48.field777);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class48.field777[0] & 0xFF) << 8) + (class48.field777[1] & 0xFF);
                            var12 = ((class48.field777[4] & 0xFF) << 16) + ((class48.field777[5] & 0xFF) << 8) + (class48.field777[6] & 0xFF);
                            int var14 = ((class48.field777[2] & 0xFF) << 8) + (class48.field777[3] & 0xFF);
                            int var15 = class48.field777[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field2058 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field2067.method2962(-103) / 520L)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field2067.method2962(-124) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class48.field777[3] = (byte) var11;
                    class48.field777[2] = (byte) (var11 >> 8);
                    class48.field777[0] = (byte) (arg1 >> 8);
                    class48.field777[1] = (byte) arg1;
                    if ((arg4 - var10) <= 512) {
                        var12 = 0;
                    }
                    class48.field777[5] = (byte) (var12 >> 8);
                    class48.field777[6] = (byte) var12;
                    class48.field777[4] = (byte) (var12 >> 16);
                    class48.field777[7] = (byte) this.field2058;
                    this.field2067.method2960(0, (long) (var7 * 520));
                    this.field2067.method2965(-28186, 8, class48.field777, 0);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field2067.method2965(-28186, var18, arg0, var10);
                    var11++;
                    var7 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BBI)Z")
    public final boolean method895(int arg0, byte[] arg1, byte arg2, int arg3) {
        field2066++;
        class494 var5 = this.field2067;
        synchronized (this.field2067) {
            if (arg0 < 0 || this.field2064 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method894(arg1, arg3, 6, true, arg0);
            if (arg2 >= -42) {
                this.field2056 = null;
            }
            if (!var6) {
                var6 = this.method894(arg1, arg3, 6, false, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method896(int arg0) {
        field2062++;
        class335.field4729.method1774((byte) 97, 5);
        class493.field7291.method1646(5, -1);
        class456.field6745.method398(5, false);
        class252.field3743.method2691(-100, 5);
        class431.field6451.method1736(arg0 ^ arg0, 5);
        class294.field4196.method455(5, (byte) 61);
        class84.field1295.method1185(5, false);
        class512.field7494.method2729(5, (byte) -98);
        class64.field961.method3039(5, (byte) 125);
        class377.field5753.method1672(5, false);
        class45.field717.method1815(5, 114);
        class14.field176.method540(5, arg0 ^ 0x7B);
        class57.field872.method1204(5, -1476186137);
        class381.field5778.method505(-90, 5);
        class140.field2104.method669(false, 5);
        class77.field1154.method2334(arg0 ^ 0xE, 5);
        class515.field7515.method2377(0, 5);
        class449.field6685.method375(120, 5);
        class26.field282.method216(-77, 5);
        class91.field1368.method1604(2079318495, 5);
        class437.method2627(5, (byte) -78);
        class176.method1196(50, 125);
        class78.method456(5, (byte) 125);
        class271.method1781(5, arg0 ^ 0xFFFFFFC3);
        class333.field4698.method1534(0, 5);
        class148.field2202.method1534(0, 5);
        class43.field670.method1534(0, 5);
        class264.field3860.method1534(0, 5);
        class360.field5543.method1534(arg0 ^ 0x6, 5);
    }

    @OriginalMember(owner = "client!oc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2060++;
        return "Cache:" + this.field2058;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method897(int arg0) {
        if (arg0 == 0) {
            field2059 = null;
            field2068 = null;
            field2057 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method898(int arg0, String arg1) {
        int var2 = -11 % ((52 - arg0) / 51);
        field2055++;
        if (arg1 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class61.field927; var3++) {
            if (arg1.equalsIgnoreCase(class359.field5515[var3])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class338.field4750[var3])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILno;Lno;I)V")
    public class135(int arg0, class494 arg1, class494 arg2, int arg3) {
        this.field2064 = arg3;
        this.field2058 = arg0;
        this.field2067 = arg1;
        this.field2056 = arg2;
    }
}
