import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class311 extends class398 {

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    private int field4322;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "Lwaa;")
    private static class702 field4323;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "()I")
    public final int method2017() {
        return field4323.method1158((byte) -60, this.field4322);
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "()V")
    public static void method2018() {
        field4323 = null;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "()V")
    public final void method2019() {
        field4323.method1159((byte) 36, this.field4322);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
    public final void method2020(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4323.method1156(3, arg0, this.field4322);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2021(Component arg0) throws Exception {
        field4323.method1161(arg0, class673.field9127, class68.field831, 0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
    public final void method2022() {
        field4323.method1157(this.field4322, (byte) 114);
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lvc;I)V")
    public class311(class316 arg0, int arg1) {
        field4323 = (class702) arg0.method2053((byte) 123);
        this.field4322 = arg1;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "()V")
    public final void method2023() {
        field4323.method1160(this.field4322, super.field5603);
    }
}
