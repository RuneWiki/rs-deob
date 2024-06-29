import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class371 {

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "Lqia;")
    private class547 field5227;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5224 = null;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "Lns;")
    private class627 field5228;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
    public static void method2264(int arg0) {
        if (arg0 <= 72) {
            field5224 = null;
        }
        field5224 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lqia;I)V")
    public final void method2265(class547 arg0, int arg1) {
        if (arg1 != -2156) {
            field5224 = null;
        }
        field5223++;
        this.field5227 = arg0;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)Lns;")
    public final class627 method2266(byte arg0) {
        if (arg0 <= 108) {
            method2264(78);
        }
        field5225++;
        class627 var2 = this.field5227.field7718.field8744;
        if (this.field5227.field7718 == var2) {
            this.field5228 = null;
            return null;
        } else {
            this.field5228 = var2.field8744;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)Lns;")
    public final class627 method2267(byte arg0) {
        field5226++;
        class627 var2 = this.field5228;
        if (this.field5227.field7718 == var2) {
            this.field5228 = null;
            return null;
        } else if (arg0 == 70) {
            this.field5228 = var2.field8744;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
    public class371() {
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lqia;)V")
    public class371(class547 arg0) {
        this.field5227 = arg0;
    }
}
