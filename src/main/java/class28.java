import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class28 {

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lci;")
    public static class60 field426 = new class60();

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lvh;")
    public static class108 field421;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field424;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[I")
    public int[] field420;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[Lcj;")
    public static class74[] field422;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLvh;)V")
    public static final void method183(byte arg0, class108 arg1) {
        field427++;
        if (arg0 >= -60) {
            method188((class197[]) null, -23, (class108) null);
        }
        class1.field14 = arg1.method749("runes", 1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public abstract void method184(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lvb;I)V")
    public static final void method185(class131 arg0, int arg1) {
        field428++;
        class8 var2 = null;
        try {
            class174 var3 = arg0.method905(false, "runescape");
            while (var3.field2857 == 0) {
                class245.method1636(false, 1L);
            }
            if (var3.field2857 == 1) {
                var2 = (class8) var3.field2859;
                class101 var4 = class256.method1690(0);
                var2.method49(var4.field1762, var4.field1730, ~arg1, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method51(arg1 ^ 0xFFFFFF80);
            }
        } catch (Exception var5) {
        }
        if (arg1 != 0) {
            method188((class197[]) null, -107, (class108) null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public final void method186(int arg0) {
        class283.method1860(this.field420, this.field425, this.field418);
        field419++;
        if (arg0 <= 42) {
            this.field424 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method187(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([Lda;ILvh;)V")
    public static final void method188(class197[] arg0, int arg1, class108 arg2) {
        class186.field3020 = arg2;
        class7.field85 = arg0;
        field423++;
        class217.field3659 = new boolean[class7.field85.length];
        client.field4546.method777(true);
        int var3 = class186.field3020.method749("details", arg1);
        int[] var4 = class186.field3020.method743(var3, arg1 + 5063);
        for (int var5 = 0; var5 < var4.length; var5++) {
            client.field4546.method780((byte) -78, (long) var4[var5], class51.method321(0, new class101(class186.field3020.method746(var4[var5], (byte) -128, var3)), var4[var5]));
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    protected class28() {
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static void method189(int arg0) {
        field422 = null;
        field421 = null;
        if (arg0 != 566) {
            field421 = null;
        }
        field426 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public abstract void method190(int arg0, Component arg1, int arg2, boolean arg3);
}
