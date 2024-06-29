import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class324 {

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lcba;")
    public static class471 field4369 = new class471(77, 4);

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Ldv;")
    public static class566 field4370 = new class566(75, 15);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "[[B")
    public static byte[][] field4371;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z")
    public final boolean method2008(byte arg0) {
        field4367++;
        if (arg0 != -98) {
            method2012(-36);
        }
        return (this.field4366 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Z")
    public final boolean method2009(int arg0) {
        field4362++;
        if (arg0 != -3309) {
            this.method2008((byte) -79);
        }
        return (this.field4366 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Z")
    public final boolean method2010(int arg0) {
        field4368++;
        if (arg0 != 32) {
            this.field4364 = 17;
        }
        return (this.field4366 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Z")
    public final boolean method2011(boolean arg0) {
        if (!arg0) {
            this.field4364 = -71;
        }
        field4365++;
        return (this.field4366 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public static void method2012(int arg0) {
        field4369 = null;
        if (arg0 != -1) {
            method2012(75);
        }
        field4371 = null;
        field4370 = null;
    }
}
