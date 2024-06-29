import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class141 {

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lki;")
    private class364 field1856;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1853 = -1;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lki;")
    public static class364 field1854 = new class364();

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "F")
    public static float field1859 = 0.0F;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1861 = 0;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[I")
    public static int[] field1862 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lra;")
    public static class361 field1860 = new class361(28, 8);

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lol;")
    public static class388 field1863 = new class388();

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lfaa;")
    private class424 field1852;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILoa;J)V", line = 3)
    public static final void method1064(int arg0, class43 arg1, long arg2) {
        class514.field6735 = class53.field726;
        class123.field1599 = 0;
        field1858++;
        class219.field2878 = 0;
        class53.field726 = 0;
        if (arg0 >= -102) {
            return;
        }
        long var4 = class584.method3191(1);
        for (class231 var6 = (class231) class666.field9241.method2101(260); var6 != null; var6 = (class231) class666.field9241.method2098((byte) 57)) {
            if (var6.method1458(arg1, arg2)) {
                class219.field2878++;
            }
        }
        if (class628.field8775 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class666.field9241.method2097((byte) 106) + ", running: " + class219.field2878);
            System.out.println("Emitters: " + class123.field1599 + " Particles: " + class53.field726 + ". Time taken: " + (class584.method3191(1) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Luaa;", line = 41)
    public static final class405 method1065(int arg0, int arg1) {
        field1855++;
        if (arg1 != -12594) {
            return null;
        }
        class405[] var2 = class313.method1828(4);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class405 var4 = var2[var3];
            if (var4.field5156 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)Lfaa;", line = 68)
    public final class424 method1066(boolean arg0) {
        field1850++;
        if (!arg0) {
            return null;
        }
        class424 var2 = this.field1852;
        if (this.field1856.field4702 == var2) {
            this.field1852 = null;
            return null;
        } else {
            this.field1852 = var2.field5500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 89)
    public static void method1067(byte arg0) {
        field1854 = null;
        field1863 = null;
        field1860 = null;
        if (arg0 != -88) {
            method1067((byte) -118);
        }
        field1862 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lki;I)V", line = 102)
    public final void method1068(class364 arg0, int arg1) {
        field1851++;
        if (arg1 < 81) {
            method1067((byte) -62);
        }
        this.field1856 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Lfaa;", line = 114)
    public final class424 method1069(int arg0) {
        field1857++;
        class424 var2 = this.field1856.field4702.field5500;
        if (this.field1856.field4702 == var2) {
            this.field1852 = null;
            return null;
        }
        this.field1852 = var2.field5500;
        if (arg0 != 17909) {
            field1861 = 95;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 141)
    public class141() {
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lki;)V", line = 156)
    public class141(class364 arg0) {
        this.field1856 = arg0;
    }
}
