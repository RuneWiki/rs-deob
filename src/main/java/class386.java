import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class386 extends class404 {

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    private int field5598 = 3216;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "[I")
    private int[] field5599 = new int[3];

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    private int field5601 = 3216;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    private int field5602 = 4096;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field5594 = 0;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "[I")
    public static int[] field5595 = new int[13];

    @OriginalMember(owner = "client!im", name = "O", descriptor = "[F")
    public static float[] field5608;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "Lwl;")
    public static class270 field5607;

    static {
        new class423("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field5608 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 3)
    public static void method2300(byte arg0) {
        field5607 = null;
        field5595 = null;
        field5608 = null;
        if (arg0 < 95) {
            field5594 = -17;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Loa;ZZLoa;IZI)I", line = 16)
    public static final int method2301(class471 arg0, boolean arg1, boolean arg2, class471 arg3, int arg4, boolean arg5, int arg6) {
        ++field5605;
        int var7 = class147.method962(arg0, arg5, (byte) 109, arg6, arg3);
        if (arg2) {
            method2301((class471) null, true, false, (class471) null, -105, false, -46);
        }
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class147.method962(arg0, arg1, (byte) 117, arg4, arg3);
            return !arg1 ? var8 : -var8;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lqq;I)V", line = 48)
    public static final void method2302(class318 arg0, int arg1) {
        ++field5604;
        int var2 = class170.field2647;
        int var3 = class120.field2001;
        int var4 = class218.field3358;
        int var5 = class481.field7344;
        int var6 = -10660793;
        arg0.method1943(var2, var6, var3, var5, 1, var4);
        arg0.method1943(var2 + 1, -16777216, var3 + 1, 16, 1, var4 + -2);
        arg0.method1920(var4 + -2, -16777216, var2 + 1, var5 + -19, arg1 ^ -22440, var3 + 18);
        class493.field7514.method2938(var6, var3 + 14, var2 + 3, 32768, class14.field152.method2473(class406.field5898, -124), -1);
        int var7 = class251.field3835.method1686(25478);
        int var8 = class251.field3835.method1690(8);
        int var9 = 0;
        if (arg1 != -3) {
            method2302((class318) null, 90);
        }
        for (class2 var10 = (class2) class329.field4932.method8((byte) -98); var10 != null; var10 = (class2) class329.field4932.method17((byte) 91)) {
            int var11 = (-var9 + -1 + class330.field4948) * 16 + var3 + 31;
            short var12 = -1;
            if (~var2 > ~var7 && var7 < var2 - -var4 && ~var8 < ~(var11 + -13) && var11 + 3 > var8 && var10.field13) {
                var12 = -256;
            }
            int[] var13 = null;
            if (!class395.method2344(-14262, var10.field17)) {
                if (var10.field19 == -1) {
                    if (!class448.method2681(23208, var10.field17)) {
                        if (class34.method200(var10.field17, -75)) {
                            Object var14 = null;
                            class56 var15;
                            if (var10.field17 != 1009) {
                                var15 = class128.field2070.method916((byte) -15, (int) (var10.field12 >>> 32 & 2147483647L));
                            } else {
                                var15 = class128.field2070.method916((byte) -15, (int) var10.field12);
                            }
                            if (var15.field892 != null) {
                                var15 = var15.method393(class273.field4144, (byte) -128);
                            }
                            if (var15 != null) {
                                var13 = var15.field879;
                            }
                        }
                    } else {
                        class249 var16 = class195.field3085[(int) var10.field12];
                        if (var16 != null) {
                            class245 var17 = var16.field3819;
                            if (var17.field3703 != null) {
                                var17 = var17.method1477(class273.field4144, -12819);
                            }
                            if (var17 != null) {
                                var13 = var17.field3744;
                            }
                        }
                    }
                } else {
                    var13 = class288.field4362.method3030((byte) 112, var10.field19).field2836;
                }
            } else {
                var13 = class288.field4362.method3030((byte) 65, (int) var10.field12).field2836;
            }
            String var18 = class442.method2635((byte) 92, var10);
            if (var13 != null) {
                var18 = var18 + class99.method746(var13, (byte) 53);
            }
            class493.field7514.method2943(true, var12, class302.field4562, class156.field2452, var2 - -3, var11, var18, 0);
            if (var10.field18) {
                class330.field4946.method994(5 + (var2 - -class512.field7764.method2349(var18, 0)), var11 + -12);
            }
            ++var9;
        }
        class177.method1110(class481.field7344, class170.field2647, class120.field2001, class218.field3358, 0);
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V", line = 155)
    public final void method211(int arg0) {
        if (arg0 == -3) {
            ++field5597;
            this.method2303((byte) -117);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 168)
    public class386() {
        super(1, true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I", line = 201)
    public final int[] method90(int arg0, int arg1) {
        ++field5600;
        if (arg0 >= -47) {
            return null;
        } else {
            int[] var3 = super.field5870.method372(arg1, (byte) -113);
            if (super.field5870.field810) {
                int var4 = class282.field4274 * this.field5602 >> 12;
                int[] var5 = this.method2394(0, (byte) 64, class435.field6374 & arg1 + -1);
                int[] var6 = this.method2394(0, (byte) 64, arg1);
                int[] var7 = this.method2394(0, (byte) 64, arg1 - -1 & class435.field6374);
                for (int var8 = 0; ~class431.field6348 < ~var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 - 1 & class98.field1757] + -var6[var8 + 1 & class98.field1757]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class226.field3464[var11 - -((var12 - -1) * var12 >> 1)] & 255;
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field5599[1] * var16 >> 12;
                    int var18 = this.field5599[0] * var15 >> 12;
                    int var19 = this.field5599[2] * var14 >> 12;
                    var3[var8] = var18 - -var17 - -var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILha;I)V", line = 272)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            field5595 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field5598 = arg1.method254((byte) -43);
                }
            } else {
                this.field5601 = arg1.method254((byte) -99);
            }
        } else {
            this.field5602 = arg1.method254((byte) -43);
        }
        ++field5596;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 316)
    private final void method2303(byte arg0) {
        ++field5606;
        double var2 = Math.cos((double) ((float) this.field5598 / 4096.0F));
        this.field5599[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field5601 / 4096.0F)));
        this.field5599[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field5601 / 4096.0F)));
        this.field5599[2] = (int) (4096.0D * Math.sin((double) ((float) this.field5598 / 4096.0F)));
        if (arg0 > -35) {
            field5595 = null;
        }
        int var4 = this.field5599[0] * this.field5599[0] >> 12;
        int var5 = this.field5599[1] * this.field5599[1] >> 12;
        int var6 = this.field5599[2] * this.field5599[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field5599[1] = (this.field5599[1] << 12) / var7;
            this.field5599[2] = (this.field5599[2] << 12) / var7;
            this.field5599[0] = (this.field5599[0] << 12) / var7;
        }
    }
}
