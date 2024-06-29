import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class104 extends class118 {

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[Lmc;")
    public static class83[] field2416 = new class83[8];

    @OriginalMember(owner = "client!q", name = "G", descriptor = "Lrd;")
    private static class114 field2427 = class84.method656("Trade)4compete", (byte) 118);

    @OriginalMember(owner = "client!q", name = "H", descriptor = "Lrd;")
    private static class114 field2428 = class84.method656("Your account is already logged in)3", (byte) 120);

    @OriginalMember(owner = "client!q", name = "J", descriptor = "Lrd;")
    public static class114 field2430 = field2428;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "Lrd;")
    public static class114 field2425 = class84.method656("Freunde", (byte) 126);

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Lrd;")
    public static class114 field2421 = class84.method656("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", (byte) 114);

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field2419 = 0;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "Lrd;")
    public static class114 field2432 = field2427;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "Lpb;")
    public static class100 field2431;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "Lke;")
    public static class73 field2423;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)Z")
    public static final boolean method798(byte arg0, int arg1) {
        int var2 = -106 / ((arg0 + 71) / 48);
        field2420++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)I")
    private static final int method799(int arg0) {
        int var1 = class72.field1597[arg0];
        int var2 = (class123.field2884 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIJ)V")
    public abstract void method225(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
    public static final void method800(int arg0, byte arg1) {
        if (arg1 == -90) {
            field2422++;
            class90.method692((byte) -51, arg0);
            class5.method48(arg0, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IJZ)V")
    public final void method801(int arg0, long arg1, boolean arg2) {
        class123.field2884 = arg0;
        field2418++;
        for (int var5 = 0; var5 < 16; var5++) {
            class72.field1597[var5] = 12800;
        }
        if (arg2) {
            return;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method799(var6);
            this.method225(var6 + 176, 7, var7 >> 7, arg1);
            this.method225(var6 + 176, 39, var7 & 0x7F, arg1);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIIJ)Z")
    public final boolean method802(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class127.field3029[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class127.field3029[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class127.field3029[arg1] = var7 | var6;
            } else {
                this.method225(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method225(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class72.field1597[var8] = 12800;
                int var9 = method799(var8);
                this.method225(arg0, 7, var9 >> 7, arg3);
                this.method225(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class72.field1597[var10] = (arg2 << 7) + (class72.field1597[var10] & 0x7F);
                } else {
                    class72.field1597[var10] = (class72.field1597[var10] & 0x3F80) + arg2;
                }
                int var11 = method799(var10);
                this.method225(arg0, 7, var11 >> 7, arg3);
                this.method225(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JB)V")
    public static final void method803(long arg0, byte arg1) {
        field2417++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != -94) {
            field2419 = -25;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)V")
    public final void method804(int arg0, long arg1) {
        field2426++;
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class127.field3029[var4];
            class127.field3029[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((0x1 << var12 & var11) != 0) {
                    this.method225(var12 + 144, var4, 0, arg1);
                }
            }
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method225(var5 + 176, 123, 0, arg1);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method225(var6 + 176, 120, 0, arg1);
        }
        if (arg0 != -17) {
            this.method801(-7, -127L, false);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method225(var7 + 176, 121, 0, arg1);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method225(var8 + 176, 0, 0, arg1);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method225(var9 + 176, 32, 0, arg1);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method225(var10 + 192, 0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ltd;III)V")
    public static final void method805(class126 arg0, int arg1, int arg2, int arg3) {
        field2424++;
        if ((arg1 & 0x10) != 0) {
            arg0.field715 = class77.field1752.method456(-1);
            if (arg0.field715.method861(0, -14412) == 126) {
                arg0.field715 = arg0.field715.method866(false, 1);
                class86.method660(arg0.field3018, arg0.field715, true, 2);
            } else if (class7.field103 == arg0) {
                class86.method660(arg0.field3018, arg0.field715, true, 2);
            }
            arg0.field747 = 150;
            arg0.field702 = 0;
            arg0.field711 = 0;
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field724 = class77.field1752.method482(255);
            arg0.field703 = class77.field1752.method451((byte) 91);
            arg0.field734 = class77.field1752.method462((byte) 116);
            arg0.field691 = class77.field1752.method482(255);
            arg0.field745 = class77.field1752.method475((byte) 84) + class20.field370;
            arg0.field707 = class77.field1752.method467(255) + class20.field370;
            arg0.field728 = class77.field1752.method451((byte) 86);
            arg0.method258((byte) -105);
        }
        if ((arg1 & 0x100) != 0) {
            arg0.field721 = class77.field1752.method457(false);
            int var4 = class77.field1752.method442((byte) -108);
            arg0.field706 = class20.field370 + (var4 & 0xFFFF);
            arg0.field744 = 0;
            if (arg0.field721 == 65535) {
                arg0.field721 = -1;
            }
            arg0.field731 = var4 >> 16;
            if (arg0.field706 > class20.field370) {
                arg0.field744 = -1;
            }
            arg0.field717 = 0;
        }
        if ((arg1 & 0x4) != 0) {
            arg0.field709 = class77.field1752.method467(255);
            if (arg0.field709 == 65535) {
                arg0.field709 = -1;
            }
        }
        int var5 = 77 / ((26 - arg2) / 62);
        if ((arg1 & 0x1) != 0) {
            int var6 = class77.field1752.method451((byte) 74);
            byte[] var7 = new byte[var6];
            class60 var8 = new class60(var7);
            class77.field1752.method473(0, var7, var6, -38);
            class120.field2810[arg3] = var8;
            arg0.method976(var8, -1);
        }
        if ((arg1 & 0x40) != 0) {
            arg0.field701 = class77.field1752.method475((byte) 111);
            arg0.field710 = class77.field1752.method457(false);
        }
        if ((arg1 & 0x20) != 0) {
            int var9 = class77.field1752.method475((byte) 83);
            int var10 = class77.field1752.method451((byte) 98);
            int var11 = class77.field1752.method451((byte) 121);
            int var12 = class77.field1752.field1227;
            if (arg0.field3018 != null && arg0.field2995 != null) {
                long var13 = arg0.field3018.method877(29486);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < class89.field1986; var16++) {
                        if (class84.field1874[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && client.field415 == 0) {
                    class18.field333.field1227 = 0;
                    class77.field1752.method453(-95, class18.field333.field1248, var11, 0);
                    class18.field333.field1227 = 0;
                    class114 var17 = class61.method497(0, class18.field333).method865(-79);
                    arg0.field715 = var17.method862(-6488);
                    arg0.field702 = var9 >> 8;
                    arg0.field711 = var9 & 0xFF;
                    arg0.field747 = 150;
                    if (var10 == 2 || var10 == 3) {
                        class86.method660(class101.method786((byte) 126, new class114[] { class79.field1788, arg0.field3018 }), var17, true, 1);
                    } else if (var10 == 1) {
                        class86.method660(class101.method786((byte) 127, new class114[] { class50.field1035, arg0.field3018 }), var17, true, 1);
                    } else {
                        class86.method660(arg0.field3018, var17, true, 2);
                    }
                }
            }
            class77.field1752.field1227 = var12 + var11;
        }
        if ((arg1 & 0x400) != 0) {
            int var18 = class77.field1752.method466(0);
            int var19 = class77.field1752.method482(255);
            arg0.method252(class20.field370, 70, var19, var18);
            arg0.field741 = class20.field370 + 300;
            arg0.field732 = class77.field1752.method462((byte) 116);
            arg0.field713 = class77.field1752.method482(255);
        }
        if ((arg1 & 0x2) != 0) {
            int var20 = class77.field1752.method482(255);
            int var21 = class77.field1752.method451((byte) 75);
            arg0.method252(class20.field370, 70, var21, var20);
            arg0.field741 = class20.field370 + 300;
            arg0.field732 = class77.field1752.method462((byte) 116);
            arg0.field713 = class77.field1752.method466(0);
        }
        if ((arg1 & 0x8) == 0) {
            return;
        }
        int var22 = class77.field1752.method475((byte) 95);
        int var23 = class77.field1752.method466(0);
        if (var22 == 65535) {
            var22 = -1;
        }
        class73.method594(var23, var22, arg0, 2);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JBII)V")
    public final void method806(long arg0, byte arg1, int arg2, int arg3) {
        int var6 = (int) (Math.pow(0.1D, (double) arg3 * 5.0E-4D) * (double) arg2 + 0.5D);
        field2429++;
        if (class123.field2884 != var6) {
            class123.field2884 = var6;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = method799(var7);
                this.method225(var7 + 176, 7, var8 >> 7, arg0);
                this.method225(var7 + 176, 39, var8 & 0x7F, arg0);
            }
        }
        if (arg1 != -8) {
            field2425 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
    public static void method807(int arg0) {
        field2428 = null;
        field2423 = null;
        field2431 = null;
        field2430 = null;
        field2421 = null;
        if (arg0 == 3) {
            field2432 = null;
            field2425 = null;
            field2416 = null;
            field2427 = null;
        }
    }
}
