import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class504 {

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public int field7336 = -1;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field7321 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field7332 = 0;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "[Lvo;")
    public static class131[] field7337 = new class131[14];

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Llc;")
    public static class435 field7325 = new class435(21, 6);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public int field7322;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public int field7323;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public int field7324;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public int field7327;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public int field7328;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public int field7333;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public int field7334;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public int field7335;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "[I")
    public static int[] field7330;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method3082(int arg0, float[] arg1, int arg2) {
        field7326++;
        float[] var3 = new float[arg2];
        class85.method679(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method3083(int arg0) {
        field7337 = null;
        if (arg0 != -4) {
            field7330 = null;
        }
        field7325 = null;
        field7321 = null;
        field7330 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BILjc;)V")
    public static final void method3084(byte arg0, int arg1, class168 arg2) {
        field7329++;
        boolean var3 = arg2.method1206(1, (byte) -90) == 1;
        if (var3) {
            class750.field10452[class609.field8692++] = arg1;
        }
        int var4 = arg2.method1206(2, (byte) -90);
        class639 var5 = class536.field7796[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field9065 = false;
            } else if (class652.field9348 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class374 var6 = class139.field1905[arg1] = new class374();
                var6.field5417 = (var5.field4645[0] + class71.field1085 >> 6) + ((var5.field3920 << 28) + (var5.field4646[0] + class41.field693 >> 6 << 14));
                if (var5.field9075 == -1) {
                    var6.field5413 = var5.field4598.method2110(true);
                } else {
                    var6.field5413 = var5.field9075;
                }
                var6.field5414 = var5.field4576;
                var6.field5418 = var5.field9050;
                if (var5.field9077 > 0) {
                    class435.method2669(var5, false);
                }
                class536.field7796[arg1] = null;
                if (arg2.method1206(1, (byte) -90) != 0) {
                    class587.method3456(arg2, arg1, 3);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1206(3, (byte) -90);
            int var8 = var5.field4646[0];
            int var9 = var5.field4645[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field9094 = var8;
                var5.field9065 = true;
                var5.field9071 = var9;
            } else {
                var5.method3693(var8, var9, (byte) 92, class710.field10011[arg1]);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1206(4, (byte) -90);
            int var11 = var5.field4646[0];
            int var12 = var5.field4645[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field9065 = true;
                var5.field9094 = var11;
                var5.field9071 = var12;
            } else {
                var5.method3693(var11, var12, (byte) -96, class710.field10011[arg1]);
            }
        } else {
            int var13 = arg2.method1206(1, (byte) -90);
            if (var13 == 0) {
                int var14 = arg2.method1206(12, (byte) -90);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3FB) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field4646[0] + var16;
                int var19 = var5.field4645[0] + var17;
                if (var3) {
                    var5.field9071 = var19;
                    var5.field9094 = var18;
                    var5.field9065 = true;
                } else {
                    var5.method3693(var18, var19, (byte) -32, class710.field10011[arg1]);
                }
                var5.field3920 = var5.field3924 = (byte) (var5.field3920 + var15 & 0x3);
                if (class547.method3292((byte) -88, var19, var18)) {
                    var5.field3924++;
                }
                if (class652.field9348 == arg1) {
                    if (class687.field9758 != var5.field3920) {
                        class235.field3518 = true;
                    }
                    class687.field9758 = var5.field3920;
                }
            } else {
                int var20 = arg2.method1206(30, (byte) -90);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFC0DF) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class41.field693 + var22 + var5.field4646[0] & 0x3FFF) - class41.field693;
                int var25 = (class71.field1085 + var23 + var5.field4645[0] & 0x3FFF) - class71.field1085;
                if (var3) {
                    var5.field9094 = var24;
                    var5.field9065 = true;
                    var5.field9071 = var25;
                } else {
                    var5.method3693(var24, var25, (byte) -32, class710.field10011[arg1]);
                }
                var5.field3920 = var5.field3924 = (byte) (var5.field3920 + var21 & 0x3);
                if (class547.method3292((byte) -108, var25, var24)) {
                    var5.field3924++;
                }
                if (class652.field9348 == arg1) {
                    class687.field9758 = var5.field3920;
                }
                int var26 = 14 % ((-arg0 - 31) / 40);
            }
        }
    }
}
