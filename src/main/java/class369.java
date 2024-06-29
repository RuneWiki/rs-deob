import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class369 extends class235 {

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "Z")
    public volatile boolean field5481 = true;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "Ljava/lang/String;")
    public static String field5479 = "yellow:";

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "Ljava/lang/String;")
    public static String field5482 = "wave:";

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public static int field5483 = 0;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    public static int field5489 = 0;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "Z")
    public boolean field5480;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "Z")
    public boolean field5484;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2433(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)[B")
    public abstract byte[] method461(int arg0);

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V")
    public static void method2434(int arg0) {
        field5479 = null;
        if (arg0 != 0) {
            field5483 = -51;
        }
        field5482 = null;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)I")
    public abstract int method462(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lo;Lo;I)V")
    public static final void method2435(class393 arg0, class393 arg1, int arg2) {
        field5485++;
        if (arg1.field5898 != null) {
            arg1.method2574((byte) 127);
        }
        arg1.field5895 = arg0;
        if (arg2 != 2564) {
            field5483 = 122;
        }
        arg1.field5898 = arg0.field5898;
        arg1.field5898.field5895 = arg1;
        arg1.field5895.field5898 = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method2436(byte arg0, String arg1, char arg2) {
        field5486++;
        int var3 = class151.method984(true, arg2, arg1);
        if (arg0 <= 95) {
            method2436((byte) -103, (String) null, (char) 65418);
        }
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }
}
