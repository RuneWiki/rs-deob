import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class44 {

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "Z")
    public boolean field609 = true;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    private int field614 = -1;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Lfc;")
    private class575 field610;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Lrb;")
    private class233 field622;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Lui;")
    private class498 field621;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Lqaa;")
    private class309 field615;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field612 = 1;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "[I")
    public static int[] field624 = new int[13];

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "[I")
    public static int[] field625 = new int[1];

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field626 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "F")
    public static float field617;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static void method414(byte arg0) {
        if (arg0 != -79) {
            method414((byte) 48);
        }
        field625 = null;
        field624 = null;
        field626 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    private final void method415(int arg0) {
        field623++;
        if (!this.field609) {
            return;
        }
        this.field609 = false;
        byte[] var2 = this.field622.field3127;
        int var3 = arg0;
        int var4 = this.field622.field3121;
        int var5 = this.field622.field3121 * this.field613 + this.field619;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field615 != null && this.field614 == var3) {
            this.field609 = false;
            return;
        }
        this.field614 = var3;
        int var7 = this.field613 * var4 + this.field619;
        int var8 = 0;
        if (!this.field610.method222(class228.field3042, (byte) 124, class6.field48)) {
            if (class94.field1243 == null) {
                class94.field1243 = new int[16384];
            }
            int[] var13 = class94.field1243;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var7 + var4] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field622.field3121 - 128;
            }
            if (this.field615 == null) {
                this.field615 = this.field610.method3078(class94.field1243, 128, 66, 128, false);
                this.field615.method1133(false, false, arg0 + 19263);
            } else {
                this.field615.method1132(class94.field1243, 0, (byte) 75, 128, 128, 0, 0, 128);
            }
            return;
        }
        if (class7.field55 == null) {
            class7.field55 = new byte[16384];
        }
        byte[] var9 = class7.field55;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var7] == 0) {
                    int var12 = 0;
                    if (var2[var7 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field622.field3121 - 128;
        }
        if (this.field615 == null) {
            this.field615 = this.field610.method3139(128, class7.field55, (byte) 33, false, 128, class228.field3042);
            this.field615.method1133(false, false, arg0 ^ 0x4B3F);
        } else {
            this.field615.method1129(128, class228.field3042, 128, class7.field55, 0, arg0 ^ 0x6F4, 0, 128, 0);
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lfc;Lrb;Los;IIIII)V")
    public class44(class575 arg0, class233 arg1, class247 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field610 = arg0;
        this.field622 = arg1;
        this.field619 = arg6;
        this.field613 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field1166 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field3330[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field615 = null;
            this.field620 = 0;
        } else {
            this.field611 = Integer.MAX_VALUE;
            this.field616 = Integer.MIN_VALUE;
            this.field621 = this.field610.method186(false, true);
            this.field621.method2429(var10, (byte) -116);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field621.method647(false, true);
                if (var15 != null) {
                    Stream var16 = this.field610.method3087(var15, 6);
                    if (Stream.method1964()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field1166 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field3330[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field611) {
                                            this.field611 = var22;
                                        }
                                        if (var22 > this.field616) {
                                            this.field616 = var22;
                                        }
                                        var16.method1961(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field1166 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field3330[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field616 < var28) {
                                            this.field616 = var28;
                                        }
                                        if (this.field611 > var28) {
                                            this.field611 = var28;
                                        }
                                        var16.method1959(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method1955();
                    if (this.field621.method646(-117)) {
                        break;
                    }
                }
            }
            this.field620 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZLui;)V")
    public final void method416(int arg0, boolean arg1, class498 arg2) {
        if (arg1) {
            method418(42, -92, 13);
        }
        field607++;
        if (arg0 > 0) {
            this.method415(0);
            this.field610.method3091(true, this.field615);
            this.field610.method164(this.field611, class527.field6860, -123, 0, arg0, this.field616 + 1 - this.field611, arg2);
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public final void method417(int arg0) {
        this.method416(this.field620, false, this.field621);
        if (arg0 != -128) {
            method414((byte) -86);
        }
        field608++;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
    public static final void method418(int arg0, int arg1, int arg2) {
        field618++;
        if (class561.field7319 != arg1) {
            class183.field2359 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class183.field2359[var3] = (var3 << 12) / arg1;
            }
            class561.field7319 = arg1;
            class701.field9798 = arg1 * 32;
            class337.field4356 = arg1 - 1;
        }
        if (class505.field6643 != arg0) {
            if (class561.field7319 == arg0) {
                class221.field2895 = class183.field2359;
            } else {
                class221.field2895 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class221.field2895[var4] = (var4 << 12) / arg0;
                }
            }
            class95.field1247 = arg0 - 1;
            class505.field6643 = arg0;
        }
        if (arg2 != -1) {
            method418(84, 3, -12);
        }
    }
}
