import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class237 {

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    private int field3977 = -1;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    private int field3969 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lj;")
    private class269 field3961 = new class269();

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Z")
    public boolean field3984 = false;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    private int field3971;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    private int field3968;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[[I")
    private int[][] field3973;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[Lfg;")
    private class202[] field3974;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static volatile int field3963 = 0;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field3965 = 0;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3962 = -1;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lbe;")
    private static class283 field3983 = class153.method941(125, "K");

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Lbe;")
    public static class283 field3976 = field3983;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lbe;")
    public static class283 field3967 = field3983;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lbe;")
    public static class283 field3979 = class153.method941(4, "sch-Utteln:");

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lek;")
    public static class172 field3964;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)[I", line = 14)
    public final int[] method1579(int arg0, byte arg1) {
        field3972++;
        if (arg1 != 90) {
            this.field3973 = (int[][]) ((int[][]) null);
        }
        if (this.field3971 == this.field3968) {
            this.field3984 = this.field3974[arg0] == null;
            this.field3974[arg0] = class40.field566;
            return this.field3973[arg0];
        } else if (this.field3968 == 1) {
            this.field3984 = this.field3977 != arg0;
            this.field3977 = arg0;
            return this.field3973[0];
        } else {
            class202 var3 = this.field3974[arg0];
            if (var3 == null) {
                this.field3984 = true;
                if (this.field3968 <= this.field3969) {
                    class202 var4 = (class202) this.field3961.method1816(128);
                    var3 = new class202(arg0, var4.field3444);
                    this.field3974[var4.field3443] = null;
                    var4.method557((byte) -89);
                } else {
                    var3 = new class202(arg0, this.field3969);
                    this.field3969++;
                }
                this.field3974[arg0] = var3;
            } else {
                this.field3984 = false;
            }
            this.field3961.method1815(var3, 0);
            return this.field3973[var3.field3444];
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BJ)V", line = 101)
    public static final void method1580(byte arg0, long arg1) {
        field3975++;
        if (arg1 != 0L) {
            class71.field1240++;
            class228.field3831.method621(143, 8);
            class228.field3831.method1544((byte) 8, arg1);
            int var3 = -118 / ((arg0 + 54) / 53);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[[I", line = 116)
    public final int[][] method1581(int arg0) {
        field3982++;
        if (this.field3971 != this.field3968) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3968; var2++) {
            this.field3974[var2] = class40.field566;
        }
        return this.field3973;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BII)V", line = 139)
    public static final void method1582(byte arg0, int arg1, int arg2) {
        class67.field934[arg1] = arg2;
        if (arg0 < 121) {
            return;
        }
        class254 var3 = (class254) class82.field1391.method1612((long) arg1, 127);
        field3978++;
        if (var3 == null) {
            class254 var4 = new class254(4611686018427387905L);
            class82.field1391.method1611(var4, -1, (long) arg1);
        } else if (var3.field4288 != 4611686018427387905L) {
            var3.field4288 = class216.method1426(255) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lbe;", line = 177)
    public static final class283 method1583(int arg0, int arg1) {
        field3981++;
        if (arg1 != 32722) {
            method1580((byte) -110, 12L);
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class283 var2 = new class283();
        var2.field4812 = 1;
        var2.field4843 = new byte[1];
        var2.field4843[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 205)
    public final void method1584(boolean arg0) {
        field3966++;
        int var2 = 0;
        if (!arg0) {
            return;
        }
        while (var2 < this.field3968) {
            this.field3973[var2] = null;
            var2++;
        }
        this.field3974 = null;
        this.field3973 = (int[][]) null;
        this.field3961.method1810(-114);
        this.field3961 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 227)
    public static void method1585(byte arg0) {
        field3964 = null;
        field3967 = null;
        field3983 = null;
        field3979 = null;
        field3976 = null;
        int var1 = 23 % ((arg0 + 63) / 35);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(III)V", line = 274)
    public class237(int arg0, int arg1, int arg2) {
        this.field3971 = arg1;
        this.field3968 = arg0;
        this.field3973 = new int[this.field3968][arg2];
        this.field3974 = new class202[this.field3971];
    }
}
