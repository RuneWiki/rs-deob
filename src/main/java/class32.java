import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public abstract class class32 {

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "I")
    public static int field412 = 0;

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "Lw;")
    public static class38 field413 = class35.method219("Apothecary", true);

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "Z")
    public static volatile boolean field417 = true;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "I")
    public static int field411 = -1;

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Lw;")
    public static class38 field414 = class35.method219("floorcol)3dat", true);

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "Lw;")
    public static class38 field415 = class35.method219("Candle Shop", true);

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "[[B")
    public static byte[][] field418;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lw;Lw;Lha;B)Lja;", line = 13)
    public static final class17 method193(class38 arg0, class38 arg1, class13 arg2, byte arg3) {
        int var4 = arg2.method61(92, arg0);
        int var5 = arg2.method63(var4, (byte) 121, arg1);
        if (arg3 > -86) {
            method195(2);
        }
        return class6.method24(92, arg2, var5, var4);
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)V", line = 39)
    public static void method195(int arg0) {
        field415 = null;
        field418 = null;
        if (arg0 > -80) {
            field412 = -55;
        }
        field414 = null;
        field413 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(I)[Ld;", line = 60)
    public static final class7[] method197(int arg0) {
        class7[] var1 = new class7[class19.field187];
        if (arg0 != 255) {
            method197(6);
        }
        for (int var2 = 0; var2 < class19.field187; var2++) {
            class7 var3 = var1[var2] = new class7();
            var3.field51 = class35.field480[var2];
            var3.field50 = class23.field242[var2];
            var3.field54 = class38.field505[var2];
            var3.field53 = class31.field401[var2];
            byte[] var4 = field418[var2];
            int var5 = var3.field54 * var3.field53;
            var3.field52 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field52[var6] = class1.field6[class18.method100(255, var4[var6])];
            }
        }
        class27.method168((byte) 119);
        return var1;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)[B")
    public abstract byte[] method194(int arg0);

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B[B)V")
    public abstract void method196(byte arg0, byte[] arg1);
}
