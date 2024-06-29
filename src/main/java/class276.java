import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class276 {

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Lck;")
    public class593 field3768 = null;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "[Lco;")
    private class103[] field3767 = null;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Lck;")
    public class593 field3777 = null;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "[Lco;")
    public class103[] field3770 = null;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Lifa;")
    private class393 field3773;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Z")
    public boolean field3776;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Z")
    public static boolean field3775 = true;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "Lwo;")
    public static class690 field3780 = new class690(29, -1);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Lma;")
    public static class12 field3774;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "[I")
    public static int[] field3778;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Z")
    public final boolean method1670(boolean arg0) {
        field3771++;
        if (arg0) {
            field3775 = false;
        }
        if (this.field3776) {
            return this.field3777 != null;
        } else {
            return this.field3770 != null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lcr;B)I")
    public static final int method1671(class531 arg0, byte arg1) {
        field3769++;
        if (arg1 < 40) {
            field3775 = false;
        }
        if (class530.field7740 == arg0) {
            return 9216;
        } else if (class216.field2806 == arg0) {
            return 34065;
        } else if (class368.field4949 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
    public final boolean method1672(int arg0) {
        if (arg0 > -25) {
            method1673(-122, -119, 62, null);
        }
        if (this.field3768 == null) {
            if (class34.field682 == null) {
                byte[] var2 = class345.method1976(0.5F, 4.0F, 16.0F, 4.0F, 0.6F, 128, 0, new class112(419684), 8, 16, 128);
                class34.field682 = class699.method3918(false, var2, true);
            }
            byte[] var3 = class589.method3422(class34.field682, true, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var8 + (var9 * 128);
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[var10 + (var13 - 1 & 0x7F)] & 0xFF) - (var3[var10 + (var13 + 1 & 0x7F)] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field3768 = this.field3773.method500(var4, 1, class391.field5229, 128, 128, 16);
        }
        field3766++;
        return this.field3768 != null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIILhu;)Lht;")
    public static final class537 method1673(int arg0, int arg1, int arg2, class115 arg3) {
        field3781++;
        int var4 = arg3.field1489 | arg0 << 10;
        class537 var5 = (class537) class656.field9311.method3241(arg1 ^ 0xFFFF9EC4, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class351.field4691.method3811(125, class351.field4691.method3784(var4, arg1 ^ 0xFFFFF7A5));
        if (var6 == null) {
            int var9 = arg2 + 65536 << 10 | arg3.field1489;
            class537 var10 = (class537) class656.field9311.method3241(arg1 ^ 0xFFFF9EC4, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class351.field4691.method3811(124, class351.field4691.method3784(var9, arg1 - 2048));
            if (var11 == null) {
                int var14 = arg3.field1489 | 0x3FFFC00;
                class537 var15 = (class537) class656.field9311.method3241(-26958, (long) var14 << 16);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class351.field4691.method3811(126, class351.field4691.method3784(var14, 76));
                if (var16 == null) {
                    if (arg1 != 2166) {
                        field3775 = false;
                    }
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class537 var17;
                    try {
                        var17 = class185.method1150(arg1 - 2279, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field7818 = arg3;
                    class656.field9311.method3240(var17, -126, (long) var14 << 16);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class537 var12;
                try {
                    var12 = class185.method1150(arg1 - 2275, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field7818 = arg3;
                class656.field9311.method3240(var12, -118, (long) var9 << 16);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class537 var7;
            try {
                var7 = class185.method1150(-110, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field7818 = arg3;
            class656.field9311.method3240(var7, arg1 ^ 0xFFFFF7FE, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLjava/lang/String;IZ)I")
    public static final int method1674(byte arg0, String arg1, int arg2, boolean arg3) {
        field3772++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (arg0 > -96) {
            return 100;
        } else if (var5) {
            return var6;
        } else {
            throw new NumberFormatException();
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        field3778 = null;
        if (arg0 < 72) {
            method1673(-113, 76, -24, null);
        }
        field3774 = null;
        field3780 = null;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lifa;)V")
    public class276(class393 arg0) {
        this.field3773 = arg0;
        this.field3776 = this.field3773.field5486;
        if (this.field3776 && !this.field3773.method492(class426.field6122, 8, class279.field3793)) {
            this.field3776 = false;
        }
        if (this.field3776 || this.field3773.method481(class426.field6122, false, class279.field3793)) {
            class365.method2114((byte) 64);
            if (this.field3776) {
                byte[] var2 = class589.method3422(class84.field1199, true, false);
                this.field3777 = this.field3773.method500(var2, 1, class426.field6122, 128, 128, 16);
                byte[] var3 = class589.method3422(class201.field2430, true, false);
                this.field3773.method500(var3, 1, class426.field6122, 128, 128, 16);
            } else {
                this.field3770 = new class103[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class270.method1626(var4 * 128 * 256, class84.field1199, -1, 32768);
                    this.field3770[var4] = this.field3773.method2363(128, true, var7, 128, class426.field6122, (byte) 37);
                }
                this.field3767 = new class103[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class270.method1626(var5 * 32768, class201.field2430, -1, 32768);
                    this.field3767[var5] = this.field3773.method2363(128, true, var6, 128, class426.field6122, (byte) -93);
                }
            }
        }
    }
}
