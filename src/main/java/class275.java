import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class275 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lff;")
    private class9 field3733 = new class9(64);

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lff;")
    public class9 field3739 = new class9(64);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lvh;")
    public class240 field3731;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lvh;")
    private class240 field3730;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Luf;")
    public static class310 field3734 = new class310(73, 0);

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lff;")
    public static class9 field3736 = new class9(200);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lbk;")
    public static class253 field3740;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lmo;", line = 9)
    public final class526 method1558(int arg0, int arg1) {
        field3738++;
        if (arg0 != -1265) {
            return null;
        }
        class9 var3 = this.field3733;
        class526 var4;
        synchronized (this.field3733) {
            var4 = (class526) this.field3733.method56((long) arg1, 52);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3730.method1411(true, arg1, 34);
        class526 var6 = new class526();
        var6.field7718 = this;
        if (var5 != null) {
            var6.method3083(new class365(var5), -2606);
        }
        class9 var7 = this.field3733;
        synchronized (this.field3733) {
            this.field3733.method73((long) arg1, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 41)
    public final void method1559(int arg0) {
        field3732++;
        class9 var2 = this.field3733;
        synchronized (this.field3733) {
            this.field3733.method65(false);
        }
        class9 var3 = this.field3739;
        synchronized (this.field3739) {
            this.field3739.method65(false);
            if (arg0 < 18) {
                field3734 = null;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V", line = 63)
    public final void method1560(int arg0, int arg1) {
        class9 var3 = this.field3733;
        synchronized (this.field3733) {
            this.field3733.method61((byte) -67, arg0);
        }
        field3735++;
        class9 var4 = this.field3739;
        synchronized (this.field3739) {
            if (arg1 != 34) {
                this.method1559(-65);
            }
            this.field3739.method61((byte) -67, arg0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 79)
    public static void method1561(byte arg0) {
        if (arg0 < 0) {
            field3736 = null;
            field3740 = null;
            field3734 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 98)
    public final void method1562(int arg0) {
        if (arg0 != 64) {
            field3736 = null;
        }
        field3729++;
        class9 var2 = this.field3733;
        synchronized (this.field3733) {
            this.field3733.method67(-97);
        }
        class9 var3 = this.field3739;
        synchronized (this.field3739) {
            this.field3739.method67(38);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V", line = 114)
    public final void method1563(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field3736 = null;
        }
        this.field3733 = new class9(arg2);
        field3737++;
        this.field3739 = new class9(arg1);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 127)
    public static final void method1564(boolean arg0) {
        field3728++;
        if (class38.field513 != null) {
            return;
        }
        int var1 = class200.field2856;
        int var2 = class426.field6240;
        if (arg0) {
            method1561((byte) 2);
        }
        int var3 = class166.field2345 - var1 - class177.field2513;
        int var4 = class282.field3808 - (class351.field4795 + var2);
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class140.field1993 == null) {
                var5 = class282.field3804.field5516;
            } else {
                var5 = class140.field1993;
            }
            int var6 = 0;
            int var7 = 0;
            if (class140.field1993 == var5) {
                Insets var8 = class140.field1993.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class282.field3808);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class166.field2345, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class166.field2345 + var6 - var3, var7, var3, class282.field3808);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class282.field3808 - var4, class166.field2345, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Llf;ILvh;Lvh;)V", line = 208)
    public class275(class157 arg0, int arg1, class240 arg2, class240 arg3) {
        this.field3731 = arg3;
        this.field3730 = arg2;
        this.field3730.method1397((byte) 17, 34);
    }
}
