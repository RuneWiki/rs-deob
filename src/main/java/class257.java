import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class class257 extends class251 {

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "Z")
    public volatile boolean field3923 = true;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field3916 = 0;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "[I")
    public static int[] field3925 = new int[1];

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Loe;")
    public static class127 field3918;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "Llt;")
    public static class458 field3920;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3919;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "Z")
    public boolean field3922;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "Z")
    public boolean field3924;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public static void method1546(byte arg0) {
        int var1 = 43 % ((arg0 - 5) / 34);
        field3920 = null;
        field3925 = null;
        field3918 = null;
        field3919 = null;
    }

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)V")
    public static final void method1547(int arg0) {
        if (arg0 > -60) {
            method1546((byte) -91);
        }
        class65.field1070++;
        class400.method2379((byte) -75, class287.field4348);
        field3917++;
        class230.field3508.method221(-1, 0);
    }

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "(I)[B")
    public abstract byte[] method1005(int arg0);

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "(I)I")
    public abstract int method1009(int arg0);
}
