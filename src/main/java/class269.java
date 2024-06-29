import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class269 extends class739 {

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "[I")
    private int[] field3389 = new int[3];

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    private int field3393 = 3216;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    private int field3391 = 4096;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    private int field3387 = 3216;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field3390 = 2;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Let;")
    public static class596 field3396 = new class596(4);

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class269() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    public static void method1599(int arg0) {
        if (arg0 != 10671) {
            field3390 = 6;
        }
        field3396 = null;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        if (arg0 != -21773) {
            method1600((byte) 4);
        }
        ++field3385;
        this.method1603(arg0 + -1740566983);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Z")
    public static final boolean method1600(byte arg0) {
        int var1 = -125 / ((-68 - arg0) / 33);
        ++field3386;
        try {
            if (class514.field7217 == 2) {
                if (class258.field3271 == null) {
                    class258.field3271 = class328.method1904(class230.field3028, class272.field3416, class615.field8495);
                    if (class258.field3271 == null) {
                        return false;
                    }
                }
                if (class579.field8108 == null) {
                    class579.field8108 = new class731(class172.field2382, class417.field5328);
                }
                class216 var2 = class126.field1799;
                if (client.field3977 != null) {
                    var2 = client.field3977;
                }
                if (var2.method1391(class258.field3271, 116, 22050, class267.field3366, class579.field8108)) {
                    class126.field1799 = var2;
                    class126.field1799.method1400((byte) 33);
                    if (~class244.field3163 < -1) {
                        class514.field7217 = 3;
                        class126.field1799.method1384(false, ~class174.field2415 <= ~class244.field3163 ? class244.field3163 : class174.field2415);
                        for (int var3 = 0; var3 < class718.field10003.length; ++var3) {
                            class126.field1799.method1402(var3, -24856, class718.field10003[var3]);
                            class718.field10003[var3] = 255;
                        }
                    } else {
                        class514.field7217 = 0;
                        class126.field1799.method1384(false, class174.field2415);
                        for (int var4 = 0; var4 < class718.field10003.length; ++var4) {
                            class126.field1799.method1402(var4, -24856, class718.field10003[var4]);
                            class718.field10003[var4] = 255;
                        }
                    }
                    if (client.field3977 == null) {
                        if (~class231.field3037 < -1L) {
                            class126.field1799.method1390(class258.field3271, false, class231.field3037, true, class709.field9849);
                        } else {
                            class126.field1799.method1413(class258.field3271, class709.field9849, true);
                        }
                    }
                    if (class101.field1394 != null) {
                        class101.field1394.method3651((byte) -106, class126.field1799);
                    }
                    class258.field3271 = null;
                    class230.field3028 = null;
                    client.field3977 = null;
                    class231.field3037 = 0L;
                    class579.field8108 = null;
                    return true;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class126.field1799.method1399(true);
            class579.field8108 = null;
            class258.field3271 = null;
            class230.field3028 = null;
            client.field3977 = null;
            class514.field7217 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field3395;
        int[] var3 = super.field10311.method2116(arg1, (byte) 119);
        if (super.field10311.field4728) {
            int var4 = class113.field1629 * this.field3391 >> 12;
            int[] var5 = this.method4115(-122, arg1 + -1 & class683.field9515, 0);
            int[] var6 = this.method4115(-122, arg1, 0);
            int[] var7 = this.method4115(-121, arg1 - -1 & class683.field9515, 0);
            for (int var8 = 0; ~class29.field523 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class346.field4366 & var8 - 1] + -var6[var8 - -1 & class346.field4366]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class339.field4296[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field3389[0] * var15 >> 12;
                int var18 = this.field3389[1] * var14 >> 12;
                int var19 = this.field3389[2] * var16 >> 12;
                var3[var8] = var18 - -var19 + var17;
            }
        }
        if (arg0 != -23347) {
            field3390 = 56;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)I")
    public static final int method1601(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class93.field1294 - 1; ++var2) {
            if (arg0 < class629.field8674[var2] + class437.field5812[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class93.field1294 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1602(int arg0, byte arg1, int arg2) {
        int var3 = 30 % ((arg1 - 12) / 53);
        ++field3394;
        return class143.method1034(arg0, arg2, -108) | (2048 & arg2) != 0 || class688.method3867(arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    private final void method1603(int arg0) {
        ++field3392;
        if (arg0 != -1740588756) {
            this.field3387 = 24;
        }
        double var2 = Math.cos((double) ((float) this.field3393 / 4096.0F));
        this.field3389[0] = (int) (var2 * Math.sin((double) ((float) this.field3387 / 4096.0F)) * 4096.0D);
        this.field3389[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field3387 / 4096.0F)));
        this.field3389[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3393 / 4096.0F)));
        int var4 = this.field3389[0] * this.field3389[0] >> 12;
        int var5 = this.field3389[1] * this.field3389[1] >> 12;
        int var6 = this.field3389[2] * this.field3389[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field3389[2] = (this.field3389[2] << 12) / var7;
            this.field3389[0] = (this.field3389[0] << 12) / var7;
            this.field3389[1] = (this.field3389[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 == -3) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field3393 = arg0.method2566(-2);
                    }
                } else {
                    this.field3387 = arg0.method2566(-2);
                }
            } else {
                this.field3391 = arg0.method2566(-2);
            }
            ++field3388;
        }
    }
}
