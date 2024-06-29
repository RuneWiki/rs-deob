import java.util.Random;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class205 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Z")
    public static volatile boolean field3636 = true;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Loc;")
    private static class151 field3641 = class137.method873(2, "Cancel");

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Loc;")
    public static class151 field3634 = field3641;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3638 = 0;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "[I")
    public static int[] field3642 = new int[2000];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3635;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[[Z")
    public static boolean[][] field3637;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static final void method1296(int arg0) {
        field3639++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class117.field2108 - 1; var2++) {
                if (class185.field3316[var2] < 1000 && class185.field3316[var2 + 1] > 1000) {
                    var1 = false;
                    class151 var3 = class225.field3916[var2];
                    class225.field3916[var2] = class225.field3916[var2 + 1];
                    class225.field3916[var2 + 1] = var3;
                    class151 var4 = class182.field3305[var2];
                    class182.field3305[var2] = class182.field3305[var2 + 1];
                    class182.field3305[var2 + 1] = var4;
                    int var5 = class117.field2109[var2];
                    class117.field2109[var2] = class117.field2109[var2 + 1];
                    class117.field2109[var2 + 1] = var5;
                    int var6 = class115.field2041[var2];
                    class115.field2041[var2] = class115.field2041[var2 + 1];
                    class115.field2041[var2 + 1] = var6;
                    short var7 = class185.field3316[var2];
                    class185.field3316[var2] = class185.field3316[var2 + 1];
                    class185.field3316[var2 + 1] = var7;
                    long var8 = class179.field3247[var2];
                    class179.field3247[var2] = class179.field3247[var2 + 1];
                    class179.field3247[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != -1) {
            field3641 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)[B")
    public static final byte[] method1297(byte arg0, int arg1) {
        if (arg0 < 51) {
            method1297((byte) 92, 98);
        }
        field3640++;
        class226 var2 = (class226) class113.field2021.method1318((byte) -39, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class3.method28(var4, 88, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class226(var3);
            class113.field2021.method1324(var2, 18373, (long) arg1);
        }
        return var2.field3940;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class205() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lwa;[BZ)V")
    public final void method1298(class229 arg0, byte[] arg1, boolean arg2) {
        field3643++;
        if (arg2) {
            method1297((byte) -51, 13);
        }
        if (arg0.field4087[arg0.field4101] != 31 || arg0.field4087[arg0.field4101 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3635 == null) {
            this.field3635 = new Inflater(true);
        }
        try {
            this.field3635.setInput(arg0.field4087, arg0.field4101 + 10, -8 - (10 - arg0.field4087.length + arg0.field4101));
            this.field3635.inflate(arg1);
        } catch (Exception var4) {
            this.field3635.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3635.reset();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static void method1299(boolean arg0) {
        if (arg0) {
            field3641 = null;
        }
        field3641 = null;
        field3637 = null;
        field3634 = null;
        field3642 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(III)V")
    private class205(int arg0, int arg1, int arg2) {
    }
}
