import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class237 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field4063 = 0;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field4065 = 0;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1671(int arg0) {
        field4068++;
        class29.field399.method1395((byte) -43);
        if (arg0 == -20184) {
            class112.field1832.method1395((byte) -43);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 35)
    public static final void method1672(byte arg0) {
        field4067++;
        int var1 = class21.field221 * 128 + 64;
        int var2 = class106.field1727 * 128 + 64;
        int var3 = class165.method1186((byte) -58, var2, var1, class7.field85) - class194.field3280;
        if (class123.field2037 >= 100) {
            class258.field4351 = class21.field221 * 128 + 64;
            class215.field3647 = class106.field1727 * 128 + 64;
            class15.field134 = class165.method1186((byte) -58, class215.field3647, class258.field4351, class7.field85) - class194.field3280;
        } else {
            if (var3 > class15.field134) {
                class15.field134 += (var3 - class15.field134) * class123.field2037 / 1000 + class284.field4862;
                if (var3 < class15.field134) {
                    class15.field134 = var3;
                }
            }
            if (class258.field4351 < var1) {
                class258.field4351 += (var1 - class258.field4351) * class123.field2037 / 1000 + class284.field4862;
                if (var1 < class258.field4351) {
                    class258.field4351 = var1;
                }
            }
            if (var2 > class215.field3647) {
                class215.field3647 += (var2 - class215.field3647) * class123.field2037 / 1000 + class284.field4862;
                if (var2 < class215.field3647) {
                    class215.field3647 = var2;
                }
            }
            if (class215.field3647 > var2) {
                class215.field3647 -= (class215.field3647 - var2) * class123.field2037 / 1000 + class284.field4862;
                if (class215.field3647 < var2) {
                    class215.field3647 = var2;
                }
            }
            if (class258.field4351 > var1) {
                class258.field4351 -= class284.field4862 + ((class258.field4351 - var1) * class123.field2037 / 1000);
                if (var1 > class258.field4351) {
                    class258.field4351 = var1;
                }
            }
            if (class15.field134 > var3) {
                class15.field134 -= (class15.field134 - var3) * class123.field2037 / 1000 + class284.field4862;
                if (class15.field134 < var3) {
                    class15.field134 = var3;
                }
            }
        }
        int var4 = class153.field2453 * 128 + 64;
        int var5 = class259.field4361 * 128 + 64;
        int var6 = class165.method1186((byte) -58, var4, var5, class7.field85) - class267.field4518;
        int var7 = var4 - class215.field3647;
        int var8 = var6 - class15.field134;
        int var9 = var5 - class258.field4351;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var9, (double) var7) * -325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (arg0 <= 31) {
            return;
        }
        int var13 = var12 - class30.field414;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class46.field683 < var11) {
            class46.field683 += class165.field2687 + ((var11 - class46.field683) * class207.field3509 / 1000);
            if (var11 < class46.field683) {
                class46.field683 = var11;
            }
        }
        if (class46.field683 > var11) {
            class46.field683 -= class165.field2687 + ((class46.field683 - var11) * class207.field3509 / 1000);
            if (class46.field683 < var11) {
                class46.field683 = var11;
            }
        }
        if (var13 > 0) {
            class30.field414 += class207.field3509 * var13 / 1000 + class165.field2687;
            class30.field414 &= 0x7FF;
        }
        if (var13 < 0) {
            class30.field414 -= -var13 * class207.field3509 / 1000 + class165.field2687;
            class30.field414 &= 0x7FF;
        }
        int var14 = var12 - class30.field414;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class30.field414 = var12;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 198)
    public static final void method1673(int arg0) {
        field4069++;
        class78.field1307.method542(-6922);
        class289.field4925 = null;
        if (arg0 != -129) {
            method1671(-31);
        }
        class60.field876 = 1;
    }
}
