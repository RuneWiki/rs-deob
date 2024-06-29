import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class489 extends class115 {

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "S")
    public short field7287;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field7288 = 0;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Ldp;")
    public static class347 field7286 = new class347("M", "M", "M", "M");

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Ljava/lang/String;")
    public static String field7291 = "";

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "[B")
    public static byte[] field7292 = new byte[32896];

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "F")
    public static float field7289;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field7290;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field7292[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lba;III[Z)V", line = 7)
    public static final void method2918(class502 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class420.field6281 == class249.field3405) {
            return;
        }
        int var5 = class213.field3048[arg1].method718(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class337 var7 = class213.field3048[var6];
                if (var7 != null) {
                    var7.method706(arg0, arg2, var5 - var7.method718(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V", line = 33)
    public static void method2919(byte arg0) {
        field7291 = null;
        if (arg0 < 126) {
            method2918(null, -91, -102, 71, null);
        }
        field7286 = null;
        field7292 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IC)C", line = 45)
    public static final char method2920(int arg0, char arg1) {
        field7285++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (~arg1 == arg0 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 70)
    public class489() {
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(S)V", line = 72)
    public class489(short arg0) {
        this.field7287 = arg0;
    }
}
