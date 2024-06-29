import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class44 extends class177 {

    @OriginalMember(owner = "client!m", name = "S", descriptor = "Z")
    public volatile boolean field602 = true;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "Z")
    public static boolean field601 = true;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "[I")
    public static int[] field603 = new int[5];

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "Leh;")
    public static class156 field607;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "Z")
    public boolean field600;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "Z")
    public boolean field604;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "[Lhe;")
    public static class87[] field605;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBI)I", line = 31)
    public static final int method263(int arg0, int arg1, byte arg2, int arg3) {
        field608++;
        if (arg2 >= -34) {
            method263(45, -74, (byte) -102, -37);
        }
        return arg1 >= arg3 ? (arg1 <= arg0 ? arg1 : arg0) : arg3;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V", line = 51)
    public static void method264(int arg0) {
        field605 = null;
        if (arg0 != 0) {
            method263(-117, -14, (byte) 83, -9);
        }
        field607 = null;
        field603 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method216(boolean arg0);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "(I)I")
    public abstract int method212(int arg0);
}
