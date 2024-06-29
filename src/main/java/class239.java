import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class239 {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lsb;")
    public static class98 field4109 = class47.method368("welle2:", 0);

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lsb;")
    public static class98 field4113 = class47.method368("leuchten3:", 0);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lsb;")
    private static class98 field4120 = class47.method368("Loaded fonts", 0);

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lsb;")
    public static class98 field4122 = class47.method368("::", 0);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lsb;")
    public static class98 field4108 = field4120;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lvf;")
    public static class48 field4123 = new class48();

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field4118;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "[I")
    public int[] field4107;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static final void method1630(byte arg0) {
        for (class60 var1 = (class60) class82.field1448.method371((byte) 61); var1 != null; var1 = (class60) class82.field1448.method370(true)) {
            if (var1.field996) {
                var1.method435(128);
            }
        }
        field4114++;
        if (arg0 <= 41) {
            method1632(114);
        }
        for (class60 var2 = (class60) class2.field38.method371((byte) 61); var2 != null; var2 = (class60) class2.field38.method370(true)) {
            if (var2.field996) {
                var2.method435(128);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method1631(int arg0) {
        if (arg0 != 0) {
            this.method250(-35, (byte) -102, (Component) null, 8);
        }
        field4115++;
        class128.method973(this.field4107, this.field4121, this.field4116);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static final void method1632(int arg0) {
        class262 var1 = (class262) class153.field2794.method371((byte) 61);
        if (arg0 < 60) {
            return;
        }
        while (var1 != null) {
            if (var1.field4608 > 0) {
                var1.field4608--;
            }
            if (var1.field4608 != 0) {
                if (var1.field4601 > 0) {
                    var1.field4601--;
                }
                if (var1.field4601 == 0 && var1.field4593 >= 1 && var1.field4595 >= 1 && var1.field4593 <= 102 && var1.field4595 <= 102 && (var1.field4607 < 0 || class194.method1338(var1.field4607, var1.field4605, 192))) {
                    class248.method1724(var1.field4593, var1.field4595, (byte) 66, var1.field4589, var1.field4604, var1.field4607, var1.field4598, var1.field4605);
                    var1.field4601 = -1;
                    if (var1.field4607 == var1.field4590 && var1.field4590 == -1) {
                        var1.method1611((byte) 56);
                    } else if (var1.field4607 == var1.field4590 && var1.field4604 == var1.field4603 && var1.field4605 == var1.field4596) {
                        var1.method1611((byte) -16);
                    }
                }
            } else if (var1.field4590 < 0 || class194.method1338(var1.field4590, var1.field4596, 192)) {
                class248.method1724(var1.field4593, var1.field4595, (byte) 66, var1.field4589, var1.field4603, var1.field4590, var1.field4598, var1.field4596);
                var1.method1611((byte) 89);
            }
            var1 = (class262) class153.field2794.method370(true);
        }
        field4117++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public abstract void method250(int arg0, byte arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static void method1633(int arg0) {
        field4109 = null;
        field4113 = null;
        int var1 = -30 % ((arg0 - 16) / 37);
        field4123 = null;
        field4120 = null;
        field4108 = null;
        field4122 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public abstract void method241(boolean arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)I")
    public static final int method1634(int arg0) {
        if (arg0 == 0) {
            field4119++;
            return 16;
        } else {
            return -7;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method244(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1635(int arg0, int[] arg1) {
        if (arg0 != -16152) {
            return null;
        }
        field4110++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class66.method466(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    protected class239() {
    }
}
