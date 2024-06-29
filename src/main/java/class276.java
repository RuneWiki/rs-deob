import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class276 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    private int[] field4738 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public int field4741 = -1;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Z")
    public boolean field4747 = false;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field4745 = 0;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field4746 = 0;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "J")
    public static long field4750 = 0L;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Z")
    public static boolean field4751 = false;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field4753 = 0;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "[I")
    private int[] field4749;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[S")
    private short[] field4739;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[S")
    private short[] field4740;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[S")
    private short[] field4744;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "[S")
    private short[] field4754;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1911(int arg0) {
        field4743++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field4738[var3] != -1 && !class235.field3971.method1584(0, this.field4738[var3], (byte) -71)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Le;", line = 30)
    public final class150 method1912(int arg0) {
        if (arg0 < 70) {
            field4753 = 72;
        }
        int var2 = 0;
        field4736++;
        class150[] var3 = new class150[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4738[var4] != -1) {
                var3[var2++] = class150.method1090(class235.field3971, this.field4738[var4], 0);
            }
        }
        class150 var5 = new class150(var3, var2);
        if (this.field4744 != null) {
            for (int var6 = 0; var6 < this.field4744.length; var6++) {
                var5.method1087(this.field4744[var6], this.field4739[var6]);
            }
        }
        if (this.field4754 != null) {
            for (int var7 = 0; var7 < this.field4754.length; var7++) {
                var5.method1068(this.field4754[var7], this.field4740[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLkh;)V", line = 86)
    private final void method1913(int arg0, byte arg1, class13 arg2) {
        field4734++;
        if (arg0 == 1) {
            this.field4741 = arg2.method152((byte) -96);
        } else if (arg0 == 2) {
            int var4 = arg2.method152((byte) -123);
            this.field4749 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4749[var5] = arg2.method112((byte) 92);
            }
        } else if (arg0 == 3) {
            this.field4747 = true;
        } else if (arg0 == 40) {
            int var8 = arg2.method152((byte) -87);
            this.field4744 = new short[var8];
            this.field4739 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4744[var9] = (short) arg2.method112((byte) 92);
                this.field4739[var9] = (short) arg2.method112((byte) 92);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method152((byte) -111);
            this.field4754 = new short[var6];
            this.field4740 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4754[var7] = (short) arg2.method112((byte) 92);
                this.field4740[var7] = (short) arg2.method112((byte) 92);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field4738[arg0 - 60] = arg2.method112((byte) 92);
        }
        if (arg1 >= -13) {
            this.field4754 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lkh;B)V", line = 165)
    public final void method1914(class13 arg0, byte arg1) {
        if (arg1 != -106) {
            return;
        }
        field4742++;
        while (true) {
            int var3 = arg0.method152((byte) -78);
            if (var3 == 0) {
                return;
            }
            this.method1913(var3, (byte) -42, arg0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)Le;", line = 191)
    public final class150 method1915(int arg0) {
        field4752++;
        if (this.field4749 == null) {
            return null;
        }
        int var2 = 124 / ((-arg0 - 9) / 52);
        class150[] var3 = new class150[this.field4749.length];
        for (int var4 = 0; var4 < this.field4749.length; var4++) {
            var3[var4] = class150.method1090(class235.field3971, this.field4749[var4], 0);
        }
        class150 var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new class150(var3, var3.length);
        }
        if (this.field4744 != null) {
            for (int var6 = 0; var6 < this.field4744.length; var6++) {
                var5.method1087(this.field4744[var6], this.field4739[var6]);
            }
        }
        if (this.field4754 != null) {
            for (int var7 = 0; var7 < this.field4754.length; var7++) {
                var5.method1068(this.field4754[var7], this.field4740[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Z", line = 268)
    public final boolean method1916(byte arg0) {
        field4748++;
        if (this.field4749 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 >= -61) {
            return true;
        }
        while (this.field4749.length > var3) {
            if (!class235.field3971.method1584(0, this.field4749[var3], (byte) -71)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILqm;II)Lvd;", line = 311)
    public static final class127 method1917(int arg0, class222 arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            method1917(-48, (class222) null, -108, -78);
        }
        field4737++;
        return class135.method966(117, arg3, arg2, arg1) ? class41.method319(false) : null;
    }
}
