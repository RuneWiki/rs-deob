import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class170 extends class15 {

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    private int field2009;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "Lco;")
    public static class210 field2011 = new class210(64);

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "Let;")
    public static class274 field2019;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "[I")
    public static int[] field2017;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "[Los;")
    public class410[] field2014;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "[[B")
    private byte[][] field2015;

    static {
        new class40("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Z", line = 6)
    public final boolean method826(int arg0, byte arg1) {
        field2013++;
        if (arg1 != -97) {
            this.method831(68, (byte) 33);
        }
        return this.field2014[arg0].field5810;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V", line = 20)
    public static final void method827(byte arg0) {
        class210 var1 = class189.field2588;
        synchronized (class189.field2588) {
            class189.field2588.method1165((byte) 118);
        }
        field2012++;
        class210 var2 = class460.field6497;
        synchronized (class460.field6497) {
            class460.field6497.method1165((byte) 118);
        }
        if (arg0 != -52) {
            field2017 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 36)
    public static final byte[] method828(boolean arg0, Object arg1, int arg2) {
        field2016++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class231.method1275(-99, var3) : var3;
        } else if (arg1 instanceof class375) {
            class375 var4 = (class375) arg1;
            return var4.method1227(-128);
        } else {
            if (arg2 > -86) {
                field2017 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V", line = 85)
    public static void method829(boolean arg0) {
        field2019 = null;
        field2017 = null;
        if (arg0) {
            field2011 = null;
        }
        field2011 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V", line = 97)
    public class170(int arg0) {
        this.field2009 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Z", line = 107)
    public final boolean method830(int arg0) {
        int var2 = 124 / ((46 - arg0) / 36);
        field2018++;
        if (this.field2014 != null) {
            return true;
        }
        if (this.field2015 == null) {
            if (!class223.field3098.method2778(this.field2009, (byte) -111)) {
                return false;
            }
            int[] var3 = class223.field3098.method2765(this.field2009, 0);
            this.field2015 = new byte[var3.length][];
            for (int var4 = 0; var4 < var3.length; var4++) {
                this.field2015[var4] = class223.field3098.method2768(-20472, var3[var4], this.field2009);
            }
        }
        boolean var5 = true;
        for (int var6 = 0; var6 < this.field2015.length; var6++) {
            byte[] var15 = this.field2015[var6];
            int var16 = (var15[0] & 0xFF) << 8 | var15[1] & 0xFF;
            var5 &= class244.field3332.method2758(var16, -1);
        }
        if (!var5) {
            return false;
        }
        class166 var7 = new class166();
        int var8 = class223.field3098.method2755(-109, this.field2009);
        this.field2014 = new class410[var8];
        int[] var9 = class223.field3098.method2765(this.field2009, 0);
        for (int var10 = 0; var10 < var9.length; var10++) {
            byte[] var11 = this.field2015[var10];
            int var12 = var11[1] & 0xFF | var11[0] & 0xFF << 8;
            class322 var13 = null;
            for (class322 var14 = (class322) var7.method802((byte) 123); var14 != null; var14 = (class322) var7.method806((byte) 104)) {
                if (var14.field4653 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class322(var12, class244.field3332.method2779(1, var12));
                var7.method803(var13, 50);
            }
            this.field2014[var9[var10]] = new class410(var11, var13);
        }
        this.field2015 = null;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)Z", line = 201)
    public final boolean method831(int arg0, byte arg1) {
        field2010++;
        if (arg1 != 93) {
            field2011 = null;
        }
        return this.field2014[arg0].field5805;
    }
}
