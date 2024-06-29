import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class281 extends class29 {

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Lph;")
    public static class229 field4654 = class266.method1858(" <col=ffffff>", 0);

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Lph;")
    public static class229 field4650 = class266.method1858("name_icons", 0);

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Z")
    public static boolean field4661 = true;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "Lph;")
    public static class229 field4659 = class266.method1858("null", 0);

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field4656 = 0;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "F")
    public static float field4665;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public int field4657;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Lph;")
    public class229 field4658;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lsi;")
    public static class66 field4649;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V", line = 27)
    public static void method1930(int arg0) {
        field4654 = null;
        field4650 = null;
        field4649 = null;
        if (arg0 >= -105) {
            method1937(-76, 59, -24);
        }
        field4659 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I", line = 42)
    public final int method1931(byte arg0) {
        field4651++;
        int var2 = 115 % ((arg0 - 28) / 53);
        return (int) (this.field1325 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V", line = 58)
    public final void method1932(int arg0) {
        field4653++;
        this.field468 |= Long.MIN_VALUE;
        if ((long) arg0 == this.method1935(arg0 ^ 0x7F)) {
            class153.field2489.method1532(120, this);
        }
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V", line = 69)
    public final void method1933(int arg0) {
        if (arg0 == 0) {
            this.field468 = class130.method935(false) + 500L | this.field468 & Long.MIN_VALUE;
            class68.field1087.method1532(111, this);
            field4663++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I", line = 83)
    public final int method1934(byte arg0) {
        field4662++;
        if (arg0 != 83) {
            field4665 = 0.5058279F;
        }
        return (int) this.field1325;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)J", line = 99)
    public final long method1935(int arg0) {
        field4664++;
        if (arg0 <= 120) {
            field4649 = (class66) null;
        }
        return Long.MAX_VALUE & this.field468;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V", line = 109)
    public class281(int arg0, int arg1) {
        this.field1325 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "(I)V", line = 119)
    public static final void method1936(int arg0) {
        class63.field950 = 0;
        field4655++;
        class313.field5278 = 0;
        class293.method1992(1);
        class330.method2264(-1);
        class166.method1219((byte) -44);
        class50.method355(-128);
        for (int var1 = 0; var1 < class63.field950; var1++) {
            int var2 = class57.field809[var1];
            if (class319.field5393 != class114.field1931[var2].field5162) {
                if (class114.field1931[var2].field3447 > 0) {
                    class97.method720(class114.field1931[var2], (byte) -21);
                }
                class114.field1931[var2] = null;
            }
        }
        if (class187.field3052 != class88.field1497.field2670) {
            throw new RuntimeException("gpp1 pos:" + class88.field1497.field2670 + " psize:" + class187.field3052);
        }
        if (arg0 != 9244) {
            method1930(38);
        }
        for (int var3 = 0; var3 < class139.field2248; var3++) {
            if (class114.field1931[class166.field2708[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class139.field2248);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)J", line = 176)
    public static final long method1937(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1211; var4++) {
            class152 var5 = var3.field1216[var4];
            if ((var5.field2479 >> 29 & 0x3L) == 2L && var5.field2464 == arg1 && var5.field2468 == arg2) {
                return var5.field2479;
            }
        }
        return 0L;
    }
}
