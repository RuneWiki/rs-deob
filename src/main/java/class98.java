import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class98 {

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lls;")
    private class99 field1387;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lii;")
    private class412 field1393;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lgq;")
    private class491 field1380;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
    public static int[] field1383 = new int[3];

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lrc;")
    public static class108 field1389 = new class108(86, -1);

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[B")
    public static byte[] field1392 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lch;")
    public static class151 field1390 = new class151("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lkk;")
    private class161 field1385;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lpi;")
    public static class209 field1395;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[Lss;")
    private class189[] field1386;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method805(int arg0) {
        field1384++;
        if (this.field1385 != null) {
            return true;
        }
        if (this.field1380 == null) {
            if (this.field1393.method2467(-21)) {
                return false;
            }
            this.field1380 = this.field1393.method2468(-21, true, 255, 255, (byte) 0);
        }
        if (this.field1380.field6539) {
            return false;
        } else {
            this.field1385 = new class161(this.field1380.method1319(100));
            this.field1386 = new class189[(this.field1385.field2262.length - 5) / 8];
            int var2 = -116 / ((-arg0 - 73) / 43);
            return true;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 37)
    public static void method806(int arg0) {
        field1392 = null;
        field1383 = null;
        field1390 = null;
        if (arg0 != -16643) {
            method806(102);
        }
        field1389 = null;
        field1395 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLq;Lq;I)Lss;", line = 51)
    public final class189 method807(byte arg0, class102 arg1, class102 arg2, int arg3) {
        field1391++;
        if (arg0 >= -39) {
            field1389 = null;
        }
        return this.method810(arg3, arg2, 26900, true, arg1);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I", line = 65)
    public static final int method808(int arg0) {
        field1381++;
        int var1 = 67 / ((arg0 + 31) / 51);
        class89 var2 = class374.field5152;
        boolean var3 = false;
        if (class377.field5192 != 0) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var3 = true;
            var2 = class89.method744(var4, (class248) null, 0, 95, (class65) null, 0);
        }
        long var5 = class10.method51(-3183);
        for (int var7 = 0; var7 < 10000; var7++) {
            var2.method386(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var8 = (int) (class10.method51(-3183) - var5);
        var2.method742(11, 0, 100, 100, -16777216, 0);
        if (var3) {
            var2.method755(-90);
        }
        return var8;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 108)
    public final void method809(boolean arg0) {
        field1388++;
        if (this.field1386 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1386.length; var2++) {
            if (this.field1386[var2] != null) {
                this.field1386[var2].method1329(!arg0);
            }
        }
        if (arg0) {
            this.field1380 = null;
        }
        for (int var3 = 0; var3 < this.field1386.length; var3++) {
            if (this.field1386[var3] != null) {
                this.field1386[var3].method1326((byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILq;IZLq;)Lss;", line = 161)
    private final class189 method810(int arg0, class102 arg1, int arg2, boolean arg3, class102 arg4) {
        field1382++;
        if (this.field1385 == null) {
            throw new RuntimeException();
        }
        this.field1385.field2298 = arg0 * 8 + 5;
        if (this.field1385.field2262.length <= this.field1385.field2298) {
            throw new RuntimeException();
        } else if (this.field1386[arg0] == null) {
            int var6 = this.field1385.method1168(255);
            if (arg2 != 26900) {
                field1392 = null;
            }
            int var7 = this.field1385.method1168(255);
            class189 var8 = new class189(arg0, arg4, arg1, this.field1393, this.field1387, var6, var7, arg3);
            this.field1386[arg0] = var8;
            return var8;
        } else {
            return this.field1386[arg0];
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V", line = 202)
    public static final void method811(int arg0, int arg1) {
        class430.field6008 = -1;
        int var2 = -70 / ((arg0 - 50) / 44);
        field1379++;
        class466.field6571 = -1;
        class309.field4388 = arg1;
        class57.method521((byte) 72);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lii;Lls;)V", line = 214)
    public class98(class412 arg0, class99 arg1) {
        this.field1387 = arg1;
        this.field1393 = arg0;
        if (!this.field1393.method2467(-21)) {
            this.field1380 = this.field1393.method2468(-21, true, 255, 255, (byte) 0);
        }
    }
}
