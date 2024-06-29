import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class254 {

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Z")
    public static volatile boolean field4420 = false;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Loh;")
    public static class263 field4418 = class253.method1681(-121, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "[I")
    public static int[] field4422 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Loh;")
    public static class263 field4415 = class253.method1681(-119, ")3)3)3");

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Ljava/awt/Image;")
    public Image field4414;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
    public int[] field4423;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBLue;I)Z")
    public static final boolean method1687(int arg0, byte arg1, class86 arg2, int arg3) {
        field4426++;
        byte[] var4 = arg2.method596(-115, arg3, arg0);
        int var5 = 8 / ((arg1 + 30) / 61);
        if (var4 == null) {
            return false;
        } else {
            class186.method1229(var4, 555);
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZIIII)V")
    public static final void method1688(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4421++;
        int var5 = arg4;
        int var6 = 0;
        int var7 = -1;
        int var8 = -arg4;
        int var9 = class98.method672(-257, class198.field3587, arg2 + arg4, class51.field1099);
        if (arg0) {
            method1687(-72, (byte) 107, (class86) null, -24);
        }
        int var10 = class98.method672(-257, class198.field3587, arg2 - arg4, class51.field1099);
        class191.method1255(var10, arg1, var9, 102, class38.field870[arg3]);
        while (var5 > var6) {
            var7 += 2;
            var8 += var7;
            if (var8 > 0) {
                var5--;
                var8 -= var5 << 1;
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                if (var12 >= class11.field249 && class276.field4831 >= var11) {
                    int var13 = class98.method672(-257, class198.field3587, arg2 + var6, class51.field1099);
                    int var14 = class98.method672(-257, class198.field3587, arg2 - var6, class51.field1099);
                    if (var12 <= class276.field4831) {
                        class191.method1255(var14, arg1, var13, 64, class38.field870[var12]);
                    }
                    if (class11.field249 <= var11) {
                        class191.method1255(var14, arg1, var13, 94, class38.field870[var11]);
                    }
                }
            }
            var6++;
            int var15 = arg3 - var6;
            int var16 = arg3 + var6;
            if (var16 >= class11.field249 && var15 <= class276.field4831) {
                int var17 = class98.method672(-257, class198.field3587, arg2 + var5, class51.field1099);
                int var18 = class98.method672(-257, class198.field3587, arg2 - var5, class51.field1099);
                if (var16 <= class276.field4831) {
                    class191.method1255(var18, arg1, var17, 110, class38.field870[var16]);
                }
                if (class11.field249 <= var15) {
                    class191.method1255(var18, arg1, var17, 109, class38.field870[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method1689(int arg0) {
        field4422 = null;
        if (arg0 != 0) {
            field4420 = false;
        }
        field4415 = null;
        field4418 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method611(int arg0, byte arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method607(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    public abstract void method608(Component arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public final void method1690(int arg0) {
        class133.method878(this.field4423, this.field4416, this.field4419);
        field4417++;
        int var2 = 6 % ((arg0 + 38) / 60);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method1691(byte arg0) {
        field4427++;
        if (!class77.method526(-26670) && class171.field3128 != class12.field321) {
            class1.method9(class229.field4018.field4713[0], class145.field2654, class229.field4018.field4714[0], class12.field321, class3.field68, (byte) -65, false);
            return;
        }
        if (class122.field2257 != class12.field321) {
            class122.field2257 = class12.field321;
            class272.method1851((byte) -103, class12.field321);
            class188.method1233(true);
        }
        if (arg0 != -45) {
            field4415 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    protected class254() {
    }
}
