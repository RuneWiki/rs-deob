import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 extends RuntimeException {

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field95;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Ljava/lang/String;")
    public String field92;

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Z")
    public static boolean field93 = true;

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Ld;")
    public static class7 field96 = class37.method242("Cooking Range", 1333943984);

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lq;")
    public static class31 field94 = new class31();

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "Ld;")
    public static class7 field101 = class37.method242("Suchen", 1333943984);

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Ld;")
    public static class7 field98 = class37.method242("Amulet Shop", 1333943984);

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Ld;")
    public static class7 field97 = class37.method242("Find", 1333943984);

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "mapview!da", name = "k", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)V", line = 10)
    public static final void method80(byte arg0) {
        class31 var1 = field94;
        synchronized (field94) {
            class21.field212 = class37.field507;
            if (arg0 != -79) {
                method82(null, 107, (byte) -12, 38);
            }
            if (class37.field506 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class21.field205[var2] = false;
                }
                class37.field506 = class1.field2;
            } else {
                while (class37.field506 != class1.field2) {
                    int var3 = class29.field428[class1.field2];
                    class1.field2 = class1.field2 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class21.field205[var3] = true;
                    } else {
                        class21.field205[~var3] = false;
                    }
                }
            }
            class37.field507 = class31.field455;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(B)V", line = 54)
    public static void method81(byte arg0) {
        if (arg0 < 52) {
            field97 = null;
        }
        field97 = null;
        field98 = null;
        field94 = null;
        field101 = null;
        field96 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "([BIBI)Ld;", line = 99)
    public static final class7 method82(byte[] arg0, int arg1, byte arg2, int arg3) {
        class7 var4 = new class7();
        var4.field90 = 0;
        var4.field79 = new byte[arg1];
        int var5 = arg3;
        if (arg2 != -114) {
            field98 = null;
        }
        while (var5 < arg1 + arg3) {
            if (arg0[var5] != 0) {
                var4.field79[var4.field90++] = arg0[var5];
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 142)
    public class8(Throwable arg0, String arg1) {
        this.field95 = arg0;
        this.field92 = arg1;
    }
}
