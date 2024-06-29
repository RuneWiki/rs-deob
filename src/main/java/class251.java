import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class251 {

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "Ljt;")
    private class106 field3627 = new class106(64);

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "Lvd;")
    private class39 field3620;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "[Z")
    public static boolean[] field3626 = new boolean[5];

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static void method1650(int arg0) {
        if (arg0 != 0) {
            field3626 = null;
        }
        field3626 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IB)V")
    public final void method1651(int arg0, byte arg1) {
        class106 var3 = this.field3627;
        synchronized (this.field3627) {
            if (arg1 < 89) {
                return;
            }
            this.field3627.method807(arg0, -1);
        }
        field3619++;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
    public static final void method1652(int arg0) {
        if (arg0 != 32015) {
            method1656((char) 65456, null, -56);
        }
        field3622++;
        if (!class132.field1780) {
            class132.field1780 = true;
            class504.field7168 = true;
            class724.field10112 += (-class724.field10112 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IB)Lnha;")
    public final class323 method1653(int arg0, byte arg1) {
        field3621++;
        if (arg1 != -119) {
            return null;
        }
        class106 var3 = this.field3627;
        class323 var4;
        synchronized (this.field3627) {
            var4 = (class323) this.field3627.method803(107, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field3620;
        byte[] var6;
        synchronized (this.field3620) {
            var6 = this.field3620.method211(true, 11, arg0);
        }
        class323 var7 = new class323();
        if (var6 != null) {
            var7.method2053(true, new class645(var6));
        }
        class106 var8 = this.field3627;
        synchronized (this.field3627) {
            this.field3627.method801(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
    public static final void method1654(byte arg0) {
        if (arg0 != -128) {
            field3626 = null;
        }
        class106 var1 = class141.field1858;
        synchronized (class141.field1858) {
            class141.field1858.method800(83);
        }
        field3628++;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V")
    public final void method1655(int arg0) {
        class106 var2 = this.field3627;
        synchronized (this.field3627) {
            this.field3627.method809(true);
            int var3 = -90 / ((arg0 + 20) / 33);
        }
        field3623++;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(CLjava/lang/String;I)I")
    public static final int method1656(char arg0, String arg1, int arg2) {
        field3624++;
        if (arg2 != 11) {
            field3626 = null;
        }
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
    public final void method1657(byte arg0) {
        field3625++;
        class106 var2 = this.field3627;
        synchronized (this.field3627) {
            if (arg0 > -98) {
                this.field3627 = null;
            }
            this.field3627.method800(81);
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class251(class464 arg0, int arg1, class39 arg2) {
        this.field3620 = arg2;
        if (this.field3620 != null) {
            this.field3620.method229(11, 0);
        }
    }
}
