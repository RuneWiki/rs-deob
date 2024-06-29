import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class454 {

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lnf;")
    private class389 field6603 = new class389();

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lnf;")
    private class389 field6609 = new class389();

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lnf;")
    private class389 field6613 = new class389();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lnf;")
    private class389 field6614 = new class389();

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Lae;")
    private class156 field6615 = new class156(4);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "B")
    private byte field6621 = 0;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public volatile int field6620 = 0;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public volatile int field6619 = 0;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "Lae;")
    private class156 field6622 = new class156(8);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[I")
    public static int[] field6605 = new int[1000];

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lwt;")
    public static class194 field6597 = new class194("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Liu;")
    public static class390 field6611 = new class390(7, 2);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    private int field6618;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "J")
    private long field6617;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "Lrb;")
    private class225 field6623;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lfd;")
    private class350 field6616;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
    public static int[] field6602;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method2638(int arg0) {
        field6601++;
        if (this.field6616 == null) {
            return;
        }
        try {
            this.field6615.field2018 = 0;
            this.field6615.method947(-96, 7);
            this.field6615.method982(0, (byte) -47);
            if (arg0 < 50) {
                this.method2644((byte) -19);
            }
            this.field6616.method2121(4, this.field6615.field2041, false, 0);
        } catch (IOException var3) {
            try {
                this.field6616.method2123(-36);
            } catch (Exception var2) {
            }
            this.field6620++;
            this.field6619 = -2;
            this.field6616 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)I")
    private final int method2639(int arg0) {
        if (arg0 != 21574) {
            this.field6621 = 13;
        }
        field6607++;
        return this.field6613.method2343(true) + this.field6614.method2343(true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZILbn;)V")
    public static final void method2640(boolean arg0, int arg1, class294 arg2) {
        field6600++;
        class171 var3 = arg2.method1767(16643);
        if (arg2.field4277 == 0) {
            arg2.field4275 = 0;
            class45.field688 = -1;
            class428.field6299 = 0;
            return;
        }
        if (arg2.field4215 != -1 && arg2.field4206 == 0) {
            class168 var4 = class286.field4083.method2602(-24462, arg2.field4215);
            if (arg2.field4274 > 0 && var4.field2227 == 0) {
                arg2.field4275++;
                class45.field688 = -1;
                class428.field6299 = 0;
                return;
            }
            if (arg2.field4274 <= 0 && var4.field2225 == 0) {
                arg2.field4275++;
                class428.field6299 = 0;
                class45.field688 = -1;
                return;
            }
        }
        if (arg2.field4269 != -1 && class263.field3748 >= arg2.field4191) {
            class366 var5 = class53.field820.method2427(arg2.field4269, arg1 - 17774);
            if (var5.field5517 && var5.field5501 != -1) {
                class168 var6 = class286.field4083.method2602(-24462, var5.field5501);
                if (arg2.field4274 > 0 && var6.field2227 == 0) {
                    arg2.field4275++;
                    class45.field688 = -1;
                    class428.field6299 = 0;
                    return;
                }
                if (arg2.field4274 <= 0 && var6.field2225 == 0) {
                    arg2.field4275++;
                    class45.field688 = -1;
                    class428.field6299 = 0;
                    return;
                }
            }
        }
        if (arg2.field4269 != -1 && arg2.field4191 <= class263.field3748) {
            class366 var7 = class53.field820.method2427(arg2.field4269, arg1 - 17774);
            if (var7.field5517 && var7.field5501 != -1) {
                class168 var8 = class286.field4083.method2602(-24462, var7.field5501);
                if (arg2.field4274 > 0 && var8.field2227 == 0) {
                    class45.field688 = -1;
                    class428.field6299 = 0;
                    arg2.field4275++;
                    return;
                }
                if (arg2.field4274 <= 0 && var8.field2225 == 0) {
                    arg2.field4275++;
                    class428.field6299 = 0;
                    class45.field688 = -1;
                    return;
                }
            }
        }
        int var9 = arg2.field2959;
        int var10 = arg2.field2966;
        int var11 = arg2.field4279[arg2.field4277 - 1] * 128 + (arg2.method1773(-69) * 64);
        int var12 = arg2.field4282[arg2.field4277 - 1] * 128 + (arg2.method1773(-22) * 64);
        if (var9 >= var11) {
            if (var11 < var9) {
                if (var10 < var12) {
                    arg2.method1775((byte) -66, 6144);
                } else if (var12 < var10) {
                    arg2.method1775((byte) -107, 2048);
                } else {
                    arg2.method1775((byte) 127, 4096);
                }
            } else if (var10 < var12) {
                arg2.method1775((byte) 97, 8192);
            } else if (var12 < var10) {
                arg2.method1775((byte) 40, 0);
            }
        } else if (var10 < var12) {
            arg2.method1775((byte) 44, 10240);
        } else if (var12 < var10) {
            arg2.method1775((byte) 71, 14336);
        } else {
            arg2.method1775((byte) 117, 12288);
        }
        byte var13 = arg2.field4278[arg2.field4277 - arg1];
        if (!arg0 && (var11 - var9 > 256 || (var11 - var9) < -256 || (var12 - var10) > 256 || (var12 - var10) < -256)) {
            arg2.field2959 = var11;
            arg2.field2966 = var12;
            arg2.method1771(-13670, arg2.field4240);
            arg2.field4277--;
            class428.field6299 = 0;
            class45.field688 = -1;
            if (arg2.field4274 > 0) {
                arg2.field4274--;
            }
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg2 instanceof class139) {
            var15 = ((class139) arg2).field1825.field3846;
        }
        if (var15) {
            int var16 = arg2.field4240 - arg2.field4200.field416;
            if (var16 != 0 && arg2.field4222 == -1 && arg2.field4226 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg2.field4277 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg2.field4277 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg2.field4277 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg2.field4277 > 2) {
                var14 = 8;
            }
        }
        if (arg2.field4275 > 0 && arg2.field4277 > 1) {
            arg2.field4275--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field2284 != -1) {
            int var17 = var14 << 7;
            if (arg2.field4277 == 1) {
                int var18 = arg2.field4273 * arg2.field4273;
                int var19 = (arg2.field2959 <= var11 ? var11 - arg2.field2959 : arg2.field2959 - var11) << 7;
                int var20 = (var12 >= arg2.field2966 ? var12 - arg2.field2966 : -var12 + arg2.field2966) << 7;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field2284 * var21 * 2;
                if (var22 < var18) {
                    arg2.field4273 /= 2;
                } else if (var21 < var18 / 2) {
                    arg2.field4273 -= var3.field2284;
                    if (arg2.field4273 < 0) {
                        arg2.field4273 = 0;
                    }
                } else if (arg2.field4273 < var17) {
                    arg2.field4273 += var3.field2284;
                    if (arg2.field4273 > var17) {
                        arg2.field4273 = var17;
                    }
                }
            } else if (arg2.field4273 < var17) {
                arg2.field4273 += var3.field2284;
                if (arg2.field4273 > var17) {
                    arg2.field4273 = var17;
                }
            } else if (arg2.field4273 > 0) {
                arg2.field4273 -= var3.field2284;
                if (arg2.field4273 < 0) {
                    arg2.field4273 = 0;
                }
            }
            var14 = arg2.field4273 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class428.field6299 = 0;
        if (var11 > var9) {
            class428.field6299 |= 0x4;
            arg2.field2959 += var14;
            if (var11 < arg2.field2959) {
                arg2.field2959 = var11;
            }
        } else if (var9 > var11) {
            class428.field6299 |= 0x8;
            arg2.field2959 -= var14;
            if (arg2.field2959 < var11) {
                arg2.field2959 = var11;
            }
        }
        if (var12 > var10) {
            arg2.field2966 += var14;
            class428.field6299 |= 0x1;
            if (var12 < arg2.field2966) {
                arg2.field2966 = var12;
            }
        } else if (var10 > var12) {
            arg2.field2966 -= var14;
            class428.field6299 |= 0x2;
            if (var12 > arg2.field2966) {
                arg2.field2966 = var12;
            }
        }
        if (var14 >= 8) {
            class45.field688 = 2;
        } else {
            class45.field688 = var13;
        }
        if (arg2.field2959 != var11 || arg2.field2966 != var12) {
            return;
        }
        arg2.field4277--;
        if (arg2.field4274 > 0) {
            arg2.field4274--;
            return;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    private final void method2641(byte arg0) {
        field6592++;
        if (arg0 > -107) {
            this.method2651(91);
        }
        if (this.field6616 == null) {
            return;
        }
        try {
            this.field6615.field2018 = 0;
            this.field6615.method947(-117, 6);
            this.field6615.method982(3, (byte) -47);
            this.field6616.method2121(4, this.field6615.field2041, false, 0);
        } catch (IOException var3) {
            try {
                this.field6616.method2123(3);
            } catch (Exception var2) {
            }
            this.field6619 = -2;
            this.field6620++;
            this.field6616 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)I")
    public final int method2642(int arg0) {
        field6610++;
        return arg0 == 3703 ? this.field6603.method2343(true) + this.field6609.method2343(true) : 118;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIBBZ)Lrb;")
    public final class225 method2643(int arg0, int arg1, byte arg2, byte arg3, boolean arg4) {
        field6606++;
        long var6 = (long) ((arg1 << 16) + arg0);
        class225 var8 = new class225();
        var8.field1127 = arg4;
        var8.field1291 = var6;
        if (arg3 != -30) {
            this.field6616 = null;
        }
        var8.field3178 = arg2;
        if (arg4) {
            if (this.method2642(3703) >= 20) {
                throw new RuntimeException();
            }
            this.field6603.method2342((byte) 107, var8);
        } else if (this.method2639(21574) < 20) {
            this.field6613.method2342((byte) 69, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public final void method2644(byte arg0) {
        if (this.field6616 != null) {
            this.field6616.method2127(125);
        }
        field6593++;
        if (arg0 != -111) {
            field6611 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)Z")
    public final boolean method2645(int arg0) {
        field6594++;
        if (this.field6616 != null) {
            long var2 = class109.method653(false);
            int var4 = (int) (var2 - this.field6617);
            this.field6617 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6618 += var4;
            if (this.field6618 > 30000) {
                try {
                    this.field6616.method2123(111);
                } catch (Exception var27) {
                }
                this.field6616 = null;
            }
        }
        if (this.field6616 == null) {
            return this.method2642(3703) == 0 && this.method2639(21574) == 0;
        }
        try {
            this.field6616.method2128(-22468);
            for (class225 var5 = (class225) this.field6603.method2347((byte) -115); var5 != null; var5 = (class225) this.field6603.method2341(102)) {
                this.field6615.field2018 = 0;
                this.field6615.method947(-94, 1);
                this.field6615.method982((int) var5.field1291, (byte) -47);
                this.field6616.method2121(4, this.field6615.field2041, false, 0);
                this.field6609.method2342((byte) 81, var5);
            }
            for (class225 var6 = (class225) this.field6613.method2347((byte) -114); var6 != null; var6 = (class225) this.field6613.method2341(107)) {
                this.field6615.field2018 = 0;
                this.field6615.method947(-108, 0);
                this.field6615.method982((int) var6.field1291, (byte) -47);
                this.field6616.method2121(4, this.field6615.field2041, false, 0);
                this.field6614.method2342((byte) 109, var6);
            }
            if (arg0 <= 19) {
                this.field6621 = -62;
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field6616.method2120(91);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field6618 = 0;
                byte var9 = 0;
                if (this.field6623 == null) {
                    var9 = 8;
                } else if (this.field6623.field3184 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field6622.field2018;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field6616.method2125(var10, (byte) -55, this.field6622.field2041, this.field6622.field2018);
                    if (this.field6621 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field6622.field2041[this.field6622.field2018 + var11] = (byte) class17.method121(this.field6622.field2041[this.field6622.field2018 + var11], this.field6621);
                        }
                    }
                    this.field6622.field2018 += var10;
                    if (var9 <= this.field6622.field2018) {
                        if (this.field6623 == null) {
                            this.field6622.field2018 = 0;
                            int var12 = this.field6622.method941((byte) 125);
                            int var13 = this.field6622.method993((byte) -51);
                            int var14 = this.field6622.method941((byte) 124);
                            int var15 = this.field6622.method950(186);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class225 var21;
                            if (var17) {
                                for (var21 = (class225) this.field6614.method2347((byte) -124); var21 != null && var21.field1291 != var18; var21 = (class225) this.field6614.method2341(112)) {
                                }
                            } else {
                                for (var21 = (class225) this.field6609.method2347((byte) -127); var21 != null && var21.field1291 != var18; var21 = (class225) this.field6609.method2341(119)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field6623 = var21;
                            this.field6623.field3183 = new class156(var15 + var22 + this.field6623.field3178);
                            this.field6623.field3183.method947(-34, var16);
                            this.field6623.field3183.method969(19869, var15);
                            this.field6623.field3184 = 8;
                            this.field6622.field2018 = 0;
                        } else if (this.field6623.field3184 != 0) {
                            throw new IOException();
                        } else if (this.field6622.field2041[0] == -1) {
                            this.field6623.field3184 = 1;
                            this.field6622.field2018 = 0;
                        } else {
                            this.field6623 = null;
                        }
                    }
                } else {
                    int var23 = this.field6623.field3183.field2041.length - this.field6623.field3178;
                    int var24 = 512 - this.field6623.field3184;
                    if (var23 - this.field6623.field3183.field2018 < var24) {
                        var24 = var23 - this.field6623.field3183.field2018;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field6616.method2125(var24, (byte) -55, this.field6623.field3183.field2041, this.field6623.field3183.field2018);
                    if (this.field6621 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field6623.field3183.field2041[this.field6623.field3183.field2018 + var25] = (byte) class17.method121(this.field6623.field3183.field2041[this.field6623.field3183.field2018 + var25], this.field6621);
                        }
                    }
                    this.field6623.field3184 += var24;
                    this.field6623.field3183.field2018 += var24;
                    if (this.field6623.field3183.field2018 == var23) {
                        this.field6623.method589((byte) 51);
                        this.field6623.field1128 = false;
                        this.field6623 = null;
                    } else if (this.field6623.field3184 == 512) {
                        this.field6623.field3184 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field6616.method2123(127);
            } catch (Exception var26) {
            }
            this.field6620++;
            this.field6616 = null;
            this.field6619 = -2;
            return this.method2642(3703) == 0 && this.method2639(21574) == 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public final void method2646(int arg0) {
        if (arg0 >= 123) {
            if (this.field6616 != null) {
                this.field6616.method2123(127);
            }
            field6599++;
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public static void method2647(int arg0) {
        field6611 = null;
        field6602 = null;
        field6605 = null;
        if (arg0 != -13467) {
            method2647(-101);
        }
        field6597 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BZLfd;)V")
    public final void method2648(byte arg0, boolean arg1, class350 arg2) {
        if (this.field6616 != null) {
            try {
                this.field6616.method2123(121);
            } catch (Exception var8) {
            }
            this.field6616 = null;
        }
        field6596++;
        this.field6616 = arg2;
        this.method2641((byte) -127);
        this.method2653(arg1, (byte) -85);
        this.field6623 = null;
        this.field6622.field2018 = 0;
        while (true) {
            class225 var4 = (class225) this.field6609.method2344(1);
            if (var4 == null) {
                while (true) {
                    class225 var5 = (class225) this.field6614.method2344(1);
                    if (var5 == null) {
                        if (this.field6621 != 0) {
                            try {
                                this.field6615.field2018 = 0;
                                this.field6615.method947(-46, 4);
                                this.field6615.method947(-115, this.field6621);
                                this.field6615.method961(0, 1608339368);
                                this.field6616.method2121(4, this.field6615.field2041, false, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field6616.method2123(115);
                                } catch (Exception var6) {
                                }
                                this.field6619 = -2;
                                this.field6620++;
                                this.field6616 = null;
                            }
                        }
                        this.field6618 = 0;
                        this.field6617 = class109.method653(false);
                        if (arg0 >= -111) {
                            this.method2645(13);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.field6613.method2342((byte) 93, var5);
                }
            }
            this.field6603.method2342((byte) 115, var4);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public final void method2649(boolean arg0) {
        field6604++;
        try {
            this.field6616.method2123(118);
        } catch (Exception var2) {
        }
        this.field6616 = null;
        this.field6619 = -1;
        this.field6620++;
        this.field6621 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (!arg0) {
            this.method2638(-28);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2650(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class41.field628 = arg0;
        class153.field1965 = 0x1 << class41.field628;
        class170.field2281 = class153.field1965 >> 1;
        class218.field3066 = (int) Math.sqrt((double) (class170.field2281 * class170.field2281 + class170.field2281 * class170.field2281));
        class156.field2043 = class153.field1965 >> 2;
        class407.field5971 = class153.field1965;
        class282.field4031 = arg2;
        class98.field1339 = arg3;
        class210.field2977 = arg4;
        class363.field5460 = new class468[arg1][class282.field4031][class98.field1339];
        class459.field6685 = new class441[arg1];
        if (arg5) {
            class285.field4073 = new int[class282.field4031][class98.field1339];
            class502.field7676 = new byte[class282.field4031][class98.field1339];
            class256.field3674 = new byte[class282.field4031][class98.field1339];
            class239.field3347 = new class468[1][class282.field4031][class98.field1339];
            class178.field2562 = new class441[1];
        } else {
            class285.field4073 = null;
            class502.field7676 = null;
            class256.field3674 = null;
            class239.field3347 = null;
            class178.field2562 = null;
        }
        if (arg6) {
            class310.field4512 = new long[arg1][arg2][arg3];
            class76.field1084 = new class373[65535];
            class415.field6147 = new boolean[65535];
            class387.field5731 = 0;
        } else {
            class310.field4512 = null;
            class76.field1084 = null;
            class415.field6147 = null;
            class387.field5731 = 0;
        }
        class181.method1149(false);
        class456.field6642 = new class497[1000];
        class55.field847 = 0;
        class325.field4750 = new class497[1000];
        class172.field2349 = 0;
        class479.field6919 = new int[arg1][class282.field4031 + 1][class98.field1339 + 1];
        class451.field6573 = new class210[5000];
        class134.field1712 = 0;
        class52.field777 = new boolean[class210.field2977 + class210.field2977 + 1][class210.field2977 + class210.field2977 + 1];
        class139.field1822 = new boolean[class210.field2977 + class210.field2977 + 2][class210.field2977 + class210.field2977 + 2];
        class248.field3564 = null;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Z")
    public final boolean method2651(int arg0) {
        field6608++;
        if (arg0 != 0) {
            this.method2653(true, (byte) 45);
        }
        return this.method2642(3703) >= 20;
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(I)Z")
    public final boolean method2652(int arg0) {
        if (arg0 != 20) {
            this.field6619 = -79;
        }
        field6598++;
        return this.method2639(21574) >= 20;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZB)V")
    public final void method2653(boolean arg0, byte arg1) {
        field6595++;
        if (this.field6616 == null) {
            return;
        }
        try {
            if (arg1 >= -31) {
                this.field6619 = -86;
            }
            this.field6615.field2018 = 0;
            this.field6615.method947(-66, arg0 ? 2 : 3);
            this.field6615.method982(0, (byte) -47);
            this.field6616.method2121(4, this.field6615.field2041, false, 0);
        } catch (IOException var4) {
            try {
                this.field6616.method2123(-42);
            } catch (Exception var3) {
            }
            this.field6620++;
            this.field6619 = -2;
            this.field6616 = null;
        }
    }
}
