import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class299 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4159 = -1;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[[I")
    public static int[][] field4163 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lkn;")
    public static class442 field4161 = new class442("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method1940(int arg0) {
        if (arg0 != 29417) {
            method1941(false);
        }
        field4163 = null;
        field4161 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Z")
    public static final boolean method1941(boolean arg0) {
        for (int var1 = class405.field5769; var1 < class392.field5617; var1++) {
            class125[][] var2 = class328.field4549[var1];
            for (int var3 = -class305.field4213; var3 <= 0; var3++) {
                int var4 = class357.field4890 + var3;
                int var5 = class357.field4890 - var3;
                if (var4 >= class237.field3368 || var5 < class77.field1107) {
                    for (int var6 = -class305.field4213; var6 <= 0; var6++) {
                        int var7 = class405.field5768 + var6;
                        int var8 = class405.field5768 - var6;
                        if (var4 >= class237.field3368) {
                            if (var7 >= class255.field3586) {
                                class125 var9 = var2[var4][var7];
                                if (var9 != null && var9.field1759) {
                                    class187.field2558 = arg0;
                                    class326.field4453.method2006(var9, true);
                                    class326.field4453.method2013(-122);
                                }
                            }
                            if (var8 < class375.field5351) {
                                class125 var10 = var2[var4][var8];
                                if (var10 != null && var10.field1759) {
                                    class187.field2558 = arg0;
                                    class326.field4453.method2006(var10, true);
                                    class326.field4453.method2013(-89);
                                }
                            }
                        }
                        if (var5 < class77.field1107) {
                            if (var7 >= class255.field3586) {
                                class125 var11 = var2[var5][var7];
                                if (var11 != null && var11.field1759) {
                                    class187.field2558 = arg0;
                                    class326.field4453.method2006(var11, true);
                                    class326.field4453.method2013(-111);
                                }
                            }
                            if (var8 < class375.field5351) {
                                class125 var12 = var2[var5][var8];
                                if (var12 != null && var12.field1759) {
                                    class187.field2558 = arg0;
                                    class326.field4453.method2006(var12, true);
                                    class326.field4453.method2013(-125);
                                }
                            }
                        }
                        if (class30.field490 == 0) {
                            if (class286.field4033) {
                                class326.field4453.method2010((byte) -70, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Luo;I)V")
    public static final void method1942(class345 arg0, int arg1) {
        if (class173.field2367) {
            class90.method632((byte) 66, arg0);
        } else {
            class311.method2002(arg0, (byte) -128);
        }
        field4160++;
        if (arg1 > -85) {
            field4159 = -36;
        }
    }
}
