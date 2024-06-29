import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class149 implements class666 {

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Ljava/lang/String;")
    private String field2398;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Ldf;")
    public static class362 field2396 = null;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Lsv;")
    public static class570 field2391 = new class570(85, 3);

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Lbs;")
    public static class169 field2400 = new class169(0, -1);

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "F")
    public static float field2401;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Z")
    private boolean field2390;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "[[I")
    public static int[][] field2397;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method1177(int arg0, int arg1) {
        if (arg1 != -19371) {
            field2396 = null;
        }
        field2395++;
        return arg0 == 48 || arg0 == 44 || arg0 == 17 || arg0 == 13 || arg0 == 16 || arg0 == 18 || arg0 == 12;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lol;B)Lrm;", line = 16)
    public static final class272 method1178(class431 arg0, byte arg1) {
        field2399++;
        int var2 = arg0.method2565((byte) -127);
        class565 var3 = class551.method3180(arg1 + 78)[arg0.method2557(14929)];
        if (arg1 != -79) {
            method1180(48);
        }
        class345 var4 = class91.method777(true)[arg0.method2557(14929)];
        int var5 = arg0.method2528((byte) 89);
        int var6 = arg0.method2528((byte) 89);
        return new class272(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)Z", line = 38)
    public final boolean method1179(int arg0) {
        field2392++;
        return arg0 == 85 ? this.field2390 : false;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)I", line = 51)
    public final int method843(int arg0) {
        if (arg0 != 25894) {
            this.method843(-118);
        }
        field2393++;
        int var2 = class401.method2383((byte) -122, this.field2398);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field2390 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Lpw;", line = 73)
    public final class104 method842(byte arg0) {
        if (arg0 == -49) {
            field2394++;
            return class104.field1513;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V", line = 88)
    public static void method1180(int arg0) {
        field2400 = null;
        field2391 = null;
        field2397 = null;
        if (arg0 > -62) {
            field2400 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 99)
    public class149(String arg0) {
        this.field2398 = arg0;
    }
}
