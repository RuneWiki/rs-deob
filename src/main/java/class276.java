import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class276 extends class27 {

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    private int field4182 = 1;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "[S")
    private short[] field4179 = new short[512];

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    private int field4186 = 5;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    private int field4192 = 0;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    private int field4181 = 5;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "[B")
    private byte[] field4191 = new byte[512];

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    private int field4180 = 2;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    private int field4189 = 2048;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field4184 = 0;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "[Lvb;")
    public static class188[] field4188 = new class188[50];

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "Z")
    public static boolean field4187 = false;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4185 = "cyan:";

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    public static int field4193 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILsb;I)V", line = 7)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field4177++;
        if (arg0 != -5836) {
            return;
        }
        if (arg2 == 0) {
            this.field4181 = this.field4186 = arg1.method1319(255);
        } else if (arg2 == 1) {
            this.field4192 = arg1.method1319(255);
        } else if (arg2 == 2) {
            this.field4189 = arg1.method1317((byte) 46);
        } else if (arg2 == 3) {
            this.field4180 = arg1.method1319(255);
        } else if (arg2 == 4) {
            this.field4182 = arg1.method1319(255);
        } else if (arg2 == 5) {
            this.field4181 = arg1.method1319(255);
        } else if (arg2 == 6) {
            this.field4186 = arg1.method1319(255);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[I", line = 89)
    public final int[] method18(int arg0, byte arg1) {
        field4175++;
        int[] var3 = this.field375.method2087(arg1 - 51, arg0);
        if (this.field375.field4382) {
            int var4 = (class215.field3175[arg0] * this.field4186) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class209.field3053; var7++) {
                class121.field1712 = Integer.MAX_VALUE;
                class236.field3539 = Integer.MAX_VALUE;
                class177.field2550 = Integer.MAX_VALUE;
                class103.field1479 = Integer.MAX_VALUE;
                int var8 = class251.field3721[var7] * this.field4181 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field4191[(this.field4186 <= var11 ? var11 - this.field4186 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field4191[var12 + (this.field4181 > var13 ? var13 : var13 - this.field4181) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field4179[var14] - (var13 << 12);
                        int var16 = var4 - ((var11 << 12) + this.field4179[var27]);
                        int var17 = this.field4182;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var19 = var15 < 0 ? -var15 : var15;
                            int var20 = var16 < 0 ? -var16 : var16;
                            var18 = var20 < var19 ? var19 : var20;
                        } else if (var17 == 4) {
                            int var23 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var25 = var23 + var24;
                            var18 = var25 * var25 >> 12;
                        } else if (var17 == 5) {
                            int var21 = var15 * var15;
                            int var22 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 < 0 ? -var16 : var16) + (var15 < 0 ? -var15 : var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class103.field1479 > var18) {
                            class121.field1712 = class236.field3539;
                            class236.field3539 = class177.field2550;
                            class177.field2550 = class103.field1479;
                            class103.field1479 = var18;
                        } else if (var18 < class177.field2550) {
                            class121.field1712 = class236.field3539;
                            class236.field3539 = class177.field2550;
                            class177.field2550 = var18;
                        } else if (var18 < class236.field3539) {
                            class121.field1712 = class236.field3539;
                            class236.field3539 = var18;
                        } else if (var18 < class121.field1712) {
                            class121.field1712 = var18;
                        }
                    }
                }
                int var26 = this.field4180;
                if (var26 == 0) {
                    var3[var7] = class103.field1479;
                } else if (var26 == 1) {
                    var3[var7] = class177.field2550;
                } else if (var26 == 3) {
                    var3[var7] = class236.field3539;
                } else if (var26 == 4) {
                    var3[var7] = class121.field1712;
                } else if (var26 == 2) {
                    var3[var7] = class177.field2550 - class103.field1479;
                }
            }
        }
        if (arg1 != -62) {
            this.field4191 = (byte[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)V", line = 298)
    private final void method2014(int arg0) {
        field4176++;
        Random var2 = new Random((long) this.field4192);
        this.field4179 = new short[512];
        if (this.field4189 > arg0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4179[var3] = (short) class127.method943((byte) -79, var2, this.field4189);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 325)
    public class276() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)V", line = 333)
    public static void method2015(int arg0) {
        field4188 = null;
        field4185 = null;
        if (arg0 != 2048) {
            field4187 = false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V", line = 350)
    public final void method22(int arg0) {
        if (arg0 > -63) {
            this.method23(106, (class190) null, 103);
        }
        field4194++;
        this.field4191 = class96.method753((byte) -24, this.field4192);
        this.method2014(0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;", line = 369)
    public static final String method2016(int arg0, int arg1, String[] arg2, int arg3) {
        field4178++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var11 = arg2[arg3];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = 0;
            int var5 = arg1 + arg3;
            int var6 = arg3;
            if (arg0 != 14651) {
                field4187 = false;
            }
            while (var5 > var6) {
                String var7 = arg2[var6];
                if (var7 == null) {
                    var4 += 4;
                } else {
                    var4 += var7.length();
                }
                var6++;
            }
            StringBuffer var8 = new StringBuffer(var4);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILid;)Z", line = 435)
    public static final boolean method2017(int arg0, class200 arg1) {
        field4190++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2906) {
            return false;
        } else if (!arg1.method1455(107)) {
            return false;
        } else if (class33.field477.method1405((long) arg1.field2921, false) != null) {
            return false;
        } else if (arg0 == -6) {
            return class278.field4227.method1405((long) arg1.field2915, false) == null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZBI[Lqf;)V", line = 465)
    public static final void method2018(int arg0, int arg1, boolean arg2, byte arg3, int arg4, class359[] arg5) {
        field4183++;
        if (arg3 != -35) {
            field4188 = (class188[]) null;
        }
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class359 var7 = arg5[var6];
            if (var7 != null && var7.field5638 == arg1) {
                class251.method1842(arg0, arg2, -49, arg4, var7);
                class358.method2483(false, arg4, var7, arg0);
                if (var7.field5642 - var7.field5506 < var7.field5496) {
                    var7.field5496 = var7.field5642 - var7.field5506;
                }
                if (var7.field5496 < 0) {
                    var7.field5496 = 0;
                }
                if (var7.field5641 > (var7.field5580 - var7.field5560)) {
                    var7.field5641 = var7.field5580 - var7.field5560;
                }
                if (var7.field5641 < 0) {
                    var7.field5641 = 0;
                }
                if (var7.field5554 == 0) {
                    class143.method1031(arg2, var7, -1);
                }
            }
        }
    }
}
