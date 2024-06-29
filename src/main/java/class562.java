import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class562 extends class137 {

    @OriginalMember(owner = "client!bka", name = "A", descriptor = "Z")
    public static boolean field7784 = false;

    @OriginalMember(owner = "client!bka", name = "t", descriptor = "F")
    private float field7777;

    @OriginalMember(owner = "client!bka", name = "x", descriptor = "F")
    private float field7781;

    @OriginalMember(owner = "client!bka", name = "s", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!bka", name = "u", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!bka", name = "v", descriptor = "I")
    private int field7779;

    @OriginalMember(owner = "client!bka", name = "w", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!bka", name = "z", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!bka", name = "C", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!bka", name = "D", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!bka", name = "E", descriptor = "I")
    private int field7788;

    @OriginalMember(owner = "client!bka", name = "F", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!bka", name = "J", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!bka", name = "K", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!bka", name = "G", descriptor = "Lgga;")
    public static class513 field7790;

    @OriginalMember(owner = "client!bka", name = "y", descriptor = "Ljava/lang/String;")
    private String field7782;

    @OriginalMember(owner = "client!bka", name = "B", descriptor = "Ljava/lang/String;")
    private String field7785;

    @OriginalMember(owner = "client!bka", name = "H", descriptor = "Ljava/lang/String;")
    private String field7791;

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(II)Lhia;")
    public static final class49 method3271(int arg0, int arg1) {
        ++field7787;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    if ((double) class751.field10425 == 3.0D) {
                        return class747.field10396;
                    }
                    if ((double) class751.field10425 == 4.0D) {
                        return class611.field8673;
                    }
                    if ((double) class751.field10425 == 6.0D) {
                        return class620.field8762;
                    }
                    if ((double) class751.field10425 >= 8.0D) {
                        return class61.field943;
                    }
                }
            } else {
                if ((double) class751.field10425 == 3.0D) {
                    return class284.field4169;
                }
                if ((double) class751.field10425 == 4.0D) {
                    return class626.field8906;
                }
                if ((double) class751.field10425 == 6.0D) {
                    return class747.field10396;
                }
                if ((double) class751.field10425 >= 8.0D) {
                    return class611.field8673;
                }
            }
        } else {
            if ((double) class751.field10425 == 3.0D) {
                return class242.field3475;
            }
            if ((double) class751.field10425 == 4.0D) {
                return class397.field5473;
            }
            if ((double) class751.field10425 == 6.0D) {
                return class284.field4169;
            }
            if ((double) class751.field10425 >= 8.0D) {
                return class626.field8906;
            }
        }
        if (arg1 != 1) {
            field7790 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)F")
    public final float method3272(int arg0) {
        if (arg0 != 128) {
            this.field7781 = 0.74755126F;
        }
        ++field7789;
        return this.field7781;
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)F")
    public final float method3273(byte arg0) {
        if (arg0 != -49) {
            this.field7791 = null;
        }
        ++field7793;
        return this.field7777;
    }

    @OriginalMember(owner = "client!bka", name = "f", descriptor = "(I)V")
    public static final void method3274(int arg0) {
        ++field7776;
        if (arg0 < 105) {
            method3271(86, 94);
        }
        class174.field2619 = null;
        class457.field6237 = null;
    }

    @OriginalMember(owner = "client!bka", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method3275(int arg0) {
        ++field7786;
        if (arg0 != 4983) {
            this.field7788 = -27;
        }
        return this.field7791;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method1080(OggPacket arg0, int arg1) {
        ++field7780;
        if (~super.field2273 >= -1 || "SUB".equals(this.field7782)) {
            int var3 = -66 / ((-48 - arg1) / 43);
            class431 var4 = new class431(arg0.getData());
            int var5 = var4.method2557(14929);
            if (super.field2273 <= 8) {
                if ((128 | var5) == 0) {
                    throw new IllegalStateException();
                }
                if (~super.field2273 != -1) {
                    return;
                }
                var4.field5983 += 23;
                this.field7788 = var4.method2570(-92);
                this.field7779 = var4.method2570(-124);
                if (this.field7788 == 0 || this.field7779 == 0) {
                    throw new IllegalStateException();
                }
                class431 var13 = new class431(16);
                var4.method2530(-109, var13.field6002, 0, 16);
                this.field7791 = var13.method2532((byte) -120);
                var13.field5983 = 0;
                var4.method2530(-16, var13.field6002, 0, 16);
                this.field7782 = var13.method2532((byte) -115);
            } else {
                if (~var5 == -1) {
                    long var6 = var4.method2523(1280579781);
                    long var8 = var4.method2523(1280579781);
                    long var10 = var4.method2523(1280579781);
                    if (~var6 > -1L || ~var8 > -1L || var10 < 0L || ~var6 > ~var10) {
                        throw new IllegalStateException();
                    }
                    this.field7777 = (float) ((long) this.field7779 * var6) / (float) this.field7788;
                    this.field7781 = (float) ((var6 - -var8) * (long) this.field7779) / (float) this.field7788;
                    int var12 = var4.method2570(-18);
                    if (var12 < 0 || var12 > var4.field6002.length + -var4.field5983) {
                        throw new IllegalStateException();
                    }
                    this.field7785 = class395.method2356(-129, var12, var4.field5983, var4.field6002);
                }
                if ((var5 | 128) != 0) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bka", name = "h", descriptor = "(I)V")
    public static void method3276(int arg0) {
        if (arg0 == 0) {
            field7790 = null;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3277(int arg0, int arg1, byte arg2) {
        int var3 = 18 % ((arg2 - 31) / 32);
        ++field7778;
        return (arg0 & 2048) != 0;
    }

    @OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class562(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
    public final void method1085(int arg0) {
        if (arg0 != 0) {
            method3276(-56);
        }
        ++field7792;
    }

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method3278(byte arg0) {
        if (arg0 < 70) {
            this.field7791 = null;
        }
        ++field7783;
        return this.field7785;
    }
}
