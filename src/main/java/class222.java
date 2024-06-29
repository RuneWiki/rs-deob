import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class222 {

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "J")
    public long field3606 = 0L;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Z")
    public static boolean field3591 = true;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Z")
    public static boolean field3592 = false;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3595 = new CRC32();

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public int field3589;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lfg;")
    public class176 field3588;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lfg;")
    public class176 field3593;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lma;")
    public static class263 field3603;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lme;")
    public static class295 field3598;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lba;")
    public static class51 field3596;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([Llj;[Llj;BLme;[Lgg;[Llj;[Llj;)V", line = 26)
    public static final void method1535(class5[] arg0, class5[] arg1, byte arg2, class295 arg3, class47[] arg4, class5[] arg5, class5[] arg6) {
        class38.field571 = arg6;
        field3597++;
        class307.field5204 = arg0;
        class170.field2754 = arg4;
        class157.field2580 = arg1;
        class254.field4217 = arg3;
        class198.field3279 = arg5;
        class129.field2134.method530(-15068);
        int var7 = class254.field4217.method2064(122, class129.field2123);
        int[] var8 = class254.field4217.method2041((byte) 18, var7);
        int var9 = -10 / ((arg2 - 39) / 32);
        for (int var10 = 0; var10 < var8.length; var10++) {
            class129.field2134.method532(91, class151.method1087((byte) -12, new class170(class254.field4217.method2042(var7, var8[var10], (byte) -121))));
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lwk;I)V", line = 78)
    public static final void method1536(class105 arg0, int arg1) {
        field3604++;
        if (class30.field420 == arg0.field1770 || arg0.field1737 == -1 || arg0.field1786 != 0 || arg0.field1789 + 1 > class265.method1834((byte) -39, arg0.field1737).field2132[arg0.field1781]) {
            int var2 = arg0.field1770 - arg0.field1780;
            int var3 = class30.field420 - arg0.field1780;
            int var4 = arg0.field1722 * 128 + (arg0.method776(true) * 64);
            int var5 = arg0.field1757 * 128 + arg0.method776(true) * 64;
            int var6 = arg0.field1748 * 128 + arg0.method776(true) * 64;
            int var7 = arg0.field1768 * 128 + (arg0.method776(true) * 64);
            arg0.field1774 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field1769 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg0.field1775 = 0;
        if (arg0.field1764 == 0) {
            arg0.field1750 = 1024;
        }
        if (arg0.field1764 == 1) {
            arg0.field1750 = 1536;
        }
        if (arg0.field1764 == 2) {
            arg0.field1750 = 0;
        }
        if (arg0.field1764 == 3) {
            arg0.field1750 = 512;
        }
        if (arg1 == 64) {
            arg0.field1765 = arg0.field1750;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 122)
    public static final void method1537(int arg0) {
        field3600++;
        class251.field4185.method1484(false);
        class157.field2565.method1484(false);
        if (arg0 != 0) {
            method1536((class105) null, -89);
        }
        class50.field763.method1484(false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 139)
    public static void method1538(byte arg0) {
        field3598 = null;
        field3603 = null;
        field3596 = null;
        field3595 = null;
        if (arg0 < 60) {
            method1538((byte) -65);
        }
    }
}
