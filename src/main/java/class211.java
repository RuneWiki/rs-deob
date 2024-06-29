import java.awt.Canvas;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class211 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lok;")
    private class170 field2978 = null;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lok;")
    private class170 field2980 = null;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    private int field2993 = 65000;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lip;")
    public static class508 field2984 = new class508("", 14);

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Z")
    public static boolean field2989 = false;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "[F")
    public static float[] field2990 = new float[4];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "B")
    public static byte field2979;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!vc", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field2985++;
        return "Cache:" + this.field2982;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBJ)V", line = 13)
    public static final void method1449(int arg0, int arg1, byte arg2, long arg3) {
        field2983++;
        int var5 = ((int) arg3 & 0x7C251) >> 14;
        if (arg2 >= -45) {
            return;
        }
        int var6 = ((int) arg3 & 0x360A26) >> 20;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class203.method1373(var6, arg1, 0, var5, 0, 0, true, arg0, (byte) 11);
            return;
        }
        class209 var8 = class432.field6575.method1872(var7, false);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field2925;
            var9 = var8.field2928;
        } else {
            var9 = var8.field2925;
            var10 = var8.field2928;
        }
        int var11 = var8.field2888;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class203.method1373(0, arg1, var10, 0, var11, var9, true, arg0, (byte) 11);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZII[B)Z", line = 56)
    private final boolean method1450(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field2986++;
        class170 var6 = this.field2980;
        synchronized (this.field2980) {
            try {
                int var8;
                if (arg1) {
                    if (((long) (arg3 * 6 + 6)) > this.field2978.method1162((byte) 0)) {
                        return false;
                    }
                    this.field2978.method1159(arg2 ^ 0xB35, (long) (arg3 * 6));
                    this.field2978.method1155(0, class407.field6172, 6, -1);
                    var8 = ((class407.field6172[4] & 0xFF) << 8) + ((class407.field6172[3] & 0xFF) << 16) + (class407.field6172[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field2980.method1162((byte) 0) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2980.method1162((byte) 0) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class407.field6172[5] = (byte) var8;
                class407.field6172[4] = (byte) (var8 >> 8);
                class407.field6172[3] = (byte) (var8 >> 16);
                class407.field6172[0] = (byte) (arg0 >> 16);
                class407.field6172[1] = (byte) (arg0 >> 8);
                class407.field6172[2] = (byte) arg0;
                this.field2978.method1159(arg2 - 3010, (long) (arg3 * 6));
                this.field2978.method1153(class407.field6172, arg2 - 2763, 6, 0);
                if (arg2 != 2884) {
                    method1454(-34);
                }
                int var10 = 0;
                int var11 = 0;
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field2980.method1159(-85, (long) (var8 * 520));
                            try {
                                this.field2980.method1155(0, class407.field6172, 8, arg2 ^ 0xFFFFF4BB);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class407.field6172[0] & 0xFF << 8) + (class407.field6172[1] & 0xFF);
                            int var14 = (class407.field6172[2] & 0xFF << 8) + (class407.field6172[3] & 0xFF);
                            var12 = (class407.field6172[4] & 0xFF << 16) + ((class407.field6172[5] & 0xFF) << 8) + (class407.field6172[6] & 0xFF);
                            int var15 = class407.field6172[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field2982 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field2980.method1162((byte) 0) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field2980.method1162((byte) 0) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class407.field6172[1] = (byte) arg3;
                    class407.field6172[0] = (byte) (arg3 >> 8);
                    class407.field6172[2] = (byte) (var11 >> 8);
                    class407.field6172[3] = (byte) var11;
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    class407.field6172[5] = (byte) (var12 >> 8);
                    class407.field6172[6] = (byte) var12;
                    class407.field6172[7] = (byte) this.field2982;
                    class407.field6172[4] = (byte) (var12 >> 16);
                    this.field2980.method1159(arg2 - 2924, (long) (var8 * 520));
                    this.field2980.method1153(class407.field6172, 104, 8, 0);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field2980.method1153(arg4, 127, var18, var10);
                    var10 += var18;
                    var8 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lhi;)V", line = 183)
    public static final void method1451(class140 arg0) {
        for (int var1 = arg0.field1868; var1 <= arg0.field1871; var1++) {
            for (int var2 = arg0.field1863; var2 <= arg0.field1874; var2++) {
                class452 var3 = class443.field6672[arg0.field1866][var1][var2];
                if (var3 != null) {
                    class384 var4 = var3.field6814;
                    class384 var5 = null;
                    while (var4 != null) {
                        if (var4.field5832 == arg0) {
                            if (var5 == null) {
                                var3.field6814 = var4.field5834;
                            } else {
                                var5.field5834 = var4.field5834;
                            }
                            var4.method2403(false);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field5834;
                    }
                    var3.field6798 = 0;
                    for (class384 var6 = var3.field6814; var6 != null; var6 = var6.field5834) {
                        var3.field6798 = (byte) (var3.field6798 | var6.field5833);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[B", line = 245)
    public final byte[] method1452(int arg0, int arg1) {
        field2981++;
        class170 var3 = this.field2980;
        synchronized (this.field2980) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field2978.method1162((byte) 0)) {
                    return null;
                }
                this.field2978.method1159(103, (long) (arg0 * 6));
                if (arg1 != 65280) {
                    return null;
                }
                this.field2978.method1155(0, class407.field6172, 6, -1);
                int var6 = ((class407.field6172[0] & 0xFF) << 16) - (-((class407.field6172[1] & 0xFF) << 8) - (class407.field6172[2] & 0xFF));
                int var7 = (class407.field6172[3] & 0xFF << 16) + ((class407.field6172[4] & 0xFF) << 8) + (class407.field6172[5] & 0xFF);
                if (var6 < 0 || this.field2993 < var6) {
                    return null;
                } else if (var7 > 0 && (this.field2980.method1162((byte) 0) / 520L) >= ((long) var7)) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var6 > var11) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field2980.method1159(116, (long) (var7 * 520));
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2980.method1155(0, class407.field6172, var14 + 8, -1);
                        int var15 = (class407.field6172[0] & 0xFF << 8) + (class407.field6172[1] & 0xFF);
                        int var16 = ((class407.field6172[2] & 0xFF) << 8) + (class407.field6172[3] & 0xFF);
                        int var17 = ((class407.field6172[4] & 0xFF) << 16) + ((class407.field6172[5] & 0xFF) << 8) + (class407.field6172[6] & 0xFF);
                        int var18 = class407.field6172[7] & 0xFF;
                        if (arg0 == var15 && var12 == var16 && this.field2982 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field2980.method1162((byte) 0) / 520L) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class407.field6172[var21 + 8];
                                }
                                var12++;
                                var7 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 330)
    public static final void method1453(int arg0) {
        field2991++;
        if (!class201.field2704) {
            return;
        }
        class201.field2704 = false;
        class451.field6771 = null;
        if (arg0 != 15793) {
            field2990 = null;
        }
        class534.field7851 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 348)
    public static final void method1454(int arg0) {
        class405.field6149 = 0;
        field2988++;
        int var1 = class409.field6214.method1057(48);
        boolean var2 = class409.field6214.method1087(false) == 1;
        int var3 = class409.field6214.method1079(-13703);
        int var4 = class409.field6214.method1074(-635989152);
        class297.method1896(22826);
        class312.method1964(var1, (byte) 3);
        int var5 = (class497.field7326 - class409.field6214.field2185) / 16;
        class411.field6253 = new int[var5][4];
        if (arg0 != Integer.MAX_VALUE) {
            return;
        }
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class411.field6253[var6][var10] = class409.field6214.method1099(-109);
            }
        }
        class510.field7488 = new byte[var5][];
        class44.field640 = new int[var5];
        class213.field3024 = new int[var5];
        class510.field7490 = new int[var5];
        class410.field6233 = new int[var5];
        class455.field6843 = new byte[var5][];
        class423.field6449 = new int[var5];
        class263.field3688 = null;
        class402.field6119 = new byte[var5][];
        class140.field1870 = new byte[var5][];
        class441.field6657 = null;
        int var7 = 0;
        for (int var8 = (var4 - (class398.field6071 >> 4)) / 8; var8 <= (((class398.field6071 >> 4) + var4) / 8); var8++) {
            for (int var9 = (var3 - (class528.field7734 >> 4)) / 8; var9 <= ((class528.field7734 >> 4) + var3) / 8; var9++) {
                class510.field7490[var7] = (var8 << 8) + var9;
                class213.field3024[var7] = class79.field1131.method1265("m" + var8 + "_" + var9, 126);
                class410.field6233[var7] = class79.field1131.method1265("l" + var8 + "_" + var9, 126);
                class423.field6449[var7] = class79.field1131.method1265("um" + var8 + "_" + var9, class28.method251(arg0, 2147483562));
                class44.field640[var7] = class79.field1131.method1265("ul" + var8 + "_" + var9, 53);
                var7++;
            }
        }
        class175.method1178(var3, 10, (byte) -80, var4, var2);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 430)
    public static void method1455(int arg0) {
        field2984 = null;
        if (arg0 != 4) {
            field2979 = 82;
        }
        field2990 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I", line = 443)
    public static final int method1456(byte arg0) {
        field2992++;
        class165 var1 = class400.field6090;
        boolean var2 = false;
        if (class378.field5771 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class165.method1130(null, 0, (byte) -74, var3, null, 0);
        }
        long var4 = class58.method427((byte) -19);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method805(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class58.method427((byte) -19) - var4);
        var1.method1117(100, 0, -16777216, 0, 100, (byte) 73);
        if (arg0 != -26) {
            method1456((byte) -9);
        }
        if (var2) {
            var1.method1120((byte) 1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILok;Lok;I)V", line = 497)
    public class211(int arg0, class170 arg1, class170 arg2, int arg3) {
        this.field2982 = arg0;
        this.field2993 = arg3;
        this.field2978 = arg2;
        this.field2980 = arg1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[B)Z", line = 510)
    public final boolean method1457(int arg0, int arg1, int arg2, byte[] arg3) {
        field2987++;
        class170 var5 = this.field2980;
        synchronized (this.field2980) {
            if (arg2 < 0 || arg2 > this.field2993) {
                throw new IllegalArgumentException();
            }
            if (arg0 != 5805) {
                this.field2993 = 125;
            }
            boolean var6 = this.method1450(arg2, true, arg0 - 2921, arg1, arg3);
            if (!var6) {
                var6 = this.method1450(arg2, false, arg0 - 2921, arg1, arg3);
            }
            return var6;
        }
    }
}
