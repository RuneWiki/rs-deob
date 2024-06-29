import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class200 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lij;")
    public static class50 field3295 = class78.method578(121, "Fps:");

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field3290 = 1;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field3302 = 0;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "[Z")
    public static boolean[] field3306 = new boolean[100];

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lij;")
    public static class50 field3298 = class78.method578(125, "");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "J")
    public long field3303;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Laa;")
    public class16 field3291;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Laa;")
    public class16 field3294;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Laa;")
    public class16 field3300;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
    public static final void method1335(int arg0, boolean arg1) {
        field3289++;
        for (class60 var2 = (class60) class183.field3011.method689(1001); var2 != null; var2 = (class60) class183.field3011.method688(-79)) {
            if (var2.field1102 != null) {
                class174.field2907.method80(var2.field1102);
                var2.field1102 = null;
            }
            if (var2.field1110 != null) {
                class174.field2907.method80(var2.field1110);
                var2.field1110 = null;
            }
            var2.method267(-6);
        }
        if (arg1) {
            for (class60 var3 = (class60) class217.field3637.method689(1001); var3 != null; var3 = (class60) class217.field3637.method688(arg0 - 106)) {
                if (var3.field1102 != null) {
                    class174.field2907.method80(var3.field1102);
                    var3.field1102 = null;
                }
                var3.method267(-90);
            }
            for (class60 var4 = (class60) class87.field1677.method446(1); var4 != null; var4 = (class60) class87.field1677.method448((byte) 59)) {
                if (var4.field1102 != null) {
                    class174.field2907.method80(var4.field1102);
                    var4.field1102 = null;
                }
                var4.method267(111);
            }
        }
        if (arg0 != 64) {
            field3290 = -88;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method1336(byte arg0) {
        field3298 = null;
        field3306 = null;
        if (arg0 != -84) {
            field3298 = null;
        }
        field3295 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lff;Z)V")
    public static final void method1337(class237 arg0, boolean arg1) {
        int var2 = arg0.field4004 - class244.field4245;
        if (arg0.field4009 == 0) {
            arg0.field3992 = 1024;
        }
        field3297++;
        if (arg1) {
            field3295 = null;
        }
        int var3 = arg0.field4013 * 128 + arg0.field3976 * 64;
        arg0.field3990 += (var3 - arg0.field3990) / var2;
        int var4 = arg0.field4024 * 128 + arg0.field3976 * 64;
        arg0.field4027 += (var4 - arg0.field4027) / var2;
        if (arg0.field4009 == 1) {
            arg0.field3992 = 1536;
        }
        if (arg0.field4009 == 2) {
            arg0.field3992 = 0;
        }
        if (arg0.field4009 == 3) {
            arg0.field3992 = 512;
        }
        arg0.field4020 = 0;
    }
}
