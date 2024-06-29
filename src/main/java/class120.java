import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static volatile int field3065 = -1;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lkd;")
    public static class73 field3061 = class126.method1070((byte) -66, ")1p");

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lkd;")
    private static class73 field3073 = class126.method1070((byte) -66, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lkd;")
    private static class73 field3077 = class126.method1070((byte) -66, "Connecting to update server");

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lkd;")
    private static class73 field3072 = class126.method1070((byte) -66, "Continue");

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lkd;")
    public static class73 field3064 = field3077;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[I")
    public static int[] field3070 = new int[4000];

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lkd;")
    public static class73 field3062 = field3072;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lkd;")
    public static class73 field3074 = class126.method1070((byte) -66, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lkd;")
    public static class73 field3078 = class126.method1070((byte) -66, "Benutzen");

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lkd;")
    private static class73 field3076 = class126.method1070((byte) -66, "Could not complete login)3");

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lkd;")
    public static class73 field3069 = field3073;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lkd;")
    public static class73 field3071 = field3076;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3075;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[[La;")
    public static class1[][] field3066;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BLb;[Lge;IB)V")
    public static final void method1031(int arg0, byte[] arg1, class8 arg2, class47[] arg3, int arg4, byte arg5) {
        field3063++;
        class114 var6 = new class114(arg1);
        int var7 = -1;
        if (arg5 < 33) {
            field3073 = null;
        }
        while (true) {
            int var8 = var6.method963((byte) -116);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method963((byte) -116);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 & 0x3F;
                int var14 = var6.method957((byte) 67);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg4 + var11;
                int var18 = arg0 + var13;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var12;
                    class47 var20 = null;
                    if ((class55.field1482[1][var17][var18] & 0x2) == 2) {
                        var19 = var12 - 1;
                    }
                    if (var19 >= 0) {
                        var20 = arg3[var19];
                    }
                    class129.method1083(var12, var18, var15, arg2, var16, var7, var20, var17, (byte) -115);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lqc;[BI)V")
    public final void method1032(class114 arg0, byte[] arg1, int arg2) {
        field3060++;
        if (arg0.field2880[arg0.field2816] != 31 || arg0.field2880[arg0.field2816 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3075 == null) {
            this.field3075 = new Inflater(true);
        }
        try {
            this.field3075.setInput(arg0.field2880, arg0.field2816 + arg2, -10 - arg0.field2816 + arg0.field2880.length + -8);
            this.field3075.inflate(arg1);
        } catch (Exception var4) {
            this.field3075.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3075.reset();
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class120() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1033(byte arg0) {
        field3076 = null;
        field3062 = null;
        field3066 = null;
        if (arg0 != 106) {
            return;
        }
        field3072 = null;
        field3074 = null;
        field3069 = null;
        field3071 = null;
        field3064 = null;
        field3077 = null;
        field3070 = null;
        field3061 = null;
        field3073 = null;
        field3078 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(III)V")
    private class120(int arg0, int arg1, int arg2) {
    }
}
