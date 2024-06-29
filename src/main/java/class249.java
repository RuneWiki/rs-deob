import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class249 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lap;")
    public static class335 field3189 = new class335("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3192;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Z")
    public static boolean field3194;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
    public static int[] field3193;

    static {
        new class335("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field3191 = 0;
        field3192 = new Color[] { new Color(9179409), new Color(16777215) };
        field3194 = false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lob;IBI)V", line = 3)
    public static final void method1510(class520 arg0, int arg1, byte arg2, int arg3) {
        field3190++;
        if (arg0 == null || class201.field2616.field268 == arg0) {
            return;
        }
        int var4 = arg0.field7507;
        int var5 = arg0.field7511;
        int var6 = arg0.field7508;
        int var7 = (int) arg0.field7517;
        long var8 = arg0.field7517;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 59) {
            class359.field4636 = arg1;
            class353.field4542 = 2;
            class203.field2646 = arg3;
            class422.field5985 = 0;
            class200.field2606++;
            class282.method1669(class316.field4033, false);
            class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
            class40.field511.method2785((int) (var8 >>> 32) & Integer.MAX_VALUE, 15103);
            class40.field511.method2783(var4 + class441.field6317, arg2 + -578373114);
            class40.field511.method2783(var5 + class320.field4064, -578373112);
            class328.method1910(var8, var5, (byte) 94, var4);
        }
        if (var6 == 3) {
            class359.field4636 = arg1;
            class203.field2646 = arg3;
            class353.field4542 = 2;
            class75.field949++;
            class422.field5985 = 0;
            class282.method1669(class524.field7755, false);
            class40.field511.method2759((byte) -103, class441.field6317 + var4);
            class40.field511.method2783((int) (var8 >>> 32) & Integer.MAX_VALUE, arg2 ^ 0xDD86BA0A);
            class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
            class40.field511.method2759((byte) -22, var5 + class320.field4064);
            class328.method1910(var8, var5, (byte) 94, var4);
        }
        if (var6 == 17) {
            if (class322.field4086 > 0 && class343.field4392.method834(false, 82) && class343.field4392.method834(false, 81)) {
                class521.method3101(class23.field336.field2676, class320.field4064 + var5, false, class441.field6317 + var4);
            } else {
                class353.field4542 = 1;
                class359.field4636 = arg1;
                class422.field5985 = 0;
                class428.field6078++;
                class203.field2646 = arg3;
                class282.method1669(class338.field4247, false);
                class40.field511.method2783(class441.field6317 + var4, -578373112);
                class40.field511.method2748(class320.field4064 + var5, 8016);
            }
        }
        if (var6 == 18) {
            class359.field4636 = arg1;
            class422.field5985 = 0;
            class353.field4542 = 2;
            class203.field2646 = arg3;
            class47.field587++;
            class282.method1669(class261.field3305, false);
            class40.field511.method2783(class320.field4064 + var5, arg2 + -578373114);
            class40.field511.method2729(class343.field4392.method834(false, 82) ? 1 : 0, false);
            class40.field511.method2748(var7, 8016);
            class40.field511.method2759((byte) -15, class441.field6317 + var4);
            class469.method2835(var4, var5, (byte) -113);
        }
        if (var6 == 60) {
            class353.field4542 = 1;
            class359.field4636 = arg1;
            class422.field5985 = 0;
            class483.field7062++;
            class203.field2646 = arg3;
            class282.method1669(class153.field1939, false);
            class40.field511.method2747(class21.field309, 1108);
            class40.field511.method2785(class441.field6317 + var4, 15103);
            class40.field511.method2785(class320.field4064 + var5, 15103);
            class40.field511.method2783(class322.field4090, arg2 - 578373114);
            class40.field511.method2759((byte) -109, class470.field6816);
            class456.method2708(-4, true, var4, 1, var5, 0, 1, 30799, 0);
        }
        if (var6 == 30) {
            class359.field4636 = arg1;
            class203.field2646 = arg3;
            class353.field4542 = 2;
            class422.field5985 = 0;
            class126.field1676++;
            class282.method1669(class159.field2023, false);
            class40.field511.method2778(class21.field309, 104);
            class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
            class40.field511.method2783(class470.field6816, -578373112);
            class40.field511.method2783(class322.field4090, -578373112);
            class40.field511.method2748(class23.field336.field4890, 8016);
        }
        if (var6 == 21) {
            class223 var10 = class387.field5107[var7];
            if (var10 != null) {
                class353.field4542 = 2;
                class231.field2952++;
                class203.field2646 = arg3;
                class422.field5985 = 0;
                class359.field4636 = arg1;
                class282.method1669(class188.field2459, false);
                class40.field511.method2759((byte) -117, var7);
                class40.field511.method2788(class343.field4392.method834(false, 82) ? 1 : 0, 30017);
                class456.method2708(-2, true, var10.field4944[0], var10.method1366((byte) -120), var10.field4936[0], 0, var10.method1366((byte) -113), 30799, 0);
            }
        }
        if (var6 == 23) {
            class223 var11 = class387.field5107[var7];
            if (var11 != null) {
                class385.field5061++;
                class422.field5985 = 0;
                class203.field2646 = arg3;
                class359.field4636 = arg1;
                class353.field4542 = 2;
                class282.method1669(class276.field3484, false);
                class40.field511.method2748(var7, arg2 ^ 0x1F52);
                class40.field511.method2729(class343.field4392.method834(false, 82) ? 1 : 0, false);
                class456.method2708(-2, true, var11.field4944[0], var11.method1366((byte) -94), var11.field4936[0], 0, var11.method1366((byte) -107), arg2 ^ 0x784D, 0);
            }
        }
        if (var6 == 1002) {
            class203.field2646 = arg3;
            class52.field689++;
            class422.field5985 = 0;
            class353.field4542 = 2;
            class359.field4636 = arg1;
            class282.method1669(class189.field2473, false);
            class40.field511.method2788(class343.field4392.method834(false, 82) ? 1 : 0, 30017);
            class40.field511.method2783(var4 + class441.field6317, -578373112);
            class40.field511.method2748(Integer.MAX_VALUE & (int) (var8 >>> 32), arg2 ^ 0x1F52);
            class40.field511.method2748(class320.field4064 + var5, 8016);
            class328.method1910(var8, var5, (byte) 94, var4);
        }
        if (var6 == 4 && class466.field6723 == null) {
            class153.method998(var4, -25347, var5);
            class466.field6723 = class202.method1268(var5, var4, 0);
            class136.method935(class466.field6723, arg2 - 129);
        }
        if (var6 == 47 || var6 == 1012) {
            class321.method1887(var5, arg0.field7506, var4, var7, 119);
        }
        if (var6 == 20) {
            class223 var12 = class387.field5107[var7];
            if (var12 != null) {
                class203.field2646 = arg3;
                class353.field4542 = 2;
                class359.field4636 = arg1;
                class116.field1565++;
                class422.field5985 = 0;
                class282.method1669(class10.field162, false);
                class40.field511.method2748(var7, 8016);
                class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
                class456.method2708(-2, true, var12.field4944[0], var12.method1366((byte) -112), var12.field4936[0], 0, var12.method1366((byte) -94), arg2 ^ 0x784D, 0);
            }
        }
        if (var6 == 50) {
            class223 var13 = class387.field5107[var7];
            if (var13 != null) {
                class28.field393++;
                class422.field5985 = 0;
                class359.field4636 = arg1;
                class203.field2646 = arg3;
                class353.field4542 = 2;
                class282.method1669(class213.field2739, false);
                class40.field511.method2785(var7, 15103);
                class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
                class456.method2708(-2, true, var13.field4944[0], var13.method1366((byte) -114), var13.field4936[0], 0, var13.method1366((byte) -119), arg2 ^ 0x784D, 0);
            }
        }
        if (var6 == 15) {
            if (class322.field4086 > 0 && class343.field4392.method834(false, 82) && class343.field4392.method834(false, 81)) {
                class521.method3101(class23.field336.field2676, class320.field4064 + var5, false, class441.field6317 + var4);
            } else {
                class513.method3065(var4, var7, var5, (byte) 112);
                if (var7 == 1) {
                    class40.field511.method2729(-1, false);
                    class40.field511.method2729(-1, false);
                    class40.field511.method2759((byte) -38, (int) class463.field6626);
                    class40.field511.method2729(57, false);
                    class40.field511.method2729(class309.field3967, false);
                    class40.field511.method2729(class317.field4050, false);
                    class40.field511.method2729(89, false);
                    class40.field511.method2759((byte) -46, class23.field336.field2666);
                    class40.field511.method2759((byte) -92, class23.field336.field2677);
                    class40.field511.method2729(63, false);
                } else {
                    class422.field5985 = 0;
                    class203.field2646 = arg3;
                    class353.field4542 = 1;
                    class359.field4636 = arg1;
                }
                class456.method2708(-4, true, var4, 1, var5, 0, 1, 30799, 0);
            }
        }
        if (var6 == 46) {
            class128.field1700++;
            class422.field5985 = 0;
            class203.field2646 = arg3;
            class353.field4542 = 2;
            class359.field4636 = arg1;
            class282.method1669(class129.field1705, false);
            class40.field511.method2783(class441.field6317 + var4, -578373112);
            class40.field511.method2759((byte) -111, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class40.field511.method2785(class320.field4064 + var5, 15103);
            class40.field511.method2788(class343.field4392.method834(false, 82) ? 1 : 0, 30017);
            class328.method1910(var8, var5, (byte) 94, var4);
        }
        if (arg2 != 2) {
            field3193 = null;
        }
        if (var6 == 6) {
            class359.field4636 = arg1;
            class72.field930++;
            class422.field5985 = 0;
            class203.field2646 = arg3;
            class353.field4542 = 2;
            class282.method1669(class441.field6313, false);
            class40.field511.method2788(class343.field4392.method834(false, 82) ? 1 : 0, arg2 + 30015);
            class40.field511.method2748(class441.field6317 + var4, 8016);
            class40.field511.method2785(class320.field4064 + var5, 15103);
            class40.field511.method2783((int) (var8 >>> 32) & Integer.MAX_VALUE, -578373112);
            class328.method1910(var8, var5, (byte) 94, var4);
        }
        if (var6 == 10) {
            class223 var14 = class387.field5107[var7];
            if (var14 != null) {
                class359.field4636 = arg1;
                class353.field4542 = 2;
                class422.field5985 = 0;
                class203.field2646 = arg3;
                class450.field6455++;
                class282.method1669(class124.field1660, false);
                class40.field511.method2759((byte) -31, var7);
                class40.field511.method2765(class343.field4392.method834(false, 82) ? 1 : 0, false);
                class456.method2708(-2, true, var14.field4944[0], var14.method1366((byte) -87), var14.field4936[0], 0, var14.method1366((byte) -105), 30799, 0);
            }
        }
        if (var6 == 8) {
            class295 var15 = class187.field2446[var7];
            if (var15 != null) {
                class203.field2646 = arg3;
                class145.field1855++;
                class359.field4636 = arg1;
                class353.field4542 = 2;
                class422.field5985 = 0;
                class282.method1669(class386.field5068, false);
                class40.field511.method2726(arg2 ^ 0xFFFF89F7, class343.field4392.method834(false, 82) ? 1 : 0);
                class40.field511.method2759((byte) -114, var7);
                class456.method2708(-2, true, var15.field4944[0], var15.method1366((byte) -106), var15.field4936[0], 0, var15.method1366((byte) -104), 30799, 0);
            }
        }
        if (var6 == 16) {
            class295 var16 = class187.field2446[var7];
            if (var16 != null) {
                class422.field5985 = 0;
                class415.field5912++;
                class359.field4636 = arg1;
                class353.field4542 = 2;
                class203.field2646 = arg3;
                class282.method1669(class293.field3755, false);
                class40.field511.method2729(class343.field4392.method834(false, 82) ? 1 : 0, false);
                class40.field511.method2748(var7, 8016);
                class40.field511.method2748(class470.field6816, arg2 + 8014);
                class40.field511.method2785(class322.field4090, arg2 + 15101);
                class40.field511.method2747(class21.field309, arg2 ^ 0x456);
                class456.method2708(-2, true, var16.field4944[0], var16.method1366((byte) -124), var16.field4936[0], 0, var16.method1366((byte) -116), 30799, 0);
            }
        }
        if (var6 == 1008) {
            class359.field4636 = arg1;
            class203.field2646 = arg3;
            class422.field5985 = 0;
            class353.field4542 = 2;
            class295 var17 = class187.field2446[var7];
            if (var17 != null) {
                class477 var18 = var17.field3773;
                if (var18.field6922 != null) {
                    var18 = var18.method2903(-1, class491.field7160);
                }
                if (var18 != null) {
                    class109.field1443++;
                    class282.method1669(class291.field3708, false);
                    class40.field511.method2759((byte) -11, var18.field6948);
                }
            }
        }
        if (var6 == 2) {
            class223 var19 = class387.field5107[var7];
            if (var19 != null) {
                class422.field5985 = 0;
                class359.field4636 = arg1;
                class353.field4542 = 2;
                class203.field2646 = arg3;
                class534.field7847++;
                class282.method1669(class111.field1491, false);
                class40.field511.method2729(class343.field4392.method834(false, 82) ? 1 : 0, false);
                class40.field511.method2759((byte) -44, var7);
                class456.method2708(-2, true, var19.field4944[0], var19.method1366((byte) -127), var19.field4936[0], 0, var19.method1366((byte) -102), 30799, 0);
            }
        }
        if (var6 == 57) {
            class203.field2646 = arg3;
            class359.field4636 = arg1;
            class353.field4542 = 2;
            class422.field5985 = 0;
            class488.field7100++;
            class282.method1669(class418.field5938, false);
            class40.field511.method2783(var4 + class441.field6317, -578373112);
            class40.field511.method2759((byte) -75, class320.field4064 + var5);
            class40.field511.method2759((byte) -44, var7);
            class40.field511.method2788(class343.field4392.method834(false, 82) ? 1 : 0, 30017);
            class469.method2835(var4, var5, (byte) -128);
        }
        if (var6 == 12) {
            class523 var20 = class202.method1268(var5, var4, arg2 - 2);
            if (var20 != null) {
                class379.method2156(true);
                class73 var21 = client.method1226(var20);
                class40.method380(var20, 0, var21.field937, var21.method644((byte) 51));
                class516.field7480 = class403.method2386(var20, (byte) 84);
                if (class516.field7480 == null) {
                    class516.field7480 = "Null";
                }
                class446.field6389 = var20.field7592 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 5) {
            class223 var22 = class387.field5107[var7];
            if (var22 != null) {
                class353.field4542 = 2;
                class126.field1676++;
                class359.field4636 = arg1;
                class422.field5985 = 0;
                class203.field2646 = arg3;
                class282.method1669(class159.field2023, false);
                class40.field511.method2778(class21.field309, 99);
                class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
                class40.field511.method2783(class470.field6816, -578373112);
                class40.field511.method2783(class322.field4090, -578373112);
                class40.field511.method2748(var7, 8016);
                class456.method2708(-2, true, var22.field4944[0], var22.method1366((byte) -95), var22.field4936[0], 0, var22.method1366((byte) -105), 30799, 0);
            }
        }
        if (var6 == 49) {
            class223 var23 = class387.field5107[var7];
            if (var23 != null) {
                class359.field4636 = arg1;
                class422.field5985 = 0;
                class187.field2449++;
                class353.field4542 = 2;
                class203.field2646 = arg3;
                class282.method1669(class50.field661, false);
                class40.field511.method2759((byte) -77, var7);
                class40.field511.method2788(class343.field4392.method834(false, 82) ? 1 : 0, 30017);
                class456.method2708(-2, true, var23.field4944[0], var23.method1366((byte) -87), var23.field4936[0], 0, var23.method1366((byte) -105), 30799, 0);
            }
        }
        if (var6 == 51) {
            class353.field4542 = 2;
            class359.field4636 = arg1;
            class203.field2646 = arg3;
            class422.field5985 = 0;
            class413.field5888++;
            class282.method1669(class23.field334, false);
            class40.field511.method2748(class441.field6317 + var4, 8016);
            class40.field511.method2783(var7, -578373112);
            class40.field511.method2765(class343.field4392.method834(false, 82) ? 1 : 0, false);
            class40.field511.method2785(class320.field4064 + var5, 15103);
            class469.method2835(var4, var5, (byte) -83);
        }
        if (var6 == 11) {
            class223 var24 = class387.field5107[var7];
            if (var24 != null) {
                class353.field4542 = 2;
                class359.field4636 = arg1;
                class203.field2646 = arg3;
                class422.field5985 = 0;
                class450.field6478++;
                class282.method1669(class518.field7497, false);
                class40.field511.method2783(var7, -578373112);
                class40.field511.method2726(arg2 ^ 0xFFFF89F7, class343.field4392.method834(false, 82) ? 1 : 0);
                class456.method2708(-2, true, var24.field4944[0], var24.method1366((byte) -87), var24.field4936[0], 0, var24.method1366((byte) -101), arg2 ^ 0x784D, 0);
            }
        }
        if (var6 == 19) {
            class295 var25 = class187.field2446[var7];
            if (var25 != null) {
                class359.field4636 = arg1;
                class203.field2646 = arg3;
                class422.field5985 = 0;
                class523.field7712++;
                class353.field4542 = 2;
                class282.method1669(class522.field7559, false);
                class40.field511.method2785(var7, arg2 + 15101);
                class40.field511.method2788(class343.field4392.method834(false, 82) ? 1 : 0, 30017);
                class456.method2708(-2, true, var25.field4944[0], var25.method1366((byte) -89), var25.field4936[0], 0, var25.method1366((byte) -124), 30799, 0);
            }
        }
        if (var6 == 48) {
            class353.field4542 = 2;
            class346.field4450++;
            class359.field4636 = arg1;
            class422.field5985 = 0;
            class203.field2646 = arg3;
            class282.method1669(class425.field6031, false);
            class40.field511.method2748(var4 + class441.field6317, 8016);
            class40.field511.method2748(var7, 8016);
            class40.field511.method2753(class21.field309, arg2 ^ 0xFFFF9C01);
            class40.field511.method2748(class320.field4064 + var5, 8016);
            class40.field511.method2729(class343.field4392.method834(false, 82) ? 1 : 0, false);
            class40.field511.method2748(class322.field4090, 8016);
            class40.field511.method2759((byte) -56, class470.field6816);
            class469.method2835(var4, var5, (byte) -104);
        }
        if (var6 == 13) {
            class295 var26 = class187.field2446[var7];
            if (var26 != null) {
                class205.field2679++;
                class353.field4542 = 2;
                class422.field5985 = 0;
                class203.field2646 = arg3;
                class359.field4636 = arg1;
                class282.method1669(class266.field3355, false);
                class40.field511.method2748(var7, 8016);
                class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
                class456.method2708(-2, true, var26.field4944[0], var26.method1366((byte) -127), var26.field4936[0], 0, var26.method1366((byte) -120), 30799, 0);
            }
        }
        if (var6 == 1007 || var6 == 1006 || var6 == 1011 || var6 == 1010 || var6 == 1009) {
            class322.method1888(var7, var6, 99, var4);
        }
        if (var6 == 9) {
            class422.field5985 = 0;
            class353.field4542 = 2;
            class359.field4636 = arg1;
            class203.field2646 = arg3;
            class284.field3610++;
            class282.method1669(class230.field2935, false);
            class40.field511.method2759((byte) -108, class441.field6317 + var4);
            class40.field511.method2729(class343.field4392.method834(false, 82) ? 1 : 0, false);
            class40.field511.method2783(var7, -578373112);
            class40.field511.method2759((byte) -65, class320.field4064 + var5);
            class469.method2835(var4, var5, (byte) -98);
        }
        if (var6 == 58) {
            class523 var27 = class202.method1268(var5, var4, 0);
            if (var27 != null) {
                class464.method2797(0, var27);
            }
        }
        if (var6 == 25) {
            class295 var28 = class187.field2446[var7];
            if (var28 != null) {
                class422.field5985 = 0;
                class353.field4542 = 2;
                class203.field2646 = arg3;
                class468.field6772++;
                class359.field4636 = arg1;
                class282.method1669(class203.field2634, false);
                class40.field511.method2759((byte) -28, var7);
                class40.field511.method2788(class343.field4392.method834(false, 82) ? 1 : 0, 30017);
                class456.method2708(-2, true, var28.field4944[0], var28.method1366((byte) -90), var28.field4936[0], 0, var28.method1366((byte) -120), 30799, 0);
            }
        }
        if (var6 == 44) {
            class481.field7028++;
            class353.field4542 = 2;
            class203.field2646 = arg3;
            class359.field4636 = arg1;
            class422.field5985 = 0;
            class282.method1669(class148.field1874, false);
            class40.field511.method2748((int) (var8 >>> 32) & Integer.MAX_VALUE, arg2 ^ 0x1F52);
            class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
            class40.field511.method2785(class322.field4090, 15103);
            class40.field511.method2785(var4 + class441.field6317, 15103);
            class40.field511.method2759((byte) -77, class320.field4064 + var5);
            class40.field511.method2783(class470.field6816, -578373112);
            class40.field511.method2753(class21.field309, -25597);
            class328.method1910(var8, var5, (byte) 94, var4);
        }
        if (var6 == 1001) {
            class422.field5985 = 0;
            class361.field4656++;
            class359.field4636 = arg1;
            class353.field4542 = 2;
            class203.field2646 = arg3;
            class282.method1669(class183.field2396, false);
            class40.field511.method2759((byte) -58, var7);
        }
        if (var6 == 45) {
            class359.field4636 = arg1;
            class353.field4542 = 2;
            class131.field1720++;
            class422.field5985 = 0;
            class203.field2646 = arg3;
            class282.method1669(class391.field5261, false);
            class40.field511.method2729(class343.field4392.method834(false, 82) ? 1 : 0, false);
            class40.field511.method2785(var7, 15103);
            class40.field511.method2759((byte) -71, class441.field6317 + var4);
            class40.field511.method2785(class320.field4064 + var5, 15103);
            class469.method2835(var4, var5, (byte) -122);
        }
        if (var6 == 22) {
            class295 var29 = class187.field2446[var7];
            if (var29 != null) {
                class422.field5985 = 0;
                class100.field1204++;
                class353.field4542 = 2;
                class359.field4636 = arg1;
                class203.field2646 = arg3;
                class282.method1669(class350.field4500, false);
                class40.field511.method2748(var7, 8016);
                class40.field511.method2726(-30219, class343.field4392.method834(false, 82) ? 1 : 0);
                class456.method2708(-2, true, var29.field4944[0], var29.method1366((byte) -105), var29.field4936[0], 0, var29.method1366((byte) -89), 30799, 0);
            }
        }
        if (var6 == 1004) {
            class353.field4542 = 2;
            class27.field384++;
            class203.field2646 = arg3;
            class359.field4636 = arg1;
            class422.field5985 = 0;
            class282.method1669(class406.field5812, false);
            class40.field511.method2759((byte) -78, var7);
        }
        if (class211.field2717) {
            class379.method2156(true);
        }
        if (class386.field5072 != null && class145.field1862 == 0) {
            class136.method935(class386.field5072, -125);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIB)I", line = 725)
    public static final int method1511(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = -93 % ((arg3 - 3) / 61);
        field3188++;
        int var5 = arg0 / arg2;
        int var6 = arg0 & arg2 - 1;
        int var7 = arg1 / arg2;
        int var8 = arg1 & arg2 - 1;
        int var9 = class521.method3093(var5, false, var7);
        int var10 = class521.method3093(var5 + 1, false, var7);
        int var11 = class521.method3093(var5, false, var7 + 1);
        int var12 = class521.method3093(var5 + 1, false, var7 + 1);
        int var13 = class324.method1900(var10, var6, true, var9, arg2);
        int var14 = class324.method1900(var12, var6, true, var11, arg2);
        return class324.method1900(var14, var8, true, var13, arg2);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 757)
    public static void method1512(int arg0) {
        if (arg0 != -5208) {
            method1511(-92, 1, 57, (byte) -68);
        }
        field3189 = null;
        field3192 = null;
        field3193 = null;
    }
}
