import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class64 extends class59 {

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Z")
    public static boolean field925 = true;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lvl;")
    public static class73 field929;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "[I")
    public static int[] field924;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Z")
    public abstract boolean method409(byte arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lvl;ZLvl;Z)V")
    public static final void method410(class73 arg0, boolean arg1, class73 arg2, boolean arg3) {
        class84.field1293 = arg1;
        field926++;
        if (!arg3) {
            class56.field811 = arg0;
            class67.field995 = arg2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public static final void method411(int arg0) {
        if (class214.field3347 != null && class214.field3347.field3915 - (class214.field3347.method8((byte) -81) - 1) * 64 >> 7 == class31.field380 && (class214.field3347.field3920 - (class214.field3347.method8((byte) -53) * 64 - 64) >> 7) == class121.field1741) {
            class31.field380 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class114.field1671[var1][var6] = 0;
            }
        }
        for (int var2 = 0; var2 < class272.field4432; var2++) {
            class1 var5 = class35.field409[class52.field745[var2]];
            if (var5 != null) {
                var5.field3988 = false;
            }
        }
        for (int var3 = 0; var3 < class80.field1211; var3++) {
            class86 var4 = class191.field3045[class187.field2939[var3]];
            if (var4 != null) {
                var4.field3988 = false;
            }
        }
        if (arg0 != 64) {
            method410((class73) null, true, (class73) null, false);
        }
        field928++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public static final void method412(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class312.field5002; var3++) {
            for (int var4 = 0; var4 < class231.field3748; var4++) {
                for (int var5 = 0; var5 < class175.field2759; var5++) {
                    class113 var6 = class184.field2892[var3][var4][var5];
                    if (var6 != null) {
                        class263 var7 = var6.field1640;
                        if (var7 != null && var7.field4281.method908()) {
                            class15.method89(var7.field4281, var3, var4, var5, 1, 1);
                            if (var7.field4275 != null && var7.field4275.method908()) {
                                class15.method89(var7.field4275, var3, var4, var5, 1, 1);
                                var7.field4281.method893(var7.field4275, 0, 0, 0, false);
                                var7.field4275 = var7.field4275.method902(arg0, arg1, arg2);
                            }
                            var7.field4281 = var7.field4281.method902(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1646; var8++) {
                            class158 var10 = var6.field1634[var8];
                            if (var10 != null && var10.field2365.method908()) {
                                class15.method89(var10.field2365, var3, var4, var5, var10.field2368 + 1 - var10.field2352, var10.field2363 - var10.field2359 + 1);
                                var10.field2365 = var10.field2365.method902(arg0, arg1, arg2);
                            }
                        }
                        class58 var9 = var6.field1650;
                        if (var9 != null && var9.field856.method908()) {
                            class45.method250(var9.field856, var3, var4, var5);
                            var9.field856 = var9.field856.method902(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method413(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lvl;Lvl;B)V")
    public static final void method414(class73 arg0, class73 arg1, byte arg2) {
        class137.field1973 = arg1;
        field923++;
        class13.field196 = arg0;
        if (arg2 > -93) {
            field925 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static void method415(int arg0) {
        field924 = null;
        if (arg0 == 0) {
            field929 = null;
        }
    }
}
