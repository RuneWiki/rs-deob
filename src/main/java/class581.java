import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class581 extends class496 {

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field8556;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public int field8555;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public int field8552;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field8553;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field8551;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Z")
    public boolean field8550;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field8554;

    static {
        new class487("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIB)V", line = 8)
    public static final void method3393(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8549++;
        class634.field9255 = arg0;
        class112.field1413 = arg3;
        int var5 = 78 % ((arg4 - 47) / 56);
        class392.field5709 = arg2;
        class32.field328 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 31)
    public static final void method3394(byte arg0) {
        if (arg0 < -15) {
            field8554++;
            class604.field8896.method987(((float) class94.field1158.field287 * 0.1F + 0.7F) * class404.field5804);
            class604.field8896.method1008(class166.field2247, class470.field7211, class510.field7572, (float) (client.field9098 << 0), (float) (class511.field7592 << 0), (float) (class185.field2807 << 0));
            class604.field8896.method962(class264.field3901);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIIZ)V", line = 48)
    public class581(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field8556 = arg4;
        this.field8555 = arg1;
        this.field8552 = arg0;
        this.field8553 = arg3;
        this.field8551 = arg2;
        this.field8550 = arg5;
    }
}
