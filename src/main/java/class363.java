import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class363 {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public int field5602 = 99;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Z")
    public boolean field5598 = false;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public int field5608 = 5;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public int field5603 = -1;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public int field5617 = -1;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Z")
    public boolean field5614 = false;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public int field5621 = 2;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field5607 = -1;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public int field5622 = -1;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public int field5624 = -1;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public int field5601 = 0;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "Z")
    public boolean field5625 = false;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lfk;")
    public class244 field5606;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
    public int[] field5599;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
    private int[] field5604;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "[I")
    public int[] field5623;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "[Z")
    public boolean[] field5619;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "[[I")
    public int[][] field5605;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lhw;I)V")
    public final void method2387(class208 arg0, int arg1) {
        field5610++;
        if (arg1 <= 95) {
            this.method2392(true, 115, null);
        }
        while (true) {
            int var3 = arg0.method1445(116);
            if (var3 == 0) {
                return;
            }
            this.method2392(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static final void method2388(int arg0) {
        field5613++;
        class357.field5545 = 0;
        int var1 = class279.field4428.method1422(arg0 - 136);
        int var2 = class279.field4428.method1417(2);
        boolean var3 = class279.field4428.method1422(-11) == 1;
        int var4 = class279.field4428.method1455(-3387);
        class206.method1406(0);
        class104.method707(-96, var1);
        int var5 = (class156.field2156 - class279.field4428.field3162) / 16;
        class84.field1228 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class84.field1228[var6][var10] = class279.field4428.method1436((byte) 111);
            }
        }
        class140.field1906 = null;
        class100.field1431 = null;
        class77.field1154 = new byte[var5][];
        class411.field6236 = new int[var5];
        class94.field1365 = new byte[var5][];
        class321.field4987 = new int[var5];
        class122.field1666 = new int[var5];
        class529.field7782 = new int[var5];
        class402.field6047 = new byte[var5][];
        class187.field2729 = new byte[var5][];
        class346.field5392 = new int[var5];
        int var7 = 0;
        for (int var8 = (var4 - (class135.field1839 >> 4)) / arg0; var8 <= (var4 + (class135.field1839 >> 4)) / 8; var8++) {
            for (int var9 = (var2 - (class197.field3038 >> 4)) / 8; var9 <= (var2 + (class197.field3038 >> 4)) / 8; var9++) {
                class529.field7782[var7] = (var8 << 8) + var9;
                class122.field1666[var7] = class128.field1730.method1014(true, "m" + var8 + "_" + var9);
                class346.field5392[var7] = class128.field1730.method1014(true, "l" + var8 + "_" + var9);
                class411.field6236[var7] = class128.field1730.method1014(true, "um" + var8 + "_" + var9);
                class321.field4987[var7] = class128.field1730.method1014(true, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class387.method2485(var3, 10, 112, var2, var4);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIILe;B)Le;")
    public final class536 method2389(int arg0, int arg1, int arg2, int arg3, class536 arg4, byte arg5) {
        field5618++;
        int var7 = this.field5599[arg3];
        int var8 = this.field5623[arg3];
        class249 var9 = this.field5606.method1695(var8 >> 16, true);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method329((byte) 1, arg1, true);
        }
        class249 var11 = null;
        if ((this.field5598 || class84.field1230) && arg2 != -1 && arg2 < this.field5623.length) {
            int var12 = this.field5623[arg2];
            var11 = this.field5606.method1695(var12 >> 16, true);
            arg2 = var12 & 0xFFFF;
        }
        class249 var13 = null;
        class249 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field5604 != null) {
            if (arg3 < this.field5604.length) {
                var15 = this.field5604[arg3];
                if (var15 != 65535) {
                    var13 = this.field5606.method1695(var15 >> 16, true);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field5598 || class84.field1230) && arg2 != -1 && this.field5604.length > arg2) {
                var16 = this.field5604[arg2];
                if (var16 != 65535) {
                    var14 = this.field5606.method1695(var16 >> 16, true);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field5614) {
            arg1 |= 0x200;
        }
        if (var9.method1726(var10, arg5 + 65279)) {
            arg1 |= 0x80;
        }
        if (var9.method1721(var10, 36)) {
            arg1 |= 0x100;
        }
        if (var9.method1720((byte) -88, var10)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1726(var15, 65280)) {
                arg1 |= 0x80;
            }
            if (var13.method1721(var15, 111)) {
                arg1 |= 0x100;
            }
            if (var13.method1720((byte) -87, var15)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1726(arg2, 65280)) {
                arg1 |= 0x80;
            }
            if (var11.method1721(arg2, 119)) {
                arg1 |= 0x100;
            }
            if (var11.method1720((byte) -51, arg2)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1726(var16, 65280)) {
                arg1 |= 0x80;
            }
            if (var14.method1721(var16, -76)) {
                arg1 |= 0x100;
            }
            if (var14.method1720((byte) -16, var16)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class536 var18 = arg4.method329(arg5, var17, true);
        var18.method3181(0, var10, arg2, arg5 + 116, var11, var7, this.field5614, arg0 - 1, var9);
        if (var13 != null) {
            var18.method3181(0, var15, var16, 104, var14, var7, this.field5614, arg0 - 1, var13);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBIBLe;III)Le;")
    public final class536 method2390(int arg0, byte arg1, int arg2, byte arg3, class536 arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= -10) {
            return null;
        }
        field5609++;
        int var9 = this.field5599[arg2];
        int var10 = this.field5623[arg2];
        class249 var11 = this.field5606.method1695(var10 >> 16, true);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method329(arg1, arg7, true);
        }
        class249 var13 = null;
        if ((this.field5598 || class84.field1230) && arg5 != -1 && arg5 < this.field5623.length) {
            int var14 = this.field5623[arg5];
            var13 = this.field5606.method1695(var14 >> 16, true);
            arg5 = var14 & 0xFFFF;
        }
        if (this.field5614) {
            arg7 |= 0x200;
        }
        if (var11.method1726(var12, 65280)) {
            arg7 |= 0x80;
        }
        if (var11.method1721(var12, 118)) {
            arg7 |= 0x100;
        }
        if (var11.method1720((byte) -17, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1726(arg5, 65280)) {
                arg7 |= 0x80;
            }
            if (var13.method1721(arg5, -104)) {
                arg7 |= 0x100;
            }
            if (var13.method1720((byte) -32, arg5)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class536 var16 = arg4.method329(arg1, var15, true);
        var16.method3181(arg0, var12, arg5, 114, var13, var9, this.field5614, arg6 - 1, var11);
        return var16;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIZ)I")
    public final int method2391(int arg0, int arg1, int arg2, boolean arg3) {
        field5616++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field5623[arg2];
        class249 var8 = null;
        class249 var9 = this.field5606.method1695(var7 >> 16, true);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field5598 || class84.field1230) && arg0 != -1 && this.field5623.length > arg0) {
            int var11 = this.field5623[arg0];
            var8 = this.field5606.method1695(var11 >> 16, true);
            var6 = var11 & 0xFFFF;
        }
        if (this.field5614) {
            var5 |= 0x200;
        }
        if (var9.method1726(var10, 65280)) {
            var5 |= 0x80;
        }
        if (var9.method1721(var10, 107)) {
            var5 |= 0x100;
        }
        if (arg1 != 256) {
            return -67;
        }
        if (var9.method1720((byte) -20, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1726(var6, 65280)) {
                var5 |= 0x80;
            }
            if (var8.method1721(var6, 115)) {
                var5 |= 0x100;
            }
            if (var8.method1720((byte) -70, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field5604 != null && arg3) {
            if (arg2 < this.field5604.length) {
                int var12 = this.field5604[arg2];
                if (var12 != 65535) {
                    class249 var13 = this.field5606.method1695(var12 >> 16, true);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1726(var14, 65280)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1721(var14, 25)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1720((byte) -67, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field5598 || class84.field1230) && arg0 != -1 && arg0 < this.field5604.length) {
                int var15 = this.field5604[arg0];
                if (var15 != 65535) {
                    class249 var16 = this.field5606.method1695(var15 >> 16, true);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1726(var17, 65280)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1721(var17, 123)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1720((byte) -13, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZILhw;)V")
    private final void method2392(boolean arg0, int arg1, class208 arg2) {
        if (!arg0) {
            this.method2393(98);
        }
        field5600++;
        if (arg1 == 1) {
            int var4 = arg2.method1455(-3387);
            this.field5599 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5599[var5] = arg2.method1455(-3387);
            }
            this.field5623 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field5623[var6] = arg2.method1455(-3387);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field5623[var7] += arg2.method1455(-3387) << 16;
            }
        } else if (arg1 == 2) {
            this.field5617 = arg2.method1455(-3387);
        } else if (arg1 == 3) {
            this.field5619 = new boolean[256];
            int var15 = arg2.method1445(20);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field5619[arg2.method1445(103)] = true;
            }
        } else if (arg1 == 5) {
            this.field5608 = arg2.method1445(65);
        } else if (arg1 == 6) {
            this.field5603 = arg2.method1455(-3387);
        } else if (arg1 == 7) {
            this.field5607 = arg2.method1455(-3387);
        } else if (arg1 == 8) {
            this.field5602 = arg2.method1445(-76);
        } else if (arg1 == 9) {
            this.field5622 = arg2.method1445(-96);
        } else if (arg1 == 10) {
            this.field5624 = arg2.method1445(47);
        } else if (arg1 == 11) {
            this.field5621 = arg2.method1445(111);
        } else if (arg1 == 12) {
            int var12 = arg2.method1445(-127);
            this.field5604 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field5604[var13] = arg2.method1455(-3387);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field5604[var14] += arg2.method1455(-3387) << 16;
            }
        } else if (arg1 == 13) {
            int var8 = arg2.method1455(-3387);
            this.field5605 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method1445(31);
                if (var10 > 0) {
                    this.field5605[var9] = new int[var10];
                    this.field5605[var9][0] = arg2.method1452(3);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field5605[var9][var11] = arg2.method1455(-3387);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field5614 = true;
        } else if (arg1 == 15) {
            this.field5598 = true;
        } else if (arg1 == 16) {
            this.field5625 = true;
        } else if (arg1 == 17) {
            this.field5601 = arg2.method1445(120);
            return;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public final void method2393(int arg0) {
        field5615++;
        if (this.field5622 == -1) {
            if (this.field5619 == null) {
                this.field5622 = 0;
            } else {
                this.field5622 = 2;
            }
        }
        if (this.field5624 == -1) {
            if (this.field5619 == null) {
                this.field5624 = 0;
            } else {
                this.field5624 = 2;
            }
        }
        if (arg0 != -10145) {
            this.method2389(-100, 7, -50, -118, null, (byte) -76);
        }
    }
}
