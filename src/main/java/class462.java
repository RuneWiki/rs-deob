import java.util.Random;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class462 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "J")
    public static long field6681 = -1L;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lkc;")
    public static class157 field6682 = new class157("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field6685 = 0;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field6688 = -50;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lhi;")
    public static class45 field6686 = new class45(59, 18);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6679;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[Ltv;")
    public static class293[] field6687;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lfk;B)Z")
    public static final boolean method2684(class92 arg0, byte arg1) {
        field6678++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field1508) {
            return false;
        } else if (!arg0.method749(arg1 ^ 0x25, class472.field6801)) {
            return false;
        } else if (class316.field4301.method1592((byte) -25, (long) arg0.field1501) == null) {
            if (arg1 != -115) {
                field6681 = -116L;
            }
            return class345.field4975.method1592((byte) -25, (long) arg0.field1502) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)[B")
    public static final byte[] method2685(byte arg0, int arg1) {
        field6683++;
        if (arg0 > -31) {
            method2687(32);
        }
        class461 var2 = (class461) class351.field5100.method2371((long) arg1, -65);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class322.method1908(var7, -127, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class461(var3);
            class351.field5100.method2370(28281, (long) arg1, var2);
        }
        return var2.field6674;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BLsv;B)V")
    public final void method2686(byte[] arg0, class319 arg1, byte arg2) {
        field6684++;
        if (arg1.field4336[arg1.field4360] != 31 || arg1.field4336[arg1.field4360 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6679 == null) {
            this.field6679 = new Inflater(true);
        }
        try {
            this.field6679.setInput(arg1.field4336, arg1.field4360 + 10, arg1.field4336.length + -arg1.field4360 + -18);
            this.field6679.inflate(arg0);
        } catch (Exception var5) {
            this.field6679.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        int var4 = 10 % ((arg2 + 23) / 47);
        this.field6679.reset();
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
    public class462() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method2687(int arg0) {
        field6682 = null;
        field6686 = null;
        if (arg0 == 255) {
            field6687 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(III)V")
    private class462(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)I")
    public static final int method2688(int arg0, boolean arg1) {
        if (arg1) {
            field6680++;
            return arg0 >> 11 & 0x7F;
        } else {
            return 69;
        }
    }
}
