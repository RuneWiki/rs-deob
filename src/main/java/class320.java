import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class320 extends class283 {

    @OriginalMember(owner = "client!an", name = "R", descriptor = "I")
    private int field5494 = 4096;

    @OriginalMember(owner = "client!an", name = "bb", descriptor = "Z")
    private boolean field5504 = true;

    @OriginalMember(owner = "client!an", name = "Z", descriptor = "Lna;")
    private static class26 field5502 = class69.method505("Hidden", (byte) -119);

    @OriginalMember(owner = "client!an", name = "cb", descriptor = "Lna;")
    public static class26 field5505 = field5502;

    @OriginalMember(owner = "client!an", name = "ab", descriptor = "Luf;")
    public static class22 field5503 = new class22();

    @OriginalMember(owner = "client!an", name = "db", descriptor = "S")
    public static short field5506 = 205;

    @OriginalMember(owner = "client!an", name = "eb", descriptor = "Lna;")
    public static class26 field5507 = class69.method505("Lade Schrifts-=tze )2 ", (byte) -125);

    @OriginalMember(owner = "client!an", name = "P", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!an", name = "S", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!an", name = "T", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!an", name = "U", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!an", name = "V", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!an", name = "W", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!an", name = "X", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!an", name = "Y", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "(B)V", line = 4)
    public static void method2221(byte arg0) {
        field5507 = null;
        field5505 = null;
        field5502 = null;
        if (arg0 != 119) {
            field5506 = 109;
        }
        field5503 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([BIII)Lna;", line = 21)
    public static final class26 method2222(byte[] arg0, int arg1, int arg2, int arg3) {
        field5493++;
        class26 var4 = new class26();
        var4.field418 = new byte[arg2];
        var4.field436 = 0;
        if (arg1 != -4114) {
            field5507 = (class26) null;
        }
        for (int var5 = arg3; var5 < (arg2 + arg3); var5++) {
            if (arg0[var5] != 0) {
                var4.field418[var4.field436++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 48)
    public class320() {
        super(1, false);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILwa;Z)V", line = 59)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (!arg2) {
            field5506 = -37;
        }
        field5497++;
        if (arg0 == 0) {
            this.field5494 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field5504 = arg1.method642((byte) -88) == 1;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)I", line = 94)
    public static final int method2223(byte arg0, int arg1) {
        field5499++;
        if (arg0 != 92) {
            return 122;
        }
        if (class88.field1449 != null) {
            class88.field1449.method2018(14821);
            class88.field1449 = null;
        }
        class233.field3701++;
        if (class233.field3701 > 4) {
            class215.field3348 = 0;
            class233.field3701 = 0;
            return arg1;
        }
        class215.field3348 = 0;
        if (class280.field4662 == class269.field4443) {
            class269.field4443 = class291.field4848;
        } else {
            class269.field4443 = class280.field4662;
        }
        return -1;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V", line = 139)
    public static final void method2224(int arg0, int arg1, int arg2) {
        if (class101.field1632 != arg2) {
            class13.field184 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class13.field184[var3] = (var3 << 12) / arg2;
            }
            class313.field5357 = arg2 == 64 ? 2048 : 4096;
            class236.field3783 = arg2 - 1;
            class101.field1632 = arg2;
        }
        int var4 = 111 / ((56 - arg0) / 38);
        if (class225.field3574 != arg1) {
            if (class101.field1632 == arg1) {
                class59.field955 = class13.field184;
            } else {
                class59.field955 = new int[arg1];
                for (int var5 = 0; var5 < arg1; var5++) {
                    class59.field955[var5] = (var5 << 12) / arg1;
                }
            }
            class225.field3574 = arg1;
            class210.field3268 = arg1 - 1;
        }
        field5501++;
    }

    @OriginalMember(owner = "client!an", name = "h", descriptor = "(I)Z", line = 185)
    public static final boolean method2225(int arg0) {
        if (arg0 != -15450) {
            method2226(false);
        }
        field5498++;
        try {
            return class163.method1114((byte) -83);
        } catch (IOException var5) {
            class185.method1270(false);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class26.field384 + "," + class178.field2800 + "," + class284.field4757 + " - " + class259.field4228 + "," + (class12.field157 + class13.field221.field3904[0]) + "," + (class13.field221.field3890[0] + class165.field2568) + " - ";
            for (int var4 = 0; var4 < class259.field4228 && var4 < 50; var4++) {
                var3 = var3 + class300.field5157.field1280[var4] + ",";
            }
            class302.method2124(var3, var6, (byte) 108);
            class216.method1451((byte) 46);
            return true;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 217)
    public static final void method2226(boolean arg0) {
        field5500++;
        if (!arg0) {
            method2223((byte) 120, -73);
        }
        class165.field2559.method1987(3);
        class80.field1252.method1987(3);
    }

    @OriginalMember(owner = "client!an", name = "i", descriptor = "(I)V", line = 229)
    public static final void method2227(int arg0) {
        if (arg0 > -91) {
            field5503 = (class22) null;
        }
        class153.field2390.method1987(3);
        class205.field3200.method1987(3);
        field5495++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIII)V", line = 244)
    public static final void method2228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5496++;
        int var7 = class308.method2151(class117.field1840, arg6, (byte) 0, class80.field1259);
        int var8 = class308.method2151(class117.field1840, arg0, (byte) 0, class80.field1259);
        int var9 = class308.method2151(class27.field454, arg3, (byte) 0, class225.field3572);
        int var10 = class308.method2151(class27.field454, arg2, (byte) 0, class225.field3572);
        if (arg4 != 1) {
            method2227(-1);
        }
        int var11 = class308.method2151(class117.field1840, arg1 + arg6, (byte) 0, class80.field1259);
        int var12 = class308.method2151(class117.field1840, arg0 - arg1, (byte) 0, class80.field1259);
        for (int var13 = var7; var13 < var11; var13++) {
            class76.method543(class45.field710[var13], var9, 127, var10, arg5);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class76.method543(class45.field710[var14], var9, -76, var10, arg5);
        }
        int var15 = class308.method2151(class27.field454, arg1 + arg3, (byte) 0, class225.field3572);
        int var16 = class308.method2151(class27.field454, arg2 - arg1, (byte) 0, class225.field3572);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class45.field710[var17];
            class76.method543(var18, var9, -59, var15, arg5);
            class76.method543(var18, var16, arg4 - 97, var10, arg5);
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(II)[[I", line = 297)
    public final int[][] method3(int arg0, int arg1) {
        field5492++;
        int[][] var3 = this.field4719.method2182((byte) 58, arg1);
        if (this.field4719.field5381) {
            int[] var4 = this.method1990(0, class210.field3268 & arg1 - 1, 32755);
            int[] var5 = this.method1990(0, arg1, 32755);
            int[] var6 = this.method1990(0, arg1 + 1 & class210.field3268, 32755);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class101.field1632; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field5494;
                int var12 = (var5[var10 + 1 & class236.field3783] - var5[class236.field3783 & var10 - 1]) * this.field5494;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var20 = var11 / var17;
                    var19 = var12 / var17;
                }
                if (this.field5504) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        if (arg0 != -1) {
            method2224(-55, -63, -5);
        }
        return var3;
    }
}
