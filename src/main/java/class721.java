import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class721 {

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field10182;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Ljava/io/File;")
    private File field10185;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "J")
    private long field10173;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "J")
    private long field10172;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
    public static int[] field10180 = new int[8];

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field10183 = 0;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "F")
    public static float field10176;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field10170;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field10175;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field10177;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field10178;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([BIII)V")
    public final void method4042(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field10170++;
        if (arg2 >= -3) {
            this.method4047((byte) -70);
        }
        if (((long) arg1 + this.field10173) > this.field10172) {
            this.field10182.seek(this.field10172);
            this.field10182.write(1);
            throw new EOFException();
        } else {
            this.field10182.write(arg0, arg3, arg1);
            this.field10173 += arg1;
        }
    }

    @OriginalMember(owner = "client!el", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field10182 != null) {
            System.out.println("Warning! fileondisk " + this.field10185 + " not closed correctly using close(). Auto-closing instead. ");
            this.method4048(1);
        }
        field10184++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI[[[Lch;III)Z")
    public static final boolean method4043(boolean arg0, int arg1, class38[][][] arg2, int arg3, int arg4, int arg5) {
        field10174++;
        byte var6 = arg0 ? 1 : (byte) (class54.field757 & 0xFF);
        if (class634.field9017[class392.field5459][arg4][arg5] == var6) {
            return false;
        } else if ((class429.field5916[class392.field5459][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg3 != -25638) {
                method4045(49);
            }
            int var8 = 0;
            class616.field8778[var7] = arg4;
            int var35 = var7 + 1;
            class42.field597[var7] = arg5;
            class634.field9017[class392.field5459][arg4][arg5] = var6;
            while (var35 != var8) {
                int var9 = class616.field8778[var8] & 0xFFFF;
                int var10 = (class616.field8778[var8] & 0xFF9D28) >> 16;
                int var11 = class616.field8778[var8] >> 24 & 0xFF;
                int var12 = class42.field597[var8] & 0xFFFF;
                int var13 = class42.field597[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class429.field5916[class392.field5459][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class392.field5459 + 1; var16 <= 3; var16++) {
                    if ((class429.field5916[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field539 != null) {
                                int var20 = class72.method459(var10, -114);
                                if (arg2[var16][var9][var12].field539.field3072 == var20 || arg2[var16][var9][var12].field540 != null && arg2[var16][var9][var12].field540.field3072 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class72.method459(var11, -120);
                                    if (arg2[var16][var9][var12].field539.field3072 == var21 || arg2[var16][var9][var12].field540 != null && arg2[var16][var9][var12].field540.field3072 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class72.method459(var13, -112);
                                    if (arg2[var16][var9][var12].field539.field3072 == var22 || arg2[var16][var9][var12].field540 != null && arg2[var16][var9][var12].field540.field3072 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class38 var23 = arg2[var16][var9][var12];
                            if (var23.field538 != null) {
                                for (class590 var24 = var23.field538; var24 != null; var24 = var24.field8467) {
                                    class743 var25 = var24.field8468;
                                    if (var25 instanceof class649) {
                                        class649 var26 = (class649) var25;
                                        int var27 = var26.method276(arg3 ^ 0x14F);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method269(-17174);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class38 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field538 != null) {
                            for (class590 var31 = var30.field538; var31 != null; var31 = var31.field8467) {
                                class743 var32 = var31.field8468;
                                if (var32.field10365 != var32.field10352 || var32.field10357 != var32.field10353) {
                                    for (int var33 = var32.field10352; var33 <= var32.field10365; var33++) {
                                        for (int var34 = var32.field10357; var34 <= var32.field10353; var34++) {
                                            class634.field9017[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class634.field9017[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class52.field741[class392.field5459 + 1].method1959(arg3 ^ 0xFFFF9BA7, var12, var9);
                    if (var17 > class504.field7062[arg1]) {
                        class504.field7062[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    if (var18 < class5.field27[arg1]) {
                        class5.field27[arg1] = var18;
                    } else if (class405.field5619[arg1] < var18) {
                        class405.field5619[arg1] = var18;
                    }
                    int var19 = var12 << 9;
                    if (var19 < class477.field6508[arg1]) {
                        class477.field6508[arg1] = var19;
                    } else if (var19 > class611.field8693[arg1]) {
                        class611.field8693[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class634.field9017[class392.field5459][var9 - 1][var12] != var6) {
                        class616.field8778[var35] = class747.method4153(class747.method4153(1179648, var9 - 1), -754974720);
                        class42.field597[var35] = class747.method4153(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class634.field9017[class392.field5459][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class456.field6281;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class634.field9017[class392.field5459][var9 - 1][var12] != var6 && (class429.field5916[class392.field5459][var9][var12] & 0x4) == 0 && (class429.field5916[class392.field5459][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class616.field8778[var35] = class747.method4153(class747.method4153(var9 - 1, 1179648), 1375731712);
                            class42.field597[var35] = class747.method4153(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class634.field9017[class392.field5459][var9 - 1][var12] = var6;
                        }
                        if (class634.field9017[class392.field5459][var9][var12] != var6) {
                            class616.field8778[var35] = class747.method4153(class747.method4153(var9, 5373952), 318767104);
                            class42.field597[var35] = class747.method4153(5439488, var12);
                            class634.field9017[class392.field5459][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class514.field7179 > (var9 + 1) && class634.field9017[class392.field5459][var9 + 1][var12] != var6 && (class429.field5916[class392.field5459][var9][var12] & 0x4) == 0 && (class429.field5916[class392.field5459][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class616.field8778[var35] = class747.method4153(-1845493760, class747.method4153(5373952, var9 + 1));
                            class42.field597[var35] = class747.method4153(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class634.field9017[class392.field5459][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class514.field7179 > var9 + 1 && class634.field9017[class392.field5459][var9 + 1][var12] != var6) {
                        class616.field8778[var35] = class747.method4153(1392508928, class747.method4153(9568256, var9 + 1));
                        class42.field597[var35] = class747.method4153(9633792, var12);
                        class634.field9017[class392.field5459][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class634.field9017[class392.field5459][var9 - 1][var12] != var6 && (class429.field5916[class392.field5459][var9][var12] & 0x4) == 0 && (class429.field5916[class392.field5459][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class616.field8778[var35] = class747.method4153(301989888, class747.method4153(13762560, var9 - 1));
                            class42.field597[var35] = class747.method4153(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class634.field9017[class392.field5459][var9 - 1][var12] = var6;
                        }
                        if (class634.field9017[class392.field5459][var9][var12] != var6) {
                            class616.field8778[var35] = class747.method4153(-1828716544, class747.method4153(var9, 13762560));
                            class42.field597[var35] = class747.method4153(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class634.field9017[class392.field5459][var9][var12] = var6;
                        }
                        if (class514.field7179 > (var9 + 1) && class634.field9017[class392.field5459][var9 + 1][var12] != var6 && (class429.field5916[class392.field5459][var9][var12] & 0x4) == 0 && (class429.field5916[class392.field5459][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class616.field8778[var35] = class747.method4153(class747.method4153(var9 + 1, 9568256), -771751936);
                            class42.field597[var35] = class747.method4153(9633792, var12);
                            class634.field9017[class392.field5459][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class504.field7062[arg1] != -1000000) {
                class504.field7062[arg1] += 40;
                class5.field27[arg1] -= 512;
                class405.field5619[arg1] += 512;
                class611.field8693[arg1] += 512;
                class477.field6508[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([IIBII)V")
    public static final void method4044(int[] arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -118) {
            field10183 = -106;
        }
        arg1--;
        field10186++;
        int var11 = arg3 - 1;
        int var5 = var11 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg0[var6] = arg4;
            int var7 = var6 + 1;
            arg0[var7] = arg4;
            int var8 = var7 + 1;
            arg0[var8] = arg4;
            int var9 = var8 + 1;
            arg0[var9] = arg4;
            int var10 = var9 + 1;
            arg0[var10] = arg4;
            int var12 = var10 + 1;
            arg0[var12] = arg4;
            int var13 = var12 + 1;
            arg0[var13] = arg4;
            arg1 = var13 + 1;
            arg0[arg1] = arg4;
        }
        while (arg1 < var11) {
            arg1++;
            arg0[arg1] = arg4;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method4045(int arg0) {
        field10180 = null;
        if (arg0 != -95746376) {
            method4043(false, 55, null, -127, 97, 59);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "([BIII)I")
    public final int method4046(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field10177++;
        int var5 = this.field10182.read(arg0, arg1, arg3);
        if (arg2 > ~var5) {
            this.field10173 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method4047(byte arg0) {
        if (arg0 > -56) {
            this.field10182 = null;
        }
        field10181++;
        return this.field10185;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public final void method4048(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method4047((byte) -106);
        }
        if (this.field10182 != null) {
            this.field10182.close();
            this.field10182 = null;
        }
        field10179++;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)J")
    public final long method4049(int arg0) throws IOException {
        if (arg0 < 79) {
            return 78L;
        } else {
            field10178++;
            return this.field10182.length();
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IJ)V")
    public final void method4050(int arg0, long arg1) throws IOException {
        this.field10182.seek(arg1);
        field10171++;
        this.field10173 = arg1;
        if (arg0 != 5491) {
            this.field10182 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)Z")
    public static final boolean method4051(int arg0, byte arg1, int arg2) {
        if (arg1 != -90) {
            field10180 = null;
        }
        field10175++;
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class721(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field10182 = new RandomAccessFile(arg0, arg1);
        this.field10185 = arg0;
        this.field10173 = 0L;
        this.field10172 = arg2;
        int var5 = this.field10182.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field10182.seek(0L);
            this.field10182.write(var5);
        }
        this.field10182.seek(0L);
    }
}
