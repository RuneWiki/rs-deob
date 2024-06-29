import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class196 {

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "Lrc;")
    public static class108 field2904 = new class108(24, -1);

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field2908 = 0;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "Lch;")
    public static class151 field2907 = new class151("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Lap;")
    public static class310 field2909 = new class310(72, -1);

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "Lch;")
    public static class151 field2910 = new class151("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public static int field2911 = 0;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "[I")
    public static int[] field2913 = new int[5];

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1363(int arg0) {
        field2901++;
        if (class181.field2729 == 0) {
            return;
        }
        try {
            if ((++field2908) > 2000) {
                if (class394.field5440 != null) {
                    class394.field5440.method2095(false);
                    class394.field5440 = null;
                }
                if (class67.field973 >= 1) {
                    class39.field530 = -5;
                    class181.field2729 = 0;
                    return;
                }
                if (class239.field3494 == class167.field2427) {
                    class239.field3494 = class442.field6290;
                } else {
                    class239.field3494 = class167.field2427;
                }
                class67.field973++;
                class181.field2729 = 1;
                field2908 = 0;
            }
            if (class181.field2729 == 1) {
                class110.field1535 = class436.field6206.method595(class239.field3494, (byte) 87, class41.field552);
                class181.field2729 = 2;
            }
            if (class181.field2729 == 2) {
                if (class110.field1535.field3979 == 2) {
                    throw new IOException();
                }
                if (class110.field1535.field3979 != 1) {
                    return;
                }
                class394.field5440 = new class332((Socket) class110.field1535.field3984, class436.field6206);
                class110.field1535 = null;
                class394.field5440.method2090(0, class311.field4403.field2262, (byte) -45, class311.field4403.field2298);
                if (class205.field3009 != null) {
                    class205.field3009.method1067((byte) 107);
                }
                if (class411.field5619 != null) {
                    class411.field5619.method1067((byte) 107);
                }
                int var1 = class394.field5440.method2088(-114);
                if (class205.field3009 != null) {
                    class205.field3009.method1067((byte) 107);
                }
                if (class411.field5619 != null) {
                    class411.field5619.method1067((byte) 107);
                }
                if (var1 != 21) {
                    class181.field2729 = 0;
                    class39.field530 = var1;
                    class394.field5440.method2095(false);
                    class394.field5440 = null;
                    return;
                }
                class181.field2729 = 3;
            }
            if (class181.field2729 == 3) {
                if (class394.field5440.method2089(false) < 1) {
                    return;
                }
                class75.field1080 = new String[class394.field5440.method2088(-123)];
                class181.field2729 = 4;
            }
            if (class181.field2729 == arg0 && class394.field5440.method2089(false) >= class75.field1080.length * 8) {
                class46.field710.field2298 = 0;
                class394.field5440.method2094(0, class75.field1080.length * 8, -127, class46.field710.field2262);
                for (int var2 = 0; var2 < class75.field1080.length; var2++) {
                    class75.field1080[var2] = class106.method851((byte) -128, class46.field710.method1170(true));
                }
                class39.field530 = 21;
                class181.field2729 = 0;
                class394.field5440.method2095(false);
                class394.field5440 = null;
            }
        } catch (IOException var3) {
            if (class394.field5440 != null) {
                class394.field5440.method2095(false);
                class394.field5440 = null;
            }
            if (class67.field973 < 1) {
                if (class239.field3494 == class167.field2427) {
                    class239.field3494 = class442.field6290;
                } else {
                    class239.field3494 = class167.field2427;
                }
                class67.field973++;
                field2908 = 0;
                class181.field2729 = 1;
            } else {
                class39.field530 = -4;
                class181.field2729 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V", line = 159)
    public static void method1364(byte arg0) {
        field2904 = null;
        field2909 = null;
        field2910 = null;
        field2907 = null;
        if (arg0 < 6) {
            method1363(-127);
        }
        field2913 = null;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V", line = 173)
    public static final void method1365(byte arg0) {
        int var1 = 85 / ((-arg0 - 33) / 45);
        field2906++;
        class419.field5819.method2109(-1);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lam;Lae;ILkg;IILoj;IBIILjava/lang/String;)V", line = 185)
    public static final void method1366(class199 arg0, class172 arg1, int arg2, class194 arg3, int arg4, int arg5, class405 arg6, int arg7, byte arg8, int arg9, int arg10, String arg11) {
        field2902++;
        int var12;
        if (class390.field5393 == 4) {
            var12 = (int) class91.field1281 & 0x3FFF;
        } else {
            var12 = (int) class91.field1281 + class462.field6529 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field2554 / 2, arg1.field2579 / 2) + 10;
        int var14 = arg4 * arg4 + arg5 * arg5;
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class319.field4501[var12];
        int var16 = class319.field4504[var12];
        if (class390.field5393 != 4) {
            var15 = var15 * 256 / (class20.field216 + 256);
            var16 = var16 * 256 / (class20.field216 + 256);
        }
        int var17 = arg4 * var15 + arg5 * var16 >> 15;
        int var18 = arg4 * var16 - arg5 * var15 >> 15;
        int var19 = arg3.method1350((class417[]) null, arg11, true, 100);
        int var20 = arg3.method1351(0, arg11, (byte) 32, (class417[]) null, 100);
        int var21 = var17 - var19 / 2;
        if (var21 >= (-arg1.field2554) && var21 <= arg1.field2554 && var18 >= (-arg1.field2579) && arg1.field2579 >= var18) {
            arg0.method1378(50, (int[]) null, arg10, arg9, arg9 + arg1.field2579 / 2 - var18 - arg2 - var20, (byte) -104, 0, arg11, arg6, 0, var19, (class417[]) null, 1, 0, arg1.field2554 / 2 + (var21 + arg7), arg7);
            if (arg8 != 65) {
                method1366((class199) null, (class172) null, 70, (class194) null, -92, -90, (class405) null, 35, (byte) -127, 108, 126, (String) null);
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 238)
    public static final String[] method1367(String[] arg0, int arg1) {
        field2905++;
        String[] var2 = new String[5];
        if (arg1 != 31626) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V", line = 266)
    public static final void method1368(int arg0) {
        field2903++;
        if (!class281.field4046) {
            return;
        }
        class464.field6545 = null;
        class281.field4046 = false;
        class318.field4497 = null;
        if (arg0 != -22) {
            method1367((String[]) null, 62);
        }
    }
}
