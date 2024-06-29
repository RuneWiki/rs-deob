import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class4 {

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "F")
    public static float field42;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
    public abstract void method15(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIJILui;)V")
    public abstract void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()I")
    public abstract int method17();

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method18(int arg0) {
        field41++;
        class135.field2209.method1420((byte) 113);
        if (arg0 >= -28) {
            method19((class66) null, (class159) null, (byte) 23);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lgg;Lhf;B)V")
    public static final void method19(class66 arg0, class159 arg1, byte arg2) {
        field37++;
        class176 var3 = arg0.method497(0);
        if (var3 == null) {
            return;
        }
        int var4 = var3.field2258;
        if (var3.field2255 > var3.field2258) {
            var4 = var3.field2255;
        }
        int var5 = arg1.field2474;
        if (arg2 <= 81) {
            method19((class66) null, (class159) null, (byte) -77);
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = arg1.field2468;
        int var9 = 0;
        if (arg0.field991 != null) {
            var7 = class84.field1336.method62(arg0.field991, (int[]) null, class306.field4937);
            for (int var10 = 0; var10 < var7; var10++) {
                String var11 = class306.field4937[var10];
                if ((var7 - 1) > var10) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class231.field3396.method1143(var11);
                if (var6 < var12) {
                    var6 = var12;
                }
            }
            var9 = class231.field3396.method1149() * (var7 - 1) + (class231.field3396.method1147() / 2);
        }
        int var13 = arg1.field2468;
        if (class46.field634 + var4 > var8) {
            var8 = class46.field634 + var4;
            var13 = var6 / 2 + class46.field634 + var4 / 2 + var4 + 5;
        } else if (class46.field645 - var4 < var8) {
            var13 = class46.field645 - var4 - (var4 / 2) - (var6 / 2) - 5;
            var8 = class46.field645 - var4;
        }
        int var14 = arg1.field2474 - (var9 / 2);
        if (var5 < (class46.field642 + var4)) {
            var5 = class46.field642 + var4;
            var14 = var4 + class46.field642 + (var4 / 2) + class231.field3396.method1149();
        } else if ((class46.field640 - var4) < var5) {
            var5 = class46.field640 - var4;
            var14 = class46.field640 - var9 - (var4 / 2) - var4;
        }
        int var15 = var4 >> 1;
        int var16 = (int) ((Math.atan2((double) (var8 - arg1.field2468), (double) (var5 - arg1.field2474)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        int var17 = -2;
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        var3.method1259(var3.field2253 << 3, var3.field2247 << 3, (var8 << 4) + var15, (var5 << 4) + var15, var16, 4096);
        if (arg0.field991 != null) {
            var20 = var14 - (class231.field3396.method1147() + 3);
            var17 = var13 - var6 / 2 - 5;
            var19 = class231.field3396.method1149() * var7 + var20;
            var18 = var17 + var6 + 10;
            if (arg0.field1007 != 0) {
                class130.method1003(var17, var20, var18 - var17, -var20 + var19, arg0.field1007, arg0.field1007 >>> 24);
            }
            if (arg0.field1006 != 0) {
                class130.method987(var17, var20, var18 - var17, var19 - var20, arg0.field1006, arg0.field1006 >>> 24);
            }
            for (int var21 = 0; var21 < var7; var21++) {
                String var22 = class306.field4937[var21];
                if (var21 < var7 - 1) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class231.field3396.method1146(var22, var13, var14, arg0.field1005, true);
                var14 += class231.field3396.method1149();
            }
        }
        if (var8 - var15 >= class204.field3017 || (var8 + var15) <= class204.field3017 || (var5 - var15) >= class44.field584 || class44.field584 >= (var5 + var15) && class204.field3017 <= var17 || var18 <= class204.field3017 || class44.field584 <= var20 || var19 <= class44.field584) {
            return;
        }
        if (arg0.field1004[4] != null) {
            class63.method481((long) arg1.field2466, 0, -1, 0, arg0.field1004[4], (short) 1003, -1, arg0.field1000);
        }
        if (arg0.field1004[3] != null) {
            class63.method481((long) arg1.field2466, 0, -1, 0, arg0.field1004[3], (short) 1006, -1, arg0.field1000);
        }
        if (arg0.field1004[2] != null) {
            class63.method481((long) arg1.field2466, 0, -1, 0, arg0.field1004[2], (short) 1011, -1, arg0.field1000);
        }
        if (arg0.field1004[1] != null) {
            class63.method481((long) arg1.field2466, 0, -1, 0, arg0.field1004[1], (short) 1001, -1, arg0.field1000);
        }
        if (arg0.field1004[0] != null) {
            class63.method481((long) arg1.field2466, 0, -1, 0, arg0.field1004[0], (short) 1002, -1, arg0.field1000);
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method20(byte arg0) {
        field36++;
        if (class213.field3139 != null && (class213.field3139.field3660 + 64 - (class213.field3139.method1467(0) * 64) >> 7) == class113.field1883 && class213.field3139.field3753 - ((class213.field3139.method1467(0) - 1) * 64) >> 7 == class255.field3855) {
            class113.field1883 = 0;
            class258.field4001 = false;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var7 = 0; var7 < 104; var7++) {
                class158.field2454[var1][var7] = 0;
            }
        }
        for (int var2 = 0; var2 < class103.field1791; var2++) {
            class207 var6 = class92.field1475[class162.field2518[var2]];
            if (var6 != null) {
                var6.field3743 = false;
            }
        }
        int var3 = -62 % ((arg0 - 18) / 58);
        for (int var4 = 0; var4 < class12.field135; var4++) {
            class12 var5 = class255.field3856[class14.field159[var4]];
            if (var5 != null) {
                var5.field3743 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()Z")
    public boolean method21() {
        field40++;
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Lff;")
    public class4 method22(int arg0, int arg1, int arg2) {
        field38++;
        return this;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([IZ)[I")
    public static final int[] method23(int[] arg0, boolean arg1) {
        field43++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        class117.method878(arg0, 0, var2, 0, arg0.length);
        if (arg1) {
            method18(-67);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lff;IIIZ)V")
    public void method24(class4 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field39++;
    }
}
