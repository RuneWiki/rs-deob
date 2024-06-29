import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class209 {

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Lmc;")
    private class197 field3626 = new class197();

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Lmc;")
    private class197 field3629 = new class197();

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "Lmc;")
    private class197 field3633 = new class197();

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "Lmc;")
    private class197 field3634 = new class197();

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "Lik;")
    private class261 field3638 = new class261(4);

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public volatile int field3639 = 0;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public volatile int field3642 = 0;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "B")
    private byte field3640 = 0;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "Lik;")
    private class261 field3641 = new class261(8);

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Loa;")
    public static class99 field3619 = class221.method1463(2844, "null");

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[I")
    public static int[] field3613 = new int[2500];

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Z")
    public static boolean field3621 = false;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field3616 = 0;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Z")
    public static boolean field3632 = false;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "J")
    private long field3635;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "Lwd;")
    private class22 field3643;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Lbh;")
    private class7 field3636;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
    public final boolean method1395(int arg0) {
        field3623++;
        if (arg0 <= 11) {
            return false;
        }
        if (this.field3636 != null) {
            long var2 = class231.method1513(118);
            int var4 = (int) (var2 - this.field3635);
            this.field3635 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3637 += var4;
            if (this.field3637 > 30000) {
                try {
                    this.field3636.method54((byte) 125);
                } catch (Exception var27) {
                }
                this.field3636 = null;
            }
        }
        if (this.field3636 == null) {
            return this.method1400(124) == 0 && this.method1401((byte) -12) == 0;
        }
        try {
            this.field3636.method58((byte) 71);
            for (class22 var5 = (class22) this.field3626.method1325(-56); var5 != null; var5 = (class22) this.field3626.method1326(-123)) {
                this.field3638.field4587 = 0;
                this.field3638.method1691(1, (byte) 53);
                this.field3638.method1737((byte) -86, (int) var5.field3476);
                this.field3636.method55(this.field3638.field4619, (byte) -59, 0, 4);
                this.field3629.method1323(-27664, var5);
            }
            for (class22 var6 = (class22) this.field3633.method1325(44); var6 != null; var6 = (class22) this.field3633.method1326(-43)) {
                this.field3638.field4587 = 0;
                this.field3638.method1691(0, (byte) 53);
                this.field3638.method1737((byte) -115, (int) var6.field3476);
                this.field3636.method55(this.field3638.field4619, (byte) -103, 0, 4);
                this.field3634.method1323(-27664, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3636.method62(-1);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3637 = 0;
                byte var9 = 0;
                if (this.field3643 == null) {
                    var9 = 8;
                } else if (this.field3643.field263 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3641.field4587;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field3636.method61(-125, this.field3641.field4619, this.field3641.field4587, var10);
                    if (this.field3640 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3641.field4619[this.field3641.field4587 + var11] = (byte) class28.method249(this.field3641.field4619[this.field3641.field4587 + var11], this.field3640);
                        }
                    }
                    this.field3641.field4587 += var10;
                    if (var9 <= this.field3641.field4587) {
                        if (this.field3643 == null) {
                            this.field3641.field4587 = 0;
                            int var12 = this.field3641.method1693((byte) -93);
                            int var13 = this.field3641.method1740((byte) 116);
                            int var14 = this.field3641.method1693((byte) -113);
                            int var15 = this.field3641.method1712(-4);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class22 var21;
                            if (var17) {
                                for (var21 = (class22) this.field3634.method1325(63); var21 != null && var21.field3476 != var18; var21 = (class22) this.field3634.method1326(-44)) {
                                }
                            } else {
                                for (var21 = (class22) this.field3629.method1325(103); var21 != null && var21.field3476 != var18; var21 = (class22) this.field3629.method1326(-101)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field3643 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field3643.field269 = new class261(var15 + var22 + this.field3643.field268);
                            this.field3643.field269.method1691(var16, (byte) 53);
                            this.field3643.field269.method1701(var15, 4994);
                            this.field3641.field4587 = 0;
                            this.field3643.field263 = 8;
                        } else if (this.field3643.field263 != 0) {
                            throw new IOException();
                        } else if (this.field3641.field4619[0] == -1) {
                            this.field3641.field4587 = 0;
                            this.field3643.field263 = 1;
                        } else {
                            this.field3643 = null;
                        }
                    }
                } else {
                    int var23 = this.field3643.field269.field4619.length - this.field3643.field268;
                    int var24 = 512 - this.field3643.field263;
                    if ((var23 - this.field3643.field269.field4587) < var24) {
                        var24 = var23 - this.field3643.field269.field4587;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field3636.method61(-73, this.field3643.field269.field4619, this.field3643.field269.field4587, var24);
                    if (this.field3640 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3643.field269.field4619[this.field3643.field269.field4587 + var25] = (byte) class28.method249(this.field3643.field269.field4619[this.field3643.field269.field4587 + var25], this.field3640);
                        }
                    }
                    this.field3643.field269.field4587 += var24;
                    this.field3643.field263 += var24;
                    if (this.field3643.field269.field4587 == var23) {
                        this.field3643.method1346(-62);
                        this.field3643.field1766 = false;
                        this.field3643 = null;
                    } else if (this.field3643.field263 == 512) {
                        this.field3643.field263 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3636.method54((byte) 126);
            } catch (Exception var26) {
            }
            this.field3636 = null;
            this.field3642 = -2;
            this.field3639++;
            return this.method1400(123) == 0 && this.method1401((byte) -12) == 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lik;B)V")
    public static final void method1396(class261 arg0, byte arg1) {
        field3611++;
        int var2 = -64 % ((arg1 - 6) / 59);
        while (true) {
            while (arg0.field4587 < arg0.field4619.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method1693((byte) -119) == 1) {
                    var3 = true;
                    var4 = arg0.method1693((byte) 60);
                    var5 = arg0.method1693((byte) -124);
                }
                int var6 = arg0.method1693((byte) 44);
                int var7 = arg0.method1693((byte) -90);
                int var8 = var6 * 64 - class48.field802;
                int var9 = class230.field3983 - (var7 * 64 - class112.field2026) - 1;
                if (var8 >= 0 && (var9 - 63) >= 0 && class218.field3794 > (var8 + 63) && var9 < class230.field3983) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var4 * 8 <= var12 && (var4 * 8 + 8) > var12 && var5 * 8 <= var13 && var5 * 8 + 8 > var13) {
                                byte var14 = arg0.method1706(10819);
                                if (var14 != 0) {
                                    if (class55.field902[var10][var11] == null) {
                                        class55.field902[var10][var11] = new byte[4096];
                                    }
                                    class55.field902[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method1706(10819);
                                    if (class190.field3353[var10][var11] == null) {
                                        class190.field3353[var10][var11] = new byte[4096];
                                    }
                                    class190.field3353[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method1706(10819);
                        if (var17 != 0) {
                            arg0.field4587++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public final void method1397(boolean arg0) {
        field3622++;
        if (this.field3636 == null || arg0) {
            return;
        }
        try {
            this.field3638.field4587 = 0;
            this.field3638.method1691(7, (byte) 53);
            this.field3638.method1737((byte) -112, 0);
            this.field3636.method55(this.field3638.field4619, (byte) -63, 0, 4);
        } catch (IOException var3) {
            try {
                this.field3636.method54((byte) -6);
            } catch (Exception var2) {
            }
            this.field3642 = -2;
            this.field3636 = null;
            this.field3639++;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
    public final void method1398(boolean arg0) {
        field3615++;
        if (arg0) {
            this.method1397(true);
        }
        if (this.field3636 != null) {
            this.field3636.method54((byte) 127);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public final void method1399(byte arg0) {
        field3631++;
        if (this.field3636 != null) {
            this.field3636.method56(63);
        }
        if (arg0 != -10) {
            this.method1400(109);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)I")
    public final int method1400(int arg0) {
        field3617++;
        return arg0 <= 119 ? -123 : this.field3626.method1321(81) + this.field3629.method1321(-63);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)I")
    private final int method1401(byte arg0) {
        field3618++;
        return arg0 == -12 ? this.field3633.method1321(-51) + this.field3634.method1321(-114) : 32;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3619 = null;
        field3613 = null;
        if (arg0 != 0) {
            method1396((class261) null, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(Z)V")
    public final void method1403(boolean arg0) {
        try {
            this.field3636.method54((byte) 123);
        } catch (Exception var2) {
        }
        field3624++;
        if (!arg0) {
            this.field3633 = null;
        }
        this.field3639++;
        this.field3640 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3642 = -1;
        this.field3636 = null;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)Z")
    public final boolean method1404(int arg0) {
        field3625++;
        if (arg0 > -67) {
            return false;
        } else {
            return this.method1400(123) >= 20;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BZLbh;)V")
    public final void method1405(byte arg0, boolean arg1, class7 arg2) {
        field3612++;
        if (this.field3636 != null) {
            try {
                this.field3636.method54((byte) 126);
            } catch (Exception var8) {
            }
            this.field3636 = null;
        }
        this.field3636 = arg2;
        this.method1408(6);
        this.method1406(arg1, -84);
        this.field3641.field4587 = 0;
        this.field3643 = null;
        while (true) {
            class22 var4 = (class22) this.field3629.method1329((byte) 52);
            if (var4 == null) {
                while (true) {
                    class22 var5 = (class22) this.field3634.method1329((byte) 52);
                    if (var5 == null) {
                        if (this.field3640 != 0) {
                            try {
                                this.field3638.field4587 = 0;
                                this.field3638.method1691(4, (byte) 53);
                                this.field3638.method1691(this.field3640, (byte) 53);
                                this.field3638.method1745(0, (byte) 5);
                                this.field3636.method55(this.field3638.field4619, (byte) -60, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field3636.method54((byte) -70);
                                } catch (Exception var6) {
                                }
                                this.field3642 = -2;
                                this.field3636 = null;
                                this.field3639++;
                            }
                        }
                        this.field3637 = 0;
                        this.field3635 = class231.method1513(-105);
                        if (arg0 >= -32) {
                            this.method1406(true, 125);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.field3633.method1323(-27664, var5);
                }
            }
            this.field3626.method1323(-27664, var4);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
    public final void method1406(boolean arg0, int arg1) {
        field3627++;
        if (this.field3636 == null) {
            return;
        }
        try {
            this.field3638.field4587 = 0;
            this.field3638.method1691(arg0 ? 2 : 3, (byte) 53);
            this.field3638.method1737((byte) -120, 0);
            this.field3636.method55(this.field3638.field4619, (byte) -69, 0, 4);
            int var3 = -43 % ((arg1 - 8) / 63);
        } catch (IOException var5) {
            try {
                this.field3636.method54((byte) -113);
            } catch (Exception var4) {
            }
            this.field3639++;
            this.field3636 = null;
            this.field3642 = -2;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZIBI)Lwd;")
    public final class22 method1407(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (arg2 != -21) {
            this.method1404(-3);
        }
        long var6 = (long) ((arg0 << 16) + arg4);
        field3620++;
        class22 var8 = new class22();
        var8.field268 = arg3;
        var8.field1767 = arg1;
        var8.field3476 = var6;
        if (arg1) {
            if (this.method1400(123) >= 20) {
                throw new RuntimeException();
            }
            this.field3626.method1323(-27664, var8);
        } else if (this.method1401((byte) -12) < 20) {
            this.field3633.method1323(-27664, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
    private final void method1408(int arg0) {
        field3614++;
        if (this.field3636 == null) {
            return;
        }
        try {
            this.field3638.field4587 = 0;
            this.field3638.method1691(arg0, (byte) 53);
            this.field3638.method1737((byte) -115, 3);
            this.field3636.method55(this.field3638.field4619, (byte) -109, 0, 4);
        } catch (IOException var3) {
            try {
                this.field3636.method54((byte) 127);
            } catch (Exception var2) {
            }
            this.field3642 = -2;
            this.field3639++;
            this.field3636 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)Z")
    public final boolean method1409(byte arg0) {
        if (arg0 >= -40) {
            this.field3626 = null;
        }
        field3630++;
        return this.method1401((byte) -12) >= 20;
    }
}
