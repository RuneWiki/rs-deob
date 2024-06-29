import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class777 extends class601 {

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    private int field10606 = 204;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    private int field10602 = 0;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
    private int field10612 = 1024;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    private int field10608 = 1024;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    private int field10599 = 81;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    private int field10605 = 8;

    @OriginalMember(owner = "client!lr", name = "Z", descriptor = "I")
    private int field10618 = 4;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
    private int field10611 = 409;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public static int field10600 = -1;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    private int field10603;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field10604;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    public static int field10609;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
    public static int field10610;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "I")
    public static int field10613;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    public static int field10614;

    @OriginalMember(owner = "client!lr", name = "W", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!lr", name = "Y", descriptor = "I")
    public static int field10617;

    @OriginalMember(owner = "client!lr", name = "ab", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!lr", name = "bb", descriptor = "I")
    private int field10620;

    @OriginalMember(owner = "client!lr", name = "cb", descriptor = "I")
    private int field10621;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lr", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field10622;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "[I")
    private int[] field10607;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "[[I")
    private int[][] field10601;

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "[[I")
    private int[][] field10616;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
    public final void method292(byte arg0) {
        ++field10604;
        if (arg0 <= 44) {
            this.method259((class234) null, 79, -93);
        }
        this.method4257((byte) 38);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
    public class777() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field10615;
        int var4 = 117 / ((40 - arg2) / 52);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field10612 = arg0.method1553((byte) -108);
                                    }
                                } else {
                                    this.field10599 = arg0.method1553((byte) 21);
                                }
                            } else {
                                this.field10602 = arg0.method1553((byte) 59);
                            }
                        } else {
                            this.field10608 = arg0.method1553((byte) 102);
                        }
                    } else {
                        this.field10606 = arg0.method1553((byte) -115);
                    }
                } else {
                    this.field10611 = arg0.method1553((byte) 10);
                }
            } else {
                this.field10605 = arg0.method1509(true);
            }
        } else {
            this.field10618 = arg0.method1509(true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field10610;
        if (arg1 > -76) {
            return null;
        } else {
            int[] var3 = super.field7643.method2054(arg0, 9986);
            if (super.field7643.field4364) {
                int var4 = 0;
                int var5;
                for (var5 = class427.field5623[arg0] + this.field10602; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~this.field10605 < ~var4 && ~var5 <= ~this.field10607[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(1 & var4) == -1;
                int var8 = this.field10607[var4];
                int var9 = this.field10607[var4 + -1];
                if (this.field10603 + var9 < var5 && -this.field10603 + var8 > var5) {
                    for (int var10 = 0; class418.field5518 > var10; ++var10) {
                        int var11 = !var7 ? -this.field10608 : this.field10608;
                        int var12 = 0;
                        int var13;
                        for (var13 = (this.field10620 * var11 >> 12) + class64.field839[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (~var12 > ~this.field10618 && ~var13 <= ~this.field10601[var6][var12]) {
                            ++var12;
                        }
                        int var14 = var12 + -1;
                        int var15 = this.field10601[var6][var12];
                        int var16 = this.field10601[var6][var14];
                        if (this.field10603 + var16 < var13 && var13 < -this.field10603 + var15) {
                            var3[var10] = this.field10616[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class642.method3478(var3, 0, class418.field5518, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)[B")
    public static final byte[] method4256(int arg0, boolean arg1) {
        ++field10619;
        if (!arg1) {
            return null;
        } else {
            class224 var2 = (class224) class538.field6777.method1941((long) arg0, (byte) -60);
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg0);
                for (int var5 = 0; ~var5 > -256; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; ~var6 > -256; ++var6) {
                    int var7 = -var6 + 255;
                    int var8 = class419.method2416(var7, var4, (byte) 126);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class224(var3);
                class538.field6777.method1936(var2, (long) arg0, -104);
            }
            return var2.field3038;
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V")
    private final void method4257(byte arg0) {
        ++field10614;
        Random var2 = new Random((long) this.field10605);
        this.field10620 = 4096 / this.field10618;
        this.field10603 = this.field10599 / 2;
        this.field10621 = 4096 / this.field10605;
        int var3 = this.field10620 / 2;
        if (arg0 < 17) {
            this.method261(67, (byte) 57);
        }
        this.field10616 = new int[this.field10605][this.field10618];
        this.field10607 = new int[this.field10605 + 1];
        int var4 = this.field10621 / 2;
        this.field10601 = new int[this.field10605][this.field10618 + 1];
        this.field10607[0] = 0;
        for (int var5 = 0; var5 < this.field10605; ++var5) {
            if (var5 > 0) {
                int var6 = this.field10621;
                int var7 = (-2048 + class419.method2416(4096, var2, (byte) 122)) * this.field10606 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field10607[var5] = this.field10607[var5 + -1] + var8;
            }
            this.field10601[var5][0] = 0;
            for (int var9 = 0; var9 < this.field10618; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field10620;
                    int var11 = (-2048 + class419.method2416(4096, var2, (byte) 69)) * this.field10611 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field10601[var5][var9] = this.field10601[var5][var9 + -1] + var12;
                }
                this.field10616[var5][var9] = ~this.field10612 >= -1 ? 4096 : 4096 - class419.method2416(this.field10612, var2, (byte) 121);
            }
            this.field10601[var5][this.field10618] = 4096;
        }
        this.field10607[this.field10605] = 4096;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)V")
    public static final void method4258(byte arg0) {
        ++field10617;
        class34.field383.method2617(28812);
        class41.field473.method3860((byte) -118);
        class401.field5305.method3860((byte) 110);
        int var1 = 98 % ((-43 - arg0) / 60);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method4259(byte arg0, String arg1) {
        ++field10613;
        if (arg0 != -21) {
            return null;
        } else {
            int var2 = arg1.length();
            if (var2 == 0) {
                return new byte[0];
            } else {
                int var3 = -4 & var2 + 3;
                int var4 = var3 / 4 * 3;
                if (var3 + -2 < var2 && class91.method552(arg1.charAt(var3 + -2), (byte) -73) != -1) {
                    if (var3 - 1 >= var2 || class91.method552(arg1.charAt(var3 + -1), (byte) -114) == -1) {
                        --var4;
                    }
                } else {
                    var4 -= 2;
                }
                byte[] var5 = new byte[var4];
                class332.method1920(arg1, -1, 0, var5);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZLjava/awt/Component;Z)Ltb;")
    public static final class686 method4260(boolean arg0, Component arg1, boolean arg2) {
        ++field10609;
        try {
            Constructor var3 = Class.forName("oc").getDeclaredConstructor(field10622 != null ? field10622 : (field10622 = method4261("java.awt.Component")), Boolean.TYPE);
            if (!arg2) {
                method4258((byte) -66);
            }
            return (class686) var3.newInstance(arg1, new Boolean(arg0));
        } catch (Throwable var4) {
            return new class398(arg1, arg0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4261(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
