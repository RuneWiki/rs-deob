import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class JagException extends RuntimeException {

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field103;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Ljava/lang/String;")
    public String field102;

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "Lv;")
    public static JagString field108 = class1.method2(255, "Bank");

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "Lv;")
    public static JagString field110 = class1.method2(255, "Agility Training");

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Lv;")
    public static JagString field104 = class1.method2(255, "world");

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Lv;")
    public static JagString field106 = class1.method2(255, "overlay)3dat");

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "Lv;")
    public static JagString field111 = class1.method2(255, "Enter place name to find");

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field109;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "[I")
    public static int[] field105;

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 23)
    public JagException(Throwable arg0, String arg1) {
        this.field103 = arg0;
        this.field102 = arg1;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)V", line = 40)
    public static void method45(boolean arg0) {
        field108 = null;
        field106 = null;
        field104 = null;
        field109 = null;
        field111 = null;
        field110 = null;
        if (arg0) {
            field111 = null;
        }
        field105 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZLjava/lang/Object;B)[B", line = 64)
    public static final byte[] method46(boolean arg0, Object arg1, byte arg2) {
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? PreciseSleep.copy(var3, 0) : var3;
        } else {
            if (arg2 != -14) {
                field108 = null;
            }
            if (!(arg1 instanceof ByteArray)) {
                throw new IllegalArgumentException();
            }
            ByteArray var4 = (ByteArray) arg1;
            return var4.get(-30);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)I", line = 131)
    public static final int method47(int arg0) {
        if (arg0 != 58) {
            field104 = null;
        }
        if (Worldmap.field359 == null) {
            return 0;
        } else if (Worldmap.field359.field375 == null) {
            return Packet.field340[Worldmap.field359.field367 & 0xFF];
        } else {
            return Packet.field340[Worldmap.field359.field375[JavaKeyboard.field12] & 0xFF];
        }
    }
}
