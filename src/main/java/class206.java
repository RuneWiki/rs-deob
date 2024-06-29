import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class206 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lja;")
    public static class64 field3262;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field3265;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
    public int[] field3264;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 6)
    public static void method1502(byte arg0) {
        if (arg0 >= -83) {
            method1506(false, (class292) null);
        }
        field3262 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 18)
    public final void method1503(int arg0) {
        if (arg0 != 32) {
            this.field3264 = (int[]) null;
        }
        class182.method1371(this.field3264, this.field3257, this.field3258);
        field3254++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V", line = 35)
    public static final void method1504(byte arg0, int arg1) {
        class95.field1565 = arg1;
        field3261++;
        class188.field2994 = -1;
        if (arg0 < 14) {
            field3262 = (class64) null;
        }
        class188.field2994 = -1;
        class40.method326(-1);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 61)
    public static final void method1505(int arg0) {
        if (arg0 > -53) {
            method1504((byte) -13, -23);
        }
        while (class267.field4132.method237((byte) -119, class45.field779) >= 11) {
            int var1 = class267.field4132.method240(11, -121);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class82.field1228[var1] == null) {
                class82.field1228[var1] = new class30();
                if (class138.field2193[var1] != null) {
                    class82.field1228[var1].method204((byte) 122, class138.field2193[var1]);
                }
                var2 = true;
            }
            class149.field2398[class65.field1058++] = var1;
            class30 var3 = class82.field1228[var1];
            var3.field1462 = class205.field3252;
            int var4 = class267.field4132.method240(1, -89);
            int var5 = class267.field4132.method240(5, -36);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class267.field4132.method240(1, -20);
            if (var6 == 1) {
                class231.field3673[class75.field1160++] = var1;
            }
            int var7 = class288.field4391[class267.field4132.method240(3, -71)];
            if (var2) {
                var3.field1395 = var3.field1443 = var7;
            }
            int var8 = class267.field4132.method240(5, -50);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method209(class19.field356.field1386[0] + var5, 128, var4 == 1, class19.field356.field1388[0] + var8);
        }
        field3260++;
        class267.field4132.method238(7);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLob;)Ljava/lang/String;", line = 132)
    public static final String method1506(boolean arg0, class292 arg1) {
        field3259++;
        if (client.method1786(arg1).method345(0) == 0) {
            return null;
        } else if (arg1.field4559 == null || arg1.field4559.trim().length() == 0) {
            return class31.field523 ? "Hidden-use" : null;
        } else {
            if (arg0) {
                field3263 = 74;
            }
            return arg1.field4559;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 154)
    protected class206() {
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method1215(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method1217(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method1216(int arg0, int arg1, int arg2, Graphics arg3);
}
