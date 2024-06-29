import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class78 extends class288 {

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    private int field1068 = 585;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Z")
    public static boolean field1069 = false;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1070 = "purple:";

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "J")
    public static volatile long field1075 = 0L;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1074 = "Connected to update server";

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "Lgg;")
    public static class61 field1067 = new class61(32);

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field1065;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = class1.field15[arg1];
            for (int var5 = 0; var5 < class186.field2986; ++var5) {
                int var6 = class246.field3958[var5];
                if (~this.field1068 > ~var6 && ~var6 > ~(4096 - this.field1068) && var4 > -this.field1068 + 2048 && this.field1068 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1068 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(-this.field1068 + 2048) && ~var6 > ~(this.field1068 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field1068;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1068 + 2048);
                } else if (this.field1068 <= var4 && 4096 - this.field1068 >= var4) {
                    if (~var6 <= ~this.field1068 && ~(-this.field1068 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1068 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field1068;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1068 + 2048);
                }
            }
        }
        if (arg0 != 0) {
            method586(-9);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
    public static final void method584(byte arg0, int arg1) {
        if (arg0 != -86) {
            field1067 = null;
        }
        for (class69 var2 = class28.field326.method465((byte) -121); var2 != null; var2 = class28.field326.method461((byte) -13)) {
            if (~((long) arg1) == ~(65535L & var2.field962 >> 48)) {
                var2.method544(arg0 + 71);
            }
        }
        ++field1072;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 == -19) {
            ++field1066;
            if (arg2 == 0) {
                this.field1068 = arg0.method1777(-102);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
    public static final void method585(int arg0) {
        if (class226.field3580 != null) {
            class226.field3580.method742(-1738);
        }
        if (arg0 <= 38) {
            method587((class49) null, -111);
        }
        if (class147.field2361 != null) {
            class147.field2361.method742(-1738);
        }
        ++field1076;
        class23.method155(22050, class195.field3161, 2, (byte) 85);
        class226.field3580 = class260.method1707(22050, 9939, class250.field4006, 0, class38.field458);
        class226.field3580.method736(class29.field346, 104);
        class147.field2361 = class260.method1707(2048, 9939, class250.field4006, 1, class38.field458);
        class147.field2361.method736(class215.field3464, 115);
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1067 = null;
        if (arg0 != 3) {
            field1067 = null;
        }
        field1070 = null;
        field1074 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lil;I)V")
    public static final void method587(class49 arg0, int arg1) {
        ++field1071;
        int var2 = -class9.field141 + arg0.field700;
        int var3 = arg0.field652 * 128 - -(arg0.method385((byte) 108) * 64);
        int var4 = arg0.field629 * 128 + 64 * arg0.method385((byte) -110);
        arg0.field683 = 0;
        arg0.field614 += (-arg0.field614 + var3) / var2;
        if (arg0.field650 == 0) {
            arg0.field691 = 1024;
        }
        arg0.field613 += (-arg0.field613 + var4) / var2;
        if (~arg0.field650 == -2) {
            arg0.field691 = 1536;
        }
        if (~arg0.field650 == -3) {
            arg0.field691 = 0;
        }
        if (~arg0.field650 == -4) {
            arg0.field691 = 512;
        }
        if (arg1 != 18260) {
            field1070 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
    public static final void method588(byte arg0) {
        ++field1073;
        class166.field2709.method1234(8);
        int var1 = class166.field2709.method1239(-51, 1);
        if (var1 != 0) {
            int var2 = class166.field2709.method1239(-71, 2);
            if (var2 == 0) {
                class28.field335[class61.field834++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class166.field2709.method1239(-102, 3);
                class197.field3179.method380(1, -48, var3);
                int var4 = class166.field2709.method1239(103, 1);
                if (~var4 == -2) {
                    class28.field335[class61.field834++] = 2047;
                }
            } else if (~var2 == -3) {
                if (~class166.field2709.method1239(119, 1) == -2) {
                    int var5 = class166.field2709.method1239(-36, 3);
                    class197.field3179.method380(2, -81, var5);
                    int var6 = class166.field2709.method1239(94, 3);
                    class197.field3179.method380(2, -22, var6);
                } else {
                    int var7 = class166.field2709.method1239(-9, 3);
                    class197.field3179.method380(0, -42, var7);
                }
                int var8 = class166.field2709.method1239(98, 1);
                if (var8 == 1) {
                    class28.field335[class61.field834++] = 2047;
                }
            } else if (var2 == 3) {
                int var9 = class166.field2709.method1239(103, 1);
                if (~var9 == -2) {
                    class28.field335[class61.field834++] = 2047;
                }
                int var10 = class166.field2709.method1239(-66, 7);
                int var11 = class166.field2709.method1239(95, 7);
                int var12 = class166.field2709.method1239(127, 1);
                class28.field336 = class166.field2709.method1239(106, 2);
                class197.field3179.method1551(var11, var12 == 1, false, var10);
            } else if (arg0 <= 126) {
                field1064 = 64;
            }
        }
    }
}
