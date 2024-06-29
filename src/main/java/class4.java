import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 extends RuntimeException {

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Ljava/lang/String;")
    public String field107;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field110;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Z")
    public static boolean field106 = false;

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Lt;")
    public static class31 field111 = class11.method64(-70, "Sword Shop");

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Lt;")
    public static class31 field112 = class11.method64(121, "Pub)4Bar");

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Z")
    public static boolean field108 = false;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Lt;")
    public static class31 field105 = class11.method64(88, "Chainmail Shop");

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Ljava/awt/Font;")
    public static Font field109;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Lv;III)[Lka;", line = 44)
    public static final class21[] method44(class33 arg0, int arg1, int arg2, int arg3) {
        if (class15.method88(arg0, (byte) 123, arg3, arg2)) {
            if (arg1 != 46) {
                field112 = null;
            }
            return class1.method32((byte) 103);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(III[Lt;)Lt;", line = 78)
    public static final class31 method45(int arg0, int arg1, int arg2, class31[] arg3) {
        int var4 = 0;
        if (arg0 < 67) {
            return (class31) null;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class3.field94;
            }
            var4 += arg3[arg2 + var5].field345;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class31 var9 = arg3[arg2 + var8];
            class5.method47(var9.field349, 0, var6, var7, var9.field345);
            var7 += var9.field345;
        }
        class31 var10 = new class31();
        var10.field345 = var4;
        var10.field349 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)V", line = 140)
    public static void method46(byte arg0) {
        field111 = null;
        field105 = null;
        field109 = null;
        if (arg0 < -127) {
            field112 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 151)
    public class4(Throwable arg0, String arg1) {
        this.field107 = arg1;
        this.field110 = arg0;
    }
}
