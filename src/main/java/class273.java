import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class273 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    private int field3873 = -1;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    private int field3884 = 0;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lvf;")
    private class166 field3882 = new class166();

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Z")
    public boolean field3886 = false;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    private int field3880;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[[[I")
    private int[][][] field3881;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[Las;")
    private class193[] field3879;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lsd;")
    public static class74 field3872 = new class74(95, -1);

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lsd;")
    public static class74 field3874 = new class74(45, 3);

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lcr;")
    public static class206 field3875;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method1638(byte arg0, int arg1) {
        field3876++;
        int var3 = -69 / ((arg0 + 65) / 35);
        if (this.field3885 == this.field3880) {
            this.field3886 = this.field3879[arg1] == null;
            this.field3879[arg1] = class426.field6142;
            return this.field3881[arg1];
        } else if (this.field3885 == 1) {
            this.field3886 = this.field3873 != arg1;
            this.field3873 = arg1;
            return this.field3881[0];
        } else {
            class193 var4 = this.field3879[arg1];
            if (var4 == null) {
                this.field3886 = true;
                if (this.field3884 >= this.field3885) {
                    class193 var5 = (class193) this.field3882.method807(-18919);
                    var4 = new class193(arg1, var5.field2654);
                    this.field3879[var5.field2651] = null;
                    var5.method702((byte) -114);
                } else {
                    var4 = new class193(arg1, this.field3884);
                    this.field3884++;
                }
                this.field3879[arg1] = var4;
            } else {
                this.field3886 = false;
            }
            this.field3882.method811(-25513, var4);
            return this.field3881[var4.field2654];
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1639(int arg0) {
        field3874 = null;
        field3872 = null;
        field3875 = null;
        if (arg0 != 25857) {
            method1639(-70);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public final void method1640(byte arg0) {
        int var2 = 0;
        if (arg0 <= 59) {
            this.method1641(false);
        }
        while (this.field3885 > var2) {
            this.field3881[var2][0] = null;
            this.field3881[var2][1] = null;
            this.field3881[var2][2] = null;
            this.field3881[var2] = null;
            var2++;
        }
        field3877++;
        this.field3881 = null;
        this.field3879 = null;
        this.field3882.method813(0);
        this.field3882 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method1641(boolean arg0) {
        field3878++;
        if (this.field3885 != this.field3880) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (!arg0) {
            this.method1638((byte) 59, -54);
        }
        for (int var2 = 0; var2 < this.field3885; var2++) {
            this.field3879[var2] = class426.field6142;
        }
        return this.field3881;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(III)V")
    public class273(int arg0, int arg1, int arg2) {
        this.field3885 = arg0;
        this.field3880 = arg1;
        this.field3881 = new int[this.field3885][3][arg2];
        this.field3879 = new class193[this.field3880];
    }
}
