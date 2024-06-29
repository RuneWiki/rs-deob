import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class594 {

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "[I")
    public int[] field8352;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "[[F")
    public float[][] field8353;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "[I")
    public int[] field8354;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "[I")
    public int[] field8351;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "[Ls;")
    public static class418[] field8355;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static void method3467(int arg0) {
        int var1 = -80 / ((arg0 + 64) / 53);
        field8355 = null;
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class594(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field8352 = arg0;
        this.field8353 = arg3;
        this.field8354 = arg2;
        this.field8351 = arg1;
    }
}
