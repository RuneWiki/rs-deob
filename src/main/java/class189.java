import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class189 extends class255 {

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public int field3314 = 12800;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public int field3324 = 0;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public int field3329 = 12800;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public int field3326 = -1;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public int field3328 = 0;

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "Z")
    public boolean field3331 = true;

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "I")
    public int field3334;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "Leb;")
    public class230 field3321;

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "Leb;")
    public class230 field3333;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "Lpk;")
    public class98 field3332;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "[Lec;")
    public static class23[] field3325 = new class23[0];

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "Z")
    public static boolean field3319 = false;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "Lmb;")
    public static class157 field3323;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLob;)V")
    public static final void method1348(byte arg0, class128 arg1) {
        arg1.field2267 = false;
        if (arg1.field2282 != -1) {
            class249 var2 = class237.method1667(arg1.field2282, 111);
            if (var2 == null || var2.field4408 == null) {
                arg1.field2282 = -1;
            } else {
                arg1.field2235++;
                if (var2.field4408.length > arg1.field2259 && arg1.field2235 > var2.field4433[arg1.field2259]) {
                    arg1.field2259++;
                    arg1.field2235 = 1;
                    class27.method263(var2, arg1.field2300, true, arg1.field2274, class56.field1033 == arg1, arg1.field2259);
                }
                if (var2.field4408.length <= arg1.field2259) {
                    arg1.field2235 = 0;
                    arg1.field2259 = 0;
                    class27.method263(var2, arg1.field2300, true, arg1.field2274, class56.field1033 == arg1, arg1.field2259);
                }
            }
        }
        field3315++;
        int var3 = -12 / ((8 - arg0) / 35);
        if (arg1.field2279 != -1 && class259.field4584 >= arg1.field2261) {
            int var4 = class162.method1217((byte) 123, arg1.field2279).field131;
            if (var4 == -1) {
                arg1.field2279 = -1;
            } else {
                class249 var5 = class237.method1667(var4, -126);
                if (var5 == null || var5.field4408 == null) {
                    arg1.field2279 = -1;
                } else {
                    if (arg1.field2281 < 0) {
                        arg1.field2281 = 0;
                        class27.method263(var5, arg1.field2300, true, arg1.field2274, class56.field1033 == arg1, 0);
                    }
                    arg1.field2244++;
                    if (var5.field4408.length > arg1.field2281 && var5.field4433[arg1.field2281] < arg1.field2244) {
                        arg1.field2281++;
                        arg1.field2244 = 1;
                        class27.method263(var5, arg1.field2300, true, arg1.field2274, class56.field1033 == arg1, arg1.field2281);
                    }
                    if (var5.field4408.length <= arg1.field2281) {
                        arg1.field2279 = -1;
                    }
                }
            }
        }
        if (arg1.field2303 != -1 && arg1.field2246 <= 1) {
            class249 var6 = class237.method1667(arg1.field2303, 48);
            if (var6.field4432 == 1 && arg1.field2299 > 0 && class259.field4584 >= arg1.field2238 && arg1.field2275 < class259.field4584) {
                arg1.field2246 = 1;
                return;
            }
        }
        if (arg1.field2303 != -1 && arg1.field2246 == 0) {
            class249 var7 = class237.method1667(arg1.field2303, -117);
            if (var7 == null || var7.field4408 == null) {
                arg1.field2303 = -1;
            } else {
                arg1.field2247++;
                if (arg1.field2273 < var7.field4408.length && var7.field4433[arg1.field2273] < arg1.field2247) {
                    arg1.field2247 = 1;
                    arg1.field2273++;
                    class27.method263(var7, arg1.field2300, true, arg1.field2274, class56.field1033 == arg1, arg1.field2273);
                }
                if (arg1.field2273 >= var7.field4408.length) {
                    arg1.field2273 -= var7.field4441;
                    arg1.field2297++;
                    if (var7.field4423 <= arg1.field2297) {
                        arg1.field2303 = -1;
                    } else if (arg1.field2273 >= 0 && var7.field4408.length > arg1.field2273) {
                        class27.method263(var7, arg1.field2300, true, arg1.field2274, class56.field1033 == arg1, arg1.field2273);
                    } else {
                        arg1.field2303 = -1;
                    }
                }
                arg1.field2267 = var7.field4426;
            }
        }
        if (arg1.field2246 > 0) {
            arg1.field2246--;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZII)Z")
    public final boolean method1349(boolean arg0, int arg1, int arg2) {
        field3330++;
        if (arg0) {
            method1348((byte) 26, (class128) null);
        }
        if (arg1 < this.field3314 || arg1 > this.field3328 || this.field3329 > arg2 || arg2 > this.field3324) {
            return false;
        }
        for (class271 var4 = (class271) this.field3332.method839(128); var4 != null; var4 = (class271) this.field3332.method834((byte) 82)) {
            if (var4.method1851(arg2, arg1, 255)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(II)I")
    public static int method1350(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method1351(boolean arg0) {
        field3325 = null;
        field3323 = null;
        if (arg0) {
            field3319 = true;
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(B)V")
    public final void method1352(byte arg0) {
        field3318++;
        this.field3329 = 12800;
        this.field3328 = 0;
        this.field3324 = 0;
        this.field3314 = 12800;
        int var2 = -23 % ((62 - arg0) / 40);
        for (class271 var3 = (class271) this.field3332.method839(128); var3 != null; var3 = (class271) this.field3332.method834((byte) 82)) {
            if (var3.field4789 < this.field3314) {
                this.field3314 = var3.field4789;
            }
            if (var3.field4793 < this.field3329) {
                this.field3329 = var3.field4793;
            }
            if (this.field3328 < var3.field4787) {
                this.field3328 = var3.field4787;
            }
            if (var3.field4790 > this.field3324) {
                this.field3324 = var3.field4790;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lkk;II)Lej;")
    public static final class49 method1353(class223 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1353((class223) null, -20, -8);
        }
        field3327++;
        return class48.method402(arg0, arg2, true) ? class180.method1306(0) : null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Leb;Leb;IIIZ)V")
    public class189(class230 arg0, class230 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3334 = arg3;
        this.field3326 = arg4;
        this.field3321 = arg0;
        this.field3331 = arg5;
        this.field3333 = arg1;
        this.field3322 = arg2;
        this.field3332 = new class98();
    }
}
