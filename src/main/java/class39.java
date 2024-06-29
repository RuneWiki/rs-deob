import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class39 extends class177 {

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    private int field586 = 4096;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
    private boolean field594 = true;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "[I")
    public static int[] field584 = new int[2];

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field591 = 1;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V", line = 5)
    public static void method354(boolean arg0) {
        field584 = null;
        if (arg0) {
            method356(31, (char) 65414);
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V", line = 20)
    public static final void method355(byte arg0) {
        field590++;
        if (class81.field1137 == 0) {
            return;
        }
        try {
            if ((++class203.field3231) > 1500) {
                if (class297.field4661 != null) {
                    class297.field4661.method916(arg0 - 25159);
                    class297.field4661 = null;
                }
                if (class261.field3872 >= 1) {
                    class311.field4847 = -5;
                    class81.field1137 = 0;
                    return;
                }
                class261.field3872++;
                class203.field3231 = 0;
                if (class93.field1341 == class31.field398) {
                    class31.field398 = class294.field4627;
                } else {
                    class31.field398 = class93.field1341;
                }
                class81.field1137 = 1;
            }
            if (arg0 != -65) {
                field584 = (int[]) null;
            }
            if (class81.field1137 == 1) {
                class183.field2747 = class301.field4715.method162(class31.field398, (byte) -96, class193.field3088);
                class81.field1137 = 2;
            }
            if (class81.field1137 == 2) {
                if (class183.field2747.field3585 == 2) {
                    throw new IOException();
                }
                if (class183.field2747.field3585 != 1) {
                    return;
                }
                class297.field4661 = new class118((Socket) class183.field2747.field3590, class301.field4715);
                class183.field2747 = null;
                class297.field4661.method920((byte) -76, class159.field2372.field437, 0, class159.field2372.field455);
                if (class256.field3818 != null) {
                    class256.field3818.method1858((byte) 48);
                }
                if (class261.field3861 != null) {
                    class261.field3861.method1858((byte) 27);
                }
                int var1 = class297.field4661.method918(0);
                if (class256.field3818 != null) {
                    class256.field3818.method1858((byte) 40);
                }
                if (class261.field3861 != null) {
                    class261.field3861.method1858((byte) 92);
                }
                if (var1 != 101) {
                    class81.field1137 = 0;
                    class311.field4847 = var1;
                    class297.field4661.method916(arg0 ^ 0x62C7);
                    class297.field4661 = null;
                    return;
                }
                class81.field1137 = 3;
            }
            if (class81.field1137 == 3) {
                if (class297.field4661.method915(arg0 + 65) >= 2) {
                    int var2 = class297.field4661.method918(0) << 8 | class297.field4661.method918(0);
                    class305.method2127(false, var2);
                    if (class73.field1051 != -1) {
                        class81.field1137 = 0;
                        class297.field4661.method916(-25224);
                        class297.field4661 = null;
                        class126.method955(-74);
                        return;
                    }
                    class311.field4847 = 6;
                    class81.field1137 = 0;
                    class297.field4661.method916(arg0 - 25159);
                    class297.field4661 = null;
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class297.field4661 != null) {
                class297.field4661.method916(-25224);
                class297.field4661 = null;
            }
            if (class261.field3872 < 1) {
                if (class93.field1341 == class31.field398) {
                    class31.field398 = class294.field4627;
                } else {
                    class31.field398 = class93.field1341;
                }
                class81.field1137 = 1;
                class261.field3872++;
                class203.field3231 = 0;
            } else {
                class81.field1137 = 0;
                class311.field4847 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 435)
    public class39() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lhb;II)V", line = 185)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            return;
        }
        field592++;
        if (arg2 == 0) {
            this.field586 = arg0.method300(-1394191632);
        } else if (arg2 == 1) {
            this.field594 = arg0.method273(65280) == 1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[[I", line = 221)
    public final int[][] method99(int arg0, int arg1) {
        field587++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (arg1 != -23387) {
            field593 = -39;
        }
        if (this.field2645.field3203) {
            int[] var4 = this.method1280(arg0 - 1 & class11.field120, 0, false);
            int[] var5 = this.method1280(arg0, 0, false);
            int[] var6 = this.method1280(arg0 + 1 & class11.field120, 0, false);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class287.field4415; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field586;
                int var12 = (var5[class133.field2090 & var10 + 1] - var5[class133.field2090 & var10 - 1]) * this.field586;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
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
                    var18 = var12 / var17;
                    var20 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field594) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IC)B", line = 308)
    public static final byte method356(int arg0, char arg1) {
        field585++;
        byte var2;
        if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(arg1, 16) + " provided");
        }
        return arg0 == 1 ? var2 : 52;
    }
}
