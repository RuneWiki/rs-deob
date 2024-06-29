import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class45 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Z")
    public boolean field813 = true;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public int field812 = -1;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public int field819 = 0;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field820 = -1;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[[I")
    public static int[][] field814 = new int[104][104];

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lpg;")
    public static class75 field816 = new class75(0, 0);

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "S")
    public static short field825 = 32767;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field826 = "Walk here";

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lqh;")
    public static class201 field818;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method365(int arg0) {
        field814 = null;
        if (arg0 != -8192) {
            method368((byte) 124);
        }
        field818 = null;
        field826 = null;
        field816 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)Z")
    public static final boolean method366(byte arg0, int arg1) {
        field824++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class279.field4427[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0 >= -77) {
            method365(-48);
        }
        return var2 == 1005;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZLog;)V")
    public final void method367(int arg0, boolean arg1, class221 arg2) {
        field817++;
        while (true) {
            int var4 = arg2.method1517((byte) -96);
            if (var4 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.field812 = 16;
                    return;
                }
            }
            this.method369(var4, arg2, -4, arg0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static final void method368(byte arg0) {
        field821++;
        if (class274.field4345 != null || arg0 != -33 || client.field2517 != null) {
            return;
        }
        int var1 = class115.field1920;
        if (!class199.field3181) {
            if (var1 == 1 && class205.field3291 > 0) {
                short var12 = class279.field4427[class205.field3291 - 1];
                if (var12 == 24 || var12 == 58 || var12 == 23 || var12 == 29 || var12 == 12 || var12 == 22 || var12 == 9 || var12 == 41 || var12 == 37 || var12 == 1 || var12 == 15 || var12 == 1001) {
                    int var13 = class253.field4035[class205.field3291 - 1];
                    int var14 = class200.field3190[class205.field3291 - 1];
                    class36 var15 = class64.method455(var14, 592427152);
                    class84 var16 = client.method1093(var15);
                    if (var16.method604(-95) || var16.method603(0)) {
                        class78.field1246 = 0;
                        class102.field1669 = false;
                        if (class274.field4345 != null) {
                            class280.method1886(class274.field4345, 32);
                        }
                        class274.field4345 = class64.method455(var14, arg0 ^ 0xDCB0474F);
                        class284.field4491 = class235.field3829;
                        class229.field3789 = var13;
                        class48.field859 = class248.field3953;
                        class280.method1886(class274.field4345, 32);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class222.field3683 == 1 && class205.field3291 > 2 || method366((byte) -114, class205.field3291 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class205.field3291 > 0 || class253.field4036 == 1) {
                class180.method1225(22);
            }
            if ((var1 != 1 || class205.field3291 <= 0) && class253.field4036 != 2) {
                return;
            }
            class179.method1222(15444);
            return;
        }
        if (var1 != 1) {
            int var2 = class241.field3898;
            int var3 = class109.field1801;
            if (class279.field4404 - 10 > var2 || var2 > (class68.field1134 + class279.field4404 + 10) || (class23.field386 - 10) > var3 || class23.field386 + class145.field2322 + 10 < var3) {
                class199.field3181 = false;
                class154.method1072(class23.field386, class145.field2322, class68.field1134, class279.field4404, (byte) 114);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class279.field4404;
        int var5 = class68.field1134;
        int var6 = class23.field386;
        int var7 = class248.field3953;
        int var8 = class235.field3829;
        int var9 = -1;
        for (int var10 = 0; var10 < class205.field3291; var10++) {
            int var11;
            if (class240.field3892) {
                var11 = (class205.field3291 - var10 - 1) * 15 + (var6 + 35);
            } else {
                var11 = (class205.field3291 - var10 - 1) * 15 + var6 + 31;
            }
            if (var4 < var7 && (var4 + var5) > var7 && (var11 - 13) < var8 && (var11 + 3) > var8) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class101.method747(var9, true);
        }
        class199.field3181 = false;
        class154.method1072(class23.field386, class145.field2322, class68.field1134, class279.field4404, (byte) 41);
        return;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILog;II)V")
    private final void method369(int arg0, class221 arg1, int arg2, int arg3) {
        if (arg2 != -4) {
            return;
        }
        if (arg0 == 1) {
            this.field819 = class16.method127(arg2 + 5004, arg1.method1531(65280));
        } else if (arg0 == 2) {
            this.field820 = arg1.method1517((byte) -96);
        } else if (arg0 == 3) {
            this.field820 = arg1.method1521((byte) 113);
            if (this.field820 == 65535) {
                this.field820 = -1;
            }
        } else if (arg0 == 5) {
            this.field813 = false;
        } else if (arg0 == 7) {
            this.field812 = class16.method127(5000, arg1.method1531(arg2 ^ 0xFFFF00FC));
        } else if (arg0 == 8) {
            class216.field3529 = arg3;
        } else if (arg0 == 9) {
            arg1.method1521((byte) 113);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg1.method1517((byte) -96);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg1.method1531(arg2 + 65284);
                } else if (arg0 == 14) {
                    arg1.method1517((byte) -96);
                }
            }
        }
        field822++;
    }
}
