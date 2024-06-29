import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class467 {

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Laf;")
    private class39 field6483 = new class39(64);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Lae;")
    private class283 field6482;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "Ljk;")
    public static class788 field6490 = new class788("game3", 2);

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "Lhba;")
    public static class719 field6491 = new class719();

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "Ljn;")
    public static class134 field6493 = new class134(10, 10);

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Loja;")
    public static class124 field6494 = new class124();

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)V", line = 3)
    public final void method2790(int arg0, byte arg1) {
        field6489++;
        class39 var3 = this.field6483;
        synchronized (this.field6483) {
            this.field6483.method308(arg1 + 90, arg0);
            if (arg1 != -91) {
                field6491 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILrk;)V", line = 18)
    public static final void method2791(int arg0, class289 arg1) {
        field6488++;
        arg1.field4258 = null;
        int var2 = -79 % ((arg0 - 15) / 45);
        int var3 = arg1.field4255.length;
        for (int var4 = 0; var4 < var3; var4++) {
            arg1.field4255[var4].field180 = false;
        }
        class519[] var5 = class187.field2329;
        synchronized (class187.field2329) {
            if (class187.field2329.length > var3 && class718.field9948[var3] < 200) {
                class187.field2329[var3].method3100(arg1, true);
                int var10002 = class718.field9948[var3]++;
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 47)
    public final void method2792(int arg0) {
        class39 var2 = this.field6483;
        synchronized (this.field6483) {
            this.field6483.method319(-115);
        }
        field6484++;
        if (arg0 != 2) {
            this.method2793(5, 8);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)Lkp;", line = 62)
    public final class427 method2793(int arg0, int arg1) {
        field6485++;
        class39 var3 = this.field6483;
        class427 var4;
        synchronized (this.field6483) {
            var4 = (class427) this.field6483.method312(arg0 ^ 0x23, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field6482;
        byte[] var6;
        synchronized (this.field6482) {
            var6 = this.field6482.method1849(arg1, (byte) 126, arg0);
        }
        class427 var7 = new class427();
        if (var6 != null) {
            var7.method2574(new class511(var6), -8911);
        }
        var7.method2575((byte) -106);
        class39 var8 = this.field6483;
        synchronized (this.field6483) {
            this.field6483.method305(var7, (long) arg1, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 93)
    public static final String method2794(int arg0, String arg1) {
        if (arg0 != -48) {
            field6493 = null;
        }
        field6486++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && var4 + 2 < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = 10 - (97 - var6);
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                char var9 = arg1.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - 48;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 + '\n' - 97;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 - 55;
                }
                if (var11 != 0 && class647.method3704((byte) 91, (byte) var11)) {
                    var2.append(class395.method2438((byte) var11, -128));
                }
                var4 += 2;
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V", line = 170)
    public static void method2795(int arg0) {
        field6490 = null;
        field6491 = null;
        if (arg0 > 23) {
            field6493 = null;
            field6494 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 190)
    public final void method2796(byte arg0) {
        class39 var2 = this.field6483;
        synchronized (this.field6483) {
            this.field6483.method314(-2);
        }
        if (arg0 != 97) {
            this.method2792(30);
        }
        field6487++;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 218)
    public class467(class788 arg0, int arg1, class283 arg2) {
        this.field6482 = arg2;
        if (this.field6482 != null) {
            this.field6482.method1867(35, (byte) 49);
        }
    }
}
