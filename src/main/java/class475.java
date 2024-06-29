import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class475 {

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public int field6777;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lwba;")
    public static class46 field6773 = new class46();

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "[[B")
    public static byte[][] field6774;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(CI)Z", line = 5)
    public static final boolean method2786(char arg0, int arg1) {
        field6778++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class497.field7043;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (arg1 <= 78) {
            field6775 = 85;
        }
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 38)
    public static void method2787(int arg0) {
        field6773 = null;
        field6774 = null;
        int var1 = 109 % ((arg0 - 37) / 61);
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(II)V", line = 53)
    public class475(int arg0, int arg1) {
        this.field6777 = arg0;
    }

    @OriginalMember(owner = "client!gq", name = "toString", descriptor = "()Ljava/lang/String;", line = 63)
    public final String toString() {
        field6779++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 71)
    public static final void method2788(int arg0) throws IOException {
        field6776++;
        if (arg0 != 0) {
            field6773 = null;
        }
        if (class274.field4181 == null || class451.field6497 <= 0) {
            return;
        }
        int var1 = 0;
        while (true) {
            class135 var2 = (class135) class307.field4539.method472((byte) -100);
            if (var2 == null) {
                class66.field1222 = 0;
                class23.field313 += var1;
                return;
            }
            class274.field4181.method2235(false, var2.field1978.field9796, var2.field1980, 0);
            class451.field6497 -= var2.field1980;
            var1 += var2.field1980;
            var2.method3678(-1);
            var2.field1978.method3881(false);
            var2.method985((byte) 127);
        }
    }
}
