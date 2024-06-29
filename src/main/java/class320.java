import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class320 {

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4373 = new String[] { method2541(method2540("iv\u0007dV")), method2541(method2540("iv\u0007hV")), method2541(method2540("iv\u0007gV")), method2541(method2540("iv\u0007iV")), method2541(method2540("jkEB")), method2541(method2540("\u007f0\u0007\u0000\u0003")), method2541(method2540("iv\u0007fV")), method2541(method2540("`kDC\u0007")) };

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "[Ljc;")
    public static class711[] field4366 = new class711[2048];

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lpca;")
    public static class774 field4367;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/Object;Lft;I)V", line = 8)
    public static final void method2535(Object arg0, class188 arg1, int arg2) {
        try {
            field4369++;
            if (arg1.field2497 != null) {
                for (int var3 = 0; var3 < 50 && arg1.field2497.peekEvent() != null; var3++) {
                    class449.method3474(arg2 ^ 0x5051, 1L);
                }
                if (arg2 != 256) {
                    field4366 = null;
                }
                try {
                    if (arg0 != null) {
                        arg1.field2497.postEvent(new ActionEvent(arg0, 1001, field4373[7]));
                    }
                } catch (Exception var5) {
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4373[6] + (arg0 == null ? field4373[4] : field4373[5]) + ',' + (arg1 == null ? field4373[4] : field4373[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Llq;", line = 38)
    public static final class728 method2536(int arg0) {
        try {
            class656.field9307 = 0;
            field4370++;
            if (arg0 != 8191) {
                method2535(null, null, 69);
            }
            return class522.method3966(1000);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4373[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JB)I", line = 55)
    public final int method2537(long arg0, byte arg1) {
        try {
            field4372++;
            long var4 = this.method1403((byte) 11);
            int var6 = 16 % ((32 - arg1) / 63);
            if (var4 > 0L) {
                class449.method3474(20817, var4);
            }
            return this.method1401(0, arg0);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4373[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 76)
    public static final void method2538(boolean arg0) {
        try {
            field4371++;
            int var1 = class152.field1944 * 512 + 256;
            int var2 = class767.field10954 * 512 + 256;
            int var3 = class100.method977(-1, var2, class693.field9689, var1) - class239.field3455;
            if (field4368 < 100) {
                if (var1 > class670.field9442) {
                    class670.field9442 += (var1 - class670.field9442) * field4368 / 1000 + class160.field2053;
                    if (class670.field9442 > var1) {
                        class670.field9442 = var1;
                    }
                }
                if (var1 < class670.field9442) {
                    class670.field9442 -= (class670.field9442 - var1) * field4368 / 1000 + class160.field2053;
                    if (var1 > class670.field9442) {
                        class670.field9442 = var1;
                    }
                }
                if (class525.field7650 < var3) {
                    class525.field7650 += (var3 - class525.field7650) * field4368 / 1000 + class160.field2053;
                    if (class525.field7650 > var3) {
                        class525.field7650 = var3;
                    }
                }
                if (class688.field9635 < var2) {
                    class688.field9635 += (var2 - class688.field9635) * field4368 / 1000 + class160.field2053;
                    if (class688.field9635 > var2) {
                        class688.field9635 = var2;
                    }
                }
                if (var3 < class525.field7650) {
                    class525.field7650 -= class160.field2053 + ((class525.field7650 - var3) * field4368 / 1000);
                    if (class525.field7650 < var3) {
                        class525.field7650 = var3;
                    }
                }
                if (class688.field9635 > var2) {
                    class688.field9635 -= (class688.field9635 - var2) * field4368 / 1000 + class160.field2053;
                    if (class688.field9635 < var2) {
                        class688.field9635 = var2;
                    }
                }
            } else {
                class688.field9635 = class767.field10954 * 512 + 256;
                class670.field9442 = class152.field1944 * 512 + 256;
                class525.field7650 = class100.method977(-1, class688.field9635, class693.field9689, class670.field9442) - class239.field3455;
            }
            int var4 = class105.field1378 * 512 + 256;
            int var5 = class86.field1220 * 512 + 256;
            int var6 = class100.method977(-1, var5, class693.field9689, var4) - class793.field11530;
            int var7 = var4 - class670.field9442;
            int var8 = var6 - class525.field7650;
            int var9 = var5 - class688.field9635;
            int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
            int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
            int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
            if (var11 < 1024) {
                var11 = 1024;
            }
            if (var11 > 3072) {
                var11 = 3072;
            }
            if (class355.field5151 < var11) {
                class355.field5151 += (var11 - class355.field5151 >> 3) * class369.field5338 / 1000 + class2.field28 << 3;
                if (class355.field5151 > var11) {
                    class355.field5151 = var11;
                }
            }
            if (class355.field5151 > var11) {
                class355.field5151 -= class2.field28 + ((class355.field5151 - var11 >> 3) * class369.field5338 / 1000) << 3;
                if (var11 > class355.field5151) {
                    class355.field5151 = var11;
                }
            }
            int var13 = var12 - class57.field802;
            if (var13 > 8192) {
                var13 -= 16384;
            }
            if (var13 < -8192) {
                var13 += 16384;
            }
            int var14 = var13 >> 3;
            if (var14 > 0) {
                class57.field802 += class369.field5338 * var14 / 1000 + class2.field28 << 3;
                class57.field802 &= 0x3FFF;
            }
            if (var14 < 0) {
                class57.field802 -= -var14 * class369.field5338 / 1000 + class2.field28 << 3;
                class57.field802 &= 0x3FFF;
            }
            int var15 = var12 - class57.field802;
            if (var15 > 8192) {
                var15 -= 16384;
            }
            if (var15 < -8192) {
                var15 += 16384;
            }
            class282.field3974 = 0;
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                class57.field802 = var12;
            }
            if (arg0) {
                method2535(null, null, 112);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field4373[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V", line = 238)
    public static void method2539(boolean arg0) {
        try {
            field4366 = null;
            field4367 = null;
            if (!arg0) {
                method2536(80);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4373[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public abstract void method1402(int arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)J")
    public abstract long method1403(byte arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IJ)I")
    public abstract int method1401(int arg0, long arg1);

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)J")
    public abstract long method1404(boolean arg0);

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2540(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2541(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
