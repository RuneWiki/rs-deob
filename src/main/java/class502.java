import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class502 {

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Ljk;")
    private class449 field7250 = new class449(64);

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lqn;")
    private class47 field7247;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field7255 = 500;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lcq;")
    public static class328 field7248 = new class328("", 15);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[I")
    public static int[] field7256;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lfl;", line = 3)
    public final class521 method3020(byte arg0, int arg1) {
        field7244++;
        class449 var3 = this.field7250;
        class521 var4;
        synchronized (this.field7250) {
            var4 = (class521) this.field7250.method2647(-103, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field7247;
        byte[] var6;
        synchronized (this.field7247) {
            var6 = this.field7247.method481(35, arg1, -69);
        }
        int var7 = 100 % ((arg0 + 68) / 33);
        class521 var8 = new class521();
        if (var6 != null) {
            var8.method3096((byte) -65, new class463(var6));
        }
        var8.method3098((byte) 125);
        class449 var9 = this.field7250;
        synchronized (this.field7250) {
            this.field7250.method2635((long) arg1, -26591, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILrd;)V", line = 36)
    public static final void method3021(int arg0, class223 arg1) {
        if (arg0 != 0) {
            field7255 = 57;
        }
        field7254++;
        class433 var2 = (class433) class437.field6263.method2022(-1, (long) arg1.field4890);
        if (var2 == null) {
            class244.method1483(null, arg1.field4936[0], 0, arg1, (byte) -123, arg1.field4944[0], arg1.field2676, null);
        } else {
            var2.method2539((byte) 35);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V", line = 57)
    public static final void method3022(long arg0, int arg1) {
        int var3 = 90 / ((arg1 + 66) / 52);
        field7249++;
        int var4 = class14.field233 + class23.field336.field2666;
        int var5 = class57.field753 + class23.field336.field2677;
        if (class119.field1603 - var4 < -500 || (class119.field1603 - var4) > 500 || class56.field740 - var5 < -500 || (class56.field740 - var5) > 500) {
            class56.field740 = var5;
            class119.field1603 = var4;
        }
        if (class119.field1603 != var4) {
            int var6 = var4 - class119.field1603;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (var6 <= 0) {
                if (var7 == 0) {
                    var7 = -1;
                } else if (var7 < var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = 1;
            } else if (var7 > var6) {
                var7 = var6;
            }
            class119.field1603 += var7;
        }
        if (class56.field740 != var5) {
            int var8 = var5 - class56.field740;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var9 > var8) {
                var9 = var8;
            }
            class56.field740 += var9;
        }
        if (!class407.field5817.field3615) {
            class463.field6626 += (float) arg0 * class461.field6598 / 6.0F;
            class49.field629 += (float) arg0 * class59.field773 / 6.0F;
        }
        class389.method2212(-4);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z", line = 147)
    public static final boolean method3023(int arg0, byte arg1, int arg2) {
        field7253++;
        if (arg1 != -125) {
            field7255 = -58;
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 159)
    public static void method3024(int arg0) {
        field7248 = null;
        field7256 = null;
        if (arg0 != 2) {
            field7248 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILtf;)V", line = 174)
    public static final void method3025(int arg0, class194 arg1) {
        field7246++;
        arg1.method1204(true);
        int var2 = 0;
        for (int var3 = 0; var3 < class436.field6234; var3++) {
            int var15 = class12.field218[var3];
            if ((class477.field6926[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class477.field6926[var15] = (byte) class215.method1323(class477.field6926[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method1199(30304, 1);
                    if (var16 == 0) {
                        var2 = class153.method999(true, arg1);
                        class477.field6926[var15] = (byte) class215.method1323(class477.field6926[var15], 2);
                    } else {
                        client.method1234(var15, (byte) -38, arg1);
                    }
                }
            }
        }
        arg1.method1202(-7);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method1204(true);
        for (int var4 = 0; var4 < class436.field6234; var4++) {
            int var13 = class12.field218[var4];
            if ((class477.field6926[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class477.field6926[var13] = (byte) class215.method1323(class477.field6926[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method1199(30304, 1);
                    if (var14 == 0) {
                        var2 = class153.method999(true, arg1);
                        class477.field6926[var13] = (byte) class215.method1323(class477.field6926[var13], 2);
                    } else {
                        client.method1234(var13, (byte) -38, arg1);
                    }
                }
            }
        }
        arg1.method1202(-7);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method1204(true);
        for (int var5 = 0; var5 < class240.field3088; var5++) {
            int var11 = class62.field811[var5];
            if ((class477.field6926[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class477.field6926[var11] = (byte) class215.method1323(class477.field6926[var11], 2);
                } else {
                    int var12 = arg1.method1199(30304, 1);
                    if (var12 == 0) {
                        var2 = class153.method999(true, arg1);
                        class477.field6926[var11] = (byte) class215.method1323(class477.field6926[var11], 2);
                    } else if (class119.method854(-125, arg1, var11)) {
                        class477.field6926[var11] = (byte) class215.method1323(class477.field6926[var11], 2);
                    }
                }
            }
        }
        arg1.method1202(-7);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method1204(true);
        for (int var6 = 0; var6 < class240.field3088; var6++) {
            int var9 = class62.field811[var6];
            if ((class477.field6926[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class477.field6926[var9] = (byte) class215.method1323(class477.field6926[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method1199(30304, 1);
                    if (var10 == 0) {
                        var2 = class153.method999(true, arg1);
                        class477.field6926[var9] = (byte) class215.method1323(class477.field6926[var9], 2);
                    } else if (class119.method854(-122, arg1, var9)) {
                        class477.field6926[var9] = (byte) class215.method1323(class477.field6926[var9], 2);
                    }
                }
            }
        }
        arg1.method1202(-7);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class436.field6234 = 0;
        class240.field3088 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class477.field6926[var7] = (byte) (class477.field6926[var7] >> 1);
            class223 var8 = class387.field5107[var7];
            if (var8 == null) {
                class62.field811[class240.field3088++] = var7;
            } else {
                class12.field218[class436.field6234++] = var7;
            }
        }
        if (arg0 > -83) {
            field7256 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 380)
    public final void method3026(byte arg0) {
        if (arg0 != -108) {
            return;
        }
        class449 var2 = this.field7250;
        synchronized (this.field7250) {
            this.field7250.method2642(0);
        }
        field7245++;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V", line = 394)
    public final void method3027(byte arg0) {
        field7252++;
        class449 var2 = this.field7250;
        synchronized (this.field7250) {
            this.field7250.method2640(110);
            if (arg0 != -27) {
                method3021(-46, null);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 413)
    public final void method3028(int arg0, int arg1) {
        class449 var3 = this.field7250;
        synchronized (this.field7250) {
            this.field7250.method2648(false, arg1);
        }
        if (arg0 <= -11) {
            field7251++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 431)
    public class502(class165 arg0, int arg1, class47 arg2) {
        this.field7247 = arg2;
        if (this.field7247 != null) {
            this.field7247.method469(30322, 35);
        }
    }
}
