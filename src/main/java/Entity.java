import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZOXDNIET")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "client!ZOXDNIET", name = "i", descriptor = "Z")
    private boolean field1707 = true;

    @OriginalMember(owner = "client!ZOXDNIET", name = "k", descriptor = "I")
    public int field1709 = 1000;

    @OriginalMember(owner = "client!ZOXDNIET", name = "h", descriptor = "B")
    private static byte field1706 = 3;

    @OriginalMember(owner = "client!ZOXDNIET", name = "l", descriptor = "Z")
    public static boolean field1710;

    @OriginalMember(owner = "client!ZOXDNIET", name = "j", descriptor = "[LVOUTABRU;")
    public VertexNormal[] field1708;

    @OriginalMember(owner = "client!ZOXDNIET", name = "a", descriptor = "(IIIIIIIII)V")
    public void method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.method239(field1706);
        if (var10 != null) {
            this.field1709 = var10.field1709;
            var10.method381(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ZOXDNIET", name = "a", descriptor = "(B)LLZYQDKJV;")
    public Model method239(byte arg0) {
        if (arg0 != 3) {
            this.field1707 = !this.field1707;
        }
        return null;
    }
}
