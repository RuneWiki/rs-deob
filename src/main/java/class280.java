import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class280 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[[[I")
    public static int[][][] field3432;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lrc;")
    public static final class536 method1681(int arg0, int arg1) {
        if (arg0 != -20721) {
            field3433 = 109;
        }
        field3431++;
        if (arg1 == 0) {
            if ((double) class656.field9363 == 3.0D) {
                return class114.field1192;
            }
            if ((double) class656.field9363 == 4.0D) {
                return class465.field6643;
            }
            if ((double) class656.field9363 == 6.0D) {
                return class107.field1126;
            }
            if ((double) class656.field9363 >= 8.0D) {
                return class298.field3715;
            }
        } else if (arg1 == 1) {
            if ((double) class656.field9363 == 3.0D) {
                return class107.field1126;
            }
            if ((double) class656.field9363 == 4.0D) {
                return class298.field3715;
            }
            if ((double) class656.field9363 == 6.0D) {
                return class141.field1589;
            }
            if ((double) class656.field9363 >= 8.0D) {
                return class313.field3883;
            }
        } else if (arg1 == 2) {
            if ((double) class656.field9363 == 3.0D) {
                return class141.field1589;
            }
            if ((double) class656.field9363 == 4.0D) {
                return class313.field3883;
            }
            if ((double) class656.field9363 == 6.0D) {
                return class427.field6191;
            }
            if ((double) class656.field9363 >= 8.0D) {
                return class219.field2532;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method1682(byte arg0) {
        field3432 = null;
        if (arg0 >= -114) {
            method1681(-57, 125);
        }
    }
}
