import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class520 {

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
    private int field6956 = 0;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
    public int field6952;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "[Lrc;")
    public class504[] field6941;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "Lmga;")
    public static class666 field6953 = new class666(4);

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "J")
    private long field6944;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "Lrc;")
    private class504 field6950;

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "Lrc;")
    private class504 field6957;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(JLrc;B)V")
    public final void method2911(long arg0, class504 arg1, byte arg2) {
        if (arg1.field6723 != null) {
            arg1.method2797(35);
        }
        field6954++;
        class504 var5 = this.field6941[(int) ((long) (this.field6952 - 1) & arg0)];
        arg1.field6723 = var5.field6723;
        arg1.field6722 = var5;
        if (arg2 == -28) {
            arg1.field6723.field6722 = arg1;
            arg1.field6722.field6723 = arg1;
            arg1.field6724 = arg0;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)Lrc;")
    public final class504 method2912(byte arg0) {
        field6942++;
        if (arg0 < 90) {
            this.method2920(false);
        }
        if (this.field6956 > 0 && this.field6941[this.field6956 - 1] != this.field6957) {
            class504 var2 = this.field6957;
            this.field6957 = var2.field6722;
            return var2;
        }
        while (this.field6952 > this.field6956) {
            class504 var3 = this.field6941[this.field6956++].field6722;
            if (this.field6941[this.field6956 - 1] != var3) {
                this.field6957 = var3.field6722;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "([Lrc;I)I")
    public final int method2913(class504[] arg0, int arg1) {
        field6943++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field6952; var4++) {
            class504 var5 = this.field6941[var4];
            for (class504 var6 = var5.field6722; var6 != var5; var6 = var6.field6722) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)V")
    public static void method2914(boolean arg0) {
        if (arg0) {
            method2914(false);
        }
        field6953 = null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Lrc;")
    public final class504 method2915(int arg0) {
        field6947++;
        this.field6956 = 0;
        if (arg0 < 63) {
            this.method2917((byte) 120);
        }
        return this.method2912((byte) 113);
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
    public final void method2916(byte arg0) {
        field6948++;
        if (arg0 <= 78) {
            return;
        }
        for (int var2 = 0; var2 < this.field6952; var2++) {
            class504 var3 = this.field6941[var2];
            while (true) {
                class504 var4 = var3.field6722;
                if (var3 == var4) {
                    break;
                }
                var4.method2797(39);
            }
        }
        this.field6957 = null;
        this.field6950 = null;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)I")
    public final int method2917(byte arg0) {
        field6955++;
        if (arg0 > -61) {
            method2914(true);
        }
        return this.field6952;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(JB)Lrc;")
    public final class504 method2918(long arg0, byte arg1) {
        field6949++;
        this.field6944 = arg0;
        class504 var4 = this.field6941[(int) (arg0 & (long) (this.field6952 - 1))];
        this.field6950 = var4.field6722;
        int var5 = 67 % ((arg1 + 93) / 32);
        while (this.field6950 != var4) {
            if (this.field6950.field6724 == arg0) {
                class504 var6 = this.field6950;
                this.field6950 = this.field6950.field6722;
                return var6;
            }
            this.field6950 = this.field6950.field6722;
        }
        this.field6950 = null;
        return null;
    }

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "(B)Lrc;")
    public final class504 method2919(byte arg0) {
        field6945++;
        if (this.field6950 == null) {
            return null;
        } else if (arg0 < 40) {
            return null;
        } else {
            class504 var2 = this.field6941[(int) (this.field6944 & (long) (this.field6952 - 1))];
            while (this.field6950 != var2) {
                if (this.field6950.field6724 == this.field6944) {
                    class504 var3 = this.field6950;
                    this.field6950 = this.field6950.field6722;
                    return var3;
                }
                this.field6950 = this.field6950.field6722;
            }
            this.field6950 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(Z)I")
    public final int method2920(boolean arg0) {
        if (arg0) {
            method2921(89, (byte) -86, -115);
        }
        field6951++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field6952; var3++) {
            class504 var4 = this.field6941[var3];
            for (class504 var5 = var4.field6722; var5 != var4; var5 = var5.field6722) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2921(int arg0, byte arg1, int arg2) {
        field6946++;
        if (arg1 != -67) {
            method2914(false);
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(I)V")
    public class520(int arg0) {
        this.field6952 = arg0;
        this.field6941 = new class504[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class504 var3 = this.field6941[var2] = new class504();
            var3.field6722 = var3;
            var3.field6723 = var3;
        }
    }
}
