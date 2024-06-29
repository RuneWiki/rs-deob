import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class336 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5249 = 0;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lgi;")
    public static class109 field5257 = new class109(128);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public int field5252;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field5251;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
    public int[] field5253;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILrf;)V", line = 7)
    public static final void method2344(int arg0, class263 arg1) {
        field5258++;
        int var2 = arg1.field4200 - class240.field3818;
        int var3 = arg1.field4242 * 128 + arg1.method1881(-20395) * 64;
        int var4 = arg1.field4224 * 128 + arg1.method1881(arg0 - 8710) * 64;
        arg1.field4239 = 0;
        if (arg0 != -11685) {
            return;
        }
        arg1.field4264 += (var4 - arg1.field4264) / var2;
        arg1.field4255 += (var3 - arg1.field4255) / var2;
        if (arg1.field4210 == 0) {
            arg1.field4277 = 1024;
        }
        if (arg1.field4210 == 1) {
            arg1.field4277 = 1536;
        }
        if (arg1.field4210 == 2) {
            arg1.field4277 = 0;
        }
        if (arg1.field4210 == 3) {
            arg1.field4277 = 512;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 40)
    public final void method2345(byte arg0) {
        field5256++;
        class59.method401(this.field5253, this.field5250, this.field5252);
        if (arg0 >= -113) {
            method2348(true, true, (Object) null);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V", line = 57)
    public static final void method2346(byte arg0) {
        class301.field4725.method707(0);
        int var1 = 95 / ((-arg0 - 81) / 42);
        field5255++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 69)
    public static final String method2347(int arg0, long arg1) {
        field5248++;
        class291.field4662.setTime(new Date(arg1));
        int var3 = class291.field4662.get(7);
        int var4 = class291.field4662.get(5);
        if (arg0 <= 99) {
            method2347(-40, -11L);
        }
        int var5 = class291.field4662.get(2);
        int var6 = class291.field4662.get(1);
        int var7 = class291.field4662.get(11);
        int var8 = class291.field4662.get(12);
        int var9 = class291.field4662.get(13);
        return class209.field3434[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class101.field1471[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZZLjava/lang/Object;)[B", line = 100)
    public static final byte[] method2348(boolean arg0, boolean arg1, Object arg2) {
        field5254++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg2);
            return arg0 ? class315.method2215(var3, (byte) 55) : var3;
        } else if ((arg2 instanceof class14)) {
            class14 var4 = (class14) arg2;
            return var4.method80((byte) 125);
        } else {
            if (!arg1) {
                method2348(false, true, (Object) null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 139)
    public static void method2349(int arg0) {
        field5257 = null;
        if (arg0 != -4) {
            method2344(97, (class263) null);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 147)
    protected class336() {
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    public abstract void method558(boolean arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V")
    public abstract void method556(int arg0, int arg1, boolean arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method557(int arg0, int arg1, Graphics arg2, int arg3);
}
