import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class573 extends class748 {

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    private int field8092 = 1;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "[B")
    private byte[] field8090 = new byte[512];

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    private int field8097 = 5;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    private int field8096 = 0;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    private int field8095 = 2;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    private int field8099 = 2048;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "I")
    private int field8103 = 5;

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "[S")
    private short[] field8101 = new short[512];

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "Lju;")
    public static class102 field8094 = new class102(82, 2);

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "I")
    public static int field8102;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gt", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field8106;

    @OriginalMember(owner = "client!gt", name = "W", descriptor = "Ljava/lang/Object;")
    public static Object field8105;

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "[[[I")
    public static int[][][] field8104;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public final void method23(byte arg0) {
        ++field8098;
        if (arg0 != 67) {
            this.method3415(43);
        }
        this.field8090 = class545.method3257(false, this.field8096);
        this.method3415(41);
    }

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)V")
    private final void method3415(int arg0) {
        ++field8093;
        Random var2 = new Random((long) this.field8096);
        this.field8101 = new short[512];
        if (~this.field8099 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field8101[var3] = (short) class99.method676(this.field8099, var2, -71);
            }
        }
        int var4 = 51 / ((arg0 - -1) / 41);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Component;ZI)Ltfa;")
    public static final class284 method3416(Component arg0, boolean arg1, int arg2) {
        ++field8091;
        try {
            if (arg2 != 512) {
                return null;
            } else {
                Constructor var3 = Class.forName("uf").getDeclaredConstructor(field8106 != null ? field8106 : (field8106 = method3418("java.awt.Component")), Boolean.TYPE);
                return (class284) var3.newInstance(arg0, new Boolean(arg1));
            }
        } catch (Throwable var4) {
            return new class126(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "(I)V")
    public static void method3417(int arg0) {
        if (arg0 != 82) {
            method3417(97);
        }
        field8094 = null;
        field8104 = null;
        field8105 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field8100;
        if (arg1) {
            this.field8095 = -113;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field8103 = arg2.method194((byte) 119);
                                }
                            } else {
                                this.field8097 = arg2.method194((byte) 119);
                            }
                        } else {
                            this.field8092 = arg2.method194((byte) 119);
                        }
                    } else {
                        this.field8095 = arg2.method194((byte) 119);
                    }
                } else {
                    this.field8099 = arg2.method193(2);
                }
            } else {
                this.field8096 = arg2.method194((byte) 119);
            }
        } else {
            this.field8097 = this.field8103 = arg2.method194((byte) 119);
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
    public class573() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field8102;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (arg1 != 255) {
            this.method3415(-36);
        }
        if (super.field10407.field9527) {
            int var4 = class370.field4727[arg0] * this.field8103 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class424.field5889 > var7; ++var7) {
                class676.field9530 = Integer.MAX_VALUE;
                class313.field4025 = Integer.MAX_VALUE;
                class471.field6469 = Integer.MAX_VALUE;
                class172.field2325 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class237.field3298[var7] * this.field8097);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field8090[255 & (this.field8103 > var11 ? var11 : -this.field8103 + var11)];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (this.field8090[255 & (this.field8097 <= var14 ? -this.field8097 + var14 : var14) + var13] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field8101[var15] + -(var14 << 12);
                        int var17 = -(var11 << 12) + -this.field8101[var27] + var4;
                        int var18 = this.field8092;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = var26 >= var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class172.field2325 <= var19) {
                            if (var19 >= class471.field6469) {
                                if (class313.field4025 > var19) {
                                    class676.field9530 = class313.field4025;
                                    class313.field4025 = var19;
                                } else if (class676.field9530 > var19) {
                                    class676.field9530 = var19;
                                }
                            } else {
                                class676.field9530 = class313.field4025;
                                class313.field4025 = class471.field6469;
                                class471.field6469 = var19;
                            }
                        } else {
                            class676.field9530 = class313.field4025;
                            class313.field4025 = class471.field6469;
                            class471.field6469 = class172.field2325;
                            class172.field2325 = var19;
                        }
                    }
                }
                int var12 = this.field8095;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class172.field2325 + class471.field6469;
                                }
                            } else {
                                var3[var7] = class676.field9530;
                            }
                        } else {
                            var3[var7] = class313.field4025;
                        }
                    } else {
                        var3[var7] = class471.field6469;
                    }
                } else {
                    var3[var7] = class172.field2325;
                }
            }
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3418(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
