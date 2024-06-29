import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class106 extends class97 {

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "J")
    public long field1418;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "[I")
    public static int[] field1419 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Lpf;")
    public static class425 field1414 = new class425(81, 2);

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[I")
    public static int[] field1421 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Lnn;")
    public static class151 field1420 = new class151("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static void method660(boolean arg0) {
        field1420 = null;
        if (arg0) {
            field1414 = null;
        }
        field1414 = null;
        field1419 = null;
        field1421 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method661(byte arg0, int[] arg1) {
        if (arg0 > -15) {
            method661((byte) 116, (int[]) null);
        }
        field1416++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class67.field872;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class161 var5 = class466.method2870((byte) 70, arg1[var4]);
            if (var5.field2227 != -1) {
                class234 var6 = (class234) class294.field4479.method1491((long) var5.field2227, 0);
                if (var6 == null) {
                    class4 var7 = class4.method36(class427.field6274, var5.field2227, 0);
                    if (var7 != null) {
                        var6 = class196.field2965.method378(var7, true);
                        class294.field4479.method1488(128, (long) var5.field2227, var6);
                    }
                }
                if (var6 != null) {
                    class304.field4590[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Z")
    public static final boolean method662(byte arg0) {
        field1415++;
        if (arg0 >= -122) {
            field1420 = null;
        }
        return class149.field2067 > 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILef;)V")
    public static final void method663(int arg0, class385 arg1) {
        field1413++;
        if ((arg1.field5685.length - arg1.field5666) < 1) {
            return;
        }
        int var2 = arg1.method2343(255);
        if (var2 < 0 || var2 > 15) {
            return;
        }
        byte var3;
        if (var2 == 15) {
            var3 = 37;
        } else if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field5685.length - arg1.field5666) < var3) {
            return;
        }
        class105.field1410 = arg1.method2343(255);
        if (class105.field1410 < 1) {
            class105.field1410 = 1;
        } else if (class105.field1410 > 4) {
            class105.field1410 = 4;
        }
        class341.method2080(arg0 ^ 0xFFFFEA5C, arg1.method2343(arg0 ^ 0x157A) == 1);
        class213.field3198 = arg1.method2343(255) == 1;
        class345.field5157 = arg1.method2343(arg0 - 5254) == 1;
        class39.field477 = arg1.method2343(255) == 1;
        class452.field6683 = arg1.method2343(arg0 ^ 0x157A) == 1 ? 1 : 0;
        class424.field6237 = arg1.method2343(255) == 1;
        class151.field2090 = arg1.method2343(255) == 1;
        class52.field684 = arg1.method2343(255) == 1;
        class97.field1334 = arg1.method2343(255);
        if (class97.field1334 > 2) {
            class97.field1334 = 2;
        }
        if (var2 >= 2) {
            class451.field6650 = arg1.method2343(255) == 1;
        } else {
            class451.field6650 = arg1.method2343(255) == 1;
            arg1.method2343(255);
        }
        class244.field3651 = arg1.method2343(255) == 1;
        class431.field6332 = arg1.method2343(255) == 1;
        class95.field1324 = arg1.method2343(255);
        if (class95.field1324 > 2) {
            class95.field1324 = 2;
        }
        class287.field4376 = class95.field1324;
        class1.field12 = arg1.method2343(255) == 1;
        class465.field6842 = arg1.method2343(255);
        if (class465.field6842 > 127) {
            class465.field6842 = 127;
        }
        class438.field6450 = arg1.method2343(arg0 - 5254);
        client.field6666 = arg1.method2343(arg0 ^ 0x157A);
        if (client.field6666 > 127) {
            client.field6666 = 127;
        }
        if (var2 >= 1) {
            class57.field767 = arg1.method2323(-18);
            class243.field3646 = arg1.method2323(-56);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method2343(255);
        }
        if (var2 >= 4) {
            int var4 = arg1.method2343(255);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class229.field3504 < 96) {
                var4 = 0;
            }
            class133.method803(var4, -12131);
        }
        if (var2 >= 5) {
            class439.field6455 = arg1.method2354(arg0 - 5254);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class376.field5479 = var5 = arg1.method2343(255);
        }
        if (class376.field5479 != 1 && class376.field5479 != 2) {
            class376.field5479 = 2;
        }
        if (var2 >= 7) {
            class121.field1597 = arg1.method2343(255) == 1;
        }
        if (var2 >= 8) {
            class212.field3193 = arg1.method2343(255) == 1;
        }
        if (var2 >= 9) {
            class109.field1445 = arg1.method2343(255);
        }
        if (class109.field1445 < 0 || class109.field1445 > class258.method1602((byte) -115, class229.field3504)) {
            class109.field1445 = 0;
        }
        if (var2 >= 10) {
            class289.field4391 = arg1.method2343(255) != 0;
        }
        if (var2 >= 11) {
            class15.field188 = arg1.method2343(arg0 - 5254) != 0;
        }
        if (var2 >= 12) {
            class452.field6683 = arg1.method2343(255);
        }
        if (class452.field6683 < 0 || class452.field6683 > 2) {
            class452.field6683 = 1;
        }
        if (var2 >= 13) {
            class341.field5111 = arg1.method2343(arg0 - 5254) == 1;
        }
        if (arg0 != 5509) {
            method663(126, (class385) null);
        }
        if (var2 >= 14) {
            class14.field176 = arg1.method2343(255);
        } else if (var5 == 0) {
            class14.field176 = 2;
        } else {
            class14.field176 = 1;
        }
        if (class14.field176 < 0 || class14.field176 > 3) {
            class14.field176 = 2;
        }
        if (var2 >= 15) {
            class350.field5205 = arg1.method2343(255);
            if (class350.field5205 < 0 || class350.field5205 > 4) {
                class350.field5205 = class137.field1854 == 1 ? 2 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class106() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(J)V")
    public class106(long arg0) {
        this.field1418 = arg0;
    }
}
