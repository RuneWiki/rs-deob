import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class420 {

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public int field5439;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Lji;")
    private class622 field5438;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
    public static int[] field5434 = new int[2048];

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "F")
    public static float field5435;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public static void method2419(boolean arg0) {
        if (arg0) {
            field5434 = null;
        }
        field5434 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2420(char arg0, int arg1, String arg2) {
        field5433++;
        int var3 = class134.method976(arg0, 1, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        int var7 = -47 % ((arg1 + 32) / 52);
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var6; arg2.charAt(var9) != arg0; var9++) {
            }
            var4[var5++] = arg2.substring(var6, var9);
            var6 = var9 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)Z")
    public static final boolean method2421(int arg0, int arg1, int arg2) {
        if (arg2 != 10520) {
            field5434 = null;
        }
        field5432++;
        return class491.method2684(arg1, (byte) 5, arg0) || class314.method1832(arg1, arg0, true);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2422(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2419(true);
        }
        field5437++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!mt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5436++;
        this.field5438.method3423((byte) -49, this.field5439);
        super.finalize();
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lji;II)V")
    public class420(class622 arg0, int arg1, int arg2) {
        this.field5439 = arg2;
        this.field5438 = arg0;
    }
}
