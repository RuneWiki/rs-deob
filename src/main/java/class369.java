import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class369 extends class42 {

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public int field5321;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public int field5332;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    private int field5324;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    private int field5322;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public int field5323;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "F")
    public float field5331;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field5333 = Boolean.FALSE;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Ldh;")
    public static class216 field5325 = new class216(8, 6);

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "Lge;")
    public static class511 field5336 = new class511(64);

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIII)V")
    public abstract void method1507(byte arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)F")
    public final float method2258(byte arg0) {
        if (arg0 < 13) {
            return -0.6098241F;
        } else {
            field5329++;
            return this.field5331;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
    public final int method2259(int arg0) {
        int var2 = -113 / ((63 - arg0) / 63);
        field5327++;
        return this.field5322;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)I")
    public final int method2260(boolean arg0) {
        field5334++;
        return arg0 ? this.field5324 : 92;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)I")
    public final int method2261(byte arg0) {
        if (arg0 != 96) {
            method2263((byte) -23);
        }
        field5326++;
        return this.field5332;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IIIIIF)V")
    public class369(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field5321 = arg1;
        this.field5332 = arg2;
        this.field5324 = arg3;
        this.field5322 = arg4;
        this.field5323 = arg0;
        this.field5331 = arg5;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I")
    public final int method2262(int arg0) {
        field5328++;
        if (arg0 != 6) {
            field5336 = null;
        }
        return this.field5321;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(B)V")
    public static void method2263(byte arg0) {
        if (arg0 > -77) {
            method2263((byte) 47);
        }
        field5325 = null;
        field5336 = null;
        field5333 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BF)V")
    public abstract void method1509(byte arg0, float arg1);

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(B)I")
    public final int method2264(byte arg0) {
        field5330++;
        return arg0 >= -33 ? 63 : this.field5323;
    }
}
