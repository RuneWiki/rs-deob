import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class23 {

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "Lk;")
    public static class21 field280 = class14.method92((byte) 57, "");

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "[[B")
    private static byte[][] field281 = new byte[1000][];

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Lk;")
    public static class21 field279 = class14.method92((byte) 57, "Hair Dressers");

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "Lk;")
    public static class21 field283 = class14.method92((byte) 57, "Rare Trees");

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "Lk;")
    public static class21 field284 = class14.method92((byte) 57, "50(U");

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "Lk;")
    private static class21 field285 = class14.method92((byte) 57, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "Lk;")
    public static class21 field282 = field285;

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "Lk;")
    public static class21 field286 = class14.method92((byte) 57, "Silver Shop");

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "[Lk;")
    public static class21[] field276;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 4)
    public static final void method151(byte arg0, Component arg1) {
        arg1.removeMouseListener(class28.field341);
        arg1.removeMouseMotionListener(class28.field341);
        if (arg0 > -125) {
            method151((byte) -32, null);
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)[Lc;", line = 26)
    public static final class5[] method152(byte arg0) {
        class5[] var1 = new class5[class19.field242];
        int var2 = 0;
        if (arg0 <= 45) {
            return (class5[]) null;
        }
        while (class19.field242 > var2) {
            class5 var3 = var1[var2] = new class5();
            var3.field100 = class6.field136;
            var3.field96 = class14.field192;
            var3.field97 = class26.field331[var2];
            var3.field102 = class32.field385[var2];
            var3.field98 = class19.field239[var2];
            var3.field95 = class8.field145[var2];
            var3.field99 = class11.field172;
            var3.field101 = class28.field338[var2];
            var2++;
        }
        class19.method114(32);
        return var1;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIILm;)Z", line = 65)
    public static final boolean method153(int arg0, int arg1, int arg2, class25 arg3) {
        byte[] var4 = arg3.method162(arg1, false, arg0);
        if (var4 == null) {
            return false;
        } else if (arg2 == 5000) {
            class27.method174(var4, -3);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II)[B", line = 97)
    public static final synchronized byte[] method154(int arg0, int arg1) {
        if (arg0 == 100 && class10.field164 > 0) {
            byte[] var2 = field281[--class10.field164];
            field281[class10.field164] = null;
            return var2;
        } else if (arg1 != 0) {
            return (byte[]) null;
        } else if (arg0 == 5000 && class30.field362 > 0) {
            byte[] var3 = class3.field81[--class30.field362];
            class3.field81[class30.field362] = null;
            return var3;
        } else if (arg0 == 30000 && class3.field88 > 0) {
            byte[] var4 = class14.field189[--class3.field88];
            class14.field189[class3.field88] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)Lba;", line = 148)
    public static final class4 method155(int arg0) {
        int var1 = -17 % ((-arg0 - 33) / 52);
        class4 var2 = new class4(class32.field385, class19.field239, class8.field145, class11.field172, class28.field338);
        class19.method114(32);
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)V", line = 159)
    public static void method156(int arg0) {
        field279 = null;
        int var1 = 21 % ((46 - arg0) / 61);
        field285 = null;
        field281 = null;
        field282 = null;
        field286 = null;
        field276 = null;
        field284 = null;
        field283 = null;
        field280 = null;
    }
}
