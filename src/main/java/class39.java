import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class39 {

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    private int field765 = 0;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    private int field767 = -1;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lea;")
    private class40 field762 = new class40();

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Z")
    public boolean field770 = false;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "[[I")
    private int[][] field763;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "[Lic;")
    private class76[] field768;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Leh;")
    private static class47 field760 = class195.method1282((byte) -4, " from your friend list first)3");

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Leh;")
    public static class47 field758 = field760;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lea;")
    public static class40 field764 = new class40();

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Leh;")
    public static class47 field772 = class195.method1282((byte) -4, "title)3jpg");

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
    public static int[] field771 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Lea;")
    public static class40 field773 = new class40();

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field774 = 0;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Leh;")
    public static class47 field776 = class195.method1282((byte) -4, "leuchten1:");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lgg;")
    public static class62 field775;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public final void method331(int arg0) {
        field761++;
        int var2 = 64 % ((arg0 + 74) / 44);
        for (int var3 = 0; var3 < this.field756; var3++) {
            this.field763[var3] = null;
        }
        this.field763 = null;
        this.field768 = null;
        this.field762.method350(117);
        this.field762 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BIII)Leh;")
    public static final class47 method332(byte[] arg0, int arg1, int arg2, int arg3) {
        field754++;
        class47 var4 = new class47();
        var4.field960 = new byte[arg2];
        var4.field940 = 0;
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field960[var4.field940++] = arg0[var5];
            }
        }
        if (arg1 != -25444) {
            field775 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static void method333(int arg0) {
        int var1 = 119 % ((41 - arg0) / 63);
        field760 = null;
        field772 = null;
        field776 = null;
        field771 = null;
        field775 = null;
        field758 = null;
        field764 = null;
        field773 = null;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)[[I")
    public final int[][] method334(int arg0) {
        field759++;
        if (arg0 > -112) {
            return null;
        } else if (this.field756 == this.field755) {
            for (int var2 = 0; var2 < this.field756; var2++) {
                this.field768[var2] = class142.field2792;
            }
            return this.field763;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
    public static final int method335(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 >> 7;
        field766++;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        if (arg3 != 20896) {
            method333(116);
        }
        int var6 = arg1;
        int var7 = arg0 & 0x7F;
        if (arg1 < 3 && (class182.field3490[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class103.field2171[var6][var4][var5] + class103.field2171[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class103.field2171[var6][var4][var5 - -1] + class103.field2171[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
    public final int[] method336(int arg0, int arg1) {
        field757++;
        if (arg0 > -41) {
            method335(-9, -91, -84, 49);
        }
        if (this.field756 == this.field755) {
            this.field770 = this.field768[arg1] == null;
            this.field768[arg1] = class142.field2792;
            return this.field763[arg1];
        } else if (this.field756 == 1) {
            this.field770 = this.field767 != arg1;
            this.field767 = arg1;
            return this.field763[0];
        } else {
            class76 var3 = this.field768[arg1];
            if (this.field770 = var3 == null) {
                if (this.field756 > this.field765) {
                    var3 = new class76(arg1, this.field765);
                    this.field765++;
                } else {
                    class76 var4 = (class76) this.field762.method344(-28880);
                    var3 = new class76(arg1, var4.field1652);
                    this.field768[var4.field1649] = null;
                    var4.method885(3);
                }
                this.field768[arg1] = var3;
            }
            this.field762.method346(8, var3);
            return this.field763[var3.field1652];
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V")
    public class39(int arg0, int arg1, int arg2) {
        this.field755 = arg1;
        this.field763 = new int[arg0][arg2];
        this.field756 = arg0;
        this.field768 = new class76[arg1];
    }
}
