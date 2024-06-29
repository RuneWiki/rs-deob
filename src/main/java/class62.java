import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class62 {

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "Lin;")
    private class91 field1236;

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "Lin;")
    private class91 field1240;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "[I")
    public static int[] field1234 = new int[16];

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "[I")
    public static int[] field1235 = null;

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "[[I")
    public static int[][] field1237 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
    public static int field1230 = 0;

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "Leaa;")
    private class501 field1232;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)Leaa;", line = 3)
    private final class501 method655(int arg0) {
        field1231++;
        if (this.field1232 == null) {
            this.field1232 = new class501();
        }
        if (arg0 > -71) {
            method658(null, -15);
        }
        return this.field1232;
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)V", line = 18)
    public static void method656(int arg0) {
        field1235 = null;
        field1234 = null;
        field1237 = null;
        if (arg0 != 21745) {
            method658(null, -51);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ZLaf;)Laaa;", line = 46)
    public final class617 method657(boolean arg0, class437 arg1) {
        field1239++;
        if (arg1 == null) {
            return null;
        }
        class426 var3 = arg1.method119((byte) 120);
        if (class293.field4105 == var3) {
            return new class562((class684) arg1);
        } else if (class515.field7183 == var3) {
            return new class214(this.method655(-107), (class323) arg1);
        } else if (class438.field6244 == var3) {
            return new class551(this.field1236, (class138) arg1);
        } else if (class133.field2238 == var3) {
            return new class422(this.field1236, (class427) arg1);
        } else if (class215.field3087 == var3) {
            return new class608(this.field1236, this.field1240, (class605) arg1);
        } else if (class464.field6513 == var3) {
            return new class629(this.field1236, this.field1240, (class15) arg1);
        } else if (class681.field9229 == var3) {
            return new class311(this.field1236, this.field1240, (class524) arg1);
        } else if (class558.field7732 == var3) {
            return new class283(this.field1236, this.field1240, (class590) arg1);
        } else {
            if (!arg0) {
                field1235 = null;
            }
            if (class406.field5948 == var3) {
                return new class262(this.field1236, (class679) arg1);
            } else if (class186.field2801 == var3) {
                return new class729(this.field1236, this.field1240, (class392) arg1);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lin;I)V", line = 99)
    public static final void method658(class91 arg0, int arg1) {
        field1233++;
        class120.field2056 = arg0.method870("p11_full", arg1);
        class691.field9325 = arg0.method870("p12_full", arg1);
        class307.field4264 = arg0.method870("b12_full", 0);
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lin;Lin;)V", line = 119)
    public class62(class91 arg0, class91 arg1) {
        this.field1236 = arg0;
        this.field1240 = arg1;
    }
}
