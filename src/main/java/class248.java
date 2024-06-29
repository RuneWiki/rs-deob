import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class248 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lhba;")
    public static class404 field3625 = new class404();

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[I")
    public static int[] field3626 = new int[32];

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field3628;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILqa;B)V", line = 4)
    public static final void method1579(int arg0, int arg1, class167 arg2, byte arg3) {
        class604.field8896 = arg2;
        field3623++;
        class468.field6812 = new class278[arg1][arg0];
        if (class120.field1557 != null) {
            class445.field6487 = class21.method97(class120.field1557[0], class120.field1557[2], class120.field1557[4], class120.field1557[3], class120.field1557[5], class120.field1557[1], (byte) -45);
        }
        class136.field1806 = new class278();
        class292.method1802(-30146);
        if (arg3 != 65) {
            method1581(-124);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(JBLqa;)V", line = 31)
    public static final void method1580(long arg0, byte arg1, class167 arg2) {
        class149.field1923 = 0;
        class518.field7709 = class566.field8392;
        field3624++;
        class566.field8392 = 0;
        long var4 = class450.method2719((byte) -15);
        if (arg1 >= -34) {
            method1580(109L, (byte) -53, null);
        }
        for (class96 var6 = (class96) class585.field8699.method772(0); var6 != null; var6 = (class96) class585.field8699.method775(2)) {
            if (var6.method544(arg2, arg0)) {
                class149.field1923++;
            }
        }
        if (class501.field7500 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class585.field8699.method773(true) + ", running: " + class149.field1923 + ". Particles: " + class566.field8392 + ". Time taken: " + (class450.method2719((byte) -24) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 66)
    public static void method1581(int arg0) {
        field3625 = null;
        if (arg0 < 84) {
            method1580(39L, (byte) 35, null);
        }
        field3626 = null;
        field3628 = null;
    }
}
