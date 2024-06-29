import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class318 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Ldd;")
    public static class247 field5578 = new class247(128);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lud;")
    private static class279 field5582 = class130.method1024("level: ", 255);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lud;")
    public static class279 field5579 = field5582;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field5583 = -1;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field5584 = 0;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lud;")
    public static class279 field5585 = class130.method1024("Cabbage", 255);

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lud;")
    public static class279 field5588 = class130.method1024("<img=0>", 255);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Z")
    public static boolean field5586 = true;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[[[B")
    public static byte[][][] field5580;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 30)
    public static void method2250(int arg0) {
        field5580 = (byte[][][]) null;
        field5578 = null;
        field5588 = null;
        field5585 = null;
        if (arg0 <= 41) {
            method2250(23);
        }
        field5582 = null;
        field5579 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method1669(byte arg0, int arg1);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lwe;")
    public abstract class51 method1655(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
    public abstract int method1667(int arg0, int arg1);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V")
    public abstract void method1665(int arg0, boolean arg1);
}
