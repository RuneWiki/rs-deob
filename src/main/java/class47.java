import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class47 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    private int field757 = 0;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Ljl;")
    private class253 field758;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field756 = " from your ignore list first.";

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Ldb;")
    public static class17 field760 = new class17(64);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Loi;")
    private class82 field765;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field762;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method313(int arg0) {
        field756 = null;
        field762 = null;
        if (arg0 != -1) {
            field756 = null;
        }
        field760 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lpf;Z)V")
    public static final void method314(class294 arg0, boolean arg1) {
        class76.field1228 = arg0;
        field764++;
        if (arg1) {
            method313(98);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Loi;")
    public final class82 method315(int arg0) {
        if (arg0 != 64) {
            field763 = -112;
        }
        field755++;
        if (this.field757 > 0 && this.field758.field3855[this.field757 - 1] != this.field765) {
            class82 var2 = this.field765;
            this.field765 = var2.field1318;
            return var2;
        }
        while (this.field758.field3846 > this.field757) {
            class82 var3 = this.field758.field3855[this.field757++].field1318;
            if (this.field758.field3855[this.field757 - 1] != var3) {
                this.field765 = var3.field1318;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Loi;")
    public final class82 method316(byte arg0) {
        if (arg0 <= 100) {
            return null;
        } else {
            field761++;
            this.field757 = 0;
            return this.method315(64);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static final void method317(int arg0) {
        if (arg0 != 10880) {
            field763 = 42;
        }
        class41.field608.method1775(27147);
        field759++;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ljl;)V")
    public class47(class253 arg0) {
        this.field758 = arg0;
    }
}
