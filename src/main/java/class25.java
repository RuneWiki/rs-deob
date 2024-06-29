import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class25 extends class27 {

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lnd;")
    private class82 field534;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Lec;")
    public static class28 field537 = class28.method210(-46, "Too many connections from your address)3");

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Lec;")
    public static class28 field536 = class28.method210(-46, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Lec;")
    public static class28 field550 = class28.method210(-46, "Fps:");

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lec;")
    public static class28 field532 = class28.method210(-46, " with)3)3)3");

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Z")
    public static boolean field535 = false;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "[I")
    public static int[] field557 = new int[2048];

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field558 = 128;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field559 = 5063219;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Lec;")
    public static class28 field562 = class28.method210(-46, " has logged out)3");

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Lvb;")
    public static class122 field542;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lwc;")
    public static class128 field541;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Lqb;")
    private class97 field548;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Z")
    private boolean field539;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Z")
    private boolean field540;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "[B")
    private byte[] field553;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "[I")
    public static int[] field552;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public final void method170(int arg0, int arg1, int arg2) {
        field549++;
        if (arg2 == 0) {
            arg2 = 1;
        }
        if (arg0 != 332) {
            field541 = null;
        }
        int var4 = class127.method969(arg2, 14) - arg1;
        if (this.field548 != null) {
            this.field547 = var4;
        } else if (this.field539) {
            try {
                class59.method477("midibox.volume=" + var4 + ";", this.field534.field1871, -23103);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public final void method171(byte arg0) {
        field533++;
        if (this.field548 == null || this.field548.field2157 == 0) {
            return;
        }
        if (this.field548.field2157 == 1) {
            class100 var2 = (class100) this.field548.field2154;
            try {
                var2.method711(this.field553.length, -122, 0, this.field553);
                var2.method714(arg0 - 56);
                try {
                    class59.method477("midibox.loop=" + (this.field540 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method715((byte) 96).getPath() + "\"; midibox.volume=" + this.field547 + ";", this.field534.field1871, -23103);
                    this.field539 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method714(arg0 - 56);
                } catch (Exception var3) {
                }
            }
        }
        this.field548 = null;
        if (arg0 != 55) {
            field535 = true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lb;")
    public static final class7 method172(int arg0, int arg1) {
        field556++;
        class7 var2 = (class7) class129.field2817.method660(arg1 ^ 0x1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class53.field1214.method932(-107, arg0, 1);
        class7 var4 = new class7();
        if (var3 != null) {
            var4.method36(arg0, (byte) -121, new class119(var3));
        }
        var4.method32(3);
        class129.field2817.method666(false, var4, (long) arg0);
        if (arg1 != -1) {
            method179(71, -68, 36, 64);
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static void method173(boolean arg0) {
        field537 = null;
        field536 = null;
        field557 = null;
        field550 = null;
        field541 = null;
        field562 = null;
        field542 = null;
        field532 = null;
        if (arg0) {
            field557 = null;
        }
        field552 = null;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
    public final void method174(byte arg0) {
        field544++;
        if (arg0 != -50) {
            field532 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lec;Lec;I)V")
    public static final void method175(class28 arg0, class28 arg1, int arg2) {
        class21.field475 = arg0;
        class21.field465 = arg1;
        int var3 = -89 / ((-arg2 - 33) / 59);
        field554++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([B[Lub;IIIII)V")
    public static final void method176(byte[] arg0, class117[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field551++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg1[var7].field2479[arg6 + var12][arg5 + var13] = class106.method732(arg1[var7].field2479[arg6 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class119 var8 = new class119(arg0);
        for (int var9 = arg4; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class23.method167(0, var8, true, arg3, arg6 + var10, arg5 + var11, var9, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public final void method177(int arg0) {
        if (arg0 == 82) {
            field546++;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public final void method178(byte arg0) {
        if (this.field539) {
            try {
                class59.method477("midibox.src=\"c:\\silence.mid\";", this.field534.field1871, -23103);
            } catch (Throwable var2) {
            }
            this.field539 = false;
        }
        field538++;
        if (arg0 != 81) {
            field536 = null;
        }
        this.field548 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public static final void method179(int arg0, int arg1, int arg2, int arg3) {
        field555++;
        int var4 = 0;
        if (arg2 < 47) {
            return;
        }
        while (var4 < 8) {
            for (int var7 = 0; var7 < 8; var7++) {
                class118.field2523[arg3][arg1 + var4][arg0 + var7] = 0;
            }
            var4++;
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class118.field2523[arg3][arg1][arg0 + var5] = class118.field2523[arg3][arg1 - 1][arg0 + var5];
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class118.field2523[arg3][arg1 + var6][arg0] = class118.field2523[arg3][arg1 + var6][arg0 - 1];
            }
        }
        if (arg1 > 0 && class118.field2523[arg3][arg1 - 1][arg0] != 0) {
            class118.field2523[arg3][arg1][arg0] = class118.field2523[arg3][arg1 - 1][arg0];
        } else if (arg0 > 0 && class118.field2523[arg3][arg1][arg0 - 1] != 0) {
            class118.field2523[arg3][arg1][arg0] = class118.field2523[arg3][arg1][arg0 - 1];
        } else if (arg1 > 0 && arg0 > 0 && class118.field2523[arg3][arg1 - 1][arg0 - 1] != 0) {
            class118.field2523[arg3][arg1][arg0] = class118.field2523[arg3][arg1 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ[BZ)V")
    public final void method180(int arg0, boolean arg1, byte[] arg2, boolean arg3) {
        field543++;
        this.field548 = this.field534.method625(0);
        if (this.field548 == null) {
            return;
        }
        if (arg0 == 0) {
            arg0 = 1;
        }
        this.field547 = class127.method969(arg0, 22);
        if (!arg1) {
            this.field553 = arg2;
            this.field540 = arg3;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lnd;)V")
    public class25(class82 arg0) {
        this.field534 = arg0;
    }
}
