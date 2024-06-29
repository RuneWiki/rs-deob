import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lsc;")
    private static class128 field371 = class129.method1017(false, " is already on your friend list)3");

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lsc;")
    public static class128 field366 = class129.method1017(false, "titlebox");

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field375 = 0;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lsc;")
    private static class128 field379 = class129.method1017(false, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lsc;")
    public static class128 field369 = field371;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lsc;")
    private static class128 field380 = class129.method1017(false, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lsc;")
    public static class128 field376 = field380;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lsc;")
    private static class128 field382 = class129.method1017(false, "level)2");

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lsc;")
    public static class128 field373 = class129.method1017(false, "<img=1>");

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lsc;")
    public static class128 field374 = class129.method1017(false, "");

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Lsc;")
    public static class128 field388 = class129.method1017(false, "<col=ffff00>*V");

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Lsc;")
    public static class128 field390 = field382;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lsc;")
    public static class128 field383 = field379;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Lsc;")
    public static class128 field385 = class129.method1017(false, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "J")
    public long field365;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lsf;")
    public static class131 field381;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lce;")
    public class20 field368;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lce;")
    public class20 field372;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lmf;")
    public static class89 field367;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "[I")
    public static int[] field386;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "[I")
    public static int[] field389;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[Lb;")
    public static class8[] field387;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[S")
    public static short[] field364;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z")
    public final boolean method171(byte arg0) {
        field378++;
        if (this.field372 == null) {
            return false;
        } else {
            return arg0 == 104;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (arg0 != -2658) {
            field375 = 26;
        }
        field377++;
        if (this.field372 != null) {
            this.field372.field368 = this.field368;
            this.field368.field372 = this.field372;
            this.field368 = null;
            this.field372 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLhe;)Lhe;")
    public static final class54 method173(byte arg0, class54 arg1) {
        int var2 = 98 % ((-arg0 - 53) / 32);
        field384++;
        class54 var3 = class153.method1213(0, arg1);
        if (var3 == null) {
            var3 = arg1.field1130;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static void method174(byte arg0) {
        field386 = null;
        field380 = null;
        field364 = null;
        field387 = null;
        field369 = null;
        field374 = null;
        field389 = null;
        field382 = null;
        field379 = null;
        field388 = null;
        field373 = null;
        field383 = null;
        field390 = null;
        field371 = null;
        field367 = null;
        field385 = null;
        if (arg0 != 43) {
            field380 = null;
        }
        field381 = null;
        field366 = null;
        field376 = null;
    }
}
