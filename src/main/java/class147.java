import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class147 extends class198 {

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2306 = "Loaded interfaces";

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field2311 = null;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "Lwa;")
    public static class281 field2309 = new class281();

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "Ljj;")
    public static class110 field2312;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "Ljava/awt/Font;")
    public static Font field2307;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)Z")
    public static final boolean method978(int arg0, int arg1, int arg2) {
        int var3 = class198.field3152[arg0][arg1][arg2];
        if (-class92.field1399 == var3) {
            return false;
        } else if (class92.field1399 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class73.method469(var4 + 1, class242.field3842[arg0][arg1][arg2], var5 + 1) && class73.method469(var4 + 128 - 1, class242.field3842[arg0][arg1 + 1][arg2], var5 + 1) && class73.method469(var4 + 128 - 1, class242.field3842[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class73.method469(var4 + 1, class242.field3842[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class198.field3152[arg0][arg1][arg2] = class92.field1399;
                return true;
            } else {
                class198.field3152[arg0][arg1][arg2] = -class92.field1399;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (arg0) {
            field2308++;
            return class152.field2367;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
    public static void method979(int arg0) {
        field2312 = null;
        field2307 = null;
        field2309 = null;
        field2311 = null;
        if (arg0 == 1) {
            field2306 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class147() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
    public static final void method980(byte arg0) {
        class84.field1315.method144(0);
        field2310++;
        class100.field1509.method144(0);
        class160.field2525.method144(0);
        if (arg0 > -36) {
            field2306 = null;
        }
    }
}
