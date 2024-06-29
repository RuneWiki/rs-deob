import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class452 {

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "Lsaa;")
    public class629 field6332 = null;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "[Lhga;")
    public class185[] field6334 = null;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "[Lhga;")
    public class185[] field6340 = null;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "Lsaa;")
    public class629 field6341 = null;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "Lsaa;")
    public class629 field6339 = null;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "Z")
    public boolean field6337;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)I", line = 8)
    public static final int method2652(byte arg0) {
        field6335++;
        if (arg0 > -21) {
            field6333 = 84;
        }
        return class87.method611(-30366, false);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 20)
    public static final void method2653(int arg0) {
        field6331++;
        if (class627.field8740 != null) {
            return;
        }
        int var1 = class204.field2591;
        if (arg0 != 256) {
            return;
        }
        int var2 = class652.field8972;
        int var3 = class538.field7556 - var1 - class599.field8320;
        int var4 = class706.field9947 - class84.field1083 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class95.field1205 != null) {
                var5 = class95.field1205;
            } else if (class745.field10393 == null) {
                var5 = class689.field9789;
            } else {
                var5 = class745.field10393;
            }
            int var6 = 0;
            int var7 = 0;
            if (class95.field1205 == var5) {
                Insets var8 = class95.field1205.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class706.field9947);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class538.field7556, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class538.field7556 - var3, var7, var3, class706.field9947);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class706.field9947 + var7 - var4, class538.field7556, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Leq;)V", line = 132)
    public class452(class357 arg0) {
        this.field6337 = arg0.field5087;
        class336.method1970(true, arg0);
        if (this.field6337) {
            byte[] var2 = class638.method3459(-32767, class461.field6641, false);
            this.field6341 = new class629(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class638.method3459(-32767, class280.field3555, false);
            this.field6332 = new class629(arg0, 6410, 128, 128, 16, var3, 6410);
            class172 var4 = arg0.field4957;
            if (var4.method1072((byte) 104)) {
                byte[] var5 = class638.method3459(-32767, class406.field5733, false);
                this.field6339 = new class629(arg0, 6408, 128, 128, 16);
                class629 var6 = new class629(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1071(var6, 119, this.field6339, 2.0F)) {
                    this.field6339.method2437(true);
                } else {
                    this.field6339.method2429((byte) -111);
                    this.field6339 = null;
                }
                var6.method2429((byte) -95);
                return;
            }
        } else {
            this.field6334 = new class185[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class408.method2419(false, var7 * 128 * 256, 32768, class461.field6641);
                this.field6334[var7] = new class185(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field6340 = new class185[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class408.method2419(false, var8 * 2 * 128 * 128, 32768, class280.field3555);
                this.field6340[var8] = new class185(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)Z", line = 108)
    public static final boolean method2654(int arg0, int arg1) {
        field6336++;
        if (arg1 != 0) {
            method2653(-119);
        }
        return arg0 == 0 || arg0 == 2;
    }
}
