import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class606 {

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lrba;")
    private class459 field8724 = new class459();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lwca;")
    private class708 field8733 = new class708();

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    private int field8731;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    private int field8734;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lqr;")
    private class69 field8736;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8739 = new String[] { method4432(method4431("}Pt\u001b")), method4432(method4431("}Ps\u001b")), method4432(method4431("}Pq\u001b")), method4432(method4431("}P\tZ#b\n\u000b\u001b")), method4432(method4431("}Pv\u001b")), method4432(method4431("}Pw\u001b")), method4432(method4431("pP\u001b\u001d0")), method4432(method4431("e\u000bY_")), method4432(method4431("}Pp\u001b")) };

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
    public static int[] field8730 = new int[256];

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Z")
    public static boolean field8732 = false;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field8737 = 100;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lhl;")
    public static class556 field8735 = new class556(90, 5);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "[I")
    public static int[] field8728;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 21)
    public static void method4425(int arg0) {
        try {
            field8735 = null;
            if (arg0 == -1) {
                field8728 = null;
                field8730 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8739[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method4426(int arg0, int arg1, int arg2) {
        try {
            if (arg1 > -114) {
                field8728 = null;
            }
            field8738++;
            return class269.method2323(1048832, arg2, arg0) | (arg0 & 0x40000) != 0 || class553.method4098(-7851, arg0, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8739[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IJ)Lrba;", line = 48)
    public final class459 method4427(int arg0, long arg1) {
        try {
            field8726++;
            if (arg0 < 26) {
                this.field8736 = null;
            }
            class459 var4 = (class459) this.field8736.method737((byte) -39, arg1);
            if (var4 != null) {
                this.field8733.method5142(var4, (byte) -63);
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8739[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V", line = 133)
    public class606(int arg0) {
        try {
            this.field8731 = arg0;
            this.field8734 = arg0;
            int var2;
            for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
            }
            this.field8736 = new class69(var2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8739[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLrba;J)V", line = 78)
    public final void method4428(byte arg0, class459 arg1, long arg2) {
        try {
            if (arg0 < 36) {
                this.field8724 = null;
            }
            field8727++;
            if (this.field8731 == 0) {
                class459 var5 = this.field8733.method5149((byte) 52);
                var5.method4173(-1);
                var5.method3558((byte) 98);
                if (this.field8724 == var5) {
                    class459 var6 = this.field8733.method5149((byte) 52);
                    var6.method4173(-1);
                    var6.method3558((byte) 110);
                }
            } else {
                this.field8731--;
            }
            this.field8736.method738(arg1, arg2, -12002);
            this.field8733.method5142(arg1, (byte) -63);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field8739[8] + arg0 + ',' + (arg1 == null ? field8739[7] : field8739[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 107)
    public final void method4429(int arg0) {
        try {
            this.field8733.method5141(0);
            int var2 = -127 / ((arg0 + 15) / 54);
            field8723++;
            this.field8736.method730(true);
            this.field8724 = new class459();
            this.field8731 = this.field8734;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8739[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BJ)V", line = 156)
    public final void method4430(byte arg0, long arg1) {
        try {
            field8729++;
            if (arg0 < 49) {
                this.method4429(85);
            }
            class459 var4 = (class459) this.field8736.method737((byte) -39, arg1);
            if (var4 != null) {
                var4.method4173(-1);
                var4.method3558((byte) 119);
                this.field8731++;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8739[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4431(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!v", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4432(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
