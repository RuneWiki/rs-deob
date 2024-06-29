import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class53 {

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[[I")
    public int[][] field796;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field803;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Z")
    public static boolean field812 = false;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lr;")
    public static class286 field809;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBZIIZ)V", line = 12)
    public final void method435(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field798++;
        int var8 = arg1 - this.field803;
        int var9 = arg4 - this.field815;
        int var10 = 256;
        if (arg3) {
            var10 |= 0x20000;
        }
        if (arg6) {
            var10 |= 0x40000000;
        }
        for (int var11 = var8; var11 < arg5 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field814) {
                for (int var12 = var9; var12 < var9 + arg0; var12++) {
                    if (var12 >= 0 && this.field811 > var12) {
                        this.method447(var10, var12, var11, (byte) -114);
                    }
                }
            }
        }
        if (arg2 != -75) {
            this.field803 = -50;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 60)
    public static void method436(int arg0) {
        field809 = null;
        if (arg0 >= -76) {
            field809 = (class286) null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 71)
    public final void method437(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field814; var2++) {
            for (int var3 = 0; var3 < this.field811; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field814 - 5) || (this.field811 - 5) <= var3) {
                    this.field796[var2][var3] = 16777215;
                } else {
                    this.field796[var2][var3] = 2097152;
                }
            }
        }
        field800++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BII)V", line = 105)
    public final void method438(byte arg0, int arg1, int arg2) {
        if (arg0 != 8) {
            field812 = true;
        }
        int var4 = arg2 - this.field815;
        int var5 = arg1 - this.field803;
        this.field796[var5][var4] = class251.method1740(this.field796[var5][var4], 2097152);
        field805++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIZIIZI)V", line = 118)
    public final void method439(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var9 = arg2 - this.field815;
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg4;
            arg4 = arg7;
            arg7 = var10;
        }
        field806++;
        int var11 = arg5 - this.field803;
        int var12 = 256;
        if (arg6) {
            var12 |= 0x20000;
        }
        if (arg3) {
            var12 |= 0x40000000;
        }
        if (arg1 != 131072) {
            return;
        }
        for (int var13 = var11; var13 < var11 + arg4; var13++) {
            if (var13 >= 0 && this.field814 > var13) {
                for (int var14 = var9; var14 < arg7 + var9; var14++) {
                    if (var14 >= 0 && var14 < this.field811) {
                        this.method452(var14, var12, false, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZZIBII)V", line = 172)
    public final void method440(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        field818++;
        int var8 = arg0 - this.field815;
        if (arg4 < 60) {
            return;
        }
        int var9 = arg5 - this.field803;
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method452(var8, 128, false, var9);
                this.method452(var8, 8, false, var9 - 1);
            }
            if (arg6 == 1) {
                this.method452(var8, 2, false, var9);
                this.method452(var8 + 1, 32, false, var9);
            }
            if (arg6 == 2) {
                this.method452(var8, 8, false, var9);
                this.method452(var8, 128, false, var9 + 1);
            }
            if (arg6 == 3) {
                this.method452(var8, 32, false, var9);
                this.method452(var8 - 1, 2, false, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method452(var8, 1, false, var9);
                this.method452(var8 + 1, 16, false, var9 - 1);
            }
            if (arg6 == 1) {
                this.method452(var8, 4, false, var9);
                this.method452(var8 + 1, 64, false, var9 + 1);
            }
            if (arg6 == 2) {
                this.method452(var8, 16, false, var9);
                this.method452(var8 - 1, 1, false, var9 + 1);
            }
            if (arg6 == 3) {
                this.method452(var8, 64, false, var9);
                this.method452(var8 - 1, 4, false, var9 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg6 == 0) {
                this.method452(var8, 130, false, var9);
                this.method452(var8, 8, false, var9 - 1);
                this.method452(var8 + 1, 32, false, var9);
            }
            if (arg6 == 1) {
                this.method452(var8, 10, false, var9);
                this.method452(var8 + 1, 32, false, var9);
                this.method452(var8, 128, false, var9 + 1);
            }
            if (arg6 == 2) {
                this.method452(var8, 40, false, var9);
                this.method452(var8, 128, false, var9 + 1);
                this.method452(var8 - 1, 2, false, var9);
            }
            if (arg6 == 3) {
                this.method452(var8, 160, false, var9);
                this.method452(var8 - 1, 2, false, var9);
                this.method452(var8, 8, false, var9 - 1);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    this.method452(var8, 65536, false, var9);
                    this.method452(var8, 4096, false, var9 - 1);
                }
                if (arg6 == 1) {
                    this.method452(var8, 1024, false, var9);
                    this.method452(var8 + 1, 16384, false, var9);
                }
                if (arg6 == 2) {
                    this.method452(var8, 4096, false, var9);
                    this.method452(var8, 65536, false, var9 + 1);
                }
                if (arg6 == 3) {
                    this.method452(var8, 16384, false, var9);
                    this.method452(var8 - 1, 1024, false, var9);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg6 == 0) {
                    this.method452(var8, 512, false, var9);
                    this.method452(var8 + 1, 8192, false, var9 - 1);
                }
                if (arg6 == 1) {
                    this.method452(var8, 2048, false, var9);
                    this.method452(var8 + 1, 32768, false, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method452(var8, 8192, false, var9);
                    this.method452(var8 - 1, 512, false, var9 + 1);
                }
                if (arg6 == 3) {
                    this.method452(var8, 32768, false, var9);
                    this.method452(var8 - 1, 2048, false, var9 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    this.method452(var8, 66560, false, var9);
                    this.method452(var8, 4096, false, var9 - 1);
                    this.method452(var8 + 1, 16384, false, var9);
                }
                if (arg6 == 1) {
                    this.method452(var8, 5120, false, var9);
                    this.method452(var8 + 1, 16384, false, var9);
                    this.method452(var8, 65536, false, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method452(var8, 20480, false, var9);
                    this.method452(var8, 65536, false, var9 + 1);
                    this.method452(var8 - 1, 1024, false, var9);
                }
                if (arg6 == 3) {
                    this.method452(var8, 81920, false, var9);
                    this.method452(var8 - 1, 1024, false, var9);
                    this.method452(var8, 4096, false, var9 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method452(var8, 536870912, false, var9);
                this.method452(var8, 33554432, false, var9 - 1);
            }
            if (arg6 == 1) {
                this.method452(var8, 8388608, false, var9);
                this.method452(var8 + 1, 134217728, false, var9);
            }
            if (arg6 == 2) {
                this.method452(var8, 33554432, false, var9);
                this.method452(var8, 536870912, false, var9 + 1);
            }
            if (arg6 == 3) {
                this.method452(var8, 134217728, false, var9);
                this.method452(var8 - 1, 8388608, false, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method452(var8, 4194304, false, var9);
                this.method452(var8 + 1, 67108864, false, var9 - 1);
            }
            if (arg6 == 1) {
                this.method452(var8, 16777216, false, var9);
                this.method452(var8 + 1, 268435456, false, var9 + 1);
            }
            if (arg6 == 2) {
                this.method452(var8, 67108864, false, var9);
                this.method452(var8 - 1, 4194304, false, var9 + 1);
            }
            if (arg6 == 3) {
                this.method452(var8, 268435456, false, var9);
                this.method452(var8 - 1, 16777216, false, var9 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method452(var8, 545259520, false, var9);
            this.method452(var8, 33554432, false, var9 - 1);
            this.method452(var8 + 1, 134217728, false, var9);
        }
        if (arg6 == 1) {
            this.method452(var8, 41943040, false, var9);
            this.method452(var8 + 1, 134217728, false, var9);
            this.method452(var8, 536870912, false, var9 + 1);
        }
        if (arg6 == 2) {
            this.method452(var8, 167772160, false, var9);
            this.method452(var8, 536870912, false, var9 + 1);
            this.method452(var8 - 1, 8388608, false, var9);
        }
        if (arg6 == 3) {
            this.method452(var8, 671088640, false, var9);
            this.method452(var8 - 1, 8388608, false, var9);
            this.method452(var8, 33554432, false, var9 - 1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 481)
    public static final void method441(byte arg0) {
        int var1 = class15.field318.length;
        if (arg0 != 50) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class15.field318[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < client.field4135; var4++) {
                    if (class338.field5218[var2] == class111.field1797[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class111.field1797[client.field4135] = class338.field5218[var2];
                    var3 = client.field4135++;
                }
                class1 var5 = new class1(class15.field318[var2]);
                int var6 = 0;
                while (var5.field48 < class15.field318[var2].length && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method56(19612);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FF2) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class338.field5218[var2] & 0xFF) * 64 + var11 - class133.field2118;
                    int var13 = (class338.field5218[var2] >> 8) * 64 + var10 - class117.field1902;
                    class84 var14 = class310.method2191(var5.method56(19612), 56);
                    if (class197.field3029[var7] == null && (var14.field1330 & 0x1) > 0 && class310.field4900 == var9 && var13 >= 0 && (var14.field1363 + var13) < 104 && var12 >= 0 && (var14.field1363 + var12) < 104) {
                        class197.field3029[var7] = new class86();
                        class86 var15 = class197.field3029[var7];
                        class76.field1192[class83.field1290++] = var7;
                        var15.field4673 = class307.field4869;
                        var15.method682(32090, var14);
                        var15.method2069(var15.field1381.field1363, (byte) 96);
                        var15.field4630 = var15.field4682 = class309.field4890[var15.field1381.field1317];
                        var15.field4632 = var15.field1381.field1365;
                        var15.field4683 = var15.field1381.field1315;
                        if (var15.field4683 == 0) {
                            var15.field4682 = 0;
                        }
                        var15.method2070(var13, var15.method738(-6421), -71, var12, true);
                    }
                }
            }
        }
        field810++;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)I", line = 572)
    public static final int method442(boolean arg0) {
        field799++;
        if (class9.field214 == 0) {
            return 0;
        } else {
            if (arg0) {
                method446(115);
            }
            return class136.field2221[class9.field214].method784();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V", line = 589)
    public final void method443(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field803;
        int var5 = arg0 - this.field815;
        this.field796[var4][var5] = class251.method1740(this.field796[var4][var5], 262144);
        field817++;
        if (arg1 > -66) {
            this.method451(21, 8, -9, 75, 63);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(BII)V", line = 609)
    public final void method444(byte arg0, int arg1, int arg2) {
        if (arg0 > -25) {
            this.method438((byte) 29, 38, 113);
        }
        field802++;
        int var4 = arg1 - this.field815;
        int var5 = arg2 - this.field803;
        this.field796[var5][var4] = class164.method1234(this.field796[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIZZBI)V", line = 623)
    public final void method445(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, byte arg5, int arg6) {
        int var8 = arg1 - this.field815;
        if (arg5 < 94) {
            this.method444((byte) -103, 75, -60);
        }
        int var9 = arg6 - this.field803;
        field801++;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method447(128, var8, var9, (byte) -121);
                this.method447(8, var8, var9 - 1, (byte) -125);
            }
            if (arg2 == 1) {
                this.method447(2, var8, var9, (byte) -98);
                this.method447(32, var8 + 1, var9, (byte) -108);
            }
            if (arg2 == 2) {
                this.method447(8, var8, var9, (byte) -119);
                this.method447(128, var8, var9 + 1, (byte) -126);
            }
            if (arg2 == 3) {
                this.method447(32, var8, var9, (byte) -123);
                this.method447(2, var8 - 1, var9, (byte) -111);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method447(1, var8, var9, (byte) -100);
                this.method447(16, var8 + 1, var9 - 1, (byte) -114);
            }
            if (arg2 == 1) {
                this.method447(4, var8, var9, (byte) -105);
                this.method447(64, var8 + 1, var9 + 1, (byte) -120);
            }
            if (arg2 == 2) {
                this.method447(16, var8, var9, (byte) -112);
                this.method447(1, var8 - 1, var9 + 1, (byte) -117);
            }
            if (arg2 == 3) {
                this.method447(64, var8, var9, (byte) -104);
                this.method447(4, var8 - 1, var9 + -1, (byte) -125);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method447(130, var8, var9, (byte) -125);
                this.method447(8, var8, var9 - 1, (byte) -117);
                this.method447(32, var8 + 1, var9, (byte) -123);
            }
            if (arg2 == 1) {
                this.method447(10, var8, var9, (byte) -96);
                this.method447(32, var8 + 1, var9, (byte) -120);
                this.method447(128, var8, var9 + 1, (byte) -102);
            }
            if (arg2 == 2) {
                this.method447(40, var8, var9, (byte) -116);
                this.method447(128, var8, var9 + 1, (byte) -126);
                this.method447(2, var8 - 1, var9, (byte) -99);
            }
            if (arg2 == 3) {
                this.method447(160, var8, var9, (byte) -100);
                this.method447(2, var8 - 1, var9, (byte) -126);
                this.method447(8, var8, var9 - 1, (byte) -95);
            }
        }
        if (arg3) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    this.method447(65536, var8, var9, (byte) -120);
                    this.method447(4096, var8, var9 - 1, (byte) -122);
                }
                if (arg2 == 1) {
                    this.method447(1024, var8, var9, (byte) -112);
                    this.method447(16384, var8 + 1, var9, (byte) -103);
                }
                if (arg2 == 2) {
                    this.method447(4096, var8, var9, (byte) -110);
                    this.method447(65536, var8, var9 + 1, (byte) -102);
                }
                if (arg2 == 3) {
                    this.method447(16384, var8, var9, (byte) -95);
                    this.method447(1024, var8 - 1, var9, (byte) -128);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg2 == 0) {
                    this.method447(512, var8, var9, (byte) -126);
                    this.method447(8192, var8 + 1, var9 - 1, (byte) -128);
                }
                if (arg2 == 1) {
                    this.method447(2048, var8, var9, (byte) -125);
                    this.method447(32768, var8 + 1, var9 + 1, (byte) -115);
                }
                if (arg2 == 2) {
                    this.method447(8192, var8, var9, (byte) -118);
                    this.method447(512, var8 - 1, var9 + 1, (byte) -107);
                }
                if (arg2 == 3) {
                    this.method447(32768, var8, var9, (byte) -118);
                    this.method447(2048, var8 - 1, var9 + -1, (byte) -102);
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    this.method447(66560, var8, var9, (byte) -114);
                    this.method447(4096, var8, var9 - 1, (byte) -107);
                    this.method447(16384, var8 + 1, var9, (byte) -118);
                }
                if (arg2 == 1) {
                    this.method447(5120, var8, var9, (byte) -96);
                    this.method447(16384, var8 + 1, var9, (byte) -122);
                    this.method447(65536, var8, var9 + 1, (byte) -109);
                }
                if (arg2 == 2) {
                    this.method447(20480, var8, var9, (byte) -120);
                    this.method447(65536, var8, var9 + 1, (byte) -125);
                    this.method447(1024, var8 - 1, var9, (byte) -97);
                }
                if (arg2 == 3) {
                    this.method447(81920, var8, var9, (byte) -125);
                    this.method447(1024, var8 - 1, var9, (byte) -108);
                    this.method447(4096, var8, var9 - 1, (byte) -105);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method447(536870912, var8, var9, (byte) -95);
                this.method447(33554432, var8, var9 - 1, (byte) -118);
            }
            if (arg2 == 1) {
                this.method447(8388608, var8, var9, (byte) -111);
                this.method447(134217728, var8 + 1, var9, (byte) -122);
            }
            if (arg2 == 2) {
                this.method447(33554432, var8, var9, (byte) -96);
                this.method447(536870912, var8, var9 + 1, (byte) -113);
            }
            if (arg2 == 3) {
                this.method447(134217728, var8, var9, (byte) -112);
                this.method447(8388608, var8 - 1, var9, (byte) -108);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method447(4194304, var8, var9, (byte) -101);
                this.method447(67108864, var8 + 1, var9 + -1, (byte) -109);
            }
            if (arg2 == 1) {
                this.method447(16777216, var8, var9, (byte) -107);
                this.method447(268435456, var8 + 1, var9 + 1, (byte) -115);
            }
            if (arg2 == 2) {
                this.method447(67108864, var8, var9, (byte) -116);
                this.method447(4194304, var8 - 1, var9 - -1, (byte) -105);
            }
            if (arg2 == 3) {
                this.method447(268435456, var8, var9, (byte) -118);
                this.method447(16777216, var8 - 1, var9 + -1, (byte) -124);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method447(545259520, var8, var9, (byte) -104);
            this.method447(33554432, var8, var9 - 1, (byte) -118);
            this.method447(134217728, var8 + 1, var9, (byte) -119);
        }
        if (arg2 == 1) {
            this.method447(41943040, var8, var9, (byte) -111);
            this.method447(134217728, var8 + 1, var9, (byte) -125);
            this.method447(536870912, var8, var9 + 1, (byte) -128);
        }
        if (arg2 == 2) {
            this.method447(167772160, var8, var9, (byte) -102);
            this.method447(536870912, var8, var9 + 1, (byte) -106);
            this.method447(8388608, var8 - 1, var9, (byte) -102);
        }
        if (arg2 == 3) {
            this.method447(671088640, var8, var9, (byte) -121);
            this.method447(8388608, var8 - 1, var9, (byte) -118);
            this.method447(33554432, var8, var9 - 1, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 930)
    public static final void method446(int arg0) {
        int var1 = 125 / ((arg0 - 56) / 60);
        field807++;
        class145.field2348.method2282((byte) -119);
        class337.field5206.method2282((byte) -125);
        class195.field3013.method2282((byte) -124);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIB)V", line = 949)
    private final void method447(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -93) {
            this.method451(74, -30, -1, -35, -36);
        }
        field804++;
        this.field796[arg2][arg1] = class251.method1740(this.field796[arg2][arg1], arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBII[Ltk;III)V", line = 960)
    public static final void method448(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class266[] arg6, int arg7, int arg8, int arg9) {
        if (class162.field2623) {
            class114.method886(arg2, arg0, arg9, arg5);
        } else {
            class33.method304(arg2, arg0, arg9, arg5);
            class40.method368();
        }
        int var10 = -44 / ((arg3 - 77) / 47);
        for (int var11 = 0; var11 < arg6.length; var11++) {
            class266 var12 = arg6[var11];
            if (var12 != null && (var12.field3926 == arg4 || arg4 == -1412584499 && class86.field1377 == var12)) {
                int var13;
                if (arg7 == -1) {
                    class277.field4356[class288.field4545] = var12.field4099 + arg8;
                    class11.field250[class288.field4545] = var12.field4087 + arg1;
                    class301.field4798[class288.field4545] = var12.field3941;
                    class211.field3315[class288.field4545] = var12.field3939;
                    var13 = class288.field4545++;
                } else {
                    var13 = arg7;
                }
                var12.field4050 = class307.field4869;
                var12.field4091 = var13;
                if (!var12.field4043 || !client.method1862(var12)) {
                    if (var12.field4064 > 0) {
                        class289.method2035(var12, -116);
                    }
                    int var14 = var12.field4099 + arg8;
                    int var15 = var12.field4048;
                    int var16 = var12.field4087 + arg1;
                    if (class320.field5011 && (client.method1867(var12).field3822 != 0 || var12.field4084 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class86.field1377 == var12) {
                        if (arg4 != -1412584499 && !var12.field3996) {
                            class168.field2697 = arg1;
                            class57.field870 = arg6;
                            class182.field2885 = arg8;
                            continue;
                        }
                        if (!var12.field3996) {
                            var15 = 128;
                        }
                        if (class136.field2219 && class314.field4959) {
                            int var17 = class303.field4832;
                            int var18 = var17 - class178.field2838;
                            if (class92.field1489 > var18) {
                                var18 = class92.field1489;
                            }
                            if (var18 + var12.field3941 > class92.field1489 + class55.field841.field3941) {
                                var18 = class92.field1489 + class55.field841.field3941 - var12.field3941;
                            }
                            var14 = var18;
                            int var19 = class22.field389;
                            int var20 = var19 - class120.field1937;
                            if (class338.field5227 > var20) {
                                var20 = class338.field5227;
                            }
                            if ((var20 + var12.field3939) > (class338.field5227 + class55.field841.field3939)) {
                                var20 = class338.field5227 + class55.field841.field3939 - var12.field3939;
                            }
                            var16 = var20;
                        }
                    }
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    if (var12.field4084 == 2) {
                        var21 = arg2;
                        var22 = arg0;
                        var23 = arg5;
                        var24 = arg9;
                    } else {
                        int var25 = var12.field3941 + var14;
                        var21 = var14 > arg2 ? var14 : arg2;
                        int var26 = var16 + var12.field3939;
                        var22 = var16 <= arg0 ? arg0 : var16;
                        if (var12.field4084 == 9) {
                            var26++;
                            var25++;
                        }
                        var23 = arg5 > var26 ? var26 : arg5;
                        var24 = arg9 <= var25 ? arg9 : var25;
                    }
                    if (!var12.field4043 || var24 > var21 && var22 < var23) {
                        if (var12.field4064 != 0) {
                            if (var12.field4064 == 1337 || var12.field4064 == 1403) {
                                class342.field5302 = var12;
                                class64.field946 = var16;
                                class78.field1223 = var14;
                                class176.method1298(var12.field3941, var16, var12.field4064 == 1403, var14, -4986, var12.field3939);
                                class280.field4378[var13] = true;
                                if (class162.field2623) {
                                    class114.method886(arg2, arg0, arg9, arg5);
                                } else {
                                    class33.method304(arg2, arg0, arg9, arg5);
                                }
                                continue;
                            }
                            if (var12.field4064 == 1338) {
                                if (!var12.method1837(10223)) {
                                    continue;
                                }
                                class314.method2218(var16, var12, 1007629636, var14, var13);
                                if (class162.field2623) {
                                    class114.method886(arg2, arg0, arg9, arg5);
                                } else {
                                    class33.method304(arg2, arg0, arg9, arg5);
                                }
                                if (class42.field646 != 0 && class42.field646 != 3 || class260.field3858 || var21 > class95.field1535 || var22 > class146.field2394 || class95.field1535 >= var24 || var23 <= class146.field2394) {
                                    continue;
                                }
                                int var27 = class95.field1535 - var14;
                                int var28 = class146.field2394 - var16;
                                int var29 = var12.field4107[var28];
                                if (var27 < var29 || var27 > (var12.field4106[var28] + var29)) {
                                    continue;
                                }
                                int var30 = var27 - var12.field3941 / 2;
                                int var31 = (int) class171.field2747 + class150.field2455 & 0x7FF;
                                int var32 = class40.field612[var31];
                                int var33 = (class10.field242 + 256) * var32 >> 8;
                                int var34 = var28 - var12.field3939 / 2;
                                int var35 = class40.field619[var31];
                                int var36 = (class10.field242 + 256) * var35 >> 8;
                                int var37 = var30 * var36 + var33 * var34 >> 11;
                                int var38 = class345.field5363.field4671 + var37 + 64 - (class345.field5363.method738(-6421) * 64) >> 7;
                                int var39 = var34 * var36 - (var30 * var33) >> 11;
                                int var40 = class345.field5363.field4672 - var39 - ((class345.field5363.method738(-6421) + -1) * 64) >> 7;
                                if (class315.field4977 && (class36.field549 & 0x40) != 0) {
                                    class266 var41 = class77.method604(class201.field3076, class22.field392, -10316);
                                    if (var41 == null) {
                                        class28.method249(-1);
                                    } else {
                                        class147.method1121(var38, class129.field2067, var40, " ->", class301.field4797, -41, 1L, (short) 58);
                                    }
                                    continue;
                                }
                                if (class109.field1773 == 1) {
                                    class147.method1121(var38, class197.field3036, var40, "", -1, -5, 1L, (short) 45);
                                }
                                class147.method1121(var38, class321.field5023, var40, "", -1, -58, 1L, (short) 31);
                                continue;
                            }
                            if (var12.field4064 == 1339) {
                                if (var12.method1837(10223)) {
                                    class142.method1089(var13, var16, 48, var12, var14);
                                    if (class162.field2623) {
                                        class114.method886(arg2, arg0, arg9, arg5);
                                    } else {
                                        class33.method304(arg2, arg0, arg9, arg5);
                                    }
                                }
                                continue;
                            }
                            if (var12.field4064 == 1400) {
                                class328.method2305(var16, var12.field3941, var12.field3939, var14, (byte) -38);
                                class280.field4378[var13] = true;
                                class282.field4415[var13] = true;
                                if (class162.field2623) {
                                    class114.method886(arg2, arg0, arg9, arg5);
                                } else {
                                    class33.method304(arg2, arg0, arg9, arg5);
                                }
                                continue;
                            }
                            if (var12.field4064 == 1401) {
                                class218.method1580(var12.field3941, 16777215, var12.field3939, var16, var14);
                                class280.field4378[var13] = true;
                                class282.field4415[var13] = true;
                                if (class162.field2623) {
                                    class114.method886(arg2, arg0, arg9, arg5);
                                } else {
                                    class33.method304(arg2, arg0, arg9, arg5);
                                }
                                continue;
                            }
                            if (var12.field4064 == 1402) {
                                if (!class162.field2623) {
                                    class102.method831(var16, 21478, var14);
                                    class280.field4378[var13] = true;
                                    class282.field4415[var13] = true;
                                }
                                continue;
                            }
                            if (var12.field4064 == 1405) {
                                if (!class318.field4993) {
                                    continue;
                                }
                                int var42 = var12.field3941 + var14;
                                int var43 = var16 + 15;
                                class107.field1756.method1467("Fps:" + class337.field5211, var42, var43, 16776960, -1);
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = 16776960;
                                int var46 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                if (var46 > 65536) {
                                    var45 = 16711680;
                                }
                                var43 += 15;
                                class107.field1756.method1467("Mem:" + var46 + "k", var42, var43, var45, -1);
                                var43 += 15;
                                if (class162.field2623) {
                                    int var47 = (class177.field2823 + class177.field2821 + class177.field2820) / 1024;
                                    int var48 = 16776960;
                                    if (var47 > 65536) {
                                        var48 = 16711680;
                                    }
                                    class107.field1756.method1467("Card:" + var47 + "k", var42, var43, var48, -1);
                                    var43 += 15;
                                }
                                int var49 = 16776960;
                                int var50 = 0;
                                int var51 = 0;
                                int var52 = 0;
                                for (int var53 = 0; var53 < 29; var53++) {
                                    var50 += class21.field383[var53].method2089(true);
                                    var52 += class21.field383[var53].method2100(true);
                                    var51 += class21.field383[var53].method2102((byte) -70);
                                }
                                int var54 = var51 * 100 / var50;
                                int var55 = var52 * 10000 / var50;
                                String var56 = "Cache:" + class39.method344(true, 2, 23485, 0, (long) var55) + "% (" + var54 + "%)";
                                class156.field2560.method1467(var56, var42, var43, var49, -1);
                                var43 += 12;
                                class280.field4378[var13] = true;
                                class282.field4415[var13] = true;
                                continue;
                            }
                            if (var12.field4064 == 1406) {
                                class90.field1440 = var16;
                                class34.field524 = var14;
                                class66.field1011 = var12;
                                continue;
                            }
                        }
                        if (!class260.field3858) {
                            if (var12.field4084 == 0 && var12.field4058 && class95.field1535 >= var21 && class146.field2394 >= var22 && class95.field1535 < var24 && class146.field2394 < var23 && !class320.field5011) {
                                class120.field1960[0] = 1007;
                                class179.field2856[0] = class220.field3430;
                                class301.field4800[0] = class164.field2671;
                                class137.field2225 = 1;
                                class285.field4441[0] = "";
                            }
                            if (var21 <= class95.field1535 && class146.field2394 >= var22 && var24 > class95.field1535 && class146.field2394 < var23) {
                                class140.method1073(0, class146.field2394 - var16, var12, class95.field1535 - var14);
                            }
                        }
                        if (var12.field4084 == 0) {
                            if (!var12.field4043 && client.method1862(var12) && class143.field2313 != var12) {
                                continue;
                            }
                            if (!var12.field4043) {
                                if ((var12.field4097 - var12.field3939) < var12.field4045) {
                                    var12.field4045 = var12.field4097 - var12.field3939;
                                }
                                if (var12.field4045 < 0) {
                                    var12.field4045 = 0;
                                }
                            }
                            if (class162.field2623 && var12.field4064 == 1407) {
                                class54.method456(var14, var16, var12.field3941, var12.field3939);
                            }
                            method448(var22, var16 - var12.field4045, var21, (byte) 125, var12.field4088, var23, arg6, var13, var14 - var12.field3951, var24);
                            if (var12.field3994 != null) {
                                method448(var22, var16 - var12.field4045, var21, (byte) 127, var12.field4088, var23, var12.field3994, var13, var14 - var12.field3951, var24);
                            }
                            class24 var57 = (class24) class158.field2584.method79((long) var12.field4088, (byte) 0);
                            if (var57 != null) {
                                if (var57.field413 == 0 && !class260.field3858 && var21 <= class95.field1535 && class146.field2394 >= var22 && class95.field1535 < var24 && class146.field2394 < var23 && !class320.field5011) {
                                    class120.field1960[0] = 1007;
                                    class179.field2856[0] = class220.field3430;
                                    class301.field4800[0] = class164.field2671;
                                    class137.field2225 = 1;
                                    class285.field4441[0] = "";
                                }
                                class160.method1177(var24, var57.field417, var23, var22, var13, (byte) 84, var21, var14, var16);
                            }
                            if (class162.field2623 && var12.field4064 == 1407) {
                                class54.method454();
                            }
                            if (class162.field2623) {
                                class114.method886(arg2, arg0, arg9, arg5);
                            } else {
                                class33.method304(arg2, arg0, arg9, arg5);
                                class40.method368();
                            }
                        }
                        if (class285.field4455[var13] || class16.field329 > 1) {
                            if (var12.field4084 == 0 && !var12.field4043 && var12.field3939 < var12.field4097) {
                                class65.method518(false, var16, var12.field3939, var12.field4045, var12.field3941 + var14, var12.field4097);
                            }
                            if (var12.field4084 != 1) {
                                if (var12.field4084 == 2) {
                                    int var126 = 0;
                                    for (int var127 = 0; var127 < var12.field4009; var127++) {
                                        for (int var128 = 0; var128 < var12.field3987; var128++) {
                                            int var129 = (var12.field3999 + 32) * var128 + var14;
                                            int var130 = var16 + ((var12.field4049 + 32) * var127);
                                            if (var126 < 20) {
                                                var129 += var12.field3970[var126];
                                                var130 += var12.field3978[var126];
                                            }
                                            if (var12.field3928[var126] > 0) {
                                                boolean var132 = false;
                                                boolean var133 = false;
                                                int var134 = var12.field3928[var126] - 1;
                                                if (arg2 < (var129 + 32) && var129 < arg9 && arg0 < (var130 + 32) && arg5 > var130 || class109.field1774 == var12 && class16.field334 == var126) {
                                                    class88 var135;
                                                    if (class25.field428 == 1 && class333.field5191 == var126 && class15.field311 == var12.field4088) {
                                                        var135 = class213.method1552(var12.field3976[var126], var134, var12.field4039, 0, 65536, (class270) null, 2);
                                                    } else {
                                                        var135 = class213.method1552(var12.field3976[var126], var134, var12.field4039, 3153952, 65536, (class270) null, 1);
                                                    }
                                                    if (class40.field618) {
                                                        class280.field4378[var13] = true;
                                                    }
                                                    if (var135 == null) {
                                                        class280.method1971((byte) 101, var12);
                                                    } else if (class109.field1774 == var12 && class16.field334 == var126) {
                                                        int var136 = class303.field4832 - class89.field1424;
                                                        int var137 = class22.field389 - class85.field1369;
                                                        if (var137 < 5 && var137 > -5) {
                                                            var137 = 0;
                                                        }
                                                        if (var136 < 5 && var136 > -5) {
                                                            var136 = 0;
                                                        }
                                                        if (class9.field216 < 5) {
                                                            var136 = 0;
                                                            var137 = 0;
                                                        }
                                                        var135.method697(var129 + var136, var130 + var137, 128);
                                                        if (arg4 != -1) {
                                                            int var138;
                                                            int var139;
                                                            if (class162.field2623) {
                                                                var138 = class114.field1835;
                                                                var139 = class114.field1837;
                                                            } else {
                                                                var138 = class33.field507;
                                                                var139 = class33.field504;
                                                            }
                                                            class266 var140 = arg6[arg4 & 0xFFFF];
                                                            if (var130 + var137 < var138 && var140.field4045 > 0) {
                                                                int var141 = (var138 - var137 - var130) * class137.field2241 / 3;
                                                                if (class137.field2241 * 10 < var141) {
                                                                    var141 = class137.field2241 * 10;
                                                                }
                                                                if (var140.field4045 < var141) {
                                                                    var141 = var140.field4045;
                                                                }
                                                                class85.field1369 += var141;
                                                                var140.field4045 -= var141;
                                                                class280.method1971((byte) 101, var140);
                                                            }
                                                            if ((var130 - (-var137 - 32)) > var139 && var140.field4045 < (var140.field4097 - var140.field3939)) {
                                                                int var142 = (var130 + var137 + 32 - var139) * class137.field2241 / 3;
                                                                if (class137.field2241 * 10 < var142) {
                                                                    var142 = class137.field2241 * 10;
                                                                }
                                                                if (var142 > (var140.field4097 - var140.field4045 - var140.field3939)) {
                                                                    var142 = var140.field4097 - var140.field4045 - var140.field3939;
                                                                }
                                                                class85.field1369 -= var142;
                                                                var140.field4045 += var142;
                                                                class280.method1971((byte) 101, var140);
                                                            }
                                                        }
                                                    } else if (class64.field936 == var12 && class303.field4829 == var126) {
                                                        var135.method697(var129, var130, 128);
                                                    } else {
                                                        var135.method698(var129, var130);
                                                    }
                                                }
                                            } else if (var12.field4082 != null && var126 < 20) {
                                                class88 var131 = var12.method1838(var126, -1);
                                                if (var131 != null) {
                                                    var131.method698(var129, var130);
                                                } else if (class154.field2503) {
                                                    class280.method1971((byte) 101, var12);
                                                }
                                            }
                                            var126++;
                                        }
                                    }
                                } else if (var12.field4084 == 3) {
                                    int var125;
                                    if (class264.method1823((byte) -118, var12)) {
                                        var125 = var12.field4021;
                                        if (class143.field2313 == var12 && var12.field3991 != 0) {
                                            var125 = var12.field3991;
                                        }
                                    } else {
                                        var125 = var12.field4076;
                                        if (class143.field2313 == var12 && var12.field3920 != 0) {
                                            var125 = var12.field3920;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var12.field4031) {
                                            if (class162.field2623) {
                                                class114.method887(var14, var16, var12.field3941, var12.field3939, var125);
                                            } else {
                                                class33.method288(var14, var16, var12.field3941, var12.field3939, var125);
                                            }
                                        } else if (class162.field2623) {
                                            class114.method897(var14, var16, var12.field3941, var12.field3939, var125);
                                        } else {
                                            class33.method293(var14, var16, var12.field3941, var12.field3939, var125);
                                        }
                                    } else if (var12.field4031) {
                                        if (class162.field2623) {
                                            class114.method893(var14, var16, var12.field3941, var12.field3939, var125, 256 - (var15 & 0xFF));
                                        } else {
                                            class33.method302(var14, var16, var12.field3941, var12.field3939, var125, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class162.field2623) {
                                        class114.method895(var14, var16, var12.field3941, var12.field3939, var125, 256 - (var15 & 0xFF));
                                    } else {
                                        class33.method311(var14, var16, var12.field3941, var12.field3939, var125, 256 - (var15 & 0xFF));
                                    }
                                } else if (var12.field4084 == 4) {
                                    class205 var58 = var12.method1846(64, class92.field1505);
                                    if (var58 != null) {
                                        String var59 = var12.field3927;
                                        int var60;
                                        if (class264.method1823((byte) -102, var12)) {
                                            var60 = var12.field4021;
                                            if (class143.field2313 == var12 && var12.field3991 != 0) {
                                                var60 = var12.field3991;
                                            }
                                            if (var12.field3952.length() > 0) {
                                                var59 = var12.field3952;
                                            }
                                        } else {
                                            var60 = var12.field4076;
                                            if (class143.field2313 == var12 && var12.field3920 != 0) {
                                                var60 = var12.field3920;
                                            }
                                        }
                                        if (var12.field4043 && var12.field3947 != -1) {
                                            class135 var61 = class188.method1361(true, var12.field3947);
                                            var59 = var61.field2200;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field2198 == 1 || var12.field4016 != 1) && var12.field4016 != -1) {
                                                var59 = "<col=ff9040>" + var59 + "</col> x" + class36.method320(var12.field4016, 2);
                                            }
                                        }
                                        if (class49.field757 == var12) {
                                            var60 = var12.field4076;
                                            var59 = class325.field5082;
                                        }
                                        if (!var12.field4043) {
                                            var59 = class137.method1060(var12, var59, -7276);
                                        }
                                        var58.method1476(var59, var14, var16, var12.field3941, var12.field3939, var60, var12.field4086 ? 0 : -1, var12.field3921, var12.field3949, var12.field4027);
                                    } else if (class154.field2503) {
                                        class280.method1971((byte) 101, var12);
                                    }
                                } else if (var12.field4084 == 5) {
                                    if (!var12.field4043) {
                                        class88 var108 = var12.method1851(class264.method1823((byte) -118, var12), 0);
                                        if (var108 != null) {
                                            var108.method698(var14, var16);
                                        } else if (class154.field2503) {
                                            class280.method1971((byte) 101, var12);
                                        }
                                    } else if (var12.field3934 >= 0) {
                                        class250 var124 = var12.method1844(-91);
                                        if (class162.field2623) {
                                            var124.method1736(0, var14, var16, var12.field3941, var12.field3939, var12.field4032, var12.field4007, 0);
                                        } else {
                                            var124.method1738(0, var14, var16, var12.field3941, var12.field3939, var12.field4032, var12.field4007, 0);
                                        }
                                    } else {
                                        class88 var109;
                                        if (var12.field3947 == -1) {
                                            var109 = var12.method1851(false, 0);
                                        } else if (var12.field3969 && class345.field5363.field1485 != null) {
                                            var109 = class213.method1552(var12.field4016, var12.field3947, var12.field4039, var12.field3923, 65536, class345.field5363.field1485, var12.field4089);
                                        } else {
                                            var109 = class213.method1552(var12.field4016, var12.field3947, var12.field4039, var12.field3923, 65536, (class270) null, var12.field4089);
                                        }
                                        if (var109 != null) {
                                            int var110 = var109.field1422;
                                            int var111 = var109.field1421;
                                            if (var12.field4067) {
                                                int var112 = (var111 + var12.field3939 - 1) / var111;
                                                int var113 = (var110 + var12.field3941 - 1) / var110;
                                                if (class162.field2623) {
                                                    class114.method894(var14, var16, var12.field3941 + var14, var16 - -var12.field3939);
                                                    boolean var116 = class140.method1075((byte) -128, var109.field1412);
                                                    boolean var117 = class140.method1075((byte) -119, var109.field1413);
                                                    class196 var118 = (class196) var109;
                                                    if (var116 && var117) {
                                                        if (var15 == 0) {
                                                            var118.method1388(var14, var16, var113, var112);
                                                        } else {
                                                            var118.method1392(var14, var16, 256 - (var15 & 0xFF), var113, var112);
                                                        }
                                                    } else if (var116) {
                                                        for (int var122 = 0; var122 < var112; var122++) {
                                                            if (var15 == 0) {
                                                                var118.method1388(var14, var111 * var122 + var16, var113, 1);
                                                            } else {
                                                                var118.method1392(var14, var111 * var122 + var16, 256 - (var15 & 0xFF), var113, 1);
                                                            }
                                                        }
                                                    } else if (var117) {
                                                        for (int var119 = 0; var119 < var113; var119++) {
                                                            if (var15 == 0) {
                                                                var118.method1388(var110 * var119 + var14, var16, 1, var112);
                                                            } else {
                                                                var118.method1392(var110 * var119 + var14, var16, 256 - (var15 & 0xFF), 1, var112);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var120 = 0; var120 < var113; var120++) {
                                                            for (int var121 = 0; var121 < var112; var121++) {
                                                                if (var15 == 0) {
                                                                    var109.method698(var14 + (var110 * var120), var16 - -(var111 * var121));
                                                                } else {
                                                                    var109.method697(var110 * var120 + var14, var111 * var121 + var16, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class114.method886(arg2, arg0, arg9, arg5);
                                                } else {
                                                    class33.method297(var14, var16, var12.field3941 + var14, var12.field3939 + var16);
                                                    for (int var114 = 0; var114 < var113; var114++) {
                                                        for (int var115 = 0; var115 < var112; var115++) {
                                                            if (var12.field3931 != 0) {
                                                                var109.method700(var111 / 2 + var111 * var115 + var16, -923612572, var110 / 2 + var110 * var114 + var14, var12.field3931, 4096);
                                                            } else if (var15 == 0) {
                                                                var109.method698(var110 * var114 + var14, var111 * var115 + var16);
                                                            } else {
                                                                var109.method697(var110 * var114 + var14, var111 * var115 + var16, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class33.method304(arg2, arg0, arg9, arg5);
                                                }
                                            } else {
                                                int var123 = var12.field3941 * 4096 / var110;
                                                if (var12.field3931 != 0) {
                                                    var109.method700(var12.field3939 / 2 + var16, -923612572, var12.field3941 / 2 + var14, var12.field3931, var123);
                                                } else if (var15 != 0) {
                                                    var109.method694(var14, var16, var12.field3941, var12.field3939, 256 - (var15 & 0xFF));
                                                } else if (var12.field3941 == var110 && var12.field3939 == var111) {
                                                    var109.method698(var14, var16);
                                                } else {
                                                    var109.method695(var14, var16, var12.field3941, var12.field3939);
                                                }
                                            }
                                        } else if (class154.field2503) {
                                            class280.method1971((byte) 101, var12);
                                        }
                                    }
                                } else if (var12.field4084 == 6) {
                                    boolean var89 = class264.method1823((byte) -115, var12);
                                    int var90;
                                    if (var89) {
                                        var90 = var12.field3993;
                                    } else {
                                        var90 = var12.field3975;
                                    }
                                    class94 var91 = null;
                                    int var92 = 0;
                                    if (var12.field3947 != -1) {
                                        class135 var93 = class188.method1361(true, var12.field3947);
                                        if (var93 != null) {
                                            class135 var94 = var93.method1044((byte) -20, var12.field4016);
                                            class38 var95 = var90 == -1 ? null : class63.method503(var90, (byte) 71);
                                            if (var12.field3969 && class345.field5363.field1485 != null) {
                                                var91 = var94.method1043(var12.field4077, (byte) -110, var12.field3966, class345.field5363.field1485, var95, var12.field4041, 1);
                                            } else {
                                                var91 = var94.method1043(var12.field4077, (byte) -70, var12.field3966, (class270) null, var95, var12.field4041, 1);
                                            }
                                            if (var91 == null) {
                                                class280.method1971((byte) 101, var12);
                                            } else {
                                                var92 = -var91.method137() / 2;
                                            }
                                        }
                                    } else if (var12.field4003 == 5) {
                                        if (var12.field4005 == -1) {
                                            var91 = class91.field1465.method1917(57, -1, (class38) null, -1, (class63[]) null, true, 0, -1, -1, (class38) null, 0);
                                        } else {
                                            int var96 = var12.field4005 & 0x7FF;
                                            if (class75.field1146 == var96) {
                                                var96 = 2047;
                                            }
                                            class92 var97 = class74.field1140[var96];
                                            class38 var98 = var90 == -1 ? null : class63.method503(var90, (byte) 94);
                                            if (var97 != null && ((int) class106.method851(var97.field1486, -22) << 11) == (var12.field4005 & 0xFFFFF800)) {
                                                var91 = var97.field1485.method1917(-124, var12.field4077, (class38) null, 0, (class63[]) null, true, 0, -1, -1, var98, 0);
                                            }
                                        }
                                    } else if (var90 == -1) {
                                        var91 = var12.method1850(var89, -1, 0, -1, (class38) null, (byte) 101, class345.field5363.field1485);
                                        if (var91 == null && class154.field2503) {
                                            class280.method1971((byte) 101, var12);
                                        }
                                    } else {
                                        class38 var99 = class63.method503(var90, (byte) 116);
                                        var91 = var12.method1850(var89, var12.field3966, var12.field4041, var12.field4077, var99, (byte) 101, class345.field5363.field1485);
                                        if (var91 == null && class154.field2503) {
                                            class280.method1971((byte) 101, var12);
                                        }
                                    }
                                    if (var91 != null) {
                                        int var100;
                                        if (var12.field4079 > 0) {
                                            var100 = (var12.field3939 << 8) / var12.field4079;
                                        } else {
                                            var100 = 256;
                                        }
                                        int var101;
                                        if (var12.field4090 > 0) {
                                            var101 = (var12.field3941 << 8) / var12.field4090;
                                        } else {
                                            var101 = 256;
                                        }
                                        int var102 = (var12.field4068 * var101 >> 8) + var12.field3941 / 2 + var14;
                                        int var103 = (var12.field4010 * var100 >> 8) + var12.field3939 / 2 + var16;
                                        if (class162.field2623) {
                                            if (var12.field3945) {
                                                class162.method1215(var102, var103, var12.field4105, var12.field3971, var101, var100);
                                            } else {
                                                class162.method1229(var102, var103, var101, var100);
                                                class162.method1231((float) var12.field4035, (float) var12.field3971 * 1.5F);
                                            }
                                            class162.method1199();
                                            class162.method1193(true);
                                            class162.method1207(false);
                                            class38.method334(class343.field5310, (byte) -100);
                                            if (class26.field436) {
                                                class114.method892();
                                                class162.method1227();
                                                class114.method886(arg2, arg0, arg9, arg5);
                                                class26.field436 = false;
                                            }
                                            if (var12.field4080) {
                                                class162.method1196();
                                            }
                                            int var106 = class40.field619[var12.field4020] * var12.field4105 >> 16;
                                            int var107 = class40.field612[var12.field4020] * var12.field4105 >> 16;
                                            if (var12.field4043) {
                                                var91.method756(0, var12.field3968, var12.field3937, var12.field4020, var12.field4055, var92 + var107 + var12.field3960, var12.field3960 + var106, -1L);
                                            } else {
                                                var91.method756(0, var12.field3968, 0, var12.field4020, 0, var107, var106, -1L);
                                            }
                                            if (var12.field4080) {
                                                class162.method1203();
                                            }
                                        } else {
                                            class40.method367(var102, var103);
                                            int var104 = class40.field619[var12.field4020] * var12.field4105 >> 16;
                                            int var105 = class40.field612[var12.field4020] * var12.field4105 >> 16;
                                            if (!var12.field4043) {
                                                var91.method756(0, var12.field3968, 0, var12.field4020, 0, var105, var104, -1L);
                                            } else if (var12.field3945) {
                                                ((class271) var91).method1930(0, var12.field3968, var12.field3937, var12.field4020, var12.field4055, var12.field3960 + var105 + var92, var12.field3960 + var104, var12.field4105);
                                            } else {
                                                var91.method756(0, var12.field3968, var12.field3937, var12.field4020, var12.field4055, var12.field3960 + var92 + var105, var12.field3960 + var104, -1L);
                                            }
                                            class40.method354();
                                        }
                                    }
                                } else {
                                    if (var12.field4084 == 7) {
                                        class205 var62 = var12.method1846(64, class92.field1505);
                                        if (var62 == null) {
                                            if (class154.field2503) {
                                                class280.method1971((byte) 101, var12);
                                            }
                                            continue;
                                        }
                                        int var63 = 0;
                                        for (int var64 = 0; var64 < var12.field4009; var64++) {
                                            for (int var65 = 0; var65 < var12.field3987; var65++) {
                                                if (var12.field3928[var63] > 0) {
                                                    class135 var66 = class188.method1361(true, var12.field3928[var63] - 1);
                                                    String var67;
                                                    if (var66.field2198 != 1 && var12.field3976[var63] == 1) {
                                                        var67 = "<col=ff9040>" + var66.field2200 + "</col>";
                                                    } else {
                                                        var67 = "<col=ff9040>" + var66.field2200 + "</col> x" + class36.method320(var12.field3976[var63], 2);
                                                    }
                                                    int var68 = var14 + ((var12.field3999 + 115) * var65);
                                                    int var69 = (var12.field4049 + 12) * var64 + var16;
                                                    if (var12.field3921 == 0) {
                                                        var62.method1480(var67, var68, var69, var12.field4076, var12.field4086 ? 0 : -1);
                                                    } else if (var12.field3921 == 1) {
                                                        var62.method1492(var67, var68 + 57, var69, var12.field4076, var12.field4086 ? 0 : -1);
                                                    } else {
                                                        var62.method1467(var67, var68 + 115 - 1, var69, var12.field4076, var12.field4086 ? 0 : -1);
                                                    }
                                                }
                                                var63++;
                                            }
                                        }
                                    }
                                    if (var12.field4084 == 8 && class321.field5028 == var12 && class325.field5083 == class102.field1689) {
                                        int var70 = 0;
                                        int var71 = 0;
                                        class205 var72 = class107.field1756;
                                        String var73 = var12.field3927;
                                        String var74 = class137.method1060(var12, var73, -7276);
                                        while (var74.length() > 0) {
                                            int var75 = var74.indexOf("<br>");
                                            String var76;
                                            if (var75 == -1) {
                                                var76 = var74;
                                                var74 = "";
                                            } else {
                                                var76 = var74.substring(0, var75);
                                                var74 = var74.substring(var75 + 4);
                                            }
                                            int var77 = var72.method1468(var76);
                                            if (var77 > var71) {
                                                var71 = var77;
                                            }
                                            var70 += var72.field3187 + 1;
                                        }
                                        var71 += 6;
                                        var70 += 7;
                                        int var78 = var12.field3941 + var14 - var71 - 5;
                                        if (var78 < (var14 + 5)) {
                                            var78 = var14 + 5;
                                        }
                                        if (arg9 < var71 + var78) {
                                            var78 = arg9 - var71;
                                        }
                                        int var79 = var12.field3939 + var16 + 5;
                                        if (var79 + var70 > arg5) {
                                            var79 = arg5 - var70;
                                        }
                                        if (class162.field2623) {
                                            class114.method887(var78, var79, var71, var70, 16777120);
                                            class114.method897(var78, var79, var71, var70, 0);
                                        } else {
                                            class33.method288(var78, var79, var71, var70, 16777120);
                                            class33.method293(var78, var79, var71, var70, 0);
                                        }
                                        String var80 = var12.field3927;
                                        int var81 = var72.field3187 + var79 + 2;
                                        String var82 = class137.method1060(var12, var80, -7276);
                                        while (var82.length() > 0) {
                                            int var83 = var82.indexOf("<br>");
                                            String var84;
                                            if (var83 == -1) {
                                                var84 = var82;
                                                var82 = "";
                                            } else {
                                                var84 = var82.substring(0, var83);
                                                var82 = var82.substring(var83 + 4);
                                            }
                                            var72.method1480(var84, var78 + 3, var81, 0, -1);
                                            var81 += var72.field3187 + 1;
                                        }
                                    }
                                    if (var12.field4084 == 9) {
                                        int var85;
                                        int var86;
                                        int var87;
                                        int var88;
                                        if (var12.field4042) {
                                            var85 = var12.field3939 + var16;
                                            var86 = var16;
                                            var87 = var14;
                                            var88 = var14 + var12.field3941;
                                        } else {
                                            var88 = var12.field3941 + var14;
                                            var87 = var14;
                                            var85 = var16;
                                            var86 = var12.field3939 + var16;
                                        }
                                        if (var12.field4093 == 1) {
                                            if (class162.field2623) {
                                                class114.method890(var87, var85, var88, var86, var12.field4076);
                                            } else {
                                                class33.method306(var87, var85, var88, var86, var12.field4076);
                                            }
                                        } else if (class162.field2623) {
                                            class114.method885(var87, var85, var88, var86, var12.field4076, var12.field4093);
                                        } else {
                                            class33.method310(var87, var85, var88, var86, var12.field4076, var12.field4093);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field808++;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 2262)
    public static final void method449(int arg0) {
        class57.field870 = null;
        field795++;
        class160.method1177(class211.field3314, class168.field2707, class338.field5219, 0, -1, (byte) 84, 0, 0, 0);
        if (class57.field870 != null) {
            method448(0, class168.field2697, 0, (byte) -82, -1412584499, class338.field5219, class57.field870, class55.field841.field4091, class182.field2885, class211.field3314);
            class57.field870 = null;
        }
        if (arg0 >= -17) {
            method450(-1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Z", line = 2282)
    public static final boolean method450(int arg0) {
        field813++;
        if (class162.field2623) {
            return true;
        } else if (arg0 == 2) {
            return class289.field4554;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)Z", line = 2299)
    public final boolean method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field797++;
        if (arg3 == arg4 && arg0 == arg1) {
            return true;
        }
        int var6 = arg4 - this.field803;
        int var7 = arg0 - this.field815;
        if (var6 < 0 || this.field814 <= var6 || var7 < 0 || this.field811 <= var7) {
            return false;
        }
        int var8 = arg1 - this.field815;
        int var9 = arg3 - this.field803;
        int var10;
        if (var6 > var9) {
            var10 = var6 - var9;
        } else {
            var10 = var9 - var6;
        }
        int var11;
        if (var7 > var8) {
            var11 = var7 - var8;
        } else {
            var11 = var8 - var7;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field796[var9][var8] & 0x2C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field796[var9][var8] & 0x2C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var9 < var6) {
                        if ((this.field796[var9][var8] & 0x2C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field796[var9][var8] & 0x2C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var9) {
                if (var6 > var9) {
                    if ((this.field796[var9][var8] & 0x2C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var6) {
                    if ((this.field796[var9][var8] & 0x2C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var7) {
                        if ((this.field796[var9][var8] & 0x2C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var7 < var8) {
                        if ((this.field796[var9][var8] & 0x2C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field796[var6][var7] & 0x240100) == arg2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZI)V", line = 2448)
    private final void method452(int arg0, int arg1, boolean arg2, int arg3) {
        this.field796[arg3][arg0] = class164.method1234(this.field796[arg3][arg0], ~arg1);
        if (!arg2) {
            field816++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V", line = 2457)
    public class53(int arg0, int arg1) {
        this.field814 = arg0;
        this.field811 = arg1;
        this.field815 = 0;
        this.field796 = new int[this.field814][this.field811];
        this.field803 = 0;
        this.method437(false);
    }
}
