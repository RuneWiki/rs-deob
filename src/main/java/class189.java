import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class189 extends class183 {

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    private int field3288 = 4096;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    private int field3293 = 2000;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    private int field3297 = 0;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
    private int field3300 = 16;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    private int field3294 = 0;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "Lpc;")
    public static class91 field3290 = new class91(128);

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
    public static int field3302 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "I")
    public static int field3304 = -1;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "Lek;")
    public static class185 field3291;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(III)Lnf;", line = 8)
    public static final class67 method1305(int arg0, int arg1, int arg2) {
        field3289++;
        class67 var3 = class96.method662(arg2, true);
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg1 != 2048) {
                field3304 = -94;
            }
            return var3 == null || var3.field1243 == null || arg0 >= var3.field1243.length ? null : var3.field1243[arg0];
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 29)
    public final void method25(int arg0) {
        if (arg0 != -8) {
            this.method25(54);
        }
        class298.method2055((byte) 103);
        field3298++;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 43)
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBLjf;)V", line = 55)
    public static final void method1306(int arg0, byte arg1, class229 arg2) {
        field3299++;
        if (arg1 != -122) {
            return;
        }
        class229 var3 = arg2.method1631(56).method1606((byte) 116);
        boolean var4 = false;
        for (int var5 = 0; var5 < class132.field2323; var5++) {
            class33 var6 = class192.field3334[class90.field1652[var5]];
            if (var6 != null && var6.field621 != null && var6.field621.method1653(var3, false)) {
                class329.method2247(2, false, 1, var6.field2018[0], 0, (byte) 83, 0, class301.field5124.field2018[0], 0, 1, var6.field2017[0], class301.field5124.field2017[0]);
                var4 = true;
                if (arg0 == 1) {
                    class96.field1699++;
                    class84.field1608.method1397(166, 0);
                    class84.field1608.method106(class90.field1652[var5], (byte) -97);
                } else if (arg0 == 4) {
                    class84.field1608.method1397(46, 0);
                    class84.field1608.method125(arg1 - 25247, class90.field1652[var5]);
                    class261.field4538++;
                } else if (arg0 == 5) {
                    class84.field1608.method1397(169, 0);
                    class52.field917++;
                    class84.field1608.method125(arg1 ^ 0x6361, class90.field1652[var5]);
                } else if (arg0 == 6) {
                    class84.field1608.method1397(76, 0);
                    class42.field745++;
                    class84.field1608.method144(class90.field1652[var5], 0);
                } else if (arg0 == 7) {
                    class84.field1608.method1397(216, 0);
                    class84.field1608.method144(class90.field1652[var5], 0);
                    class22.field372++;
                }
                break;
            }
        }
        if (!var4) {
            class28.method245((byte) -75, 0, class331.field5638, class142.method989(new class229[] { class288.field4925, var3 }, -49));
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)[I", line = 139)
    public final int[] method10(int arg0, int arg1) {
        field3296++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int var4 = this.field3288 >> 1;
            int[][] var5 = this.field3161.method666(23123);
            Random var6 = new Random((long) this.field3294);
            for (int var7 = 0; var7 < this.field3293; var7++) {
                int var8 = this.field3288 > 0 ? this.field3297 + class50.method413(this.field3288, false, var6) - var4 : this.field3297;
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class50.method413(class22.field393, false, var6);
                int var11 = class50.method413(class144.field2508, false, var6);
                int var12 = (class281.field4824[var9] * this.field3300 >> 12) + var10;
                int var13 = (class168.field2877[var9] * this.field3300 >> 12) + var11;
                int var14 = var12 - var10;
                int var15 = var13 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 > var14;
                    if (var16) {
                        int var17 = var12;
                        int var18 = var10;
                        var10 = var11;
                        var11 = var18;
                        var12 = var13;
                        var13 = var17;
                    }
                    if (var10 > var12) {
                        int var19 = var11;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                        var11 = var13;
                        var13 = var19;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = var13 <= var11 ? -1 : 1;
                    int var27 = 1024 - (class50.method413(4096, false, var6) >> 2);
                    for (int var28 = var10; var28 < var12; var28++) {
                        int var29 = (var28 - var10) * var25 + var27 + 1024;
                        int var30 = var28 & class52.field913;
                        var24 += var23;
                        int var31 = var21 & class252.field4405;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var26;
                        }
                    }
                }
            }
        }
        return arg1 == -1 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V", line = 274)
    public static void method1307(int arg0) {
        field3291 = null;
        if (arg0 != -30705) {
            field3292 = 44;
        }
        field3290 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILkh;I)V", line = 305)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3294 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field3293 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field3300 = arg1.method93(false);
        } else if (arg2 == 3) {
            this.field3297 = arg1.method116(-1);
        } else if (arg2 == 4) {
            this.field3288 = arg1.method116(-1);
        }
        if (arg0 > -43) {
            field3292 = -30;
        }
        field3295++;
    }
}
