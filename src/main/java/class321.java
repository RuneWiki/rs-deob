import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class321 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Z")
    public boolean field4383 = false;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public int field4391 = -1;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    private int field4386 = 0;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    private int field4388 = 0;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    private int field4397 = 128;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
    public boolean field4392 = false;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    private int field4405 = 128;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    private int field4406 = 0;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Z")
    public static boolean field4385 = false;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Lfn;")
    public static class52 field4394 = new class52(101, 6);

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field4403 = new String[200];

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "Lfn;")
    public static class52 field4407 = new class52(92, 3);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    private int field4393;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "Lfc;")
    public static class343 field4404;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lfk;")
    public class79 field4390;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[S")
    private short[] field4382;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[S")
    private short[] field4389;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "[S")
    private short[] field4395;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "[S")
    private short[] field4400;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLp;Lkm;IIII)Lab;", line = 10)
    public final class232 method1931(boolean arg0, class157 arg1, class487 arg2, int arg3, int arg4, int arg5, int arg6) {
        field4398++;
        int var8 = arg3;
        class372 var9 = this.field4391 == -1 || arg4 == -1 ? null : arg1.method950(true, this.field4391);
        if (var9 != null) {
            var8 = arg3 | var9.method2227(arg4, arg5, false, 128);
        }
        if (this.field4397 != 128) {
            var8 |= 0x2;
        }
        if (this.field4405 != 128 || this.field4386 != 0) {
            var8 |= 0x5;
        }
        class104 var10 = this.field4390.field1201;
        class232 var11;
        synchronized (this.field4390.field1201) {
            var11 = (class232) this.field4390.field1201.method659((long) (this.field4402 |= arg2.field6871 << 29), (byte) -1);
        }
        if (var11 == null || arg2.method1102(var11.method50(), var8) != 0) {
            if (var11 != null) {
                var8 = arg2.method1067(var8, var11.method50());
            }
            int var12 = var8;
            if (this.field4395 != null) {
                var12 = var8 | 0x2000;
            }
            if (this.field4389 != null) {
                var12 |= 0x4000;
            }
            class85 var13 = class59.method440(0, this.field4393, this.field4390.field1188, 3);
            if (var13 == null) {
                return null;
            }
            var11 = arg2.method1088(var13, var12, this.field4390.field1204, this.field4388 + 64, this.field4406 + 850);
            if (this.field4395 != null) {
                for (int var14 = 0; var14 < this.field4395.length; var14++) {
                    var11.method24(this.field4395[var14], this.field4400[var14]);
                }
            }
            if (this.field4389 != null) {
                for (int var15 = 0; var15 < this.field4389.length; var15++) {
                    var11.method69(this.field4389[var15], this.field4382[var15]);
                }
            }
            var11.method56(var8);
            class104 var16 = this.field4390.field1201;
            synchronized (this.field4390.field1201) {
                this.field4390.field1201.method653(80, (long) (this.field4402 |= arg2.field6871 << 29), var11);
            }
        }
        class232 var17 = var9 == null ? var11.method51((byte) 2, var8, true) : var9.method2234((byte) 2, var8, var11, arg4, arg5, 0, -20232, arg6);
        if (arg0) {
            this.field4393 = 107;
        }
        if (this.field4405 != 128 || this.field4397 != 128) {
            var17.method26(this.field4405, this.field4397, this.field4405);
        }
        if (this.field4386 != 0) {
            if (this.field4386 == 90) {
                var17.method48(4096);
            }
            if (this.field4386 == 180) {
                var17.method48(8192);
            }
            if (this.field4386 == 270) {
                var17.method48(12288);
            }
        }
        var17.method56(arg3);
        return var17;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIBI)V", line = 122)
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4384++;
        int var6 = arg0;
        if (arg4 != 123) {
            method1937(-92, (byte) 124);
        }
        while (var6 <= arg2) {
            class80.method554(class2.field16[var6], 120, arg5, arg1, arg3);
            var6++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 141)
    public static void method1933(boolean arg0) {
        if (!arg0) {
            field4404 = null;
            field4403 = null;
            field4407 = null;
            field4394 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBLlk;)V", line = 154)
    private final void method1934(int arg0, byte arg1, class425 arg2) {
        field4408++;
        if (arg1 != -115) {
            return;
        }
        if (arg0 == 1) {
            this.field4393 = arg2.method2508(true);
        } else if (arg0 == 2) {
            this.field4391 = arg2.method2508(true);
        } else if (arg0 == 4) {
            this.field4405 = arg2.method2508(true);
        } else if (arg0 == 5) {
            this.field4397 = arg2.method2508(true);
        } else if (arg0 == 6) {
            this.field4386 = arg2.method2508(true);
        } else if (arg0 == 7) {
            this.field4388 = arg2.method2503(true);
        } else if (arg0 == 8) {
            this.field4406 = arg2.method2503(true);
        } else if (arg0 == 9) {
            this.field4383 = true;
        } else if (arg0 == 10) {
            this.field4392 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method2503(true);
            this.field4400 = new short[var6];
            this.field4395 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4395[var7] = (short) arg2.method2508(true);
                this.field4400[var7] = (short) arg2.method2508(true);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method2503(true);
            this.field4382 = new short[var4];
            this.field4389 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4389[var5] = (short) arg2.method2508(true);
                this.field4382[var5] = (short) arg2.method2508(true);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILms;I)V", line = 247)
    public static final void method1935(int arg0, int arg1, class363 arg2, int arg3) {
        field4381++;
        if (arg2.field5132 == 0) {
            arg2.field5145 = arg2.field5100;
        } else if (arg2.field5132 == 1) {
            arg2.field5145 = (arg0 - arg2.field5101) / 2 + arg2.field5100;
        } else if (arg2.field5132 == 2) {
            arg2.field5145 = arg0 - arg2.field5100 - arg2.field5101;
        } else if (arg2.field5132 == 3) {
            arg2.field5145 = arg2.field5100 * arg0 >> 14;
        } else if (arg2.field5132 == 4) {
            arg2.field5145 = (arg2.field5100 * arg0 >> 14) + (arg0 - arg2.field5101) / 2;
        } else {
            arg2.field5145 = arg0 - arg2.field5101 - (arg2.field5100 * arg0 >> 14);
        }
        if (arg2.field5181 == 0) {
            arg2.field5183 = arg2.field5166;
        } else if (arg2.field5181 == 1) {
            arg2.field5183 = (arg1 - arg2.field5200) / 2 + arg2.field5166;
        } else if (arg2.field5181 == 2) {
            arg2.field5183 = arg1 - arg2.field5200 - arg2.field5166;
        } else if (arg2.field5181 == 3) {
            arg2.field5183 = arg2.field5166 * arg1 >> 14;
        } else if (arg2.field5181 == 4) {
            arg2.field5183 = (arg1 - arg2.field5200) / 2 + (arg2.field5166 * arg1 >> 14);
        } else {
            arg2.field5183 = arg1 - arg2.field5200 - (arg2.field5166 * arg1 >> 14);
        }
        if (arg3 != -14047) {
            method1939(-15, (class385[]) null);
        }
        if (!class443.field6112) {
            return;
        }
        if (client.method2321(arg2).field995 == 0 && arg2.field5093 != 0) {
            return;
        }
        if (arg2.field5183 < 0) {
            arg2.field5183 = 0;
        } else if (arg1 < (arg2.field5200 + arg2.field5183)) {
            arg2.field5183 = arg1 - arg2.field5200;
        }
        if (arg2.field5145 < 0) {
            arg2.field5145 = 0;
            return;
        }
        if ((arg2.field5145 + arg2.field5101) > arg0) {
            arg2.field5145 = arg0 - arg2.field5101;
            return;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 329)
    public static final void method1936(byte arg0) {
        if (class10.field192 != null) {
            class10.field192.method2867(-8615);
            class268.field3723 = null;
            class10.field192 = null;
        }
        if (arg0 == 84) {
            field4380++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)I", line = 347)
    public static final int method1937(int arg0, byte arg1) {
        field4387++;
        if (arg1 != -89) {
            method1935(63, -60, (class363) null, 57);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 361)
    public static final void method1938(int arg0, int arg1) {
        field4399++;
        class265 var2 = class440.method2554(arg0, arg1, arg1);
        var2.method1677(arg1 + 21746);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[Laq;)V", line = 371)
    public static final void method1939(int arg0, class385[] arg1) {
        field4401++;
        class266.field3708 = arg1.length;
        class294.field4065 = new int[class266.field3708 + 10];
        class167.field2458 = new class385[class266.field3708 + 10];
        class415.method2421(arg1, 0, class167.field2458, 0, class266.field3708);
        if (arg0 != -1778512387) {
            method1936((byte) -74);
        }
        for (int var2 = 0; var2 < class266.field3708; var2++) {
            class294.field4065[var2] = class167.field2458[var2].method389();
        }
        for (int var3 = class266.field3708; var3 < class167.field2458.length; var3++) {
            class294.field4065[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Llk;I)V", line = 404)
    public final void method1940(class425 arg0, int arg1) {
        field4396++;
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method1932(-66, -15, -108, -90, (byte) -92, -32);
                    return;
                }
            }
            this.method1934(var3, (byte) -115, arg0);
        }
    }
}
