import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class188 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    private int[] field2952;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2957 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lnf;")
    public static class162 field2959 = new class162(260);

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[[[B")
    public static byte[][][] field2951;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
    public final int method1341(int arg0, int arg1) {
        int var3 = (this.field2952.length >> 1) - 1;
        if (arg1 != -7570) {
            method1342((byte) 125);
        }
        field2956++;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field2952[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2952[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method1342(byte arg0) {
        class255 var1 = class240.field3813;
        synchronized (class240.field3813) {
            class155.field2312 = class7.field126;
            class160.field2408++;
            class171.field2587 = class48.field794;
            class157.field2340 = class145.field2150;
            class68.field1075 = class307.field4929;
            class73.field1126 = class284.field4476;
            class240.field3829 = class246.field3913;
            class266.field4205 = class204.field3142;
            if (arg0 != -54) {
                field2959 = null;
            }
            class307.field4929 = 0;
        }
        field2958++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1343(boolean arg0) {
        field2959 = null;
        field2957 = null;
        field2951 = null;
        if (!arg0) {
            method1342((byte) 34);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([I)V")
    public class188(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2952 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2952[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2952[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field2952[var5 + var5] = arg0[var4];
            this.field2952[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1344(int arg0) {
        field2954++;
        if (arg0 != 0) {
            return;
        }
        int var1 = class286.field4495 * 128 + 64;
        int var2 = class293.field4550 * 128 + 64;
        int var3 = class254.method1721(-580808345, class130.field1941, var2, var1) - class53.field847;
        if (class230.field3647 < 100) {
            if (class118.field1787 < var2) {
                class118.field1787 += (var2 - class118.field1787) * class230.field3647 / 1000 + class76.field1173;
                if (var2 < class118.field1787) {
                    class118.field1787 = var2;
                }
            }
            if (class226.field3616 < var1) {
                class226.field3616 += (var1 - class226.field3616) * class230.field3647 / 1000 + class76.field1173;
                if (class226.field3616 > var1) {
                    class226.field3616 = var1;
                }
            }
            if (var3 > class250.field4007) {
                class250.field4007 += (var3 - class250.field4007) * class230.field3647 / 1000 + class76.field1173;
                if (var3 < class250.field4007) {
                    class250.field4007 = var3;
                }
            }
            if (class250.field4007 > var3) {
                class250.field4007 -= class76.field1173 + ((class250.field4007 - var3) * class230.field3647 / 1000);
                if (var3 > class250.field4007) {
                    class250.field4007 = var3;
                }
            }
            if (var1 < class226.field3616) {
                class226.field3616 -= (class226.field3616 - var1) * class230.field3647 / 1000 + class76.field1173;
                if (var1 > class226.field3616) {
                    class226.field3616 = var1;
                }
            }
            if (class118.field1787 > var2) {
                class118.field1787 -= (class118.field1787 - var2) * class230.field3647 / 1000 + class76.field1173;
                if (class118.field1787 < var2) {
                    class118.field1787 = var2;
                }
            }
        } else {
            class226.field3616 = class286.field4495 * 128 + 64;
            class118.field1787 = class293.field4550 * 128 + 64;
            class250.field4007 = class254.method1721(-580808345, class130.field1941, class118.field1787, class226.field3616) - class53.field847;
        }
        int var4 = class15.field181 * 128 + 64;
        int var5 = class79.field1204 * 128 + 64;
        int var6 = class254.method1721(arg0 - 580808345, class130.field1941, var4, var5) - class237.field3749;
        int var7 = var4 - class118.field1787;
        int var8 = var6 - class250.field4007;
        int var9 = var5 - class226.field3616;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var7)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class82.field1244;
        if (var11 > class8.field128) {
            class8.field128 += class269.field4261 + ((var11 - class8.field128) * class218.field3333 / 1000);
            if (class8.field128 > var11) {
                class8.field128 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class82.field1244 += class218.field3333 * var13 / 1000 + class269.field4261;
            class82.field1244 &= 0x7FF;
        }
        if (var13 < 0) {
            class82.field1244 -= -var13 * class218.field3333 / 1000 + class269.field4261;
            class82.field1244 &= 0x7FF;
        }
        if (var11 < class8.field128) {
            class8.field128 -= (class8.field128 - var11) * class218.field3333 / 1000 + class269.field4261;
            if (var11 > class8.field128) {
                class8.field128 = var11;
            }
        }
        int var14 = var12 - class82.field1244;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class82.field1244 = var12;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
    public static final void method1345(int arg0, int arg1) {
        class69 var2 = class255.method1723((byte) 32, arg1, arg0);
        field2955++;
        var2.method554(2009563296);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lha;B)Loc;")
    public static final class62 method1346(class31 arg0, byte arg1) {
        field2953++;
        if (arg1 != -117) {
            method1344(-30);
        }
        return new class62(arg0.method308((byte) -125), arg0.method308((byte) 3), arg0.method308((byte) 24), arg0.method308((byte) -121), arg0.method308((byte) -4), arg0.method308((byte) 122), arg0.method308((byte) -119), arg0.method308((byte) -4), arg0.method304((byte) 84), arg0.method265(-88));
    }
}
