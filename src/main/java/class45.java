import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class45 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILoi;)V")
    public static final void method273(int arg0, class74 arg1) {
        field480++;
        if (arg0 >= -89 || arg1.field835 == null && arg1.field818 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.field835.length; var3++) {
            int var4 = -1;
            if (arg1.field835 != null) {
                var4 = arg1.field835[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    var9 = arg1.field2170 - ((-class99.field1313 + var8) * 512) - 256;
                    int var10 = var7 & 0x3FFF;
                    var11 = -((var10 - class133.field1704) * 512 - arg1.field2165) - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class706 var14 = (class706) class681.field9475.method2552((long) var4, -1);
                    if (var14 == null) {
                        arg1.method552(12, var3, -1);
                        continue;
                    }
                    class215 var15 = var14.field9890;
                    var11 = arg1.field2165 - var15.field2165;
                    var9 = arg1.field2170 - var15.field2170;
                } else {
                    int var12 = var4 & 0x7FFF;
                    class83 var13 = class361.field4793[var12];
                    if (var13 == null) {
                        arg1.method552(12, var3, -1);
                        continue;
                    }
                    var11 = arg1.field2165 - var13.field2165;
                    var9 = arg1.field2170 - var13.field2170;
                }
                if (var9 != 0 || var11 != 0) {
                    arg1.method552(12, var3, (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF);
                }
            } else if (!arg1.method552(12, var3, -1)) {
                var2 = false;
            }
        }
        if (var2) {
            arg1.field818 = null;
            arg1.field835 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method274(int arg0, int arg1, int arg2) {
        if (arg2 != 16383) {
            return null;
        }
        field481++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILbi;I)V")
    public static final void method275(int arg0, class481 arg1, int arg2) {
        class210.field2522 = false;
        field482++;
        class729.field10172 = arg2;
        class407.method2352(arg1, ~arg2);
        class690.method3899(arg1, 8429);
        if (class210.field2522) {
            System.out.println("---endgpp---");
        }
        if (arg1.field8520 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field8520 + " psize:" + arg0);
        }
    }
}
