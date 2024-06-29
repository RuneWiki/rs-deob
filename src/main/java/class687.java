import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class687 {

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "[I")
    private int[] field9747 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "Lkd;")
    public static class700 field9750 = new class700(2);

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "Lgm;")
    public class509 field9757;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "[I")
    private int[] field9746;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "[Li;")
    public static class682[] field9745;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "[S")
    private short[] field9744;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "[S")
    private short[] field9751;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "[S")
    private short[] field9753;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "[S")
    private short[] field9759;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method3872(int arg0) {
        field9752++;
        if (this.field9746 == null) {
            return true;
        } else if (arg0 == -19341) {
            boolean var2 = true;
            class345 var3 = this.field9757.field7574;
            synchronized (this.field9757.field7574) {
                for (int var4 = 0; var4 < this.field9746.length; var4++) {
                    if (!this.field9757.field7574.method2089(this.field9746[var4], -128, 0)) {
                        var2 = false;
                    }
                }
                return var2;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Lcr;", line = 35)
    public final class163 method3873(int arg0) {
        field9749++;
        if (this.field9746 == null) {
            return null;
        }
        class163[] var2 = new class163[this.field9746.length];
        class345 var3 = this.field9757.field7574;
        synchronized (this.field9757.field7574) {
            int var4 = 0;
            if (arg0 < 114) {
                this.field9747 = null;
            }
            while (true) {
                if (this.field9746.length <= var4) {
                    break;
                }
                var2[var4] = class84.method639(this.field9757.field7574, -4341, this.field9746[var4], 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field9746.length; var5++) {
            if (var2[var5].field2677 < 13) {
                var2[var5].method1243(1, 2);
            }
        }
        class163 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class163(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field9753 != null) {
            for (int var7 = 0; var7 < this.field9753.length; var7++) {
                var6.method1236(this.field9753[var7], (byte) 69, this.field9759[var7]);
            }
        }
        if (this.field9751 != null) {
            for (int var8 = 0; var8 < this.field9751.length; var8++) {
                var6.method1241(true, this.field9751[var8], this.field9744[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V", line = 110)
    public static void method3874(int arg0) {
        field9750 = null;
        field9745 = null;
        int var1 = 43 % ((arg0 + 57) / 52);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lek;B)V", line = 131)
    public final void method3875(class465 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2705(arg1 ^ 0xFFFFFF8C);
            if (var3 == 0) {
                if (arg1 != 56) {
                    this.field9759 = null;
                }
                field9755++;
                return;
            }
            this.method3876(arg0, arg1 ^ 0x578, var3);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lek;II)V", line = 152)
    private final void method3876(class465 arg0, int arg1, int arg2) {
        field9756++;
        if (arg1 != 1344) {
            method3874(-23);
        }
        if (arg2 == 1) {
            arg0.method2705(-80);
        } else if (arg2 == 2) {
            int var8 = arg0.method2705(-126);
            this.field9746 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field9746[var9] = arg0.method2755((byte) -119);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg0.method2705(-123);
                this.field9759 = new short[var4];
                this.field9753 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field9753[var5] = (short) arg0.method2755((byte) -51);
                    this.field9759[var5] = (short) arg0.method2755((byte) -74);
                }
                return;
            }
            if (arg2 == 41) {
                int var6 = arg0.method2705(-22);
                this.field9751 = new short[var6];
                this.field9744 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field9751[var7] = (short) arg0.method2755((byte) -86);
                    this.field9744[var7] = (short) arg0.method2755((byte) -89);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field9747[arg2 - 60] = arg0.method2755((byte) -79);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)Lcr;", line = 233)
    public final class163 method3877(int arg0) {
        field9748++;
        class163[] var2 = new class163[5];
        int var3 = arg0;
        class345 var4 = this.field9757.field7574;
        synchronized (this.field9757.field7574) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field9747[var5] != -1) {
                    var2[var3++] = class84.method639(this.field9757.field7574, -4341, this.field9747[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field2677 < 13) {
                var2[var6].method1243(arg0 ^ 0x1, 2);
            }
        }
        class163 var7 = new class163(var2, var3);
        if (this.field9753 != null) {
            for (int var8 = 0; var8 < this.field9753.length; var8++) {
                var7.method1236(this.field9753[var8], (byte) 99, this.field9759[var8]);
            }
        }
        if (this.field9751 != null) {
            for (int var9 = 0; var9 < this.field9751.length; var9++) {
                var7.method1241(true, this.field9751[var9], this.field9744[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)Z", line = 300)
    public final boolean method3878(boolean arg0) {
        field9754++;
        boolean var2 = arg0;
        class345 var3 = this.field9757.field7574;
        synchronized (this.field9757.field7574) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field9747[var4] != -1 && !this.field9757.field7574.method2089(this.field9747[var4], -126, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
