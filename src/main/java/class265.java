import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class265 extends class159 {

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field3890 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public int field3892 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field3893 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field3888 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public int field3897 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field3896 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field3898 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public int field3901 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lsu;")
    public class223 field3891;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field3902 = 0;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/Object;Lec;)V", line = 3)
    public static final void method1778(int arg0, Object arg1, class248 arg2) {
        field3900++;
        if (arg2.field3241 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field3241.peekEvent() != null; var3++) {
            class171.method1152(1L, false);
        }
        try {
            if (arg1 != null) {
                arg2.field3241.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
        if (arg0 != -51) {
            method1778(60, null, null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLqba;)I", line = 33)
    public static final int method1779(byte arg0, class425 arg1) {
        if (arg0 > -122) {
            method1778(-67, null, null);
        }
        field3895++;
        if (arg1.field6101 == 0) {
            return 0;
        }
        if (arg1.field6149 != -1) {
            class425 var2 = null;
            if (arg1.field6149 < 32768) {
                class316 var3 = (class316) class176.field2326.method1248(111, (long) arg1.field6149);
                if (var3 != null) {
                    var2 = var3.field4455;
                }
            } else if (arg1.field6149 >= 32768) {
                var2 = class84.field1204[arg1.field6149 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field2802 - var2.field2802;
                int var5 = arg1.field2810 - var2.field2810;
                if (var4 != 0 || var5 != 0) {
                    arg1.method2558((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, -1);
                }
            }
        }
        if ((arg1 instanceof class758)) {
            class758 var9 = (class758) arg1;
            if (var9.field10368 != -1 && (var9.field6195 == 0 || var9.field6199 > 0)) {
                var9.method2558(var9.field10368, -1);
                var9.field10368 = -1;
            }
        } else if (arg1 instanceof class22) {
            class22 var6 = (class22) arg1;
            if (var6.field212 != -1 && (var6.field6195 == 0 || var6.field6199 > 0)) {
                int var7 = var6.field2802 - ((var6.field212 - class120.field1625 - class120.field1625) * 256);
                int var8 = var6.field2810 - (var6.field214 - class259.field3849 - class259.field3849) * 256;
                if (var7 != 0 || var8 != 0) {
                    var6.method2558((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, -1);
                }
                var6.field212 = -1;
            }
        }
        return arg1.method2564(32338);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Laf;II)Z", line = 119)
    public static final boolean method1780(class459 arg0, int arg1, int arg2) {
        field3889++;
        int var3 = arg0.method2721(2, 1);
        if (var3 == 0) {
            if (arg0.method2721(1, 1) != 0) {
                method1780(arg0, arg1, -97);
            }
            int var4 = arg0.method2721(6, 1);
            int var5 = arg0.method2721(6, 1);
            boolean var6 = arg0.method2721(1, 1) == 1;
            if (var6) {
                class738.field10012[class776.field10672++] = arg1;
            }
            if (class84.field1204[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class170 var7 = class637.field8588[arg1];
            class758 var8 = class84.field1204[arg1] = new class758();
            var8.field6146 = arg1;
            if (class243.field3193[arg1] != null) {
                var8.method4155(false, class243.field3193[arg1]);
            }
            var8.method2561(false, true, var7.field2229);
            var8.field6149 = var7.field2227;
            int var9 = var7.field2228;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FFD70) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class120.field1625;
            var8.field10373 = var7.field2226;
            int var14 = (var12 << 6) + var5 - class259.field3849;
            var8.field10397 = var7.field2225;
            var8.field6194[0] = class747.field10072[arg1];
            var8.field2813 = var8.field2809 = (byte) var10;
            if (class49.method310(var13, var14, (byte) 91)) {
                var8.field2809++;
            }
            var8.method4163(var14, (byte) 31, var13);
            var8.field10359 = false;
            class637.field8588[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method2721(2, 1);
            int var16 = class637.field8588[arg1].field2228;
            class637.field8588[arg1].field2228 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method2721(5, 1);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class637.field8588[arg1].field2228;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FC787) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class637.field8588[arg1].field2228 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method2721(18, 1);
            int var25 = 19 / ((arg2 + 44) / 48);
            int var26 = var24 >> 16;
            int var27 = var24 >> 8 & 0xFF;
            int var28 = var24 & 0xFF;
            int var29 = class637.field8588[arg1].field2228;
            int var30 = (var29 >> 28) + var26 & 0x3;
            int var31 = (var29 >> 14) + var27 & 0xFF;
            int var32 = var28 + var29 & 0xFF;
            class637.field8588[arg1].field2228 = (var30 << 28) + ((var31 << 14) + var32);
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lsu;)V", line = 345)
    public class265(class223 arg0) {
        this.field3891 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z", line = 310)
    public final boolean method1781(int arg0, int arg1, int arg2) {
        field3894++;
        if (arg0 != 2) {
            return true;
        } else if (this.field3893 <= arg1 && this.field3897 >= arg1 && this.field3898 <= arg2 && this.field3888 >= arg2) {
            return true;
        } else {
            return this.field3892 <= arg1 && this.field3901 >= arg1 && arg2 >= this.field3896 && arg2 <= this.field3890;
        }
    }
}
