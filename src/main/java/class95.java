import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class95 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lri;")
    private class189 field1760;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ldj;")
    public static class44 field1763 = class89.method650(255, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Ldj;")
    public static class44 field1768 = class89.method650(255, "null");

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Ldj;")
    private static class44 field1770 = class89.method650(255, "Walk here");

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[Ldj;")
    public static class44[] field1762 = new class44[1000];

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Ldj;")
    public static class44 field1769 = field1770;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "[[[I")
    public static int[][][] field1772;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)V")
    public final void method673(int arg0, long arg1) {
        if (arg0 != 1000) {
            field1769 = null;
        }
        this.field1760.method1180(2, arg1);
        field1764++;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
    public class95(int arg0) {
        this.field1760 = new class189(arg0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method674(int arg0) {
        field1762 = null;
        field1769 = null;
        field1772 = null;
        field1770 = null;
        field1768 = null;
        field1763 = null;
        if (arg0 > -58) {
            field1763 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lwd;JI)V")
    public final void method675(class234 arg0, long arg1, int arg2) {
        if (arg2 != -32074) {
            this.method677(71, 14L);
        }
        this.field1760.method1183((byte) 126, new class152(arg0), arg1);
        field1761++;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public final void method676(int arg0) {
        field1767++;
        if (arg0 == 0) {
            this.field1760.method1179((byte) -126);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IJ)Lwd;")
    public final class234 method677(int arg0, long arg1) {
        field1766++;
        class152 var4 = (class152) this.field1760.method1178(arg1, arg0 + 13176);
        if (arg0 == 1000) {
            return var4 == null ? null : var4.field2643;
        } else {
            return null;
        }
    }
}
