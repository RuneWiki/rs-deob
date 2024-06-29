import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 extends class50 {

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Lma;")
    private static class84 field1381;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()V")
    public final void method380() {
        field1381.method607((byte) -50, this.field1380);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
    public final void method372() {
        field1381.method606((byte) 41, this.field1380);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method375(Component arg0) throws Exception {
        field1381.method608(-26953, class37.field1007, arg0, class38.field1048);
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public final void method386(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1381.method609(false, arg0, this.field1380);
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lue;I)V")
    public class52(class139 arg0, int arg1) {
        field1381 = arg0.method1032(-65);
        this.field1380 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()I")
    public final int method384() {
        return field1381.method611((byte) -88, this.field1380);
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "()V")
    public static void method414() {
        field1381 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
    public final void method376() {
        field1381.method610(this.field1380, super.field1334);
    }
}
