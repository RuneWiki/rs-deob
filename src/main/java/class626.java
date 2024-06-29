import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class626 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lui;")
    public class308 field8887 = class23.field215;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Lkca;")
    public class755 field8891;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Lad;")
    public class173 field8888;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Z")
    public boolean field8889;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lwq;")
    public class674 field8890;

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lad;Lkca;Lwq;ZI)V", line = 21)
    public class626(class173 arg0, class755 arg1, class674 arg2, boolean arg3, int arg4) {
        this.field8891 = arg1;
        this.field8888 = arg0;
        this.field8889 = arg3;
        this.field8890 = arg2;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLui;)V", line = 9)
    public void method616(boolean arg0, class308 arg1) {
        this.field8887 = arg1;
        if (arg0) {
            this.method615((byte) -11);
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method615(byte arg0);
}
