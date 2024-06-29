import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class133 {

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    private int field2082 = -1;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    private int field2080 = 0;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lgw;")
    private class118 field2072 = new class118();

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Z")
    public boolean field2086 = false;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    private int field2081;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[[I")
    private int[][] field2079;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[Lnd;")
    private class389[] field2074;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "[I")
    public static int[] field2078 = new int[14];

    @OriginalMember(owner = "client!me", name = "q", descriptor = "[Lch;")
    public static class330[] field2085 = new class330[4];

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Laa;")
    public static class343 field2075;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Z")
    public static boolean field2069;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 3)
    public final void method970(byte arg0) {
        for (int var2 = 0; var2 < this.field2077; var2++) {
            this.field2079[var2] = null;
        }
        field2070++;
        this.field2079 = null;
        this.field2074 = null;
        this.field2072.method861(arg0 - 20);
        this.field2072 = null;
        if (arg0 != 19) {
            method973(false);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)I", line = 28)
    public static final int method971(byte arg0, int arg1) {
        if (arg0 < 86) {
            field2078 = null;
        }
        field2084++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 45)
    public static void method972(int arg0) {
        field2078 = null;
        field2075 = null;
        int var1 = 25 / ((arg0 + 72) / 40);
        field2085 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 60)
    public static final void method973(boolean arg0) {
        if (!arg0) {
            method976(114, 126, -25);
        }
        field2071++;
        class157.field2402.method331(((float) class220.field3371.field2566 * 0.1F + 0.7F) * class518.field7506);
        class157.field2402.method194(class430.field6181, class194.field2813, class283.field4216, (float) (class455.field6618 << 0), (float) (class457.field6634 << 0), (float) (class206.field3138 << 0));
        class157.field2402.method294(class544.field7987);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I", line = 73)
    public final int[] method974(int arg0, int arg1) {
        if (arg0 != -30531) {
            method971((byte) -122, 9);
        }
        field2076++;
        if (this.field2081 == this.field2077) {
            this.field2086 = this.field2074[arg1] == null;
            this.field2074[arg1] = class23.field329;
            return this.field2079[arg1];
        } else if (this.field2077 == 1) {
            this.field2086 = this.field2082 != arg1;
            this.field2082 = arg1;
            return this.field2079[0];
        } else {
            class389 var3 = this.field2074[arg1];
            if (var3 == null) {
                this.field2086 = true;
                if (this.field2077 <= this.field2080) {
                    class389 var4 = (class389) this.field2072.method856(47);
                    var3 = new class389(arg1, var4.field5522);
                    this.field2074[var4.field5524] = null;
                    var4.method421(22071);
                } else {
                    var3 = new class389(arg1, this.field2080);
                    this.field2080++;
                }
                this.field2074[arg1] = var3;
            } else {
                this.field2086 = false;
            }
            this.field2072.method853(-12691, var3);
            return this.field2079[var3.field5522];
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)[[I", line = 148)
    public final int[][] method975(byte arg0) {
        field2073++;
        if (this.field2081 != this.field2077) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 9 / ((50 - arg0) / 46);
        for (int var3 = 0; var3 < this.field2077; var3++) {
            this.field2074[var3] = class23.field329;
        }
        return this.field2079;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(III)V", line = 209)
    public class133(int arg0, int arg1, int arg2) {
        this.field2081 = arg1;
        this.field2077 = arg0;
        this.field2079 = new int[this.field2077][arg2];
        this.field2074 = new class389[this.field2081];
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V", line = 178)
    public static final void method976(int arg0, int arg1, int arg2) {
        boolean var3 = class461.field6675[0][arg1][arg2] != null && class461.field6675[0][arg1][arg2].field2772 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class461.field6675[var4][arg1][arg2] == null) {
                class188 var5 = class461.field6675[var4][arg1][arg2] = new class188(var4, arg1, arg2);
                if (var3) {
                    var5.field2763++;
                }
            }
        }
    }
}
