import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class166 extends class472 {

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "[F")
    public static float[] field2505 = new float[4];

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "F")
    public static float field2504 = 0.25F;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "[Lck;")
    public static class5[] field2507 = new class5[1024];

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "Lvg;")
    private class56 field2506;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "[[Lpq;")
    public static class52[][] field2508;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lks;Z[[B)V", line = 3)
    public static final void method1181(class23 arg0, boolean arg1, byte[][] arg2) {
        if (arg1) {
            method1185((byte) 113, -127, -101, null);
        }
        for (int var3 = 0; var3 < arg0.field3545; var3++) {
            class425.method2644(27576);
            for (int var4 = 0; var4 < class338.field5076 >> 3; var4++) {
                for (int var5 = 0; var5 < (class250.field4077 >> 3); var5++) {
                    int var6 = class349.field5201[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3244B5B) >> 24;
                        if (!arg0.field3522 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFA) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class277.field4348.length; var12++) {
                                if (class277.field4348[var12] == var11 && arg2[var12] != null) {
                                    arg0.method148(arg2[var12], class376.field5542, var3, var5 * 8, (var10 & 0x7) * 8, var7, (var9 & 0x7) * 8, var4 * 8, var8, (byte) 80, class463.field6857);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field2512++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 76)
    public final String method1182(String arg0, int arg1, byte arg2) {
        field2503++;
        if (this.field2506 == null) {
            return arg0;
        }
        if (arg2 < 103) {
            this.method1187(null, 106, false);
        }
        class109 var4 = (class109) this.field2506.method358((byte) -120, (long) arg1);
        return var4 == null ? arg0 : var4.field1640;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 96)
    public static void method1183(int arg0) {
        field2507 = null;
        if (arg0 <= 97) {
            method1183(111);
        }
        field2508 = null;
        field2505 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfh;B)V", line = 113)
    public final void method1184(class194 arg0, byte arg1) {
        field2509++;
        while (true) {
            int var3 = arg0.method1337((byte) -122);
            if (var3 == 0) {
                if (arg1 < 44) {
                    this.method1187(null, 97, true);
                    return;
                } else {
                    return;
                }
            }
            this.method1187(arg0, var3, true);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIILfi;)V", line = 144)
    public static final void method1185(byte arg0, int arg1, int arg2, class38 arg3) {
        class276.field4338 = arg2;
        if (arg0 == 5) {
            class386.field5685 = arg1;
            field2502++;
            class536.field7862 = arg3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)I", line = 157)
    public final int method1186(byte arg0, int arg1, int arg2) {
        field2510++;
        if (this.field2506 == null) {
            return arg1;
        } else if (arg0 == -110) {
            class50 var4 = (class50) this.field2506.method358((byte) -116, (long) arg2);
            return var4 == null ? arg1 : var4.field771;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfh;IZ)V", line = 176)
    private final void method1187(class194 arg0, int arg1, boolean arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method1337((byte) 69);
            if (this.field2506 == null) {
                int var5 = class46.method307((byte) -52, var4);
                this.field2506 = new class56(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1337((byte) 107) == 1;
                int var8 = arg0.method1339(-32768);
                class130 var9;
                if (var7) {
                    var9 = new class109(arg0.method1347(-94));
                } else {
                    var9 = new class50(arg0.method1401(122));
                }
                this.field2506.method357(var9, 1, (long) var8);
            }
        }
        if (!arg2) {
            method1188(false, -117, (byte) 9);
        }
        field2511++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIB)V", line = 225)
    public static final void method1188(boolean arg0, int arg1, byte arg2) {
        if (arg2 != -5) {
            return;
        }
        class23.field262 = 3;
        field2501++;
        class125.field1877 = arg1;
        class13.method75(class314.field4781.field5144, class314.field4781.field5143, arg2 - 121);
        if (arg0) {
            class236.method1602("", "", arg2 - 115);
        } else {
            class525.method3122(6);
            class236.method1602(class420.field6173, class112.field1671, -126);
        }
    }
}
