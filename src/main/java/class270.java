import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class270 extends class155 {

    @OriginalMember(owner = "client!de", name = "O", descriptor = "Z")
    public boolean field4485 = true;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Lpf;")
    public static class17 field4484 = new class17(5);

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "[I")
    public static int[] field4489 = new int[32];

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Laj;")
    public static class151 field4488;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "[I")
    private int[] field4487;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "[I")
    public int[] field4491;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "[Ljava/lang/String;")
    private String[] field4478;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "[[I")
    private int[][] field4482;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method1895(int arg0) {
        field4481++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4478 == null) {
            return "";
        }
        var2.append(this.field4478[arg0]);
        for (int var3 = 1; var3 < this.field4478.length; var3++) {
            var2.append("...");
            var2.append(this.field4478[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([IZ[I[ILdl;)V")
    public static final void method1896(int[] arg0, boolean arg1, int[] arg2, int[] arg3, class123 arg4) {
        field4476++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var8 != 0 && var9 < arg4.field799.length; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field799[var9] = null;
                    } else {
                        class163 var10 = class34.method211(var6, 3);
                        int var11 = var10.field2658;
                        class313 var12 = arg4.field799[var9];
                        if (var12 != null) {
                            if (var12.field5040 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field799[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5034 = var7;
                                    var12.field5051 = 0;
                                    var12.field5052 = 0;
                                    var12.field5053 = 0;
                                    var12.field5045 = 1;
                                    class131.method980(class16.field314 == arg4, arg4.field771, arg4.field715, 0, (byte) -114, var10);
                                } else if (var11 == 2) {
                                    var12.field5053 = 0;
                                }
                            } else if (var10.field2662 >= class34.method211(var12.field5040, 3).field2662) {
                                var12 = arg4.field799[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class313 var13 = arg4.field799[var9] = new class313();
                            var13.field5051 = 0;
                            var13.field5053 = 0;
                            var13.field5045 = 1;
                            var13.field5052 = 0;
                            var13.field5040 = var6;
                            var13.field5034 = var7;
                            class131.method980(class16.field314 == arg4, arg4.field771, arg4.field715, 0, (byte) -89, var10);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
        if (!arg1) {
            method1896((int[]) null, true, (int[]) null, (int[]) null, (class123) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)I")
    public final int method1897(int arg0, int arg1, byte arg2) {
        field4475++;
        if (this.field4487 == null || arg1 < 0 || this.field4487.length < arg1) {
            return -1;
        } else {
            if (arg2 <= 67) {
                field4488 = null;
            }
            return this.field4482[arg1] == null || arg0 < 0 || this.field4482[arg1].length < arg0 ? -1 : this.field4482[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lab;B)V")
    public final void method1898(class249 arg0, byte arg1) {
        if (arg1 != 96) {
            this.method1899((class249) null, -105, (int[]) null);
        }
        while (true) {
            int var3 = arg0.method1802((byte) -116);
            if (var3 == 0) {
                field4472++;
                return;
            }
            this.method1904(arg0, (byte) -125, var3);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lab;I[I)V")
    public final void method1899(class249 arg0, int arg1, int[] arg2) {
        field4473++;
        if (this.field4487 == null) {
            return;
        }
        if (arg1 >= -16) {
            method1906(119, 67);
        }
        for (int var4 = 0; var4 < this.field4487.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class205.field3297[this.method1903(true, var4)];
            if (var5 > 0) {
                arg0.method1773(var5, 13345, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method1900(byte arg0) {
        field4489 = null;
        field4488 = null;
        if (arg0 == 5) {
            field4484 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "j", descriptor = "(I)V")
    public final void method1901(int arg0) {
        if (this.field4491 != null) {
            for (int var2 = 0; var2 < this.field4491.length; var2++) {
                this.field4491[var2] = class312.method2107(this.field4491[var2], 32768);
            }
        }
        if (arg0 != -30294) {
            this.method1907(85);
        }
        field4479++;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Lab;B)Ljava/lang/String;")
    public final String method1902(class249 arg0, byte arg1) {
        field4486++;
        if (arg1 >= -40) {
            return null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4487 != null) {
            for (int var4 = 0; var4 < this.field4487.length; var4++) {
                var3.append(this.field4478[var4]);
                var3.append(class96.method681(arg0.method1788(class113.field1931[this.field4487[var4]], false), this.field4487[var4], (byte) -3, this.field4482[var4]));
            }
        }
        var3.append(this.field4478[this.field4478.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)I")
    public final int method1903(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1907(-69);
        }
        field4480++;
        return this.field4487 == null || arg1 < 0 || arg1 > this.field4487.length ? -1 : this.field4487[arg1];
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lab;BI)V")
    private final void method1904(class249 arg0, byte arg1, int arg2) {
        if (arg1 >= -112) {
            return;
        }
        if (arg2 == 1) {
            this.field4478 = class45.method276(false, '<', arg0.method1769(1));
        } else if (arg2 == 2) {
            int var8 = arg0.method1802((byte) 97);
            this.field4491 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4491[var9] = arg0.method1821((byte) 51);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1802((byte) -96);
            this.field4487 = new int[var4];
            this.field4482 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1821((byte) 51);
                this.field4487[var5] = var6;
                this.field4482[var5] = new int[class36.field571[var6]];
                for (int var7 = 0; var7 < class36.field571[var6]; var7++) {
                    this.field4482[var5][var7] = arg0.method1821((byte) 51);
                }
            }
        } else if (arg2 == 4) {
            this.field4485 = false;
        }
        field4477++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIZB)V")
    public static final void method1905(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        class85.method600(false, (byte) 7);
        class135.field2219 = arg0;
        class11.field194 = arg2;
        field4471++;
        class244.field4097 = arg3;
        class148.method1103(arg1);
        if (arg4 < 5) {
            method1900((byte) -25);
        }
        class58.field1008 = new class132(8);
        class58.field1013 = new class132(8);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
    public static final void method1906(int arg0, int arg1) {
        class214 var2 = class109.field1791;
        synchronized (class109.field1791) {
            if (arg0 > -18) {
                field4489 = null;
            }
            class76.field1299 = arg1;
        }
        field4474++;
    }

    @OriginalMember(owner = "client!de", name = "k", descriptor = "(I)I")
    public final int method1907(int arg0) {
        field4483++;
        if (arg0 != -1) {
            this.method1904((class249) null, (byte) -79, -80);
        }
        return this.field4487 == null ? 0 : this.field4487.length;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4489[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
