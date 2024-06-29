import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
    public static int[] field859 = new int[5];

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field862 = 0;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lec;")
    public static class28 field865 = class28.method210(-46, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lec;")
    public static class28 field861 = class28.method210(-46, "Jun");

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lec;")
    public static class28 field870 = class28.method210(-46, "Your profile will be transferred in: ");

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lec;")
    public static class28 field872 = class28.method210(-46, "Apr");

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lec;")
    public static class28 field871 = class28.method210(-46, "@gr1@");

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field860 = -1;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "J")
    public long field869;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lcc;")
    public static class16 field866;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lgd;")
    public class40 field873;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lgd;")
    public class40 field875;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lid;")
    public static class52 field863;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method316(byte arg0) {
        if (arg0 > -88) {
            method318(false, 20);
        }
        field872 = null;
        field871 = null;
        field859 = null;
        field866 = null;
        field861 = null;
        field865 = null;
        field863 = null;
        field870 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lwc;I)V")
    public static final void method317(class128 arg0, int arg1) {
        for (int var2 = 0; var2 < class22.field512.length; var2++) {
            class22.field512[var2] = 0;
        }
        field867++;
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class22.field512[var16] = (int) (Math.random() * 256.0D);
        }
        int var5 = 0;
        if (arg1 >= -43) {
            method317(null, 100);
        }
        while (var5 < 20) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class5.field93[var15] = (class22.field512[var15 + 128] + class22.field512[var15 - 128] + class22.field512[var15 + 1] + class22.field512[var15 + -1]) / 4;
                }
            }
            int[] var13 = class22.field512;
            class22.field512 = class5.field93;
            class5.field93 = var13;
            var5++;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2759; var7++) {
            for (int var8 = 0; var8 < arg0.field2756; var8++) {
                if (arg0.field2754[var6++] != 0) {
                    int var9 = var8 + arg0.field2757 + 16;
                    int var10 = var7 + arg0.field2755 + 16;
                    int var11 = (var10 << 7) + var9;
                    class22.field512[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
    public static final void method318(boolean arg0, int arg1) {
        field874++;
        if (arg1 == -1 || !class105.field2210[arg1]) {
            return;
        }
        class98.field2162.method933(arg1, (byte) -66);
        if (class18.field372[arg1] == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < class18.field372[arg1].length; var3++) {
            if (class18.field372[arg1][var3] != null) {
                if (class18.field372[arg1][var3].field1757 == 2) {
                    var2 = false;
                } else {
                    class18.field372[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class18.field372[arg1] = null;
        }
        class105.field2210[arg1] = false;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public final void method319(byte arg0) {
        field864++;
        int var2 = 52 / ((arg0 + 91) / 35);
        if (this.field875 != null) {
            this.field875.field873 = this.field873;
            this.field873.field875 = this.field875;
            this.field875 = null;
            this.field873 = null;
        }
    }
}
