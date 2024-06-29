import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class15 extends class304 {

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Z")
    public static boolean field320 = false;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "J")
    public static long field322 = 0L;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field325 = new CRC32();

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "J")
    public static long field323;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 7)
    public static void method167(byte arg0) {
        if (arg0 != -59) {
            field320 = false;
        }
        field325 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)I", line = 25)
    public static final int method168(int arg0, int arg1, int arg2, int arg3) {
        field326++;
        if (arg2 == arg3) {
            return arg2;
        }
        int var4 = 128 - arg0;
        if (arg1 != -27014) {
            field325 = (CRC32) null;
        }
        int var5 = (arg2 & 0xFF00FF) * var4 + ((arg3 & 0xFF00FF) * arg0) & 0xFF00FF00;
        int var6 = ((arg3 & -16711936) >>> 7) * arg0 + (arg2 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
        return (var5 >> 7) + var6;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIII)I", line = 59)
    public static final int method169(int arg0, int arg1, int arg2, int arg3) {
        field321++;
        if (class96.field1764 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        if (arg1 != 13257) {
            method167((byte) -4);
        }
        int var6 = arg3 & 0x7F;
        int var7 = arg2;
        if (arg2 < 3 && (class82.field1508[1][var5][var4] & 0x2) == 2) {
            var7 = arg2 + 1;
        }
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var6) * class96.field1764[var7][var5][var4] + class96.field1764[var7][var5 + 1][var4] * var6 >> 7;
        int var10 = (128 - var6) * class96.field1764[var7][var5][var4 + 1] + (class96.field1764[var7][var5 + 1][var4 + 1] * var6) >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 93)
    public static final void method170(int arg0) {
        field324++;
        if ((class298.field5138 < class106.field1965)) {
            class298.field5138 = (float) ((double) class298.field5138 / 30.0D + (double) class298.field5138);
            if (class106.field1965 < class298.field5138) {
                class298.field5138 = class106.field1965;
            }
            class155.method1117((byte) -26);
        } else if (class106.field1965 < class298.field5138) {
            class298.field5138 = (float) ((double) class298.field5138 - (double) class298.field5138 / 30.0D);
            if (class106.field1965 > class298.field5138) {
                class298.field5138 = class106.field1965;
            }
            class155.method1117((byte) -24);
        }
        if (arg0 != 1 || class255.field4436 == -1 || class189.field3257 == -1) {
            return;
        }
        int var1 = class189.field3257 - class274.field4699;
        int var2 = class255.field4436 - class69.field1335;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class274.field4699 -= -var1;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var2 == 0 && var1 == 0) {
            class255.field4436 = -1;
            class189.field3257 = -1;
        }
        class69.field1335 -= -var2;
        class155.method1117((byte) -83);
    }
}
