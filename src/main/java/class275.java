import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class275 extends class276 {

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    private int field4400 = 3216;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    private int field4403 = 3216;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    private int field4394 = 4096;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "[I")
    private int[] field4395 = new int[3];

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field4399 = 0;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)J")
    public static final long method1801(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field1968; ++var4) {
                class173 var5 = var3.field1961[var4];
                if ((var5.field2850 >> 29 & 3L) == 2L && var5.field2840 == arg1 && var5.field2839 == arg2) {
                    return var5.field2850;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Z")
    public static final boolean method1802(int arg0, byte arg1) {
        ++field4397;
        if (arg1 != 116) {
            return true;
        } else {
            class236 var2 = class54.method338((byte) 29, arg0);
            if (var2 == null) {
                return false;
            } else if (class131.field2288 != 1 && ~class131.field2288 != -3 && ~class225.field3780 != -3) {
                String var3 = "";
                if (~class225.field3780 != -1) {
                    var3 = ":" + (var2.field3895 - -7000);
                }
                String var4 = "";
                if (class204.field3339 != null) {
                    var4 = "/p=" + class204.field3339;
                }
                String var5 = "http://" + var2.field3896 + var3 + "/l=" + class212.field3568 + "/a=" + class191.field3090 + var4 + "/j" + (!class169.field2794 ? "0" : "1") + ",o" + (class11.field165 ? "1" : "0") + ",a2,m" + (class210.field3553 ? "1" : "0");
                try {
                    class159.field2663.getAppletContext().showDocument(new URL(var5), "_self");
                    return true;
                } catch (Exception var6) {
                    return false;
                }
            } else {
                class146.field2489 = var2.field3895;
                class21.field331 = var2.field3896;
                if (class225.field3780 != 0) {
                    class267.field4323 = class146.field2489 + 50000;
                    class262.field4277 = class146.field2489 + 40000;
                    class4.field47 = class262.field4277;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4400 = arg1.method677(false);
                }
            } else {
                this.field4403 = arg1.method677(false);
            }
        } else {
            this.field4394 = arg1.method677(false);
        }
        ++field4401;
        if (arg2 != -1) {
            this.field4394 = -71;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class275() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    private final void method1803(byte arg0) {
        ++field4402;
        if (arg0 != -56) {
            this.field4400 = -65;
        }
        double var2 = Math.cos((double) ((float) this.field4400 / 4096.0F));
        this.field4395[0] = (int) (var2 * Math.sin((double) ((float) this.field4403 / 4096.0F)) * 4096.0D);
        this.field4395[1] = (int) (var2 * Math.cos((double) ((float) this.field4403 / 4096.0F)) * 4096.0D);
        this.field4395[2] = (int) (Math.sin((double) ((float) this.field4400 / 4096.0F)) * 4096.0D);
        int var4 = this.field4395[0] * this.field4395[0] >> 12;
        int var5 = this.field4395[1] * this.field4395[1] >> 12;
        int var6 = this.field4395[2] * this.field4395[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field4395[0] = (this.field4395[0] << 12) / var7;
            this.field4395[2] = (this.field4395[2] << 12) / var7;
            this.field4395[1] = (this.field4395[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            this.method23(-30, -95);
        }
        ++field4398;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int var4 = class153.field2569 * this.field4394 >> 12;
            int[] var5 = this.method1805(false, 0, class125.field2189 & arg1 + -1);
            int[] var6 = this.method1805(false, 0, arg1);
            int[] var7 = this.method1805(false, 0, arg1 + 1 & class125.field2189);
            for (int var8 = 0; ~var8 > ~class53.field929; ++var8) {
                int var9 = (var6[class35.field504 & var8 + -1] + -var6[var8 + 1 & class35.field504]) * var4 >> 12;
                int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var13 = class220.field3681[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field4395[2] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = var10 * var13 >> 8;
                int var18 = this.field4395[1] * var17 >> 12;
                int var19 = this.field4395[0] * var16 >> 12;
                var3[var8] = var18 - -var15 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (arg0 <= 66) {
            this.field4400 = -111;
        }
        ++field4396;
        this.method1803((byte) -56);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4404;
        int var8 = -59 / ((-43 - arg3) / 51);
        if (class110.method766(-13786, arg6)) {
            client.method1920(class115.field2068[arg6], -1, arg5, arg0, arg7, arg2, arg1, arg4);
        }
    }
}
