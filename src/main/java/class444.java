import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class444 extends class573 {

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "Lgv;")
    public class702 field6165;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "[I")
    public static int[] field6168 = new int[25];

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "Lst;")
    public static class335 field6166 = new class335(64, -1);

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "Z")
    public static boolean field6170 = false;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "Lbaa;")
    public static class130 field6171 = new class130(512);

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "J")
    public static long field6169;

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Ldw;II[B)V")
    public class444(class664 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6165 = class457.method2792(arg1, 6406, false, 6406, arg0, arg2, 92, arg3);
        this.field6165.method2230(3314, false, false);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
    public static void method2715(byte arg0) {
        field6171 = null;
        field6166 = null;
        if (arg0 < -110) {
            field6168 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILtga;[[B)V")
    public static final void method2716(int arg0, class258 arg1, byte[][] arg2) {
        field6167++;
        int var3 = class436.field6089.length;
        if (arg0 != 64) {
            method2716(-98, null, null);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class316.field4364[var4] >> 8) * 64 - class113.field1509;
                int var7 = (class316.field4364[var4] & 0xFF) * 64 - class587.field7995;
                class11.method51(arg0 ^ 0xFFFFFFFC);
                arg1.method1739((byte) 117, var5, var7, class209.field2735, class129.field1802, var6);
            }
        }
    }
}
