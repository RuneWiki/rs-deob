import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class126 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "[I")
    private int[] field3064;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3056 = 0;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lv;")
    private static class122 field3060 = class55.method425(-62, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lv;")
    public static class122 field3062 = class55.method425(-87, "oberen Rand der Webseite ausw\u001c1hlen)3");

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lv;")
    public static class122 field3065 = class55.method425(-79, ")3");

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "[I")
    public static int[] field3067 = new int[1000];

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lv;")
    public static class122 field3054 = field3060;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lv;")
    public static class122 field3066 = class55.method425(-124, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[Lrd;")
    public static class106[] field3061 = new class106[256];

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lab;")
    public static class3 field3058;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Lab;")
    public static class3 field3063;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lqb;")
    public static class98 field3057;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[B)[B", line = 14)
    public static final byte[] method997(int arg0, byte[] arg1) {
        class64 var2 = new class64(arg1);
        int var3 = var2.method520(arg0 ^ 0xFFFFFF84);
        field3068++;
        int var4 = var2.method487(128);
        if (var4 < arg0 || class19.field513 != 0 && var4 > class19.field513) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method484(0, var5, true, var4);
            return var5;
        } else {
            int var6 = var2.method487(128);
            if (var6 < 0 || class19.field513 != 0 && var6 > class19.field513) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class121.method927(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 74)
    public static void method998(int arg0) {
        field3067 = null;
        if (arg0 != 27672) {
            return;
        }
        field3057 = null;
        field3058 = null;
        field3062 = null;
        field3066 = null;
        field3054 = null;
        field3065 = null;
        field3061 = null;
        field3063 = null;
        field3060 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Ltb;", line = 104)
    public static final class114 method999(byte arg0, int arg1) {
        class114 var2 = (class114) class100.field2469.method436(-61, (long) arg1);
        field3055++;
        if (arg0 != 88) {
            method997(16, null);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class62.field1590.method611(0, 13, arg1);
        class114 var4 = new class114();
        var4.field2785 = arg1;
        if (var3 != null) {
            var4.method878(new class64(var3), -125);
        }
        class100.field2469.method437((long) arg1, var4, (byte) 69);
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)I", line = 156)
    public final int method1000(byte arg0, int arg1) {
        int var3 = this.field3064.length - 2;
        int var4 = arg1 << 1 & var3;
        field3069++;
        if (arg0 >= -38) {
            return 23;
        }
        while (true) {
            int var5 = this.field3064[var4];
            if (arg1 == var5) {
                return this.field3064[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([I)V", line = 193)
    public class126(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field3064 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3064[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3064[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3064[var5 + var5] = arg0[var4];
            this.field3064[var5 + var5 + 1] = var4++;
        }
    }
}
