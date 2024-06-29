import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class503 extends class419 {

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Z")
    public static boolean field7399 = false;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "B")
    public byte field7398;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Lmf;")
    public static class50 field7395;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Lbt;")
    public class88 field7394;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)I", line = 7)
    public final int method2368(int arg0) {
        if (arg0 != -11948) {
            return 6;
        } else {
            ++field7397;
            return this.field7394 == null ? 0 : this.field7394.field1176 * 100 / (this.field7394.field1223.length + -this.field7398);
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)[B", line = 22)
    public final byte[] method2370(byte arg0) {
        ++field7396;
        if (arg0 != -32) {
            return null;
        } else if (!super.field5569 && ~this.field7394.field1176 <= ~(this.field7394.field1223.length - this.field7398)) {
            return this.field7394.field1223;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIC)C", line = 46)
    public static final char method3001(int arg0, int arg1, char arg2) {
        ++field7393;
        if (~arg2 <= -193 && ~arg2 >= -256) {
            if (~arg2 <= -193 && arg2 <= 198) {
                return 'A';
            }
            if (~arg2 == -200) {
                return 'C';
            }
            if (~arg2 <= -201 && arg2 <= 203) {
                return 'E';
            }
            if (~arg2 <= -205 && ~arg2 >= -208) {
                return 'I';
            }
            if (arg2 == 209 && arg0 != 0) {
                return 'N';
            }
            if (~arg2 <= -211 && ~arg2 >= -215) {
                return 'O';
            }
            if (~arg2 <= -218 && arg2 <= 220) {
                return 'U';
            }
            if (arg2 == 221) {
                return 'Y';
            }
            if (~arg2 == -224) {
                return 's';
            }
            if (~arg2 <= -225 && arg2 <= 230) {
                return 'a';
            }
            if (~arg2 == -232) {
                return 'c';
            }
            if (~arg2 <= -233 && arg2 <= 235) {
                return 'e';
            }
            if (arg2 >= 236 && arg2 <= 239) {
                return 'i';
            }
            if (~arg2 == -242 && ~arg0 != -1) {
                return 'n';
            }
            if (arg2 >= 242 && arg2 <= 246) {
                return 'o';
            }
            if (arg2 >= 249 && ~arg2 >= -253) {
                return 'u';
            }
            if (~arg2 == -254 || arg2 == 255) {
                return 'y';
            }
        }
        if (arg2 == 338) {
            return 'O';
        } else if (arg2 == 339) {
            return 'o';
        } else if (arg2 == 376) {
            return 'Y';
        } else {
            if (arg1 != -13066) {
                field7399 = false;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)V", line = 134)
    public static void method3002(byte arg0) {
        if (arg0 > 91) {
            field7395 = null;
        }
    }
}
