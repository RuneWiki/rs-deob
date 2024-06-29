import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class183 extends class34 {

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    private int field2725 = 0;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    private int field2727 = 1;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    private int field2726 = 0;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lub;")
    public static class301 field2721 = new class301("", 14);

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "Lhi;")
    public static class45 field2722 = new class45(30, 12);

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "Lhi;")
    public static class45 field2729 = new class45(11, 16);

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V", line = 4)
    public static void method1239(int arg0) {
        field2721 = null;
        if (arg0 != -1) {
            field2721 = null;
        }
        field2729 = null;
        field2722 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lsv;II)V", line = 16)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field2720;
        if (arg1 < 16) {
            method1240(81, (class444) null, (byte) 92, -5);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 3) {
                    this.field2727 = arg0.method1869(-70);
                }
            } else {
                this.field2726 = arg0.method1869(-109);
            }
        } else {
            this.field2725 = arg0.method1869(-122);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILat;BI)V", line = 65)
    public static final void method1240(int arg0, class444 arg1, byte arg2, int arg3) {
        class414.field5910 = arg0;
        if (arg2 != 5) {
            method1240(75, (class444) null, (byte) -42, 67);
        }
        ++field2719;
        class518.field7597 = arg1;
        class246.field3359 = arg3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIBIIIIIIII)V", line = 78)
    public static final void method1241(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field2728;
        if (class492.field7122 != null) {
            class16 var14 = null;
            if (~arg2 > -1) {
                int var15 = -arg2 + -1;
                if (class484.field6972 == var15) {
                    var14 = class81.field1158;
                } else {
                    var14 = class45.field642[var15];
                }
            } else {
                int var16 = arg2 + -1;
                class326 var17 = (class326) class281.field3826.method1592((byte) -25, (long) var16);
                if (var17 != null) {
                    var14 = var17.field4455;
                }
            }
            if (var14 != null) {
                class103 var18 = class452.field6629.method603((byte) 101, arg8);
                int var19;
                int var20;
                if (~arg3 != -2 && arg3 != 3) {
                    var19 = var18.field1695;
                    var20 = var18.field1639;
                } else {
                    var19 = var18.field1639;
                    var20 = var18.field1695;
                }
                int var21 = arg11 - -(var20 >> 1);
                int var22 = arg11 - -(var20 - -1 >> 1);
                int var23 = (var19 >> 1) + arg7;
                int var24 = (var19 + 1 >> 1) + arg7;
                class11 var25 = class492.field7122[arg13];
                int var26 = var25.method85(var21, var23) + var25.method85(var22, var23) - (-var25.method85(var21, var24) + -var25.method85(var22, var24)) >> 2;
                class316 var27 = new class316();
                var27.field4297 = class28.field417 + arg0;
                var27.field4283 = arg7;
                if (arg5 < 58) {
                    method1240(-85, (class444) null, (byte) -29, 24);
                }
                if (~arg9 > ~arg4) {
                    int var28 = arg4;
                    arg4 = arg9;
                    arg9 = var28;
                }
                var27.field4281 = class28.field417 - -arg1;
                var27.field4289 = arg8;
                var27.field4285 = arg11;
                var27.field4299 = arg6;
                var27.field4290 = arg3;
                var27.field4282 = var14.field6279;
                var27.field4296 = arg9 + arg11;
                if (arg12 > arg10) {
                    int var29 = arg12;
                    arg12 = arg10;
                    arg10 = var29;
                }
                var27.field4286 = arg11 - -arg4;
                var27.field4287 = (var27.field4285 << 7) + (var20 << 6);
                var27.field4295 = arg7 + arg10;
                var27.field4284 = var26;
                var27.field4292 = arg7 + arg12;
                var27.field4302 = (var27.field4283 << 7) - -(var19 << 6);
                class212.field3021.method3139(0, var27);
                var14.field259 = var27;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V", line = 188)
    public final void method146(byte arg0) {
        ++field2724;
        if (arg0 >= -84) {
            method1240(17, (class444) null, (byte) 17, 74);
        }
        class114.method856(4);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 287)
    public class183() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[I", line = 211)
    public final int[] method64(int arg0, byte arg1) {
        int var3 = -7 / (arg1 / 50);
        ++field2723;
        int[] var4 = super.field537.method1780(arg0, (byte) 32);
        if (super.field537.field4191) {
            int var5 = class284.field3856[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; ~var7 > ~class383.field5502; ++var7) {
                int var8 = class91.field1463[var7];
                int var9 = var8 + -2048 >> 1;
                int var10;
                if (this.field2725 == 0) {
                    var10 = (-var5 + var8) * this.field2727;
                } else {
                    int var11 = var6 * var6 + var9 * var9 >> 12;
                    int var12 = (int) (Math.sqrt((double) ((float) var11 / 4096.0F)) * 4096.0D);
                    var10 = (int) ((double) (this.field2727 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (var10 & -4096);
                if (~this.field2726 != -1) {
                    if (~this.field2726 == -3) {
                        var13 -= 2048;
                        if (var13 < 0) {
                            var13 = -var13;
                        }
                        var13 = -var13 + 2048 << 1;
                    }
                } else {
                    var13 = class38.field574[255 & var13 >> 4] - -4096 >> 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }
}
