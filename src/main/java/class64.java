import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class64 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lpg;")
    public static class492 field897 = new class492(43, 5);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lfn;")
    public static class463 field896;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field899;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 7)
    public static void method431(int arg0) {
        field897 = null;
        if (arg0 == -1) {
            field899 = null;
            field896 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 22)
    public static final void method432(byte arg0) {
        if (arg0 != -57) {
            method432((byte) 28);
        }
        for (int var1 = 0; var1 < class240.field3386; var1++) {
            class491 var2 = class19.field284[var1];
            boolean var3 = false;
            if (var2.field7173 == null) {
                var2.field7175--;
                if (var2.field7175 < (var2.field7174 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field7174 == 1 && var2.field7179 == null) {
                        var2.field7179 = class400.method2458(class29.field459, var2.field7167, 0);
                        if (var2.field7179 == null) {
                            continue;
                        }
                        var2.field7175 += var2.field7179.method2459();
                    } else if (var2.field7174 == 2 && (var2.field7168 == null || var2.field7171 == null)) {
                        if (var2.field7168 == null) {
                            var2.field7168 = class360.method2273(class394.field5985, var2.field7167);
                        }
                        if (var2.field7168 == null) {
                            continue;
                        }
                        if (var2.field7171 == null) {
                            var2.field7171 = var2.field7168.method2276(new int[] { 22050 });
                            if (var2.field7171 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field7175 < 0) {
                        int var4;
                        if (var2.field7180 == 0) {
                            var4 = class96.field1399.field5216 * var2.field7177 >> 8;
                        } else {
                            int var5 = (var2.field7180 & 0x3117E56) >> 24;
                            if (class339.field5365.field2210 == var5) {
                                int var6 = var2.field7180 & 0xFF << 7;
                                int var7 = var2.field7180 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class339.field5365.field2217;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var2.field7180 & 0xFF20) >> 8;
                                int var10 = (var9 << 7) + 64 - class339.field5365.field2215;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var2.field7175 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = class96.field1399.field5221 * var2.field7177 * (var6 - var11) / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class343 var12 = null;
                            if (var2.field7174 == 1) {
                                var12 = var2.field7179.method2457().method2200(class316.field4824);
                            } else if (var2.field7174 == 2) {
                                var12 = var2.field7171;
                            }
                            class175 var13 = var2.field7173 = class175.method1256(var12, 100, var4);
                            var13.method1257(var2.field7170 - 1);
                            class325.field4996.method1272(var13);
                        }
                    }
                }
            } else if (!var2.field7173.method2788(-125)) {
                var3 = true;
            }
            if (var3) {
                class240.field3386--;
                for (int var14 = var1; var14 < class240.field3386; var14++) {
                    class19.field284[var14] = class19.field284[var14 + 1];
                }
                var1--;
            }
        }
        field898++;
        if (class165.field2412 && !class49.method350(-1)) {
            if (class96.field1399.field5226 != 0 && class102.field1459 != -1) {
                class76.method503(class96.field1399.field5226, 0, class102.field1459, arg0 + 154, class438.field6532, false);
            }
            class165.field2412 = false;
        } else if (class96.field1399.field5226 != 0 && class102.field1459 != -1 && !class49.method350(-1)) {
            class288.field4293++;
            class179.method1287(false, class410.field6174);
            class75.field1006.method615(arg0 ^ 0xFFFF92AD, class102.field1459);
            class102.field1459 = -1;
        }
    }
}
