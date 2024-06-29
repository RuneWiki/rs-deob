import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class697 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lpa;")
    private class387 field9844 = new class387(64);

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lcb;")
    private class544 field9845;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field9843 = -1;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[F")
    public static float[] field9847 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lrb;")
    public static class370 field9849;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I", line = 4)
    public static final int method3928(int arg0) {
        if (arg0 != 16) {
            method3931(35, 30, -5);
        }
        field9842++;
        return 16;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Loga;", line = 15)
    public static final class497 method3929(byte arg0) {
        field9841++;
        if (class436.field6223 == null || class376.field5412 == null) {
            return null;
        }
        class376.field5412.method1526(class436.field6223, (byte) 111);
        if (arg0 != -121) {
            return null;
        }
        class497 var1 = (class497) class376.field5412.method1527(true);
        if (var1 == null) {
            return null;
        } else {
            class665 var2 = class436.field6213.method3711((byte) 126, var1.field7063);
            return var2 != null && var2.field9331 && var2.method3789(class436.field6212, 0) ? var1 : class307.method2017((byte) 117);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z", line = 43)
    public static final boolean method3930(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method3930(68, -68, -72);
        }
        field9846++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)Z", line = 61)
    public static final boolean method3931(int arg0, int arg1, int arg2) {
        field9848++;
        return arg2 != 2226;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 84)
    public static void method3932(byte arg0) {
        field9849 = null;
        field9847 = null;
        if (arg0 > -77) {
            field9849 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I", line = 97)
    public static final int method3933(int arg0, byte arg1) {
        field9850++;
        int var2 = 112 / ((arg1 + 9) / 36);
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 109)
    public class697(class106 arg0, int arg1, class544 arg2) {
        this.field9845 = arg2;
        this.field9845.method3147(5, 52);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)Llw;", line = 124)
    public final class686 method3934(boolean arg0, int arg1) {
        field9851++;
        class387 var3 = this.field9844;
        class686 var4;
        synchronized (this.field9844) {
            var4 = (class686) this.field9844.method2373((long) arg1, 103);
            if (!arg0) {
                method3933(66, (byte) -5);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field9845;
        byte[] var6;
        synchronized (this.field9845) {
            var6 = this.field9845.method3150(arg1, 71, 5);
        }
        class686 var7 = new class686();
        if (var6 != null) {
            var7.method3872(new class120(var6), 1);
        }
        class387 var8 = this.field9844;
        synchronized (this.field9844) {
            this.field9844.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }
}
