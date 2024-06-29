import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class64 {

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lud;")
    private static class279 field1311 = class130.method1024(" is already on your ignore list)3", 255);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lud;")
    public static class279 field1305 = class130.method1024("voudrait faire un -Bchange avec vous)3", 255);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1307 = 0;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lud;")
    public static class279 field1314 = class130.method1024("::mm", 255);

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lud;")
    public static class279 field1318 = field1311;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[I")
    public static int[] field1319 = new int[4];

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Lud;")
    public static class279 field1321 = class130.method1024(" zuerst von Ihrer Freunde)2Liste(Q", 255);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lig;")
    public static class175 field1308;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field1316;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[I")
    public int[] field1313;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 6)
    public static void method560(int arg0) {
        field1319 = null;
        field1318 = null;
        if (arg0 != 32) {
            field1320 = 61;
        }
        field1321 = null;
        field1308 = null;
        field1314 = null;
        field1305 = null;
        field1311 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lpb;", line = 36)
    public static final class78 method561(Throwable arg0, String arg1) {
        class78 var2;
        if ((arg0 instanceof class78)) {
            var2 = (class78) arg0;
            var2.field1498 = var2.field1498 + ' ' + arg1;
        } else {
            var2 = new class78(arg0, arg1);
        }
        field1310++;
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 63)
    public final void method562(int arg0) {
        field1306++;
        if (arg0 != 32) {
            method563(true, -111);
        }
        class146.method1116(this.field1313, this.field1315, this.field1309);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V", line = 75)
    public static final void method563(boolean arg0, int arg1) {
        field1317++;
        if (arg1 == -1 || !class283.method2031(20714, arg1) || !arg0) {
            return;
        }
        class8[] var2 = class18.field545[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class8 var4 = var2[var3];
            if (var4.field247 != null) {
                class23 var5 = new class23();
                var5.field608 = var4.field247;
                var5.field596 = var4;
                class42.method362(2000000, 125, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 122)
    protected class64() {
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method541(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method543(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public abstract void method542(int arg0, byte arg1, int arg2, Component arg3);
}
