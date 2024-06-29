import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class77 extends class115 {

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    private int field1183 = 5;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    private int field1185 = 1;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    private int field1189 = 2048;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "[S")
    private short[] field1193 = new short[512];

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    private int field1184 = 2;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "[B")
    private byte[] field1190 = new byte[512];

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    private int field1197 = 5;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    private int field1198 = 0;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1180 = "scroll:";

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "[B")
    public static byte[] field1195 = new byte[520];

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "Z")
    public static boolean field1186 = false;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "[I")
    public static int[] field1192;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "[I")
    public static int[] field1194;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1188;
        if (arg0 != 242152972) {
            this.field1185 = 119;
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int var4 = class187.field2664[arg1] * this.field1183 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; var7 < field1178; ++var7) {
                class40.field595 = Integer.MAX_VALUE;
                class12.field195 = Integer.MAX_VALUE;
                class69.field1085 = Integer.MAX_VALUE;
                class65.field1020 = Integer.MAX_VALUE;
                int var8 = class169.field2444[var7] * this.field1197 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field1190[(this.field1183 <= var11 ? -this.field1183 + var11 : var11) & 255];
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field1190[(this.field1197 <= var14 ? var14 - this.field1197 : var14) + var13 & 255] & 255);
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field1193[var15]);
                        int var17 = -this.field1193[var27] + var4 + -(var11 << 12);
                        int var18 = this.field1185;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 < 0 ? -var17 : var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = ~var25 <= ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class65.field1020 >= ~var19) {
                            if (~var19 <= ~class69.field1085) {
                                if (~class12.field195 < ~var19) {
                                    class40.field595 = class12.field195;
                                    class12.field195 = var19;
                                } else if (var19 < class40.field595) {
                                    class40.field595 = var19;
                                }
                            } else {
                                class40.field595 = class12.field195;
                                class12.field195 = class69.field1085;
                                class69.field1085 = var19;
                            }
                        } else {
                            class40.field595 = class12.field195;
                            class12.field195 = class69.field1085;
                            class69.field1085 = class65.field1020;
                            class65.field1020 = var19;
                        }
                    }
                }
                int var12 = this.field1184;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class65.field1020 + class69.field1085;
                                }
                            } else {
                                var3[var7] = class40.field595;
                            }
                        } else {
                            var3[var7] = class12.field195;
                        }
                    } else {
                        var3[var7] = class69.field1085;
                    }
                } else {
                    var3[var7] = class65.field1020;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lve;IBI)[Llk;")
    public static final class244[] method509(class233 arg0, int arg1, byte arg2, int arg3) {
        ++field1196;
        if (!class110.method718(arg0, (byte) -117, arg3, arg1)) {
            return null;
        } else {
            return arg2 < 83 ? null : class17.method127(22330);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field1179;
        if (arg0 != -1) {
            this.field1190 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field1183 = arg1.method760(false);
                                }
                            } else {
                                this.field1197 = arg1.method760(false);
                            }
                        } else {
                            this.field1185 = arg1.method760(false);
                        }
                    } else {
                        this.field1184 = arg1.method760(false);
                    }
                } else {
                    this.field1189 = arg1.method756(-29901);
                }
            } else {
                this.field1198 = arg1.method760(false);
            }
        } else {
            this.field1197 = this.field1183 = arg1.method760(false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method510(int arg0) {
        field1192 = null;
        if (arg0 > -104) {
            method513(-14);
        }
        field1195 = null;
        field1194 = null;
        field1180 = null;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    private final void method511(byte arg0) {
        ++field1181;
        Random var2 = new Random((long) this.field1198);
        if (arg0 != 26) {
            this.field1197 = -117;
        }
        this.field1193 = new short[512];
        if (~this.field1189 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field1193[var3] = (short) class259.method1734(this.field1189, false, var2);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class77() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
    public static final void method512(byte arg0, int arg1) {
        ++field1182;
        if (arg0 > -13) {
            field1192 = null;
        }
        class289.field4570.method258(arg1, (byte) 119);
        class171.field2454.method258(arg1, (byte) 116);
        class61.field931.method258(arg1, (byte) 91);
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)Z")
    public static final boolean method513(int arg0) {
        if (arg0 != 1498549772) {
            field1194 = null;
        }
        ++field1187;
        if (class272.field4303) {
            try {
                class6.method74("showVideoAd", 26638, class163.field2378.field1273);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        ++field1191;
        this.field1190 = class254.method1702(this.field1198, 0);
        int var2 = 82 / ((arg0 - 78) / 42);
        this.method511((byte) 26);
    }
}
