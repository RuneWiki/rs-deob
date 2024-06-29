import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class144 extends class322 implements class560 {

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "[I")
    public static int[] field1620 = new int[5];

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "Lmfa;")
    public static class562 field1618 = new class562();

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "Ljo;")
    public static class303 field1615;

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lnfa;Lvj;III[B)V", line = 5)
    public class144(class621 arg0, class402 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class271.field3429, arg3 * arg4 * arg2, false);
        this.field1616 = arg2;
        this.field1619 = arg4;
        this.field1621 = arg3;
        super.field4183.method2696(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field4190, 0, this.method1819((byte) -128), this.field1616, this.field1621, this.field1619, 0, class590.method3313((byte) 71, super.field4176), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V", line = 23)
    public static final void method789(int arg0) {
        ++field1622;
        if (arg0 != 0) {
            method790(-58);
        }
        class647 var1 = null;
        try {
            class199 var2 = class623.field8837.method3140("2", true, 76);
            while (var2.field2437 == 0) {
                class370.method2025(arg0 + -1, 1L);
            }
            if (var2.field2437 == 1) {
                var1 = (class647) var2.field2434;
                byte[] var3 = new byte[(int) var1.method3632((byte) 47)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3630(false, var3, var3.length + -var4, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class280.method1595((byte) 114, new class452(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3633(0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V", line = 79)
    public static void method790(int arg0) {
        if (arg0 != -26383) {
            field1620 = null;
        }
        field1615 = null;
        field1618 = null;
        field1620 = null;
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V", line = 96)
    public static final void method791(byte arg0) {
        ++field1617;
        class653 var1 = class39.field423;
        synchronized (class39.field423) {
            class39.field423.method3684(arg0 ^ -17155);
            if (arg0 != 45) {
                field1620 = null;
            }
        }
    }
}
