import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class792 {

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "Z")
    private boolean field11514 = false;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
    public int field11518 = 443;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Z")
    private boolean field11517 = true;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public int field11525 = 43594;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11527 = new String[] { method5715(method5714(".LqW\u000f")), method5715(method5714(".LqQ\u000f")), method5715(method5714(".LqP\u000f")), method5715(method5714(".LqR\u000f")), method5715(method5714("(M3\u007f")), method5715(method5714("=\u0016q=Z")), method5715(method5714(".LqV\u000f")) };

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Lofa;")
    public static class139 field11522 = new class139(2);

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field11513;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public static int field11515;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field11519;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field11520;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field11521;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field11523;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public int field11524;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    public static int field11526;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "Ljava/lang/String;")
    public String field11516;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILft;)Lvn;", line = 5)
    public final class328 method5709(int arg0, class188 arg1) {
        try {
            if (arg0 != 43594) {
                this.field11517 = true;
            }
            field11521++;
            return arg1.method1564(this.field11516, this.field11514, this.field11517 ? this.field11518 : this.field11525, -94);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11527[3] + arg0 + ',' + (arg1 == null ? field11527[4] : field11527[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Ljc;", line = 22)
    public static final class711 method5710(int arg0) {
        try {
            field11520++;
            class711 var1 = class24.method282(-128);
            if (arg0 <= 4) {
                method5710(39);
            }
            var1.method5083((byte) 115, 0L);
            var1.method5089(class337.field4888, (byte) -101);
            var1.method5083((byte) 115, class35.field430);
            var1.method5083((byte) 115, class788.field11375);
            var1.method5136(0, class297.field4152, class317.field4346);
            return var1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11527[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V", line = 44)
    public static void method5711(int arg0) {
        try {
            field11522 = null;
            if (arg0 > -65) {
                method5711(98);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11527[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLht;)Z", line = 63)
    public final boolean method5712(byte arg0, class792 arg1) {
        try {
            int var3 = -101 % ((-arg0 - 39) / 42);
            field11515++;
            if (arg1 == null) {
                return false;
            } else {
                return this.field11524 == arg1.field11524 && this.field11516.equals(arg1.field11516);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11527[6] + arg0 + ',' + (arg1 == null ? field11527[4] : field11527[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 81)
    public final void method5713(int arg0) {
        try {
            if (!this.field11517) {
                this.field11517 = true;
                this.field11514 = true;
            } else if (this.field11514) {
                this.field11514 = false;
            } else {
                this.field11517 = false;
            }
            field11513++;
            if (arg0 <= 69) {
                this.method5713(21);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11527[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5714(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5715(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
