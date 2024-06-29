import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class9 extends Canvas {

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field105;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Lna;")
    private static class26 field101 = class6.method40("Candle Shop", 48);

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "I")
    public static int field104 = -1;

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "Lna;")
    public static class26 field106 = class6.method40("floorcol)3dat", 48);

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Lm;")
    public static class23 field100 = new class23();

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "Lna;")
    private static class26 field107 = class6.method40("Mini)2Game", 48);

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "Lna;")
    private static class26 field109 = class6.method40("Holiday Event", 48);

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Ljava/awt/Image;")
    public static Image field103;

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field108;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "[I")
    public static int[] field102;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(II[BI)Lna;", line = 5)
    public static final class26 method56(int arg0, int arg1, byte[] arg2, int arg3) {
        class26 var4 = new class26();
        var4.field375 = 0;
        var4.field371 = new byte[arg3];
        int var5 = arg1;
        if (arg0 != 9) {
            return (class26) null;
        }
        while (var5 < arg1 + arg3) {
            if (arg2[var5] != 0) {
                var4.field371[var4.field375++] = arg2[var5];
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Z)[Lna;", line = 38)
    public static final class26[] method57(boolean arg0) {
        if (arg0) {
            method57(true);
        }
        return new class26[] { class7.field83, class14.field166, class21.field217, class23.field243, class4.field53, class34.field440, class2.field33, class6.field78, class2.field26, class12.field155, class21.field222, class38.field495, class7.field86, class33.field428, class1.field6, class26.field370, class38.field469, class8.field90, class25.field362, class34.field443, class39.field509, class13.field161, class19.field210, class33.field426, field101, class1.field7, class38.field488, class2.field36, class5.field60, class25.field364, class32.field415, class10.field118, class25.field361, class6.field77, class12.field140, class23.field242, mapview.field341, class18.field198, field107, class38.field503, class38.field491, class4.field47, class34.field437, class32.field416, class31.field402, class5.field59, class31.field406, class26.field377, mapview.field345, class11.field133, class25.field360, class21.field218, class12.field142, class33.field422, class22.field230, class34.field442, class25.field365, class5.field62, class13.field164, class22.field226, class31.field409, class14.field168, class38.field481, class32.field419, class38.field481, class10.field110, class38.field481, class12.field147, class20.field211, class38.field481, class14.field170, class31.field404, field109, class6.field81, class38.field481, class38.field481 };
    }

    @OriginalMember(owner = "mapview!ea", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 53)
    public final void update(Graphics arg0) {
        this.field105.update(arg0);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ZIII)Lna;", line = 64)
    public static final class26 method58(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        int var5 = arg3 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg3 /= arg1;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        if (arg2 >= -39) {
            return (class26) null;
        } else {
            class26 var10 = new class26();
            var10.field371 = var7;
            var10.field375 = var6;
            return var10;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 132)
    public static void method59(int arg0) {
        field106 = null;
        field101 = null;
        if (arg0 != 48) {
            field101 = null;
        }
        field107 = null;
        field103 = null;
        field102 = null;
        field108 = null;
        field100 = null;
        field109 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 153)
    public final void paint(Graphics arg0) {
        this.field105.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 164)
    public class9(Component arg0) {
        this.field105 = arg0;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILna;La;Lna;)[Lo;", line = 186)
    public static final class27[] method60(int arg0, class26 arg1, class1 arg2, class26 arg3) {
        int var4 = arg2.method10(false, arg1);
        if (arg0 != 25691) {
            field100 = null;
        }
        int var5 = arg2.method11(arg3, var4, (byte) -125);
        return class6.method41(var5, var4, arg2, (byte) 121);
    }
}
