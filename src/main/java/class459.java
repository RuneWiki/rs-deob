import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class class459 {

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "Lkk;")
    public class238 field6620 = class264.field3448;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "Z")
    public boolean field6621;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "Lik;")
    public class107 field6617;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "Lwu;")
    public class149 field6618;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "Lbk;")
    public class106 field6619;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lkk;I)V", line = 7)
    public void method1215(class238 arg0, int arg1) {
        this.field6620 = arg0;
        if (arg1 != 19759) {
            this.field6619 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lik;Lwu;Lbk;ZI)V", line = 21)
    public class459(class107 arg0, class149 arg1, class106 arg2, boolean arg3, int arg4) {
        this.field6621 = arg3;
        this.field6617 = arg0;
        this.field6618 = arg1;
        this.field6619 = arg2;
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public abstract IDirect3DBaseTexture method1214(int arg0);
}
