import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class212 {

    @OriginalMember(owner = "client!re", name = "f", descriptor = "J")
    public long field3849 = 0L;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lhj;")
    public static class69 field3860 = class181.method1318("M", (byte) -124);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Z")
    public static boolean field3859 = false;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lhj;")
    public static class69 field3865 = class181.method1318("; version=1; path=)4; domain=", (byte) -115);

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field3850 = 0;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "[I")
    public static int[] field3861 = new int[2];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lab;")
    public static class142 field3854;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Led;")
    public class177 field3857;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Led;")
    public class177 field3866;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lnc;")
    public static class83 field3845;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3862;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[[[B")
    public static byte[][][] field3858;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZB)I")
    public static final int method1528(boolean arg0, byte arg1) {
        field3853++;
        long var2 = class223.method1584(arg1 - 25346);
        if (arg1 != -46) {
            return 15;
        }
        for (class207 var4 = arg0 ? (class207) class103.field1920.method768((byte) 122) : (class207) class103.field1920.method760(arg1 - 15679); var4 != null; var4 = (class207) class103.field1920.method760(-15725)) {
            if (var2 > (var4.field3774 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3774 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1685;
                    class50.field812[var5] = class258.field4629[var5];
                    var4.method632(-8296);
                    return var5;
                }
                var4.method632(-8296);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI[Lhj;)Lhj;")
    public static final class69 method1529(int arg0, boolean arg1, int arg2, class69[] arg3) {
        field3863++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class246.field4503;
            }
            var4 += arg3[arg0 + var5].field1331;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg1) {
            return null;
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            class69 var10 = arg3[arg0 + var8];
            class1.method4(var10.field1351, 0, var6, var7, var10.field1331);
            var7 += var10.field1331;
        }
        class69 var9 = new class69();
        var9.field1331 = var4;
        var9.field1351 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1530(int arg0, boolean arg1) {
        field3844++;
        if (arg1) {
            field3859 = false;
        }
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lhj;I)V")
    public static final void method1531(class69 arg0, int arg1) {
        field3855++;
        int var2 = 47 / ((arg1 + 52) / 63);
        for (class49 var3 = (class49) class258.field4619.method1724(255); var3 != null; var3 = (class49) class258.field4619.method1726(125)) {
            if (var3.field712.method444((byte) -24, arg0)) {
                class21.field299 = var3;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method1532(byte arg0) {
        if (arg0 != 37) {
            method1530(61, false);
        }
        field3861 = null;
        field3854 = null;
        field3865 = null;
        field3862 = null;
        field3860 = null;
        field3858 = null;
        field3845 = null;
    }
}
