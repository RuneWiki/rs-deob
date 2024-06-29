import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class181 extends class569 {

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[[I")
    public static int[][] field2325 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/util/Random;")
    public static Random field2323 = new Random();

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "F")
    public static float field2327;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lwb;")
    public class181 field2321;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lwb;")
    public class181 field2322;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public final void method1132(int arg0) {
        field2326++;
        if (this.field2321 == null) {
            return;
        }
        this.field2321.field2322 = this.field2322;
        this.field2322.field2321 = this.field2321;
        this.field2321 = null;
        this.field2322 = null;
        if (arg0 != 10511) {
            method1134(false);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    public static final int method1133(int arg0, int arg1) {
        if (arg1 != -20650) {
            field2327 = -2.5326827F;
        }
        field2324++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public static void method1134(boolean arg0) {
        field2323 = null;
        field2325 = null;
        if (arg0) {
            field2325 = null;
        }
    }
}
