import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class319 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public int field4994 = -1;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field4997 = 8;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public int field4996 = 1190717;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "Z")
    public boolean field4998 = true;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Z")
    public boolean field5000 = false;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public int field5006 = 128;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public int field5005 = 0;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public int field5001 = -1;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public int field5003 = 16;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Z")
    public boolean field4999 = true;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
    public static boolean field5002 = false;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lkd;)V", line = 7)
    public static final void method2165(class272 arg0) {
        for (int var1 = arg0.field4169; var1 <= arg0.field4185; var1++) {
            for (int var2 = arg0.field4186; var2 <= arg0.field4181; var2++) {
                class174 var3 = class90.field1375[arg0.field4177][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2655; var4++) {
                        if (var3.field2671[var4] == arg0) {
                            var3.field2655--;
                            for (int var5 = var4; var5 < var3.field2655; var5++) {
                                var3.field2671[var5] = var3.field2671[var5 + 1];
                                var3.field2654[var5] = var3.field2654[var5 + 1];
                            }
                            var3.field2671[var3.field2655] = null;
                            break;
                        }
                    }
                    var3.field2661 = 0;
                    for (int var6 = 0; var6 < var3.field2655; var6++) {
                        var3.field2661 |= var3.field2654[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)Ltl;", line = 80)
    public static final class265 method2166(byte arg0, int arg1) {
        field5007++;
        if (arg0 != -64) {
            method2165((class272) null);
        }
        class265 var2 = (class265) class118.field1833.method1294((long) arg1, 117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field2383.method2103(0, 3, arg1);
        class265 var4 = new class265();
        if (var3 != null) {
            var4.method1751(0, new class303(var3));
        }
        class118.field1833.method1292((long) arg1, arg0 ^ 0xFFFFFF87, var4);
        return var4;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILgn;B)V", line = 107)
    public final void method2167(int arg0, class303 arg1, byte arg2) {
        field4995++;
        if (arg2 < 23) {
            method2165((class272) null);
        }
        while (true) {
            int var4 = arg1.method2043((byte) -121);
            if (var4 == 0) {
                return;
            }
            this.method2168(arg0, var4, arg1, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILgn;B)V", line = 130)
    private final void method2168(int arg0, int arg1, class303 arg2, byte arg3) {
        if (arg3 >= -47) {
            return;
        }
        field5004++;
        if (arg1 == 1) {
            this.field5005 = class4.method26(arg2.method2059(255), 80);
        } else if (arg1 == 2) {
            this.field4994 = arg2.method2043((byte) -104);
        } else if (arg1 == 3) {
            this.field4994 = arg2.method1994(false);
            if (this.field4994 == 65535) {
                this.field4994 = -1;
            }
        } else if (arg1 == 5) {
            this.field4998 = false;
        } else if (arg1 == 7) {
            this.field5001 = class4.method26(arg2.method2059(255), 26);
        } else if (arg1 == 8) {
            class345.field5351 = arg0;
        } else if (arg1 == 9) {
            this.field5006 = arg2.method1994(false);
        } else if (arg1 == 10) {
            this.field4999 = false;
        } else if (arg1 == 11) {
            this.field4997 = arg2.method2043((byte) -108);
        } else if (arg1 == 12) {
            this.field5000 = true;
        } else if (arg1 == 13) {
            this.field4996 = arg2.method2059(255);
        } else if (arg1 == 14) {
            this.field5003 = arg2.method2043((byte) -112);
        }
    }
}
