import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class570 extends class623 {

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "Loia;")
    public class88 field8089;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Lvba;")
    public class40 field8092;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Lpia;")
    public static class94 field8087 = new class94(9, 3);

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "Ldh;")
    public static class320 field8096 = new class320(90, 10);

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public int field8088;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public int field8090;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public int field8091;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    public int field8095;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public int field8097;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field8093;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V", line = 8)
    public static void method3309(boolean arg0) {
        field8087 = null;
        if (!arg0) {
            field8096 = null;
            field8093 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 25)
    public final void method3310(int arg0) {
        field8094++;
        this.field8095 = this.field8089.field919;
        this.field8097 = this.field8089.field928;
        this.field8088 = this.field8089.field923;
        if (this.field8089.field920 != null) {
            this.field8089.field920.method1023(this.field8092.field438, this.field8092.field455, this.field8092.field440, class135.field1537);
        }
        if (arg0 != -21280) {
            this.method3310(-54);
        }
        this.field8091 = class135.field1537[0];
        this.field8090 = class135.field1537[2];
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Loia;Lpd;)V", line = 59)
    public class570(class88 arg0, class257 arg1) {
        this.field8089 = arg0;
        this.field8092 = this.field8089.method609(0);
        this.method3310(-21280);
    }
}
