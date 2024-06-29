import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class211 extends class308 {

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3217 = 0;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Llj;")
    public static class289 field3219;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Ljava/lang/String;")
    public String field3213;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(JI)V", line = 4)
    public static final void method1430(long arg0, int arg1) {
        field3216++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg1 > -45) {
            field3205 = 9;
        }
        while (class265.field4361 > var3) {
            if (class76.field1144[var3] == arg0) {
                class265.field4361--;
                class99.field1431++;
                for (int var4 = var3; var4 < class265.field4361; var4++) {
                    class76.field1144[var4] = class76.field1144[var4 + 1];
                    class166.field2624[var4] = class166.field2624[var4 + 1];
                    class334.field5424[var4] = class334.field5424[var4 + 1];
                }
                class246.field3916 = class12.field157;
                class195.field2992.method250(21066, 159);
                class195.field2992.method2228(arg0, true);
                break;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)I", line = 49)
    public final int method1431(int arg0) {
        if (arg0 != 18974) {
            this.method1433(false);
        }
        field3207++;
        return (int) (this.field2549 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I", line = 60)
    public final int method1432(boolean arg0) {
        if (arg0) {
            field3214++;
            return (int) this.field2549;
        } else {
            return 86;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V", line = 71)
    public final void method1433(boolean arg0) {
        field3208++;
        this.field5011 |= Long.MIN_VALUE;
        if (!arg0) {
            method1434(31);
        }
        if (this.method1438((byte) 73) == 0L) {
            class246.field3911.method1353(-1, this);
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V", line = 91)
    public static void method1434(int arg0) {
        field3219 = null;
        if (arg0 != 0) {
            method1437((class221) null, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 104)
    public final void method1435(byte arg0) {
        this.field5011 = class19.method122(-12169) + 500L | this.field5011 & Long.MIN_VALUE;
        class11.field121.method1353(-1, this);
        if (arg0 != -2) {
            this.field3210 = 121;
        }
        field3212++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lfh;B)Ljava/lang/String;", line = 121)
    public static final String method1436(class313 arg0, byte arg1) {
        field3206++;
        if (arg1 > -76) {
            method1436((class313) null, (byte) -82);
        }
        return class238.method1668(32767, arg0, (byte) -73);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V", line = 133)
    public class211(int arg0, int arg1) {
        this.field2549 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lnm;B)V", line = 142)
    public static final void method1437(class221 arg0, byte arg1) {
        class120.field1778 = class224.method1526(class307.field5007, arg0, (byte) -38);
        class248.field3938 = new int[256];
        field3215++;
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class113.field1659[var2] >> 16 & 0xFF);
            int var4 = class113.field1659[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class113.field1659[var2] >> 8 & 0xFF);
            int var7 = class113.field1659[var2 + 1] >> 8 & 0xFF;
            float var8 = ((float) var7 - var6) / 64.0F;
            float var9 = (float) (class113.field1659[var2] & 0xFF);
            int var10 = class113.field1659[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class248.field3938[var2 * 64 + var12] = class167.method1160(class167.method1160((int) var6 << 8, (int) var3 << 16), (int) var9);
                var9 += var11;
                var6 += var8;
                var3 += var5;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class248.field3938[var13] = class113.field1659[3];
        }
        if (arg1 <= 88) {
            field3205 = -3;
        }
        class132.field2023 = new int[32768];
        class296.field4917 = new int[32768];
        class324.method2318((class239) null, (byte) -122);
        class21.field253 = new int[32768];
        class120.field1794 = new int[32768];
        class220.field3374 = new class137(128, 254);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)J", line = 209)
    public final long method1438(byte arg0) {
        field3218++;
        return arg0 < 7 ? -104L : this.field5011 & Long.MAX_VALUE;
    }
}
