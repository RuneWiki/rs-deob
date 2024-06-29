import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class430 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[I")
    public static int[] field5869 = new int[500];

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[Lhf;")
    public static class402[] field5875 = new class402[4];

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lwo;")
    public static class285 field5871;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 6)
    public static final void method2618(int arg0) {
        if (arg0 != -7195) {
            method2623(33, true, -23);
        }
        class264.field3401.method2290(13831);
        field5874++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[[[BIBII)V", line = 20)
    public static final void method2619(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class49.field566++;
        class196.field2330 = 0;
        for (int var6 = class367.field5003; var6 < class238.field3149; var6++) {
            class316[][] var17 = class347.field4722[var6];
            for (int var18 = class118.field1361; var18 < class386.field5281; var18++) {
                for (int var19 = class244.field3247; var19 < class369.field5031; var19++) {
                    class316 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class140.field1628[var18 + class347.field4720 - class325.field4341][var19 + class347.field4720 - class121.field1381] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field4267 = true;
                            var20.field4253 = true;
                            if (var20.field4256 == null) {
                                var20.field4263 = false;
                            } else {
                                var20.field4263 = true;
                            }
                            class196.field2330++;
                        } else {
                            var20.field4267 = false;
                            var20.field4253 = false;
                            var20.field4251 = 0;
                            if (var18 >= class325.field4341 - 16 && var18 <= class325.field4341 + 16 && var19 >= class121.field1381 - 16 && var19 <= class121.field1381 + 16 && (var20.field4268 != null || var20.field4269 != null || var20.field4259 != null || var20.field4266 != null || var20.field4255 != null || var20.field4256 != null)) {
                                class419.field5721.method291((byte) 7, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class75.field915 == class304.field4096;
        for (int var8 = class367.field5003; var8 < class238.field3149; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class131.field1498.method726() && var8 >= arg2 && arg1 != null) {
                int var10 = class140.field1628.length;
                if (class140.field1628.length + class118.field1361 > class43.field512) {
                    var10 -= class140.field1628.length + class118.field1361 - class43.field512;
                }
                int var11 = class140.field1628[0].length;
                if (class140.field1628[0].length + class244.field3247 > class262.field3367) {
                    var11 -= class140.field1628[0].length + class244.field3247 - class262.field3367;
                }
                int var12 = class369.field5028;
                while (true) {
                    if (var12 >= var10) {
                        class419.field5721.method283(false, class304.field4096[var8], var9, true, var8);
                        break;
                    }
                    int var13 = class118.field1361 + var12 - class369.field5028;
                    for (int var14 = class453.field6410; var14 < var11; var14++) {
                        class446.field6218[var12][var14] = false;
                        if (class140.field1628[var12][var14]) {
                            int var15 = class244.field3247 + var14 - class453.field6410;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class347.field4722[var16][var13][var15] != null && class347.field4722[var16][var13][var15].field4250 == var8) {
                                    class446.field6218[var12][var14] = class347.field4722[var16][var13][var15].field4267;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class419.field5721.method283(false, class304.field4096[var8], var9, false, var8);
            }
            class419.field5721.method286((byte) 32);
        }
        if (!class244.method1603(true)) {
            class244.method1603(false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Z", line = 158)
    public final boolean method2620(byte arg0) {
        if (arg0 < 102) {
            field5871 = null;
        }
        field5870++;
        return this.method1847((byte) -7) || this.method1852(false) || this.method1848(500);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Lbo;", line = 169)
    public static final class156 method2621(byte arg0, int arg1) {
        field5873++;
        class365 var2 = class242.field3196;
        class156 var3;
        synchronized (class242.field3196) {
            var3 = (class156) class242.field3196.method2295((long) arg1, (byte) 74);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg0 > -22) {
            field5869 = null;
        }
        byte[] var4 = class184.field2138.method1794(5860, class156.method993(arg1, (byte) 68), class181.method1135(arg1, (byte) -128));
        class156 var5 = new class156();
        var5.field1809 = arg1;
        if (var4 != null) {
            var5.method995((byte) 96, new class242(var4));
        }
        var5.method992(-1);
        class365 var6 = class242.field3196;
        synchronized (class242.field3196) {
            class242.field3196.method2294(var5, (byte) 71, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 202)
    public static final boolean method2622(String arg0, int arg1) {
        field5872++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class368.field5019; var2++) {
            if (arg0.equalsIgnoreCase(class453.field6480[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class195.field2322[var2])) {
                return true;
            }
        }
        if (arg1 == 4) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZI)V", line = 232)
    public static final void method2623(int arg0, boolean arg1, int arg2) {
        field5868++;
        if (class192.method1185(-3201, arg0) && arg1) {
            class240.method1531(arg2, class362.field4903[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V", line = 247)
    public static void method2624(int arg0) {
        field5875 = null;
        field5869 = null;
        if (arg0 < 92) {
            method2624(-70);
        }
        field5871 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
    public abstract int method1858(int arg0);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)I")
    public abstract int method1860(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1852(boolean arg0);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Z")
    public abstract boolean method1847(byte arg0);

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public abstract void method1853(int arg0);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public abstract void method1857(int arg0);

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)Lqn;")
    public abstract class373 method1859(int arg0);

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)Z")
    public abstract boolean method1848(int arg0);
}
