import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class257 {

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lbc;")
    public static class178 field4118;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[I")
    public static int[] field4114;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)V")
    public static final void method1742(byte arg0, int arg1, int arg2) {
        class240.field3910[arg1] = arg2;
        field4116++;
        if (arg0 != 68) {
            field4114 = null;
        }
        class70 var3 = (class70) class183.field2842.method285((long) arg1, arg0 ^ 0x35B9);
        if (var3 == null) {
            class70 var4 = new class70(4611686018427387905L);
            class183.field2842.method281(1, (long) arg1, var4);
        } else if (var3.field1120 != 4611686018427387905L) {
            var3.field1120 = class134.method924(false) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILna;)V")
    public static final void method1743(int arg0, class32 arg1) {
        field4108++;
        class124 var2 = null;
        class50.field740 = 3;
        class133.method922(true, arg0 + 31207);
        class132.field2070 = true;
        class18.field272 = 127;
        class132.field2072 = true;
        class294.field4633 = 255;
        class170.field2648 = true;
        class86.field1456 = 0;
        class19.field291 = true;
        class155.field2407 = true;
        class86.field1445 = 127;
        class293.field4622 = true;
        class210.field3264 = true;
        class179.field2790 = true;
        class190.field2948 = 2;
        class77.field1260 = true;
        class158.field2461 = 0;
        class197.field3116 = true;
        class180.field2815 = 0;
        class147.field2331 = true;
        class135.field2101 = 0;
        if (class50.field741 < 96) {
            class67.method493(0);
        } else {
            class67.method493(2);
        }
        class106.field1754 = 0;
        class105.field1751 = false;
        class181.field2829 = 0;
        class112.field1839 = 0;
        class109.field1782 = false;
        class82.field1385 = false;
        class10.field171 = true;
        try {
            class76 var3 = arg1.method256(12, "runescape");
            while (var3.field1255 == 0) {
                class150.method1011((byte) 41, 1L);
            }
            if (var3.field1255 == 1) {
                var2 = (class124) var3.field1258;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method862(14718)];
                while (var5.length > var4) {
                    int var6 = var2.method861(var5.length - var4, var5, -80, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class152.method1021(arg0 ^ 0x79A0, new class88(var5));
            }
        } catch (Exception var8) {
        }
        try {
            if (arg0 == -31204 && var2 != null) {
                var2.method863((byte) 117);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class257() {
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        field4117++;
        class25.field333.method1898((byte) 27);
        if (arg0 < 81) {
            method1745(68, (class228) null, -123, false, true);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILre;IZZ)V")
    public static final void method1745(int arg0, class228 arg1, int arg2, boolean arg3, boolean arg4) {
        field4106++;
        if (!arg3) {
            return;
        }
        int var5 = arg1.field3574;
        if (arg1.field3586 == 0) {
            arg1.field3574 = arg1.field3464;
        } else if (arg1.field3586 == 1) {
            arg1.field3574 = arg0 - arg1.field3464;
        } else if (arg1.field3586 == 2) {
            arg1.field3574 = arg1.field3464 * arg0 >> 14;
        } else if (arg1.field3586 == 3) {
            if (arg1.field3477 == 2) {
                arg1.field3574 = (arg1.field3464 - 1) * arg1.field3547 + arg1.field3464 * 32;
            } else if (arg1.field3477 == 7) {
                arg1.field3574 = (arg1.field3464 - 1) * arg1.field3547 + arg1.field3464 * 115;
            }
        }
        int var6 = arg1.field3625;
        if (arg1.field3511 == 0) {
            arg1.field3625 = arg1.field3485;
        } else if (arg1.field3511 == 1) {
            arg1.field3625 = arg2 - arg1.field3485;
        } else if (arg1.field3511 == 2) {
            arg1.field3625 = arg1.field3485 * arg2 >> 14;
        } else if (arg1.field3511 == 3) {
            if (arg1.field3477 == 2) {
                arg1.field3625 = (arg1.field3485 - 1) * arg1.field3601 + arg1.field3485 * 32;
            } else if (arg1.field3477 == 7) {
                arg1.field3625 = arg1.field3485 * 12 + ((arg1.field3485 - 1) * arg1.field3601);
            }
        }
        if (arg1.field3586 == 4) {
            arg1.field3574 = arg1.field3625 * arg1.field3475 / arg1.field3516;
        }
        if (arg1.field3511 == 4) {
            arg1.field3625 = arg1.field3574 * arg1.field3516 / arg1.field3475;
        }
        if (class170.field2647 && (client.method1059(arg1).field4362 != 0 || arg1.field3477 == 0)) {
            if (arg1.field3625 < 5 && arg1.field3574 < 5) {
                arg1.field3574 = 5;
                arg1.field3625 = 5;
            } else {
                if (arg1.field3625 <= 0) {
                    arg1.field3625 = 5;
                }
                if (arg1.field3574 <= 0) {
                    arg1.field3574 = 5;
                }
            }
        }
        if (arg1.field3549 == 1337) {
            class177.field2767 = arg1;
        }
        if (arg4 && arg1.field3489 != null && arg1.field3574 != var5 || arg1.field3625 != var6) {
            class116 var7 = new class116();
            var7.field1895 = arg1.field3489;
            var7.field1892 = arg1;
            class52.field790.method1219(!arg3, var7);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static void method1746(int arg0) {
        if (arg0 == -1) {
            field4114 = null;
            field4118 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lfa;)V")
    public class257(class257 arg0) {
        this.field4111 = arg0.field4111;
        this.field4107 = arg0.field4107;
        this.field4113 = arg0.field4113;
        this.field4110 = arg0.field4110;
    }
}
