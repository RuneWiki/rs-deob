import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class12 extends RuntimeException {

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field156;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Ljava/lang/String;")
    public String field159;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "[S")
    public static short[] field152 = new short[256];

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field155 = 1;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "[Lvn;")
    public static class134[] field151;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)V", line = 11)
    public static final void method94(int arg0, byte arg1) {
        class189.field2972.method741(arg0, (byte) 111);
        class240.field3655.method741(arg0, (byte) -18);
        field154++;
        if (arg1 != 44) {
            field153 = 114;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 28)
    public static void method95(int arg0) {
        field151 = null;
        field152 = null;
        int var1 = 27 / ((-arg0 - 8) / 56);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)I", line = 39)
    public static final int method96(boolean arg0, int arg1) {
        field157++;
        if (!arg0) {
            method94(36, (byte) -96);
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Leh;", line = 62)
    public static final class158 method97(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class158 var4 = var3.field1175;
            var3.field1175 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 82)
    public class12(Throwable arg0, String arg1) {
        this.field156 = arg0;
        this.field159 = arg1;
    }
}
