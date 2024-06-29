import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class178 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[[I")
    public static int[][] field3266 = new int[104][104];

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Loh;")
    public static class263 field3267 = class253.method1681(-125, ":tradereq:");

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lue;")
    public static class86 field3268;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3269;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[[S")
    public static short[][] field3264;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lue;II)Ldb;")
    public static final class17 method1195(class86 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method576(arg2, 0);
        int var4 = 50 / ((arg1 - 67) / 48);
        field3271++;
        return var3 == null ? null : new class17(var3);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class178() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method1196(int arg0) {
        field3272++;
        class4.field79 = 0;
        int var1 = (class229.field4018.field4688 >> 7) + class93.field1844;
        int var2 = (class229.field4018.field4705 >> 7) + class142.field2596;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class4.field79 = 1;
        }
        if (arg0 != 3199) {
            field3266 = null;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class4.field79 = 1;
        }
        if (class4.field79 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class4.field79 = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)I")
    public static final int method1197(byte arg0, int arg1) {
        field3263++;
        return arg0 == -101 ? arg1 >>> 8 : -66;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z[BLsi;)V")
    public final void method1198(boolean arg0, byte[] arg1, class194 arg2) {
        if (arg0) {
            return;
        }
        field3265++;
        if (arg2.field3469[arg2.field3497] != 31 || arg2.field3469[arg2.field3497 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3269 == null) {
            this.field3269 = new Inflater(true);
        }
        try {
            this.field3269.setInput(arg2.field3469, arg2.field3497 + 10, -8 - arg2.field3497 - (10 - arg2.field3469.length));
            this.field3269.inflate(arg1);
        } catch (Exception var4) {
            this.field3269.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3269.reset();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method1199(int arg0, int arg1) {
        field3270++;
        if (class94.field1857 == null || arg0 > class94.field1857.length) {
            class94.field1857 = new int[arg0];
        }
        if (arg1 > -110) {
            method1197((byte) -122, 0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static void method1200(boolean arg0) {
        field3266 = null;
        field3267 = null;
        field3264 = null;
        field3268 = null;
        if (!arg0) {
            field3274 = 106;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI)Z")
    public static final boolean method1201(byte[] arg0, int arg1) {
        field3273++;
        class194 var2 = new class194(arg0);
        int var3 = var2.method1301(-8317);
        if (var3 != 1) {
            return false;
        }
        int var4 = -34 / ((72 - arg1) / 35);
        boolean var5 = var2.method1301(-8317) == 1;
        if (var5) {
            class64.method395(var2, 6138);
        }
        class241.method1617(-120, var2);
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(III)V")
    private class178(int arg0, int arg1, int arg2) {
    }
}
