import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class268 extends class359 {

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "Z")
    public boolean field3770;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public int field3776;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "[I")
    public static int[] field3768 = new int[50];

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Lbn;")
    public static class257 field3774;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "Lnm;")
    public static class277 field3775;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method1704(boolean arg0, String arg1) {
        field3767++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V", line = 55)
    public static void method1705(int arg0) {
        if (arg0 != -24966) {
            method1704(false, (String) null);
        }
        field3768 = null;
        field3775 = null;
        field3774 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[[[BIBII)V", line = 68)
    public static final void method1706(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class281.field3953++;
        class215.field2926 = 0;
        for (int var6 = class329.field4710; var6 < class52.field594; var6++) {
            class302[][] var17 = class19.field202[var6];
            for (int var18 = class279.field3932; var18 < class197.field2682; var18++) {
                for (int var19 = class256.field3445; var19 < class440.field6441; var19++) {
                    class302 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class289.field4111[var18 + class118.field1410 - class239.field3251][var19 + class118.field1410 - class326.field4585] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field4304 = true;
                            var20.field4312 = true;
                            if (var20.field4308 == null) {
                                var20.field4307 = false;
                            } else {
                                var20.field4307 = true;
                            }
                            class215.field2926++;
                        } else {
                            var20.field4304 = false;
                            var20.field4312 = false;
                            var20.field4305 = 0;
                            if (var18 >= class239.field3251 - 16 && var18 <= class239.field3251 + 16 && var19 >= class326.field4585 - 16 && var19 <= class326.field4585 + 16 && (var20.field4313 != null || var20.field4324 != null || var20.field4311 != null || var20.field4306 != null || var20.field4310 != null || var20.field4308 != null)) {
                                class341.field5015.method1096(var20, (byte) 82);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class132.field1814 == class111.field1285;
        for (int var8 = class329.field4710; var8 < class52.field594; var8++) {
            float var9 = var7 ? 202.0F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class118.field1400.method996() && var8 >= arg2 && arg1 != null) {
                int var10 = class289.field4111.length;
                if (class289.field4111.length + class279.field3932 > class158.field2245) {
                    var10 -= class289.field4111.length + class279.field3932 - class158.field2245;
                }
                int var11 = class289.field4111[0].length;
                if (class289.field4111[0].length + class256.field3445 > class52.field598) {
                    var11 -= class289.field4111[0].length + class256.field3445 - class52.field598;
                }
                int var12 = class271.field3844;
                while (true) {
                    if (var12 >= var10) {
                        class341.field5015.method1102(var8, var9, class132.field1814[var8], true, 1);
                        break;
                    }
                    int var13 = class279.field3932 + var12 - class271.field3844;
                    for (int var14 = class142.field1997; var14 < var11; var14++) {
                        class240.field3264[var12][var14] = false;
                        if (class289.field4111[var12][var14]) {
                            int var15 = class256.field3445 + var14 - class142.field1997;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class19.field202[var16][var13][var15] != null && class19.field202[var16][var13][var15].field4303 == var8) {
                                    class240.field3264[var12][var14] = class19.field202[var16][var13][var15].field4304;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class341.field5015.method1102(var8, var9, class132.field1814[var8], false, 1);
            }
            class341.field5015.method1093((byte) 89);
        }
        if (!class426.method2658(true)) {
            class426.method2658(false);
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIIZ)V", line = 220)
    public class268(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3770 = arg5;
        this.field3769 = arg0;
        this.field3771 = arg4;
        this.field3772 = arg3;
        this.field3776 = arg2;
        this.field3777 = arg1;
    }
}
