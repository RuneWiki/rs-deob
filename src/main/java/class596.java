import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class596 {

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field8740 = new String[0];

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Z")
    private boolean field8745 = false;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    private int field8736 = -1;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    private int field8742;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8748 = new String[] { method4442(method4441(".CC\u0013\u001a")), method4442(method4441(".CCl[&O\u0019n\u001a")), method4442(method4441(".CC\u0017\u001a")), method4442(method4441(".CC$]\u001bR\u001f9\\/\u000e")), method4442(method4441("d\u0006")), method4442(method4441(".CC\u0015\u001a")), method4442(method4441("3\bC~O")), method4442(method4441("&S\u0001<")), method4442(method4441(".CC\u0016\u001a")), method4442(method4441(".CC\u0012\u001a")), method4442(method4441(".CC\u0014\u001a")), method4442(method4441(".CC\u0011\u001a")) };

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Liv;")
    public static class107 field8739;

    static {
        new BitSet(65536);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 3)
    private final void method4434(int arg0, String arg1, int arg2) {
        try {
            if (arg2 > this.field8736) {
                this.field8736 = arg2;
            }
            if (arg0 == -31858) {
                field8741++;
                if (arg2 >= this.field8740.length) {
                    this.method4436(arg2, -1);
                }
                this.field8740[arg2] = arg1;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8748[10] + arg0 + ',' + (arg1 == null ? field8748[7] : field8748[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 23)
    public static final void method4435(int arg0) {
        try {
            class740.field10755++;
            if (arg0 != 1) {
                field8739 = null;
            }
            field8738++;
            class280 var1 = class610.method4508(class291.field4318, class279.field4190, (byte) -121);
            var1.field4197.method1406(class544.field8130, 380332136);
            class106.method934((byte) 53, var1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8748[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "toString", descriptor = "()Ljava/lang/String;", line = 41)
    public final String toString() {
        try {
            field8743++;
            StringBuffer var1 = new StringBuffer();
            var1.append("[");
            for (int var2 = 0; var2 < this.field8736; var2++) {
                if (var2 != 0) {
                    var1.append(field8748[4]);
                }
                var1.append(this.field8740[var2]);
            }
            var1.append("]");
            return var1.toString();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8748[3] + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V", line = 68)
    private final void method4436(int arg0, int arg1) {
        try {
            if (arg1 == -1) {
                field8746++;
                String[] var3 = new String[this.method4440(arg0, (byte) -123)];
                class467.method3554(this.field8740, 0, var3, 0, this.field8740.length);
                this.field8740 = var3;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8748[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IZ)V", line = 170)
    public class596(int arg0, boolean arg1) {
        try {
            this.field8742 = arg0;
            this.field8745 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8748[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 86)
    public final void method4437(String arg0, int arg1) {
        try {
            field8737++;
            this.method4434(-31858, arg0, this.field8736 + 1);
            if (arg1 > -12) {
                this.field8745 = true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8748[8] + (arg0 == null ? field8748[7] : field8748[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 103)
    public static void method4438(int arg0) {
        try {
            if (arg0 <= 51) {
                field8739 = null;
            }
            field8739 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8748[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)[Ljava/lang/String;", line = 124)
    public final String[] method4439(int arg0) {
        try {
            if (arg0 != -13718) {
                field8739 = null;
            }
            field8744++;
            String[] var2 = new String[this.field8736 + 1];
            class467.method3554(this.field8740, 0, var2, 0, this.field8736 + 1);
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8748[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)I", line = 138)
    private final int method4440(int arg0, byte arg1) {
        try {
            field8747++;
            int var3 = this.field8740.length;
            if (arg1 >= -94) {
                this.field8740 = null;
            }
            while (var3 <= arg0) {
                if (!this.field8745) {
                    var3 += this.field8742;
                } else if (var3 == 0) {
                    var3 = 1;
                } else {
                    var3 = this.field8742 * var3;
                }
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8748[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4441(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4442(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
