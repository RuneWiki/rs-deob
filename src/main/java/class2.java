import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Z")
    public boolean field10;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "Z")
    public boolean field22;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "[S")
    public short[] field15;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "[I")
    public static int[] field17 = new int[2];

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "Lab;")
    public class669 field18;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLua;)Z", line = 5)
    public static final boolean method2(int arg0, byte arg1, class665 arg2) {
        field5++;
        int var3 = arg2.method3733((byte) -24, 2);
        if (var3 == 0) {
            if (arg2.method3733((byte) -24, 1) != 0) {
                method2(arg0, (byte) 105, arg2);
            }
            int var4 = arg2.method3733((byte) -24, 6);
            int var5 = arg2.method3733((byte) -24, 6);
            boolean var6 = arg2.method3733((byte) -24, 1) == 1;
            if (var6) {
                class131.field2196[class495.field6867++] = arg0;
            }
            if (class49.field1040[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class753 var7 = class217.field3154[arg0];
            class598 var8 = class49.field1040[arg0] = new class598();
            var8.field5716 = arg0;
            if (class627.field8638[arg0] != null) {
                var8.method3400((byte) 84, class627.field8638[arg0]);
            }
            var8.method2456((byte) -108, var7.field10518, true);
            var8.field5701 = var7.field10520;
            int var9 = var7.field10515;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FCD8E) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class221.field3177;
            var8.field8199 = var7.field10521;
            int var14 = (var12 << 6) + var5 - class367.field5236;
            var8.field5747[0] = class318.field4386[arg0];
            var8.field5926 = var8.field5921 = (byte) var10;
            if (class334.method2118(var14, var13, true)) {
                var8.field5921++;
            }
            var8.method3397(var14, var13, (byte) 102);
            var8.field8184 = false;
            class217.field3154[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg2.method3733((byte) -24, 2);
            int var16 = class217.field3154[arg0].field10515;
            class217.field3154[arg0].field10515 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg2.method3733((byte) -24, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class217.field3154[arg0].field10515;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FD366) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var23--;
                var22++;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class217.field3154[arg0].field10515 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg2.method3733((byte) -24, 18);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class217.field3154[arg0].field10515;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            if (arg1 != 105) {
                field17 = null;
            }
            int var31 = var27 + var28 & 0xFF;
            class217.field3154[arg0].field10515 = (var29 << 28) + var31 + (var30 << 14);
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBIII)V", line = 186)
    public final void method3(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field14++;
        if (arg1 <= 114) {
            method2(-108, (byte) -46, null);
        }
        this.field8 = arg2;
        this.field11 = arg0;
        this.field16 = arg4;
        this.field13 = arg3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V", line = 205)
    public static final void method4(int arg0, int arg1, int arg2) {
        field19++;
        class594 var3 = class692.method3869(arg1, (byte) 105, 13);
        var3.method3378(-25490);
        var3.field8126 = arg2;
        if (arg0 >= -84) {
            field17 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILha;IIIII)V", line = 222)
    private final void method5(int arg0, class59 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9++;
        if (arg4 == 3) {
            this.field18 = arg1.method183(arg3, arg0, arg2, arg6, arg5, 1.0F);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 235)
    private final void method6(int arg0) {
        int var2 = this.field7;
        if (var2 == 2) {
            this.field16 = 2048;
            this.field11 = 0;
            this.field8 = 2048;
            this.field13 = 1;
        } else if (var2 == 3) {
            this.field11 = 0;
            this.field16 = 2048;
            this.field13 = 1;
            this.field8 = 4096;
        } else if (var2 == 4) {
            this.field11 = 0;
            this.field13 = 4;
            this.field16 = 2048;
            this.field8 = 2048;
        } else if (var2 == 5) {
            this.field8 = 8192;
            this.field13 = 4;
            this.field16 = 2048;
            this.field11 = 0;
        } else if (var2 == 12) {
            this.field8 = 2048;
            this.field13 = 2;
            this.field11 = 0;
            this.field16 = 2048;
        } else if (var2 == 13) {
            this.field16 = 2048;
            this.field11 = 0;
            this.field13 = 2;
            this.field8 = 8192;
        } else if (var2 == 10) {
            this.field16 = 512;
            this.field13 = 3;
            this.field11 = 1536;
            this.field8 = 2048;
        } else if (var2 == 11) {
            this.field13 = 3;
            this.field16 = 512;
            this.field11 = 1536;
            this.field8 = 4096;
        } else if (var2 == 6) {
            this.field11 = 1280;
            this.field13 = 3;
            this.field16 = 768;
            this.field8 = 2048;
        } else if (var2 == 7) {
            this.field11 = 1280;
            this.field13 = 3;
            this.field8 = 4096;
            this.field16 = 768;
        } else if (var2 == 8) {
            this.field11 = 1024;
            this.field8 = 2048;
            this.field16 = 1024;
            this.field13 = 3;
        } else if (var2 == 9) {
            this.field16 = 1024;
            this.field8 = 4096;
            this.field13 = 3;
            this.field11 = 1024;
        } else if (var2 == 14) {
            this.field13 = 1;
            this.field11 = 1280;
            this.field8 = 2048;
            this.field16 = 768;
        } else if (var2 == 15) {
            this.field8 = 4096;
            this.field16 = 512;
            this.field13 = 1;
            this.field11 = 1536;
        } else if (var2 == 16) {
            this.field8 = 8192;
            this.field13 = 1;
            this.field16 = 256;
            this.field11 = 1792;
        } else {
            this.field8 = 2048;
            this.field16 = 2048;
            this.field11 = 0;
            this.field13 = 0;
        }
        if (arg0 == 32402) {
            field21++;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V", line = 432)
    public static void method7(int arg0) {
        field17 = null;
        if (arg0 != -4524) {
            field20 = 24;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZI)V", line = 446)
    public final void method8(int arg0, boolean arg1, int arg2) {
        if (arg0 != 8688) {
            this.method8(86, false, 92);
        }
        field6++;
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field8 * arg2 / 50 + this.field12 & 0x7FF;
            int var6 = this.field13;
            if (var6 == 1) {
                var4 = (class255.field3698[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class307.field4254[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field18.method1436(-1, (float) ((this.field16 * var4 >> 11) + this.field11) / 2048.0F);
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 522)
    protected class2() {
        if (class307.field4254 == null) {
            class119.method1039((byte) 122);
        }
        this.method6(32402);
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lha;Lcea;I)V", line = 532)
    public class2(class59 arg0, class215 arg1, int arg2) {
        if (class307.field4254 == null) {
            class119.method1039((byte) 122);
        }
        this.field4 = arg1.method1535(255);
        this.field10 = (this.field4 & 0x8) != 0;
        this.field22 = (this.field4 & 0x10) != 0;
        this.field4 &= 0x7;
        int var4 = arg1.method1478(842397944) << arg2;
        int var5 = arg1.method1478(842397944) << arg2;
        int var6 = arg1.method1478(842397944) << arg2;
        int var7 = arg1.method1535(255);
        int var8 = var7 * 2 + 1;
        this.field15 = new short[var8];
        for (int var9 = 0; var9 < this.field15.length; var9++) {
            short var13 = (short) arg1.method1478(842397944);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field15[var9] = (short) class418.method2577(var15, var14 << 8);
        }
        int var10 = (var7 << class130.field2185) + class72.field1328;
        int var11 = class456.field6424 == null ? class646.field8885[class160.method1228(arg1.method1478(842397944), 30) & 0xFFFF] : class456.field6424[arg1.method1478(842397944)];
        int var12 = arg1.method1535(255);
        this.field12 = (var12 & 0xE0) << 3;
        this.field7 = var12 & 0x1F;
        if (this.field7 != 31) {
            this.method6(32402);
        }
        this.method5(var6, arg0, var5, var4, 3, var11, var10);
    }
}
