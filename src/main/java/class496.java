import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class496 {

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lqr;")
    private class65 field6688 = new class65(64);

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public int field6693 = 0;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lwu;")
    private class376 field6690;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public int field6686;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field6681 = -2;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lkg;")
    public static class275 field6682 = new class275(12, 0, 1, 0);

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lro;")
    public static class2 field6692 = new class2();

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[Lkf;")
    public static class256[] field6694;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 9)
    public static final String method2797(String arg0, boolean arg1) {
        field6685++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class179.method1240(-23324, arg0.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class179.method1240(-23324, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        if (!arg1) {
            field6682 = null;
        }
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class483.method2733(-32723, var7)) {
                char var8 = class332.method2001((byte) 119, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Ljba;", line = 65)
    public final class403 method2798(int arg0, int arg1) {
        field6689++;
        class65 var3 = this.field6688;
        class403 var4;
        synchronized (this.field6688) {
            var4 = (class403) this.field6688.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field6690;
        byte[] var6;
        synchronized (this.field6690) {
            var6 = this.field6690.method2218((byte) 127, 4, arg0);
        }
        if (arg1 >= -7) {
            field6681 = 39;
        }
        class403 var7 = new class403();
        var7.field5611 = arg0;
        var7.field5623 = this;
        if (var6 != null) {
            var7.method2369(false, new class677(var6));
        }
        var7.method2371(1652868904);
        class65 var8 = this.field6688;
        synchronized (this.field6688) {
            this.field6688.method556((byte) 0, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 99)
    public static void method2799(int arg0) {
        field6694 = null;
        if (arg0 > -101) {
            field6694 = null;
        }
        field6692 = null;
        field6682 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V", line = 119)
    public final void method2800(byte arg0, int arg1) {
        class65 var3 = this.field6688;
        synchronized (this.field6688) {
            this.field6688.method553(arg1, -15782);
        }
        if (arg0 == -103) {
            field6687++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 133)
    public final void method2801(boolean arg0) {
        field6683++;
        class65 var2 = this.field6688;
        synchronized (this.field6688) {
            this.field6688.method558(0);
            if (arg0) {
                this.field6688 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 147)
    public final void method2802(byte arg0) {
        field6684++;
        class65 var2 = this.field6688;
        synchronized (this.field6688) {
            if (arg0 <= 111) {
                method2803(64, -22, -67L);
            }
            this.field6688.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 195)
    public class496(class763 arg0, int arg1, class376 arg2) {
        this.field6690 = arg2;
        this.field6686 = this.field6690.method2195(4, 0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIJ)Ljava/lang/String;", line = 166)
    public static final String method2803(int arg0, int arg1, long arg2) {
        class56.method376(arg2, -8474);
        field6691++;
        int var4 = class132.field2151.get(5);
        if (arg0 == 64) {
            int var5 = class132.field2151.get(2) + 1;
            int var6 = class132.field2151.get(1);
            return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
        } else {
            return null;
        }
    }
}
