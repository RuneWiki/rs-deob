import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class99 extends class86 {

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Lfe;")
    public static class384 field1347 = new class384(16);

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Lgn;")
    public static class475 field1354 = new class475(66, 4);

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lts;")
    public class356 field1343;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Lts;")
    public class356 field1350;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Ljava/lang/String;")
    public String field1352;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Z")
    public boolean field1344;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field1346;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "[[Lru;")
    public static class121[][] field1353;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1347 = null;
        field1354 = null;
        field1353 = null;
        if (arg0 != 0) {
            method598(-3);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)[Lil;")
    public static final class7[] method599(int arg0) {
        field1356++;
        if (arg0 != 0) {
            method598(110);
        }
        if (class158.field2065 == null) {
            class7[] var1 = class115.method666(-114, class86.field1182);
            class7[] var2 = new class7[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class7 var8 = var1[var4];
                if ((var8.field128 <= 0 || var8.field128 >= 24) && var8.field127 >= 800 && var8.field125 >= 600 && (class315.field4620 >= 96 || class293.field4174 != 0 || var8.field127 <= 1024 && var8.field125 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class7 var10 = var2[var9];
                        if (var8.field127 == var10.field127 && var8.field125 == var10.field125) {
                            if (var10.field128 < var8.field128) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class158.field2065 = new class7[var3];
            class268.method1642(var2, 0, class158.field2065, 0, var3);
            int[] var5 = new int[class158.field2065.length];
            for (int var6 = 0; var6 < class158.field2065.length; var6++) {
                class7 var7 = class158.field2065[var6];
                var5[var6] = var7.field127 * var7.field125;
            }
            class61.method436(var5, class158.field2065, (byte) -117);
        }
        return class158.field2065;
    }
}
