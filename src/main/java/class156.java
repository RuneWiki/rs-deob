import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class156 {

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
    private boolean field2320 = false;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    private int field2323 = 32;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "J")
    private long field2325 = class493.method2937(-72);

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "[Lfp;")
    private class214[] field2335 = new class214[8];

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    private int field2338 = 0;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Z")
    private boolean field2339 = true;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "J")
    private long field2340 = 0L;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    private int field2337 = 0;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "J")
    private long field2343 = 0L;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    private int field2346 = 0;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    private int field2347 = 0;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "[Lfp;")
    private class214[] field2348 = new class214[8];

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Ltr;")
    public static class195 field2336;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Lob;")
    public static class521 field2342;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lfp;")
    private class214 field2321;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    public int[] field2319;

    static {
        new class234("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field2336 = new class195(9, 7);
        field2342 = new class521(71, 4);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 4)
    public void method201(int arg0) throws Exception {
        field2329++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V", line = 12)
    public void method204() throws Exception {
        field2324++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()V", line = 19)
    public void method203() throws Exception {
        field2326++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([II)V", line = 27)
    private final void method1066(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class368.field5405) {
            var3 = arg1 << 1;
        }
        class414.method2600(arg0, 0, var3);
        this.field2346 -= arg1;
        if (this.field2321 != null && this.field2346 <= 0) {
            this.field2346 += class40.field540 >> 4;
            class189.method1330(1024, this.field2321);
            this.method1069(this.field2321.method1482(), (byte) 81, this.field2321);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class214 var10 = null;
                        class214 var11 = this.field2335[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class306 var12 = var11.field3486;
                                if (var12 == null || var12.field4611 <= var8) {
                                    var11.field3487 = true;
                                    int var13 = var11.method391();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4611 += var13;
                                    }
                                    if (var4 >= this.field2323) {
                                        break label107;
                                    }
                                    class214 var14 = var11.method386();
                                    if (var14 != null) {
                                        int var15 = var11.field3484;
                                        while (var14 != null) {
                                            this.method1069(var15 * var14.method1482() >> 8, (byte) -42, var14);
                                            var14 = var11.method394();
                                        }
                                    }
                                    class214 var16 = var11.field3485;
                                    var11.field3485 = null;
                                    if (var10 == null) {
                                        this.field2335[var7] = var16;
                                    } else {
                                        var10.field3485 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2348[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3485;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class214 var18 = this.field2335[var17];
                this.field2335[var17] = this.field2348[var17] = null;
                while (var18 != null) {
                    class214 var19 = var18.field3485;
                    var18.field3485 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2346 < 0) {
            this.field2346 = 0;
        }
        if (this.field2321 != null) {
            this.field2321.method387(arg0, 0, arg1);
        }
        this.field2325 = class493.method2937(-110);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 185)
    public final synchronized void method1067(int arg0) {
        this.field2339 = true;
        field2330++;
        try {
            if (arg0 == 2000) {
                this.method204();
            }
        } catch (Exception var2) {
            this.method202();
            this.field2340 = class493.method2937(-128) + 2000L;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()V", line = 207)
    public void method202() {
        field2331++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 218)
    public static final void method1068(int arg0, int arg1) {
        field2315++;
        class211 var2 = class452.method2749(arg0, 11, arg1);
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBLfp;)V", line = 231)
    private final void method1069(int arg0, byte arg1, class214 arg2) {
        int var4 = 65 / ((arg1 - 9) / 49);
        field2317++;
        int var5 = arg0 >> 5;
        class214 var6 = this.field2348[var5];
        if (var6 == null) {
            this.field2335[var5] = arg2;
        } else {
            var6.field3485 = arg2;
        }
        this.field2348[var5] = arg2;
        arg2.field3484 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 253)
    public static void method1070(byte arg0) {
        field2336 = null;
        field2342 = null;
        if (arg0 < 32) {
            field2342 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLfp;)V", line = 264)
    public final synchronized void method1071(boolean arg0, class214 arg1) {
        field2333++;
        this.field2321 = arg1;
        if (!arg0) {
            this.field2335 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V", line = 276)
    public final synchronized void method1072(int arg0) {
        field2316++;
        if (arg0 != 50) {
            return;
        }
        if (class305.field4609 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class305.field4609.field4321[var3] == this) {
                    class305.field4609.field4321[var3] = null;
                }
                if (class305.field4609.field4321[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class305.field4609.field4330 = true;
                while (class305.field4609.field4323) {
                    class434.method2690(arg0 ^ 0x38, 50L);
                }
                class305.field4609 = null;
            }
        }
        this.method202();
        this.field2320 = true;
        this.field2319 = null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 324)
    public final synchronized void method1073(byte arg0) {
        field2322++;
        if (this.field2320) {
            return;
        }
        long var2 = class493.method2937(-61);
        try {
            if (this.field2325 + 500000L < var2) {
                this.field2325 = var2 - 500000L;
            }
            while ((this.field2325 + 5000L) < var2) {
                this.method1074(256, -1);
                this.field2325 += (256000 / class40.field540);
            }
        } catch (Exception var7) {
            this.field2325 = var2;
        }
        if (this.field2319 == null) {
            return;
        }
        try {
            if (this.field2340 != 0L) {
                if (this.field2340 > var2) {
                    return;
                }
                this.method201(this.field2344);
                this.field2339 = true;
                this.field2340 = 0L;
            }
            if (arg0 < 99) {
                this.field2348 = null;
            }
            int var4 = this.method198();
            if (this.field2337 < this.field2347 - var4) {
                this.field2337 = this.field2347 - var4;
            }
            int var5 = this.field2345 + this.field2341;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2344) {
                this.field2344 += 1024;
                if (this.field2344 > 16384) {
                    this.field2344 = 16384;
                }
                this.method202();
                var4 = 0;
                this.method201(this.field2344);
                if ((var5 + 256) > this.field2344) {
                    var5 = this.field2344 - 256;
                    this.field2345 = var5 - this.field2341;
                }
                this.field2339 = true;
            }
            while (var4 < var5) {
                this.method1066(this.field2319, 256);
                var4 += 256;
                this.method203();
            }
            if (var2 > this.field2343) {
                if (this.field2339) {
                    this.field2339 = false;
                } else if (this.field2337 == 0 && this.field2338 == 0) {
                    this.method202();
                    this.field2340 = var2 + 2000L;
                    return;
                } else {
                    this.field2345 = Math.min(this.field2338, this.field2337);
                    this.field2338 = this.field2337;
                }
                this.field2343 = var2 + 2000L;
                this.field2337 = 0;
            }
            this.field2347 = var4;
        } catch (Exception var6) {
            this.method202();
            this.field2340 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V", line = 436)
    private final void method1074(int arg0, int arg1) {
        field2327++;
        this.field2346 -= arg0;
        if (~this.field2346 > arg1) {
            this.field2346 = 0;
        }
        if (this.field2321 != null) {
            this.field2321.method389(arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 451)
    public void method200(Component arg0) throws Exception {
        field2334++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 460)
    public final void method1075(boolean arg0) {
        if (arg0) {
            method1068(108, 109);
        }
        this.field2339 = true;
        field2332++;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()I", line = 503)
    public int method198() throws Exception {
        field2328++;
        return this.field2344;
    }
}
