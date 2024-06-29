import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
    public boolean field839 = true;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field832 = new Object();

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public int field847 = 0;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "[I")
    public int[] field848 = new int[500];

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "[I")
    public int[] field849 = new int[500];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lva;")
    private static class121 field838 = class107.method797("Welcome to RuneScape", -10983);

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
    public static int[] field837 = new int[128];

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lva;")
    private static class121 field843 = class107.method797("Please reload this page)3", -10983);

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
    public static int[] field844 = new int[500];

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lva;")
    public static class121 field840 = field838;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field845 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[Lr;")
    public static class100[] field842 = new class100[12];

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lva;")
    public static class121 field835 = field843;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V", line = 21)
    public final void run() {
        field831++;
        while (this.field839) {
            Object var1 = this.field832;
            synchronized (this.field832) {
                if (this.field847 < 500) {
                    this.field849[this.field847] = class34.field822;
                    this.field848[this.field847] = class19.field514;
                    this.field847++;
                }
            }
            class113.method833(50L, true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIII)I", line = 60)
    public static final int method241(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field846 = 108;
        }
        field833++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lva;", line = 86)
    public static final class121 method242(int arg0, int arg1) {
        if (arg1 == 10) {
            field834++;
            return class66.method471(false, 10, arg0, (byte) 37);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B[B)[B", line = 98)
    public static final byte[] method243(byte arg0, byte[] arg1) {
        class113 var2 = new class113(arg1);
        if (arg0 != 98) {
            return null;
        }
        int var3 = var2.method821(true);
        int var4 = var2.method822(-708753192);
        field841++;
        if (var4 < 0 || class44.field1005 != 0 && class44.field1005 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method828(14362, var4, 0, var5);
            return var5;
        } else {
            int var6 = var2.method822(-708753192);
            if (var6 < 0 || class44.field1005 != 0 && class44.field1005 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class106.method789(var7, var6, arg1, var4, 9);
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

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 170)
    public static void method244(int arg0) {
        field837 = null;
        field835 = null;
        field843 = null;
        field840 = null;
        field842 = null;
        field844 = null;
        field838 = null;
        if (arg0 != 0) {
            method244(-39);
        }
    }
}
