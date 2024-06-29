import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class41 extends class81 {

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field1014 = -1;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "Lsg;")
    public static class30 field1021 = class167.method1221((byte) 33, "Titelbild geladen)3");

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "[Z")
    public static boolean[] field1016 = new boolean[112];

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "Lb;")
    public static class48 field1024 = new class48();

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lsg;")
    public static class30 field1025 = class167.method1221((byte) 33, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "Lmc;")
    public static class151 field1017;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "Lka;")
    private class157 field1022;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "[B")
    public static byte[] field1009;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BIIZII[Lue;III)V")
    public static final void method425(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class13[] arg7, int arg8, int arg9, int arg10) {
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg4) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg3 + var12) > 0 && (arg3 + var12) < 103 && arg6 + var13 > 0 && (arg6 + var13) < 103) {
                        arg7[arg10].field258[arg3 + var12][arg6 + var13] = class68.method612(arg7[arg10].field258[arg3 + var12][arg6 + var13], -16777217);
                    }
                }
            }
        }
        field1023++;
        if (arg8 >= -24) {
            method434((KeyEvent) null, (byte) 46);
        }
        class8 var14 = new class8(arg1);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg9 == var15 && arg0 <= var16 && arg0 + 8 > var16 && var17 >= arg2 && arg2 + 8 > var17) {
                        class270.method1847(arg5, 22, var14, 0, class73.method670(var16 & 0x7, var17 & 0x7, (byte) 94, arg5) + arg3, class57.method536(var17 & 0x7, var16 & 0x7, arg5, true) + arg6, arg10, arg4, 0);
                    } else {
                        class270.method1847(0, 4, var14, 0, -1, -1, 0, arg4, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
    public static void method426(int arg0) {
        field1021 = null;
        field1016 = null;
        field1024 = null;
        if (arg0 != 0) {
            method428(-74);
        }
        field1025 = null;
        field1009 = null;
        field1017 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBI)I")
    public final int method427(int arg0, byte arg1, int arg2) {
        field1008++;
        if (this.field1022 == null) {
            return arg2;
        }
        class203 var4 = (class203) this.field1022.method1168(-3, (long) arg0);
        if (arg1 >= -106) {
            return -93;
        } else if (var4 == null) {
            return arg2;
        } else {
            return var4.field3622;
        }
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)V")
    public static final void method428(int arg0) {
        if (class175.field3261 != null) {
            class175.field3261.method1516(-84);
            class175.field3261 = null;
        }
        field1019++;
        if (arg0 != 31531) {
            field1017 = null;
        }
        class211.method1506(true);
        class17.method171();
        for (int var1 = 0; var1 < 4; var1++) {
            class100.field2032[var1].method120(arg0 - 31419);
        }
        class201.method1427((byte) -127);
        System.gc();
        class29.method243(2, 24583);
        class102.field2072 = -1;
        class11.field223 = false;
        class166.method1219(arg0 ^ 0x1FD8B, true);
        class22.field421 = 0;
        class71.field1604 = false;
        class196.field3547 = 0;
        for (int var2 = 0; var2 < class262.field4620.length; var2++) {
            class262.field4620[var2] = null;
        }
        class221.field3985 = 0;
        class28.field528 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class75.field1670[var3] = null;
            class106.field2124[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class125.field2443[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class103.field2078[var5][var6][var7] = null;
                }
            }
        }
        class65.method583((byte) -112);
        class37.field899 = 0;
        class233.method1653((byte) -128, true);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILaa;)V")
    public final void method429(int arg0, class8 arg1) {
        if (arg0 != 0) {
            return;
        }
        field1013++;
        while (true) {
            int var3 = arg1.method63((byte) 71);
            if (var3 == 0) {
                return;
            }
            this.method432(128, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILwd;)V")
    public static final void method430(int arg0, class63 arg1) {
        field1011++;
        if (arg1.field1409 == 0) {
            return;
        }
        if (arg1.field1384 != -1 && arg1.field1384 < 32768) {
            class275 var2 = class125.field2443[arg1.field1384];
            if (var2 != null) {
                int var3 = arg1.field1360 - var2.field1360;
                int var4 = arg1.field1336 - var2.field1336;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1337 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1384 >= 32768) {
            int var5 = arg1.field1384 - 32768;
            if (class249.field4405 == var5) {
                var5 = 2047;
            }
            class120 var6 = class75.field1670[var5];
            if (var6 != null) {
                int var7 = arg1.field1336 - var6.field1336;
                int var8 = arg1.field1360 - var6.field1360;
                if (var8 != 0 || var7 != 0) {
                    arg1.field1337 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1380 != 0 || arg1.field1390 != 0) && (arg1.field1388 == 0 || arg1.field1347 > 0)) {
            int var9 = arg1.field1360 + arg1.method574(true) * 64 - ((-class22.field421 + arg1.field1380 + -class22.field421) * 64 + 64);
            int var10 = arg1.field1336 + (arg1.method574(true) - 1) * 64 - ((arg1.field1390 - class196.field3547 + -class196.field3547) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field1337 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1380 = 0;
            arg1.field1390 = 0;
        }
        int var11 = arg1.field1337 - arg1.field1389 & arg0;
        if (var11 == 0) {
            arg1.field1400 = 0;
            return;
        }
        arg1.field1400++;
        if (var11 <= 1024) {
            arg1.field1389 += arg1.field1409;
            boolean var12 = true;
            if (arg1.field1409 > var11 || var11 > 2048 - arg1.field1409) {
                var12 = false;
                arg1.field1389 = arg1.field1337;
            }
            if (arg1.field1370 == arg1.field1362 && (arg1.field1400 > 25 || var12)) {
                if (arg1.field1376 == -1) {
                    arg1.field1370 = arg1.field1399;
                } else {
                    arg1.field1370 = arg1.field1376;
                }
            }
        } else {
            arg1.field1389 -= arg1.field1409;
            boolean var13 = true;
            if (arg1.field1409 > var11 || 2048 - arg1.field1409 < var11) {
                var13 = false;
                arg1.field1389 = arg1.field1337;
            }
            if (arg1.field1370 == arg1.field1362 && (arg1.field1400 > 25 || var13)) {
                if (arg1.field1392 == -1) {
                    arg1.field1370 = arg1.field1399;
                } else {
                    arg1.field1370 = arg1.field1392;
                }
            }
        }
        arg1.field1389 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILsg;B)Lsg;")
    public final class30 method431(int arg0, class30 arg1, byte arg2) {
        field1018++;
        if (arg2 >= -33) {
            return null;
        } else if (this.field1022 == null) {
            return arg1;
        } else {
            class196 var4 = (class196) this.field1022.method1168(-3, (long) arg0);
            return var4 == null ? arg1 : var4.field3549;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILaa;)V")
    private final void method432(int arg0, int arg1, class8 arg2) {
        if (arg1 == 249) {
            int var4 = arg2.method63((byte) 49);
            if (this.field1022 == null) {
                int var5 = class177.method1294(var4, (byte) 100);
                this.field1022 = new class157(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method63((byte) 51) == 1;
                int var8 = arg2.method60(23888);
                class236 var9;
                if (var7) {
                    var9 = new class196(arg2.method84(0));
                } else {
                    var9 = new class203(arg2.method70(65280));
                }
                this.field1022.method1164((byte) 52, (long) var8, var9);
            }
        }
        if (arg0 != 128) {
            field1021 = null;
        }
        field1015++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILmc;)Z")
    public static final boolean method433(int arg0, int arg1, class151 arg2) {
        if (arg1 != 0) {
            return true;
        }
        byte[] var3 = arg2.method1122((byte) -70, arg0);
        field1010++;
        if (var3 == null) {
            return false;
        } else {
            class263.method1814(arg1 ^ 0xFFFFFF80, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method434(KeyEvent arg0, byte arg1) {
        if (arg1 < 78) {
            method433(39, 110, (class151) null);
        }
        int var2 = arg0.getKeyChar();
        field1012++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }
}
