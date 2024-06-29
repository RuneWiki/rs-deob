import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class34 extends class104 {

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "[I")
    public int[] field634 = new int[] { -1 };

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "[I")
    public int[] field638 = new int[1];

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "Le;")
    public static class191 field636 = class54.method368("blinken3:", 2047);

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Z")
    public static boolean field639 = false;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static void method238(int arg0) {
        field636 = null;
        if (arg0 != -29240) {
            field636 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)V")
    public static final void method239(byte arg0, int arg1) {
        field635++;
        class241 var2 = class14.method97(9, arg1, arg0 - 199);
        if (arg0 == 107) {
            var2.method1691(arg0 ^ 0x6B);
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public static final void method240(int arg0) {
        field633++;
        if (class28.field404 == null) {
            return;
        }
        try {
            if (arg0 != 0) {
                method239((byte) -71, 34);
            }
            byte[] var1 = class28.field404.method145((byte) 97);
            if (var1 != null) {
                class225 var2 = new class225(var1);
                class19.field265 = var2.method1593(true);
                class261.field4612 = new class262[class19.field265];
                for (int var3 = 0; var3 < class19.field265; var3++) {
                    class262 var4 = class261.field4612[var3] = new class262();
                    int var5 = var2.method1593(true);
                    var4.field4645 = var5 & 0x7FFF;
                    var4.field4642 = (var5 & 0x8000) != 0;
                    var4.field4633 = var2.method1596((byte) 74);
                    var4.field4644 = var2.method1568(arg0 + 120);
                    var4.field4640 = var3;
                    int var6 = var2.method1593(true);
                    var4.field4635 = class128.method866(var6, true);
                }
                class232.method1642(class261.field4612, true, class261.field4612.length - 1, 0);
                class28.field404 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class28.field404 = null;
        }
    }
}
