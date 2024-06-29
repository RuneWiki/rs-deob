import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class202 extends class170 {

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
    private int field3567 = 1;

    @OriginalMember(owner = "client!ih", name = "nb", descriptor = "I")
    private int field3576 = 0;

    @OriginalMember(owner = "client!ih", name = "ob", descriptor = "I")
    private int field3577 = 0;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "Lqk;")
    public static class207 field3559 = class24.method212(255, "underlay");

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "Lqk;")
    public static class207 field3568 = class24.method212(255, "");

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "Lqk;")
    private static class207 field3562 = class24.method212(255, "Opened title screen");

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "Lqk;")
    public static class207 field3560 = field3562;

    @OriginalMember(owner = "client!ih", name = "kb", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ih", name = "jb", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ih", name = "lb", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "Lfk;")
    public static class14 field3565;

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "Lma;")
    public static class187 field3570;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
    public static final void method1399(int arg0, byte arg1) {
        class65.field1165.method1383(arg1 ^ -8049, arg0);
        ++field3566;
        class115.field1993.method1383(-8052, arg0);
        if (arg1 != 3) {
            field3568 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 < 14) {
            field3560 = null;
        }
        class235.method1681(-3);
        ++field3571;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public static void method1400(byte arg0) {
        field3559 = null;
        field3560 = null;
        field3565 = null;
        field3562 = null;
        field3568 = null;
        int var1 = -54 % ((arg0 - -21) / 51);
        field3570 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lpe;")
    public static final class244 method1401(int arg0, int arg1) {
        ++field3564;
        if (arg1 != 31252) {
            field3573 = 78;
        }
        class244 var2 = (class244) class252.field4534.method1387((long) arg0, 122);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class230.field4216.method705(class72.method526(17074, arg0), class100.method737(arg0, 26329), arg1 ^ -31253);
            class244 var4 = new class244();
            if (var3 != null) {
                var4.method1716((byte) -44, new class149(var3));
            }
            class252.field4534.method1385((long) arg0, var4, (byte) -125);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class202() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1402(String arg0, int arg1, Throwable arg2) {
        ++field3574;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class107.method768(arg2, 40);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class174.method1252(arg1 + -32592, var3);
            String var4 = class120.method854((byte) 114, ":", "%3a", var3);
            String var5 = class120.method854((byte) 124, "@", "%40", var4);
            String var6 = class120.method854((byte) 122, "&", "%26", var5);
            String var7 = class120.method854((byte) 112, "#", "%23", var6);
            if (class4.field67.field4207 != null) {
                class96 var8 = class4.field67.method1642(new URL(class4.field67.field4207.getCodeBase(), "clienterror.ws?c=" + class260.field4638 + "&u=" + class89.field1606 + "&v1=" + class229.field4206 + "&v2=" + class229.field4195 + "&e=" + var7), (byte) -36);
                while (var8.field1696 == 0) {
                    class153.method1098((byte) 76, 1L);
                }
                if (arg1 != 32701) {
                    method1400((byte) 11);
                }
                if (~var8.field1696 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field1699;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)V")
    public static final void method1403(byte arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class88.field1591;
        if (arg0 > -17) {
            method1399(-22, (byte) -60);
        }
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            class21.method129((byte) 8);
            for (int var5 = 0; ~var5 > -14; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    boolean var7 = false;
                    int var8 = class281.field4933[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 3;
                        if (!arg1 || ~var9 == -1) {
                            int var10 = var8 >> 1 & 3;
                            int var11 = (16378 & var8) >> 3;
                            int var12 = 1023 & var8 >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class207.field3685.length; ++var14) {
                                if (~class207.field3685[var14] == ~var13 && var3[var14] != null) {
                                    class99.method716(var10, class133.field2303, (var11 & 7) * 8, var4, var6 * 8, var3[var14], (var12 & 7) * 8, arg1, var5 * 8, var9, 0);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class110.method789(var6 * 8, (byte) -107, var4, 8, var5 * 8, 8);
                    }
                }
            }
        }
        ++field3563;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        int[] var3 = super.field3001.method1538(85, arg1);
        if (arg0 != -30) {
            method1400((byte) -26);
        }
        ++field3561;
        if (super.field3001.field3835) {
            int var4 = class282.field4964[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class88.field1595; ++var6) {
                int var7 = class68.field1211[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (~this.field3577 == -1) {
                    var9 = (-var4 + var7) * this.field3567;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3567 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field3576 == -1) {
                    var12 = class95.field1690[(4085 & var12) >> 4] + 4096 >> 1;
                } else if (this.field3576 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            this.method31((byte) 23, -14);
        }
        ++field3572;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field3567 = arg0.method1045((byte) 78);
                }
            } else {
                this.field3576 = arg0.method1045((byte) 117);
            }
        } else {
            this.field3577 = arg0.method1045((byte) -100);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V")
    public static final void method1404(int arg0, boolean arg1) {
        class86.method634(class31.field625, class244.field4428, arg1, class165.field2915, (byte) -121);
        ++field3575;
        if (arg0 != -19680) {
            method1401(17, -67);
        }
    }
}
