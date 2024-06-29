import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class238 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4230 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[S")
    public static short[] field4231 = new short[256];

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Leg;")
    public static class37 field4232 = class174.method1167("glissement:", -28);

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Lbf;")
    public static class202 field4233 = new class202(64);

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Leg;")
    public static class37 field4237 = class174.method1167("Fps:", 61);

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Leg;")
    private static class37 field4235 = class174.method1167("glow1:", -35);

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Leg;")
    public static class37 field4234 = field4235;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "[[[I")
    public static int[][][] field4238 = new int[4][13][13];

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Leg;")
    public static class37 field4236 = field4235;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field4239 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field4232 = null;
        field4235 = null;
        field4234 = null;
        if (arg0 != -12600) {
            field4239 = -40;
        }
        field4231 = null;
        field4237 = null;
        field4238 = null;
        field4233 = null;
        field4236 = null;
        field4230 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lmk;I)Lmk;")
    public abstract class22 method1324(class22 arg0, int arg1);
}
