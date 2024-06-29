import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class245 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4039 = new CRC32();

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lph;")
    public static class229 field4044 = class266.method1858("Verbindung abgebrochen)3", 0);

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[[[B")
    public static byte[][][] field4050 = new byte[4][104][104];

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field4049 = 128;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[I")
    public static int[] field4052 = new int[256];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[B")
    public byte[] field4036;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[B")
    public byte[] field4040;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1703(int arg0) {
        int var1 = -18 % ((arg0 - 66) / 58);
        class105.field1786.method1415(-18218);
        field4038++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Lki;", line = 22)
    public static final class152 method1704(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1211; var4++) {
            class152 var5 = var3.field1216[var4];
            if ((var5.field2479 >> 29 & 0x3L) == 2L && var5.field2464 == arg1 && var5.field2468 == arg2) {
                class311.method2104(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 46)
    public static void method1705(int arg0) {
        field4052 = null;
        field4044 = null;
        field4050 = (byte[][][]) null;
        field4039 = null;
        if (arg0 < 112) {
            method1705(14);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIB)V", line = 72)
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4041++;
        if (arg6 >= -12) {
            field4052 = (int[]) null;
        }
        class240[] var7 = class162.field2606;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class240 var9 = var7[var8];
            if (var9 != null && var9.field3977 == 2) {
                class298.method2008((var9.field3978 - class1.field9 << 7) + var9.field3976, arg2, arg1 >> 1, arg3, arg5 >> 1, var9.field3975 * 2, (var9.field3964 - class1.field1 << 7) + var9.field3973, (byte) 114);
                if (class40.field652 > -1 && class319.field5393 % 20 < 10) {
                    class300.field4872[var9.field3969].method653(class40.field652 + arg4 - 12, class191.field3105 + arg0 + -28);
                }
            }
        }
    }
}
