import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HNKCWGJM")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "HNKCWGJM", name = "n", descriptor = "I")
    public int count;

    @OriginalMember(owner = "HNKCWGJM", name = "m", descriptor = "I")
    public int type;

    @OriginalMember(owner = "HNKCWGJM", name = "a", descriptor = "(I)LZKARKDQW;")
    public final Model getModel(int arg0) {
        ObjType var2 = ObjType.get(this.type);
        if (arg0 != 4016) {
            throw new NullPointerException();
        }
        return var2.getModel(this.count);
    }
}
