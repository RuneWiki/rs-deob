import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class80 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field1309 = 64;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Z")
    public boolean field1307 = false;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field1311 = 64;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Z")
    public boolean field1306 = false;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field1317 = 2;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public int field1321 = 1;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field1318 = -1;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Z")
    public static boolean field1314 = true;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[I")
    public static int[] field1310 = new int[13];

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lpn;")
    public static class49 field1323 = new class49(1, 8);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Lwn;")
    public static class177 field1322;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 4)
    public static final void method707(int arg0) {
        class422.field6205 = 0;
        field1308++;
        if (arg0 != 50) {
            return;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class447.field6645[var1] = null;
            class438.field6537[var1] = 1;
            class434.field6453[var1] = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lfh;BII)V", line = 28)
    private final void method708(class194 arg0, byte arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field1318 = arg0.method1396(39);
            if (this.field1318 == 65535) {
                this.field1318 = -1;
            }
        } else if (arg3 == 2) {
            this.field1311 = arg0.method1396(-98) + 1;
            this.field1309 = arg0.method1396(arg1 ^ 0xFFFFFF9D) + 1;
        } else if (arg3 == 3) {
            arg0.method1398(60);
        } else if (arg3 == 4) {
            this.field1317 = arg0.method1337((byte) -119);
        } else if (arg3 == 5) {
            this.field1321 = arg0.method1337((byte) -125);
        } else if (arg3 == 6) {
            this.field1306 = true;
        } else if (arg3 == 7) {
            this.field1307 = true;
        }
        field1319++;
        if (arg1 != 19) {
            this.field1309 = -124;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 77)
    public static void method709(int arg0) {
        field1322 = null;
        if (arg0 == -7) {
            field1310 = null;
            field1323 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILfh;I)V", line = 90)
    public final void method710(int arg0, class194 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1337((byte) -126);
            if (var4 == 0) {
                if (arg0 != -7855) {
                    return;
                }
                field1312++;
                return;
            }
            this.method708(arg1, (byte) 19, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 114)
    public static final void method711(int arg0) {
        class350.field5216.method1637((byte) 13);
        field1313++;
        if (arg0 != 1) {
            method709(21);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIFBIIIZ)[[I", line = 144)
    public static final int[][] method712(int arg0, int arg1, int arg2, float arg3, byte arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field1320++;
        int[][] var9 = new int[arg6][arg1];
        class47 var10 = new class47();
        var10.field735 = arg5;
        var10.field740 = arg8;
        var10.field742 = arg0;
        var10.field751 = arg2;
        var10.field753 = (int) (arg3 * 4096.0F);
        var10.method17((byte) -62);
        int var11 = 87 / ((arg4 - 9) / 32);
        class178.method1258(true, arg6, arg1);
        for (int var12 = 0; var12 < arg6; var12++) {
            var10.method322(var9[var12], var12, (byte) 56);
        }
        return var9;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 177)
    public static final void method713(int arg0) {
        field1315++;
        int var1 = 0;
        if (arg0 != -14703) {
            method712(84, -31, -87, -1.3091192F, (byte) -39, -114, -35, 120, false);
        }
        while (var1 < 100) {
            class434.field6439[var1] = true;
            var1++;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V", line = 197)
    public static final void method714(int arg0, boolean arg1) {
        class425.method2644(27576);
        field1316++;
        if (!class434.method2698(true, class460.field6813)) {
            return;
        }
        class397.field5857++;
        if (class397.field5857 < 50 && !arg1) {
            return;
        }
        class397.field5857 = 0;
        if (!class295.field4544 && class541.field7922 != null) {
            class306.field4686++;
            class110.method857(4095, class406.field6000);
            try {
                class541.field7922.method2159(-15728, class312.field4752.field2982, 0, class312.field4752.field2973);
                class312.field4752.field2982 = 0;
            } catch (IOException var2) {
                class295.field4544 = true;
            }
        }
        class425.method2644(arg0 + 29146);
        if (arg0 != -1570) {
            field1314 = false;
        }
    }
}
