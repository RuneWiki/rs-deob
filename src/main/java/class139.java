import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class139 extends class184 {

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Ljava/lang/String;")
    public String field1856;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 10)
    public class139() {
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 12)
    public class139(String arg0) {
        this.field1856 = arg0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)S", line = 20)
    public static final short method982(int arg0, int arg1) {
        field1854++;
        int var2 = (arg0 & 0xFEE8) >> 10;
        if (arg1 != -16614) {
            method982(-20, 30);
        }
        int var3 = (arg0 & 0x383) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }
}
