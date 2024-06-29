import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class425 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Lcs;")
    private class225 field6200 = new class225();

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Lcs;")
    private class225 field6213 = new class225();

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "Lcs;")
    private class225 field6219 = new class225();

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "Lcs;")
    private class225 field6221 = new class225();

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "Llh;")
    private class365 field6224 = new class365(4);

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public volatile int field6227 = 0;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "B")
    private byte field6229 = 0;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public volatile int field6226 = 0;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "Llh;")
    private class365 field6228 = new class365(8);

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "J")
    public static volatile long field6205 = 0L;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lrn;")
    public static class174 field6198 = class236.method1376(true);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    private int field6225;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "J")
    private long field6223;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "Lwf;")
    private class88 field6230;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "Lmr;")
    private class95 field6222;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "[[S")
    public static short[][] field6216;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2535(boolean arg0) {
        if (!arg0) {
            field6198 = null;
        }
        field6216 = null;
        field6198 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 14)
    private final void method2536(int arg0) {
        field6204++;
        if (this.field6222 == null) {
            return;
        }
        try {
            this.field6224.field5069 = 0;
            this.field6224.method2084(6, false);
            this.field6224.method2088(98, 3);
            if (arg0 >= -28) {
                field6198 = null;
            }
            this.field6222.method643(this.field6224.field5073, 4, -1, 0);
        } catch (IOException var3) {
            try {
                this.field6222.method644(-95);
            } catch (Exception var2) {
            }
            this.field6226 = -2;
            this.field6227++;
            this.field6222 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Z", line = 42)
    public final boolean method2537(int arg0) {
        field6207++;
        if (arg0 <= 27) {
            return true;
        } else {
            return this.method2541(0) >= 20;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z", line = 55)
    public final boolean method2538(byte arg0) {
        if (arg0 < 46) {
            this.field6219 = null;
        }
        field6209++;
        return this.method2549(false) >= 20;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z", line = 67)
    public static final boolean method2539(int arg0, int arg1, int arg2) {
        if (arg2 != -30001) {
            field6205 = -64L;
        }
        field6202++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZILmr;)V", line = 82)
    public final void method2540(boolean arg0, int arg1, class95 arg2) {
        field6212++;
        if (this.field6222 != null) {
            try {
                this.field6222.method644(-99);
            } catch (Exception var9) {
            }
            this.field6222 = null;
        }
        int var4 = 13 / ((-arg1 - 41) / 38);
        this.field6222 = arg2;
        this.method2536(-30);
        this.method2551(arg0, (byte) 107);
        this.field6228.field5069 = 0;
        this.field6230 = null;
        while (true) {
            class88 var5 = (class88) this.field6213.method1334(95);
            if (var5 == null) {
                while (true) {
                    class88 var6 = (class88) this.field6221.method1334(-125);
                    if (var6 == null) {
                        if (this.field6229 != 0) {
                            try {
                                this.field6224.field5069 = 0;
                                this.field6224.method2084(4, false);
                                this.field6224.method2084(this.field6229, false);
                                this.field6224.method2070(81954016, 0);
                                this.field6222.method643(this.field6224.field5073, 4, -1, 0);
                            } catch (IOException var8) {
                                try {
                                    this.field6222.method644(-122);
                                } catch (Exception var7) {
                                }
                                this.field6227++;
                                this.field6226 = -2;
                                this.field6222 = null;
                            }
                        }
                        this.field6225 = 0;
                        this.field6223 = class333.method1850(-3562);
                        return;
                    }
                    this.field6219.method1335(-571093627, var6);
                }
            }
            this.field6200.method1335(-571093627, var5);
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I", line = 151)
    private final int method2541(int arg0) {
        field6199++;
        return arg0 == 0 ? this.field6219.method1331(-244) + this.field6221.method1331(-244) : -32;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V", line = 167)
    public final void method2542(int arg0) {
        try {
            this.field6222.method644(-123);
        } catch (Exception var2) {
        }
        field6220++;
        this.field6229 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field6226 = -1;
        if (arg0 != -5451) {
            field6198 = null;
        }
        this.field6222 = null;
        this.field6227++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIZB)Lwf;", line = 187)
    public final class88 method2543(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field6214++;
        long var6 = (long) ((arg0 << 16) + arg2);
        class88 var8 = new class88();
        var8.field1204 = arg4;
        var8.field1140 = var6;
        int var9 = -20 % ((arg1 + 18) / 60);
        var8.field3809 = arg3;
        if (arg3) {
            if (this.method2549(false) >= 20) {
                throw new RuntimeException();
            }
            this.field6200.method1335(-571093627, var8);
        } else if (this.method2541(0) < 20) {
            this.field6219.method1335(-571093627, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lht;BIIII)Lcq;", line = 229)
    public static final class325 method2544(class410 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 > -85) {
            method2547(-30);
        }
        field6201++;
        if (!arg0.field5991 && (!class455.method2685(arg3, 20721) || !class455.method2685(arg4, 20721))) {
            return arg0.field5905 ? new class325(arg0, 34037, arg2, arg5, arg3, arg4, true) : new class325(arg0, arg2, arg5, arg3, arg4, class420.method2513(arg3, 0), class420.method2513(arg4, 0), true);
        } else {
            return new class325(arg0, 3553, arg2, arg5, arg3, arg4, true);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 250)
    public final void method2545(byte arg0) {
        field6203++;
        if (this.field6222 == null) {
            return;
        }
        try {
            this.field6224.field5069 = 0;
            this.field6224.method2084(7, false);
            if (arg0 >= -5) {
                this.method2543(3, -1, 31, true, (byte) 38);
            }
            this.field6224.method2088(41, 0);
            this.field6222.method643(this.field6224.field5073, 4, -1, 0);
        } catch (IOException var3) {
            try {
                this.field6222.method644(-121);
            } catch (Exception var2) {
            }
            this.field6222 = null;
            this.field6227++;
            this.field6226 = -2;
        }
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V", line = 278)
    public final void method2546(int arg0) {
        if (this.field6222 != null) {
            this.field6222.method644(-99);
        }
        if (arg0 != 24726) {
            this.field6226 = 76;
        }
        field6217++;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V", line = 293)
    public static final void method2547(int arg0) {
        class366.field5141 = false;
        field6211++;
        class263.field3604 = null;
        if (arg0 == 34037) {
            class242.method1428((byte) 60);
        }
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)Z", line = 313)
    public final boolean method2548(int arg0) {
        if (this.field6222 != null) {
            long var2 = class333.method1850(-3562);
            int var4 = (int) (var2 - this.field6223);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6223 = var2;
            this.field6225 += var4;
            if (this.field6225 > 30000) {
                try {
                    this.field6222.method644(-104);
                } catch (Exception var27) {
                }
                this.field6222 = null;
            }
        }
        field6208++;
        if (this.field6222 == null) {
            return this.method2549(false) == 0 && this.method2541(arg0 + 31882) == 0;
        }
        try {
            this.field6222.method641(arg0 ^ 0xFFFF8314);
            if (arg0 != -31882) {
                return true;
            }
            for (class88 var5 = (class88) this.field6200.method1328((byte) -94); var5 != null; var5 = (class88) this.field6200.method1330(192)) {
                this.field6224.field5069 = 0;
                this.field6224.method2084(1, false);
                this.field6224.method2088(62, (int) var5.field1140);
                this.field6222.method643(this.field6224.field5073, 4, -1, 0);
                this.field6213.method1335(-571093627, var5);
            }
            for (class88 var6 = (class88) this.field6219.method1328((byte) -107); var6 != null; var6 = (class88) this.field6219.method1330(arg0 + 32074)) {
                this.field6224.field5069 = 0;
                this.field6224.method2084(0, false);
                this.field6224.method2088(arg0 ^ 0xFFFF8357, (int) var6.field1140);
                this.field6222.method643(this.field6224.field5073, 4, -1, 0);
                this.field6221.method1335(arg0 ^ 0x220A4EF3, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field6222.method645((byte) -95);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field6225 = 0;
                byte var9 = 0;
                if (this.field6230 == null) {
                    var9 = 8;
                } else if (this.field6230.field1205 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field6228.field5069;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field6222.method649(var10, false, this.field6228.field5069, this.field6228.field5073);
                    if (this.field6229 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field6228.field5073[this.field6228.field5069 + var11] = (byte) class63.method396(this.field6228.field5073[this.field6228.field5069 + var11], this.field6229);
                        }
                    }
                    this.field6228.field5069 += var10;
                    if (var9 <= this.field6228.field5069) {
                        if (this.field6230 == null) {
                            this.field6228.field5069 = 0;
                            int var12 = this.field6228.method2099(arg0 + 32137);
                            int var13 = this.field6228.method2062((byte) 14);
                            int var14 = this.field6228.method2099(arg0 ^ 0xFFFF8389);
                            int var15 = this.field6228.method2056((byte) 97);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class88 var21;
                            if (var17) {
                                for (var21 = (class88) this.field6221.method1328((byte) -126); var21 != null && var21.field1140 != var18; var21 = (class88) this.field6221.method1330(arg0 + 32074)) {
                                }
                            } else {
                                for (var21 = (class88) this.field6213.method1328((byte) -79); var21 != null && var21.field1140 != var18; var21 = (class88) this.field6213.method1330(192)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field6230 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field6230.field1206 = new class365(this.field6230.field1204 + var22 + var15);
                            this.field6230.field1206.method2084(var16, false);
                            this.field6230.field1206.method2074(false, var15);
                            this.field6230.field1205 = 8;
                            this.field6228.field5069 = 0;
                        } else if (this.field6230.field1205 != 0) {
                            throw new IOException();
                        } else if (this.field6228.field5073[0] == -1) {
                            this.field6228.field5069 = 0;
                            this.field6230.field1205 = 1;
                        } else {
                            this.field6230 = null;
                        }
                    }
                } else {
                    int var23 = this.field6230.field1206.field5073.length - this.field6230.field1204;
                    int var24 = 512 - this.field6230.field1205;
                    if ((var23 - this.field6230.field1206.field5069) < var24) {
                        var24 = var23 - this.field6230.field1206.field5069;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field6222.method649(var24, false, this.field6230.field1206.field5069, this.field6230.field1206.field5073);
                    if (this.field6229 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field6230.field1206.field5073[this.field6230.field1206.field5069 + var25] = (byte) class63.method396(this.field6230.field1206.field5073[this.field6230.field1206.field5069 + var25], this.field6229);
                        }
                    }
                    this.field6230.field1205 += var24;
                    this.field6230.field1206.field5069 += var24;
                    if (this.field6230.field1206.field5069 == var23) {
                        this.field6230.method581(4);
                        this.field6230.field3807 = false;
                        this.field6230 = null;
                    } else if (this.field6230.field1205 == 512) {
                        this.field6230.field1205 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field6222.method644(-90);
            } catch (Exception var26) {
            }
            this.field6226 = -2;
            this.field6227++;
            this.field6222 = null;
            return this.method2549(false) == 0 && this.method2541(arg0 + 31882) == 0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)I", line = 593)
    public final int method2549(boolean arg0) {
        field6218++;
        return arg0 ? -9 : this.field6200.method1331(-244) + this.field6213.method1331(-244);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V", line = 610)
    public final void method2550(byte arg0) {
        if (this.field6222 != null) {
            this.field6222.method642(5000);
        }
        if (arg0 != -64) {
            this.method2549(false);
        }
        field6215++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V", line = 639)
    public final void method2551(boolean arg0, byte arg1) {
        field6206++;
        if (this.field6222 == null) {
            return;
        }
        try {
            this.field6224.field5069 = 0;
            this.field6224.method2084(arg0 ? 2 : 3, false);
            this.field6224.method2088(91, 0);
            if (arg1 != 107) {
                this.field6227 = 84;
            }
            this.field6222.method643(this.field6224.field5073, 4, -1, 0);
        } catch (IOException var4) {
            try {
                this.field6222.method644(arg1 ^ 0xFFFFFFC4);
            } catch (Exception var3) {
            }
            this.field6222 = null;
            this.field6227++;
            this.field6226 = -2;
        }
    }
}
