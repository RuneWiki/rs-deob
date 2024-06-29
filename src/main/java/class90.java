import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class90 {

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field1437 = -1;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public int field1443 = -1;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1434 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field1440 = -1;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
    public static boolean field1436 = true;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "[I")
    public static int[] field1445 = new int[50];

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
    public int[] field1442;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 7)
    public static final void method710(byte arg0) {
        if (arg0 != -50) {
            return;
        }
        field1441++;
        if (class74.field1118 == 0) {
            return;
        }
        try {
            if ((++class257.field3824) > 2000) {
                if (class319.field5005 != null) {
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                }
                if (class8.field196 >= 1) {
                    class74.field1118 = 0;
                    class42.field663 = -5;
                    return;
                }
                class257.field3824 = 0;
                class74.field1118 = 1;
                class8.field196++;
                if (class166.field2679 == class10.field237) {
                    class166.field2679 = class247.field3681;
                } else {
                    class166.field2679 = class10.field237;
                }
            }
            if (class74.field1118 == 1) {
                class334.field5192 = class92.field1484.method549(class342.field5303, class166.field2679, (byte) 87);
                class74.field1118 = 2;
            }
            if (class74.field1118 == 2) {
                if (class334.field5192.field405 == 2) {
                    throw new IOException();
                }
                if (class334.field5192.field405 != 1) {
                    return;
                }
                class319.field5005 = new class41((Socket) class334.field5192.field409, class92.field1484);
                class334.field5192 = null;
                class319.field5005.method373(arg0 ^ 0xFFFFFFCF, 0, class209.field3305.field34, class209.field3305.field48);
                if (class55.field837 != null) {
                    class55.field837.method2326((byte) 75);
                }
                if (class255.field3765 != null) {
                    class255.field3765.method2326((byte) 113);
                }
                int var1 = class319.field5005.method372(arg0 + 50);
                if (class55.field837 != null) {
                    class55.field837.method2326((byte) 42);
                }
                if (class255.field3765 != null) {
                    class255.field3765.method2326((byte) 110);
                }
                if (var1 != 21) {
                    class74.field1118 = 0;
                    class42.field663 = var1;
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                    return;
                }
                class74.field1118 = 3;
            }
            if (class74.field1118 == 3) {
                if (class319.field5005.method370((byte) 126) < 1) {
                    return;
                }
                class319.field5000 = new String[class319.field5005.method372(0)];
                class74.field1118 = 4;
            }
            if (class74.field1118 == 4) {
                if (class319.field5005.method370((byte) 125) < class319.field5000.length * 8) {
                    return;
                }
                class80.field1248.field48 = 0;
                class319.field5005.method377(10647, 0, class319.field5000.length * 8, class80.field1248.field34);
                for (int var2 = 0; var2 < class319.field5000.length; var2++) {
                    class319.field5000[var2] = class65.method520(73, class80.field1248.method28((byte) -53));
                }
                class74.field1118 = 0;
                class42.field663 = 21;
                class319.field5005.method371(-2);
                class319.field5005 = null;
                return;
            }
        } catch (IOException var4) {
            if (class319.field5005 != null) {
                class319.field5005.method371(-2);
                class319.field5005 = null;
            }
            if (class8.field196 < 1) {
                if (class166.field2679 == class10.field237) {
                    class166.field2679 = class247.field3681;
                } else {
                    class166.field2679 = class10.field237;
                }
                class8.field196++;
                class257.field3824 = 0;
                class74.field1118 = 1;
            } else {
                class74.field1118 = 0;
                class42.field663 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILaj;I)V", line = 168)
    private final void method711(int arg0, int arg1, class1 arg2, int arg3) {
        if (arg0 != -19363) {
            field1434 = (String) null;
        }
        if (arg1 == 1) {
            this.field1443 = arg2.method56(arg0 + 38975);
        } else if (arg1 == 2) {
            this.field1442 = new int[arg2.method15((byte) 96)];
            for (int var5 = 0; var5 < this.field1442.length; var5++) {
                this.field1442[var5] = arg2.method56(19612);
            }
        } else if (arg1 == 3) {
            this.field1437 = arg2.method15((byte) 123);
        }
        field1438++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Laj;II)V", line = 201)
    public final void method712(class1 arg0, int arg1, int arg2) {
        field1447++;
        while (true) {
            int var4 = arg0.method15((byte) 102);
            if (var4 == 0) {
                if (arg1 != -8625) {
                    method717(false);
                }
                return;
            }
            this.method711(arg1 - 10738, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I", line = 222)
    public static final int method713(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method717(false);
        }
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        field1446++;
        return arg2;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 251)
    public static final void method714(byte arg0) {
        if (arg0 != -112) {
            field1440 = -50;
        }
        field1435++;
        for (class43 var1 = (class43) class181.field2876.method268(arg0 ^ 0x6F); var1 != null; var1 = (class43) class181.field2876.method278(1)) {
            if (var1.field682 == -1) {
                var1.field685 = 0;
                class81.method632(var1, -28284);
            } else {
                var1.method489(false);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZZ)V", line = 284)
    public static final void method715(boolean arg0, boolean arg1) {
        field1444++;
        byte[][] var2;
        byte var3;
        if (class162.field2623 && arg0) {
            var2 = class126.field2020;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class14.field307;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            int[] var7 = null;
            int var8 = class338.field5218[var5] >> 8;
            int var9 = class338.field5218[var5] & 0xFF;
            int var10 = var8 * 64 - class117.field1902;
            int var11 = var9 * 64 - class133.field2118;
            if (var6 != null) {
                class178.method1310(16);
                var7 = class243.method1718(class133.field2118, class117.field1902, arg0, var11, var6, class166.field2686, 13, var10);
            }
            if (!arg0 && class211.field3316 / 8 == var8 && client.field4119 / 8 == var9) {
                if (var7 == null) {
                    class221.field3452 = -1;
                } else {
                    class171.field2749 = var7[4];
                    class318.field4990 = var7[1];
                    class334.field5200 = var7[3];
                    class221.field3452 = var7[0];
                    class145.field2351 = var7[2];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class338.field5218[var12] >> 8) * 64 - class117.field1902;
            byte[] var14 = var2[var12];
            int var15 = (class338.field5218[var12] & 0xFF) * 64 - class133.field2118;
            if (var14 == null && client.field4119 < 800) {
                class178.method1310(16);
                for (int var16 = 0; var16 < var3; var16++) {
                    class303.method2155(var13, var16, 59, 64, 64, var15);
                }
            }
        }
        if (!arg1) {
            method717(false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BIIIII)V", line = 391)
    public static final void method716(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1439++;
        if (arg0 != 95) {
            field1445 = (int[]) null;
        }
        if (arg3 == arg4) {
            class17.method195(arg0 ^ 0xD74, arg4, arg2, arg1, arg5);
        } else if (arg1 - arg4 >= class310.field4897 && arg1 + arg4 <= class180.field2862 && class104.field1719 <= arg5 - arg3 && class333.field5188 >= arg3 + arg5) {
            class121.method971(arg2, arg3, arg0 - 94, arg5, arg1, arg4);
        } else {
            class30.method272(arg3, arg5, arg2, arg1, (byte) -76, arg4);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 415)
    public static void method717(boolean arg0) {
        field1434 = null;
        if (arg0) {
            field1445 = null;
        }
    }
}
