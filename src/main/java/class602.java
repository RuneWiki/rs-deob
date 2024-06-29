import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class602 implements Runnable {

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "Lwo;")
    private class775 field8420 = new class370();

    @OriginalMember(owner = "client!fia", name = "v", descriptor = "Lwo;")
    private class775 field8432 = null;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "[I")
    public static int[] field8413 = new int[14];

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!fia", name = "l", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!fia", name = "p", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!fia", name = "r", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!fia", name = "s", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!fia", name = "t", descriptor = "I")
    private int field8430;

    @OriginalMember(owner = "client!fia", name = "u", descriptor = "I")
    private int field8431;

    @OriginalMember(owner = "client!fia", name = "x", descriptor = "J")
    private long field8434;

    @OriginalMember(owner = "client!fia", name = "z", descriptor = "J")
    private long field8436;

    @OriginalMember(owner = "client!fia", name = "w", descriptor = "Lvc;")
    private class337 field8433;

    @OriginalMember(owner = "client!fia", name = "m", descriptor = "Lgj;")
    public static class662 field8423;

    @OriginalMember(owner = "client!fia", name = "y", descriptor = "Ljava/lang/String;")
    private String field8435;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "Z")
    private boolean field8418;

    @OriginalMember(owner = "client!fia", name = "q", descriptor = "Z")
    private volatile boolean field8427;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V", line = 5)
    public static void method3409(byte arg0) {
        if (arg0 != 108) {
            method3422((byte) 86);
        }
        field8423 = null;
        field8413 = null;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Ljava/lang/String;Lvc;IJI)V", line = 22)
    public final synchronized void method3410(String arg0, class337 arg1, int arg2, long arg3, int arg4) {
        this.field8430 = arg4;
        if (arg2 >= -30) {
            this.method3414(102);
        }
        field8412++;
        this.field8435 = arg0;
        this.field8436 = arg3;
        this.field8433 = arg1;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)I", line = 36)
    public final int method3411(int arg0) {
        field8426++;
        if (this.field8433 == null) {
            return 0;
        }
        int var2 = this.field8433.method2108((byte) -65);
        if (this.field8433.field4548 && this.field8433.field4547 > this.field8430) {
            return this.field8430 + 1;
        } else if (arg0 <= var2 && var2 < class676.field9430.length - 1) {
            return this.field8433.field4534 == this.field8430 ? this.field8433.field4547 : this.field8433.field4534;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)Lvc;", line = 62)
    public final class337 method3412(int arg0) {
        if (arg0 == -32207) {
            field8421++;
            return this.field8433;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "run", descriptor = "()V", line = 74)
    public final void run() {
        field8417++;
        while (!this.field8427) {
            long var1 = class197.method1423(1);
            synchronized (this) {
                try {
                    this.field8431++;
                    if (this.field8420 instanceof class370) {
                        this.field8420.method879(false, this.field8418);
                    } else {
                        long var4 = class197.method1423(1);
                        if (class95.field1472 == null || this.field8432 == null || this.field8432.method881(-10641) == 0 || this.field8434 < var4 - ((long) this.field8432.method881(-10641))) {
                            if (this.field8432 != null) {
                                this.field8418 = true;
                                this.field8432.method882(14289);
                                this.field8432 = null;
                            }
                            if (this.field8418) {
                                class472.method2717(0);
                                if (class95.field1472 != null) {
                                    class95.field1472.method536(0);
                                }
                            }
                            this.field8420.method879(false, this.field8418 || class95.field1472 != null && class95.field1472.method578());
                        } else {
                            int var6 = (int) ((var4 - this.field8434) * 255L / (long) this.field8432.method881(-10641));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class472.method2717(0);
                            class95.field1472.method536(0);
                            class604 var10 = class95.field1472.method549(class732.field10098, class108.field1697, true);
                            class95.field1472.method532(1, var10);
                            this.field8432.method879(false, true);
                            class95.field1472.method506();
                            var10.method215(0, 0, 0, var9, 1);
                            class95.field1472.method532(1, var10);
                            class95.field1472.method536(0);
                            this.field8420.method879(false, true);
                            class95.field1472.method506();
                            var10.method215(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class95.field1472 != null && !(this.field8420 instanceof class370)) {
                                class95.field1472.method483(-2);
                            }
                        } catch (class789 var18) {
                            class281.method1820(var18.getMessage() + " (Recovered) " + class594.field8348.method2008((byte) -85), 28395, var18);
                            class624.method3517(true, 0, 0);
                        }
                    }
                    Container var12;
                    if (class194.field2956 != null) {
                        var12 = class194.field2956;
                    } else if (class286.field3936 == null) {
                        var12 = class286.field3938;
                    } else {
                        var12 = class286.field3936;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class194.field2956 == var12) {
                        class194.field2956.getInsets();
                    }
                    this.field8418 = false;
                    if (class95.field1472 != null && !(this.field8420 instanceof class370) && this.field8433.method2108((byte) 77) < class337.field4565.method2108((byte) -115)) {
                        class471.method2715(2048);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class197.method1423(1);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class643.method3577((long) var15, 0);
            }
        }
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)V", line = 200)
    public final synchronized void method3413(int arg0) {
        this.field8418 = true;
        field8422++;
        if (arg0 != -1555300634) {
            this.field8418 = false;
        }
    }

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)J", line = 211)
    public final long method3414(int arg0) {
        field8419++;
        return arg0 > -29 ? -117L : this.field8436;
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(B)Ljava/lang/String;", line = 226)
    public final String method3415(byte arg0) {
        if (arg0 == -74) {
            field8425++;
            return this.field8435;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)V", line = 238)
    public final void method3416(boolean arg0) {
        if (!arg0) {
            field8429++;
            this.field8427 = true;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILwo;)V", line = 256)
    public final synchronized void method3417(int arg0, class775 arg1) {
        field8416++;
        this.field8432 = this.field8420;
        this.field8420 = arg1;
        this.field8434 = class197.method1423(arg0 ^ 0xB);
        if (arg0 != 10) {
            this.field8420 = null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "(I)I", line = 269)
    public final int method3418(int arg0) {
        field8411++;
        if (arg0 != -11307) {
            this.method3420(34);
        }
        return this.field8431;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Ld;BLha;)V", line = 280)
    public static final void method3419(class162 arg0, byte arg1, class66 arg2) {
        field8415++;
        if (class64.field875 == null) {
            return;
        }
        if (class394.field5442 < 10) {
            if (!class64.field877.method3725(arg1 - 12763, class64.field875.field3344)) {
                class394.field5442 = class744.field10270.method3728(class64.field875.field3344, (byte) 80) / 10;
                return;
            }
            class331.method2087(false);
            class394.field5442 = 10;
        }
        if (class394.field5442 == 10) {
            class64.field914 = class64.field875.field3331 >> 6 << 6;
            class64.field907 = class64.field875.field3349 >> 6 << 6;
            class64.field901 = (class64.field875.field3345 >> 6 << 6) + 64 - class64.field907;
            class64.field911 = (class64.field875.field3340 >> 6 << 6) + 64 - class64.field914;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class64.field875.method1561(arg1 ^ 0xFFFFFFEE, class400.field5510 + (class235.field3379.field7398 >> 9), (class235.field3379.field7396 >> 9) + class217.field3198, class235.field3379.field7391, var3)) {
                var4 = var3[1] - class64.field907;
                var5 = var3[2] - class64.field914;
            }
            if (!class758.field10446 && var4 >= 0 && class64.field901 > var4 && var5 >= 0 && var5 < class64.field911) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class211.field3161 = var7;
                class215.field3194 = var6;
            } else if (class67.field986 == -1 || class675.field9387 == -1) {
                class64.field875.method1558(var3, class64.field875.field3336 >> 14 & 0x3FFF, (byte) -120, class64.field875.field3336 & 0x3FFF);
                class211.field3161 = var3[2] - class64.field914;
                class215.field3194 = var3[1] - class64.field907;
            } else {
                class64.field875.method1558(var3, class67.field986, (byte) -120, class675.field9387);
                if (var3 != null) {
                    class215.field3194 = var3[1] - class64.field907;
                    class211.field3161 = var3[2] - class64.field914;
                }
                class675.field9387 = -1;
                class67.field986 = -1;
                class758.field10446 = false;
            }
            if (class64.field875.field3335 == 37) {
                class64.field891 = 3.0F;
                class64.field890 = 3.0F;
            } else if (class64.field875.field3335 == 50) {
                class64.field891 = 4.0F;
                class64.field890 = 4.0F;
            } else if (class64.field875.field3335 == 75) {
                class64.field891 = 6.0F;
                class64.field890 = 6.0F;
            } else if (class64.field875.field3335 == 100) {
                class64.field891 = 8.0F;
                class64.field890 = 8.0F;
            } else if (class64.field875.field3335 == 200) {
                class64.field891 = 16.0F;
                class64.field890 = 16.0F;
            } else {
                class64.field891 = 8.0F;
                class64.field890 = 8.0F;
            }
            class64.field885 = (int) class64.field891 >> 1;
            class64.field889 = class424.method2503((byte) 26, class64.field885);
            class538.method3044(-108);
            class64.method456();
            class497.field6805 = new class645();
            class64.field893 += (int) (Math.random() * 5.0D) - 2;
            if (class64.field893 < -8) {
                class64.field893 = -8;
            }
            class64.field886 += (int) (Math.random() * 5.0D) - 2;
            if (class64.field893 > 8) {
                class64.field893 = 8;
            }
            if (class64.field886 < -16) {
                class64.field886 = -16;
            }
            if (class64.field886 > 16) {
                class64.field886 = 16;
            }
            class64.method452(arg0, class64.field893 >> 2 << 10, class64.field886 >> 1);
            class64.field882.method4028(arg1 + 123, 1024, 256);
            class64.field883.method2115(256, (byte) 23, 256);
            class64.field878.method2315(0, 4096);
            class201.field3056.method1926(256, 1);
            class394.field5442 = 20;
        } else if (class394.field5442 == 20) {
            class81.method670(arg1 ^ 0xFFFFFFF4, true);
            class64.method441(arg2, class64.field893, class64.field886);
            class394.field5442 = 60;
            class81.method670(arg1 ^ 0xFFFFFFCF, true);
            class659.method3707(110);
        } else if (class394.field5442 == 60) {
            if (class64.field877.method3745(0, class64.field875.field3344 + "_staticelements")) {
                if (!class64.field877.method3725(-12831, class64.field875.field3344 + "_staticelements")) {
                    return;
                }
                class64.field884 = class47.method349(class64.field877, 0, class64.field875.field3344 + "_staticelements", class295.field4033);
            } else {
                class64.field884 = new class678(0);
            }
            class64.method448();
            class394.field5442 = 70;
            class81.method670(arg1 ^ 0xFFFFFFF3, true);
            class659.method3707(arg1 ^ 0xFFFFFFD6);
        } else if (arg1 == -68) {
            if (class394.field5442 == 70) {
                class332.field4495 = new class585(arg2, 11, true, class558.field7896);
                class394.field5442 = 73;
                class81.method670(119, true);
                class659.method3707(107);
            } else if (class394.field5442 == 73) {
                class418.field5707 = new class585(arg2, 12, true, class558.field7896);
                class394.field5442 = 76;
                class81.method670(79, true);
                class659.method3707(arg1 + 185);
            } else if (class394.field5442 == 76) {
                class410.field5616 = new class585(arg2, 14, true, class558.field7896);
                class394.field5442 = 79;
                class81.method670(78, true);
                class659.method3707(106);
            } else if (class394.field5442 == 79) {
                class492.field6740 = new class585(arg2, 17, true, class558.field7896);
                class394.field5442 = 82;
                class81.method670(117, true);
                class659.method3707(arg1 + 163);
            } else if (class394.field5442 == 82) {
                class405.field5579 = new class585(arg2, 19, true, class558.field7896);
                class394.field5442 = 85;
                class81.method670(87, true);
                class659.method3707(93);
            } else if (class394.field5442 == 85) {
                class724.field9960 = new class585(arg2, 22, true, class558.field7896);
                class394.field5442 = 88;
                class81.method670(88, true);
                class659.method3707(arg1 + 158);
            } else if (class394.field5442 == 88) {
                class466.field6316 = new class585(arg2, 26, true, class558.field7896);
                class394.field5442 = 91;
                class81.method670(124, true);
                class659.method3707(99);
            } else {
                class367.field4983 = new class585(arg2, 30, true, class558.field7896);
                class394.field5442 = 100;
                class81.method670(arg1 + 164, true);
                class659.method3707(97);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "(I)Z", line = 510)
    public final synchronized boolean method3420(int arg0) {
        if (arg0 != 5037) {
            this.field8435 = null;
        }
        field8428++;
        return this.field8420.method877(this.field8434, (byte) -58);
    }

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "(I)I", line = 526)
    public final int method3421(int arg0) {
        field8424++;
        if (arg0 != -14079) {
            this.method3418(48);
        }
        return this.field8430;
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(B)V", line = 539)
    public static final void method3422(byte arg0) {
        if (arg0 != 14) {
            field8423 = null;
        }
        class183.field2844 = class337.method2105(8, 0.4F, true, 4, 2048, 35, 101, 8);
        field8414++;
    }
}
