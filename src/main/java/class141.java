import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class141 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "F")
    public float field2052 = 0.25F;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "F")
    public float field2063 = 1.0F;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "F")
    public float field2057 = 1.0F;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "Lsg;")
    public class267 field2059;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "F")
    public float field2062;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "F")
    public float field2065;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "F")
    public float field2064;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field2068 = 1;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2053 = new CRC32();

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "[I")
    public static int[] field2070 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "Z")
    public static boolean field2071;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static void method1030(int arg0) {
        field2053 = null;
        if (arg0 < 106) {
            method1031((class316) null, 5, (class58) null, (class316) null);
        }
        field2070 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lij;ILea;Lij;)V")
    public static final void method1031(class316 arg0, int arg1, class58 arg2, class316 arg3) {
        class254.field3521 = class1.method1(256, arg0, 0, class156.field2224);
        field2060++;
        class52.field669 = arg2.method262(class254.field3521, class96.method748(arg3, class156.field2224, 0), true);
        class387.field5363 = class1.method1(256, arg0, 0, class366.field5083);
        class31.field432 = arg2.method262(class387.field5363, class96.method748(arg3, class366.field5083, 0), true);
        class280.field3810 = class1.method1(256, arg0, 0, class394.field5476);
        class269.field3685 = arg2.method262(class280.field3810, class96.method748(arg3, class394.field5476, 0), true);
        if (arg1 != -27455) {
            method1031((class316) null, 78, (class58) null, (class316) null);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
    public class141() {
        this.field2058 = class182.field2556;
        this.field2054 = -50;
        this.field2055 = class326.field4435;
        this.field2059 = class451.field6493;
        this.field2061 = -50;
        this.field2069 = -60;
        this.field2062 = 0.69921875F;
        this.field2065 = 1.2F;
        this.field2066 = 0;
        this.field2064 = 1.1523438F;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILrg;)V")
    public final void method1032(int arg0, class366 arg1) {
        this.field2057 = (float) (arg1.method2306((byte) 30) * 8) / 255.0F;
        field2067++;
        this.field2052 = (float) (arg1.method2306((byte) 28) * 8) / 255.0F;
        if (arg0 != 20537) {
            this.field2069 = -33;
        }
        this.field2063 = (float) (arg1.method2306((byte) 48) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lrg;)V")
    public class141(class366 arg0) {
        int var2 = arg0.method2306((byte) 117);
        if (class428.field5958 && class144.field2108.method264() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2058 = class182.field2556;
            } else {
                this.field2058 = arg0.method2258(1177515464);
            }
            if ((var2 & 0x2) == 0) {
                this.field2064 = 1.1523438F;
            } else {
                this.field2064 = (float) arg0.method2297(13352) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2062 = 0.69921875F;
            } else {
                this.field2062 = (float) arg0.method2297(13352) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2065 = 1.2F;
            } else {
                this.field2065 = (float) arg0.method2297(13352) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2258(1177515464);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2297(13352);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2297(13352);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2297(13352);
            }
            this.field2058 = class182.field2556;
            this.field2065 = 1.2F;
            this.field2064 = 1.1523438F;
            this.field2062 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2054 = -50;
            this.field2061 = -50;
            this.field2069 = -60;
        } else {
            this.field2061 = arg0.method2257((byte) 110);
            this.field2069 = arg0.method2257((byte) 110);
            this.field2054 = arg0.method2257((byte) 110);
        }
        if ((var2 & 0x20) == 0) {
            this.field2055 = class326.field4435;
        } else {
            this.field2055 = arg0.method2258(1177515464);
        }
        if ((var2 & 0x40) == 0) {
            this.field2066 = 0;
        } else {
            this.field2066 = arg0.method2297(13352);
        }
        if ((var2 & 0x80) == 0) {
            this.field2059 = class451.field6493;
        } else {
            this.field2059 = class370.method2321(arg0.method2297(13352), arg0.method2297(13352), arg0.method2297(13352), arg0.method2297(13352), arg0.method2297(13352), arg0.method2297(13352), 303);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILeq;)Z")
    public final boolean method1033(int arg0, class141 arg1) {
        int var3 = -36 / ((arg0 + 7) / 52);
        field2056++;
        return this.field2058 == arg1.field2058 && this.field2064 == arg1.field2064 && this.field2062 == arg1.field2062 && this.field2065 == arg1.field2065 && this.field2052 == arg1.field2052 && this.field2057 == arg1.field2057 && this.field2063 == arg1.field2063 && this.field2055 == arg1.field2055 && this.field2066 == arg1.field2066 && this.field2059 == arg1.field2059;
    }
}
