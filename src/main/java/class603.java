import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class603 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    private int field8645 = 0;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    private int field8642 = -1;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Ltf;")
    private class524 field8647 = new class524();

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
    public boolean field8652 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field8650;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private int field8648;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[[I")
    private int[][] field8640;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[Lsk;")
    private class649[] field8641;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8655 = new String[] { method4464(method4463("d, >Gy!z<\u0006")), method4464(method4463("d, C\u0006")), method4464(method4463("lf ,S")), method4464(method4463("y=bn")), method4464(method4463("d, @\u0006")), method4464(method4463("d, A\u0006")), method4464(method4463("T)`\"Ay$w\"\\r<|kKa-.c\u000eq=bn\u000e~%oeK7+oaFr")), method4464(method4463("d, G\u0006")), method4464(method4463("d, F\u0006")) };

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Ldfa;")
    public static class477 field8646 = new class477(16);

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lmv;")
    public static class125 field8653 = new class125(31, 2);

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "F")
    public static float field8654;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V", line = 3)
    public static void method4458(byte arg0) {
        try {
            field8653 = null;
            field8646 = null;
            if (arg0 != 45) {
                method4458((byte) -44);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8655[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)[[I", line = 16)
    public final int[][] method4459(byte arg0) {
        try {
            field8651++;
            if (this.field8650 != this.field8648) {
                throw new RuntimeException(field8655[6]);
            }
            int var2 = 5 % ((arg0 + 29) / 44);
            for (int var3 = 0; var3 < this.field8648; var3++) {
                this.field8641[var3] = class757.field10819;
            }
            return this.field8640;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8655[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 40)
    public final void method4460(int arg0) {
        try {
            int var2 = 0;
            if (arg0 <= 13) {
                this.field8652 = false;
            }
            while (this.field8648 > var2) {
                this.field8640[var2] = null;
                var2++;
            }
            field8644++;
            this.field8641 = null;
            this.field8640 = null;
            this.field8647.method3982(-120);
            this.field8647 = null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8655[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III)V", line = 172)
    public class603(int arg0, int arg1, int arg2) {
        try {
            this.field8650 = arg1;
            this.field8648 = arg0;
            this.field8640 = new int[this.field8648][arg2];
            this.field8641 = new class649[this.field8650];
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8655[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILig;Lig;)V", line = 70)
    public static final void method4461(int arg0, class687 arg1, class687 arg2) {
        try {
            field8649++;
            if (arg1.field9627 != null) {
                arg1.method4911(126);
            }
            arg1.field9626 = arg2.field9626;
            arg1.field9627 = arg2;
            if (arg0 < 106) {
                field8646 = null;
            }
            arg1.field9627.field9626 = arg1;
            arg1.field9626.field9627 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8655[1] + arg0 + ',' + (arg1 == null ? field8655[3] : field8655[2]) + ',' + (arg2 == null ? field8655[3] : field8655[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I", line = 91)
    public final int[] method4462(int arg0, int arg1) {
        try {
            if (arg0 != 26041) {
                this.method4460(-15);
            }
            field8643++;
            if (this.field8650 == this.field8648) {
                this.field8652 = this.field8641[arg1] == null;
                this.field8641[arg1] = class757.field10819;
                return this.field8640[arg1];
            } else if (this.field8648 == 1) {
                this.field8652 = this.field8642 != arg1;
                this.field8642 = arg1;
                return this.field8640[0];
            } else {
                class649 var3 = this.field8641[arg1];
                if (var3 == null) {
                    this.field8652 = true;
                    if (this.field8645 >= this.field8648) {
                        class649 var4 = (class649) this.field8647.method3986(false);
                        var3 = new class649(arg1, var4.field9222);
                        this.field8641[var4.field9227] = null;
                        var4.method4294(0);
                    } else {
                        var3 = new class649(arg1, this.field8645);
                        this.field8645++;
                    }
                    this.field8641[arg1] = var3;
                } else {
                    this.field8652 = false;
                }
                this.field8647.method3983(90, var3);
                return this.field8640[var3.field9222];
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8655[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4463(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4464(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
