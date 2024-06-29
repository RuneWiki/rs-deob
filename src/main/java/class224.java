import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class224 implements class479 {

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Z")
    public static final boolean method1495(int arg0, int arg1, int arg2) {
        if (arg0 == 55) {
            field3355++;
            return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1496(long arg0, int arg1) {
        field3356++;
        class89.field1599.setTime(new Date(arg0));
        int var3 = class89.field1599.get(7);
        if (arg1 != -673) {
            return null;
        }
        int var4 = class89.field1599.get(5);
        int var5 = class89.field1599.get(2);
        int var6 = class89.field1599.get(1);
        int var7 = class89.field1599.get(11);
        int var8 = class89.field1599.get(12);
        int var9 = class89.field1599.get(13);
        return class235.field3471[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class412.field6109[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3354++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class224(String arg0, int arg1) {
        this.field3357 = arg1;
    }

    static {
        new class567("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }
}
