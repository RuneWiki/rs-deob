import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HNKCWGJM")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "client!HNKCWGJM", name = "n", descriptor = "I")
    public int count;

    @OriginalMember(owner = "client!HNKCWGJM", name = "m", descriptor = "I")
    public int type;

    @OriginalMember(owner = "client!HNKCWGJM", name = "a", descriptor = "(I)LZKARKDQW;")
    public final Model getModel(int arg0) {
        ObjType var2 = ObjType.get(this.type);
        if (arg0 != 4016) {
            throw new NullPointerException();
        }
        return var2.getModel(this.count);
    }
}
