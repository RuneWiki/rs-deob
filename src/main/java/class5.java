import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class5 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Ljj;")
    public static class398 field45 = new class398(66, 3);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public abstract void method29(int arg0);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public abstract void method30(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)Lnb;")
    public abstract class136 method31(byte arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)Z")
    public abstract boolean method32(int arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Loa;B)V")
    public static final void method33(class689 arg0, byte arg1) {
        field44++;
        if (class201.field2631.method369(-19133) == 0) {
            return;
        }
        if (arg1 != 20) {
            field46 = -96;
        }
        if (class161.field2038 == 0) {
            for (class25 var2 = (class25) class201.field2631.method374((byte) 94); var2 != null; var2 = (class25) class201.field2631.method372(-20740)) {
                class237.field3088.method1356(class426.field5926, var2.field235 ? class596.field8164.field7193 : null, arg0, arg0, var2.field241, false, var2.field236, false, false, var2.field238, var2.field242, var2.field240);
                var2.method175(30604);
            }
            class578.method3251((byte) 108);
            return;
        }
        if (class45.field603 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class45.field603 = class689.method3816((byte) -118, 0, class16.field134, 0, var3, class576.field7965);
            class535.field7356 = class45.field603.method2020(class43.method256(class213.field2765, 0, -29213, class613.field8373), class366.method2248(class39.field510, class213.field2765, 0), true);
        }
        for (class25 var4 = (class25) class201.field2631.method374((byte) 81); var4 != null; var4 = (class25) class201.field2631.method372(-20740)) {
            class237.field3088.method1356(class535.field7356, var4.field235 ? class596.field8164.field7193 : null, arg0, class45.field603, var4.field241, false, var4.field236, false, false, var4.field238, var4.field242, var4.field240);
            var4.method175(30604);
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
    public static void method34(int arg0) {
        field45 = null;
        if (arg0 <= 91) {
            method33(null, (byte) 74);
        }
    }
}
