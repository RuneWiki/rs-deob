import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class89 extends class3 {

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    private int field1284 = 0;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "I")
    private int field1294 = 0;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
    private int field1295 = 0;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    public static int field1282 = 0;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLuo;Ljava/lang/Object;)V", line = 15)
    public static final void method591(boolean arg0, class274 arg1, Object arg2) {
        field1300++;
        if (arg1.field4514 == null) {
            return;
        }
        int var3 = 0;
        if (arg0) {
            field1282 = 100;
        }
        while (var3 < 50 && arg1.field4514.peekEvent() != null) {
            class177.method1246(1L, -32644);
            var3++;
        }
        if (arg2 != null) {
            arg1.field4514.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 380)
    public class89() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V", line = 43)
    private final void method592(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -13294) {
            this.field1283 = 28;
        }
        field1288++;
        int var5 = arg1 > 2048 ? arg1 + arg3 - (arg1 * arg3 >> 12) : (arg3 + 4096) * arg1 >> 12;
        if (var5 <= 0) {
            this.field1287 = this.field1289 = this.field1291 = arg1;
            return;
        }
        int var6 = arg0 * 6;
        int var7 = arg1 + arg1 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var11 = var8 * var5 >> 12;
        int var12 = var6 - (var9 << 12);
        int var13 = var11 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var9 == 0) {
            this.field1289 = var15;
            this.field1287 = var5;
            this.field1291 = var7;
        } else if (var9 == 1) {
            this.field1289 = var5;
            this.field1287 = var14;
            this.field1291 = var7;
        } else if (var9 == 2) {
            this.field1287 = var7;
            this.field1291 = var15;
            this.field1289 = var5;
        } else if (var9 == 3) {
            this.field1287 = var7;
            this.field1291 = var5;
            this.field1289 = var14;
        } else if (var9 == 4) {
            this.field1291 = var5;
            this.field1289 = var7;
            this.field1287 = var15;
        } else if (var9 == 5) {
            this.field1287 = var5;
            this.field1289 = var7;
            this.field1291 = var14;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZII[Lsi;II)V", line = 147)
    public static final void method593(boolean arg0, int arg1, int arg2, class264[] arg3, int arg4, int arg5) {
        field1290++;
        int var6 = 109 / ((-arg2) / 59);
        for (int var7 = 0; var7 < arg3.length; var7++) {
            class264 var8 = arg3[var7];
            if (var8 != null && var8.field4201 == arg1) {
                class46.method352(var8, arg5, arg4, (byte) -62, arg0);
                class355.method2479((byte) -78, arg5, var8, arg4);
                if ((var8.field4307 - var8.field4223) < var8.field4220) {
                    var8.field4220 = var8.field4307 - var8.field4223;
                }
                if (var8.field4220 < 0) {
                    var8.field4220 = 0;
                }
                if (var8.field4228 - var8.field4236 < var8.field4242) {
                    var8.field4242 = var8.field4228 - var8.field4236;
                }
                if (var8.field4242 < 0) {
                    var8.field4242 = 0;
                }
                if (var8.field4350 == 0) {
                    class209.method1423(-29561, var8, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[[I", line = 203)
    public final int[][] method22(int arg0, int arg1) {
        field1292++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[][] var4 = this.method16(arg1, 0, (byte) -126);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class326.field5342; var11++) {
                this.method594(var7[var11], var6[var11], var5[var11], arg0 ^ 0xFFFFAD34);
                this.field1283 += this.field1284;
                this.field1293 += this.field1295;
                if (this.field1283 < 0) {
                    this.field1283 = 0;
                }
                if (this.field1293 < 0) {
                    this.field1293 = 0;
                }
                if (this.field1293 > 4096) {
                    this.field1293 = 4096;
                }
                if (this.field1283 > 4096) {
                    this.field1283 = 4096;
                }
                for (this.field1286 += this.field1294; this.field1286 < 0; this.field1286 += 4096) {
                }
                while (this.field1286 > 4096) {
                    this.field1286 -= 4096;
                }
                this.method592(this.field1286, this.field1293, -13294, this.field1283);
                var8[var11] = this.field1287;
                var9[var11] = this.field1289;
                var10[var11] = this.field1291;
            }
        }
        if (arg0 != -21194) {
            this.field1294 = -62;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIII)V", line = 286)
    private final void method594(int arg0, int arg1, int arg2, int arg3) {
        field1299++;
        int var5 = arg1 >= arg2 ? arg1 : arg2;
        int var6 = arg0 <= var5 ? var5 : arg0;
        int var7 = arg2 >= arg1 ? arg1 : arg2;
        int var8 = arg0 >= var7 ? var7 : arg0;
        int var9 = var6 - var8;
        if (var9 <= 0) {
            this.field1286 = 0;
        } else {
            int var10 = (var6 - arg1 << 12) / var9;
            int var11 = (var6 - arg0 << 12) / var9;
            int var12 = (var6 - arg2 << 12) / var9;
            if (arg2 == var6) {
                this.field1286 = arg1 == var8 ? var11 + 20480 : -var10 + 4096;
            } else if (arg1 == var6) {
                this.field1286 = arg0 == var8 ? var12 + 4096 : -var11 + 12288;
            } else {
                this.field1286 = arg2 == var8 ? var10 + 12288 : 20480 - var12;
            }
            this.field1286 /= 6;
        }
        this.field1293 = (var6 + var8) / arg3;
        if (this.field1293 > 0 && this.field1293 < 4096) {
            this.field1283 = (var9 << 12) / (this.field1293 <= 2048 ? this.field1293 * 2 : 8192 - (this.field1293 * 2));
        } else {
            this.field1283 = 0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lfh;IZ)V", line = 338)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field1297++;
        if (arg2) {
            return;
        }
        if (arg1 == 0) {
            this.field1294 = arg0.method2214(0);
        } else if (arg1 == 1) {
            this.field1284 = (arg0.method2200(53) << 12) / 100;
        } else if (arg1 == 2) {
            this.field1295 = (arg0.method2200(53) << 12) / 100;
        }
    }
}
