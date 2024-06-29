import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class225 {

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    private int field3950 = 0;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    private int field3946 = -1;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lvh;")
    private class252 field3953 = new class252();

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Z")
    public boolean field3963 = false;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[Led;")
    private class172[] field3949;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[[[I")
    private int[][][] field3951;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field3945 = 0;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "J")
    public static long field3960 = 0L;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "[J")
    public static long[] field3956 = new long[1000];

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Lwh;")
    public static class183 field3955 = new class183();

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Ldf;")
    public static class51 field3966 = class46.method233("Texturen geladen)3", 100);

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Ldf;")
    public static class51 field3967 = class46.method233("titlebg", 100);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Lwc;")
    public static class213 field3965;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1545(int arg0) {
        field3967 = null;
        field3955 = null;
        field3966 = null;
        field3956 = null;
        if (arg0 != 0) {
            field3960 = 102L;
        }
        field3965 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lhj;")
    public static final class67 method1546(int arg0, int arg1) {
        field3958++;
        class67 var2 = (class67) class74.field1172.method1491((long) arg1, (byte) 95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class208.field3481.method828(arg0, (byte) 102, arg1);
        class67 var4 = new class67();
        if (var3 != null) {
            var4.method475((byte) 100, new class121(var3));
        }
        class74.field1172.method1492(false, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public final void method1547(boolean arg0) {
        field3961++;
        for (int var2 = 0; var2 < this.field3952; var2++) {
            this.field3951[var2][0] = null;
            this.field3951[var2][1] = null;
            this.field3951[var2][2] = null;
            this.field3951[var2] = null;
        }
        if (arg0) {
            this.field3953 = null;
        }
        this.field3949 = null;
        this.field3951 = null;
        this.field3953.method1708(2);
        this.field3953 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1548(int arg0, byte arg1) {
        field3954++;
        if (arg1 > -15) {
            method1552(-45, (byte) -10);
        }
        if (this.field3962 == this.field3952) {
            this.field3963 = this.field3949[arg0] == null;
            this.field3949[arg0] = class217.field3754;
            return this.field3951[arg0];
        } else if (this.field3952 == 1) {
            this.field3963 = this.field3946 != arg0;
            this.field3946 = arg0;
            return this.field3951[0];
        } else {
            class172 var3 = this.field3949[arg0];
            if (var3 == null) {
                this.field3963 = true;
                if (this.field3952 <= this.field3950) {
                    class172 var4 = (class172) this.field3953.method1713(2);
                    var3 = new class172(arg0, var4.field2807);
                    this.field3949[var4.field2823] = null;
                    var4.method764((byte) -88);
                } else {
                    var3 = new class172(arg0, this.field3950);
                    this.field3950++;
                }
                this.field3949[arg0] = var3;
            } else {
                this.field3963 = false;
            }
            this.field3953.method1711((byte) 79, var3);
            return this.field3951[var3.field2807];
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZ)Lti;")
    public static final class5 method1549(int arg0, int arg1, boolean arg2) {
        field3959++;
        for (class5 var3 = (class5) class141.field2367.method1720(arg2); var3 != null; var3 = (class5) class141.field2367.method1712((byte) 112)) {
            if (var3.field53 && var3.method19(arg1, 0, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1550(int arg0) {
        field3957++;
        if (this.field3962 != this.field3952) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 32767) {
            method1545(41);
        }
        for (int var2 = 0; var2 < this.field3952; var2++) {
            this.field3949[var2] = class217.field3754;
        }
        return this.field3951;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Lrf;")
    public static final class259 method1551(byte arg0, int arg1) {
        field3948++;
        class259 var2 = (class259) class191.field3201.method1491((long) arg1, (byte) 95);
        int var3 = 69 % ((arg0 - 35) / 43);
        if (var2 != null) {
            return var2;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = class2.field9.method828(1, (byte) 100, arg1);
        } else {
            var4 = class195.field3267.method828(1, (byte) 93, arg1 & 0x7FFF);
        }
        class259 var5 = new class259();
        if (var4 != null) {
            var5.method1765(new class121(var4), -92);
        }
        if (arg1 >= 32768) {
            var5.method1766((byte) -43);
        }
        class191.field3201.method1492(false, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IB)I")
    public static final int method1552(int arg0, byte arg1) {
        field3947++;
        int var2 = -16 % ((arg1 - 42) / 59);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(III)V")
    public class225(int arg0, int arg1, int arg2) {
        this.field3952 = arg0;
        this.field3962 = arg1;
        this.field3949 = new class172[this.field3962];
        this.field3951 = new int[this.field3952][3][arg2];
    }
}
