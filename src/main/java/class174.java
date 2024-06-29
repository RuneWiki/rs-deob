import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class class174 {

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "[Z")
    public static boolean[] field2270 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2269;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 4)
    public static void method1062(int arg0) {
        if (arg0 != -31742) {
            field2269 = null;
        }
        field2269 = null;
        field2270 = null;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 17)
    public static final void method1063(int arg0) {
        if (arg0 != 0) {
            field2269 = null;
        }
        class319.field4568.method212(-85);
        field2265++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)I", line = 28)
    public static final int method1064(byte arg0, int arg1) {
        field2266++;
        if (arg0 != 122) {
            field2270 = null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lil;I)V", line = 44)
    public static final void method1065(class265 arg0, int arg1) {
        field2268++;
        int var2 = arg0.method1680(arg1 - 1647926640);
        class411.field6149 = new class90[var2];
        for (int var3 = arg1; var3 < var2; var3++) {
            class411.field6149[var3] = new class90();
            class411.field6149[var3].field1246 = arg0.method1680(-1647926640);
            class411.field6149[var3].field1244 = arg0.method1663(5);
        }
        class307.field4393 = arg0.method1680(-1647926640);
        class407.field6099 = arg0.method1680(-1647926640);
        class444.field6470 = arg0.method1680(-1647926640);
        class168.field2208 = new class159[class407.field6099 + 1 - class307.field4393];
        for (int var4 = 0; var4 < class444.field6470; var4++) {
            int var5 = arg0.method1680(arg1 ^ 0x9DC6A290);
            class159 var6 = class168.field2208[var5] = new class159();
            var6.field3451 = arg0.method1697(-118);
            var6.field3449 = arg0.method1666(-2);
            var6.field2088 = class307.field4393 + var5;
            var6.field2086 = arg0.method1663(arg1 + 5);
            var6.field2083 = arg0.method1663(5);
        }
        class402.field5975 = arg0.method1666(-2);
        class349.field5180 = true;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZZIIB)V", line = 96)
    public static final void method1067(boolean arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 7) {
            method1067(true, false, -76, 52, (byte) 127);
        }
        field2267++;
        class332.method2191(class234.field3291.length - 1, arg0, arg1, 0, false, arg3, arg2);
        class311.field4449 = null;
        class442.field6460 = 0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lkm;B)Lkm;")
    public abstract class436 method1066(class436 arg0, byte arg1);
}
