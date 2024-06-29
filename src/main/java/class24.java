import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class24 {

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field291 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lol;")
    public static class111 field289;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Lb;")
    public static class262 field292;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field295;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[I")
    public int[] field288;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[Z")
    public static boolean[] field290;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lbc;B)V")
    public static final void method144(class282 arg0, byte arg1) {
        class60.field711 = class254.method1629(0, arg0, 127, class60.field716);
        class60.field707 = class212.method1339(57, arg0, class96.field1281, 0);
        class42.field517 = class212.method1339(57, arg0, class30.field366, 0);
        field286++;
        class248.field3606 = class212.method1339(57, arg0, class72.field869, 0);
        class130.field1884 = class212.method1339(57, arg0, class3.field36, 0);
        class108.field1463 = class212.method1339(57, arg0, class161.field2324, 0);
        class14.field180 = class212.method1339(57, arg0, class277.field4213, 0);
        class80.field947 = class118.method758(0, class243.field3547, arg0, -58);
        class115.field1579 = class209.method1330(arg0, 0, class223.field3152, 13162);
        class257.field3725 = class209.method1330(arg0, 0, class241.field3512, 13162);
        class204.field2903 = class57.method356(0, arg0, class135.field1971, 0);
        int var2 = 51 % ((arg1 + 30) / 57);
        class36.field420 = class57.method356(0, arg0, class21.field254, 0);
        class11.field141.method523(class36.field420, (int[]) null);
        class204.field2904.method523(class36.field420, (int[]) null);
        class248.field3614.method523(class36.field420, (int[]) null);
        class187 var3 = class61.method380(0, 0, arg0, class152.field2203);
        var3.method1228();
        class63.field738 = var3;
        class187[] var4 = class254.method1629(0, arg0, 127, class280.field4250);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1228();
        }
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class88.field1188 = var4;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        for (int var10 = 0; var10 < class60.field711.length; var10++) {
            class60.field711[var10].method1233(var7 + var8, var6 + var8, var8 + var9);
        }
        class144.field2065 = class60.field711;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method145(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static final void method146(byte arg0) {
        class285.field4395.method71(-76);
        field293++;
        if (arg0 != 35) {
            field291 = -61;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public final void method147(int arg0) {
        field294++;
        if (arg0 >= -75) {
            method148(-87);
        }
        class155.method1025(this.field288, this.field287, this.field296);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public static void method148(int arg0) {
        field292 = null;
        field289 = null;
        field290 = null;
        if (arg0 != 21) {
            method144((class282) null, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method149(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method150(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    protected class24() {
    }
}
