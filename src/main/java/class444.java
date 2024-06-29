import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class444 extends class578 {

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field6320 = 0;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lvaa;")
    public static class492 field6319;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "[I")
    public static int[] field6323;

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIIIIF)V", line = 5)
    public class444(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)J", line = 14)
    public static final long method2673(int arg0) {
        ++field6316;
        int var1 = -22 % ((-6 - arg0) / 44);
        return class31.field424.method1026(0);
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "(I)V", line = 27)
    public static final void method2674(int arg0) {
        if (arg0 != -8670) {
            field6313 = 76;
        }
        ++field6322;
        int var1 = class467.field6632.length;
        for (int var2 = 0; var1 > var2; ++var2) {
            if (class467.field6632[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~class667.field9388 < ~var4; ++var4) {
                    if (class96.field1236[var2] == class341.field5057[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class341.field5057[class667.field9388] = class96.field1236[var2];
                    var3 = class667.field9388++;
                }
                class120 var5 = new class120(class467.field6632[var2]);
                int var6 = 0;
                while (class467.field6632[var2].length > var5.field1521 && ~var6 > -512 && class26.field379 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method898((byte) -87);
                    int var9 = var8 >> 14;
                    int var10 = 63 & var8 >> 7;
                    int var11 = var8 & 63;
                    int var12 = (class96.field1236[var2] >> 8) * 64 + -class103.field1295 - -var10;
                    int var13 = (255 & class96.field1236[var2]) * 64 + -class175.field2496 + var11;
                    class279 var14 = class21.field322.method1466((byte) 0, var5.method898((byte) -116));
                    class14 var15 = (class14) class543.field7606.method380((byte) -3, (long) var7);
                    if (var15 == null && (var14.field3920 & 1) > 0 && ~class573.field8111 == ~var9 && ~var12 <= -1 && ~(var14.field3878 + var12) > ~class109.field1314 && var13 >= 0 && ~class760.field10479 < ~(var13 - -var14.field3878)) {
                        class645 var16 = new class645();
                        var16.field6361 = var7;
                        class14 var17 = new class14(var16);
                        class543.field7606.method384((long) var7, var17, false);
                        class642.field9044[class662.field9292++] = var17;
                        class790.field10846[class26.field379++] = var7;
                        var16.field6401 = class673.field9441;
                        var16.method3686(var14, (byte) -52);
                        var16.method2703(var16.field9071.field3878, -1);
                        var16.field6370 = var16.field9071.field3944 << 3;
                        var16.method2700(105, true, (var16.field9071.field3872 + 4 & 654311431) << 11);
                        var16.method3683(var16.method2692((byte) -125), var12, true, var13, var9, -36);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IF)V", line = 133)
    public final void method1981(int arg0, float arg1) {
        ++field6315;
        int var3 = -91 / ((-28 - arg0) / 52);
        super.field8169 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 143)
    public static final void method2675(boolean arg0) {
        ++field6314;
        class29 var1 = null;
        try {
            class370 var2 = class27.field395.method3422("2", 71, true);
            while (var2.field5314 == 0) {
                class117.method820(false, 1L);
            }
            if (~var2.field5314 == -2) {
                var1 = (class29) var2.field5317;
                byte[] var3 = new byte[(int) var1.method215((byte) 103)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method212(var3, var3.length - var4, var4, 19065);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class348.method2203((byte) 112, new class120(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (arg0) {
                field6320 = 38;
            }
            if (var1 != null) {
                var1.method210(14471);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V", line = 194)
    public final void method1980(int arg0, int arg1, int arg2, int arg3) {
        super.field8177 = arg3;
        if (arg1 != 0) {
            field6313 = 9;
        }
        super.field8174 = arg2;
        super.field8165 = arg0;
        ++field6317;
    }

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "(I)V", line = 210)
    public static final void method2676(int arg0) {
        if (arg0 != -24484) {
            field6320 = 5;
        }
        ++field6318;
        if (class1.field19 != null) {
            if (class1.field19.field5314 == 1) {
                class1.field19 = null;
                return;
            }
            if (class1.field19.field5314 == 2) {
                class437.method2637(2, class115.field1448, class54.field748, 26027);
                class1.field19 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V", line = 241)
    public static void method2677(byte arg0) {
        field6319 = null;
        field6323 = null;
        if (arg0 != 10) {
            method2676(-52);
        }
    }
}
